package com.best1.scm.edi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.best1.scm.common.utils.DateUtils;



public class WMSEdi  {
	
	public static DateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");  

	protected String root="c:/bea/data_exchange";
	public long wareHouseId =1;
	public String transactionSetID="";
	public WMSEdi() throws  Exception{
		
		
	}
	
	
	private void formAndSendEDIFile(
			String transactionSetID,
			long wareHouseId,
			ArrayList ListdataList)
			throws Exception {
			try {
				EDIFile ediFile = new EDIFile(transactionSetID);
				HashMap fileMap = new HashMap();
				fileMap.put(
					"FIRSTNAME",
					new Long(wareHouseId).toString()
						+ "_"
						+ DateUtils.getDate("yyyyMMddHHmmss"));
				fileMap.put("LASTNAME", ".txt");
				ediFile.setFileNameDataMap(fileMap);
				ediFile.setBodyMapList(ListdataList);

				ediFile.generateEDIFileAndTransport(getConnection());
			} catch (Exception ex) {

				throw ex;
			} 
		}
	
	public String convertToString(long id) {
		//			new Long(id).intValue();
		return new Long(id).toString();
	}
	public static Connection getConnection() throws Exception{
		Connection result=null;
		String userId = "et1_china";
        String password = "et1_chinayezi";
        String databaseURL = "jdbc:oracle:thin:@192.168.43.151:1521:qaet1";
        Class.forName( "oracle.jdbc.OracleDriver" );

        result = DriverManager.getConnection( databaseURL, userId, password );
        result.setAutoCommit( false );
		return result;
	}



	protected void afterImp() throws Exception {
		// TODO Auto-generated method stub
		
	}



	protected boolean beforeImp() throws Exception {
		// TODO Auto-generated method stub
		return true;
	}



	protected Object convRow(String[] result) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}



	protected void impError(Throwable e) {
		// TODO Auto-generated method stub
		
	}



	protected void impRow(List list) throws Exception {
		// TODO Auto-generated method stub
		formAndSendEDIFile(transactionSetID, wareHouseId, (ArrayList)list);
	}
	
	protected void readConfig() throws Exception {
		// TODO Auto-generated method stub
		//super.readConfig();
		getTask();
	}
	
	protected void getTask() {
		// TODO Auto-generated method stub

	}
	
}
