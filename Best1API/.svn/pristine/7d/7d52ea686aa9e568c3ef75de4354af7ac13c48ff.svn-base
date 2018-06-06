package com.best1.api.mapper.crm;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.best1.api.entity.crm.TcrmCustomeraccountbalance;
import com.best1.api.entity.crm.TcrmCustomeraccountbalanceExample;
import com.best1.api.entity.crm.TcrmCustomeraccountbalanceKey;
import com.best1.api.mapper.SqlMapper;
@SqlMapper
public interface TcrmCustomeraccountbalanceMapper {
 
    int countByExample(TcrmCustomeraccountbalanceExample example);


    double sumByPrimaryKey(TcrmCustomeraccountbalanceKey key);

    int insertSelective(TcrmCustomeraccountbalance record);

    List<TcrmCustomeraccountbalance> selectByExample(TcrmCustomeraccountbalanceExample example);


    TcrmCustomeraccountbalance selectByPrimaryKey(TcrmCustomeraccountbalanceKey key);

  
    int updateByExampleSelective(@Param("record") TcrmCustomeraccountbalance record, @Param("example") TcrmCustomeraccountbalanceExample example);

    int updateByPrimaryKeySelective(TcrmCustomeraccountbalance record);

}