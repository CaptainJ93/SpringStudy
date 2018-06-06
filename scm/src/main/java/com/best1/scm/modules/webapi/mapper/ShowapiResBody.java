package com.best1.scm.modules.webapi.mapper;

import com.best1.scm.modules.webapi.mapper.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ShowapiResBody implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -247337684920592067L;
	private String mailNo;
	private String update;
	private Date updateStr;
	private Integer ret_code;
	private boolean flag;
	private Integer status;
	private String tel;
	private String expSpellName;
	private List<Data> data;
	private String msg;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMailNo() {
		return mailNo;
	}
	public void setMailNo(String mailNo) {
		this.mailNo = mailNo;
	}
	public String getUpdate() {
		return update;
	}
	public void setUpdate(String update) {
		this.update = update;
	}
	public Date getUpdateStr() {
		return updateStr;
	}
	public void setUpdateStr(Date updateStr) {
		this.updateStr = updateStr;
	}
	public Integer getRet_code() {
		return ret_code;
	}
	public void setRet_code(Integer ret_code) {
		this.ret_code = ret_code;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getExpSpellName() {
		return expSpellName;
	}
	public void setExpSpellName(String expSpellName) {
		this.expSpellName = expSpellName;
	}
	public List<Data> getData() {
		return data;
	}
	public void setData(List<Data> data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "ShowapiResBody [mailNo=" + mailNo + ", update=" + update
				+ ", updateStr=" + updateStr + ", ret_code=" + ret_code
				+ ", flag=" + flag + ", status=" + status + ", tel=" + tel
				+ ", expSpellName=" + expSpellName + ", data=" + data + "]";
	}
	
}
