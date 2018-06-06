package com.best1.api.mapper.oaf.order;


import com.best1.api.entity.oaf.order.ToafOrderpayment;
import com.best1.api.entity.oaf.order.ToafOrderpaymentExample;
import com.best1.api.mapper.SqlMapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

@SqlMapper
public interface ToafOrderpaymentMapper {
  
    int countByOrderPayment(ToafOrderpayment orderpayment);
    
    Double sumByExample(ToafOrderpayment orderpayment);
 
    ToafOrderpayment selectByPrimaryKey(Long paymentid);

    
    
    int countByExample(ToafOrderpaymentExample example);

    int insert(ToafOrderpayment record);

    int insertSelective(ToafOrderpayment record);

   
   List<ToafOrderpayment> selectByExample(ToafOrderpaymentExample example);

   
    int updateByExampleSelective(@Param("record") ToafOrderpayment record, @Param("example") ToafOrderpaymentExample example);


    
    int updateByPrimaryKeySelective(ToafOrderpayment record);


   
}