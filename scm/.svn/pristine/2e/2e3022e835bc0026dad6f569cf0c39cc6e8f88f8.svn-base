package com.best1.scm.edi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;




public class EDIFile
{
    public EDIFile( String transactionset )
    {
        this.id = transactionset;
    }

    public File[] generateEDIFileAndTransport( Connection conn )
        throws Exception
    {
        if( bodyList == null )
            throw new Exception(  "body segments should not be null !!"  );

        try {
            TransactionsetDAO tDAO = new TransactionsetDAO( conn );
            TransactionsetVO vo = tDAO.findByPrimaryKey( id );
            if( vo == null )
                return null;

            // io foundations
            File edi = null;
            DataOutputStream dos = null;
            BufferedWriter writer = null;
            File ediFormatted = null;
            DataOutputStream dosFormatted = null;
            BufferedWriter writerFormatted = null;

            // dirs and path
            String fileDir = vo.getFilelocation() == null ? null : EHSNEDIUtils.getRootFolder( id ) + vo.getFilelocation();
            String backupDir = vo.getBackupfilelocation() == null ? null : EHSNEDIUtils.getRootFolder( id ) + vo.getBackupfilelocation();
            String backupFile = null;

            // cr + lf
            String newline = EHSNEDIUtils.getNewLineChar( vo.getNewLineCharCode() );

            // by byte or char
            boolean byteOriented = true;
            if( EHSNEDIConstants.EDI_BYCHAR == vo.getByChar() )
                byteOriented = false;

            // charset to use when by byte
            String encoding = vo.getCharSet();
            if( encoding == null ||
                encoding.trim().length() == 0 )
                encoding = EHSNEDIConstants.DEFAULT_CHARSET;

            DatasegmentDAO dDAO = new DatasegmentDAO( conn );

            int noOfFiles = 1;
            int split = bodyList.size();
            if( vo.getSplitcount() > 0 )
            {
                split = vo.getSplitcount();
                noOfFiles = ( bodyList.size() / split ) + 1;
            }

            ArrayList result = new ArrayList();
            for( int i = 0, counter = 0; i < noOfFiles; i++ )
            {
                // adjust for the last if necessary
                if( bodyList.size() - counter < split )
                    split = bodyList.size() - counter;

                // in case the last has nothing to perform
                if( split < 1 )
                    break;

                try {
                    // FILENAME
                    String aFilename = "" + System.currentTimeMillis() + ".edi";
                    String ref = vo.getFilenamerefid();
                    if( ref != null )
                        aFilename = deleteSpaces( processFilename( dDAO.findByPrimaryKey( ref ), i + 1 ) );
                    /*
                    else
                        throw new EHSNBatchException( new Exception( "filename's ref should never be null !!" ),
                                                      "EDI",
                                                      "EDIFile",
                                                      "generateEDIFileAndTransport()",
                                                      "CMN_000_EDI_004",
                                                      EHSNBatchConstants.SEVERITY_ONE );
                    */

                    if( backupDir != null )
                    {
                        backupFile = backupDir + aFilename;
                        backupFile = backupFile.trim();
                    }

                    String aFilenameFormatted = backupDir + "FORMATTED_" + aFilename;
                    aFilenameFormatted = aFilenameFormatted.trim();
                    aFilename = fileDir + aFilename;
                    aFilename = aFilename.trim();

                    edi = new File( aFilename );
                    EHSNEDIUtils.prepareReadyFile( edi );
                    dos = new DataOutputStream( new FileOutputStream( aFilename ) );
                    writer = new BufferedWriter( new OutputStreamWriter( dos, encoding ) );

                    ediFormatted = new File( aFilenameFormatted );
                    EHSNEDIUtils.prepareReadyFile( ediFormatted );
                    dosFormatted = new DataOutputStream( new FileOutputStream( aFilenameFormatted ) );
                    writerFormatted = new BufferedWriter( new OutputStreamWriter( dosFormatted, encoding ) );

                    ArrayList definitions = null;
                    HashMap data = null;

                    // HEADER
                    ref = vo.getHeadersegmentrefid();
                    if( ref != null )
                    {
                        dbg( "PROCESSING HEADER ...." );

                        int index = 0;
                        StringTokenizer segments = new StringTokenizer( ref, "," );
                        while( segments.hasMoreTokens() )
                        {
                            String segment = segments.nextToken();
                            if( segment != null )
                            {
                                definitions = dDAO.findByPrimaryKey( segment );
                                data = ( HashMap )headerList.get( index++ );

                                writer.write( processData( data, definitions, newline, byteOriented, false, encoding ) );
                                writerFormatted.write( processData( data, definitions, newline, byteOriented, true, encoding ) );
                            }
                        }
                    }

                    // BODY
                    ref = vo.getDatasegmentrefid();
                    if( ref != null )
                    {
                        dbg( "PROCESSING BODY ...." );

                        definitions = dDAO.findByPrimaryKey( ref );
                        for( int j = 0; j < split; j++ )
                        {
                            data = ( HashMap )bodyList.get( counter++ );
                            if( data == null )
                                throw new Exception( "map of any given row should never be null !!" );

                            writer.write( processData( data, definitions, newline, byteOriented, false, encoding ) );
                            writerFormatted.write( processData( data, definitions, newline, byteOriented, true, encoding ) );
                        }
                    }

                    // TRAILER
                    ref = vo.getTrailersegmentrefid();
                    if( ref != null )
                    {
                        dbg( "PROCESSING TRAILER ...." );

                        definitions = dDAO.findByPrimaryKey( ref );
                        if( trailerMap != null )
                        {
                            writer.write( processData( trailerMap, definitions, newline, byteOriented, false, encoding ) );
                            writerFormatted.write( processData( trailerMap, definitions, newline, byteOriented, true, encoding ) );
                        }
                        else
                        {
                            data = ( HashMap )trailerList.get( i );

                            writer.write( processData( data, definitions, newline, byteOriented, false, encoding ) );
                            writerFormatted.write( processData( data, definitions, newline, byteOriented, true, encoding ) );
                        }
                    }

                    // finish up
                    writer.close();
                    writerFormatted.close();
                    result.add( edi );

                    dbg( "edi saved as [" + edi.getAbsolutePath() + "]" );

                    if( backupFile != null )
                        EHSNEDIUtils.saveFileAs( edi.getAbsolutePath(),
                                                 backupFile );

                    if( vo.getCommunicationtype() == EHSNEDIConstants.EDI_COMMUNICATIONTYPE_IMMEDIATE_SEND &&
                        vo.getRemoteserverflag() == EHSNEDIConstants.EDI_FTP_TOREMOTESERVER )
                        EHSNEDIUtils.transportFile( id, conn );
                }
                // clean up
                catch( Exception x ) {
                	x.printStackTrace();
                    if( writer != null )
                        writer.close();
                    if(edi.isFile()){
                        edi.delete();
                    }
                    if( writerFormatted != null )
                        writerFormatted.close();

                    if(ediFormatted.isFile()){
                        ediFormatted.delete();
                    }
                    throw x;
                }
            }

            return ( File[] )result.toArray( new File[ 0 ] );
        }
        catch( Exception ehsnbx ) {
            throw ehsnbx;
        }
        
    }

