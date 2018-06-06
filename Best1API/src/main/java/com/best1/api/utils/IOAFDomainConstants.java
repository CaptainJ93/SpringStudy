package com.best1.api.utils;

public class IOAFDomainConstants {
	
	public static final int OAF_REFUND_IN_PROGRESS=1004;
	public static final int OAF_REFUND_SUCCESSFUL=1005;
	
	public static final int OAF_REFUND_PROCESS_COMPLETED=1007;
	
	public static final int OAF_PAYMENT_STATUS_PENDING = 3202;
	public static final int OAF_PAYMENT_STATUS_CONFIRMED = 3203;
	public static final int OAF_PAYMENT_STATUS_CANCELLED = 3204;
	public static final int OAF_PAYMENT_STATUS_OFFSET = 3205;

	// Customer Account
	public static final int ACCOUNT_TYPE_BONUS = 4184;
	public static final int ACCOUNT_TYPE_CASH = 4185;
	public static final int ACCOUNT_TYPE_CERT_GIFT = 4186;
	public static final int ACCOUNT_TYPE_CERT_PICKUP = 4187;
	public static final int ACCOUNT_NUMBER_INTERNAL = 3001;
	public static final long ACCOUNT_NUMBER_CASH = 3002;
	
	public static final long ACCOUNT_NUMBER_PICKUP = 3004;
	
	// Reference Type
	public static final int REFERENCE_TYPE_ORDER = 4190;
	public static final int REFERENCE_TYPE_RETURN = 4191;
	public static final int REFERENCE_TYPE_REFUND = 1003;
	public static final int REFERENCE_TYPE_CERTIFICATE = 4405;
	public static final int REFERENCE_TYPE_RECIEPT_BY_ATM = 4406;
	public static final int REFERENCE_TYPE_RECIEPT_BY_POST = 4407;
	public static final int REFERENCE_TYPE_ID_REFUND = 4408;
	// transacion Details
	public static final int TRANSACTION_DETAILS_SHORTAGE_PAYMENT_CASH_ACCOUNT_ATM = 1001;
	public static final int TRANSACTION_DETAILS_SHORTAGE_PAYMENT_CASH_ACCOUNT_POST = 1002;
	public static final int TRANSACTION_DETAILS_INTER_COMPANY_TRANFER_BONUS_POINTS = 1003;
	public static final int TRANSACTION_DETAILS_INTER_COMPANY_TRANFER_CASH = 1004;
	public static final int TRANSACTION_DETAILS_INTER_COMPANY_TRANFER_GIFT_CERTIFICATE = 1005;
	public static final int TRANSACTION_DETAILS_INTER_COMPANY_TRANFER_PICKUP_CERTIFICATE = 1006;
	public static final int TRANSACTION_DETAILS_REFUND_CASH = 1007;
	public static final int TRANSACTION_DETAILS_REFUND_BONUS_POINTS = 1008;
	public static final int TRANSACTION_DETAILS_REFUND_GIFT_CERTIFICATE = 1009;
	public static final int TRANSACTION_DETAILS_REFUND_PICKUP_CERTIFICATE = 1010;
	public static final int TRANSACTION_DETAILS_PURCHASE_PRODUCT = 1011;
	public static final int TRANSACTION_DETAILS_OFFER_CASH = 1012;
	public static final int TRANSACTION_DETAILS_OFFER_BONUS_POINTS = 1013;
	public static final int TRANSACTION_DETAILS_PAYMENT_BONUS_POINTS = 1014;
	public static final int TRANSACTION_DETAILS_PAYMENT_CASH = 1015;
	public static final int TRANSACTION_DETAILS_PAYMENT_GIFT_CERTIFICATE = 1016;
	public static final int TRANSACTION_DETAILS_PAYMENT_PICKUP_CERTIFICATE = 1017;
	public static final int TRANSACTION_DETAILS_ACTIVATION_GIFT_CERTIFICATE = 1018;
	public static final int TRANSACTION_DETAILS_ACTIVATION_PICKUP_CERTIFICATE = 1019;
	public static final int TRANSACTION_DETAILS_REDEMPTION_GIFT_CERTIFICATE = 1020;
	public static final int TRANSACTION_DETAILS_REDEMPTION_PICKUP_CERTIFICATE = 1021;
	public static final int TRANSACTION_DETAILS_RETURN_CASH = 1022;
	public static final int TRANSACTION_DETAILS_RETURN_BONUS_POINTS = 1023;
	public static final int TRANSACTION_DETAILS_CANCEL_RETURN_CASH = 1024;
	public static final int TRANSACTION_DETAILS_CANCEL_RETURN_BONUS_POINTS = 1025;
	/* Transacion Details ID -- 95/5/20 added by Thomas for Defect #4725. */
	public static final int TRANSACTION_DETAILS_PAYMENT_CANCEL_CASH = 1030;
	public static final int TRANSACTION_DETAILS_PAYMENT_CANCEL_BONUS_POINTS = 1031;
	public static final int TRANSACTION_DETAILS_PAYMENT_CANCEL_PICKUP_CERTIF = 1032;
	public static final int TRANSACTION_DETAILS_PAYMENT_CANCEL_GIFT_CERT = 1033;

	// Order type
	public static final int ORDER_TYPE_NORMAL = 1;
	public static final int ORDER_TYPE_GIFT = 2;
	public static final int ORDER_TYPE_BUSINESS = 3;
	public static final int ORDER_TYPE_PRODUCT_ALREADY_DELIVERED = 4;
	public static final int ORDER_TYPE_INCOMPLETE_ORDER = 5;
	public static final int ORDER_TYPE_EXCHANGE = 6;
	public static final int ORDER_TYPE_REPLACE = 7;
	public static final int ORDER_TYPE_RETURN = 8;
	public static final int ORDER_TYPE_THIRD_PARTY_ORDER = 9;
	public static final int ORDER_TYPE_GIFT_CERTIFICATE_REDEMPTION = 10;
	public static final int ORDER_TYPE_LOTTER_ORDER = 11;
	/* cr#6228 11Aug2008 by fuXiang */
	public static final int ORDER_TYPE_RESERVED_ORDER = 12;
	// csj 2014-03-04 add tuangou
	public static final int ORDER_TYPE_Group_Purchase = 13;

	/* hwh 20140612 add commission Order */
	public static final int ORDER_TYPE_COMMISSION = 14;
	// Priority
	public static final int PRIORITY_HIGH = 1001;
	public static final int PRIORITY_MEDIUM = 1002;
	public static final int PRIORITY_LOW = 1003;

	// Invoice Type
	public static final int INVOICE_TYPE_COMPANY_INVOICE = 1;
	public static final int INVOICE_TYPE_PERSONAL_INVOICE = 2;

	// Invoice status
	/*
	 * Has been removed as IT3 has defined new constants public static final int
	 * INVOICE_STATUS_NOT_ISSUED=1; public static final int
	 * INVOICE_STATUS_ISSUED=2; public static final int
	 * INVOICE_STATUS_STOP_INVOICE=3; public static final int
	 * INVOICE_STATUS_PENDING_FOR_RETURN=4; public static final int
	 * INVOICE_STATUS_RETURNED=5; public static final int
	 * INVOICE_STATUS_FORCEDCLOSE = 1006;
	 */
	public static final int INVOICE_STATUS_INVOICE_NO_TO_BE_ASSIGNED = 1001;
	public static final int INVOICE_STATUS_PENDING_INVOICE_ISSUE = 1002;
	public static final int INVOICE_STATUS_INVOICE_ISSUE_STOPPED = 1003;
	public static final int INVOICE_STATUS_INVOICE_ISSUED = 1004;
	public static final int INVOICE_STATUS_PENDING_INVOICE_RETURN = 1005;
	public static final int INVOICE_STATUS_INVOICE_RETURNED = 1006;
	public static final int INVOICE_STATUS_INVOICE_FORCED_CLOSE = 1007;

	// Payment modes
	public static final int PAYMENT_MODE_POST = 1;
	public static final int PAYMENT_MODE_ATM = 2;
	public static final int PAYMENT_MODE_CREDITCARD = 3;
	public static final int PAYMENT_MODE_COD = 4;
	public static final int PAYMENT_MODE_CASH = 5;
	public static final int PAYMENT_MODE_BONUS_POINTS = 6;
	public static final int PAYMENT_MODE_GIFT_CERTIFICATE = 7;
	public static final int PAYMENT_MODE_PICKUP_CERTIFICATE = 8;
	public static final int PAYMENT_MODE_CHEQUE = 9;
	public static final int PAYMENT_MODE_OTHERS = 10;

	/* add by liuyin 2013年2月25日10:07:52 start */
	public static final int PAYMENT_COD_CASH = 11;
	public static final int PAYMENT_COD_POS = 12;
	public static final int PAYMENT_COD_CASH_POS = 13;
	/* add by liuyin 2013年2月25日10:07:52 end */

	// exclusive Payment Mode
	public static final String EXCLUSIVE_PAYMENT_MODE_POST = "1";
	public static final String EXCLUSIVE_PAYMENT_MODE_ATM = "2";
	public static final String EXCLUSIVE_PAYMENT_MODE_CREDITCARD = "3";
	public static final String EXCLUSIVE_PAYMENT_MODE_COD = "4";
	public static final String EXCLUSIVE_PAYMENT_MODE_CASH = "5";
	public static final String EXCLUSIVE_PAYMENT_MODE_BONUS_POINTS = "6";
	public static final String EXCLUSIVE_PAYMENT_MODE_GIFT_CERTIFICATE = "7";
	public static final String EXCLUSIVE_PAYMENT_MODE_PICKUP_CERTIFICATE = "8";

	// sub exclusive Payment Mode
	public static final int SUB_EXCLUSIVE_PAYMENT_MODE = 1000;

	// Payment Type
	public static final int NORMAL_NCCC = 1001;
	public static final int PAY_BY_COLLECTION = 1002;
	public static final int PAY_BY_EARLY_PAYMENT = 1003;
	public static final int CHANGE_PAYMENTMODE = 1004;
	public static final int CHANGE_CARD = 1005;
	public static final int PAYMENT_CANCEL = 1006;

	// Paymentchangereasoncode
	public static final int EARLY_PAYMENT = 1010; // CR6616

	// store status
	public static final int STORE_STATUS_VALID = 1;
	public static final int STORE_STATUS_INVALID = 2;

	// Post account number status
	public static final int POST_ACCOUNT_NUMBER_STATUS_VALID = 1;
	public static final int POST_ACCOUNT_NUMBER_STATUS_INVALID = 2;

	// date type
	public static final int DATETYPE_ORDER_DATE = 1000;
	public static final int DATETYPE_SETTLEMENT_DATE = 1001;
	public static final int DATETYPE_SENT_DATE = 1003;

	// id type
	public static final int IDTYPE_ORDER_ID = 1000;
	public static final int IDTYPE_CUSTOMER_ID = 1001;
	public static final int IDTYPE_PRODUCT_ID = 1002;

	// certificate purchase type
	public static final int CERTIFICATE_PURCHASE_TYPE_NORMAL_PURCHASE = 1000;
	public static final int CERTIFICATE_PURCHASE_TYPE_REDEEMED_EXPIRED_PURCHASE = 1001;
	public static final int CERTIFICATE_DELIVERY_STATUS_READY_FOR_SHIPPING = 1001;
	public static final int CERTIFICATE_DELIVERY_STATUS_SHIPPING_CONFIRMED = 1003;
	public static final int CERTIFICATE_DELIVERY_STATUS_ALL = 1002;

