package com.best1.api.service.crm;

import java.util.List;

import com.best1.api.entity.crm.CustomerAccountBalance;
import com.best1.api.entity.crm.TcrmCustomer;
import com.best1.api.entity.crm.TcrmCustomeraccountbalance;
import com.best1.api.entity.crm.TcrmCustomerEleccoupons;
import com.best1.api.entity.crm.TcrmCustomeraddress;
import com.best1.api.entity.crm.TcrmCustomerNetwork;
import com.best1.api.entity.crm.TcrmCusttransactiondetails;
import com.best1.api.entity.crm.TcrmLotterybonus;
import com.best1.api.webservice.soap.response.dto.crm.CallworkcodeDTO;
import com.best1.api.webservice.soap.response.dto.crm.ContacthistoryDTO;
import com.best1.api.webservice.soap.response.dto.crm.CustomerAccountBalanceDTO;
import com.best1.api.webservice.soap.response.dto.crm.CustomerAddressDTO;
import com.best1.api.webservice.soap.response.dto.crm.CustomerBlacklistDTO;
import com.best1.api.webservice.soap.response.dto.crm.CustomerDTO;
import com.best1.api.webservice.soap.response.dto.crm.CustomerVipDTO;
import com.best1.api.webservice.soap.response.dto.crm.CustomercontactsDTO;
import com.best1.api.webservice.soap.response.dto.crm.CustomermessageDTO;

public interface CustomerManageService {

	/**
	 * 新增客户信息temp表
	 * **/
public int saveTempCustomer(TcrmCustomer customer,TcrmCustomeraddress address);

/**
 * 创建客户信息
 * **/
public int createCustomer(TcrmCustomer customer);
/**
 * 修改客户信息(停用)
 * **/
public int updateCustomer(TcrmCustomer customer);

/**
 * 修改客户信息(停用)
 * **/
public int stopModifyCustomer(TcrmCustomer customer);

public TcrmCustomer  queryCustomer(TcrmCustomer customer);

public Long fetchCustomerId();
public Long fetchAddressId();
/**
 * 作废用户
 * **/
public int cancellationCustomer(TcrmCustomer customer);

/**
 * 新增客户地temp表
 * **/
public int createTempCustomerAddress(TcrmCustomeraddress address);
/**
 * 新增客户地址
 * **/

public int createCustomerAddress(TcrmCustomeraddress address);

/**
 * 
 * 修改客户地址
 * 
 * **/
public int modifyCustomerAddress(TcrmCustomeraddress address);

/**
 * 
 * 修改基本联络地址信息
 * 
 * **/
public  CustomerAddressDTO modifyCustomerAddress(CustomerAddressDTO dto);
/**
 * 修改客户信息
 * 
 * **/

public CustomerDTO modifyCustomer(CustomerDTO dto);


/**
 * 根据用户证件ID与类型查询
 * **/
public Long customerByPersonAndType(TcrmCustomer customer);

/**
 * 根据客代，返回地址信息
 * **/
public List<TcrmCustomeraddress> selectAddressByExample(TcrmCustomeraddress address);
/**
 * 根据客代，邮编，地址二，返回地址信息
 * **/
public List<TcrmCustomeraddress> addressrByzipcodeAndAd(TcrmCustomeraddress address);


/**
 * 根据客代，地址一，地址二，返回地址信息
 * **/
public List<TcrmCustomeraddress> customerIsExistAddress(TcrmCustomeraddress address);
/**
 * 根据证件号、证件类型，返回地址信息
 * 
 * **/
public List<TcrmCustomer>selectCustomerByIdCardAndCardType(TcrmCustomer customer);


/**
 * 
 * 根据客代，返回地址信息
 * 
 * **/
public List<TcrmCustomer>selectCustomerById(TcrmCustomer customer);

/**
 * 根据客代，返回账户信息
 * **/
public List<TcrmCustomeraccountbalance>selectAccountBalanceById(TcrmCustomer customer);

/**
 * 根据客代，返回客户积分明细
 * **/
public List<TcrmLotterybonus>selectLotteryBonusById(TcrmCustomer customer);


/**
 * 根据客代，返回客户积分有效明细
 * **/
public List<TcrmLotterybonus>selectLotteryBonusByValid(TcrmCustomer customer);


/**
 * 根据客代，返回客户积分有效总数
 * **/
public Double selectLotteryBonusCountByValid(TcrmCustomer customer);

/**有效订单数理及金额**/

public TcrmCustomer  customerAvaiAmount(TcrmCustomer customer);

/**验证会员卡及密码**/
public TcrmCustomer  checkCustomerCard(TcrmCustomer customer);

/**会员卡冲值**/
public TcrmCustomer  updCustomerBalance(TcrmCustomer customer);


/**
 * 根据客代，返回客户积分有效电子折价号
 * **/
public List<TcrmCustomerEleccoupons>selectCustomerEleccoupons(TcrmCustomerEleccoupons customereleccoupons);



/**验证客户是否COD
 * 回應碼(0:ok,1:外島/不符合條件)
 * **/
public TcrmCustomer  customerPaymentCod(TcrmCustomer customer);


/**
 * 发送短信
 * **/
public void  customerSmsSend(TcrmCustomer customer);

/**
 * 客户积分
 * **/

public void updcustomerLotteryBonus(TcrmLotterybonus lotterybonus);


/**
 * 创建网络账户
 * **/
public TcrmCustomerNetwork createCustomerNetwork(TcrmCustomerNetwork customernetwork);

/**
 * 修改网络账户
 * **/
public TcrmCustomerNetwork updateCustomerNetwork(TcrmCustomerNetwork customernetwork);


/**
 * 根据客代，返回客户网络账户
 * **/
public List<TcrmCustomerNetwork>selectCustomerNetwork(TcrmCustomerNetwork customernetwork);


/**
 * 
 * 客户联系信息
 * **/
public ContacthistoryDTO createContacthistory(ContacthistoryDTO dto);

/**
 * 
 * 客户账户使用
 * **/
public  TcrmCustomeraccountbalance useOfAccountBalance(TcrmCusttransactiondetails custtransactiondetails);

/**
 * 
 * 客户账户冲值
 * **/
public  List<CustomerAccountBalanceDTO> depositOfAccountBalance(CustomerAccountBalance custaccountbalance);

/**
 * 
 * 客户黑名单
 * **/
public  CustomerBlacklistDTO queryCustomerBlack(CustomerBlacklistDTO dto);


/**
 * 
 * 建立客户黑名单
 * **/

public  CustomerBlacklistDTO createCustomerBlack(CustomerBlacklistDTO dto);




/**
 * 
 * 客户贵宾接待
 * 
 * 
 * **/
public  CustomerVipDTO createCustomerPassword(CustomerVipDTO dto);

/**
 * 
 * 最近有效联系人在线人
 * 
 * **/
public  List<CustomerDTO> queryCustomerVip(CustomerDTO dto);


/**
 * 
 * 电话小结基本信息
 * 
 * **/
public  List<CallworkcodeDTO> queryCallWorkCode();



/**
 * 
 * 客户信息发送(短信、微信、APP等)
 * 
 * 
 * **/
public  CustomermessageDTO sendCustomerMessage(CustomermessageDTO dto);

/**
 * 
 * 客户联络信息
 * 
 * 
 * **/
public CustomercontactsDTO createCustomercontacts(CustomercontactsDTO dto);


}