    private String processFilename( ArrayList definitions, int seq )
        throws Exception
    {
        dbg( "PROCESSING FILENAME ...." );

        StringBuffer sb = new StringBuffer();
        for( int i = 0; definitions != null && i < definitions.size(); i++ )
        {
            DatasegmentVO vo = ( DatasegmentVO )definitions.get( i );
            String message = "";

            if( vo.getAttributename().equalsIgnoreCase( EHSNEDIConstants.EDI_DATASEGEMENT_FIELDNAME_FILESEQUENCENUMBER ) )
                message = "" + seq;
            else if( !vo.getAttributename().equalsIgnoreCase( EHSNEDIConstants.EDI_DATASEGEMENT_FIELDNAME_SPACE ) &&
                     !vo.getAttributename().equalsIgnoreCase( EHSNEDIConstants.EDI_DATASEGEMENT_FIELDNAME_ZERO ) &&
                     filenameMap.get( vo.getAttributename() ) != null )
                message = ( String )filenameMap.get( vo.getAttributename() );

            sb.append( encodeMessage( message, vo, null ) );
        }

        return sb.toString();
    }

    private String processData( HashMap data,
                                ArrayList definitions,
                                String newline,
                                boolean byteOriented,
                                boolean formatted,
                                String encoding )
        throws Exception
    {
        StringBuffer sb = new StringBuffer();
        for( int i = 0; definitions != null && i < definitions.size(); i++ )
        {
            DatasegmentVO vo = ( DatasegmentVO )definitions.get( i );
            String message = "";

            if( !vo.getAttributename().equalsIgnoreCase( EHSNEDIConstants.EDI_DATASEGEMENT_FIELDNAME_SPACE ) &&
                !vo.getAttributename().equalsIgnoreCase( EHSNEDIConstants.EDI_DATASEGEMENT_FIELDNAME_ZERO ) &&
                data.get( vo.getAttributename() ) != null ){              
                message = data.get( vo.getAttributename() ).toString();
            }

            if( formatted )
                sb.append( vo.getAttributename() ).append( "\t:\t" );

            if( byteOriented )
                sb.append( encodeMessage( message, vo, encoding ) );
            else
                sb.append( encodeMessage( message, vo, null ) );

            if( formatted )
                sb.append( newline );
        }

        sb.append( newline );

        if( formatted )
            sb.append( "-------------------------------------------------------------" ).append( newline );

        return sb.toString();
    }