	// payment status
	public static final int PAYMENT_STATUS_PAYMENT_PENDING = 3202;
	public static final int PAYMENT_STATUS_PAYMENT_CONFIRMED = 3203;
	public static final int PAYMENT_STATUS_PAYMENT_CANCELLED = 3204;
	public static final int PAYMENT_STATUS_PAYMENT_OFFSET = 3205;

	// payment status for Reserved Order (cr#6228 13Aug2008 by fuXiang)
	public static final int RESERVED_PAYMENT_STATUS_PAYMENT_PENDING = 3202;
	public static final int RESERVED_PAYMENT_STATUS_PAYMENT_CANCELLED = 3204;

	// refund status
	public static final int REFUND_STATUS_ALL_REFUND_STATUSES = 1001;
	public static final int REFUND_STATUS_PENDING_REFUND = 1002;
	public static final int REFUND_STATUS_READY_FOR_REFUND = 1003;
	public static final int REFUND_STATUS_REFUND_IN_PROGRESS = 1004;
	public static final int REFUND_STATUS_REFUND_SUCCESSFUL = 1005;
	public static final int REFUND_STATUS_REFUND_FAILED = 1006;
	public static final int REFUND_STATUS_REFUND_PROCESS_COMPLETED = 1007;
	public static final int REFUND_STATUS_REFUND_CANCELLED = 1008;
	public static final int REFUND_STATUS_REFUND_FAILURE_NOTIFIED = 1009;

	// refund type
	public static final int REFUNDTYPE_ALL_REFUND_TYPES = 1001;
	public static final int REFUND_TYPE_RETURN = 1002;
	public static final int REFUND_TYPE_CANCEL = 1003;
	public static final int REFUND_TYPE_GIFT_CERTIFICATE = 1004;
	public static final int REFUND_TYPE_CASH_REFUND = 1005;
	public static final int REFUND_TYPE_LUCKY_DRAW_REFUND = 1006;
	public static final int REFUND_TYPE_EXCESS_PAYMENT_REFUND = 1007;

	// cheque refund status
	public static final int CHEQUE_REFUND_STATUS_ALL_CHEQUE_STATUSES = 1001;
	public static final int CHEQUE_REFUND_STATUS_CHEQUE_REFUND_PENDING = 1002;
	public static final int CHEQUE_REFUND_STATUS_CHEQUE_REFUND_INITIATED = 1003;
	public static final int CHEQUE_REFUND_STATUS_CHEQUE_PRINTED = 1004;
	public static final int CHEQUE_REFUND_STATUS_CHEQUE_ISSUED = 1005;
	public static final int CHEQUE_REFUND_STATUS_CHEQUE_REFUND_FAILED = 1006;
	public static final int CHEQUE_REFUND_STATUS_CHEQUE_REFUND_CANCELLED = 1007;

	// bank refund status
	public static final int BANK_REFUND_STATUS_BANK_TRANSFER_PENDING = 1001;
	public static final int BANK_REFUND_STATUS_FEDI_TRANSFER_IN_PROGRESS = 1002;
	public static final int BANK_REFUND_STATUS_FEDI_TRANSFER_SUCCESSFUL = 1003;
	public static final int BANK_REFUND_STATUS_FEDI_TRANSFER_FAILED = 1004;
	public static final int BANK_REFUND_STATUS_SENT_FOR_BANK_TRANSFER = 1005;
	public static final int BANK_REFUND_STATUS_BANK_TRANSFER_COMPLETED = 1006;
	public static final int BANK_REFUND_STATUS_BANK_REFUND_CANCELLED = 1007;
	public static final int BANK_REFUND_STATUS_BANK_TRANSFER_FAILED = 1008;

	// option status
	public static final int OPTION_STATUS_NEW = 1001;
	public static final int OPTION_STATUS_MODIFIED = 1002;
	public static final int OPTION_STATUS_CANCELLED = 1003;

	// Invoked from
	public static final int INVOKED_FROM_PRODUCTENQUIRY = 1001;
	public static final int INVOKED_FROM_PROGRAMENQUIRY = 1002;
	public static final int INVOKED_FROM_CANCELORDER = 1003;
	public static final int INVOKED_FROM_CANCELFROMTAKEORDER = 1004;
	public static final int INVOKED_FROM_REFUND = 1005;
	public static final int INVOKED_FROM_PRINT_CHEQUE = 1006;
	public static final int INVOKED_FROM_EXCHANGEPRODUCT = 1007;
	public static final int INVOKED_FROM_CATALOGENQUIRY = 1008;

	// Modify description - Changed on 2nd Jul
	public static final int MODIFY_DESCRIPTION_POST = 1001;
	public static final int MODIFY_DESCRIPTION_ATM = 1002;
	public static final int MODIFY_DESCRIPTION_CREDIT_CARD = 1003;
	public static final int MODIFY_DESCRIPTION_COD = 1004;
	public static final int MODIFY_DESCRIPTION_CUSTOMER_ACCOUNT = 1005;
	public static final int MODIFY_DESCRIPTION_POST_CUSTOMER_ACCOUNT = 1006;
	public static final int MODIFY_DESCRIPTION_ATM_CUSTOMER_ACCOUNT = 1007;
	public static final int MODIFY_DESCRIPTION_CREDIT_CARD_CUSTOMER_ACCOUNT = 1008;
	public static final int MODIFY_DESCRIPTION_COD_CUSTOMER_ACCOUNT = 1009;

	/* CR-5301 */
	public static final int MODIFY_DESCRIPTION_COLLECTION_PAYMENT = 1011;
	public static final int MODIFY_DESCRIPTION_COLLECTION_PAYMENT_CANCEL = 1012;
	public static final int MODIFY_DESCRIPTION_COLLECTION_WRITE_OFF_PAYMENT = 1013;
	public static final int MODIFY_DESCRIPTION_CUSTOMER_SPECIFY_TRAVELCARD = 1014;
	public static final int MODIFY_DESCRIPTION_SETTLEMENT_ROLLBACK_BYBANK = 1015;

	// installment status
	public static final int INSTALLMENT_STATUS_AUTHORIZATION_PENDING = 1001;
	public static final int INSTALLMENT_STATUS_AUTHORIZATION_RESERVED = 1002;
	public static final int INSTALLMENT_STATUS_AUTHORIZATION_IN_PROGRESS = 1003;
	public static final int INSTALLMENT_STATUS_AUTHORIZATION_CALLBANK = 1004;
	public static final int INSTALLMENT_STATUS_AUTHORIZATION_SUCCESSFUL = 1005;
	public static final int INSTALLMENT_STATUS_AUTHORIZATION_REJECTED = 1006;
	public static final int INSTALLMENT_STATUS_AUTHORIZATION_CANCELLED_BEFORE_REQUEST = 1007;
	public static final int INSTALLMENT_STATUS_AUTHORIZATION_CANCELLATION_PENDING = 1008;
	public static final int INSTALLMENT_STATUS_AUTHORIZATION_CANCELLED_AFTER_REQUEST = 1009;
	public static final int INSTALLMENT_STATUS_AUTHORIZATION_REQUESTED_PENDING_CANCELLATION = 1010;
	public static final int INSTALLMENT_STATUS_SETTLEMENT_IN_PROGRESS = 1011;
	public static final int INSTALLMENT_STATUS_SETTLEMENT_RESERVED = 1012;
	public static final int INSTALLMENT_STATUS_STOP_SETTLEMENT_PENDING = 1013;
	public static final int INSTALLMENT_STATUS_STOP_SETTLEMENT_IN_PROGRESS = 1014;
	public static final int INSTALLMENT_STATUS_STOP_SETTLEMENT_COMPLETE = 1015;
	public static final int INSTALLMENT_STATUS_SETTLEMENT_REQUEST_FOR_REFUND_PENDING = 1016;
	public static final int INSTALLMENT_STATUS_SETTLEMET_FOR_REFUND_IN_PROGRESS = 1017;
	public static final int INSTALLMENT_STATUS_SETTLEMENT_REQUEST_PENDING_FOR_EARLY_PAYMENT = 1018;
	public static final int INSTALLMENT_STATUS_SETTLEMENT_FOR_EARLY_PAYMENT_IN_PROGRESS = 1019;
	public static final int INSTALLMENT_STATUS_SETTLEMENT_SUCCESSFUL = 1020;
	public static final int INSTALLMENT_STATUS_SETTLEMENT_REJECTED = 1021;
	public static final int INSTALLMENT_STATUS_SETTLEMENT_REQUESTED_FOR_EARLY_PAYMENT_PENDING_REFUND = 1022;
	public static final int INSTALLMENT_STATUS_SETTLEMENT_FOR_REFUND_SUCCESSFUL = 1023;
	public static final int INSTALLMENT_STATUS_SETTLEMENT_CONFIRMED = 1024;
	public static final int INSTALLMENT_STATUS_SETTLEMENT_IN_PROGRESS_PENDING_REFUND = 1025;
	public static final int INSTALLMENT_STATUS_SETTLEMENT_IN_PROGRESS_PENDING_STOP_SETTLEMENT = 1026;
	public static final int INSTALLMENT_STATUS_DELETED = 1027;
	public static final int INSTALLMENT_STATUS_CHARGE_BACK_SUCCESSFUL = 1030;
	public static final int INSTALLMENT_STATUS_HOLD_SETT_CONFIRMED_SETT_SUCC = 1031;
	public static final int INSTALLMENT_STATUS_HOLD_SETT_CONFIRMED_REFUND_SUCC = 1032;
	public static final int INSTALLMENT_STATUS_HOLD_PARTIAL_REFUND = 1033;
	public static final int INSTALLMENT_STATUS_REFUND_CONFIRMED = 1034;
	public static final int INSTALLMENT_STATUS_SETTLEMENT_FOR_REFUND_REJECTED = 1035;
	public static final int INSTALLMENT_STATUS_REQUEST_SETTLEMENT_CANCELLED = 1036;
	public static final int INSTALLMENT_STATUS_REQUEST_SETTLEMENT_CANCEL_IN_PROGRESS = 1037;
	public static final int INSTALLMENT_STATUS_REQUEST_SETTLEMENT_CANCEL_SUCCESSFUL = 1038;
	public static final int INSTALLMENT_STATUS_REQUEST_SETTLEMENT_CANCEL_CONFIRMED = 1039;
	public static final int INSTALLMENT_STATUS_REQUEST_SETTLEMENT_CANCEL_REJECTED = 1040;
	public static final int INSTALLMENT_STATUS_REQUEST_SETTLEMENT_CANCEL_HOLD = 1041;

	// collection approve status
	public static final int COLLECTION_APPROVE_STATUS_PENDING_FOR_APPROVAL = 1001;
	public static final int COLLECTION_APPROVE_STATUS_APPROVED = 1002;
	public static final int COLLECTION_APPROVE_STATUS_REJECTED = 1003;

	// refund mode
	public static final int REFUND_MODE_ALL_REFUND_MODES = 1001;
	public static final int REFUND_MODE_CREDIT_CARD = 1002;
	public static final int REFUND_MODE_CHEQUE = 1003;
	public static final int REFUND_MODE_BANK = 1004;
	public static final int REFUND_MODE_CUSTOMER_ACCOUNT = 1005;
	public static final int REFUND_MODE_BANK_MANUAL = 1006;
	public static final int REFUND_MODE_SPECIAL_REFUND_MODE_UNDECIDED_MODE = 1000;

