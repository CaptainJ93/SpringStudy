/*************************************************************************
 *
 * Copyright (C) 2004
 * Eastern Home Shopping Network
 * All Rights Reserved
 *
 * File: EHSNEDIUtils.java
 *
 *************************************************************************
 * Date	         Name                    Description
 * 28/12/2004     TCS-147446             	Created
 * 2006/07/19		Jimmy							Modify getTimeStampStringForDateString() method, Addition Date Type YYYY/MM/DD
 *************************************************************************/
package com.best1.scm.edi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.sql.Connection;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;

import com.best1.scm.common.config.Global;




/**
 * @CLASS NAME               : EHSNEDIUtils
 * @TYPE                     : NIL
 * @AUTHOR                   : TCS
 * @VERSION                  : 1
 * @EXTENDS                  : Nil

 * @LAST MODIFIED BY         :147446
 * @LAST MODIFIED DATE       :22/06/2005
 **/
/**	 This class contains utility methods related to EDI
 */
public class EHSNEDIUtils {

    /**
     This methods transports the files to remote location for given transactinset
     * @METHOD NAME              : transportFile
     * @PARAMS                    : String transactionID, Connection con
     * @RETURNS                   : boolean
     * @THROWS                : EHSNBatchException
     * @LAST MODIFIED BY         : 147446
     * @LAST MODIFIED DATE       : 22/06/2005(DD/MM/YYYY)
     **/
    public static boolean transportFile(String transactionID, Connection con) throws
            Exception {
        //Connect to the Database to find User Name , PWd and Transport mechanism
        //based on TransactionID
        try {

            TransactionsetDAO transactionSetDao = new TransactionsetDAO(con);
            TransactionsetVO transactionSetVo =
                    transactionSetDao.findByPrimaryKey(transactionID);

            String sourceDirectory =
                    getRootFolder(transactionID)
                    + transactionSetVo.getFilelocation();

            if (EHSNEDIConstants
                .COMMUNICATION_MEDIUM_FTP
                .equalsIgnoreCase(transactionSetVo.getCommunicationmedium())) {

                EHSNEDIFtpWrapper ftp = new EHSNEDIFtpWrapper();
                // get the details of primary and Secondary server from the Database
                String primaryServerName =
                        transactionSetVo.getFtporemailaddress();
                String primaryuserId = transactionSetVo.getFtpusername();

                String primarypwd = transactionSetVo.getFtppassword();

                String ftpPrimaryFolder =
                        transactionSetVo.getFtpprimaryfoldername();

                //step1 save file
                //step2 open ftp connection
                //step3 loop through the folder
                //step4 send files..
                //step5 delete file after sending..

                //saveFile(fileName, transactionID);
                boolean connectedFlag = false;
                try {
                    for (int count = 0;
                                     count < EHSNEDIConstants.
                                     FTP_MAX_RETRY_COUNT;
                                     count++) {

                        if (ftp
                            .connectAndLogin(
                                    primaryServerName,
                                    primaryuserId,
                                    primarypwd)) {
                            connectedFlag = true;
                            

                            //get file list from directory..
                            File dir = new File(sourceDirectory);
                            String[] fileList = dir.list();
                            //Creates a directory , if it is not created already.
                            ftp.makeDirectory(ftpPrimaryFolder);
                            
                            if (ftp.changeWorkingDirectory(ftpPrimaryFolder)) {
                                
                                for (int fileCount = 0;
                                        fileCount < fileList.length;
                                        fileCount++) {
                                    String fileFullPath =
                                            sourceDirectory +
                                            fileList[fileCount];

                                    if (uploadFileToRemoteServer(ftp,
                                            fileFullPath,
                                            fileList[fileCount])) {

                                        File toDelete = new File(fileFullPath);
                                        
                                        if(toDelete.isFile()){
                                            toDelete.delete();
                                        }
                                        //DELETE THE FILE FROM LOCAL SYSTEM
                                    } else {
                                        
                                    }
                                }
                            } else {
                                throw new Exception(
                                		);
                            }

                            //							}
                            count = EHSNEDIConstants.FTP_MAX_RETRY_COUNT;
                        }
                        Thread.sleep(
                                EHSNEDIConstants.FTP_THREAD_MAX_SLEEPING_TIME);

                    }
                } finally {
                    if (connectedFlag) {
                        ftp.logout();
                        ftp.disconnect();
                    }
                }

            } 
        }catch (Exception e) {
            throw e;

        }
        return true;
    } // transport method

    /**
     This methods uploads the files to remote server using FTP
     * @METHOD NAME              : uploadFileToRemoteServer
     * @PARAMS                    : EHSNEDIFtpWrapper ftp,String fileFullPath, String fileName
     * @RETURNS                   : boolean
     * @THROWS                : EHSNBatchException
     * @LAST MODIFIED BY         : 147446
     * @LAST MODIFIED DATE       : 22/06/2005(DD/MM/YYYY)
     **/
    // FTP Method

