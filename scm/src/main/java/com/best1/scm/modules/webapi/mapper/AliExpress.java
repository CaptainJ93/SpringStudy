package com.best1.scm.modules.webapi.mapper;

import java.io.Serializable;

/**
 * 快递公司
 * 
 * @author jiashizhen
 *
 */

public class AliExpress implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1436826236009193434L;
	private Integer showapi_res_code; // showapi平台返回码,0为成功,其他为失败
	private String showapi_res_error; // showapi平台返回的错误信息
	private ShowapiResBody showapi_res_body; //返回数据
	
	public Integer getShowapi_res_code() {
		return showapi_res_code;
	}
	public void setShowapi_res_code(Integer showapi_res_code) {
		this.showapi_res_code = showapi_res_code;
	}
	public String getShowapi_res_error() {
		return showapi_res_error;
	}
	public void setShowapi_res_error(String showapi_res_error) {
		this.showapi_res_error = showapi_res_error;
	}
	public ShowapiResBody getShowapi_res_body() {
		return showapi_res_body;
	}
	public void setShowapi_res_body(ShowapiResBody showapi_res_body) {
		this.showapi_res_body = showapi_res_body;
	}
	@Override
	public String toString() {
		return "AliExpress [showapi_res_code=" + showapi_res_code
				+ ", showapi_res_error=" + showapi_res_error
				+ ", showapi_res_body=" + showapi_res_body + "]";
	}
	
}