	// transfer account type
	public static final int TRANSFER_ACCOUNT_TYPE_SETTLEMENT_ATM = 1001;
	public static final int TRANSFER_ACCOUNT_TYPE_SETTLEMENT_POST = 1002;
	public static final int TRANSFER_ACCOUNT_TYPE_COLLECTION_ATM = 1003;
	public static final int TRANSFER_ACCOUNT_TYPE_COLLECTION_POST = 1004;

	// installment type
	public static final int INSTALLMENT_TYPE_FULL_PAYMENT = 1001;
	public static final int INSTALLMENT_TYPE_INSTALLMENT = 1002;
	public static final int INSTALLMENT_TYPE_ALL = 1003;

	// payment change status
	public static final int PAYMENT_CHANGE_STATUS_EARLY_PAYMENT_BY_ATM = 1000;
	public static final int PAYMENT_CHANGE_STATUS_EARLY_PAYMENT_BY_POST = 1001;
	public static final int PAYMENT_CHANGE_STATUS_EARLY_PAYMENT_BY_CREDIT_CARD = 1002;
	public static final int PAYMENT_CHANGE_STATUS_CHANGE_CARD = 1003;
	public static final int PAYMENT_CHANGE_STATUS_PAYMENT_MODE_CHANGED_TO_ATM = 1004;
	public static final int PAYMENT_CHANGE_STATUS_PAYMENT_MODE_CHANGED_TO_POST = 1005;

	// product return type
	public static final int PRODUCT_RETURN_TYPE_RETURN = 1001;
	public static final int PRODUCT_RETURN_TYPE_EXCHANGE = 1002;
	public static final int PRODUCT_RETURN_TYPE_REPLACE = 1003;

	// product return status
	public static final int PRODUCT_RETURN_STATUS_RETURN_ACCEPTED = 1001;
	public static final int PRODUCT_RETURN_STATUS_RETURN_MODIFIED = 1002;
	public static final int PRODUCT_RETURN_STATUS_RETURN_IN_PROGRESS = 1003;
	public static final int PRODUCT_RETURN_STATUS_RETURN_IN_TRANSIT = 1004;
	public static final int PRODUCT_RETURN_STATUS_RETURN_CONFIRMED = 1005;
	public static final int PRODUCT_RETURN_STATUS_RETURN_ABORTED = 1006;
	public static final int PRODUCT_RETURN_STATUS_RETURN_REJECTED = 1007;
	public static final int PRODUCT_RETURN_STATUS_RETURN_CANCELLED = 1008;

	// CC type
	public static final int CC_AUTH_EDI_MASTER_CREDIT_CARD_TYPE_VISA = 1000;
	public static final int CC_AUTH_EDI_MASTER_CREDIT_CARD_TYPE_MASTER = 1001;
	public static final int CC_AUTH_EDI_MASTER_CREDIT_CARD_TYPE_DINERS = 1002;
	public static final int CC_AUTH_EDI_MASTER_CREDIT_CARD_TYPE_UCARD = 1003;
	public static final int CC_AUTH_EDI_MASTER_CREDIT_CARD_TYPE_VISA_AND_MASTER = 1010;

	// promotion status
	public static final int PROMOTION_STATUS_AVAILED = 1001;
	public static final int PROMOTION_STATUS_NOT_AVAILED = 1002;
	public static final int PROMOTION_STATUS_REVOKED = 1003;
	public static final int PROMOTION_STATUS_ELIGIBLE_FOR_LOTTERY = 1004;

	// special delivery
	public static final int SPECIAL_DELIVERY_CODE_NONE = 1001;
	public static final int SPECIAL_DELIVERY_CODE_DELIVERY_BY_PERSON = 1002;
	public static final int SPECIAL_DELIVERY_CODE_DELIVERY_ONEDAYSHIP = 1003;
	public static final int SPECIAL_DELIVERY_CODE_FOREIGN_ORDER = 9999;

	// ??
	public static final int CREDIT_CARD_AUTH_RESERVE_ORDER_OR_RETURN_ORDER = 1001;
	public static final int CREDIT_CARD_AUTH_RESERVE_ORDER_OR_RETURN_RETURN = 1002;

	// return reject reason
	public static final int RETURN_REJECT_REASON_TIME_FRAME_EXCEEDED = 1001;
	public static final int RETURN_REJECT_REASON_BONUS_POINT_PAYMENT = 1002;
	public static final int RETURN_REJECT_REASON_PRODUCT_ALREADY_RETURNED = 1003;
	public static final int RETURN_REJECT_REASON_PRODUCT_CAN_BE_CANCELLED = 1004;
	public static final int RETURN_REJECT_REASON_PRODUCT_CANNOT_BE_RETURNED = 1005;
	public static final int RETURN_REJECT_REASON_REPLACEORDER_NOTCOMPLETED = 1006;
	public static final int RETURN_REJECT_REASON_EXCHANGEORDER_CANCELLED = 1007;

	public static final int RETURN_REASON_PRODUCT_QUALITY = 1001;

	// exchange status
	public static final int EXCHANGE_STATUS_EXCHANGE_INITIATED = 1001;
	public static final int EXCHANGE_STATUS_EXCHANGE_IN_PROGRESS = 1002;
	public static final int EXCHANGE_STATUS_EXCHANGE_COMPLETED = 1003;
	public static final int EXCHANGE_STATUS_EXCHANGE_REJECTED = 1004;
	public static final int EXCHANGE_STATUS_EXCHANGE_ABORTED = 1005;
	public static final int EXCHANGE_STATUS_EXCHANGE_CANCELLED = 1006;

	// order status
	public static final int ORDER_STATUS_ORDER_ACCEPTED = 1000;
	public static final int ORDER_STATUS_READY_FOR_SHIPPING = 1001;
	public static final int ORDER_STATUS_SHIPPING_IN_PROGRESS = 1002;
	public static final int ORDER_STATUS_SHIPPING_CONFIRMED = 1003;
	public static final int ORDER_STATUS_DELIVERY_CONFIRMED = 1004;
	public static final int ORDER_STATUS_DELIVERY_FAILED = 1005;
	public static final int ORDER_STATUS_ORDER_CANCEL_INITIATED = 1006;
	public static final int ORDER_STATUS_ORDER_CANCELLED = 1007;
	/*
	 * Cross02_VWMS for order related: ORDER_STATUS_VERIFICATION_IN_PROGRESS
	 * replaced by ORDER_STATUS_SHIPPING_CANCELLED
	 */
	public static final int ORDER_STATUS_SHIPPING_CANCELLED = 1008;

	// reserved order status (cr#6228 13Aug2008 by fuXiang)
	public static final int RESERVED_ORDER_STATUS_ORDER_ACCEPTED = 1000;
	public static final int RESERVED_ORDER_STATUS_TAKE_ORDER = 1001;
	public static final int RESERVED_ORDER_STATUS_ORDER_CANCELLED = 1007;

	// CC need authorisation
	public static final int CREDIT_CARD_NEED_AUTHORIZATION_AUTHORIZATION_NEEDED = 1001;
	public static final int CREDIT_CARD_NEED_AUTHORIZATION_AUTHORIZATION_NOT_NEEDED = 1002;

	// settlement response
	public static final int RESPONSESTATUS_SUCCESS = 1001;
	public static final int RESPONSESTATUS_FAILURE = 1002;
	public static final int RESPONSESTATUS_ERROR = 1003;
	public static final int RESPONSESTATUS_CALLBANK = 1004;

	// failure code
	public static final int FAILURE_CODE_CUSTOMER_VALIDATION_FAILED = 1001;
	public static final int FAILURE_CODE_AMOUNT_NOT_RECEIVED_FROM_CUSTOMER = 1002;

	// CC auth type
	public static final int CREDIT_CARD_AUTHORIZATION_TYPE_ONLINE = 1001;
	public static final int CREDIT_CARD_AUTHORIZATION_TYPE_BATCH = 1002;
	// public static final int CREDIT_CARD_AUTHORIZATION_TYPE_BATCH_ONLINE =
	// 1003;
	public static final int CREDIT_CARD_AUTHORIZATION_TYPE_MANUAL = 1004;

	// settlement type
	public static final int SETTLEMENT_SETTLEMENT = 1001;
	public static final int SETTLEMENT_REFUND = 1002;
	public static final int SETTLEMENT_EARLY_PAYMENT = 1003;
	public static final int SETTLEMENT_STOP_SETTLEMENT = 1004;
	//
	public static final int SETTLEMENT_TYPE_NON_SETTLEMENT_AND_REFUND = 1000;
	public static final int SETTLEMENT_TYPE_SETTLEMENT = 1001;
	public static final int SETTLEMENT_TYPE_REFUND = 1002;
	public static final int SETTLEMENT_TYPE_SETTLEMENT_AND_REFUND = 1003;
	public static final int SETTLEMENT_TYPE_PARTIAL_SETTLEMENT = 1004;

	public static final String SETTLEMENT_REQUEST_CODE_CALLBANK = "08";

	// failure reason
	public static final int FAILURE_REASON_CUSTOMER_VALIDATION_FAILED = 1;
	public static final int FAILURE_REASON_AMOUNT_NOT_RECEIVED_FROM_CUSTOMER = 2;

	// processed status
	public static final int PROCESSED_STATUS_PROCESSED = 1001;
	public static final int PROCESSED_STATUS_UNPROCESSED = 1002;
	public static final int PROCESSED_STATUS_AUTHORIZATIONCONFIRMED = 1003;

	// edi type
	public static final int EDI_TYPE_ATM = 3385;
	public static final int EDI_TYPE_FEDI_REQUEST = 3386;
	public static final int EDI_TYPE_FEDI_RESPONSE = 3387;
	public static final int EDI_TYPE_FEDI_RESPONSE_1 = 3388;

	// record status
	public static final int RECORD_STATUS_PENDING = 1000;
	public static final int RECORD_STATUS_SUCCESS = 1001;
	public static final int RECORD_STATUS_ERROR = 1002;
	public static final int RECORD_STATUS_ALERT = 1003;

	// settlement status
	public static final int SETTLEMENT_STATUS_SUCCESS = 1001;
	public static final int SETTLEMENT_STATUS_FAILURE = 1002;
	public static final int SETTLEMENT_STATUS_ERROR = 1003;
	public static final int SETTLEMENT_STATUS_EXCEPTION = 0;

	// inclusive early payment Y/N
	public static final int INCLUSIVE_EARLY_PAYMENT_YES = 1001;
	public static final int INCLUSIVE_EARLY_PAYMENT_NO = 1002;

	// inclusive stop settlement Y/N
	public static final int INCLUSIVE_STOP_SETTLEMENT_YES = 1001;
	public static final int INCLUSIVE_STOP_SETTLEMENT_NO = 1002;

	// FEDI response
	public static final int FEDI_RESPONSE_REFUND_STATUS_SUCCESS = 1001;
	public static final int FEDI_RESPONSE_REFUND_STATUS_FAILURE = 1002;

	// File status for response header
	public static final int FILE_STATUS_PROCESSED = 1001;
	public static final int FILE_STATUS_UNPROCESSED = 1002;
	public static final int FILE_STATUS_DISCARDED = 1003;
	public static final int FILE_STATUS_ALERT = 1004;

	// money refubd type
	public static final int MONEY_REFUND_TYPE_BANK_TRANSFER_FEDI = 1001;
	public static final int MONEY_REFUND_TYPE_BANK_TRANSFER_MANUAL = 1002;

