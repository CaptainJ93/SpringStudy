package com.best1.scm.edi;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;




public class EDIFileReaderByByte
    extends EDIFileReader
{
    EDIFileReaderByByte( String filepath, String transactionset )
    {
        this.uri = filepath;
        this.id = transactionset;
    }

    public void readFile( Connection conn )
        throws Exception
    {
        FileInputStream fis = null;

        try {
            // set the foundation up
            TransactionsetDAO tDAO = new TransactionsetDAO( conn );
            vo = tDAO.findByPrimaryKey( id );
            if( vo == null || uri == null )
                return;

            // determine charset to use
            String encoding = vo.getCharSet();
            if( encoding == null || encoding.trim().length() == 0 )
                encoding = EHSNEDIConstants.DEFAULT_CHARSET;

            // initialize newline symbol for the current reader
            newline = EHSNEDIUtils.getNewLineChar( vo.getNewLineCharCode() );

            // fetch file content into the byte buffer
            fis = new FileInputStream( uri );
            FileChannel channel = fis.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate( ( int )channel.size() );
            channel.read( buffer );
            byte[] data = buffer.array();
            dbg( "# of bytes in [" + uri + "] : " + data.length );

            // ready for processing
            DatasegmentDAO dDAO = new DatasegmentDAO( conn );

            // HEADER
            if( vo.getHeadersegmentrefid() != null )
            {
                StringTokenizer tokens = new StringTokenizer( vo.getHeadersegmentrefid(), "," );

                headerList = new ArrayList();
                while( tokens.hasMoreTokens() )
                {
                    String token = tokens.nextToken();
                    if( token != null )
                    {
                        dbg( "PROCESSING HEADER ...." );
                        headerList.add( processLine( data, dDAO.findByPrimaryKey( token ), encoding ) );
                    }
                }
            }

            // BODY, TRAILER
            if( vo.getDatasegmentrefid() != null ||
                vo.getTrailersegmentrefid() != null )
            {
                // preserve informaiton for trailer recognition
                ArrayList trailers = null;
                int frontLeft = -1;
                int frontRight = -1;
                String trailerFront = null;
                if( vo.getTrailersegmentrefid() != null )
                {
                    trailers = dDAO.findByPrimaryKey( vo.getTrailersegmentrefid() );
                    frontLeft = ( ( DatasegmentVO )trailers.get( 0 ) ).getStartlocation();
                    frontRight = ( ( DatasegmentVO )trailers.get( 0 ) ).getEndlocation();
                    trailerFront = ( ( DatasegmentVO )trailers.get( 0 ) ).getDefaultvalue();
                }

                bodyList = new ArrayList();
                
                while( offset < data.length )
                {
                    // TRAILER found
                    if( trailers != null &&
                        new String( data, offset, frontRight - frontLeft + 1, encoding ).equals( trailerFront ) )
                    {
                        dbg( "PROCESSING TRAILER ...." );
                        trailerMap = processLine( data, trailers, encoding );

                        // quit the loop
                        offset = data.length;
                    }
                    // BODY otherwise
                    else
                    {
                        dbg( "PROCESSING BODY ...." );
                        bodyList.add( processLine( data, dDAO.findByPrimaryKey( vo.getDatasegmentrefid() ), encoding ) );
                    }
                }
            }
        }
        catch( Exception ehsnbx ) {
            throw ehsnbx;
        }
        
        finally {
            try {
                if( fis != null )
                    fis.close();
            }
            catch( Exception x ) {
                throw x;
            }
        }
    }

    private HashMap processLine( byte[] data,
                                 ArrayList definitions,
                                 String encoding )
        throws Exception
    {
        try {
            HashMap result = new HashMap();

            for( int i = 0; definitions != null && i < definitions.size(); i++ )
            {
                DatasegmentVO definition = ( DatasegmentVO )definitions.get( i );
                dbg( "*************** attr = " + definition.getAttributename() );

                int start = definition.getStartlocation();
                int end = definition.getEndlocation();
                dbg( "start position : " + start + ", end position : " + end );
                dbg( "offset from : " + offset + ", move how far : " + ( end - start + 1 ) );

                String attrValue = null;
                try {
                    attrValue = new String( data, offset, end - start + 1, encoding );
                    if( attrValue.indexOf( newline ) != -1 ){
                    	java.util.Iterator itr = result.keySet().iterator();
                    	String str_record="" ;
                    	while(itr.hasNext()){
                    		String keyName = itr.next().toString();
                    		str_record = str_record+keyName+"="+result.get(keyName)+"," ;
                    	}
                        throw new IndexOutOfBoundsException("EDI error record =["+str_record+"]");
                    }
                    dbg( "data read originally : [" + attrValue + "]" );
                }
                catch( IndexOutOfBoundsException ioobx ) {
                    // mandatory field MUST have something
                    if( definition.getOptionalFlag() != EHSNEDIConstants.FIELD_OPTIONAL_FLAG )
                        throw ioobx;

                    dbg( "data cannot be read yet fine since it was defined as optional" );
                    break;
                }

                if( !definition.getAttributename().equalsIgnoreCase( EHSNEDIConstants.EDI_DATASEGEMENT_FIELDNAME_SPACE ) &&
                    !definition.getAttributename().equalsIgnoreCase( EHSNEDIConstants.EDI_DATASEGEMENT_FIELDNAME_ZERO ) )
                {
                    attrValue = removePadding( attrValue, definition.getAlignment(), definition.getPadchar() );
                    dbg( "data after padding removed : [" + attrValue + "]" );

                    attrValue = validate( attrValue, definition.getDatatype(), definition.getDateformat(), definition.getOptionalFlag() );
                    dbg( "data after validation : [" + attrValue + "]" );

                    result.put( definition.getAttributename(), attrValue );
                }

                // move forward
                offset += end - start + 1;
            }

            nextLine( data );
            return result;
        }
        
        catch( NumberFormatException nfx ) {
            // catch problems from incorrect data type definition on the log
            throw nfx;
        }
        catch( Exception x ) {
            throw x;
        }
    }

    private void nextLine( byte[] data )
        throws Exception
    {
        short l = 2;
        if( newline.equalsIgnoreCase( EHSNEDIConstants.NEWLINE_CHAR_CR ) ||
            newline.equalsIgnoreCase( EHSNEDIConstants.NEWLINE_CHAR_LF ) )
            l = 1;

        String nl = new String( data, offset, l );

        if( debug )
        {
            StringBuffer sb = new StringBuffer();
            char[] nls = nl.toCharArray();
            for( int i = 0; i < nls.length; i++ )
                sb.append( " " + ( int )nls[ i ] + " " );
            dbg( "newline read from EDI is : " + sb.toString().trim() );
        }

        // improper ending
        if( !nl.equals( newline ) )
            throw new Exception("line length exceeds as expected !!");

        // move forward
        offset += l;
    }

    
    
    public HashMap readFileByRow( Connection conn,TransactionsetVO vo )
    throws Exception
{
    FileInputStream fis = null;
    HashMap hm = new HashMap() ;
    try {
        // set the foundation up
        if( vo == null || uri == null )
            return hm;

        // determine charset to use
        String encoding = vo.getCharSet();
        if( encoding == null || encoding.trim().length() == 0 )
            encoding = EHSNEDIConstants.DEFAULT_CHARSET;

        // initialize newline symbol for the current reader
        newline = EHSNEDIUtils.getNewLineChar( vo.getNewLineCharCode() );

        // fetch file content into the byte buffer
        fis = new FileInputStream( uri );
        FileChannel channel = fis.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate( ( int )channel.size() );
        channel.read( buffer );
        byte[] data = buffer.array();
        dbg( "# of bytes in [" + uri + "] : " + data.length );

        // ready for processing
        DatasegmentDAO dDAO = new DatasegmentDAO( conn );

        // BODY
        if( (vo.getDatasegmentrefid() != null) && (offset < data.length) )
        {
        	   hm = processLine( data, dDAO.findByPrimaryKey( vo.getDatasegmentrefid() ), encoding ) ;
        }
    }
    
    catch( Exception e ) {
    	throw e;
    }
    finally {
        try {
            if( fis != null )
                fis.close();
        }
        catch( Exception x ) {
            throw x;
        }
    }
    return hm;
}
    

    private String newline = null;
    private int offset = 0;
}