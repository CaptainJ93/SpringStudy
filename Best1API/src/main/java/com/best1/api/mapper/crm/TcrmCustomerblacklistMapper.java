package com.best1.api.mapper.crm;

import com.best1.api.entity.crm.TcrmCustomerblacklist;
import com.best1.api.entity.crm.TcrmCustomerblacklistExample;
import com.best1.api.mapper.SqlMapper;

import java.util.List;

@SqlMapper
public interface TcrmCustomerblacklistMapper {
    int insertSelective(TcrmCustomerblacklist record);

    List<TcrmCustomerblacklist> selectByExample(TcrmCustomerblacklistExample example);
 
    TcrmCustomerblacklist selectByPrimaryKey(String contactnumber);

    int updateByPrimaryKeySelective(TcrmCustomerblacklist record);

   
}