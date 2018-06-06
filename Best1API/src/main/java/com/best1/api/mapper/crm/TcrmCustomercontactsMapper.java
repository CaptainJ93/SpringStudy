package com.best1.api.mapper.crm;

import com.best1.api.entity.crm.TcrmCustomercontacts;
import com.best1.api.entity.crm.TcrmCustomercontactsExample;
import com.best1.api.mapper.SqlMapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
 
@SqlMapper
public interface TcrmCustomercontactsMapper {
 
    int countByExample(TcrmCustomercontactsExample example);


    int deleteByPrimaryKey(Long customercontactsid);

 
    int insertSelective(TcrmCustomercontacts record);

  
    List<TcrmCustomercontacts> selectByExample(TcrmCustomercontactsExample example);

    TcrmCustomercontacts selectByPrimaryKey(Long customercontactsid);

  
    int updateByPrimaryKeySelective(TcrmCustomercontacts record);
    
    int updateByExampleSelective(@Param("record") TcrmCustomercontacts record, @Param("example") TcrmCustomercontactsExample example);

 
}