    public static boolean uploadFileToRemoteServer(
            EHSNEDIFtpWrapper ftp,
            String fileFullPath,
            String fileName) throws Exception {
        boolean result = false;
        try {

            ftp.setPassiveMode(true);
            if (ftp.uploadFile(fileFullPath, fileName)) {
                
                result = true;
            } else {
                
                result = false;
            }

        } catch (Exception e) {
            throw e;

        }
        return result;

    } // method -connect

    public static void saveFileAs( String source, String destination )
        throws Exception
    {
        File s = new File( source );
        File d = new File( destination );

        if( !s.exists() || !s.isFile() )
            throw new Exception( "invalid filepath to copy from" );

        prepareReadyFile( d );

        FileInputStream fis = null;
        DataOutputStream dos = null;
        try {
            fis = new FileInputStream( s );
            FileChannel channel = fis.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate( ( int )channel.size() );
            channel.read( buffer );

            // copy the content
            dos = new DataOutputStream( new FileOutputStream( d ) );
            dos.write( buffer.array() );
        }
        catch( Exception x ) {
            throw x;
        }
        finally {
            try {
                if( fis != null )
                    fis.close();

                if( dos != null )
                    dos.close();
            }
            catch( Exception x ) {
                
                 throw x;
            }
        }
    }