	// response type
	public static final int RESPONSE_TYPE_AUTHORIZATION_RESPONSE = 1000;
	public static final int RESPONSE_TYPE_SETTLEMENT_RESPONSE = 1001;

	// import status
	public static final int IMPORT_STATUS_IMPORT_SUCCESS = 1001;
	public static final int IMPORT_STATUS_IMPORT_FAILURE = 1002;

	// order history status
	public static final int ORDER_HISTORY_STATUS_TYPE_PAYMENT_STATUS = 1002;
	public static final int ORDER_HISTORY_STATUS_TYPE_ORDER_STATUS = 1001;

	// reason
	public static final int REASON_CHANGE_ORDER_PERSON = 121;
	public static final int REASON_CUSTOMER_NO_LONGER_CANCEL_ORDER = 122;
	public static final int REASON_SYSTEM_HANGS = 131;
	public static final int REASON_BO_CANCELS = 132;
	public static final int REASON_OTHERS_UNKNOWN = 141;
	public static final int REASON_CARD_REJECT_CANCEL = 201;
	public static final int REASON_UNABLE_TO_MATCH_PAYMENT_MODE = 202;
	public static final int REASON_POST_PAYMENT_NOT_MADE_WITHIN_DEADLINE = 203;
	public static final int REASON_DID_NOT_PROVIDE_CREDIT_CARD_CVC = 204;
	public static final int REASON_CREDIT_CARD_NOT_HELD_BY_THE_PERSON_WHO_MAKE_ORDER = 205;
	public static final int REASON_RISK_MANAGEMENT = 206;
	public static final int REASON_NOT_SATISFIED_WITH_GIFT = 211;
	public static final int REASON_PRODUCT_TOO_EXPENSIVE = 212;
	public static final int REASON_NO_BONUS_POINT = 213;
	public static final int REASON_UNABLE_TO_OBTAIN_CUSTOMER_INFORMATION = 231;
	public static final int REASON_NO_LONGER_REQUIRE_PRODUCT = 232;
	public static final int REASON_NO_EMPLOYEE_PRICE = 214;
	public static final int REASON_UNABLE_TO_DELIVER_WITHIN_DEADLINE = 221;
	public static final int REASON_UNABLE_TO_DELIVER_TO_OFFSHORE = 222;
	public static final int REASON_CANCEL_EXCHANGE_ORDER = 241;
	public static final int REASON_CANCEL_BO = 242;
	public static final int REASON_REPEAT_ORDER = 243;
	public static final int REASON_TEST_ORDER = 244;
	public static final int REASON_OTHERS = 251;
	public static final int REASON_GROUP_BENEFIT_UNABLE_TO_MEET_TARGETTED_DISCOUNT = 252;
	public static final int REASON_CHANGE_CHANNEL_VIA_CATOLOGUE_NEWSPAPERS_RADIO = 117;
	public static final int REASON_CHANGE_CHANNEL_VIA_WEB = 118;
	public static final int REASON_GROUP_BENEFIT_OTHER_REASON_REPEAT = 256;
	public static final int REASON_GROUP_BENEFIT_CHANGE_PAYMENT_METHOD = 254;
	public static final int REASON_GROUP_BENEFIT_CHANGE_TO_DISCOUNT_COUPON = 255;
	public static final int REASON_GROUP_BENEFIT_OTHER_REASON_CANCEL = 253;
	public static final int REASON_REPEAT_PAYMENT = 1001;
	public static final int REASON_REPEAT_PRODUCT = 1002;
	public static final int REASON_REPEAT_CUSTOMER = 1003;
	public static final int REASON_REPEAT_PROJECT = 1004;
	public static final int REASON_CANCEL_PAYMENT = 1006;
	public static final int REASON_CANCEL_CUSTOMER = 1007;
	public static final int REASON_CANCEL_PRODUCT = 1008;
	public static final int REASON_CANCEL_DELIVERY = 1009;
	public static final int REASON_CANCEL_COMPANY = 1010;
	public static final int REASON_CANCEL_PROJECT = 1011;
	public static final int REASON_CANCEL_OTHERS = 1012;
	public static final int REASON_CARD_REJECT = 101;
	public static final int REASON_CHANGE_PAYMENT_MODE = 102;
	public static final int REASON_CHANGE_INSTALLMENT_NUMBER = 103;
	public static final int REASON_CHANGE_CARD = 104;
	public static final int REASON_CREDIT_CARD_NOT_HELD_BY_PERSON_WHO_MAKE_ORDER = 105;
	public static final int REASON_WRONG_CREDIT_CARD_AUTHORISATION_AMOUNT = 106;
	public static final int REASON_REPEAT_OTHERS = 1005;
	public static final int REASON_CHANGE_ORDER_PRODUCT = 111;
	public static final int REASON_CHANGE_STYLE_COLOR_IN_DELIVERY_INSTRUCTION = 112;
	public static final int REASON_MAKE_UP_WITH_DISCOUNT_COUPON_IVR = 113;
	public static final int REASON_CHANGE_CHANNEL_TO_TV1 = 114;
	public static final int REASON_CHANGE_CHANNEL_TO_TV2 = 115;
	public static final int REASON_CHANGE_CHANNEL_TO_TV3 = 116;
	public static final int REASON_USE_CC_BONUS_FAIL = 257;
	public static final int REASON_FORGINE_ORDER_INSTALLMENT_FAIL = 258;
	public static int VERIFICATION_STATUS_DELIVER_ORDER = 1001;
	public static int VERIFICATION_STATUS_VERIFICATION_PENDING = 1002;
	public static int VERIFICATION_STATUS_ASSIGNED_FOR_MANUAL_VERIFICATION = 1003;

	public static final int COLLECTIONDOCUMENTNAME_CHANGECARDNOTIFICATION = 1001;
	public static final int COLLECTIONDOCUMENTNAME_LEGALNOTIFICATION = 1002;
	public static final int COLLECTIONDOCUMENTNAME_CONFISCATIONNOTIFICATION1 = 1003;
	public static final int COLLECTIONDOCUMENTNAME_CONFISCATIONNOTIFICATION2 = 1004;
	public static final int COLLECTIONDOCUMENTNAME_REGISTEREDNOTIFICATIONBYPOST = 1005;
	public static final int COLLECTIONDOCUMENTNAME_REQUESTFORLEGALMITIGATION = 1006;
	public static final int COLLECTIONDOCUMENTNAME_ORDERTOPAY = 1007;
	public static final int COLLECTIONDOCUMENTNAME_OUTSOURCINGCERTIFICATE = 1008;
	public static final int COLLECTIONDOCUMENTNAME_REQUESTFORFAMILYDETAILSDOCUMENT = 1009;

	// CR 8830
	public static final int COLLECTIONDOCUMENTNAME_LITIGATIONNOTIFICATION = 1010;
	public static final int COLLECTIONDOCUMENTNAME_COLLECTIONNOTIFICATION = 1011;
	// CR 8830

	// CONSTANTS ADDED FOR VERIFICATION RESULTS USED IN ORDERVERIFICATION
	// DETAILS
	public static int VERIFICATION_RESULT_PROCESSING = 1001;
	public static int VERIFICATION_RESULT_SUCCESS = 1002;
	public static int VERIFICATION_RESULT_FAILURE = 1003;
	public static int VERIFICATION_RESULT_REVERIFY = 1004;
	public static int VERIFICATION_RESULT_REVERIFY_SUCCESS = 1005;
	public static int VERIFICATION_RESULT_REVERIFY_FAILURE = 1006;

	// CONSTANTS ADDED FOR VERIFICATION ACTION USED IN ORDERVERIFICATION DETAILS
	public static int VERIFICATION_ACTION_REVERIFICATION = 1001;
	public static int VERIFICATION_ACTION_DELIVER_ORDER = 1002;
	public static int VERIFICATION_ACTION_CANCEL_ORDER = 1003;

	// CONSTANTS FOR ISP DETAILS
	public static int CUSTOMER_ISP_EDUCATION = 1001;
	public static int CUSTOMER_ISP_EMPLOYMENT = 1002;
	public static int CUSTOMER_ISP_UNKNOWN = 1003;
	public static int CUSTOMER_ISP_DESIGNATED_ISP = 1004;
	public static int CUSTOMER_ISP_FREE = 1005;
	public static int CUSTOMER_ISP_BLANK = 1006;

	// CONSTANTS FOR ORDER_DAY
	public static int ORDER_DAY_SUNDAY = 1;
	public static int ORDER_DAY_MONDAY = 2;
	public static int ORDER_DAY_TUESDAY = 3;
	public static int ORDER_DAY_WEDNESDAY = 4;
	public static int ORDER_DAY_THURSDAY = 5;
	public static int ORDER_DAY_FRIDAY = 6;
	public static int ORDER_DAY_SATURDAY = 7;

