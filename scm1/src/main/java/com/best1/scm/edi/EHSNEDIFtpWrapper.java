/*************************************************************************
 *
 * Copyright (C) 2004
 * Eastern Home Shopping Network
 * All Rights Reserved
 *
 * File: EHSNEDIFtpWrapper.java
 *
 *************************************************************************
 * Date	          Name                         Description
 * 28/12/2004     TCS-147446             		Created
 *************************************************************************/

package com.best1.scm.edi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Vector;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;


/**
* @CLASS NAME               : EHSNEDIFtpWrapper
* @TYPE                     : 
* @AUTHOR                   : TCS
* @VERSION                  : 1.0
* @EXTENDS                  : FTPClient

* @LAST MODIFIED BY         : 18-Dec-2004
* @LAST MODIFIED DATE       : 18-Dec-2004
**/
/**	 This utility is used for FTP	

*/

public class EHSNEDIFtpWrapper extends FTPClient {

	/**
	 A convenience method for connecting and logging in
	* @METHOD NAME              : connectAndLogin
	* @PARAMS                    : String host, String userName, String password
	* @RETURNS                   : boolean
	* @THROWS                : EHSNBatchException
	* @LAST MODIFIED BY         : 18-Dec-2004
	* @LAST MODIFIED DATE       : 18-Dec-2004
	**/

	public boolean connectAndLogin(
		String host,
		String userName,
		String password)
		throws Exception {
		try {

			boolean success = false;
			connect(host);
			int reply = getReplyCode();
			if (FTPReply.isPositiveCompletion(reply))
				success = login(userName, password);
			if (!success)
				disconnect();
			return success;

		} catch (Exception e) {
			throw e;

		}
	}

	/**
	 Turn passive transfer mode on or off. If Passive mode is active, a
	* 							: PASV command to be issued and interpreted before data transfers;
	* 							: otherwise, a PORT command will be used for data transfers. If you're
	* 							: unsure which one to use, you probably want Passive mode to be on.
	* @METHOD NAME              : setPassiveMode
	* @PARAMS                    : boolean setPassive
	* @RETURNS                   : void
	* @THROWS                : EHSNBatchException
	* @LAST MODIFIED BY         : 18-Dec-2004
	* @LAST MODIFIED DATE       : 18-Dec-2004
	**/

	public void setPassiveMode(boolean setPassive) throws Exception {
		try {

			if (setPassive)
				enterLocalPassiveMode();
			else
				enterLocalActiveMode();
		} catch (Exception e) {
			throw e;

		}
	}

	/**
	 Use ASCII mode for file transfers
	* @METHOD NAME              : ascii
	* @PARAMS                    : void
	* @RETURNS                   : void
	* @THROWS                : EHSNBatchException
	* @LAST MODIFIED BY         : 18-Dec-2004
	* @LAST MODIFIED DATE       : 18-Dec-2004
	**/

	public boolean ascii() throws Exception {

		try {
			return setFileType(FTP.ASCII_FILE_TYPE);
		} catch (Exception e) {
			throw e;

		}
	}

	/**
	 Use Binary mode for file transfers
	* @METHOD NAME              : binary
	* @PARAMS                    : void
	* @RETURNS                   : void
	* @THROWS                : EHSNBatchException
	* @LAST MODIFIED BY         : 18-Dec-2004
	* @LAST MODIFIED DATE       : 18-Dec-2004
	**/

	public boolean binary() throws Exception {
		try {
			return setFileType(FTP.BINARY_FILE_TYPE);
		} catch (Exception e) {
			throw e;

		}
	}

	/**
	 Download a file from the server, and save it to the specified local file
	* @METHOD NAME              : downloadFile
	* @PARAMS                    : String serverFile, String localFile
	* @RETURNS                   : boolean
	* @THROWS                : EHSNBatchException
	* @LAST MODIFIED BY         : 18-Dec-2004
	* @LAST MODIFIED DATE       : 18-Dec-2004
	**/

	public boolean downloadFile(String serverFile, String localFile)
		throws Exception {
		try {

			FileOutputStream out = new FileOutputStream(localFile);
			boolean result = retrieveFile(serverFile, out);
			out.close();
			return result;
		} catch (Exception e) {
			throw e;

		}
	}

