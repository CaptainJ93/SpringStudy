/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.delivery.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.best1.scm.common.persistence.DataEntity;

/**
 * 配送包裹客诉处理detailEntity
 * @author admin
 * @version 2016-12-22
 */
public class ScmComplaintDetail extends DataEntity<ScmComplaintDetail> {
	
	private static final long serialVersionUID = 1L;
	private Integer cpid;		// 客诉编号
	private String cphandleddesc;		// 客诉处理内容
	private Integer cphandledseq;		// 客诉处理序号
	private Date recordcreatedtime;		// 创建时间
	private String recordcreatedby;		// 创建人
	private String lastupdatedby;		// 修改人
	private Date lastupdatedtime;		// 修改时间
	private String createname;
	
	public ScmComplaintDetail() {
		super();
	}

	public ScmComplaintDetail(String id){
		super(id);
	}

	public String getCreatename(){
		return createname;
	}
	
	public void setCreatename(String createname){
		this.createname=createname;
	}
	
	public Integer getCpid() {
		return cpid;
	}

	public void setCpid(Integer cpid) {
		this.cpid = cpid;
	}
	
	@Length(min=0, max=500, message="客诉处理内容长度必须介于 0 和 500 之间")
	public String getCphandleddesc() {
		return cphandleddesc;
	}

	public void setCphandleddesc(String cphandleddesc) {
		this.cphandleddesc = cphandleddesc;
	}
	
	public Integer getCphandledseq() {
		return cphandledseq;
	}

	public void setCphandledseq(Integer cphandledseq) {
		this.cphandledseq = cphandledseq;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getRecordcreatedtime() {
		return recordcreatedtime;
	}

	public void setRecordcreatedtime(Date recordcreatedtime) {
		this.recordcreatedtime = recordcreatedtime;
	}
	
	public String getRecordcreatedby() {
		return recordcreatedby;
	}

	public void setRecordcreatedby(String recordcreatedby) {
		this.recordcreatedby = recordcreatedby;
	}
	
	public String getLastupdatedby() {
		return lastupdatedby;
	}

	public void setLastupdatedby(String lastupdatedby) {
		this.lastupdatedby = lastupdatedby;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getLastupdatedtime() {
		return lastupdatedtime;
	}

	public void setLastupdatedtime(Date lastupdatedtime) {
		this.lastupdatedtime = lastupdatedtime;
	}
	
}