	// Constants for Domain Names
	public static final String ORDER_TYPE = "OrderType";
	public static final String PRIORITY = "Priority";
	public static final String INVOICE_TYPE = "InvoiceType";
	public static final String INVOICE_STATUS = "Invoice Status";
	public static final String INVOICE_STATUS1 = "Invoice status"; // 20060210
																	// new added
	public static final String PAYMENT_MODE = "PaymentMode";
	public static final String STORE_STATUS = "StoreStatus";
	public static final String POST_ACCOUNT_NUMBER_STATUS = "PostAccountNumberStatus";
	public static final String DATETYPE = "DateType";
	public static final String IDTYPE = "IdType";
	public static final String CERTIFICATE_PURCHASE_TYPE = "CertificatePurchaseType";
	public static final String CERTIFICATE_DELIVERY_STATUS = "CertificateDeliveryStatus";
	public static final String PAYMENT_STATUS = "PAYMENTSTATUS";
	public static final String REFUND_STATUS = "RefundStatus";
	public static final String REFUND_TYPE = "RefundType";
	public static final String CHEQUE_REFUND_STATUS = "ChequeRefundStatus";
	public static final String BANK_REFUND_STATUS = "BankRefundStatus";
	public static final String OPTION_STATUS = "OptionStatus";
	public static final String REASON = "Reason";
	public static final String RCO_CANCELREASON = "RCO_CancelReason"; // cr6228
	public static final String INVOKED_FROM = "InvokedFrom";
	public static final String MODIFY_DESCRIPTION = "ModifyDescription";
	public static final String INSTALLMENT_STATUS = "Installment Status";
	public static final String REFUND_MODE = "RefundMode";
	public static final String TRANSFER_ACCOUNT_TYPE = "TRANSFER_ACCOUNT_TYPE";
	public static final String INSTALLMENT_TYPE = "InstallmentType";
	public static final String PAYMENT_CHANGE_STATUS = "PaymentChangeStatus";
	public static final String REFUND_MODE_SPECIAL = "RefundModeSpecial";
	public static final String PRODUCT_RETURN_TYPE = "Product_ReturnType";
	public static final String RETURNREASON = "RETURNREASON";
	public static final String PREFFEREDREFUND_OTHERS = "PrefferedRefund_Others";
	public static final String PRODUCT_RETURN_STATUS = "ProductReturnStatus";
	public static final String CC_AUTH_EDI_MASTER_CREDIT_CARD_TYPE = "CCAUTHEDIMASTER_CREDITCARDTYPE";
	public static final String PROMOTION_STATUS = "PromotionStatus";
	public static final String SPECIAL_DELIVERY_CODE = "SpecialDeliveryCode";
	public static final String CREDIT_CARD_AUTH_RESERVE_ORDER_OR_RETURN = "CreditCardAuthReserveOrderOrReturn";
	public static final String RETURN_REJECT_REASON = "ReturnRejectReason";
	public static final String EXCHANGE_STATUS = "ExchangeStatus";
	public static final String ORDER_STATUS = "OrderStatus";
	public static final String CREDIT_CARD_NEED_AUTHORIZATION = "CreditCardNeedAuthorization";
	public static final String SETTLEMENT_RESPONSE = "Settlement response";
	public static final String FAILURE_CODE = "Failure code";
	public static final String CREDIT_CARD_AUTHORIZATION_TYPE = "CreditCardAuthorizationType";
	public static final String SETTLEMENT = "SETTLEMENT";
	public static final String FAILURE_REASON = "FAILURE_REASON";
	public static final String PROCESSED_STATUS = "PROCESSEDSTATUS";
	public static final String EDI_TYPE = "EDI TYPE";
	public static final String SETTLEMENT_TYPE = "SETTLEMENTTYPE";
	public static final String RECORD_STATUS = "RECORDSTATUS";
	public static final String SETTLEMENT_STATUS = "SETTLEMENTSTATUS";
	public static final String INCLUSIVE_EARLY_PAYMENT = "INCLUSIVEEARLYPAYMENT";
	public static final String INCLUSIVE_STOP_SETTLEMENT = "INCLUSIVESTOPSETTLEMENT";
	public static final String FEDI_RESPONSE_REFUND_STATUS = "FEDIRESPONSEREFUNDSTATUS";
	public static final String MONEY_REFUND_TYPE = "MONEYREFUNDTYPE";
	public static final String RESPONSE_TYPE = "RESPONSETYPE";
	public static final String IMPORT_STATUS = "IMPORTSTATUS";
	public static final String COUNTRY = "COUNTRY";
	public static final String DISTRICT = "DISTRICT";
	public static final String CITY = "CITY";
	public static final String BLOODGROUP = "BLOOD_GROUP";
	public static final String RELIGION = "RELIGION";
	public static final String CUSTOMERTYPE = "CUSTOMER_TYPE";
	public static final String COLOURVALUE = "ColorValue";
	public static final String STYLEVALUE = "StyleValue";
	public static final String ZIPCODE = "ZipCode";
	public static final String CREDIT_CARD_TYPE = "CREDITCARDTYPE";
	public static final String ORDER_HISTORY_STATUS_TYPE = "ORDERHISTORYSTATUSTYPE";
	public static String VERIFICATION_STATUS = "VerificationStatus";
	public static String VERIFICATION_RESULT = "VerificationResult";
	public static String VERIFICATION_ACTION = "VerificationAction";
	public static String CUSTOMER_ISP = "CUSTOMER_ISP";
	public static String ORDER_DAY = "ORDER_DAY";
	/* Invoice Donate Target 3851 */
	public static final String DONATED_TARGET = "Donated Target";
	public static final String BLACKTYPE = "BLACKTYPE";

	public static final String PRODUCT_DISCREPANCY_REASON = "Product Discrepancy Reason";
	public static final String DELIVERY_TYPE = "DeliveryType";
	public static final String TAX_TYPE_OAF = "Tax Type-OAF";

	public static final int PRODUCT_DISCREPANCY_REASON_SALES = 1001;
	public static final int PRODUCT_DISCREPANCY_REASON_RETURNS = 1002;
	public static final int PRODUCT_DISCREPANCY_REASON_BOTH = 1003;
	public static final int ORDER_STATUS_DELIVERY_CONFIRMED_IN_SHIPORDER = 1009;

	public static final String MONTH = "Month";
	public static final String OVERHEAD_COST_STATUS = "Overhead Cost Status";
	public static int OVERHEAD_COST_STATUS_PENDING = 1001;
	public static int OVERHEAD_COST_STATUS_CLOSED = 1002;
	public static int OVERHEAD_COST_OTHER_FEE = 9999;
	public static String CLASSCODE = "ClassCode";
	public static int CLASSCODE_3CPRODUCT = 20000;

	// Arun it3
	public static int SMSCONTENTFIELDS_CUSTOMER_ID = 1001;
	public static int SMSCONTENTFIELDS_CUSTOMER_NAME = 1002;
	public static int SMSCONTENTFIELDS_OVERDUE_AMOUNT = 1003;
	public static int SMSCONTENTFIELDS_SITE_NAME = 1004;
	public static int SMSCONTENTFIELDS_AGENTS_NICK_NAME = 1005;
	public static int SMSCONTENTFIELDS_AGENTS_EXTENSION_NO = 1006;
	public static int SMSCONTENTFIELDS_REFUND_AMOUNT = 1007;
	public static int SMSCONTENTFIELDS_REFERENCE_NUMBER = 1008;
	public static int SMSCONTENTFIELDS_REFERENCE_ITEM_NUMBER = 1009;
	public static int SMSCONTENTFIELDS_PRODUCT_NAME = 1010;

	public static final int INSTALLMENT_STATUS_AUTHORIZATION_REJECTED_BY_NCCC = 1028;
	public static final int INSTALLMENT_STATUS_ASSIGNED_FOR_COLLECTION = 1029;
	public static final int CUSTOMERCOLLECTION_CASESTATUS_ASSIGNED = 1001;
	public static final int CUSTOMERCOLLECTION_CASESTATUS_MOVE_TO_LEGAL = 1002;
	public static final int CUSTOMERCOLLECTION_CASESTATUS_MOVE_TO_OUTSOURCING_FIRST_HAND = 1003;
	public static final int CUSTOMERCOLLECTION_CASESTATUS_MOVE_TO_OUTSOURCING_SECOND_HAND = 1004;
	public static final int CUSTOMERCOLLECTION_CASESTATUS_WITHDRAWN = 1005;
	public static final int CUSTOMERCOLLECTION_CASESTATUS_COLLECTED = 1006;
	public static final int CUSTOMERCOLLECTION_CASESTATUS_WRITE_OFF = 1007;

	public static final int COLLECTION_STEPSTATUS_UNPROCESSED = 1001;
	public static final int COLLECTION_STEPSTATUS_INPROCESS = 1002;
	public static final int COLLECTION_STEPSTATUS_COMPLETED = 1003;

	public static final int BUCKETCATEGORY_TELEPHONIC = 1001;
	public static final int BUCKETCATEGORY_LEGAL = 1002;
	public static final int BUCKETCATEGORY_OUTSOURCING = 1003;

	public static final int COLLECTION_DISC_SEARCH_TYPE_BUCKET_TYPE = 1001;
	public static final int COLLECTION_DISC_SEARCH_TYPE_AGENT_ID = 1002;
	public static final int COLLECTION_DISC_SEARCH_TYPE_AGENCY_ID = 1003;

	public static final int AUTHORIZATION_REQUEST_TYPE_AUTHORIZATION_SETTLEMENT = 1001;
	public static final int AUTHORIZATION_REQUEST_TYPE_SETTLEMENT = 1002;
	public static final int AUTHORIZATION_REQUEST_TYPE_REFUND = 1003;
	public static final int AUTHORIZATION_REQUEST_TYPE_CALLBANK = 1004;
	public static final int AUTHORIZATION_REQUEST_TYPE_AUTHORIZATION = 1005;
	public static final int AUTHORIZATION_REQUEST_TYPE_CANCELAUTHORIZATION = 1006;
	public static final int NCCC_INSTALLMENT_STATUS_AUTHORIZATION_PENDING = 1001;
	public static final int NCCC_INSTALLMENT_STATUS_SETTLEMENT_PENDING = 1002;
	public static final int NCCC_INSTALLMENT_STATUS_CALLBANK = 1003;

	public static final int REQUEST_TYPE_AUTHORIZATION = 1001;
	public static final int REQUEST_TYPE_AUTHORIZATION_SETTLEMENT = 1002;

	public static final int COLLECTION_DISC_CASE_STATUS_PENDING = 1001;
	public static final int COLLECTION_DISC_CASE_STATUS_CLOSED = 1002;

	public static final int SEARCH_REQUEST_RECEIPT_ORDERID = 1001;
	public static final int SEARCH_REQUEST_RECEIPT_CUSTOMERID = 1002;
	public static final int SEARCH_REQUEST_RECEIPT_AGENTID = 1003;
	public static final int SEARCH_REQUEST_RECEIPT_REQUESTDATE = 1004;

	// Added by Sreema

	public static final String BUCKETTYPE_M1 = "M1";
	public static final String BUCKETTYPE_M2 = "M2";
	public static final String BUCKETTYPE_L1 = "L1";
	public static final String BUCKETTYPE_O1 = "O1";
	public static final String BUCKETTYPE_O2 = "O2";

	public static final int OUTSOURCING_SEARCHBY_CUSTOMERID = 1001;
	public static final int OUTSOURCING_SEARCHBY_CUSTOMERNAME = 1002;
	public static final int OUTSOURCING_SEARCHBY_AGENCYID = 1003;
	public static final int OUTSOURCING_SEARCHBY_AGENCYNAME = 1004;

	public static final int OUTSOURCING_STATUS_ALL = 1001;
	public static final int OUTSOURCING_STATUS_FIRSTHAND = 1002;
	public static final int OUTSOURCING_STATUS_SECONDHAND = 1003;
	public static final int OUTSOURCING_STATUS_FIRSTANDSECONDHAND = 1004;
	public static final int OUTSOURCING_STATUS_SUCCESSFUL = 1005;

	// Jana - Collection Domain constants
	public static final int CUSTOMERCOLLECTION_CASESTATUS_PENDING_FOR_APPROVAL = 1008;
	public static final int BUCKET_CATEGORY_TELEPHONIC = 1001;
	public static final int BUCKET_CATEGORY_LEGAL = 1002;
	public static final int BUCKET_CATEGORY_OUTSOURCING = 1003;

	public static final int OUTSOURCE_CATEGORY_FIRST_HAND = 1001;
	public static final int OUTSOURCE_CATEGORY_SECOND_HAND = 1002;

	public static final int AGENCY_PAYMENT_MODE_MONTHLY = 1001;
	public static final int AGENCY_PAYMENT_MODE_BATCHWISE = 1002;

	public static final int AGENCY_CONTACT_MODE_FAX = 1001;
	public static final int AGENCY_CONTACT_MODE_EMAIL = 1002;

	public static final int STEPTYPE_SMS = 1001;
	public static final int STEPTYPE_TEL = 1002;
	public static final int STEPTYPE_DOC = 1003;

	public static final int DOCUMENTMODE_INCOMING = 1001;
	public static final int DOCUMENTMODE_OUTGOING = 1002;

	public static final int DOCUMENTSTATUS_SENT = 1001;
	public static final int DOCUMENTSTATUS_PRINTPENDING = 1002;
	public static final int DOCUMENTSTATUS_PRINTED = 1003;
	public static final int DOCUMENTSTATUS_RECEIVED = 1004;

	public static final int WRITEOFFREASON_FRAUD = 1001;
	public static final int WRITEOFFREASON_COLLECTIONFAILURE = 1002;
	public static final int WRITEOFFREASON_SPECIALPROJECT = 1003;
	public static final int WRITEOFFREASON_CUSTOMERDIED = 1004;
	public static final int WRITEOFFREASON_AGREEDDISCOUNT = 1005;
	public static final int WRITEOFFREASON_OTHERS = 1006;

