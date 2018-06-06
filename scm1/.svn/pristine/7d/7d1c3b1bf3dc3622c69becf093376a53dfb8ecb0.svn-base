package com.best1.scm.edi;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;




public class EDIFileReaderByChar
    extends EDIFileReader
{
	
    EDIFileReaderByChar( String filepath, String transactionset )
    {
        this.uri = filepath;
        this.id = transactionset;
        isReading = false;
    }

    private FileInputStream fis = null;
    private BufferedReader br = null;
    private boolean isReading = false;
    
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

            // fetch fis content into a buffer reader
            fis = new FileInputStream( uri );
            BufferedReader br = new BufferedReader( new InputStreamReader( fis, encoding ) );

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

                        headerList.add( processLine( br.readLine(), dDAO.findByPrimaryKey( token ) ) );
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

                String line = null;
                boolean done = false;

                bodyList = new ArrayList();
                while( !done && ( line = br.readLine() ) != null )
                {
                    // TRAILER found
                    if( trailers != null &&
                        line.substring( frontLeft - 1, frontRight ).equals( trailerFront ) )
                    {
                        dbg( "PROCESSING TRAILER ...." );

                        trailerMap = processLine( line, trailers );

                        // quit the loop
                        done = true;
                    }
                    // BODY otherwise
                    else
                    {
                        dbg( "PROCESSING BODY ...." );

                        bodyList.add( processLine( line, dDAO.findByPrimaryKey( vo.getDatasegmentrefid() ) ) );
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

    public BufferedReader getFileBufferedReader(TransactionsetVO vo)throws Exception{
    	String encoding = vo.getCharSet();
        if( encoding == null || encoding.trim().length() == 0 )
            encoding = EHSNEDIConstants.DEFAULT_CHARSET;
        // fetch fis content into a buffer reader
        if(isReading == false){
	        this.fis = new FileInputStream( uri );
	        this.br = new BufferedReader( new InputStreamReader( fis, encoding ) );
	        isReading = true;
        }
        return this.br;
    }
    
    public HashMap readFileByRow( Connection conn,TransactionsetVO vo )
    throws Exception
	{
    	HashMap hm = new HashMap();
    	if( vo == null || uri == null ) return hm;
    	BufferedReader br = this.getFileBufferedReader(vo);
        try {
            // determine charset to use
            String encoding = vo.getCharSet();
            if( encoding == null || encoding.trim().length() == 0 )
                encoding = EHSNEDIConstants.DEFAULT_CHARSET;

            // ready for processing
            DatasegmentDAO dDAO = new DatasegmentDAO( conn );

            // BODY
            if( vo.getDatasegmentrefid() != null )
            {
                String line = null;

                if(  ( line = br.readLine() ) != null )
                {
                    hm = processLine( line, dDAO.findByPrimaryKey( vo.getDatasegmentrefid() ) ) ;
                    
                }else{
                	this.closeFileInputStream();
                	hm = new HashMap();
                }
            }
        }
        catch( Exception ehsnbx ) {
            throw ehsnbx;
        }
        
        
        return hm;
	}
    
    private void closeFileInputStream() throws Exception{

            if( this.fis != null ){
                this.fis.close();
                this.br.close();
                this.isReading = false;
            }
    }
    
    private HashMap processLine( String line,
                                 ArrayList definitions )
        throws Exception
    {
        try {
            HashMap result = new HashMap();
            int received = line == null ? 0 : line.length();
            int finished = 0;

            for( int i = 0; definitions != null && i < definitions.size(); i++ )
            {
                DatasegmentVO definition = ( DatasegmentVO )definitions.get( i );
                dbg( "*************** attr = " + definition.getAttributename() );

                int start = definition.getStartlocation();
                int end = definition.getEndlocation();
                dbg( "start index : " + start + ", end index : " + end );

                String attrValue = null;
                try {
                    attrValue = line.substring( start - 1, end );
                    dbg( "data read originally : [" + attrValue + "]" );
                }
                catch( IndexOutOfBoundsException ioobx ) {
                    // mandatory field MUST have something
                    if( definition.getOptionalFlag() != EHSNEDIConstants.FIELD_OPTIONAL_FLAG )
                        throw ioobx;

                    dbg( "data cannot be read yet fine since it was defined as optional" );
                    finished = start;
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

                // mark where the processing currently stops
                finished = end;
            }

            if( received > finished )
                throw new Exception( "line length exceeds as expected !!" );

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
}