    /**
     This methods deletes the given file; if the filePath is a directory. It will bypass.
     * @METHOD NAME              : deleteFile
     * @PARAMS                    :	String filePath
     * @RETURNS                   : void
     * @THROWS                :  EHSNBatchException
     * @LAST MODIFIED BY         : 147446
     * @LAST MODIFIED DATE       : 22/06/2005(DD/MM/YYYY)
     **/
    public static void deleteFile(String filePath) throws Exception {
        try {
            File f = new File(filePath);
            if(f.isFile()){
                if (f.delete()) {
                    
                } else {
                    
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     This methods returns edi files names for given transactionset id
     * @METHOD NAME              : getInputEDIFilesNamesForProcessing
     * @PARAMS                    :	String transactionId,Connection con
     * @RETURNS                   : File[]
     * @THROWS                :  EHSNBatchException
     * @LAST MODIFIED BY         : 147446
     * @LAST MODIFIED DATE       : 22/06/2005(DD/MM/YYYY)
     **/
    public static File[] getInputEDIFilesNamesForProcessing(
            String transactionId,
            Connection con) throws Exception {
        File[] fileList = null;
        try {

            TransactionsetDAO transactionSetDao = new TransactionsetDAO(con);
            TransactionsetVO transactionSetVo =
                    transactionSetDao.findByPrimaryKey(transactionId);
            if (transactionSetVo != null) {
                String sourceDirectory = transactionSetVo.getFilelocation();
                File dir = new File(sourceDirectory);
                fileList = dir.listFiles();
            }
        } catch (Exception ebe) {
            throw ebe;
        } 
        return fileList;

    }

    /**
     This methods delete the files from given directory. File Only and will bypass directory.
     * @METHOD NAME              : deleteFiles
     * @PARAMS                    : String sourceDir
     * @RETURNS                   : void
     * @THROWS                : EHSNBatchException
     * @LAST MODIFIED BY         : 147446
     * @LAST MODIFIED DATE       : 22/06/2005(DD/MM/YYYY)
     **/
    public static void deleteFiles(String sourceDir) throws Exception {
        try {
            File f = new File(sourceDir);
            String[] files = f.list();
            for (int i = 0; i < files.length; i++) {
                String path = sourceDir + files[i];
                File toDelFile = new File(path);
                if(toDelFile.isFile()){
                    if (toDelFile.delete()) {
                        
                    } else {
                     
                    }
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     This methods formats the given Timestamp object to given format.
     * @METHOD NAME              : formatDateString
     * @PARAMS                    : Timestamp timeStamp, String format
     * @RETURNS                   : String
     * @THROWS                : EHSNBatchException
     * @LAST MODIFIED BY         : 147446
     * @LAST MODIFIED DATE       : 22/06/2005(DD/MM/YYYY)
     **/
    public static String formatDateString(Timestamp timeStamp, String format) throws
            Exception {
        StringBuffer formattedDate = new StringBuffer();
        StringBuffer inputDate = new StringBuffer();
        try {
            inputDate.append(timeStamp);
            String yyyy = inputDate.substring(0, 4);
            String yy = inputDate.substring(2, 4);
            String mm = inputDate.substring(5, 7);
            String dd = inputDate.substring(8, 10);
            String hh = inputDate.substring(11, 13);
            String mi = inputDate.substring(14, 16);
            String ss = inputDate.substring(17, 19);
            //String msec = inputDate.substring(20, 21);
            if (format != null) {

                if (format
                    .equalsIgnoreCase(
                            EHSNEDIConstants.EDI_DATEFORMAT_YYYYMMDDHHMISS)) {
                    formattedDate.append(yyyy);
                    formattedDate.append(mm);
                    formattedDate.append(dd);
                    formattedDate.append(hh);
                    formattedDate.append(mi);
                    formattedDate.append(ss);
                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_YYYYMMDDHHMI)) {
                    formattedDate.append(yyyy);
                    formattedDate.append(mm);
                    formattedDate.append(dd);
                    formattedDate.append(hh);
                    formattedDate.append(mi);

                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_YYYYMMDD)) {
                    formattedDate.append(yyyy);
                    formattedDate.append(mm);
                    formattedDate.append(dd);

                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_YYMMDD)) {
                    formattedDate.append(yy);
                    formattedDate.append(mm);
                    formattedDate.append(dd);

                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_YYMM)) {
                    formattedDate.append(yy);
                    formattedDate.append(mm);

                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_MMDDYYYYHHMISS)) {

                    formattedDate.append(mm);
                    formattedDate.append(dd);
                    formattedDate.append(yyyy);
                    formattedDate.append(hh);
                    formattedDate.append(mi);
                    formattedDate.append(ss);
                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_MMDDYYYYHHMI)) {

                    formattedDate.append(mm);
                    formattedDate.append(dd);
                    formattedDate.append(yyyy);
                    formattedDate.append(hh);
                    formattedDate.append(mi);

                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_MMDDYYYY)) {

                    formattedDate.append(mm);
                    formattedDate.append(dd);
                    formattedDate.append(yyyy);

                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_MMDDYY)) {

                    formattedDate.append(mm);
                    formattedDate.append(dd);
                    formattedDate.append(yy);

                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_MMYY)) {

                    formattedDate.append(mm);
                    formattedDate.append(yy);

                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_DDMMYYYYHHMISS)) {
                    formattedDate.append(dd);
                    formattedDate.append(mm);
                    formattedDate.append(yyyy);
                    formattedDate.append(hh);
                    formattedDate.append(mi);
                    formattedDate.append(ss);
                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_DDMMYYYYHHMI)) {
                    formattedDate.append(dd);
                    formattedDate.append(mm);
                    formattedDate.append(yyyy);
                    formattedDate.append(hh);
                    formattedDate.append(mi);

                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_DDMMYYYY)) {
                    formattedDate.append(dd);
                    formattedDate.append(mm);
                    formattedDate.append(yyyy);

                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_DDMMYY)) {
                    formattedDate.append(dd);
                    formattedDate.append(mm);
                    formattedDate.append(yy);
                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_DDMM)) {
                    formattedDate.append(dd);
                    formattedDate.append(mm);
                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_HHMISS)) {
                    formattedDate.append(hh);
                    formattedDate.append(mi);
                    formattedDate.append(ss);
                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_HHMI)) {
                    formattedDate.append(hh);
                    formattedDate.append(mi);
                }
            } else {
                inputDate.append(timeStamp);
                formattedDate.append(inputDate);
            }
        } catch (Exception ex) {

            throw ex;
        }
        return formattedDate.toString();
    }

    /**
     This methods formats the given String date object to given format.
     * @METHOD NAME              : formatDateString
     * @PARAMS                    : String inputDate, String format
     * @RETURNS                   : String
     * @THROWS                : EHSNBatchException
     * @LAST MODIFIED BY         : 147446
     * @LAST MODIFIED DATE       : 22/06/2005(DD/MM/YYYY)
     **/
    public static String formatDateString(String inputDate, String format) throws
            Exception {
        StringBuffer formattedDate = new StringBuffer();
        String yyyy = "0000";
        String yy = "00";
        String mm = "00";
        String dd = "00";
        String hh = "00";
        String mi = "00";
        String ss = "00";
        //String msec = "0";
        try {
            if (inputDate != null && inputDate.length() >= 4) {
                yyyy = inputDate.substring(0, 4);
                yy = inputDate.substring(2, 4);
            }
            if (inputDate != null && inputDate.length() >= 7) {
                mm = inputDate.substring(5, 7);
            }
            if (inputDate != null && inputDate.length() >= 10) {
                dd = inputDate.substring(8, 10);
            }
            if (inputDate.length() >= 13) {
                hh = inputDate.substring(11, 13);
            }
            if (inputDate.length() >= 16) {
                mi = inputDate.substring(14, 16);
            }
            if (inputDate.length() >= 19) {
                ss = inputDate.substring(17, 19);
            }
            /*
            if (inputDate.length() >= 21) {
                msec = inputDate.substring(20, 21);
            }
            */
            if (format != null) {

                if (format
                    .equalsIgnoreCase(
                            EHSNEDIConstants.EDI_DATEFORMAT_YYYYMMDDHHMISS)) {
                    formattedDate.append(yyyy);
                    formattedDate.append(mm);
                    formattedDate.append(dd);
                    formattedDate.append(hh);
                    formattedDate.append(mi);
                    formattedDate.append(ss);
                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_YYYYMMDDHHMISS)) {
                    formattedDate.append(yyyy);
                    formattedDate.append(mm);
                    formattedDate.append(dd);
                    formattedDate.append(hh);
                    formattedDate.append(mi);
                    formattedDate.append(ss);
                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_YYYYMMDDHHMI)) {
                    formattedDate.append(yyyy);
                    formattedDate.append(mm);
                    formattedDate.append(dd);
                    formattedDate.append(hh);
                    formattedDate.append(mi);

                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_YYYYMMDD)) {
                    formattedDate.append(yyyy);
                    formattedDate.append(mm);
                    formattedDate.append(dd);

                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_YYMMDD)) {
                    formattedDate.append(yy);
                    formattedDate.append(mm);
                    formattedDate.append(dd);

                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_YYMM)) {
                    formattedDate.append(yy);
                    formattedDate.append(mm);

                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_MMDDYYYYHHMISS)) {

                    formattedDate.append(mm);
                    formattedDate.append(dd);
                    formattedDate.append(yyyy);
                    formattedDate.append(hh);
                    formattedDate.append(mi);
                    formattedDate.append(ss);
                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_MMDDYYYYHHMI)) {

                    formattedDate.append(mm);
                    formattedDate.append(dd);
                    formattedDate.append(yyyy);
                    formattedDate.append(hh);
                    formattedDate.append(mi);

                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_MMDDYYYY)) {

                    formattedDate.append(mm);
                    formattedDate.append(dd);
                    formattedDate.append(yyyy);

                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_MMDDYY)) {

                    formattedDate.append(mm);
                    formattedDate.append(dd);
                    formattedDate.append(yy);

                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_MMYY)) {

                    formattedDate.append(mm);
                    formattedDate.append(yy);

                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_DDMMYYYYHHMISS)) {
                    formattedDate.append(dd);
                    formattedDate.append(mm);
                    formattedDate.append(yyyy);
                    formattedDate.append(hh);
                    formattedDate.append(mi);
                    formattedDate.append(ss);
                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_DDMMYYYYHHMI)) {
                    formattedDate.append(dd);
                    formattedDate.append(mm);
                    formattedDate.append(yyyy);
                    formattedDate.append(hh);
                    formattedDate.append(mi);

                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_DDMMYYYY)) {
                    formattedDate.append(dd);
                    formattedDate.append(mm);
                    formattedDate.append(yyyy);

                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_DDMMYY)) {
                    formattedDate.append(dd);
                    formattedDate.append(mm);
                    formattedDate.append(yy);
                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_DDMM)) {
                    formattedDate.append(dd);
                    formattedDate.append(mm);
                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_HHMISS)) {
                    formattedDate.append(hh);
                    formattedDate.append(mi);
                    formattedDate.append(ss);
                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_HHMI)) {
                    formattedDate.append(hh);
                    formattedDate.append(mi);
                }
                else
                    formattedDate.append(inputDate);
            } else {
                formattedDate.append(inputDate);
            }
        } catch (Exception ex) {

            throw ex;
        }
        return formattedDate.toString();
    }

    /**
     This methods converts the Date string in given format to TimeStamp string.
     * @METHOD NAME              : getTimeStampStringForDateString
     * @PARAMS                    : String inputDate, String format
     * @RETURNS                   : String
     * @THROWS                : EHSNBatchException
     * @LAST MODIFIED BY         : 147446
     * @LAST MODIFIED DATE       : 22/06/2005(DD/MM/YYYY)
     **/
    public static String getTimeStampStringForDateString(
            String inputDate,
            String format) throws Exception {

    if( inputDate != null && inputDate.length() != 0 )
    {
        // return the original if '0'+ string is the date
        boolean useRaw = true;
        for( int c = 0; c < inputDate.length(); c++ )
        {
            if( inputDate.charAt( c ) != '0' )
            {
                useRaw = false;
                break;
            }
        }
        if( useRaw )
            return inputDate;
    }

        //StringBuffer formattedDate = new StringBuffer();
        Timestamp ts = null;
        String yyyy = "0000";
        //String yy = "00";
        String mm = "00";
        String dd = "00";
        String hh = "00";
        String mi = "00";
        String ss = "00";
        //String msec = "00";
        int mon = 0;
        try {
            if (format != null) {
                if (format
                    .equalsIgnoreCase(
                            EHSNEDIConstants.EDI_DATEFORMAT_YYYYMMDDHHMISS)) {

                    yyyy = inputDate.substring(0, 4);
                    mm = inputDate.substring(4, 6);
                    dd = inputDate.substring(6, 8);
                    hh = inputDate.substring(8, 10);
                    mi = inputDate.substring(10, 12);
                    ss = inputDate.substring(12, 14);
                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_YYYYMMDDHHMI)) {

                    yyyy = inputDate.substring(0, 4);
                    mm = inputDate.substring(4, 6);
                    dd = inputDate.substring(6, 8);
                    hh = inputDate.substring(8, 10);
                    mi = inputDate.substring(10, 12);

                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_YYYYMMDD)) {

                    yyyy = inputDate.substring(0, 4);
                    mm = inputDate.substring(4, 6);
                    dd = inputDate.substring(6, 8);
                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_YYMMDD)) {

                    yyyy = "20" + inputDate.substring(0, 2);
                    mm = inputDate.substring(2, 4);
                    dd = inputDate.substring(4, 6);

                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_YYMM)) {

                    yyyy = "20" + inputDate.substring(0, 2);
                    mm = inputDate.substring(2, 4);
                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_MMDDYYYYHHMISS)) {

                    mm = inputDate.substring(0, 2);
                    dd = inputDate.substring(2, 4);
                    yyyy = inputDate.substring(4, 8);
                    hh = inputDate.substring(8, 10);
                    mi = inputDate.substring(10, 12);
                    ss = inputDate.substring(12, 14);

                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_MMDDYYYYHHMI)) {

                    mm = inputDate.substring(0, 2);
                    dd = inputDate.substring(2, 4);
                    yyyy = inputDate.substring(4, 8);
                    hh = inputDate.substring(8, 10);
                    mi = inputDate.substring(10, 12);

                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_MMDDYYYY)) {

                    mm = inputDate.substring(0, 2);
                    dd = inputDate.substring(2, 4);
                    yyyy = inputDate.substring(4, 8);

                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_MMDDYY)) {

                    mm = inputDate.substring(0, 2);
                    dd = inputDate.substring(2, 4);
                    yyyy = "20" + inputDate.substring(4, 6);

                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_MMYY)) {

                    mm = inputDate.substring(0, 2);
                    yyyy = "20" + inputDate.substring(2, 4);

                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_DDMMYYYYHHMISS)) {

                    dd = inputDate.substring(0, 2);
                    mm = inputDate.substring(2, 4);
                    yyyy = inputDate.substring(4, 8);
                    hh = inputDate.substring(8, 10);
                    mi = inputDate.substring(10, 12);
                    ss = inputDate.substring(12, 14);

                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_DDMMYYYYHHMI)) {

                    dd = inputDate.substring(0, 2);
                    mm = inputDate.substring(2, 4);
                    yyyy = inputDate.substring(4, 8);
                    hh = inputDate.substring(8, 10);
                    mi = inputDate.substring(10, 12);
                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_DDMMYYYY)) {

                    dd = inputDate.substring(0, 2);
                    mm = inputDate.substring(2, 4);
                    yyyy = inputDate.substring(4, 8);

                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_DDMMYY)) {

                    dd = inputDate.substring(0, 2);
                    mm = inputDate.substring(2, 4);
                    yyyy = "20" + inputDate.substring(4, 6);

                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_DDMM)) {

                    dd = inputDate.substring(0, 2);
                    mm = inputDate.substring(2, 4);

                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_HHMISS)) {

                    hh = inputDate.substring(0, 2);
                    mi = inputDate.substring(2, 4);
                    ss = inputDate.substring(4, 6);

                } else if (
                        format.equalsIgnoreCase(
                                EHSNEDIConstants.EDI_DATEFORMAT_HHMI)) {

                    hh = inputDate.substring(0, 2);
                    mi = inputDate.substring(2, 4);
                } else if (
                      format.equalsIgnoreCase(
                              EHSNEDIConstants.EDI_DATEFORMAT_YYYY_MM_DD)) {

                  yyyy = inputDate.substring(0, 4);
                  mm = inputDate.substring(5, 7);
                  dd = inputDate.substring(8, 10);
                }
            }
            Calendar cal = Calendar.getInstance();
            //int day;
            if (Integer.parseInt(mm) > 0) {
                mon = Integer.parseInt(mm) - 1;
            }
            if (Integer.parseInt(dd) == 0) {
                //day = 0;

                mon = mon + 1;
            } 
            /*
            else {
                day = Integer.parseInt(dd);
            }
            */
            cal.set(
                    Integer.parseInt(yyyy),
                    mon,
                    Integer.parseInt(dd),
                    Integer.parseInt(hh),
                    Integer.parseInt(mi),
                    Integer.parseInt(ss));
            ts = new Timestamp(cal.getTimeInMillis());

            /*formattedDate.append(yyyy);
                formattedDate.append("-");
                formattedDate.append(mm);
                formattedDate.append("-");
                formattedDate.append(dd);
                formattedDate.append(" ");
                formattedDate.append(hh);
                formattedDate.append(":");
                formattedDate.append(mi);
                formattedDate.append(":");
                formattedDate.append(ss);
                formattedDate.append(".000000000");

                ts = Timestamp.valueOf(formattedDate.toString());*/
        } catch (Exception ex) {

            throw ex;
        }
        return ts.toString();
    }

    /**
     This methods creates an error file for given transactionset id
     * 								in error location
     * @METHOD NAME              : createErrorFile
     * @PARAMS                    :	ArrayList ediErrorVoList,String fileName,String transactionSetId,Connection con
     * @RETURNS                   : File
     * @THROWS                : EHSNBatchException
     * @LAST MODIFIED BY         : 147446
     * @LAST MODIFIED DATE       : 22/06/2005(DD/MM/YYYY)
     **/
    public static File createErrorFile(
            ArrayList ediErrorVoList,
            String fileName,
            String transactionSetId,
            Connection con) throws Exception {
        File errorFile = null;
        DataOutputStream doStream = null;
        BufferedWriter writer = null;
        StringBuffer contents = new StringBuffer();
        TransactionsetVO transactionSetVo = null;
        String defaultFileName = null;
        String destinationFileName = null;
        try {
            //get transaction details
            transactionSetVo = getTransactionDetails(transactionSetId, con);
            String rootFolder = getRootFolder(transactionSetId);
            String errorFileDir =
                    rootFolder + transactionSetVo.getErrorfilelocation();
            //set defalut file name
            File filePath = new File(errorFileDir);
            filePath.mkdirs();

            defaultFileName =
                    errorFileDir
                    + "Error_"
                    + transactionSetVo.getTransactionsetid();
            if (fileName == null) {
                destinationFileName = defaultFileName;
            } else {
                destinationFileName = errorFileDir + fileName;
            }
            
            errorFile = new File(destinationFileName);
            doStream =
                    new DataOutputStream(new FileOutputStream(
                    destinationFileName));
            writer =
                    new BufferedWriter(new OutputStreamWriter(doStream, "UTF-8"));
            //String line = null;
            EDIErrorVO ediErrorVo = null;
            if (ediErrorVoList != null) {
                int noOfRecords = ediErrorVoList.size();
                for (int counter = 0; counter < noOfRecords; counter++) {
                    ediErrorVo = (EDIErrorVO) ediErrorVoList.get(counter);
                    contents.append(ediErrorVo.getRecordErrorIdentifier());
                    contents.append("--");
                    contents.append(
                            ediErrorVo.getErrorCode());
                    contents.append("\n");
                }
            }
            writer.write(contents.toString());

        } catch (Exception ebe) {
            throw ebe;
       
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (Exception e) {
                throw e;
            }
        }
        return errorFile;
    }

    /**
     This methods returns transactionset details for given id
     * @METHOD NAME              : getTransactionDetails
     * @PARAMS                    :	String transactionSetId,Connection con
     * @RETURNS                   : TransactionsetVO
     * @THROWS                : EHSNBatchException
     * @LAST MODIFIED BY         : 147446
     * @LAST MODIFIED DATE       : 22/06/2005(DD/MM/YYYY)
     **/
    public static TransactionsetVO getTransactionDetails(
            String transactionSetId,
            Connection con) throws Exception {
        TransactionsetDAO transactionSetDao = null;
        TransactionsetVO transactionSetVo = null;
        try {
            transactionSetDao = new TransactionsetDAO(con);
            transactionSetVo =
                    transactionSetDao.findByPrimaryKey(transactionSetId);
        } catch (Exception ebe) {
            throw ebe;
        } 
        return transactionSetVo;
    }

    /**
     This methods delete the files
     * @METHOD NAME              : deleteFiles
     * @PARAMS                    :	File[] fileListArray
     * @RETURNS                   : void
     * @THROWS                : EHSNBatchException
     * @LAST MODIFIED BY         : 147446
     * @LAST MODIFIED DATE       : 22/06/2005(DD/MM/YYYY)
     **/
    public static void deleteFiles(File[] fileListArray) throws
            Exception {
        try {
            for (int i = 0; i < fileListArray.length; i++) {
                File toDelFile = fileListArray[i];
                if(toDelFile.isFile()){
                    if (toDelFile.delete()) {
                        
                    } else {
                        
                    }
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     This methods delete the files
     * @METHOD NAME              : deleteFiles
     * @PARAMS                    :	ArrayList fileArrayList
     * @RETURNS                   : void
     * @THROWS                : EHSNBatchException
     * @LAST MODIFIED BY         : 147446
     * @LAST MODIFIED DATE       : 22/06/2005(DD/MM/YYYY)
     **/
    public static void deleteFiles(ArrayList fileArrayList) throws
            Exception {
        String fileFullPath = null;
        try {
            for (int i = 0; i < fileArrayList.size(); i++) {
                fileFullPath = (String) fileArrayList.get(i);
                File toDel = new File(fileFullPath);
                if (toDel.delete()) {
                    
                } else {
                    
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     This methods returns newline character for given char code
     * @METHOD NAME              : getNewLineChar
     * @PARAMS                    :	String charCode
     * @RETURNS                   : String
     * @THROWS                : EHSNBatchException
     * @LAST MODIFIED BY         : 147446
     * @LAST MODIFIED DATE       : 22/06/2005(DD/MM/YYYY)
     **/
    public static String getNewLineChar(String charCode) throws
            Exception {
        String newLineChar = EHSNEDIConstants.DEFAULT_NEWLINE_CHAR;
        try {
            if (charCode != null) {
                if (EHSNEDIConstants.NEWLINE_CHAR_CR_CODE.equals(charCode)) {
                    newLineChar = EHSNEDIConstants.NEWLINE_CHAR_CR;
                } else if (
                        EHSNEDIConstants.NEWLINE_CHAR_LF_CODE.equals(charCode)) {
                    newLineChar = EHSNEDIConstants.NEWLINE_CHAR_LF;
                }
                if (EHSNEDIConstants.NEWLINE_CHAR_CRLF_CODE.equals(charCode)) {
                    newLineChar = EHSNEDIConstants.NEWLINE_CHAR_CRLF;
                }

            }
        } catch (Exception e) {
            throw e;
        }
        return newLineChar;
    }

    /**
     This methods returns root folder for given transactionsetid
     * @METHOD NAME              : getRootFolder
     * @PARAMS                    :	String transactionSetId
     * @RETURNS                   : String
     * @THROWS                : EHSNBatchException
     * @LAST MODIFIED BY         : 147446
     * @LAST MODIFIED DATE       : 22/06/2005(DD/MM/YYYY)
     **/
    public static String getRootFolder(String transactionSetId) throws
            Exception {
        String rootFolder = "";
        try {
            if ((transactionSetId != null)) {

            	rootFolder = EHSNEDIConstants.ROOT_FILEPATH;

            }
        } catch (Exception e) {
        	
            throw e;
        }
        return rootFolder;
    }

    public static ArrayList getEDIFileReadersList( String id, Connection conn )
        throws Exception
    {
        ArrayList readers = new ArrayList();

        String[] files = getInputFileList( id, conn );
        for( int i = 0; files != null && i < files.length; i++ )
            readers.add( getEDIFileReader( id, files[ i ], conn ) );
        return readers;
    }

    public static String[] getInputFileList( String id, Connection conn )
        throws Exception
    {
        TransactionsetDAO dao = new TransactionsetDAO( conn );
        TransactionsetVO vo = dao.findByPrimaryKey( id );

        if( vo == null )
            return null;
        else
        {
            File dir = new File( getRootFolder( id ) + vo.getFilelocation() );
            String[] files = dir.list();
            if( files != null )
                Arrays.sort( files );

            return files;
        }
    }

    public static EDIFileReader getEDIFileReader( String id,
                                           String filename,
                                           Connection conn )
        throws Exception
    {
        TransactionsetVO vo = null;
        String rootDir = null;
        String sourceDir = null;
        String errorDir = null;
        String filepath = null;
        EDIFileReader reader = null;

        try {
            TransactionsetDAO dao = new TransactionsetDAO( conn );
            vo = dao.findByPrimaryKey( id );

            if( vo == null )
                return null;
            else
            {
                rootDir = getRootFolder( id );
                sourceDir = rootDir + vo.getFilelocation();
                errorDir = rootDir + vo.getErrorfilelocation();
                filepath = sourceDir + filename;
            }

            String delimiter = vo.getDelimiter(); 
            if( EHSNEDIConstants.DELITER_SPACE.equals( delimiter ) )
                delimiter = " ";
            else if( EHSNEDIConstants.DELITER_TAB.equals( delimiter ) )
                delimiter = "\t";

            boolean byteOriented = true;
            if( vo.getByChar() == EHSNEDIConstants.EDI_BYCHAR )
                byteOriented = false;

            if( delimiter != null )
                reader = new DelimitedFileReader( filepath, id, delimiter );
            else if( byteOriented )
                reader = new EDIFileReaderByByte( filepath, id );
            else
                reader = new EDIFileReaderByChar( filepath, id );

            reader.readFile( conn );
        }
       
        catch( Exception x ) {
            throw x;
        }

        return reader;
    }
    //1.
    public static TransactionsetVO getTransactionsetVO(Connection conn,String transactionSetID) throws Exception{
    	TransactionsetDAO dao = new TransactionsetDAO( conn );
    	TransactionsetVO vo = dao.findByPrimaryKey( transactionSetID );
    	return vo;
    }

    //2.
    public static EDIFileReader getEDIFileReader2(  String id,
    		TransactionsetVO vo,
            String filename,
            Connection conn )
		throws Exception
		{
		
		String rootDir = null;
		String sourceDir = null;
		String errorDir = null;
		String filepath = null;
		EDIFileReader reader = null;
		
		try {
		
		if( vo == null )
		return null;
		else
		{
		rootDir = getRootFolder( id );
		sourceDir = rootDir + vo.getFilelocation();
		errorDir = rootDir + vo.getErrorfilelocation();
		filepath = sourceDir + filename;
		}
		
		String delimiter = vo.getDelimiter();
		if( EHSNEDIConstants.DELITER_SPACE.equals( delimiter ) )
		delimiter = " ";
		else if( EHSNEDIConstants.DELITER_TAB.equals( delimiter ) )
		delimiter = "\t";
		
		boolean byteOriented = true;
		if( vo.getByChar() == EHSNEDIConstants.EDI_BYCHAR )
		byteOriented = false;
		
		if( delimiter != null )
		reader = new DelimitedFileReader( filepath, id, delimiter );
		else if( byteOriented )
		reader = new EDIFileReaderByByte( filepath, id );
		else
		reader = new EDIFileReaderByChar( filepath, id );
		}
		catch( Exception x ) {
			if( errorDir != null )
			{
				saveFileAs( filepath,
				errorDir + filename );
				File originalFile = new File( filepath );
				if(originalFile.isFile()){
				originalFile.delete();
				}
			}
			reader = null;
			throw x;
		}
		
		
		return reader;
		}
    
    public static void formatTrailer(Connection conn, String transactionSetID, String defaultValue) throws Exception{
    	
    	 TransactionsetDAO transactionSetDao = new TransactionsetDAO(conn); 
         TransactionsetVO transactionSetVo = transactionSetDao.findByPrimaryKey(transactionSetID);
         String rootDir = getRootFolder( transactionSetID );
         
         File[] fileList = null;
         if (transactionSetVo != null) {
             String sourceDirectory = rootDir + transactionSetVo.getFilelocation();
             File dir = new File(sourceDirectory);
             fileList = dir.listFiles();
         }
    	 for (int i = 0; i < fileList.length; i++){
    		 String uri = fileList[i].getAbsolutePath();
    		 if(uri.endsWith(".txt")) {
	    		 BufferedReader is = new BufferedReader( new FileReader(fileList[i]) );
	    		 int begin = uri.indexOf(".");
	    		 String filepath = uri.substring(0, begin) + "_T" + uri.substring(begin, uri.length());
	    		 File trailerFile= new File(filepath);
	    		 prepareReadyFile( trailerFile );
	             BufferedWriter os = new BufferedWriter( new FileWriter(trailerFile) );
	             String inputLine;
	             
	             int c_rows = 0;
	             int t_rows = 0;
	             while ((inputLine = is.readLine()) != null){
	            	 t_rows = t_rows + 1;
	             }
	             is.close();
	             
	             is = new BufferedReader( new FileReader(fileList[i]) );
	             
	             while ((inputLine = is.readLine()) != null){
					  c_rows = c_rows + 1;
					  
					  if ( c_rows == t_rows )
						  os.write(defaultValue);
					  
					  os.write(inputLine, 0, inputLine.length());
					  os.newLine();
	             }
	             
	             is.close();
	             os.flush();
	             os.close();      
	    	 }
    	 }
    	 deleteFiles(fileList);
    }   
    
    public static void prepareReadyFile(File f) throws Exception {
        File dirs = null;
        File good = null;
        boolean ok = false;

        try {
            String uri = f.getAbsolutePath();
            int begin = uri.indexOf(File.separator);
            int end = uri.lastIndexOf(File.separator);

            if (end > begin) {
                dirs = new File(uri.substring(0, end));
                ok = dirs.mkdirs();
                
            }

            good = f;
            ok = good.createNewFile();
        } catch (SecurityException sx) {
            if (good != null) {
                if (good.isFile()) {
                    good.delete();
                } else if (good.isDirectory()) {
                   
                } else {
                    
                }
            }
            throw sx;
        } catch (IOException iox) {
        	iox.printStackTrace();
            if (good != null) {
                if (good.isFile()) {
                    good.delete();
                } else if (good.isDirectory()) {
                } else {
                   
                }
            }
            throw iox;
        }
    }
}