	// Added by uma
	public static final int SEARCHBYORDERDATE = 1001;
	public static final int SEARCHBYRECEIPTDATE = 1002;
	public static final int SEARCHBYCOSTVERIFICATIONDATE = 1003;
	public static final int SEARCHBYUSEDDATE = 1004;
	public static final int SEARCHBYCUSTOMERID = 1001;
	public static final int SEARCHBYORDERID = 1002;
	public static final int SEARCHBYSUPPLIERID = 1003;
	public static final int SEARCHBYPRODUCTID = 1004;
	public static final int SEARCHBYMERCHANDISEADMIN = 1005;
	public static final int SEARCHBYCOSTVERIFICATIONCODE = 1006;
	public static final int SEARCHBYRECEIPTNUMBER = 1007;
	public static final int TRAVELRECORDSTATUS = 1001;

	// Pradheepa It3
	public static final int REBATE_DEDUCTIBLE_COST_OF_SALES_EXPENSES = 1;
	public static final int REBATE_DEDUCTIBLE_FIXED_ASSETS = 2;
	public static final int REBATE_NON_DEDUCTIBLE_COST_OF_SALES_EXPENSES = 3;
	public static final int REBATE_NON_DEDUCTIBLE_FIXED_ASSETS = 4;
	public static final int REBATE_BLANK = 0;

	public static final int MANUAL_INVOICE_TYPE_OUTDOOR = 1001;
	public static final int MANUAL_INVOICE_TYPE_PRORDER = 1002;
	public static final int MANUAL_INVOICE_TYPE_COMPANYORDER = 1003;
	public static final int MANUAL_INVOICE_TYPE_FUNERARY = 1004;// ==add by
																// Arnold

	public static final int INVOICE_SETUP_ISSUE_TYPE_NORMAL = 1001;
	public static final int INVOICE_SETUP_ISSUE_TYPE_MANUAL = 1002;

	public static final int INVOICE_DELIVERY_TYPE_WITHOUT = 1000;

	public static final int INVOICE_TAX_TYPE_OAF_LEVY = 1002;
	public static final int INVOICE_TAX_TYPE_OAF_NONE = 1004;
	public static final int INVOICE_TAX_TYPE_OAF_FREE_OF_TAX = 1001;
	public static final int INVOICE_TAX_TYPE_OAF_SPECIAL_CONSUMPTION_TAX = 1003;
	public static final int INVOICE_TAX_TYPE_OAF_SPOILT = 0;

	public static final int INVOICE_TRANSACTION_CODE_CUSTOMER_SALES = 31;
	public static final int INVOICE_TRANSACTION_CODE_CUSTOMER_RETURNS = 33;

	public static final String INVOICE_IS_RETURN_Y = "Y";
	public static final String INVOICE_IS_RETURN_N = "N";

	public static final int SEARCH_TYPE_AUTO_INV_DATE_ORDER_DATE = 1001;
	public static final int SEARCH_TYPE_AUTO_INV_DATE_SHIPPING_NOT_DATE = 1002;
	public static final int SEARCH_TYPE_AUTO_INV_DATE_RETURN_DATE = 1003;
	// (2007/2/1) Amanda:CR-478 & CR-454
	public static final int SEARCH_TYPE_AUTO_INV_DATE_ACTUAL_DELIVERY_DATE = 1004;

	public static final int SEARCH_TYPE_AUTO_INV_ORDERID = 1001;
	public static final int SEARCH_TYPE_AUTO_INV_CUSTOMERID = 1002;
	public static final int SEARCH_TYPE_AUTO_INV_CUSTOMER_NAME = 1003;
	public static final int SEARCH_TYPE_AUTO_INV_INVOICE_NUMBER = 1004;
	public static final int SEARCH_TYPE_AUTO_INV_SUPPLIER_ID = 1005;

	// ADDED FOR RISKMANAGEMENT
	public static String RISKSCOREATTRIBUTE = "RiskScoreAttribute";
	public static String RISKFACTORCATEGORY = "RiskFactorCategory";

	public static int RISKFACTORCATEGORY_PERSONAL = 1001;
	public static int RISKFACTORCATEGORY_ORDER = 1002;
	public static int RISKSCOREATTRIBUTE_HIGHEST_CREDIT_CARD_LEVEL = 1001;
	public static int RISKSCOREATTRIBUTE_NO_OF_TIMES_FOR_PURCHASES_BY_ITEM = 1002;
	public static int RISKSCOREATTRIBUTE_NO_OF_CREDIT_CARDS = 1003;
	public static int RISKSCOREATTRIBUTE_GENDER = 1004;
	public static int RISKSCOREATTRIBUTE_NO_OF_VALID_ORDERS = 1005;
	public static int RISKSCOREATTRIBUTE_EDUCATIONAL_QUALIFICATION = 1006;
	public static int RISKSCOREATTRIBUTE_AGE = 1007;
	public static int RISKSCOREATTRIBUTE_ISP = 1008;
	public static int RISKSCOREATTRIBUTE_NO_OF_TIMES_OF_DELIVERY_ADDRESS = 1009;
	public static int RISKSCOREATTRIBUTE_MONTHLY_INCOME = 1010;
	public static int RISKSCOREATTRIBUTE_MARRIED = 1011;
	public static int RISKSCOREATTRIBUTE_RELIGION = 1012;
	public static int RISKSCOREATTRIBUTE_MONTHLY_AVERAGE_PURCHASING_AMOUNT = 1013;
	public static int RISKSCOREATTRIBUTE_PURCHASING_HISTORY = 1014;
	public static int RISKSCOREATTRIBUTE_RATIO_OF_NO_OF_FAILED_DEDUCTION_CASES = 1015;
	public static int RISKSCOREATTRIBUTE_RATIO_OF_NO_OF_DELINQUENT_CASES = 1016;
	public static int RISKSCOREATTRIBUTE_RATIO_OF_NO_ACCOUNT_RECIEVABLE_AMT_TO_ORDER_AMOUNT = 1017;
	public static int RISKSCOREATTRIBUTE_PRODUCT_CATEGORY = 1018;
	public static int RISKSCOREATTRIBUTE_ISSUING_BANK_CATEGORY = 1019;
	public static int RISKSCOREATTRIBUTE_TIME_OF_ORDER = 1020;
	public static int RISKSCOREATTRIBUTE_POSTAL_AREA_CODE_PREFIX = 1021;
	public static int RISKSCOREATTRIBUTE_ORDER_DATE = 1022;
	public static int RISKSCOREATTRIBUTE_SEQUENCE_NO_OF_DELIVERY_ADDRESS = 1023;
	public static int RISKSCOREATTRIBUTE_CREDIT_CARD_COMPANY = 1024;
	public static int RISKSCOREATTRIBUTE_ORDER_DAY = 1025;
	public static String RULEPARAMETER = "RuleParameter";
	public static String RULEOPERATOR = "RuleOperator";

	public static int RULEPARAMETER_PRODUCT_AMOUNT = 1001;
	public static int RULEPARAMETER_NO_OF_ORDERS = 1002;
	public static int RULEPARAMETER_NO_OF_ADDRESSES = 1003;
	public static int RULEPARAMETER_PRODUCT_MIDDLE_CATEGORY = 1004;
	public static int RULEPARAMETER_ORDER_DATE = 1005;
	public static int RULEPARAMETER_FIRST_ORDER_DATE = 1006;
	public static int RULEPARAMETER_ORDER_AMOUNT = 1007;

	public static String MAINFIRSTSTAGEFACTOR = "MainFirstStageFactor";
	public static String MIDDLESTAGESECONDLEVELFACTOR = "MiddleStageSecondLevelFactor";

	public static int MAINFIRSTSTAGEFACTOR_FIRST_STAGE_FACTOR = 1001;
	public static int MAINFIRSTSTAGEFACTOR_MAIN_FACTOR = 1002;
	public static int MAINFIRSTSTAGEFACTOR_CONSTANT_FACTOR = 1003;

	public static int MIDDLESTAGESECONDLEVELFACTOR_SECOND_LEVEL_FACTOR = 1001;
	public static int MIDDLESTAGESECONDLEVELFACTOR_MIDDLE_STAGE_FACTOR = 1002;

	public static int RULEOPERATOR_LESS_THAN = 1001;
	public static int RULEOPERATOR_GREATER_THAN = 1002;
	public static int RULEOPERATOR_EQUAL_TO = 1003;
	public static int RULEOPERATOR_NOT_EQUAL = 1004;
	public static int RULEOPERATOR_BETWEEN = 1005;

	public static String PROCESSTYPE = "ProcessType";
	public static String PROCESSOUTCOME = "ProcessOutcome";

	public static int PROCESSTYPE_FRAUD_RULE = 1001;
	public static int PROCESSTYPE_ACCOUNTING_RULE = 1002;
	public static int PROCESSTYPE_CREDIT_LIMIT_CHECK = 1003;
	public static int PROCESSTYPE_ORDER_SCORE_CALCULATION = 1004;
	public static int PROCESSTYPE_PERSONAL_SCORE_CALCULATION = 1005;

	public static int PROCESSOUTCOME_SUCCESS = 1001;
	public static int PROCESSOUTCOME_FAILURE = 1002;
	public static int PROCESSOUTCOME_REVERIFY1 = 1003;
	public static int PROCESSOUTCOME_REVERIFY2 = 1004;

	public static String CREDITLEVELCATEGORY = "CreditLevelCategory";
	public static int CREDITLEVELCATEGORY_NORMAL = 1001;
	public static int CREDITLEVELCATEGORY_FRAUD = 1002;
	public static int CREDITLEVELCATEGORY_DELINQUENT = 1003;
	// ADDED FOR RISKMANAGEMENT

	public static final int BILLING_SEARCHFOR_ALLCASES = 1001;
	public static final int BILLING_SEARCHFOR_DELINCASES = 1002;
	public static final int BILLING_SEARCHFOR_NORMALCASES = 1003;

	public static final String SELYEAR = "Year";
	public static final int STARTINGYEAR = 1001;
	public static final int ENDINGYEAR = 1002;

	// Supplier Settlement Status

	public static final int SUPPLIERSETTLEMENT_STATUS_PENDING = 1001;
	public static final int SUPPLIERSETTLEMENT_STATUS_APPROVED = 1002;
	// FOR CONFIRMED INVOICE
	public static final int SUPPLIERSETTLEMENT_STATUS_POSTED = 1003;
	// FOR APPROVED INVOICE

	// Collection Customer Status Cases

	public static final int CUSTOMERCOLLECTION_CASESTATUS_MOVETOLEGAL = 1002;
	public static final int CUSTOMERCOLLECTION_CASESTATUS_MOVETOFIRSTHANDOUTSOURCING = 1003;
	public static final int CUSTOMERCOLLECTION_CASESTATUS_MOVETOSECONDHANDOUTSOURCING = 1004;

	// Transfer account number setup - purchase type and account type
	public static final int ACCOUNTTYPE_SETTLEMENT_ATM = 1001;
	public static final int ACCOUNTTYPE_SETTLEMENT_POST = 1002;
	public static final int ACCOUNTTYPE_COLLECTION_ATM = 1003;
	public static final int PURCHASETYPE_NORMAL = 1;
	public static int PURCHASETYPE_GIFT_COUPON = 2;
	public static int PURCHASETYPE_PICKUP_CERTIFICATE = 3;
	public static int PURCHASETYPE_AUTOMOBILE = 4;

	// Verification Status Constants
	public static final int VERIFICATIONSTATUS_DELIVER_ORDER = 1001;
	public static final int VERIFICATIONSTATUS_VERIFICATION_PENDING = 1002;
	public static final int VERIFICATIONSTATUS_ASSIGNED_FOR_MANUAL_VERIFICATION = 1003;

