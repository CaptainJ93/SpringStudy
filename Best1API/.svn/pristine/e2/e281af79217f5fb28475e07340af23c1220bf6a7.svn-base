package com.best1.api.mapper.crm;

import com.best1.api.entity.crm.TcrmCustomerbaseaddress;
import com.best1.api.entity.crm.TcrmCustomerbaseaddressExample;
import com.best1.api.mapper.SqlMapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

@SqlMapper
public interface TcrmCustomerbaseaddressMapper {
  
 
    int deleteByPrimaryKey(Long addressid);

   
    int insertSelective(TcrmCustomerbaseaddress record);

    List<TcrmCustomerbaseaddress> selectByExample(TcrmCustomerbaseaddressExample example);

    TcrmCustomerbaseaddress selectByPrimaryKey(Long addressid);


    int updateByPrimaryKeySelective(TcrmCustomerbaseaddress record);

    
    int updateByExampleSelective(@Param("record") TcrmCustomerbaseaddress record, @Param("example") TcrmCustomerbaseaddressExample example);

}