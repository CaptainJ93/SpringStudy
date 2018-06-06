package com.best1.api.mapper.oaf.order;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;




import com.best1.api.entity.oaf.order.CustomerOrderPayment;
import com.best1.api.entity.oaf.order.ToafOrderedproduct;
import com.best1.api.entity.oaf.order.CustomerOrderInfo;
import com.best1.api.entity.oaf.order.ToafOrderedproductExample;
import com.best1.api.entity.oaf.order.ToafOrderedproductKey;
import com.best1.api.entity.oaf.order.TscmOrderreasoninfo;
import com.best1.api.mapper.SqlMapper;

/**
 *  
 * This method corresponds to the database table Toaf_Orderedproduct


 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * 
 *
 */
@SqlMapper
public interface  ToafOrderedproductMapper {
	 Long  fetchOrderId();
	 void  createTempOrder(Map<String,Object> param);
	 void  createTempPayment(Map<String,Object> param);
	 void  createOrderTempPayment(Map<String,Object> param);
	 void  createOrder(Map<String,Object> param);
	 void  webLotteryBonusPay(Map<String,Object> param);
	 void  postOrderReceivable(Map<String,Object> param);
	 
	 List<CustomerOrderInfo> selectCustomerOrderInfo(CustomerOrderInfo orderinfo);
	 List<TscmOrderreasoninfo> selectOrderreasoninfo(TscmOrderreasoninfo orderreasoninfo);
	/**促销信息搜寻**/
	 void  offerSearch(Map<String,Object> param);
	 /**折價卷**/
	 void  offerInsert(Map<String,Object> param);
	 /**insert_orderoffer*/
	 void  insertOrderOffer(Map<String,Object> param);
	 
	 /**insert_order_after*/
	 void  insertOrderafter(Map<String,Object> param);
	 
	 
	 public int updateOrderedproductByExampleSelective(@Param("record") ToafOrderedproduct record, @Param("example") ToafOrderedproductExample example);
	 
	 public ToafOrderedproduct selectByPrimaryKey(ToafOrderedproductKey key);
	 
	 public  int updateByPrimaryKeySelective(ToafOrderedproduct record);
	 
	 List<CustomerOrderPayment> selectCustomerOrderPay(CustomerOrderPayment orderinfo);

	 
	 
}

