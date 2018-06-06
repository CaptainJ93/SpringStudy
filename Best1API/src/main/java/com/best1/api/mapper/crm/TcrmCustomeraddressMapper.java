package com.best1.api.mapper.crm;



import com.best1.api.entity.crm.TcrmCustomeraddressExample;
import com.best1.api.mapper.SqlMapper;
import com.best1.api.entity.crm.TcrmCustomeraddress;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
/**
 *  
 * This method corresponds to the database table TCRM_CUSTOMERADDRESS


 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * 
 *
 */
@SqlMapper
public interface TcrmCustomeraddressMapper {
 

	Long fetchAddressId();
	Long insertSelective(TcrmCustomeraddress record);
    List<TcrmCustomeraddress> selectByCustomer(TcrmCustomeraddress record);
    TcrmCustomeraddress selectByPrimaryKey(Long addressid);
    void  fetchAddressByCustomer(Map<String,Object> param);
    void  createTempCustomerAddress(Map<String,Object> param);
    void  updateTempCustomerAddress(Map<String,Object> param);
    void  createCustomerAddress(Map<String,Object> param);
    void  modifyCustomerAddress(Map<String,Object> param);
    void  modifyAddressExtraInfo(Map<String,Object> param);
    void  isExistAddress(Map<String,Object> param);
	
     
    int updateByExampleSelective(@Param("record") TcrmCustomeraddress record, @Param("example") TcrmCustomeraddressExample example);

    int updateByPrimaryKeySelective(TcrmCustomeraddress record);
    
    int countByExample(TcrmCustomeraddressExample example);


    
}