	/**
	 Upload a file to the server
	* @METHOD NAME              : uploadFile
	* @PARAMS                    : String localFile, String serverFile
	* @RETURNS                   : boolean
	* @THROWS                : EHSNBatchException
	* @LAST MODIFIED BY         : 18-Dec-2004
	* @LAST MODIFIED DATE       : 18-Dec-2004
	**/

	public boolean uploadFile(String localFile, String serverFile)
		throws Exception {
		try {
			FileInputStream in = new FileInputStream(localFile);
			String serverFileTmp =serverFile+".tmp";                      // changed by zhangzujie
			boolean result = storeFile(serverFileTmp, in);
			this.rename(serverFileTmp, serverFile);
			in.close();
			return result;
		} catch (Exception e) {
			throw e;

		}
	}

	/**
	 Get the list of files in the current directory as a Vector of Strings
	* 							: (excludes subdirectories) 
	* @METHOD NAME              : listFileNames
	* @PARAMS                    : void
	* @RETURNS                   : Vector
	* @THROWS                : EHSNBatchException
	* @LAST MODIFIED BY         : 18-Dec-2004
	* @LAST MODIFIED DATE       : 18-Dec-2004
	**/

	public Vector listFileNames() throws Exception {

		try {
			FTPFile[] files = listFiles();
			Vector v = new Vector();
			for (int i = 0; i < files.length; i++) {
				if (!files[i].isDirectory())   //modified by zhangzujie &&(files[i].getName().endsWith(".txt")
					v.addElement(files[i].getName());
			}
			return v;
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 Get the list of files in the current directory as a single Strings,
	* 							: delimited by \n (char '10') (excludes subdirectories)
	* @METHOD NAME              : listFileNamesString
	* @PARAMS                    : void
	* @RETURNS                   : String
	* @THROWS                : EHSNBatchException
	* @LAST MODIFIED BY         : 18-Dec-2004
	* @LAST MODIFIED DATE       : 18-Dec-2004
	**/

	public String listFileNamesString() throws Exception {
		return vectorToString(listFileNames(), "\n");
	}

	/**
	 Get the list of subdirectories in the current directory as a Vector of Strings
	* 							: (excludes files) 
	* @METHOD NAME              : listSubdirNames
	* @PARAMS                    : void
	* @RETURNS                   : Vector
	* @THROWS                : EHSNBatchException
	* @LAST MODIFIED BY         : 18-Dec-2004
	* @LAST MODIFIED DATE       : 18-Dec-2004
	**/

	public Vector listSubdirNames() throws Exception {
		try {
			FTPFile[] files = listFiles();
			Vector v = new Vector();
			for (int i = 0; i < files.length; i++) {
				if (files[i].isDirectory())
					v.addElement(files[i].getName());
			}
			return v;
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 Get the list of subdirectories in the current directory as a single Strings,
	* 							: delimited by \n (char '10') (excludes files) 
	* @METHOD NAME              : listSubdirNamesString
	* @PARAMS                    : void
	* @RETURNS                   : String
	* @THROWS                : EHSNBatchException
	* @LAST MODIFIED BY         : 18-Dec-2004
	* @LAST MODIFIED DATE       : 18-Dec-2004
	**/

	public String listSubdirNamesString() throws Exception {
		return vectorToString(listSubdirNames(), "\n");
	}

	/**
	 Convert a Vector to a delimited String
	* @METHOD NAME              : vectorToString
	* @PARAMS                    : void
	* @RETURNS                   : String
	* @THROWS                : EHSNBatchException
	* @LAST MODIFIED BY         : 18-Dec-2004
	* @LAST MODIFIED DATE       : 18-Dec-2004
	**/

	private String vectorToString(Vector v, String delim)
		throws Exception {

		try {

			StringBuffer sb = new StringBuffer();
			String s = "";
			for (int i = 0; i < v.size(); i++) {
				sb.append(s).append((String) v.elementAt(i));
				s = delim;
			}
			return sb.toString();
		} catch (Exception e) {
			throw e;
		}
	}

}
