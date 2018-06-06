package com.best1.scm.edi;

import java.io.Serializable;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;




public abstract class EDIFileReader
    implements Serializable
{
    abstract void readFile( Connection conn ) throws Exception;
    
    abstract public HashMap readFileByRow( Connection conn,TransactionsetVO vo ) throws Exception;

    protected String removePadding( String original, String alignment, String pad )
    {
        if( alignment == null || pad == null || pad.length() < 1 )
            return original;

        int begin = alignment.equalsIgnoreCase( EHSNEDIConstants.EDI_DATASEGEMENT_LEFT_ALIGN ) ? original.length() - 1 : 0;
        int close = alignment.equalsIgnoreCase( EHSNEDIConstants.EDI_DATASEGEMENT_RIGHT_ALIGN ) ? original.length() : 0;
        if( begin == close )
            return original;

        boolean replaced = false;
        StringBuffer sb = new StringBuffer( original );

        // RIGHT_ALIGN
        if( begin < close )
        {
            for( int i = begin; i < close; i++ )
            {
                if( sb.charAt( i ) == pad.charAt( 0 ) )
                {
                    sb.replace( i, i + 1, " " );
                    replaced = true;
                }
                else
                    break;
            }
        }
        // LEFT_ALIGN
        else
        {
            for( int i = begin; i >= close; i-- )
            {
                if( sb.charAt( i ) == pad.charAt( 0 ) )
                {
                    sb.replace( i, i + 1, " " );
                    replaced = true;
                }
                else
                    break;
            }
        }

        return replaced ? sb.toString().trim() : original;
    }

    protected String validate( String original, String type, String format, int optional )
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
            original = EHSNEDIUtils.getTimeStampStringForDateString( original, format );
        else if( type.equalsIgnoreCase( EHSNEDIConstants.EDI_DATATYPE_STRING ) )
            ; // do nothing
        else
            ; // throw new IllegalArgumentException( "UNKNOWN type : " + type )

        return original;
    }

    public String getFileName()
    {
        return uri;
    }

    public void setFileName( String uri )
    {
        this.uri = uri;
    }

    public String getTransactionSetId()
    {
        return id;
    }

    public void setTransactionSetId( String id )
    {
        this.id = id;
    }

    public TransactionsetVO getTransactionSetVo()
    {
        return vo;
    }

    public void setTransactionSetVo( TransactionsetVO vo )
    {
        this.vo = vo;
    }

    public ArrayList getHeaderList()
    {
        return headerList;
    }

    public ArrayList getBodyList()
    {
        return bodyList;
    }

    public HashMap getTrailerMap()
    {
        return trailerMap;
    }


    public static boolean debug = false;
    protected void dbg( String s )
    {
        if( debug )
            System.out.println(s);
    }


    private static void display( HashMap map )
    {
        if( map == null )
            return;

        Iterator keys = map.keySet().iterator();
        while( keys.hasNext() )
        {
            String key = ( String )keys.next();
            System.out.println( "    name : [" + key + "], value : [" + map.get( key ) + "]" );
        }
        System.out.println( "    ----    " );
    }





    protected String uri = null;
    protected String id = null;
    protected TransactionsetVO vo = null;

    protected ArrayList headerList = null;
    protected ArrayList bodyList = null;
    protected HashMap trailerMap = null;
}