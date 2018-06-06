package com.best1.scm.common.utils;

public interface SCMConstants {
	//销退状态
	public static final int Receipt_Status_ongoing = 1000;
	public static final int Receipt_Status_read = 1001;
	public static final int Receipt_Status_build = 1002;
	public static final int Receipt_Status_Print = 1003;
	public static final int Receipt_Status_Success = 1005; //取件成功
	public static final int Receipt_Status_Close = 1011; //强迫结案
	public static final int Receipt_Status_CancelSuccess = 1013 ; //拦截成功
	
	//客诉类型
	public static final int Scm_Complaint_Cptype_Carrier = 1001;
	public static final int Scm_Complaint_Cptype_Supplier = 1002;
	
	//配送代码
	public static final int Deliveryorderid_Status_UnUse = 1000;
	public static final int Deliveryorderid_Status_Used = 1001;
	
	
	public static final int Deliveryorderid_Status_Shortage = 1000;
	
	public static final int No_Data = 8888;
	


	public static final int Success = 9999;
	
	public static final String sys_office_type_logistics="4";
	
	// 角色名 Role
	String ROLE_ADMIN = "dept"; // 系统管理员
	String ROLE_SUPPLIER = "supplier"; // 供应商
	String ROLE_CARRIER = "Logistics"; // 配送公司
	String ROLE_VWS = "wlpsjl"; // 物流配送经理
	
	// 订单状态 OrderStatus
	int ORDER_STATUS_SHIPPING_IN_PROGRESS = 1002; // 出货进行中
	int ORDER_STATUS_SHIPPING_CONFIRMED = 1003; // 出货确认
	int ORDER_STATUS_SHIPPING_CANCELSUCCESS = 9903 ;// 拦截成功
	
	// 配送子类别
	int SUB_DELIVERY_TYPE_NORMAL = 1001; // 一般
	int SUB_DELIVERY_TYPE_CARRIER_TO_SUPPLIER_PICKUP = 1002; // 到厂取货
	
	// 包裹状态
	int TRACKING_STATUS_SHIP_CONFIRM = 1000; // 出货确认
	int TRACKING_STATUS_IN_TRANSIT = 1001; // 配送中
	int TRACKING_STATUS_DELIVERY_CONFIRM = 1002; // 配送确认
	int TRACKING_STATUS_DELIVERY_TERMINATION = 1003; // 配送终止
	int TRACKING_STATUS_RETURN_PARTIAL_PRODUCT = 1004; // 半签半退
	
	// 包裹类型
	int PACKAGE_TYPE_GENERAL = 1000; // 一般
	int PACKAGE_TYPE_REPLACED = 1001; // A换A
	
	int CARRIERDELIVERORDERID_STATUS_UNUSED = 1000;
	int CARRIERDELIVERORDERID_STATUS_USED = 1001;
}
