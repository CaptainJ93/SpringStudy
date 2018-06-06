package com.best1.api.webservice.soap.response.dto.crm;

import com.best1.api.webservice.soap.response.dto.BasicDTO;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL) 
public class CustomerVipDTO extends BasicDTO{

	private Long customerid;

	  
    private String password;

   
    private Long receptionid;
    

    private String userloginid;
    
    private Integer viptype;
    
    private Integer flag;
    


   	public Integer getFlag() {
		return flag;
	}


	public void setFlag(Integer flag) {
		this.flag = flag;
	}


	public Integer getViptype() {
   		return viptype;
   	}


   	public void setViptype(Integer viptype) {
   		this.viptype = viptype;
   	}


	public String getUserloginid() {
		return userloginid;
	}


	public void setUserloginid(String userloginid) {
		this.userloginid = userloginid;
	}


	public Long getCustomerid() {
		return customerid;
	}


	public void setCustomerid(Long customerid) {
		this.customerid = customerid;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Long getReceptionid() {
		return receptionid;
	}


	public void setReceptionid(Long receptionid) {
		this.receptionid = receptionid;
	}


	
}
