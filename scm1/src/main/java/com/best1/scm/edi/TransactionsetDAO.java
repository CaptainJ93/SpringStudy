/*************************************************************************
 *
 * Copyright (C) 2004
 * Eastern Home Shopping Network
 * All Rights Reserved
 *
 * File: TransactionsetDAO.java
 *
 *************************************************************************
 * Date	          Name                         Description
 * 28/12/2004     TCS-147446             		Created
 *************************************************************************/
package com.best1.scm.edi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;




/**
 * 	@CLASS NAME               : 	TransactionsetDAO
 *		@TYPE                     :     DAO Class
 * 	@AUTHOR                   :     TCS
 * 	@VERSION                  : 	1.0
 * 	@EXTENDS                  :

 * 	@TABLES REFERRED          : 	TCMN_TRANSACTIONSET
 * 	@LAST MODIFIED BY         :		TCS
 * 	@LAST MODIFIED DATE       :		23/06/2005
 **/
/**			Data access class for TCMN_TRANSACTIONSET
 */
public class TransactionsetDAO {
    private Connection con = null;
    /**
     constructor
     * @METHOD NAME				: TransactionsetDAO
     * @PARAMS					: Connection
     * @RETURNS					:
     * @THROWS				:
     * @LAST MODIFIED BY			: TCS
     * @LAST MODIFIED DATE		: 23/06/2005(DD/MM/YYYY)
     **/
    public TransactionsetDAO(Connection con) {
        this.con = con;

    }

    

    public TransactionsetVO findByPrimaryKey(String transactionsetId) throws
            Exception {
        
        PreparedStatement stmt = null;
        ResultSet resultSet = null;
        TransactionsetVO transactionsetVo = null;
        //final String findQuery = EDIQueryPool.getQueryForEdi("CMN_EDI_001");
        final String findQuery = "SELECT  TRANSACTIONSETID, TRANSACTIONNAME, NUMBEROFHEADERS, HEADERSEGMENTREFID, DATASEGMENTREFID, TRAILERSEGMENTREFID, FILENAMEREFID, SPLITCOUNT, FILELOCATION, BACKUPFILELOCATION, ERRORFILELOCATION, FTPPRIMARYFOLDERNAME, FTPSECONDARYFOLDERNAME, COMMUNICATIONMEDIUM, COMMUNICATIONTYPE, REMOTESERVERFLAG, FTPOREMAILADDRESS, FTPUSERNAME, FTPPASSWORD,CHARSET,NEWLINECHARCODE,BYCHARFLAG,DELIMITER FROM  TCMN_TRANSACTIONSET WHERE TRANSACTIONSETID = ?";

        try {
            stmt = con.prepareStatement(findQuery);
            stmt.setString(1, transactionsetId.trim());
            resultSet = stmt.executeQuery();
            if (resultSet.next()) {
                transactionsetVo = new TransactionsetVO();
                transactionsetVo.setTransactionsetid(
                        resultSet.getString("TRANSACTIONSETID"));
                transactionsetVo.setTransactionname(
                        resultSet.getString("TRANSACTIONNAME"));
                transactionsetVo.setNumberofheaders(
                        resultSet.getInt("NUMBEROFHEADERS"));
                transactionsetVo.setHeadersegmentrefid(
                        resultSet.getString("HEADERSEGMENTREFID"));
                transactionsetVo.setDatasegmentrefid(
                        resultSet.getString("DATASEGMENTREFID"));
                transactionsetVo.setTrailersegmentrefid(
                        resultSet.getString("TRAILERSEGMENTREFID"));
                transactionsetVo.setFilenamerefid(
                        resultSet.getString("FILENAMEREFID"));
                transactionsetVo.setSplitcount(resultSet.getInt("SPLITCOUNT"));
                transactionsetVo.setFilelocation(
                        resultSet.getString("FILELOCATION"));
                transactionsetVo.setBackupfilelocation(
                        resultSet.getString("BACKUPFILELOCATION"));
                transactionsetVo.setErrorfilelocation(
                        resultSet.getString("ERRORFILELOCATION"));
                transactionsetVo.setFtpprimaryfoldername(
                        resultSet.getString("FTPPRIMARYFOLDERNAME"));
                transactionsetVo.setFtpsecondaryfoldername(
                        resultSet.getString("FTPSECONDARYFOLDERNAME"));
                transactionsetVo.setCommunicationmedium(
                        resultSet.getString("COMMUNICATIONMEDIUM"));
                transactionsetVo.setCommunicationtype(
                        resultSet.getInt("COMMUNICATIONTYPE"));
                transactionsetVo.setRemoteserverflag(
                        resultSet.getInt("REMOTESERVERFLAG"));
                transactionsetVo.setFtporemailaddress(
                        resultSet.getString("FTPOREMAILADDRESS"));
                transactionsetVo.setFtpusername(
                        resultSet.getString("FTPUSERNAME"));
                transactionsetVo.setFtppassword(
                        resultSet.getString("FTPPASSWORD"));
                transactionsetVo.setCharSet(resultSet.getString("CHARSET"));
                transactionsetVo.setNewLineCharCode(
                        resultSet.getString("NEWLINECHARCODE"));
                transactionsetVo.setByChar(resultSet.getInt("BYCHARFLAG"));
                transactionsetVo.setDelimiter(resultSet.getString("DELIMITER"));

            }
        } catch (Exception e) {
            

        } finally {
        	resultSet.close();
        	resultSet=null;
        	stmt.close();
            stmt = null;
        }
        return transactionsetVo;
    }
}
