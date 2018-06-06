/*************************************************************************
 *
 * Copyright (C) 2004
 * Eastern Home Shopping Network
 * All Rights Reserved
 *
 * File: DatasegmentVO.java
 *
 *************************************************************************
 * Date	          Name                         Description
 * 28/12/2004     TCS-147446             		Created
 *************************************************************************/
package com.best1.scm.edi;

import java.io.Serializable;
/**
* 	@CLASS NAME               : 	DatasegmentVO
*	@TYPE                     :     VO 
* 	@AUTHOR                   :     TCS
* 	@VERSION                  : 	1.0
* 	@EXTENDS                  : 	

* 	@LAST MODIFIED BY         :		TCS-147446
* 	@LAST MODIFIED DATE       :		23/06/2005 
**/
/**			This is a VO that holds the information reg DataSegment of an EDI file

*/
public class DatasegmentVO implements Serializable {
	private java.lang.String segmentid;
	private int sequencenumber;
	private java.lang.String attributename;
	private int startlocation;
	private int endlocation;
	private java.lang.String defaultvalue;
	private java.lang.String alignment;
	private java.lang.String padchar;
	private int optionalFlag;
	private java.lang.String datatype;
	private java.lang.String dateformat;

	public void setSegmentid(java.lang.String pSegmentid) {
		segmentid = pSegmentid;
	}

	public java.lang.String getSegmentid() {
		return segmentid;
	}

	public void setSequencenumber(int pSequencenumber) {
		sequencenumber = pSequencenumber;
	}

	public int getSequencenumber() {
		return sequencenumber;
	}

	public void setAttributename(java.lang.String pAttributename) {
		attributename = pAttributename;
	}

	public java.lang.String getAttributename() {
		return attributename;
	}

	public void setStartlocation(int pStartlocation) {
		startlocation = pStartlocation;
	}

	public int getStartlocation() {
		return startlocation;
	}

	public void setEndlocation(int pEndlocation) {
		endlocation = pEndlocation;
	}

	public int getEndlocation() {
		return endlocation;
	}

	public void setDefaultvalue(java.lang.String pDefaultvalue) {
		defaultvalue = pDefaultvalue;
	}

	public java.lang.String getDefaultvalue() {
		return defaultvalue;
	}

	public void setAlignment(java.lang.String pAlignment) {
		alignment = pAlignment;
	}

	public java.lang.String getAlignment() {
		return alignment;
	}

	public void setPadchar(java.lang.String pPadchar) {
		padchar = pPadchar;
	}

	public java.lang.String getPadchar() {
		return padchar;
	}

	public void setDatatype(java.lang.String pDatatype) {
		datatype = pDatatype;
	}

	public java.lang.String getDatatype() {
		return datatype;
	}

	public void setDateformat(java.lang.String pDateformat) {
		dateformat = pDateformat;
	}

	public java.lang.String getDateformat() {
		return dateformat;
	}

	public String toString() {
		return "DatasegmentVO["
			+ "segmentid="
			+ segmentid
			+ '	'
			+ "sequencenumber="
			+ sequencenumber
			+ '	'
			+ "attributename="
			+ attributename
			+ '	'
			+ "startlocation="
			+ startlocation
			+ '	'
			+ "endlocation="
			+ endlocation
			+ '	'
			+ "defaultvalue="
			+ defaultvalue
			+ '	'
			+ "alignment="
			+ alignment
			+ '	'
			+ "padchar="
			+ padchar
			+ '	'
			+ "optionalFlag="
			+ optionalFlag
			+ '	'
			+ "datatype="
			+ datatype
			+ '	'
			+ "dateformat="
			+ dateformat
			+ '	'
			+ "]";
	}
	/**
	 * @return
	 */
	public int getOptionalFlag() {
		return optionalFlag;
	}

	/**
	 * @param i
	 */
	public void setOptionalFlag(int i) {
		optionalFlag = i;
	}

}