    private String encodeMessage( String msg,
                                  DatasegmentVO vo,
                                  String encoding )
        throws Exception
    {
        try {
            msg = validate( msg, vo.getDatatype(), vo.getDateformat(), vo.getOptionalFlag() );

            // by byte or char
            int msgSize = msg == null ? 0 : ( encoding != null ? msg.getBytes( encoding ).length : msg.length() );
            // max length allowed
            int attrSize = vo.getEndlocation() - vo.getStartlocation() + 1;

            dbg( "charset : " + encoding + " on ATTR [" + vo.getAttributename() + "]" );
            dbg( "original message size : " + msgSize + ", defined attribute size : " + attrSize );
            dbg( "      before truncation = [" + msg + "]" );
            if( msgSize > attrSize )
                msg = encoding != null ? new String( msg.getBytes( encoding ), 0, attrSize, encoding ) : msg.substring( 0, attrSize );
            dbg( "       after truncation = [" + msg + "]" );

            String attrName = vo.getAttributename();
            String attrValue = null;
            if( attrName.equalsIgnoreCase( EHSNEDIConstants.EDI_DATASEGEMENT_FIELDNAME_ZERO ) )
                attrValue = buildZeroes( attrSize );
            else if( attrName.equalsIgnoreCase( EHSNEDIConstants.EDI_DATASEGEMENT_FIELDNAME_SPACE ) )
                attrValue = buildSpaces( attrSize );
            else if( attrName.equalsIgnoreCase( "BLANK" ) )
                attrValue = buildSpaces( attrSize );
            else
            {
                String attrDefault = msg;
                if( attrDefault == null || attrDefault.length() == 0 )
                {
                    if( vo.getDefaultvalue() != null )
                        attrDefault = vo.getDefaultvalue();
                    else if( vo.getOptionalFlag() == EHSNEDIConstants.FIELD_OPTIONAL_FLAG )
                        attrDefault = buildSpaces( attrSize );
                    else
                        throw new Exception( "missing value on the mandatory field !!" );
                }

                String alignment = vo.getAlignment() == null ? "" : vo.getAlignment();
                // by byte or char
                msgSize = encoding != null ? attrDefault.getBytes( encoding ).length : attrDefault.length();
                int diff = attrSize - msgSize;

                String padding = vo.getPadchar() == null ? "" : vo.getPadchar();
                if( alignment.equalsIgnoreCase( EHSNEDIConstants.EDI_DATASEGEMENT_RIGHT_ALIGN ) )
                {
                    if( padding != null && padding.length() != 0 )
                        attrValue = buildChars( diff, padding ) + attrDefault;
                    else
                        attrValue = buildSpaces( diff ) + attrDefault;
                }
                else if( alignment.equalsIgnoreCase( EHSNEDIConstants.EDI_DATASEGEMENT_LEFT_ALIGN ) )
                {
                    if( padding != null && padding.length() != 0 )
                        attrValue = attrDefault + buildChars( diff, padding );
                    else
                        attrValue = attrDefault + buildSpaces( diff );
                }
                else
                    attrValue = attrDefault;
            }

            dbg( "       finalized result = [" + attrValue + "]" );
            return attrValue;
        }
        
        catch( StringIndexOutOfBoundsException sioobx ) {
            // catch problems from missing by char definition on the log
            throw sioobx;
        }
        catch( Exception x ) {
            throw x;
        }
    }