	// prefered refund payment mode
	public static final int PREFFERED_REFUND_CREDIT_CARD = 1002;
	public static final int PREFFERED_REFUND_CHEQUE = 1003;
	public static final int PREFFERED_REFUND_BANK_AC = 1004;
	public static final int PREFFERED_REFUND_CUSTOMER_AC = 1005;
	public static final int PREFFERED_REFUND_BONUSPOINT_AC = 1006;
	public static final int PREFFERED_REFUND_GIFT_AC = 1007;
	public static final int PREFFERED_REFUND_PICKUP_AC = 1008;
	public static final int PREFFERED_REFUND_CASH_AC = 1009;
	public static final int PREFFERED_REFUND_BANKMANUAL_AC = 1010;

	// Installment reminder
	public static int REMINDERCALCULATION_ROUND = 1001; // This value need to
														// come from IT3
	public static int REMINDERCALCULATION_TRUNCATE = 1002; // This value need to
															// come from IT3
	public static int REMINDERADJUSTMENT_FIRST = 1001; // This value need to
														// come from IT3
	public static int REMINDERADJUSTMENT_LAST = 1002; // This value need to come
														// from IT3*/

	// Added on 20/06/2005 for bug fixing by purush
	public static int EXPIRYDATEVERIFICATION_CURRENTMONTH = 1001;
	public static int EXPIRYDATEVERIFICATION_CURRENTMONTHPLUSONE = 1002;
	public static int EXPIRYDATEVERIFICATION_CURRENTMONTHPLUSINSTALLMENT = 1003;
	public static int EXPIRYDATEVERIFICATION_NOVERIFICATION = 1004;

	// CC Card type
	public static int CREDITCARDTYPE_VISA = 1900;
	public static int CREDITCARDTYPE_MASTER = 1901;
	public static int CREDITCARDTYPE_JCB = 1902;
	public static int CREDITCARDTYPE_UCARD = 1903;
	public static int CREDITCARDTYPE_DINERS = 1904;
	public static int CREDITCARDTYPE_AMEX = 1905;

	// Delayed installment
	public static final int IS_DELAYED_INSTALLMENT_YES = 1001;
	public static final int IS_DELAYED_INSTALLMENT_NO = 1002;
	public static final int DELAYED_INSTALLMENTS_THREE = 3;
	public static final int DELAYED_INSTALLMENTS_FOUR = 4;

	// Change Card Request Status
	public static final int CHANGECARD_REQUEST_PENDING = 1001;
	public static final int CHANGECARD_REQUEST_SENT = 1002;
	public static final int CHANGECARD_REQUEST_DISCARDED = 1003;

	// Acquiring Bank Setup Authorizing Amount Type -Added for Virtual Payment
	// Gateway
	public static final int AUTHORISING_AMOUNT_TYPE_FULL = 1003;
	public static final int AUTHORISING_AMOUNT_TYPE_HALF = 1002;
	public static final int AUTHORISING_AMOUNT_TYPE_FIRST = 1001;

	// Added on 26-Sep-05 for incorporating UBOT CR Changes
	public static final int AUTH_REQTYPE_AUTHORIZATION = 1001;
	public static final int AUTH_REQTYPE_SETTLEMENT = 1002;

	// constants for Search Travel Monthly Close Batch
	public static final int TRAVEL_PRODUCT_SETTLEMENT_RETURN = 1001; // RETURN
	public static final int TRAVEL_PRODUCT_SETTLEMENT_CANCEL = 1002; // CANCEL
	public static final int TRAVEL_PRODUCT_SETTLEMENT_ADVANCED_RECEIPT = 1003; // ADVANCED_RECEIPT
	public static final int TRAVEL_PRODUCT_SETTLEMENT_SETTLED = 1004; // SETTLED

	// constants OutDoor Invoice DebitNote SearchType
	public static final int OUTDOOR_INVOICE_DEBITNOTE_SEARCHTYPE_ORDERID = 1001; // ORDERID
	public static final int OUTDOOR_INVOICE_DEBITNOTE_SEARCHTYPE_INVOICENO = 1002; // INVOICENO
	public static final int OUTDOOR_INVOICE_DEBITNOTE_SEARCHTYPE_SETTLEMENTDATE = 1003; // SETTLEMENTDATE
	public static final int OUTDOOR_INVOICE_DEBITNOTE_SEARCHTYPE_INVOICEISSUEDATE = 1004; // INVOICEISSUEDATE
	public static final int OUTDOOR_INVOICE_DEBITNOTE_SEARCHTYPE_PARTAILRETURNDATE = 1005; // PARTAILRETURNDATE

	// constants Partial Refund Processing SearchType
	public static final int PARTIAL_REFUND_SEARCHTYPE_INVOICENO = 1001; // INVOICENO
	public static final int PARTIAL_REFUND_SEARCHTYPE_CUSTOMERID = 1002; // CUSTOMERID
	public static final int PARTIAL_REFUND_SEARCHTYPE_INVOICE_RETURNDATE = 1003; // INVOICE
																					// RETURN
																					// DATE

	// funerarystatus Arnold
	public static final int UPDATE_DELIVERY_DATE = 1001; // FUNERARYSTATUS
	public static final int IMPORT_TO_INVOICE = 1002; // FUNERARYSTATUS

	// Batch OAF_101 add by steven 2006-04-15 for Defect368
	public static final int PRODUCT_FUNERARY_SCLASSCODE = 70302;

	public static final int LOGISTICSSTATUS_IN_CARRIERASSIGNED = 1007;
	public static final int LOGISTICSSTATUS_IN_TRANSIT = 1008;
	public static final int LOGISTICSSTATUS_DELIVERED = 1009;
	public static final int LOGISTICSSTATUS_DELIVERY_FAIL = 1010;
	public static final int LOGISTICSSTATUS_DELIVERY_ABORT = 1011;
	public static final int LOGISTICSSTATUS_USED = 1012;

	// 20080319 CR_5290 added by betty
	public static final int LOGISTICSSTATUS_RETURN_INTERACTION = 1008;

	public static final int DELIVERYTYPE_NORMAL = 1001;
	public static final int DELIVERYTYPE_PRIVILEGE = 1003;
	public static final int DELIVERYTYPE_DIRECT = 1002;
	public static final int DELIVERYTYPE_TRAVEL = 1004;

	/* (97/01/23) fuxiang: CR4353. defined SubDelivery type */
	public static final int SUBDELIVERYTYPE_NORMAL = 1001; // Normal
	public static final int SUBDELIVERYTYPE_SUPPLIER = 1002; // Carrier To
																// Supplier
																// PickUp
	public static final int SUBDELIVERYTYPE_STORE = 1003; // Carrier To Shop
															// Pickup

	public static final int PRODUCTRETURNSTATUS_RETURN_CANCELLED = 1008;

	/* Funerary Invoice Type 3995 */
	public static final int FUNERARY_INVOICE_TYPE_NORMAL = 1001;
	public static final int FUNERARY_INVOICE_TYPE_MANUAL = 1002;

	/* Print Status 3996 */
	public static final int PRINT_STATUS_PENDING = 1001;
	public static final int PRINT_STATUS_PRINTED = 1002;
	public static final int PRINT_STATUS_INVALID = 1003;

	public static final int RETURNPRODUCTS_TYPE_RETURN = 1001;
	public static final int RETURNPRODUCTS_TYPE_EXCHANGE = 1002;
	public static final int RETURNPRODUCTS_TYPE_REPLACE = 1003;

	/* Supplier Overhead Cost Temp Status 3999 */
	public static final int OVERHEAD_COST_TEMP_STATUS_IMPORT = 1001;
	public static final int OVERHEAD_COST_TEMP_STATUS_FAIL = 1002;
	public static final int OVERHEAD_COST_TEMP_STATUS_SUCCESS = 1003;
	public static final int OVERHEAD_COST_TEMP_STATUS_CLOSE = 1004;
	public static final int DEFAULT_COMPAMY_ID = 1;

	/* CR 1945 COUPONDELIEVERYTYPE */
	public static final int COUPONDELIEVERYTYPE_POST = 1001;
	public static final int COUPONDELIEVERYTYPE_FLUSH = 1002;
	public static final int COUPONDELIEVERYTYPE_FAX = 1003;
	public static final int COUPONDELIEVERYTYPE_EMAIL = 1004;

	/* RECEIPTREQUIRETYPE */
	public static final int NEED = 1001;
	public static final int NOT_REQUIRED_FOR_THIS_TRANSCATION = 1002;
	public static final int NOT_REQUIRED_FROM_NOW_ON = 1003;

	/* PaymentGatewayPlatform 3931 */
	public static final int PaymentGatewayPlatform_NCCC = 1001;
	public static final int PaymentGatewayPlatform_ACER = 1002;
	public static final int PaymentGatewayPlatform_CHINATRUST = 1003;
	public static final int PaymentGatewayPlatform_TAISHIN = 1004;

	/* CR-5342 bankId constants */
	public static final int TCB_BANKID = 39;
	public static final int TCB_BANKID_COLLECTION = 70;
	public static final int CHINA_TRUST_BANKID = 52;
	public static final int CHINA_TRUST_BANKID_COLLECTION = 271;

	/* CR 6906 Reserved order fail reason */
	public static final int AUTHORIZATION_FIAL = 101;
	public static final int CREDIT_CARD_UNVALIED = 102;
	public static final int INSTALLMENT_ERROR = 103;
	public static final int CUSTOMER_EFFECTIVE_BALANCE_NOT_ENOUGH = 104;
	public static final int CUSTOMER_LIMIT_NOT_ENOUGH = 105;
	public static final int PRODUCT_QUANTITY_NOT_ENOUGH = 106;

	/* CR 5556 */
	public static final int LEGAL_PAPER_STATUS_INITIAL = 1001;
	public static final int LEGAL_PAPER_STATUS_PERPARE_PRINT = 1002;
	public static final int LEGAL_PAPER_STATUS_PRINTED = 1003;
	public static final int POST_NUMBER_NANSHIJIAO = 1001;
	public static final int POST_NUMBER_CHONGCHEN_RODE = 1002;
	public static final int WRITEOFF_CLUSTER_CREATED = 1001;
	public static final int WRITEOFF_CLUSTER_PREPARE_TO_WRITEOFF = 1002;
	public static final int WRITEOFF_LEGAL_PRINTED = 1003;
	public static final int WRITEOFF_CONFIRM = 1004;
	public static final int RETURN_STATUS_DOMAIN_CODE = 3318;
	/* CR 5556 */

	/* CR 8830 */
	public static final int COLLECTION_PROCESS_LEGEAL = 3;

	/* CR 9389 */
	public static final int COLLECTION_AGENT_PERFORMANCE_TYPE_DAILY = 1001;
	public static final int COLLECTION_AGENT_PERFORMANCE_TYPE_REALLOCATION = 1002;
	public static final int COLLECTION_AGENT_PERFORMANCE_TYPE_ALLOCATION = 1003;
	/* CR 9389 */

	/* CR3317 */
	// product sub return type
	public static final int CARRIER_TO_SUPPLIER_PICKUP = 1002;

	// EXECUTEIONTYPE
	public static final int EXECUTEIONTYPE_EXPIRE_DATE_REJECT = 1001;

	// JUDGETYPE
	public static final int JUDGETYPE_EXPIRE_DATE_FORMAT = 1001;
	public static final int JUDGETYPE_EXPIRE_RETURN_CODE = 1002;

