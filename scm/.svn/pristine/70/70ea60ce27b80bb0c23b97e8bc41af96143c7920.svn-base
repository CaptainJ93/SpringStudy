/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.vws.entity;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import com.best1.scm.common.persistence.DataEntity;

/**
 * scm_carrierapirelationEntity
 * @author jsz
 * @version 2017-04-12
 */
public class ScmCarrierapirelation extends DataEntity<ScmCarrierapirelation> {
	
	private static final long serialVersionUID = 1L;
	private Long relationid;		// relationid
	private Long carrierid;		// carrierid
	private String carriername;		// carriername
	private String apicode;		// apicode
	
	public ScmCarrierapirelation() {
		super();
	}

	public ScmCarrierapirelation(String id){
		super(id);
	}

	@NotNull(message="relationid不能为空")
	public Long getRelationid() {
		return relationid;
	}

	public void setRelationid(Long relationid) {
		this.relationid = relationid;
	}
	
	@NotNull(message="carrierid不能为空")
	public Long getCarrierid() {
		return carrierid;
	}

	public void setCarrierid(Long carrierid) {
		this.carrierid = carrierid;
	}
	
	@Length(min=1, max=100, message="carriername长度必须介于 1 和 100 之间")
	public String getCarriername() {
		return carriername;
	}

	public void setCarriername(String carriername) {
		this.carriername = carriername;
	}
	
	@Length(min=1, max=10, message="apicode长度必须介于 1 和 10 之间")
	public String getApicode() {
		return apicode;
	}

	public void setApicode(String apicode) {
		this.apicode = apicode;
	}
	
}