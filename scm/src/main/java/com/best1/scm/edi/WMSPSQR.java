package com.best1.scm.edi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class WMSPSQR extends WMSEdi {
	
	public WMSPSQR() throws  Exception {
		super();
		// TODO Auto-generated constructor stub
		this.wareHouseId=1;
		this.transactionSetID="SCM_7715";
		
	}
	
	/**
	 * return: List<OverheadcostDetailVO>
	 */
	protected Object convRow(Map map) throws Exception {
		
		
		
		
		
		getorder(map);
		
		return formHashMapFromVO((HashMap)map);
	}
	
	
	
	
	private void getorder(Map<String, String> map) throws Exception{
		Connection con = getConnection();
		
		
		PreparedStatement psmt = con.prepareStatement("select 	       '888888' as DISPATCHERID,	       ' ' as CUSTOMERID,	       cso.shiporderid as SHIPORDERID,	       cso.sequenceno as sequenceno,	       cso.deliveryorderid as DELIVERYORDERNO,	       cd2.receivername as RECEIVERNAME,	       '001' as NUMBEROFCARTONS	  from tscm_customershiporder cso, TCRM_CUSTOMERADDRESS cd,toaf_addressextrainfo cd2	 where cso.shiporderid = ?	   and cso.sequenceno = ?	   and cso.deliveryaddressid = cd.addressid	   and cd.addressid = cd2.addressid");
		psmt.setLong(1, Long.parseLong(map.get("SHIPORDERID")));
		psmt.setLong(2, Long.parseLong(map.get("SHIPORDERSQ")));
		ResultSet rs = psmt.executeQuery();
		
		
		if(rs.next()){
			ResultSetMetaData rsmd = rs.getMetaData();
			 for (int i = 1; i <= rsmd.getColumnCount(); i++) {
				 map.put(rsmd.getColumnName(i), rs.getString(i));
			 }
			
		}
		
		con.close();
	}
	
	
	private HashMap formHashMapFromVO( HashMap fileDataHM)
	throws Exception {


		return fileDataHM;

	}
	
	
	
	
	public static void main(String[] args) throws  Exception {
		WMSPSQR aWMSCHQR =new WMSPSQR();
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("SHIPORDERNO", "1653169_01");
		map.put("SHIPORDERID", "1653169");
		map.put("SHIPORDERSQ", "1");
		map.put("DELIVERYDATE", "2016/03/24");
		map.put("DELIVERYORDERNO", "123456789");
		map.put("DELIVERYSTATUS", "1");
		map.put("DELIVERYSTATUSDESCRIPTION", "配送成功");
		//map.put("BLANK", " ");
		List list = new ArrayList();
		list.add(aWMSCHQR.convRow(map));
		aWMSCHQR.impRow(list);
	}
	
	

}