	// SETTLEMENTTYPE
	public static final int ROLLBACK_SETTLEMENT = 1001;
	public static final int ROLLBACK_REFUND = 1002;

	// REQUIRELOG_TYPE
	public static final int REQUIRELOG_TYPE_ROLLBACK_SETTLEMENT = 4;
	public static final int REQUIRELOG_TYPE_ROLLBACK_REFUND = 5;
	public static final int REQUIRELOG_TYPE_UPD_EXP_OF_ROLLBACK_SETTLEMENT = 6;
	public static final int REQUIRELOG_TYPE_UPD_EXP_OF_ROLLBACK_REFUND = 7;
	public static final int REQUIRELOG_TYPE_CT_ROLLBACK_SETTLEMENT = 8;
	public static final int REQUIRELOG_TYPE_CT_ROLLBACK_REFUND = 9;
	public static final int REQUIRELOG_TYPE_ROLLBACK_SETTLEMENT_CTCB = 10;
	public static final int REQUIRELOG_TYPE_ROLLBACK_REFUND_CTCB = 11;

	public static final int ACQUIRING_BANK_TAISHIN_CONTRACT_BANKID = 287;
	public static final int ACQUIRING_BANK_TAISHIN_2_BANKID = 289;
	public static final int ACQUIRING_BANK_CHINA_TRUST_2_BANKID = 270;

	public static final int NO_OF_INSTALLMENT_0 = 0;

	public static final int INSTALLMENT_NO_1 = 1;

	// Product status
	public static final int PRODUCT_STATUS_INACTIVE = 1001;
	public static final int PRODUCT_STATUS_FOR_SALE = 1002;

	// Catalog Offer Status(tscm_categoryoffer.status)
	public static final int CATALOG_OFFER_STATUS_IMPORT_SPM = 1001;
	public static final int CATALOG_OFFER_STATUS_SUPPLIER_EXPORT = 1002;

	//
	public static final int COLLECTIONRETURNLOG_REFUND_BUILDED = 1001;
	public static final int COLLECTIONRETURNLOG_REFUND_NOT_BUILDED = 1002;

	public static final String REPROTMASTER_STATUS_ENABLE = "10";
	public static final String REPROTMASTER_STATUS_FAIL = "20";
	public static final String REPROTMASTER_STATUS_RUN_IMMEDIATELY = "30";
	public static final String REPROTMASTER_STATUS_QUEUE = "40";
	public static final String REPROTMASTER_STATUS_RUNNING = "41";
	public static final String REPROTMASTER_STATUS_DISABLE = "50";
	public static final String REPROTMASTER_STATUS_ILLEGAL = "60";
	public static final int REPROTMASTER_REPORTTYPE_ONLINEJOB = 2;
	public static final int REPROTMASTER_REPORTTYPE_JOB = 1;
	public static final int REPROTMASTER_SQLID_ZERO = 0;
	public static final String REPROTMASTER_RUNTIMEBY_HOUR = "10";
	public static final String REPROTMASTER_RUNTIMEBY_DAY = "20";
	public static final String REPROTMASTER_RUNTIMEBY_WEEK = "30";
	public static final String REPROTMASTER_RUNTIMEBY_MONTH = "40";
	public static final String REPROTMASTER_RUNTIMEBY_ENDOFMONTH = "50";
	public static final String REPROTMASTER_RUNTIMEBY_DESIGNATE = "90";
	public static final String REPROTMASTER_RUNTIMEBY_ONCE = "99";

	// TCMN_REPORTROLE.ACCOUNTTYPE
	public static final int REPORTROLE_ACCOUNTTYPE_USERID = 2;
	public static final int REPORTROLE_ACCOUNTTYPE_ROLEID = 1;

	public static final String PALTFORMSWITCH = "PALTFORMSWITCH";
	public static final String SWITCHPAYMENTGETWAYPLATFORM = "SwitchPaymentGetwayPlatform";
	// TOAF_PLATFORMSWITCH_LOG.SWITCHTYPE
	public static final int SWITCHTYPE_SWITCH = 1;
	public static final int SWITCHTYPE_ROLLBACK = 2;
	public static final int PAYMENTGATEWAYPLATFORM_DOMAINID = 3931;

	// executionType
	public static final int EXECUTIONTYPE_ROLLBACK_SETTLEMENT_OR_REFUND_BY_EXPDATE_REJECT = 1001;
	public static final int EXECUTIONTYPE_CORRECT_SETTLEMENT_OR_REFUND_CTCB = 1002;
	public static final int EXECUTIONTYPE_ROLLBACK_SETTLEMENT_OR_REFUND_CTCB = 1003;

	public static final String CATALOGS_REPORTCODE = "ONLCAT001";
	public static final String PICKUPCERT_REPORTCODE_SALE = "ONLARP001";
	public static final String PICKUPCERT_REPORTCODE_RETURN = "ONLARP002";
	public static final String PICKUPCERT_REPORTCODE_RETURN_1 = "ONLARP003";
	public static final String PICKUPCERT_REPORTCODE_RETURN_2 = "ONLARP004";
	public static final String PICKUPCERT_REPORTCODE_RETURN_3 = "ONLARP005";
	public static final String PICKUPCERT_REPORTCODE_RETURN_4 = "ONLARP006";

	public static final int BONUS_POINTS_BATCH_TYPE_ADD = 1001;
	public static final int BONUS_POINTS_BATCH_TYPE_SUBTRACTION = 1002;
	public static final int LOTTERY_BONUS_IMPORT_ADD = 1003;
	public static final String BONUS_POINTS_BATCH_TYPE_ADD_STR = "C";
	public static final String BONUS_POINTS_BATCH_TYPE_SUBTRACTION_STR = "D";

	public static final int BONUS_POINTS_BATCH_RESULT_SUCCESS = 1001;
	public static final int BONUS_POINTS_BATCH_RESULT_FAIL = 1002;
	public static final int BONUS_POINTS_BATCH_RESULT_ERROR = 1003;
	public static final int BONUS_POINTS_BATCH_LOTTERY_BONUS_RESULT_SUCCESS = 1004;
	public static final int BONUS_POINTS_BATCH_LOTTERY_BONUS_RESULT_FAIL = 1005;
	public static final int BONUS_POINTS_BATCH_LOTTERY_BONUS_RESULT_ERROR = 1006;

	public static final int BONUS_POINTS_BATCH_CHECKRESULT_SUCCESS = 1001;
	public static final int BONUS_POINTS_BATCH_CHECKRESULT_RELATED_ERROR = 1002;
	public static final int BONUS_POINTS_BATCH_CHECKRESULT_ORDERID_ERROR = 1003;
	public static final int BONUS_POINTS_BATCH_CHECKRESULT_CUSTOMERID_ERROR = 1004;
	public static final int BONUS_POINTS_BATCH_CHECKRESULT_COMPANY_ERROR = 1005;

	public static final String DOMAINNAME_ACCOUNT_REFERENCE_TYPE = "ACCOUNT_REFERENCE_TYPE";
	public static final int DOMAINID_REFERENCE_TYPE = 4136;
	public static final int ACCOUNT_REFERENCE_TYPE_COMPLAINT = 4188;
	public static final int ACCOUNT_REFERENCE_TYPE_CAMPAIGN = 4189;
	public static final int ACCOUNT_REFERENCE_TYPE_ORDER = 4190;
	public static final int ACCOUNT_REFERENCE_TYPE_RETURN = 4191;
	public static final int BONUS_POINTS_BATCH_CHECKRESULT = 1002;

	public static final long BONUS_POINTS_BATCH_ROLE_ADD = 11145;
	public static final long BONUS_POINTS_BATCH_ROLE_SUBTRACT = 11146;

	public static final String LOTTERYBONUS_EXCLUSION_PRODUCTID = "1030";
	public static final String LOTTERYBONUS_EXCLUSION_SCLASS = "1010";
	public static final String LOTTERYBONUS_EXCLUSION_MCLASS = "1020";
	public static final String LOTTERYBONUS_EXCLUSION_MULTICODEID = "1040";
	public static final String LOTTERYBONUS_EXCLUSION_VP = "1050";

	public static final String LOTTERYBONUS_REFERENCETYPE_ORDERID = "1010";
	public static final String LOTTERYBONUS_REFERENCETYPE_COMPLAINT = "1020";

	public static final String LOTTERYBONUS_TRANSACTIONTYPE_SELECT = "1";
	public static final String LOTTERYBONUS_TRANSACTIONTYPE_CAMPAIGN = "1010";
	public static final String LOTTERYBONUS_TRANSACTIONTYPE_COMPLAINT = "1020";
	public static final String LOTTERYBONUS_TRANSACTIONTYPE_ORDERDEDUCT = "1030";
	public static final String LOTTERYBONUS_TRANSACTIONTYPE_ORDERCANCEL = "1040";
	public static final String LOTTERYBONUS_TRANSACTIONTYPE_ORDERRETURN = "1050";
	public static final String LOTTERYBONUS_TRANSACTIONTYPE_SPECIALADD = "1060";
	public static final String LOTTERYBONUS_TRANSACTIONTYPE_SPECIALREFUND = "1070";
	// xialiang 20131204 新增积分交易类型
	public static final String LOTTERYBONUS_TRANSACTIONTYPE_AUTOADD = "1080";

	public static final String LOTTERYBONUS_TRANSACTIONTYPE_OTHER = "0";

	public static final String LOTTERYBONUS_REFUND_RETURN = "1010";
	public static final String LOTTERYBONUS_REFUND_NONE = "1020";

	public static final int SMS_TAKEORDER_TRANSRESULT_SUCCESS = 1101;
	public static final int SMS_TAKEORDER_TRANSRESULT_INVAILDMOBILE = 1201;
	public static final int SMS_TAKEORDER_TRANSRESULT_INVAILDCUST = 1202;
	public static final int SMS_TAKEORDER_TRANSRESULT_PRODUCTINVALID = 1203;
	public static final int SMS_TAKEORDER_TRANSRESULT_WITHOUTLIVEMULTICODE = 1204;
	public static final int SMS_TAKEORDER_TRANSRESULT_EXCLUDEPRODUCT = 1205;
	public static final int SMS_TAKEORDER_TRANSRESULT_NOTSALE = 1206;
	public static final int SMS_TAKEORDER_TRANSRESULT_EXCLUDEDELIVERY = 1207;
	public static final int SMS_TAKEORDER_TRANSRESULT_PAUSE = 1208;
	public static final int SMS_TAKEORDER_TRANSRESULT_NOTUNIQUEPRODUCT = 1209;
	public static final int SMS_TAKEORDER_TRANSRESULT_OTHERFAIL = 1210;

	public static final int DISCOUNTUNITID_PERCENT = 4182;
	public static final int DISCOUNTUNITID_AMOUNT = 4183;

	public static final int COMPLAIN_PRIORITYID_HIGH = 1001;
	public static final int COMPLAIN_PRIORITYID_MEDIUM = 1002;
	public static final int COMPLAIN_PRIORITYID_LOW = 1003;

	public static final long COMPLAIN_GROUPID_CUSTOMERTWO = 3010;
	public static final long COMPLAIN_GROUPID_PLATINUM = 3020;
	public static final long COMPLAIN_GROUPID_ETMALLSERVICE = 3030;

	public static final int COMPLAINTEXCEPT_DATATYPE_PRODUCT = 1;
	public static final int COMPLAINTEXCEPT_DATATYPE_MULTICODEID = 2;

}
