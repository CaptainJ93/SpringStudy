package com.best1.api.mapper.oaf.order;

import java.util.List;

import com.best1.api.entity.oaf.order.CustomerOrderinvoiceinfo;
import com.best1.api.entity.oaf.order.ToafOrderinvoiceinfo;
import com.best1.api.entity.oaf.order.ToafOrderinvoiceinfoExample;
import com.best1.api.mapper.SqlMapper;

@SqlMapper
public interface ToafOrderinvoiceinfoMapper {

	public List<ToafOrderinvoiceinfo> selectByExample(ToafOrderinvoiceinfoExample example);

	public ToafOrderinvoiceinfo selectByPrimaryKey(Long invoiceinfoid);
	
	public  int updateByPrimaryKeySelective(ToafOrderinvoiceinfo record);
	
	public List<CustomerOrderinvoiceinfo> selectCustomerOrderinvoiceinfo(CustomerOrderinvoiceinfo record);

	public List<CustomerOrderinvoiceinfo> selectCustomerReturninvoiceinfo(CustomerOrderinvoiceinfo record);

	
	public List<CustomerOrderinvoiceinfo> selectCustomerEinvoiceinfo(CustomerOrderinvoiceinfo record);

	
	public  int updateInvoicenoByOrderSelective(ToafOrderinvoiceinfo record);
	

	public  int countInvoicenoByOrderSelective(ToafOrderinvoiceinfo record);


}
