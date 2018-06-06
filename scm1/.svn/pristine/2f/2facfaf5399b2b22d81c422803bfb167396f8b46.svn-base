package com.best1.scm.modules.outinterface.entity;

import com.best1.scm.common.persistence.DataEntity;
/**
 * 存放接口的用户信息表
 * @author zhangzujie
 *
 */
public class UserInfo extends DataEntity<UserInfo> {
	
	private int code; //区别同样接口不同公司的健值
	private String username; //用户名
	private String validatecode;//经过加密的验证码
	private int type;//不同的账号类型
	private int userid; //用户编号，新增数据时赋予，接口用户唯一标识
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getValidatecode() {
		return validatecode;
	}
	public void setValidatecode(String validatecode) {
		this.validatecode = validatecode;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}

}
