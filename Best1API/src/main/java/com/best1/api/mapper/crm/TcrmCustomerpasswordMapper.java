package com.best1.api.mapper.crm;

import com.best1.api.entity.crm.TcrmCustomerpasswordExample;
import com.best1.api.entity.crm.TcrmCustomerpassword;
import com.best1.api.entity.crm.TcrmCustomerpasswordKey;
import com.best1.api.mapper.SqlMapper;

import java.util.List;

@SqlMapper
public interface TcrmCustomerpasswordMapper {



	int insertSelective(TcrmCustomerpassword record) ;

	
	List<TcrmCustomerpassword> selectByExample(
			TcrmCustomerpasswordExample example) ;

	
	TcrmCustomerpassword selectByPrimaryKey(TcrmCustomerpasswordKey key) ;
	int deleteByPrimaryKey(TcrmCustomerpasswordKey key);

	int updateByPrimaryKeySelective(TcrmCustomerpassword record) ;

}