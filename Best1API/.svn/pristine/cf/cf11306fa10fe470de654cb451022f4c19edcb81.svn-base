package com.best1.api.mapper.crm;

import com.best1.api.entity.crm.TcrmCusttransactiondetails;
import com.best1.api.entity.crm.TcrmCusttransactiondetailsExample;
import com.best1.api.mapper.SqlMapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

@SqlMapper
public interface TcrmCusttransactiondetailsMapper {
  
    int countByExample(TcrmCusttransactiondetailsExample example);

    
    int deleteByExample(TcrmCusttransactiondetailsExample example);

  
    int deleteByPrimaryKey(Long transactionid);

   
    int insert(TcrmCusttransactiondetails record);

  
    int insertSelective(TcrmCusttransactiondetails record);

  
    List<TcrmCusttransactiondetails> selectByExample(TcrmCusttransactiondetailsExample example);

    
    TcrmCusttransactiondetails selectByPrimaryKey(Long transactionid);

 
    int updateByExampleSelective(@Param("record") TcrmCusttransactiondetails record, @Param("example") TcrmCusttransactiondetailsExample example);

   
    int updateByExample(@Param("record") TcrmCusttransactiondetails record, @Param("example") TcrmCusttransactiondetailsExample example);

  
    int updateByPrimaryKeySelective(TcrmCusttransactiondetails record);

    int updateByPrimaryKey(TcrmCusttransactiondetails record);
}