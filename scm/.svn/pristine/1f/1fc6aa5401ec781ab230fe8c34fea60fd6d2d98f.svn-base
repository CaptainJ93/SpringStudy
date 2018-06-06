/*************************************************************************
 *
 * Copyright (C) 2004
 * Eastern Home Shopping Network
 * All Rights Reserved
 *
 * File: DatasegmentDAO.java
 *
 *************************************************************************
 * Date	          Name                         Description
 * 28/12/2004     TCS-147446             		Created
 *************************************************************************/
package com.best1.scm.edi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;



/**
  * 	@CLASS NAME               : 	DatasegmentDAO
  *		@TYPE                     :     DAO Class 
  * 	@AUTHOR                   :     TCS
  * 	@VERSION                  : 	1.0
  * 	@EXTENDS                  : 		

  * 	@TABLES REFERRED          : 	TCMN_DATASEGMENT 
  * 	@LAST MODIFIED BY         :		TCS
  * 	@LAST MODIFIED DATE       :		23/06/2005
  **/
/**			Data access class for TCMN_DATASEGMENT	 

*/
public class DatasegmentDAO {
	private Connection con = null;
	/**
	 constructor
	* @METHOD NAME				: DatasegmentDAO
	* @PARAMS					: Connection
	* @RETURNS					: 
	* @THROWS				:  
	* @LAST MODIFIED BY			: TCS
	* @LAST MODIFIED DATE		: 23/06/2005(DD/MM/YYYY)
	**/
	public DatasegmentDAO(Connection con) {
		this.con = con;
	}
	/**
	 This method returns an ArrayList of DatasegemntVOs for given segment Id
	* @METHOD NAME				: findByPrimaryKey
	* @PARAMS					: String segmentId
	* @RETURNS					: ArrayList
	* @THROWS				: EHSNBatchException 
	* @LAST MODIFIED BY			: TCS
	* @LAST MODIFIED DATE		: 23/06/2005(DD/MM/YYYY)
	**/
	public ArrayList findByPrimaryKey(String segmentId)
		throws Exception {
		PreparedStatement stmt = null;
		ResultSet resultSet = null;
		ArrayList resultDatasegmentVOList = new ArrayList();
		//final String findQuery = EDIQueryPool.getQueryForEdi("CMN_EDI_002");
		final String findQuery = "SELECT  SEGMENTID, SEQUENCENUMBER, ATTRIBUTENAME, STARTLOCATION, ENDLOCATION, DEFAULTVALUE, ALIGNMENT, PADCHAR, OPTIONALFLAG, DATATYPE, DATEFORMAT FROM TCMN_DATASEGMENT WHERE SEGMENTID=? ORDER BY SEQUENCENUMBER";
		//EHSNEDIConstants.DATASEGMENTDAO_SELECT_QUERY;
		try {
			stmt = con.prepareStatement(findQuery);
			stmt.setString(1, segmentId);

			resultSet = stmt.executeQuery();
			while (resultSet.next()) {

				DatasegmentVO datasegmentVo = new DatasegmentVO();
				datasegmentVo.setSegmentid(resultSet.getString("SEGMENTID"));
				datasegmentVo.setSequencenumber(
					resultSet.getInt("SEQUENCENUMBER"));
				datasegmentVo.setAttributename(
					resultSet.getString("ATTRIBUTENAME"));
				datasegmentVo.setStartlocation(
					resultSet.getInt("STARTLOCATION"));
				datasegmentVo.setEndlocation(resultSet.getInt("ENDLOCATION"));
				datasegmentVo.setDefaultvalue(
					resultSet.getString("DEFAULTVALUE"));
				datasegmentVo.setAlignment(resultSet.getString("ALIGNMENT"));
				datasegmentVo.setPadchar(resultSet.getString("PADCHAR"));
				datasegmentVo.setOptionalFlag(resultSet.getInt("OPTIONALFLAG"));
				datasegmentVo.setDatatype(resultSet.getString("DATATYPE"));
				datasegmentVo.setDateformat(resultSet.getString("DATEFORMAT"));

				resultDatasegmentVOList.add(datasegmentVo);
			}
		} catch (Exception e) {
			throw e;

		} finally {
			resultSet.close();
        	resultSet=null;
        	stmt.close();
            stmt = null;
		}
		return resultDatasegmentVOList;

	}

}