    private String validate( String original, String type, String format, int optional )
        throws Exception
    {
        // won't hurt with wrong format if no type is specified
        if( type == null || type.length() == 0 )
            return original;

        // unless type is date and with a given value, just skip validation if is an optional field
        if( optional == EHSNEDIConstants.FIELD_OPTIONAL_FLAG &&
            ( original == null || original.length() == 0 ||
              !type.equalsIgnoreCase( EHSNEDIConstants.EDI_DATATYPE_DATE ) ) )
            return original;

        if( type.equalsIgnoreCase( EHSNEDIConstants.EDI_DATATYPE_SHORT ) )
            Short.parseShort( original );
        else if( type.equalsIgnoreCase( EHSNEDIConstants.EDI_DATATYPE_INTEGER ) )
            Integer.parseInt( original );
        else if( type.equalsIgnoreCase( EHSNEDIConstants.EDI_DATATYPE_LONG ) )
            Long.parseLong( original );
        else if( type.equalsIgnoreCase( EHSNEDIConstants.EDI_DATATYPE_DOUBLE ) )
            Double.parseDouble( original );
        else if( type.equalsIgnoreCase( EHSNEDIConstants.EDI_DATATYPE_DATE ) )
            original = EHSNEDIUtils.formatDateString( original, format );
        else if( type.equalsIgnoreCase( EHSNEDIConstants.EDI_DATATYPE_STRING ) )
            ; // do nothing
        else
            ; // throw new IllegalArgumentException( "UNKNOWN type : " + type )

        return original;
    }

    private String deleteSpaces( String original )
    {
        if( original == null )
            return null;

        StringBuffer sb = new StringBuffer();
        for( int i = 0; i < original.length(); i++ )
        {
            if( original.charAt( i ) != ' ' )
                sb.append( original.charAt( i ) );
        }

        return sb.toString();
    }

    private String buildSpaces( int len )
    {
        return buildChars( len, " " );
    }

    private String buildZeroes( int len )
    {
        return buildChars( len, "0" );
    }

    private String buildChars( int len, String padding )
    {
        StringBuffer sb = new StringBuffer();
        for( int i = 0; i < len; i++ )
            sb.append( padding );

        return sb.toString();
    }

    public String getTransactionSetId()
    {
        return id;
    }

    public void setTransactionSetId( String id )
    {
        this.id = id;
    }

    public HashMap getFileNameDataMap()
    {
        return filenameMap;
    }

    public void setFileNameDataMap( HashMap filenameMap )
    {
        this.filenameMap = filenameMap;
    }

    public ArrayList getHeaderMapList()
    {
        return headerList;
    }

    public void setHeaderMapList( ArrayList headerList )
    {
        this.headerList = headerList;
    }

    public ArrayList getBodyList()
    {
        return bodyList;
    }

    public void setBodyMapList( ArrayList bodyList )
    {
        this.bodyList = bodyList;
    }

    public HashMap getTrailerMap()
    {
        return trailerMap;
    }

    public void setTrailerMap( HashMap trailerMap )
    {
        this.trailerMap = trailerMap;
    }

    public ArrayList getTarilerMapList()
    {
        return trailerList;
    }

    public void setTarilerMapList( ArrayList trailerList )
    {
        this.trailerList = trailerList;
    }


    public static boolean debug = false;
    private void dbg( String s )
    {
        if( debug )
            System.out.println(s);
    }


    private static String compare( File src, File des )
        throws Exception
    {
        BufferedReader srcReader = new BufferedReader( new InputStreamReader( new FileInputStream( src ) ) );
        BufferedReader desReader = new BufferedReader( new InputStreamReader( new FileInputStream( des ) ) );

        try {
            short lineNo = 0;
            String srcLine = null;
            String desLine = null;
            while( ( srcLine = srcReader.readLine() ) != null )
            {
                lineNo++;
                desLine = desReader.readLine();
                if( !srcLine.equals( desLine ) )
                {
                    System.out.println( "difference found at src line : " + lineNo + " and thus quit" );
                    System.out.println( "[" + srcLine + "]" );
                    System.out.println( "[" + desLine + "]" );
                    throw new IllegalArgumentException( "content not matching up !!" );
                }
            }

            if( desReader.readLine() != null )
            {
                    System.out.println( "difference found at des line : " + ++lineNo + " and thus quit" );
                    throw new IllegalArgumentException( "content not matching up !!" );
            }

            return "PASSED";
        }
        finally {
            srcReader.close();
            desReader.close();
        }
    }

    public static void main( String[] args )
    {
        try {
        	
        }
        catch( Exception x ) {
            x.printStackTrace();
            System.exit( 1 );
        }
    }


    private String id = null;

    private HashMap filenameMap = null;
    private ArrayList headerList = null;
    private ArrayList bodyList = null;
    private HashMap trailerMap = null;

    // each map inside is the trailer data for a file
    private ArrayList trailerList = null;
}