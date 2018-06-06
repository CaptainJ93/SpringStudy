/*************************************************************************
 *
 * Copyright (C) 2005
 * Eastern Home Shopping Network
 * All Rights Reserved
 *
 * File: EDIErrorVO.java
 *
 *************************************************************************
 * Date	          Name                         Description
 * 15/03/2005     TCS-147446             		Created
 *************************************************************************/
package com.best1.scm.edi;

import java.io.Serializable;
/**
* 	@CLASS NAME               : 	EDIErrorVO
*	@TYPE                     :     VO 
* 	@AUTHOR                   :     TCS
* 	@VERSION                  : 	1.0
* 	@EXTENDS                  : 	

* 	@LAST MODIFIED BY         :		TCS-147446
* 	@LAST MODIFIED DATE       :		23/06/2005 
**/
/**			This is a VO that holds the information reg EDI errors.

*/
public class EDIErrorVO implements Serializable{
	private String recordErrorIdentifier;
	private String errorCode;
	
	/**
	 * @return
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @return
	 */
	public String getRecordErrorIdentifier() {
		return recordErrorIdentifier;
	}

	/**
	 * @param string
	 */
	public void setErrorCode(String string) {
		errorCode = string;
	}

	/**
	 * @param string
	 */
	public void setRecordErrorIdentifier(String string) {
		recordErrorIdentifier = string;
	}

}
