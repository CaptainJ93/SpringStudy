package com.best1.api.mapper.crm;

import com.best1.api.entity.crm.TcrmCustomerreceive;
import com.best1.api.entity.crm.TcrmCustomerreceiveExample;
import com.best1.api.mapper.SqlMapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

@SqlMapper
public interface TcrmCustomerreceiveMapper {
 
    int countByExample(TcrmCustomerreceiveExample example);


    int deleteByExample(TcrmCustomerreceiveExample example);

 
    int deleteByPrimaryKey(Long receiveid);

  
    int insertSelective(TcrmCustomerreceive record);

  
    List<TcrmCustomerreceive> selectByExample(TcrmCustomerreceiveExample example);

    
    TcrmCustomerreceive selectByPrimaryKey(Long receiveid);

  
    int updateByExampleSelective(@Param("record") TcrmCustomerreceive record, @Param("example") TcrmCustomerreceiveExample example);

    int updateByPrimaryKeySelective(TcrmCustomerreceive record);

}