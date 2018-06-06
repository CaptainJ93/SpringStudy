package com.best1.api.mapper.oaf.order;

import com.best1.api.entity.oaf.order.ToafEorderinvoiceinfo;
import com.best1.api.entity.oaf.order.ToafEorderinvoiceinfoExample;
import com.best1.api.mapper.SqlMapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

@SqlMapper
public interface ToafEorderinvoiceinfoMapper {
 
    int countByExample(ToafEorderinvoiceinfoExample example);

  
    int deleteByExample(ToafEorderinvoiceinfoExample example);

  
    int deleteByPrimaryKey(Long einvoiceinfoid);

   
    int insert(ToafEorderinvoiceinfo record);

  
    int insertSelective(ToafEorderinvoiceinfo record);

   
    List<ToafEorderinvoiceinfo> selectByExample(ToafEorderinvoiceinfoExample example);

  
    ToafEorderinvoiceinfo selectByPrimaryKey(Long einvoiceinfoid);

   
    int updateByExampleSelective(@Param("record") ToafEorderinvoiceinfo record, @Param("example") ToafEorderinvoiceinfoExample example);

  
    int updateByExample(@Param("record") ToafEorderinvoiceinfo record, @Param("example") ToafEorderinvoiceinfoExample example);

    
    int updateByPrimaryKeySelective(ToafEorderinvoiceinfo record);

    ToafEorderinvoiceinfo selectByInvoiceinfoId(Long invoiceinfoid);
	
    
    int updateByPrimaryKey(ToafEorderinvoiceinfo record);
}