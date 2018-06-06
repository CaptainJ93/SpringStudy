package com.best1.api.mapper.crm;

import com.best1.api.entity.crm.TcrmCustomeraccountdetails;
import com.best1.api.entity.crm.TcrmCustomeraccountdetailsExample;
import com.best1.api.mapper.SqlMapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
@SqlMapper
public interface TcrmCustomeraccountdetailsMapper {
 
    int countByExample(TcrmCustomeraccountdetailsExample example);

  
    int deleteByExample(TcrmCustomeraccountdetailsExample example);

    
    int deleteByPrimaryKey(Long accountnumber);

  
    int insert(TcrmCustomeraccountdetails record);

    
    int insertSelective(TcrmCustomeraccountdetails record);
 
    List<TcrmCustomeraccountdetails> selectByExample(TcrmCustomeraccountdetailsExample example);

     
    TcrmCustomeraccountdetails selectByPrimaryKey(Long accountnumber);

   
    int updateByExampleSelective(@Param("record") TcrmCustomeraccountdetails record, @Param("example") TcrmCustomeraccountdetailsExample example);
 
    int updateByExample(@Param("record") TcrmCustomeraccountdetails record, @Param("example") TcrmCustomeraccountdetailsExample example);
 
    int updateByPrimaryKeySelective(TcrmCustomeraccountdetails record);
 
    int updateByPrimaryKey(TcrmCustomeraccountdetails record);
}