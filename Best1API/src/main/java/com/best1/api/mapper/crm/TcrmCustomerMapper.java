package com.best1.api.mapper.crm;

import com.best1.api.entity.crm.TcrmCustomer;
import com.best1.api.entity.crm.TcrmCustomerEleccoupons;
import com.best1.api.entity.crm.TcrmCustomerNetwork;
import com.best1.api.entity.crm.TcrmLotterybonus;
import com.best1.api.mapper.SqlMapper;

import java.util.List;
import java.util.Map;


/**
 * 
 * This method corresponds to the database table TCRM_CUSTOMER
 *

 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * 
 *
 */
@SqlMapper
public interface TcrmCustomerMapper {
  
    Long fetchMemberShipLevelId();
    Long fetchCustomerId();
    Long insert(TcrmCustomer record) ;
    TcrmCustomer selectByPrimaryKey(Long customerid);
    int updateByPrimaryKey(TcrmCustomer record);
    void createTempCustomer(Map<String,Object> param);
    void createCustomer(Map<String,Object> param);
    
    void modifyCustomer(Map<String,Object> param);

    void  rollbacknewCustomer(Map<String,Object> param);
    Long  selectByPersonAndType(Map<String,Object> param);
    void  selectByCustomerAccountBalance(Map<String,Object> param);
    void  selectByCustomerLotteryBonus(Map<String,Object> param);
   
    void  selectByCustomerAndAddress(Map<String,Object> param);
    void  selectCustomerAndAddressById(Map<String,Object> param);
    
    /**可用积分**/
    Double  countByCustomerLotteryBonusvalid(Long customerid);
    
    /**积分明细**/
    List<TcrmLotterybonus>  customerLotteryBonusvalid(Long customerid);
    /**有效订单数理及金额**/
    void  customerAvaiamount(Map<String,Object> param);
    /**验证会员卡*/
    void  checkCustomerCard(Map<String,Object> param);
    /**会员卡并冲值*/
    void  updCustomerBalance(Map<String,Object> param);
    
    
    /**电子折价号**/
    List<TcrmCustomerEleccoupons>  customerEleccoupons(TcrmCustomerEleccoupons record);
    
    /***PAYMENT_COD是否支付COD*/
	 void  customerPaymentCod(Map<String,Object> param);
    
	 /***Send SMS*/
	 void  sendCustomerSms(Map<String,Object> param);
	 
	
    
	 int updateByPrimaryKeySelective(TcrmCustomer record);
	 
	 int insertCustomernetwork(TcrmCustomerNetwork record) ;
	 
	 int updateCustomernetwork(TcrmCustomerNetwork record);
	 
	 List<TcrmCustomerNetwork>  selectCustomerNetwork(TcrmCustomerNetwork record);
	    
	 List<TcrmCustomer>   selectCustomerVIP(TcrmCustomer record);
    
}