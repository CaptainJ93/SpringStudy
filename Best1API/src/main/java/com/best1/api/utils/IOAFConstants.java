package com.best1.api.utils;

public interface IOAFConstants {
/****************************** Session Name Constants ******************************/
	public static final String S_BONUSPOINTSBATCHSO = "bonusPointsBatchSO";
	public static final String S_BONUSPOINTS_COUNT = "BONUSPOINTS_COUNT_RESULT";
	
	
/************************************************************************************/
                   
	public static final int DASH_REFRESH_INVOKEDFROM_RETURN=1;
	public static final int DASH_REFRESH_INVOKEDFROM_ORDER=2;

	public static final String USER_LOCALE = "USER_LOCALE";
	public static final String CHINESE_USER = "ch_ZH";
	public static final String ENGLISH_USER = "en_US";
	public static final String EHSN_CONFIG_FOLDER = "ehsnconfig/";
	public static final String EHSN_DATA_SOURCE = "EHSNDS";
	public static final String CHANGE_PASSWORD_MENUID = "6";
	public static final String SWITCH_ROLE_MENUID = "7";
	public static final String ERROR_DATA_LIST = "ERROR_DATA_LIST";
	public static final String AMOUNT_DETAILS = "AMOUNT_DETAILS";

	public static final String PAYMENT_AMOUNT = "PAYMENT_AMOUNT";
	public static final String AMOUNT_EXPECTED = "AMOUNT_EXPECTED";
	public static final String CAMPAIGN_ORDER_SUMMARY =	"ManageCampaignSummaryEJBJNDI";
	public static final short TASK_TYPE_WORKFLOW = 1;
	public static final String SECURITY_SERVICE = "SecurityServiceEJBJNDI";
	public static final String WORKFLOW_SERVICE = "WorkFlowServiceEJBJNDI";
	public static final String DOMAIN_SERVICE =
		"ManageDomainDataServiceEJBJNDI";
	public static final String CUSTOMER_SERVICE = "CustomerServiceEJBJNDI";
	public static final String ADDRESS_SELECTION_SERVICE =
		"AddressSelectionServiceEJBJNDI";
	public static final String POST_PROOF_OF_RECEIPT_MGMT_SERVICE =
		"PostProofofReceiptMgmtServiceEJBJNDI";
	public static final String POST_RECEIPT_BATCH_DAO =
		"ehsn.et1.db.oaf.batch.dao.PostReceiptBatchDAO";
	public static final String POST_ACKNOWLEDGEMENT_BATCH_DAO =
	"ehsn.et1.db.oaf.batch.dao.PostAcknowledgementBatchDAO";

	public static final int WORKFLOW_CAPACITY = 2;
	// public static final String COMMON_QUERY_FILE = "common_query.properties";
	public static final String CORE_QUERY_FILE = "core_query.properties";
	public static final String CM_QUERY_FILE = "cm_query.properties";
	public static final String CRM_QUERY_FILE = "crm_query.properties";
	public static final String SCM_QUERY_FILE = "scm_query.properties";
	public static final String OF_QUERY_FILE = "of_query.properties";

	//From G M Karthik
	public static final char MATCHED_TO_ORDER_SHORTAGE = 'S';
	public static final char MATCHED_TO_ORDER_MATCHED_AND_REFUNDED = 'M';
	public static final char MATCHED_TO_ORDER_NO_MATCH_REFUNDED= 'R';
	public static final Object OAF = null;
	public static final String SECURITY_SERVICE_POST_RECEIPT = "PostPaymentEJBJNDI";
	public static final String SEARCH_RECEIPT_POST = "ManageSearchReceiptEJBJNDI";
	public static final String SEARCH_UNMATCHED_RECEIPT ="ManageUnMatchedReceiptEJBJNDI";
	public static final String MANUAL_MATCH_POST = "ManageManualMatchEJBJNDI";

	public static final int PRODUCT_GENERALINFO_CODE = 1003;
	public static final int ACTIVE_STATUS =2008;
	public static final int PGM_STATUS =1;
	public static final char BATCHSTATUS_INITIAL = 'I';
	public static final char BATCHSTATUS_BEFOREBATCH = 'Y';
	public static final char BATCHSTATUS_AFTERBATCH = 'N';
	public static final char MATCHED_TO_ORDER_INITIAL = 'I';
	public static final char MATCHED_TO_ORDER_SUCCESS = 'Y';
	public static final char MATCHED_TO_ORDER_UNSUCESS = 'N';
	public static final int RECEIPT_SCREENS = 1;
	public static final int ACKN_SCREENS = 2;
	///END of File From Karthik

	public static final String SUBMIT_ORDER_EJB = "ManageSubmitOrderEJBJNDI";
	public static final String SAMPLE_ORDER_ENQUIRY_EJB ="SampleOrderEnquiryEJBJNDI";
	public static final String MANAGE_QUANTITY_EJB = "ManageQuantityEJBJNDI";
	public static final String MANAGE_ACCOUNT_NUMBER_EJB = "ManageAccountNumberEJBJNDI";
	public static final String TOAF_ORDER = "TOAF_ORDER";
	public static final String TOAF_ORDERINVOICEINFO = "TOAF_ORDERINVOICEINFO";
	public static final String TOAF_ORDERPAYMENT = "TOAF_ORDERPAYMENT";
	public static final String TOAF_ORDERINSTRUCTION =
		"TOAF_ORDERINSTRUCTION";
	public static final String TOAF_ORDEREDPRODUCTKITLNK =
		"TOAF_ORDEREDPRODUCTKITLNK";
	public static final String TSCM_PRODUCTSALESQUANTITY =
		"TSCM_PRODUCTSALESQUANTITY";

	public static final String TOAF_ORDERPROMOTION = "TOAF_ORDERPROMOTION";
	public static final String TCRM_DISCOUNTTRANSACTION = "TCRM_DISCOUNTTRANSACTION";
	public static final String TCRM_CUSTTRANSACTIONDETAILS = "TCRM_CUSTTRANSACTIONDETAILS";
	public static final String TOAF_PAYBYATM = "TOAF_PAYBYATM";
	public static final String TOAF_USERACTIONLOG = "TOAF_USERACTIONLOG";

	//Hemanth
	public static final String CHANGE_CARD_EDI_BATCH = "ehsn.et1.db.oaf.batch.dao.ChangeCardBatchDAO";
	public static final String CHANGE_CARD_EDI_TRANSACTIONSET = "OAF_0026";
	public static final int BATCH_RUN_STATUS_PENDING = 0;
	public static final int BATCH_RUN_STATUS_SUCCESS = 1;
	public static final int NCCC_BANKID = 72;
	public static String CREDIT_CARD_STOP_SETTLEMENT_EJB="ManageCreditCardStopSettlementServiceEJBJNDI";
	public static int SETTLEMENT_CONFIRMATION_SEARCH_VALUE = 1001;
	public static int SETTLEMENT_CONFIRMATION_VIEW_VALUE = 1002;
	public static final String SETTLEMENT_EDI_REBUILD_REQUEST_BATCH = "ehsn.et1.db.oaf.batch.dao.CCSettlementRebuildDAO";
	public static final String SETTLEMENT_EDI_RESPONSE_BATCH = "ehsn.et1.db.oaf.batch.dao.CCSettlementResponseDAO";
	public static final String SETTLEMENT_EDI_SINOPAC = "ehsn.et1.db.oaf.batch.dao.SinoPacDAO";
	public static final String SETTLEMENT_EDI_RESPONSE_INSTALLMENT_UPDATEBATCH = "ehsn.et1.db.oaf.batch.dao.CCSettlementResponseInstallmentUpdateDAO";
	public static final String NOTIFICATION_SETTLEMENT_FILEERROR = "OAF_0011";
	public static final int SETTLEMENT_RESPONSE_FILE_PROCESS_STATUS = 1001;
	public static final int SINOPAC_BANKID = 11;

	// STEVEN CR_SET4.2 CHANGE CARD EDI
	public static final String CHANGE_CARD_EDI_TRANSACTIONSET02 = "OAF_0226";
	public static final String CHANGE_CARD_EDI_TRANSACTIONSET03 = "OAF_0326";
	public static final String CHANGE_CARD_EDI_BATCH_H02 = "ehsn.et1.db.oaf.batch.dao.ChangeCardBatchDAO02";
	public static final String CHANGE_CARD_EDI_BATCH_H03 = "ehsn.et1.db.oaf.batch.dao.ChangeCardBatchDAO03";

	public static final String SETTLEMENT_RESPONSE_CODESETUP_FLAG ="Y";
	public static final String DEFAULT_START_TIME="00:00";
	public static final String DEFAULT_END_TIME="23:59";
	public static final String PROGRAM_ENQUIRY_SCREENID="/ehsn/et1/ui/oaf/order/screens/ECSR_Order_Program_Search";
	public static final String PROGRAM_SEARCH_STATUS_LIVE = "LIVE";
	public static final String PROGRAM_SEARCH_STATUS_HISTORY = "HISTORY";
	public static final String PRODUCT_ALERTMESSAGE_ACTIVE = "1";
	public static final String PRODUCT_ALERTMESSAGE_NOTACTIVE = "0";
	public static final String PRODUCT_ALERTMESSAGE_CHANNELLEVEL = "0";
	public static final String PRODUCT_ALERTMESSAGE_PRODUCTLEVEL = "1";
	public static final String CUSTOMER_CREDITCARD_STATUS = "Y";
	public static final long FIRST_INSTALLMENT_NUMBER =1;
	public static final String BANK_STATUS ="Y" ;
	public static final String SETTLEMENT_EDIMASTER_REQUEST_FLAG = "R";
	public static final String SETTLEMENT_EDI_REQUEST_BATCH = "ehsn.et1.db.oaf.batch.dao.CCSettlementDAO";
	public static final int REBUILD_SETTLEMENT_REQUEST_PARAM_ID_REQUESTID = 1001;
	public static final int REBUILD_SETTLEMENT_REQUEST_PARAM_ID_SETTLEMENTDATE = 1002;
	public static final String SETTLEMENT_EDIMASTER_RESPONSE_FLAG = "S";
	public static final String SETTLEMENT_EDIMASTER_REQUEST_CHINATRUST_FLAG = "1900-01-01 00:00:00.0";

	public static final long TAKE_ORDER_BATCH_EDI_TO_STAGING_TABLE_PARAM_ID = 4444;
	public static final long TAKE_ORDER_BATCH_STAGING_TO_APPLICATION_TABLES_PARAM_ID = 3333;
	public static final String TAKE_ORDER_BATCH_DEFAULT_VALUE = "1";
	public static final String TAKE_ORDER_BATCH_EDI_TO_STAGING_TABLE_ID = "OAF_222";
	public static final String TAKE_ORDER_BATCH_STAGING_TO_APPLICATION_TABLES_ID = "OAF_051";

	//Smita
/*OPERATION OF CUSTOMERCARD 2012-12-27 11:07:28  liuyin*/
	public static final String customerCardAdd="ADD";
	public static final String customerCardDelete="DELETE";
	public static final String customerCardChange="CHANGE";
	public static final String customerCardReuse="REUSE";
	public static final int customerCardAvailable=1;
	public static final int customerCardNotAvailable=0;
	public static final String customerCardNotUse="0";
	public static final int customerCardNotDisplay=2;
	public static final int payByPost=0;//use to remark for pay by post
	public static final int payByVoice=1;//usr to remark for pay by voice
	public static final int voiceAvaCompare=1005;//usr to remark for pay by voice
	public static final String customerCardInfo="CUSTOMERCARDINFO";
	public static final String voiceCreatiCardType="1001";//usr to remark for pay by voice
	public static final int  voiceDealStatus=1001;//usr to remark for pay by voice
	public static final String PAYBYVOICEUSECARD="PayByCardUseCard";
	/*OPERATION OF CUSTOMERCARD 2012-12-27 11:07:33 liuyin */
	public static final	int ACC_INFO_BATCH_PARAM_REPORTID = 1001;
	public static final	int ACC_INFO_BATCH_PARAM_CUSTOMERID = 1002;
	public static final	int ACC_INFO_BATCH_PARAM_REFERENCEVALUEFROM = 1003;
	public static final	int ACC_INFO_BATCH_PARAM_REFERENCEVALUETO = 1004;
	public static final	int ACC_INFO_BATCH_PARAM_TRANSACTIONDATEFROM=1005;
	public static final	int ACC_INFO_BATCH_PARAM_TRANSACTIONDATETO=1006;
	public static final	int ACC_INFO_BATCH_PARAM_ACCOUNTTYPEID=1007;
	public static final	int ACC_INFO_BATCH_PARAM_FILENAME=1008;
	public static final	int ACC_INFO_BATCH_PARAM_LOCALE=1009;
	public static final String CUSTOMER_REPORT_GENERATION_BATCH_DAO="ehsn.et1.db.oaf.batch.dao.CustomerReportGenerationBatchDAO";
	public static final	String ACC_INFO_CUST_ACC_REPORTID = "OAF_0006";
	public static final	String ACC_INFO_DISC_TXN_REPORTID = "OAF_0001";
	public static final	String ACC_INFO_REPORT_BATCHID = "OAF_199";
	public static final	String COMMON_BATCH_REPORT_BATCHID = "CMN_018";

	public static final String CUST_ACC_TRANS_REPORT_LOC = "C:\\Reports\\";
	public static final String CUST_ACC_TRANS_REPORT_CASH = "Cash_Account_Transacion_Report.html";
	public static final String CUST_ACC_TRANS_REPORT_BONUS = "Bonus_Account_Transacion_Report.html";
	public static final String CUST_ACC_TRANS_REPORT_CERT = "Certificate_Account_Transacion_Report.html";
	public static final String CUST_ACC_TRANS_REPORT_DISC = "Discount_Transacion_Report.html";
	public static final int MAX_PAGE_SIZE_ENQUIRY = 5;
	public static final int MAX_PAGE_SIZE_ENQUIRY_QUICKORDER = 20;
	public static final String PRODUCT_ENQUIRY_SERVICE ="ManageProductEnquiryEJBJNDI";
	public static final String ACCOUNT_INFO_SERVICE ="ManageAccountInfoEJBJNDI";
	public static final String ASSOCIATEDPRODUCTDETAILS = "ASSOCIATEDPRODUCTDETAILS";
	public static final String CATALOG_ENQUIRY_SCREENID="/ehsn/et1/ui/oaf/order/screens/ECSR_Order_CatalogNewsPaper_Search";
	public static final String CATALOG_ENQUIRY_SERVICE ="ManageCatalogEnquiryEJBJNDI";
	public static final String COMPLAINT_RESOLUTION_SCREENID="ComplaintResolution";
	public static final String PRODUCT_ENQUIRY_SCREENID="/ehsn/et1/ui/oaf/order/screens/ECSR_Order_Product_Search";
	public static final String CSR_TODOLIST_SCREENID="CSR ToDo List Product Search";
	public static final String CROSSSELL_UPSELL_CUSTOMERCENTRIC="CUSTOMERCENTRIC";
	public static final String CROSSSELL_UPSELL_OACCASSION="OCCASION";
	public static final String CROSSSELL_UPSELL_PRODUCTTOPRODUCT="PRODUCTTOPRODUCT";
	public static final String PRODUCT_SEARCH_MODE="PRODUCTSEARCHMODE";
	public static final String CATALOG_ISSUE_DIVISION_LIST = "CatalogIssueDivisions";
	public static final String SELECTED_CHANNEL_ALL = "0";
	public static final int PRODUCTID_LENGTH = 6;
	public static final int MULTICODEID_LENGTH = 8;
	public static final String SHORT_DESC ="S";
	public static final String LONG_DESC ="L";
	public static final char TAX_INCLUSIVE ='I';
	public static final char TAX_EXCLUSIVE ='E';
	/* LIUYIN ADD 20121018*/
	public static String QUICK_ORDER_ADDRESS1="\u5feb\u901f\u62a2\u5355\u4e13\u7528\u5730\u5740!";
	public static String QUICK_ORDER_ADDRESS2="\u4ed8\u6b3e\u65b9\u5f0f\u8bf7\u9009\u62e9\u90ae\u5c40\u5212\u62e8\uff01";
	public static int QUICK_ORDER_ZIPCODE=888666;
	public static final String QUICK_ORDER_ZIPCODE_STRING="888666";
	public static final String QUICK_BIRTH="1989/05/06";
	public static final int QUICK_ID_TYPE=1000;
	public static final char QUICK_MALE='M';
	
	public static final int ORDER_HAS_HANDLE=1001;
	public static final int ORDER_HAS_NOT_HANDLE=1000;
	public static final int ORDER_ALL=1002;
	
	public static final int CSR_FRONT_MANAGER=3008;
	public static final int CSR_COMPLAINT_MANAGER =4005;

	public static final String PRODUCT_ENQUIRY_AUTOSEARCH="AutoSearchMode";
	public static final String SHOW_PAST_THREE_MONTHS_STS = "SHOW_PAST_THREE_MONTHS_STS";
	public static final String SHOW_ALL_RECORDS = "SHOW_ALL_RECORDS";
	public static final String FILTER_BY_DATE = "FILTER_BY_DATE";
	public static final String FILTER_BY_REFERENCE_NO = "FILTER_BY_REFERENCE_NO";
	public static final int DISCOUNT_TRANS = 1;
	public static final int EMAIL_CUST_ACC_TRANS_DETAILS = 2;
	// (95/6/19) Thomas: CR 112 - Added "REFUND_TRANS" for Refund Details subtab.
	public static final int REFUND_TRANS = 3;
	public static final String MAIL_MSG_ID_CUST_ACC = "OAF_0001";
	public static final String VIEW_CAMPAIGNS_WITHOUT_CONDITION = "ViewWithoutConditionCampaignList";
	public static final String OFFER_CHECK_MAP = "offerProductQtyCheckMap";


	//Session Objects for Take Order
	public static final String TAKEORDERSOLIST = "OrderedProductSOList";
	public static final String PAYMENTDETAILSSO= "PaymentDetailsSO";
	public static final String CARTLIST = "CARTLIST";
	public static final String ORDERSUMARYSO= "OrderSummarySO";
	public static final String ORDERVO = "ORDERVO";

	//Session variable name for holding campaign with condition
	public static final String CAMPAIGN_LIST_WITH_COND = "CAMPAIGN_LIST_WITH_COND";
	//Session variable name for holding campaign without condition
	public static final String CAMPAIGN_LIST_WITHOUT_COND = "CAMPAIGN_LIST_WITHOUT_COND";
	//Session variable name for selected offer list
	public static final String SELECTED_OFFER_LIST ="SELECTED_OFFER_LIST";
	//Session variable name for order promotion vo list
	public static final String OFFER_LIST = "OFFER_LIST";
	//Session variable name for customer transaction due to offers
	public static final String OFFER_CUSTOMER_TRANSACTION_LIST = "OFFER_CUSTOMER_TRANSACTION_LIST";
	//Session variable name for offer order relation
	public static final String OFFER_ORDER_RELATION_LIST = "OFFER_ORDER_RELATION_LIST";
	//Session variable name for eligible payment modes list
	public static final String ELIGIBLE_PAYMENT_MODES = "ELIGIBLE_PAYMENT_MODES";
	//Session variable name for eligible payment modes list in modify order
	public static final String MODIFYORDER_ELIGIBLE_PAYMENT_MODES = "MODIFYORDER_ELIGIBLE_PAYMENT_MODES";
	//Session variable name for payment filter not passed list
	public static final String PAYMENT_FILTER_NOT_PASSED_LIST ="PAYMENT_FILTER_NOT_PASSED_LIST";


	public static final String SELECTED_ORDER_TYPE = "SELECTED_ORDER_TYPE";
	public static final String ADDRESS_INFO="ADDRESS_INFO";
	public static final String CUSTOMER_ACCOUNT_AVAILABLE_BALANCE=
		"CUSTOMER_ACCOUNT_AVAILABLE_BALANCE";
	public static final String PRODUCT_GENERAL_INFO = "GENERALINFO";
	public static final String PRODUCT_DETAILED_INFO = "DETAILEDINFO";
	public static final String PRODUCT_KIT_INFO = "KITINFO";
	public static final String PRODUCT_STOCK_INFO = "STOCKINFO";
	public static final String PRODUCT_PROMOTION_INFO = "PROMOTIONINFO";
	public static final String ADDTOCART = "ADDTOCART";
	/*(96/02/01) Milla Added for CR 1082*/
	public static final String MKT_PRO_QUALIFICATION_INFO = "MKTPROQUALIFICATIONINFO";

	//Uma
	public static final String TIME_AMPM="TIME_AMPM";
	public static final String COUNTRY_TAIWAN_DOMAIN_CODE="9002";
	public static final String DEFAULT_COUNTRY_DOMAIN_CODE="DEFAULT_COUNTRY_DOMAIN_CODE";
	public static int TIME_AM = 1;
	public static int TIME_PM = 2;
	public static final char PAYMENT_DETAIL_BATCH_STATUS='I';
	public static final char PAYMENT_DETAIL_MATCH_ORDER='I';
	public static final String SECURITY_SERVICE_POST = "ManagePostPaymentEJB";
	public static final String ERROR_CODE001 = "OAF3303";
	public static final String IMPORT_DELIMITTER=",";
	public static final String ERROR_DELIMITTER="|";
	public static final int POST_PAYMENTDETAIL_ENTRY_ROWS=30;
	public static final String POST_ACKNOWLEDGEMENT_VO_LIST="POST_ACKNOWLEDGEMENT_VO_LIST";
	public static final String GENERATE_SEQ_NO="s_postacknowledgement";
	public static final String CUSTOMER_DETAILS="customerdetails";
	public static final int BATCH_ORDER_TYPE=1010;
	public static final char ADDRESS_TYPE='C';
	public static final String DOMAINNAME_SOURCEINFORMATION="SOURCEINFORMATION";
	public static final String IMPORT_TAKEORDER_BATCHDAO="ehsn.et1.db.oaf.batch.dao.ImportTakeOrderBatchDAO";
	public static final int INVOICE_NO=0;
	public static final int INVOICE_STATUS=0;
	public static final String DOMAINMAP_KEY="DOMAINDATA";
	public static final char GENDER_TAKEORDER_BATCH='I';
	public static final int PAYMENT_STATUS_BATCH=0;
	public static int ROWNUM_FOR_ORDER_SRV = 2;
	public static final String ORDER_TYPE_CHANGEABLE="ORDER_TYPE_CHANGEABLE";

	//from shreyas
	public static final char COUPON_ISVALID_NOCAMPAIGN = 'C';
	public static final char COUPON_ISVALID_EXPIRED = 'R';
	public static final char COUPON_ISVALID_INVALID = 'I';
	public static final char COUPON_ISVALID_USED = 'U';
	/*2008/01/21 add for CR4636 coupon belong to other customer*/
	public static final char COUPON_ISVALID_OTHERCUSTOMER = 'O';
	/*2008/01/21 add for CR4636 COUPON NOT BELONG TO ANYONE*/
	public static final char COUPON_NOT_BELONG_TO_ANYONE = 'A';
	public static final String CALLBANK = "Call Bank";
	public static final String MODIFYORDERSOLIST = "ModifyProductSOList";
	public static final String CUSTOMER_ACCOUNT= "CustomerAccount";
	public static final int ORDERSTATUS_PAYMENTCONFIRMED_AND_NOTSHIPPED=2;
	public static final int ORDERSTATUS_PAYMENTNOTCONFIRMED_AND_NOTSHIPPED=1;
	public static final int ORDERSTATUS_PAYMENTCONFIRMED_AND_SHIPPED=3;
	public static final char ISKIT='y';
	/* (95/08/18)Milla add for Defect #1729 --
	 * �NIS_OFFSHORE_DELIVERY�w�]�ȭ쥻���p�g y �令�j�g Y */
	public static final char IS_OFFSHORE_DELIVERY='Y';
	public static final char IS_PROMOTIONAL_PRODUCT='y';
	public static final String ORDER_ENQUIRY_SERVICE = "ManageOrderEnquiryEJBJNDI";
	public static final String MODIFYORDER_SERVICE_POST = "ManageModifyOrderEJBJNDI";
	public static final int POP_UP_FROM_MODIFY=1;
	public static final String DEFAULT_FROM_DATE="1800/01/01";
	public static final String IS_ORDER_ID="orderId";
	public static final String IS_RETURN_ID="returnId";
	public static final char ADDRESS_TYPE_DELIVERY='D';
	public static final int ZERO = 0;
	public static final int TWELVE = 12;
	public static final String APPEND_ZERO = ":00.000000000";
	public static final int TOTAL_PAYMENT_MODES =8;
	public static final char ADDRESS_TYPE_STORE='S';
	public static final int ALL_RECORDS=1001;
	public static final String ALL="1001";
	public static final int COUPON_USAGE_SINGLE = 1003;
	public static final String TAKE_ORDER_BATCH_SUCCESS_NOTIFICATION = "OAF_0044";
	public static final String TAKE_ORDER_BATCH_FAILURE_NOTIFICATION = "OAF_0045";
	public static final String TAKE_ORDER_BATCH_SUCCESS_ATMPOST_NOTIFICATION = "OAF_0046";
	public static final String AVAILED_DISCOUNT_CAMPAIGN_LIST = "DiscountCampaignList";
	//purush
	//Added on 09-Aug-2005 for Virtual payment Gateway integration
	public static final String CREDIT_CARD_EXPIRY_DATE_FORMAT_YYMM_NUMBER="YYMM";
	public static final String CREDIT_CARD_EXPIRY_DATE_FORMAT_YYYYMM_NUMBER="YYYYMM";
	//Acquiring Bank Setup Authorizing Amount Type -Added for Virtual Payment Gateway
	public static final int AUTHORISING_AMOUNT_TYPE_FULL=1003;
	public static final int AUTHORISING_AMOUNT_TYPE_HALF=1002;
	public static final int AUTHORISING_AMOUNT_TYPE_FIRST=1001;

	public static final String CALLBANKSETUPADDSCRDETAILS="CALLBANKSETUPADDSCRDETAILS";
	public static final int MAXINSTALLMENTALLOWED = 24;
	public static final String MANUAL_MATCH_POSTRECEIPT_NOTIFICATION_ID="OAF_0014";
	public static final int TIME_FRAME=10;
	public static final int TIME_FRAME_PREFUNERALPROD=14;
	public static final String TOAF_RETURNPRODUCTS="TOAF_RETURNPRODUCTS";
	public static final String TOAF_REFUNDDETAILS="TOAF_REFUNDDETAILS";
	public static final String TCRM_CUSTOMERBANKDETAILS="TCRM_CUSTOMERBANKDETAILS";
	public static final String TOAF_CHEQUEDETAILS="TOAF_CHEQUEDETAILS";
	public static final String TOAF_REFUNDBYBANK="TOAF_REFUNDBYBANK";
	public static final String TOAF_REFUNDBYCHEQUE="TOAF_REFUNDBYCHEQUE";
	public static final char VALID='Y';
	public static final char NOT_VALID='N';
	public static final char ISPROMOTIONALPRODUCT='Y';
	public static final char YES='Y';
	public static final char NO='N';
	public static final int FIRST_INSTALLMENT=1;
	public static final int FIRST_ELEMENT=0;
	public static final String SECURITY_SERVICE_ACCEPTRETURN="ManageAcceptReturnEJBJNDI";
	public static final String SECURITY_SERVICE_BANKDETAILS="ManageBankDetailsEJBJNDI";
	public static final String SECURITY_SERVICE_CHEQUEDETAILS="ManageChequeDetailsEJBJNDI";
	public static final String EX_KIT_VALUE_YES="Y";
	public static final String EX_KIT_VALUE_NO="N";
	public static final char ISSINGLE_DELIVERY = 'N';
	public static final String TOKENIZER_SEPARATOR = "~!@~";
	public static final String AUTHORIZE_RETURN="AUTHORIZE_RETURN_EXCHANGES";
	/*(97/02/26)michelle:CR4353 新增角色以進行店配訂單銷退*/
	public static final String STOREDELIVERY_AUTHORIZE_RETURN="STOREDELIVERY_AUTHORIZE_RETURN_EXCHANGES";
	public static final int UNDEFINED=-1;
	public static final int POP_UP_FROM_RETURNS=5;
	public static final int COMPANYID_PROMOTION=1008;
	public static final String PLSSELECTBANK="OAF3366";
	public static final String BANKALREADYDELETED="OAF3367";
	public static final String CANNOTMODIFYBANKREACTIVATE="OAF3368";
	public static final String CANNOTUSEBANKREACTIVATE="OAF3369";
	public static final String BANKSELECTEDSUCC="OAF3370";
	public static final String BANKALREADYACTIVE="OAF3371";
	public static final String GREATERRETURNQTY="OAF3372";
	public static final String ZERORETURNQTY="OAF3373";
	public static final String RETURNID="OAF3374";
	public static final String PLSSELECTCHEQUE="OAF3375";
	public static final String NOTAUTHORIZED="OAF3376";
	public static final String SELECTBANKFOROPERATION="OAF3378";
	public static final String SELECTCHEQUEFOROPERATION="OAF3377";
	public static final String CANNOTMODIFYCHEQUEREACTIVATE="OAF3386";
	public static final String CANNOTUSECHEQUEREACTIVATE="OAF3382";
	public static final String CHEQUESELECTEDSUCC="OAF3383";
	public static final String CHEQUEALREADYACTIVE="OAF3384";
	public static final String CHEQUEALREADYDELETED="OAF3385";
	public static final String PAGESUBMITTED="COMOO6";
	public static final char SMALLYES='y';
	public static final char SMALLNO='n';
	public static final int MODIFYTORETURN=1;
	public static final int MODIFYTOEXCHANGE=2;
	public static final int NOMODIFY=3;
	public final int POP_UP_FROM_PRINTCHEQUE = 8;
	public static final String SMS_NEW_MESSAGE="00";
	public static final String ROLE_BACKOFFICE_OMD = "BO_OMD";
	public static final int CANCEL_RETURN_REFUND=1;
	public static final int ACCOUNT_INFO=2;
	//nivas
	public static final String PROMOTIONUPDATEBATCHSERVICEDAO="ehsn.et1.db.oaf.batch.dao.PromotionUpdateBatchServiceDAO";
	public static final String INTERCOMPANY_TRANSFER="ManageIntercompanyTransferEJBJNDI";
	public static int REFUND_SUCCESS_SMS_PROJECT_CODE=4;
	public static String REFUND_SUCCESS_SMS_DEPARTMENT_CODE="OMD";
	public static final String SMS_DESCRIPTION_REFUND_SUCCESSFUL="Refund Successful";
	public static int CUSTOMERCREDITCARD_CARD_TYPE_AMEX=1905;
	public static int CUSTOMERCREDITCARD_CARD_TYPE_DISCOVER=1906;
	public static int CUSTOMERCREDITCARD_CARD_TYPE_ENROUTE=1907;
	public static int CUSTOMERCREDITCARD_CARD_TYPE_JCB=1908;
	public static final String TOAF_CHEQUEPRINTDETAILS="TOAF_CHEQUEPRINTDETAILS";
	public static final String _REFUND_FAILURE_NOTIFICATION = "OAF_0004";
	public final String REFUND_DETAILS="ManageRefundDetailsEJBJNDI";
	public final String REFUND_BY_CHEQUE="ManageRefundByChequeEJBJNDI";
	public static final int SMS_HIGH_PRIORITY = 5;
	public static final String CHEQUE_REFUND_FAILURE_NOTIFICATION = "OAF_0004";
	public static final String CREDIT_CARD_REFUND_FAILURE_NOTIFICATION="OAF_0005";
	public static final String BANK_REFUND_FAILURE_NOTIFICATION="OAF_0002";
	public static final String REFUND_FAILURE_NOTIFICATION_BATCH_DAO="ehsn.et1.db.oaf.batch.dao.RefundFailureNotificationBatchDAO";
	public static final int FILL_RIGHT = 1;
	public static final int FILL_LEFT = 0;

	public static final int FEDI_REQUEST_ACCOUNTNO_LENGTH= 16;
	public static final int FEDI_REQUEST_CHECKCODE_LENGTH=4;
	public static final int FEDI_REQUEST_REMITAMOUNT_LENGTH=11;
	public static final char FEDI_REQUEST_PAD_CHAR='0';

	//For refund report
	public static final String REFUNDREPORT_REPORTID = "OAF_0099";
	public static final String REFUNDREPORT_REPORTNAME="RefundReport";
	public static final String REFUNDREPORT_IMPORTSECTIONNAME="Refund Report";
	public static final String REFUNDREPORT_QUERYSECTIONNAME="Query2,Query";
	public static final String REFUNDREPORT_QUERYPARAM = "Refundid";
	public static final String REFUNDREPORT_PARAMSECTIONNAME = "Query";
	public static final String REFUNDREPORT_PARAMLIMITOPERATOR = "=";
	public static final	String REFUNDREPORT_BATCHID = "OAF_200";
	String EXCEL_FILE_EXTENSION=".xls";
	String PDF_FILE_EXTENSION=".PDF";

	//For Refund Report batch
	public static final short REFUNDREPORTBATCH_PARAM_CUSTOMER_ID = 1007;
	public static final short REFUNDREPORTBATCH_PARAM_CUSTOMER_NAME = 1008;
	public static final short REFUNDREPORTBATCH_PARAM_RETURN_ID = 1009;
	public static final short REFUNDREPORTBATCH_PARAM_RETURN_DATE_FROM = 1010;
	public static final short REFUNDREPORTBATCH_PARAM_RETURN_DATE_TO = 1011;
	public static final short REFUNDREPORTBATCH_PARAM_REFUND_ID = 1012;
	public static final short REFUNDREPORTBATCH_PARAM_REFUND_DATE_FROM = 1013;
	public static final short REFUNDREPORTBATCH_PARAM_REFUND_DATE_TO = 1014;
	public static final short REFUNDREPORTBATCH_PARAM_REFUND_INIT_DATE_FROM = 1015;
	public static final short REFUNDREPORTBATCH_PARAM_REFUND_INIT_DATE_TO = 1016;
	public static final short REFUNDREPORTBATCH_PARAM_COMPANY_ID = 1017;
	public static final short REFUNDREPORTBATCH_PARAM_REFUND_MODE = 1018;
	public static final short REFUNDREPORTBATCH_PARAM_REFUND_STATUS = 1019;
	public static final short REFUNDREPORTBATCH_PARAM_REFUND_TYPE = 1020;
	public static final String REFUND_REPORT_BATCH_DAO="ehsn.et1.db.oaf.batch.dao.RefundReportGenerationBatchDAO";


	// for invoice not returned report
	public static final String INVNOTRET_REPORT_REPORTID = "OAF_0079";
	public static final String INVNOTRET_REPORT_REPORTID_NORMAL = "OAF_0080";
	public static final String INVNOTRET_REPORT_REPORTNAME="Invoice_Not_Returned_Report";
	public static final String INVNOTRET_REPORT_IMPORTSECTIONNAME="Report";
	public static final String INVNOTRET_REPORT_QUERYSECTIONNAME="Query";

	public static final String INVNOTRET_REPORT_PARAMSECTION_MANUALQUERY = "Query";
	public static final String INVNOTRET_REPORT_PARAMSECTION_NORMALQUERY = "Query";

	public static final String INVNOTRET_REPORT_QUERYPARAM1 = "Companyid";
	public static final String INVNOTRET_REPORT_QUERYPARAM2 = "Invoiceno";
	public static final String INVNOTRET_REPORT_QUERYPARAM3 = "Customerid";
	public static final String INVNOTRET_REPORT_QUERYPARAM4 = "Returnid";
	public static final String INVNOTRET_REPORT_QUERYPARAM5 = "Invoicestatus";
	public static final String INVNOTRET_REPORT_QUERYPARAM6 = "InvoiceReturndate";
	public static final String INVNOTRET_REPORT_QUERYPARAM7 = "Returnintowarehousedate";
	public static final String INVNOTRET_REPORT_QUERYPARAM8 = "Prefix";
	public static final String INVNOTRET_REPORT_QUERYPARAM9 = "Companyid_2";
	public static final String INVNOTRET_REPORT_QUERYPARAM10 = "Invoiceno_2";
	public static final String INVNOTRET_REPORT_QUERYPARAM11 = "Customerid_2";
	public static final String INVNOTRET_REPORT_QUERYPARAM12 = "Invoicestatus_2";
	public static final String INVNOTRET_REPORT_QUERYPARAM13 = "Prefix_2";
	public static final String INVNOTRET_REPORT_QUERYPARAM14 = "isNormal";

	public static final String INVNOTRET_REPORT_PARAMLIMITOPERATOR = "=";
	public static final	String INVNOTRET_REPORT_BATCHID = "CMN_018";

	// report operators
	public static final String REPORT_OPERATOR_EQUALTO = "=";
	public static final String REPORT_OPERATOR_GRATERTHAN = ">";
	public static final String REPORT_OPERATOR_LESSTHAN = "<";
	public static final String REPORT_OPERATOR_GRATERTHAN_OR_EQUALTO = ">=";
	public static final String REPORT_OPERATOR_LESSTHAN_OR_EQUALTO = "<=";
	public static final String REPORT_OPERATOR_BETWEEN = "Between";
	public static final String REPORT_OPERATOR_LIKE = "Like";







	//PRAKASH
	public static final char CUSTOMER_TRANSACTION_CREDIT_FLAG ='y';
	public static final String SECURITY_SERVICE_ACCEPTRETURNPRODUCT="ManageAcceptReturnProductEJBJNDI";
	public static final int CERTIFICATE_TYPE_PARENTCODE=0;
	public static final short RETURN_STATUS_PARENTCODE=0;
	public static final short CUSTOMER_OPTION_PARENTCODE=0;
	public static final String CERTIFICATE_REDEEM_FLAG_ACTIVATED="y";
	public static final String CERTIFICATE_VOID_FLAG_ACTIVATED="y";
	public static final String CERTIFICATE_CUSTOMERRECEIVED_FLAG_ACTIVATED="y";
	public static final String RETURN_ENQUIRY_REFRESH_OPTIONID="/CancelDetails";
	public static final String RETURN_SEARCH_ISKIT="y";
	public static final String SECURITY_SERVICE_ACTIVATEGIFTCERTIFICATE = "ActivateGiftCertificateDetailsEJBJNDI";
	public static final String BATCH_ACTIVATION_PARTIAL = "Unactivated Certificate Serial Numbers: ";
	public static final String CUSTOMER_OPTION_CAPTION="Select an option";

	//Prem
	public static final String TMINFO_STATUS = "Valid";
	public static final String TMINFO_STATUS_DELETED = "Deleted";
	public static final String TMINFO_STATUS_REJECTED = "Rejected";
   public static final String TMINFO_PROIRITY_SET_TO_ONE = "1";
	public static final String TMINFO_JNDI_NAME = "ManageTMInfoEJBJNDI";
 	public static final int TMINFO_APPROVED=1;
 	public static final int TMINFO_REJECTED=2;
	public static int INSTALLMENT_FIRST_AMOUNT=1;
	public static String CCAUTHORIZATION_REQUEST_BATCH_DAO="ehsn.et1.db.oaf.batch.dao.CreditCardAuthorizationRequestBatchDAO";
	public static String CCAUTH_REQUEST_MANAUAL_EJBJNDI="ManageCCAuthRequestManualEJBJNDI";
	public static String CCAUTH_REQUEST_MANUAL_BANK_DOMAIN_NAME="BANK";//This is used in the "Order_SettCCAuthorizationRequestManualSearch.jsp" to get the bank name from the bank code.
	public static int PARENT_COMPANY=0;
	public static String CREDIT_CARD_AUTH_RESERVE_ORDER_RETURN="CreditCardAuthReserveOrderOrReturn";
	public static String CCAUTH_REQUEST_RESERVE_EJBJNDI = "ManageCCAuthorizationReserveEJBJNDI";
	public static final int CCAUTHORIZATION_EDI_REQUEST_RESPONSE_FLAG_REQUEST=2;
	public static int INSTALLMENT_TYPE_FULL_PAYMENTS_INSTALLMENT_NUMBER=0;


	//Add by Jimmy,	for CreditCard Settlement Batch Confirmation
	public static final String SECURITY_SERVICE_CCSETTBATCHCONFIRMATION ="CCSettlementBatchConfirmationEJBJNDI";
	public static final String CREDIT_CARD_SETTLEMENT_CONFIRM_BATCHID = "OAF_224";

	//For CreditCard Settlement Confirmation batch
	public static final short CCSETTCONFIRMBATCH_PARAM_COMPANY_ID = 1007;
	public static final short CCSETTCONFIRMBATCH_PARAM_CARD_TYPE = 1008;
	public static final short CCSETTCONFIRMBATCH_PARAM_BANK_ID = 1009;
	public static final short CCSETTCONFIRMBATCH_PARAM_CREDITCARD_STATUS = 1010;
	public static final short CCSETTCONFIRMBATCH_PARAM_SETTREQ_DATE_FORM = 1011;
	public static final short CCSETTCONFIRMBATCH_PARAM_SETTREQ_DATE_TO = 1012;
	public static final short CCSETTCONFIRMBATCH_PARAM_SRARCH_OPTION = 1013;
	public static final short CCSETTCONFIRMBATCH_PARAM_MONEYTRANS_DATE_FROM = 1014;
	public static final short CCSETTCONFIRMBATCH_PARAM_MONEYTRANS_DATE_TO = 1015;
	public static final short CCSETTCONFIRMBATCH_PARAM_SETTCONFIRMATION_DATE_FROM = 1016;
	public static final short CCSETTCONFIRMBATCH_PARAM_SETTCONFIRMATION_DATE_TO = 1017;
	public static final short CCSETTCONFIRMBATCH_PARAM_CREDITCARD_NO = 1018;
	public static final short CCSETTCONFIRMBATCH_PARAM_ORDER_ID = 1019;
	public static final short CCSETTCONFIRMBATCH_PARAM_PAYMENT_BY = 1020;
	public static final short CCSETTCONFIRMBATCH_PARAM_MONEYTRANS_DATE = 1021;

	//Add by Jimmy,	for CreditCard Settlement Batch Confirmation To Excel
	public static final String CCSETT_CONFIRM_TOEXCEL_BATCHID = "OAF_223";
	public static final String LABELKEY_SETTLEMENT_BATCH_CONFIRMATION ="SETTLEMENT_BATCH_CONFIRMATION";
	public static final String LABELKEY_NO = "NO.";
	public static final String LABELKEY_REFERENCENO = "REFERENCENO";
	public static final String LABELKEY_ORDERITEMNO = "ORDERITEMNO";
	public static final String LABELKEY_COMPANY = "COMPANY";
	public static final String LABELKEY_AUTHID = "AUTHID";
	public static final String LABELKEY_AUTHDATE = "AUTHDATE";
	public static final String LABELKEY_SETTREQDATE = "SETTREQDATE";
	public static final String LABELKEY_MONEYTRANSDATE = "MONEYTRANSDATE";
	public static final String LABELKEY_SETTCONFIRMDATE = "SETTLECONFIRMDATE";
	public static final String LABELKEY_REFUNDCONFIRMDATE = "REFUNDCONFIRMDATE";
	public static final String LABELKEY_REFUNDREQESTDATE = "REFUNDREQESTDATE";
	public static final String LABELKEY_SEARCHDATE = "SEARCHDATE";
	public static final String LABELKEY_SETTRETAMT = "SETTRETAMT";
	public static final String LABELKEY_CCSTATUS = "CCSTATUS";
	public static final String LABELKEY_CCTYPE = "CCTYPE";
	public static final String LABELKEY_CCNO = "CCNO";
	public static final String LABELKEY_SVCCHG = "SVCCHG";
	public static final String LABELKEY_CREDITCARDSERVICECHARGESETUP = "CREDITCARDSERVICECHARGESETUP";
	public static final String LABELKEY_CUSTOMERID = "CUSTOMERID";
	public static final String LABELKEY_CUSTNAME = "CUSTNAME";
	public static final String LABELKEY_MERCHANTID = "MERCHANTID";
	public static final String LABELKEY_NODATASETUP = "NODATASETUP";


	//For CCSett Confirm report
	public static final String CCSETTCONFIRMREPORT_REPORTID = "OAF_0000";	//not user
	public static final String CCSETTCONFIRMREPORT_REPORTNAME="CCSettConfirmReport";
	public static final String CCSETTCONFIRMREPORT_IMPORTSECTIONNAME="CCSett Confirm Report";
	public static final String CCSETTCONFIRMREPORT_QUERYSECTIONNAME="Query2,Query";





	//shala

	public static final String DELIVERY_TYPE="DeliveryType";
	public static final String CREDITCARD_TAKEORDER_BATCHDAO="ehsn.et1.bc.oaf.batch.controller.CreditCardInstallmentUtilityForBatch";
	public static final String SECURITY_SERVICE_CCSETTCONFIRMATION ="CCSettlementConfirmationEJBJNDI";
	public static final String COMBO_DEFAULT_VALUE = "0";
	public static final int ZERO_VALUE_CHECK = 0;
	public static final int SEARCH_NORMAL = 1;
	public static final int SEARCH_NEXT = 2;
	public static final int SEARCH_PREV = 3;
	public static final String OAF3418 = "OAF3418";
	public static final String OAF3421 ="OAF3421";
	public static final String VALIDATIONFLAG="N";
	public static final String VALIDATIONFLAG_FAILED="F";
	public static final String BATCH_VALIDATION_STATUS="N";
	public static final String BATCH_ORDER_STATUS="N";
	public static final String BATCH_NOTIFY_STATUS="N";
	public static final String ISDEFAULT_ADDRESS="N";
	public static final String ISISLAND="N";
	public static final int IMPORT_PARAMID=4444;//1004;
	public static final String VALIDATIONFLAG_PASS="P";
	public static final String ORDER_SUCCESS="P";
	public static final String ERRORFILE_NAME = "ORDER_ERROR";
	public static final String EXTENTION_EDI=".txt";
	public static final String IMPORT_EDITRANSACTION_ID ="OAF_1800";
	public static final String IMPORT_BATCH_ID ="OAF_051";
	public static final String UPLOAD_FILE_NAME="TAKEORDERBATCH";
	//Batch
	public static final String REFUND_BATCH_DAO="ehsn.et1.db.oaf.batch.dao.RefundBatchDAO";
	public static final String REFUND_COMPLETION_BATCH_DAO="ehsn.et1.db.oaf.batch.dao.InformingOnRefundCompletionBatchDAO";
	//D saravanan
	public static final String CREDIT_CARD_EXPIRY_DATE_FORMAT_MMYY="MM/YY";
	public static final String CREDIT_CARD_EXPIRY_DATE_FORMAT_YYMM="YY/MM";
	public static final int ATM_SETTLEMENT_ACCOUNT_TYPE_BIT=0;
	public static final int ATM_COLLECTION_ACCOUNT_TYPE_BIT=1;
	public static final String ATMRECEIPTJNDINAME ="ATMReceiptEJBJNDI";
	public static final int    ATMRECEIPTMANUALENRTY=0;
	public static final int    ATMRECEIPTIMPORTENRTY=1;
	public static final String ATMRECEIPTMATCHEDSTATUS="Y";   // This is the Status for Matched Receipt
	public static final String ATMRECEIPTUNMATCHEDSTATUS="N"; //This is the Status for Unmatched Receipt
	public static final String ATMRECEIPTINITIALSTATUS="U";  // This is the status of Unprocessed Receipt
	public static final String ATMRECEIPTDETAILIMPORTDAO="ehsn.et1.db.oaf.batch.dao.AtmReceiptDetailBatchDAO";
	public static final String ATMRECEIPTHEADERIMPORTDAO="ehsn.et1.db.oaf.batch.dao.AtmReceiptHeaderBatchDAO";
	public static final String ATMRECEIPTBATCHDAO="ehsn.et1.db.oaf.batch.dao.AtmReceiptBatchDAO";
	public static final String ATMRECEIPTORDERLINKDAO="ehsn.et1.db.oaf.batch.dao.PaymentAtmReceiptLnkBatchDAO";
	public static final int    ATMBANKSERVICECHARGE=0; // This is the service charge for Payment through ATM
	public static final int	   ATMRECEIPTLINKPARAMIDCOMPANY=3204;
	public static final int    ATMRECEIPTLINKPARAMIDBANK=3205;
	public static final String ATMIMPORT_BATCH_ID="OAF_011";
	public static final String ATMLINK_BATCH_ID="OAF_014";
	public static final int    ATMIMPORT_BATCH_COMPANY_PARAM_ID=3202;
	public static final int    ATMIMPORT_BATCH_BANK_PARAM_ID=3203;
	public static final String ATMBATCHTYPE_IMPORT="3207";
	public static final String ATMBATCHTYPE_LINK="3206";
	public static final String MANUAL_MATCH_ATMRECEIPT_NOTIFICATION_ID="OAF_0003";
	public static final String ATM_RECEIPT_STATUS_MATCHED_AND_REFUNDED="M";
	public static final String ATM_RECEIPT_STATUS_UNMATCHED_AND_REFUNDED="R";
	public static final String ATM_RECEIPT_STATUS_MATCHED_AND_SHORTAGE="S";
	public static final char CUSTOMER_TRANSACTION_TYPE_DEBIT='D';
	public static final char CUSTOMER_TRANSACTION_TYPE_CREDIT='C';
	public static final String BANK_SETUP_IS_VALID="Y";
	public static short TASK_TYPE_NORMAL_TASK=2;
	public static String ROLE_NAME_CSR="FO_CSR";
	public static String ATM_EDI_ERROR="Error_";

	//Shyam
	public static String MENU_TASK_FOR_BO_CSR = "OAF_ORDER_VERIFICATION_FOR_CSR";
	public static final String OAF_RISK_FACTOR_ID_25 = "D25";
	public static final String OAF_RISK_FACTOR_ID_26 = "D26";
	public static final String OAF_RISK_FACTOR_ID_27 = "D27";
	public static String MSG_CONFIRM_CUSTOMER_AND_OWNER = "OAF3663";
	public static String MSG_CANNOT_TRANSFER_LVCERT = "OAF3774";
	public static String MSG_INVALID_CERTIFICATE_NO = "OAF3546";
	public static String MSG_NO_CERTIFICATE_FOUND="OAF3547";
	public static String MSG_NO_EXPIRED_CERTIFICATE_FOUND = "OAF3548";
	public static String MSG_CERTIFICATE_ACTIVATED = "OAF3549";
	public static String MSG_ACTIVATION_FAILED = "OAF3550";
	public static String MSG_INCORRECT_PASSCODE = "OAF3551";
	public static String MSG_ENTER_PASSCODE = "OAF3552";
	public static String MSG_CERTIFICATE_ALREADY_ACTIVATED = "OAF3553";
	public static String MSG_CERTIFICATE_STOLEN = "OAF3554";
	public static String MSG_CUSTOMER_NOT_RECEIVED = "OAF3555";
	public static String MSG_BATCH_ACTIVATION_FAILED = "OAF3536";
	public static String MSG_CUSTOMER_ID_CONTRADICTS = "OAF3537";
	public static String MSG_CERTIFICATE_EXPIRED = "OAF3538";
	public static String MSG_EXPIRY_DATE_NOT_FOUND = "OAF3549";
	public static String MSG_NO_RECORD_FOUND = "OAF3130";
	public static String MSG_NO_MATCH_FOUND_FOR_CERTIFICATE_NO = "OAF3525";
	public static String MSG_CERTIFICATES_ALREADY_ISSUED = "OAF3524";
	public static String MSG_OWNERSHIP_TRANSFER_DONE = "OAF3526";
	public static String MSG_CURRENT_OWNER_NO_MATCH = "OAF3527";
	public static String MSG_NO_SUFFICIENT_FUNDS = "OAF3528";
	public static long MIN_ORDER_VALUE=1;
	public static long MAX_ORDER_VALUE=999999999;
	public static int MIN_ITEM_VALUE=1;
	public static int MAX_ITEM_VALUE=99;
	public static int MAX_ORDER_ITEM_VALUE=60;
	public static String SLA_NOTIFICATION_BATCH_DAO = "ehsn.et1.db.oaf.batch.dao.SLANotificationBatchDAO";
	public static int[] DEPARTMENT_IDS= {1234,1000,1002,1003};
	public static String MSG_NO_ITEMS_IN_TODO_LIST = "OAF3541";
	public static String MSG_FROM_CERT_NO_GREATER = "OAF3542";
	public static String MSG_CERTIFICATE_NOT_HIGH_VALUE = "OAF3543";
	public static final String BUTTON_DISABLE_AFTER_CUSTOMER_OPTION_SAVE ="y";
	public static final String BUTTON_DISABLE_AFTER_ACTIVATION ="n";
	public static final String TABLE_HIDE_IF_NOVALUE ="h";
   public static long CALCULATE_EXPIRY_FOR_DAYS = 24*60*60*1000;
	public static String CERTIFICATE_MODIFY_FLAG = "M";
	public static String HIGHVALUE_CERT_ISSUE_FAILED = "HighValue Certificate Issue failed";
	public static String MSG_ENTER_VALID_CERT_NO="OAF3529";
	public static String MSG_PAYMENT_PENDING_FOR_CERT_ORDER="OAF3530";
	public static String MSG_CERT_NO_DUPLICATED="OAF3531";
	public static String MSG_NO_ITEMS_TO_SAVE="OAF3532";
	public static String MSG_ENTER_VALID_DATE="OAF3533";
	public static String MSG_SELECT_VALID_DATE_TYPE="OAF3534";
	public static String MSG_ENTER_VALID_ID="OAF3535";
	public static String MSG_SELECT_VALID_ID_TYPE="OAF3539";
	public static String MSG_ENTER_ATLEAST_ONE_CRIETERIA="OAF3540";
	public static final int RISK_ORDER_MIDDLE_STAGE_START_INDEX=15;
	public static final int RISK_ORDER_SECOND_STAGE_START_INDEX=15;

	//Heamnth
	public static String CREDIT_CARD_STOP_SETTLEMENT="CreditCardStopSettlementServiceEJBJNDI";
	public static final String CREDIT_CARD_SETTLEMENT_REQUEST_LOG = "CreditCardSettlementRequestLogServiceEJBJNDI";
	public static final String CREDIT_CARD_SETTLEMENT_REQUEST_MANUAL ="CreditCardSettlementRequestManualServiceEJBJNDI";
	public static final String CREDIT_CARD_SETTLEMENT_REBUILD_BATCHID ="OAF_022";

	// Prabhu
	public static String MANAGE_FEDI_REQUEST="ManageFEDIRequestEJBJNDI";
	public static final String FEDI_REBUILD_REFUND_REQUEST_BATCH_ID="OAF_029";
	public static final long FEDI_REFUND_REQUEST_PARAM_ID=1005;
	public static int POP_UP_FROM_PAYBYCC= 9;
	public static int POP_UP_FROM_CUSTOMERCREDITCARD=10;
	public static final String PAY_BY_CREDITCARD_SERVICE ="PaymentByCreditCardEJBJNDI";
	public static String FEDI_REFUND_REQUEST_BATCH_DAO="ehsn.et1.db.oaf.batch.dao.FEDIRefundRequestBatchDAO";

	//Srinivas
	public static String CHANGE_PAYMENT_SCREENID="/ehsn/et1/ui/oaf/screens/Order_SettChangePayment";
	public static String EARLY_PAYMENT_SCREENID="/ehsn/et1/ui/oaf/creditcard/screens/Order_SettEarlyPayment";
	public static final String FEDI_REFUND_RESPONSE_BATCH_DAO="ehsn.et1.db.oaf.batch.dao.FEDIRefundResponseBatchDAO";
	public static String FEDI_TRANSACTIONSETID="OAF_1234";
	public static String MANAGE_FEDI_RESPONSE="ManageFEDIResponseEJBJNDI";
	public static final short TASK_TYPE_MENU = 2;
	public static final short REASSIGNFLAG_WORKFLOW = 0;
	public static String MANAGE_BANK_REFUND="ManageBankRefundEJBJNDI";
	public static String HAS_ALTERNATE_PAYMENT_YES="Y";
	public static String HAS_ALTERNATE_PAYMENT_NO="N";
   public static String HAS_ALTERNATE_INSTALLMENT_YES="Y";
   public static String HAS_ALTERNATE_INSTALLMENT_NO="N";
   public static final String CHANGE_PAYMENT_BATCH_DAO="ehsn.et1.db.oaf.batch.dao.ChangePaymentBatchDAO";
	public static int POP_UP_FROM_CHANGE_PAYMENT_PAYBYCC= 15;
	public static final String COUNTRY_TAIWAN_COUNTRY_TELEPHONE_CODE="886";
	public static final String COUNTRY_CHINA_COUNTRY_TELEPHONE_CODE="86";
	public static final String ROLEID_FO_CALL_BANK = "10560";
	public static final String ROLEID_BO_CALL_BANK = "10580";
	//balakishan
	public static final int DELIVERY_INSTRUCTION=1;
	public static final int PICKUP_INSTRUCTION=2;
	public static final int POP_UP_FROM_CART=2;
	public static final String OFFER_DETAILS_LIST = "OFFER_DETAILS_LIST";
	public static final String CUSTOMER_DELIVERY_PRIORITY = "CUSTOMER_DELIVERY_PRIORITY";
	public static final String CUSTOMER_BONUS_POINTS_BENEFIT_FACTOR = "CUSTOMER_BONUS_POINTS_BENEFIT_FACTOR";

	//suja
	public static final String SAVE_CUSTOMER_RESPONSE = "ManageCustomerResponseEJBJNDI";
	public static final String SAVE_CALLBANK = "ManageCallBankEJBJNDI";
	public static final int INVOKEDFROM_FRONTOFFICE=0;
	public static final int INVOKEDFROM_AUTHRESPONSE=1;
	public static final int INVOKEDFROM_OTHERS=2;
	public static final int INVOKEDFROM_TAKEORDER=3;
	public static final int INVOKEDFROM_COLLECTION=4;
	public static final String COUPONNO="0";
	public static final String PASSCODE="1";

	//Arun Swaminathan K
	public static String CHANGE_OR_EARLY_PAYMENT="ChangeOrEarlyPaymentEJBJNDI";
	public static String HAS_EARLY_PAYMENT_YES ="Y";
	public static final String HAS_EARLY_PAYMENT_NO="N";

	//pradheepa
	public static String CCRESPSEARCHEJBJNDI="ManageCreditCardSettlementResponseSearchEJBJNDI";
	public static String CCRESPMANUALEJBJNDI="ManageCCSettlementResponseManualEJBJNDI";
	public static String CCREQMANUALPRINTEJBJNDI="ManageCCSettRequestManualPrintEJBJNDI";
	public static final String DEFAULT_NO = "N";
	//Jana
	public static int ALTERNATEINSTALLMENTID_NULL = 0;
	public static final String SECURITY_SERVICE_CANCELORDER="ManageCancelOrderEJB";
	public static final String TOAF_ORDERCANCELDETAILS="TOAF_ORDERCANCELDETAILS";
	public static final int ALREADY_CANCELLED=1001;
	public static final String HAS_ALTERNATE_PAYMENT = "N";
	public static String CANCELORDER_NOTIFICATION_BATCH_DAO =
		"ehsn.et1.db.oaf.batch.dao.CancelOrderNotificationBatchDAO";
	public static String NOTIFICATION_CANCELORDER = "OAF_0006";
	public static int PAYMENTMODE_NO = 0;
	public static String HAS_EARLY_PAYMENT = "Y";

	//sreema
	public static final String ERROR_LOG_DELIMITER="***********";
	public static String NOTIFICATION_ERROR_LOG="OAF_0013";
	public static final int ERROR_STATUS=3333;
	public static String CCAUTHORIZATION_RESPONSE_BATCH_DAO="ehsn.et1.db.oaf.batch.dao.CreditCardAuthorizationResponseBatchDAO";
	public static String CCAUTHRESPONSE_BATCH_INSTALLMENT_DAO="ehsn.et1.db.oaf.batch.dao.CreditCardAuthResponseInstallmentBatchDAO";
	public static String INSTALLMENT_DAO="ehsn.et1.db.oaf.batch.dao.InstallmentDAO";
	public static final String CCAUTHRESPONSEHEADER_TABLE="TOAF_CCAUTHRESPONSEHEADER";
	public static String CCAUTH_RESPONSE_EJBJNDI="ManageCCAuthResponseEJBJNDI";
	public static String NOTIFICATION_REIMPORT="OAF_0001";
	public static String NOTIFICATION_AUTHORIZATION_REJECT="OAF_0009";
	public static String NOTIFICATION_AUTHORIZATION_CALLBANK="OAF_0010";
	public static int REQUESTRESPONSEFLAG=1;
	public static int FIRST_INSTALLMENTNO=1;
	public static final int REBUILD_AUTHORIZATION_REQUEST_PARAM_ID_REQUESTID = 1001;
	public static final int REBUILD_AUTHORIZATION_REQUEST_PARAM_ID_SETTLEMENTDATE = 1002;
	public static final int TERMINALID_BATCH=0;
	public static final String ERRORLOG="ERRORLOG";
	public static final int CHECKFLAG_ZERO=0;
	public static final int CHECKFLAG_ONE=1;
	public static final String CLEARED="Cleared";
	public static final String NOTCLEARED="NotCleared";

	//Doss
	public static final int ICBC_AUTHORIZATION_ID_LENGTH=10;
	public static final String NOTIFICATION_AUTHREJECTION = "OAF_0012";
	public static final String CREDIT_CARD_AUTH_RESPONSE =
		"CreditCardAuthorizationResponseManuallyServiceEJBJNDI";
	public static final String MSG_ENTERAUTHCODE = "OAF3595";
	public static final char PERCENTAGE = '%';
	public static final String FROMDATE = "1950/01/01";
	public static final int INSTL_ZERO = 1;
	public static final int INSTL_THREE = 3;
	public static final int INSTL_SIX = 6;
	public static final int INSTL_NINE = 9;
	public static final int INSTL_TWELVE = 12;
	public static final int INSTL_TWENTYFOUR = 24;
	public static final int INSTL_DEFAULT = 100;
	public static final String AUTHCODE_APPRV = "APPR";
	public static final String AUTHCODE_REJECT = "REJCT";
	public static final String AUTHCODE_CALBNK = "CLBNK";
	public static final String AUTHCODE_EXPIRED = "FAIL";
	public static final char ISVALID = 'Y';
	public static final int INSTLNO_ZERO = 0;
	public static final int INSTLNO_ONE = 1;
	//Banurekha
	public static String MANAGE_CREDITCARD_AUTH_CANCELLATION_JNDINAME ="ManageCreditCardAuthCancellationEJBJNDI";
	public static final String ORIGIN_ORDER="Order";
	public static final String ORIGIN_RETURN="Return";
	public static String MANAGE_CREDITCARD_AUTH_REQUEST_LOG_JNDINAME ="ManageCreditCardAuthorizationRequestLogEJBJNDI";
	public static int ALLCOMPANY=0;
	public static int NOCOMPANY=0;
	public static int SELECT_SIZE=5;
	public static String SEPERATOR=",";
	public static String NOOFPARAMETERS="?";
	public static String TERMINATOR=")";
	public static String ALL_INSTALLMENT="ALL";
	public static int FOR_ALL_INSTALLMENT=99;
	public static String REQUEST_LOG_BATCHID="OAF_045";
	public static int REQUESTLOG_STATUS=0;
	public static int MIN_INT_VALUE=-9999999;
	public static String INVOICE_TITLE="ETITC";
	public static String CC_AUTH_REQUEST_BATCHID="OAF_015";

	//sheeba
	public static final String SAVE_MARKETING_ORDER = "ManageMarketingOrderEJBJNDI";
	public static final String EARLY_PAYMENT_BATCH_DAO = "ehsn.et1.db.oaf.batch.dao.EarlyPaymentBatchDAO";
	public static char CREDIT_FLAG = 'C';
	public static char DEBIT_FLAG = 'D';
	public static final int MIXED=10;

	//Added for discount coupon screen.
	public static final String AVAIL_DISCOUNT = "AvailDiscountPaymentEJBJNDI";
	public static final String AVAILDISCOUNT = "AVAILDISCOUNT";
	public static final String DISCOUNTPRODUCT = "DISCOUNTPRODUCT";
	public static final String PASSCODELIST = "PASSCODELIST";
	public static final String DISCOUNTCOUPON = "DISCOUNTCOUPON";
	//Bank codes
	public static final String BANKCODE_NCCC="00";
	public static final String BANKCODE_TCB_NCB="11";
	public static final String BANKCODE_ESUN = "57";
	public static final String BANKCODE_SINOPAC="63";
	public static final String TAIPEIFUBONBANK="813";
	public static final String TAISHIN="812";
	public static final String TAIWANCOOPERATIVEBANK="006";
	public static final String COSMOS="809";
	public static final String BANKCODE_TCB_CB="22";
	public static final String BANKCODE_TCB="804";
	public static final String BANKCODE_CITIBANK_DINERS="99";
	public static final String BANKCODE_ICBC="66";
	public static final String BANKCODE_UBOT="60";
	public static final String BANKCODE_CATHAY="44";
	public static final String BANKCODE_ANSHIN="61";
	public static final String BANKCODE_ABN="65";
	public static final String BANKCODE_CHINATRUST_NONCONTRACT="35";
	//Bank Ids
	public static final int BANKID_CHINATRUST = 75;
	public static final int BANKID_UBOT = 84;
	public static final int BANKID_SINOPAC = 86;
	public static final int BANKID_CHINATRUST_NONCONTRACT = 262;

	/******************************************************
	*				SCM
	/******************************************************/
	public static final int PRODUCT_TAX_TYPE_LEVY_TAX = 1002;
	public static final int PRODUCT_TAX_TYPE_FREE_OF_TAX = 1001;
	public static final int PRODUCT_TAX_TYPE_SPECIAL_CONSUMPTION_TAX = 1003;
	public static final int PRODUCT_TAX_TYPE_NO_TAX = 1004;

	/******************************************************
	*				CRM
	/******************************************************/

	  //Customer Account
	  public static final int ACCOUNT_TYPE_BONUS = 4184;
	  public static final int ACCOUNT_TYPE_CASH = 4185;
	  public static final int ACCOUNT_TYPE_CERT_GIFT = 4186;
	  public static final int ACCOUNT_TYPE_CERT_PICKUP = 4187;
	  public static final int ACCOUNT_NUMBER_INTERNAL = 3001;
	  //Reference Type
	  public static final int	REFERENCE_TYPE_ORDER = 4190;
	  public static final int	REFERENCE_TYPE_RETURN =	4191;
	  public static final int	REFERENCE_TYPE_REFUND =	1003;
	  public static final int	REFERENCE_TYPE_CERTIFICATE = 4405;
	  public static final int	REFERENCE_TYPE_RECIEPT_BY_ATM = 4406;
	  public static final int	REFERENCE_TYPE_RECIEPT_BY_POST = 4407;
	  public static final int   REFERENCE_TYPE_ID_REFUND = 4408;
	  //transacion Details
	  public static final int	TRANSACTION_DETAILS_SHORTAGE_PAYMENT_CASH_ACCOUNT_ATM = 1001;
	  public static final int	TRANSACTION_DETAILS_SHORTAGE_PAYMENT_CASH_ACCOUNT_POST = 1002;
	  public static final int	TRANSACTION_DETAILS_INTER_COMPANY_TRANFER_BONUS_POINTS = 1003;
	  public static final int	TRANSACTION_DETAILS_INTER_COMPANY_TRANFER_CASH = 1004;
	  public static final int	TRANSACTION_DETAILS_INTER_COMPANY_TRANFER_GIFT_CERTIFICATE =	1005;
	  public static final int	TRANSACTION_DETAILS_INTER_COMPANY_TRANFER_PICKUP_CERTIFICATE = 1006;
	  public static final int	TRANSACTION_DETAILS_REFUND_CASH = 1007;
	  public static final int	TRANSACTION_DETAILS_REFUND_BONUS_POINTS = 1008;
	  public static final int	TRANSACTION_DETAILS_REFUND_GIFT_CERTIFICATE = 1009;
	  public static final int	TRANSACTION_DETAILS_REFUND_PICKUP_CERTIFICATE = 1010;
	  public static final int	TRANSACTION_DETAILS_PURCHASE_PRODUCT = 1011;
	  public static final int	TRANSACTION_DETAILS_OFFER_CASH = 1012;
	  public static final int	TRANSACTION_DETAILS_OFFER_BONUS_POINTS = 1013;
	  public static final int	TRANSACTION_DETAILS_PAYMENT_BONUS_POINTS = 1014;
	  public static final int	TRANSACTION_DETAILS_PAYMENT_CASH = 1015;
	  public static final int	TRANSACTION_DETAILS_PAYMENT_GIFT_CERTIFICATE	= 1016;
	  public static final int	TRANSACTION_DETAILS_PAYMENT_PICKUP_CERTIFICATE = 1017;
	  public static final int	TRANSACTION_DETAILS_ACTIVATION_GIFT_CERTIFICATE = 1018;
	  public static final int	TRANSACTION_DETAILS_ACTIVATION_PICKUP_CERTIFICATE = 1019;
	  public static final int	TRANSACTION_DETAILS_REDEMPTION_GIFT_CERTIFICATE = 1020;
	  public static final int	TRANSACTION_DETAILS_REDEMPTION_PICKUP_CERTIFICATE = 1021;
	  public static final int	TRANSACTION_DETAILS_RETURN_CASH = 1022;
	  public static final int	TRANSACTION_DETAILS_RETURN_BONUS_POINTS = 1023;
	  public static final int	TRANSACTION_DETAILS_CANCEL_RETURN_CASH = 1024;
	  public static final int	TRANSACTION_DETAILS_CANCEL_RETURN_BONUS_POINTS = 1025;
	  /* Transacion Details ID -- 95/5/20 added by Thomas for Defect #4725. */
	  public static final int	TRANSACTION_DETAILS_PAYMENT_CANCEL_CASH = 1030;
	  public static final int	TRANSACTION_DETAILS_PAYMENT_CANCEL_BONUS_POINTS = 1031;
	  public static final int	TRANSACTION_DETAILS_PAYMENT_CANCEL_PICKUP_CERTIF= 1032;
	  public static final int	TRANSACTION_DETAILS_PAYMENT_CANCEL_GIFT_CERT	= 1033;	  

   /* Transacion Types -- 95/5/18 added by Thomas for Defect #4725. */
	public static final int	TRANSACTION_TYPE_POLICY_BONUS_POINTS = 1;
	public static final int	TRANSACTION_TYPE_CA_PAYMENT = 2;
	public static final int	TRANSACTION_TYPE_CA_PAYMENT_CANCEL = 3;
	  
	  
	public static final int TRANSACTION_DETAILS_SHORTAGE_PAYMENT_CASH_ACCOUNT_COD = 1040;
	public static final int TRANSACTION_DETAILS_EXCESS_PAYMENT_CASH_ACCOUNT_COD=1039;

	public static final int TRANSACTION_DETAILS_EXCESS_PAYMENT_CASH_ACCOUNT_ATM=1026;
	public static final int TRANSACTION_DETAILS_EXCESS_PAYMENT_CASH_ACCOUNT_POST=1037;
	public static final int	TRANSACTION_DETAILS_INTER_COMPANY_TRANFER_EXCESS=1036;
	public static final int TRANSACTION_DETAILS_REFUND_SUBTRACT_FROM_CASH_ACCOUNT = 1045;

	public static final int OFFERTYPE_ADDITIONALVALUE=1;
	public static final int OFFERTYPE_BONUSPOINTS=2;
	public static final int OFFERTYPE_CASH=3;
	public static final int ORDERTYPE_BUSINESS=3;
	/*(96/02/06) Milla Added for CR 1082*/
	public static final int ORDERTYPE_EXCHANGE=6;

	public static int CUSTOMERCREDITCARD_CARD_TYPE_VISA=1900;
	public static int CUSTOMERCREDITCARD_CARD_TYPE_MASTER=1901;
	public static int CUSTOMERCREDITCARD_CARD_TYPE_SINOPAC=1902;
	public static int CUSTOMERCREDITCARD_CARD_TYPE_UCARD=1903;
	public static int CUSTOMERCREDITCARD_CARD_TYPE_DINERS=1904;

	public static final int CERTIFICATE_TYPE_HIGHVALUE=4100;
	public static final int CERTIFICATE_TYPE_SMALLVALUE=4101;
	public static final int CERTIFICATE_TYPE_PICKUP=4102;

	public static int EXPIRY_FOR_DAYS = 4128;
	public static int EXPIRY_FOR_WEEKS = 4129;
	public static int EXPIRY_FOR_MONTHS = 4130;

	public static final int CUSTOMER_OPTION_AFTER_EXPIRY1=4223;
	public static final int CUSTOMER_OPTION_AFTER_EXPIRY2=4224;
	public static final int CUSTOMER_OPTION_AFTER_EXPIRY3=4225;
	/******** COD SETTLEMENT***************/
	public static int COD_DATE_TYPE_IMPORTED = 1;
	public static int COD_DATE_TYPE_DELIVERY = 2;
	public static String COD_FROM_DATE = "1900/01/01";
	public static String COD_TO_DATE = "2400/01/01";
	public static String COD_EDI_ERROR = "Error_";
	public static String COD_RECEIPT_STATUS_INITIAL = "1001";
	public static String COD_RECEIPT_STATUS_MATCHED = "1002";
	public static String COD_RECEIPT_STATUS_UNMATCHED = "1003";
	public static String COD_RECEIPT_STATUS_SHORTAGE_TRANSFER_CUSTACC = "1004";
	public static String COD_RECEIPT_STATUS_EXCESS = "1005";
	public static String COD_RECEIPT_STATUS_NOTIMPORTED = "1006";

	public static String COD_EDI_IMPORT_TRANSACTIONSETID = "OAF_0600";
	public static final String COD_IMPORT_BATCH_ID = "OAF_060";
	public static final String CODRECEIPTDETAILIMPORTDAO =
		"ehsn.et1.db.oaf.batch.dao.CODReceiptDetailDAO";
	public static final String CODRECEIPTHEADERIMPORTDAO =
		"ehsn.et1.db.oaf.batch.dao.CODReceiptHeaderDAO";
	public static final String CODRECEIPTBATCHDAO =
		"ehsn.et1.db.oaf.batch.dao.CODPaymentReceiptBatchDAO";
	public static final String EJB_NAMING_SERVICE_COD =
		"ManageCODSettlementEJBJNDI";
	public static final int REFERENCE_TYPE_RECIEPT_BY_COD = 4407;
	public static final int COD_LINK_RECORDS = 1;
	public static final int COD_UNLINK_RECORDS = 2;
	public static final int COD_CANCEL_RECORDS = 1;
	public static final int COD_REMOVECANCEL_RECORDS = 0;
	/******** COD SETTLEMENT***************/

	/*********** COD FORMAT TRANSFER ************/
	public static final String COD_EDI_FORMAT_TRANSFER_TRANSACTIONSETID = "OAF_0610";
	/*********** COD FORMAT TRANSFER ************/

	/*********** COD FORMAT TRANSFER ************/
	public static final String DEBITCARD_EDI_PAYMENT_OFFSET = "OAF_0500";
	/*********** COD FORMAT TRANSFER ************/
	
	/********Acc Payable Batch***************/
	public static final String ACCOUNTS_PAYABLE_DAO =
		"ehsn.et1.db.oaf.batch.dao.AccountsPayableBatchDAO";
	public static final String IS_KIT = "Y";
	public static final String IS_PROMOTION_PRODUCT = "Y";
	public static final String PRODUCT_DISCREPANCY_INSERT =
		"PRODUCTDISCREPANCYINSERT";
	public static final String MONTHLY_GOODS_TURNOVER_INSERT =
		"TURNOVERTABLEINSERT";
	public static final String SUPPLIER_INVOICE_INSERT =
		"SUPPLIERINVOICETABLEINSERT";
	public static final String VARIABLE_COST_INSERT = "VARIABLECOSTTABLEINSERT";
	public static final String SUPPLIER_SETTLEMENT_INSERT =
		"SUPPLIERSETTLEMENTINSERT";
	public static final String SUPPLIER_DEBITNOTE_INSERT =
		"SUPPLIERDEBITNOTEINSERT";
	/* add for defect368 by steven -- TO UPDATE TOAF_MONTHLYGOODSTURNOVER PAYABLEAMOUNT WITH VARIABLECOST */
	public static final String MONTHLY_GOODS_TURNOVER_UPDATE =
		"TURNOVERTABLEUPDATE";	
	
	public static final int SUPPLIER_INVOICE_STATUS =1001;
	/********Acc Payable Batch***************/

	/******** srart RAJA-FINANCE ADMIN***************/
	public static final String ACQBANKSETUPEJB="ManageAcquiringBankSetupEJBJNDI";
	public static final String ACQBANKLIST="ACQBANKLIST";
	public static final String MODIFYINGACQBANKID="MODIFYINGACQBANKID";
	public static final String CARDTYPE_DOMAINNAME="CREDITCARDTYPE";
	public static final String ACQBANKSETUPSCRDETAILS="ACQBANKSETUPSCRDETAILS";
	public static final String ACQBANKSETUPSCRMODE="ACQBANKSETUPSCRMODE";
	public static final String ACQBANKSETUPSCRMODE_ADD="ACQBANKSETUPSCRMODE_ADD";
	public static final String ACQBANKSETUPSCRMODE_MODIFY="ACQBANKSETUPSCRMODE_MODIFY";
	public static final String RMDRADJ_DOMAINNAME="REMINDERADJUSTMENT";
	public static final String RMDRCALCN_DOMAINNAME="REMINDERCALCULATION";
	public static final String AUTHAMTTYPE_DOMAINNAME="AUTHAMTTYPE";
	public static final String AMTRCVDFOR_DOMAINNAME="CUSTTRANSTYPE";

	public static final String CCSERVICECHARGESETUPEJB="ManageCCServiceChargeSetupEJBJNDI";
	public static final String CCSERVCHRGSETUPSCRDETAILS="CCSERVCHRGSETUPSCRDETAILS";
	public static final String CCSERVCHRGSETUP_MODE="CCSERVCHRGSETUP_MODE";
	public static final String CCSERVCHRGSETUP_MODE_ADD="CCSERVCHRGSETUP_MODE_ADD";
	public static final String CCSERVCHRGSETUP_MODE_MODIFY="CCSERVCHRGSETUP_MODE_MODIFY";
	public static final String TOAF_CCSERVICECHARGESETUP="TOAF_CCSERVICECHARGESETUP";

	public static final String CCRESPONSECODESETUPEJB="ManageCCResponseCodeSetupEJBJNDI";
	public static final String CCRESPCODESETUPSCRDETAILS="CCRESPCODESETUPSCRDETAILS";
	public static final String CCRESPCODESETUP_MODE="CCRESPCODESETUP_MODE";
	public static final String CCRESPCODESETUP_MODE_ADD="CCRESPCODESETUP_MODE_ADD";
	public static final String CCRESPCODESETUP_MODE_MODIFY="CCRESPCODESETUP_MODE_MODIFY";
	public static final String TOAF_CCRESPONSECODESETUP="TOAF_CCRESPONSECODESETUP";

	public static final String BRANCHSETUPEJB="ManageBankBranchSetupEJBJNDI";
	public static final String BRANCHSETUPSCRDETAILS="BRANCHSETUPSCRDETAILS";
	public static final String BRANCHSETUP_MODE="BRANCHSETUP_MODE";
	public static final String BRANCHSETUP_MODE_ADD="BRANCHSETUP_MODE_ADD";
	public static final String BRANCHSETUP_MODE_MODIFY="BRANCHSETUP_MODE_MODIFY";
	public static final String TOAF_BRANCHSETUP="TOAF_BRANCHSETUP";

	public final String CALLBANKSETUPEJB="ManageCallBankSetupEJBJNDI";
	public static final String CALLBANKSETUPSCRDETAILS="CALLBANKSETUPSCRDETAILS";
	public static final String CALLBANKSETUP_MODE="CALLBANKSETUP_MODE";
	public static final String CALLBANKSETUP_MODE_ADD="CALLBANKSETUP_MODE_ADD";
	public static final String CALLBANKSETUP_MODE_MODIFY="CALLBANKSETUP_MODE_MODIFY";
	public static final String TOAF_CALLBANKSETUP="TOAF_CALLBANKSETUP";

	public static final String BANKSETUPEJB="ManageBankSetupEJBJNDI";
	public static final String BANKSETUPSCRDETAILS="BANKSETUPSCRDETAILS";
	public static final String BANKSETUP_MODE="BANKSETUP_MODE";
	public static final String BANKSETUP_MODE_ADD="BANKSETUP_MODE_ADD";
	public static final String BANKSETUP_MODE_MODIFY="BANKSETUP_MODE_MODIFY";
	public static final String TOAF_BANKSETUP="TOAF_BANKSETUP";

	/********End RAJA-FINANCE ADMIN***************/

	/***********
	 * SO DS/OAF/IT3/CCPREPNO
	 * ****/
	public static final int INIT_VALUE = 0;
	public static final String MODE = "MODIFY";
	public static final String INIT_MODE = "LOAD";
	public static final String CCPREPNO_SETUP_TABLE = "TOAF_CCPREPOSITIONNO";
	public static final String CCPREPNO_SERVICE = "ManageCCPrepNoSetupEJBJNDI";
	/**
	 * EO DS/OAF/IT3/CCPREPNO
	 * **************/

	/***********
	 * SO DS/OAF/IT3/PAYMENTGATEWAYSETUP
	 * ****/
	public static final String TERMINALID_SETUP_TABLE =
		"TOAF_PAYMENTGATEWAYSETUP";
	public static final String TERMINALID_SERVICE =
		"ManageTerminalIdSetupEJBJNDI";
	/**
	 * EO DS/OAF/IT3/PAYMENTGATEWAYSETUP
	 * **************/

	/***********
	 * SO DS/OAF/IT3/TRANSFERACCOUNT
	 * ****/
	public static final String TRANSFERACCOUNT_SETUP_TABLE =
		"TOAF_TRANSFERACCNOSETUP";
	public static final String TRANSFERACCOUNT_SERVICE =
		"ManageTransferAccNoSetupEJBJNDI";
	/**
	 * EO DS/OAF/IT3/TRANSFERACCOUNT
	 * **************/

	// Arun IT3 Collections
	public static final String AGENTS_ALLOCATION_DAO =
		"ehsn.et1.db.oaf.batch.dao.AgentsAllocationBatchDAO";
	public static final String COLLECTION_BATCH_DAO =
		"ehsn.et1.db.oaf.batch.dao.CollectionBatchDAO";

	public static final double WEIGHTAGE_DUEAMOUNT = 1;
	public static final double WEIGHTAGE_AGE = 1;
	public static final double WEIGHTAGE_CASECOUNT = 1;
	public static final short TELEPHONIC_REALLOCATION_ALLOCATIONTYPE_PARAM_ID =
		1002;
	public static final short TELEPHONIC_REALLOCATION_BUCKETTYPE_PARAM_ID =
		1001;
	public static final short MAJORALLOCATION_BATCH_ALLOCATIONTYPE_PARAM_ID =
		1002;
	public static final short SCHEDULED_ALLOCATION_BATCH_BUCKETTYPE_PARAM_ID =
		1001;
	public static final int FIRST_BUCKET_START_AGE = 0;
	public static final int FIRST_BUCKET_START_AGE_M2 = 41;

	public static final int ALLOCATION_TYPE_REALLOCATION = 1000;
	public static final int ALLOCATION_TYPE_HOLDCASES = 1001;

	public static final String BUCKETTYPE_M1 = "M1";
	public static final String BUCKETTYPE_M2 = "M2";
	public static final String BUCKETTYPE_L1 = "L1";
	public static final String BUCKETTYPE_O1 = "O1";
	public static final String BUCKETTYPE_O2 = "O2";

	public static final String SCHEDULE_AGENTS_ALLOCATION =
		"ManageScheduleAgentsAllocationEJBJNDI";
	public static final String TELEPHONIC_REALLOCATION_BATCH = "OAF_123";
	public static final String SCHEDULE_BUCKET_ALLOCATION_BATCH = "OAF_124";

	public static final String COLLECTION_DISCREPANCY_REPORT =
		"ManageCollectionDiscrepancyCasesEJBJNDI";

	public static final String NCCC_AUTH = "ManageNCCCAuthEJBJNDI";
	public static final int CRM_DELIVERY_PRIORITY_HIGH=1001;

	// Collection Constants  Prabhu
	public static String BILLINGDOCUMENT_EJBJNDI =
		"ManageBillingDocumentEJBJNDI";
	public static final String MANAGE_WRITEOFF_EJB_JNDI =
		"ManageWriteOffEJBJNDI";
	public static final String CUSTOMER_COLLECTION_ID =
		"CUSTOMER_COLLECTION_ID";
	public static final String CUSTOMER_COLLECTION_DETAIL =
		"CUSTOMER_COLLECTION_DETAIL";
	public static final String MANAGE_DELINQUENT_DETAILS_EJB_JNDI =
		"ManageDelinquentOrderDetailEJBJNDI";
	public static final String CUSTOMER_DELINQUENT_ORDER_DETAIL =
		"CUSTOMER_DELINQUENT_ORDER_DETAIL";
	public static final String ORDER_INSTALLMENT_DETAIL =
		"ORDER_INSTALLMENT_DETAIL";
	public static final String MANAGE_COLLECTION_CASE_INSTALLMENT_EJB_JNDI =
		"ManageCollectionCaseInstallmentDetailsEJBJNDI";

	public static final String COLLECTION_CONTACT_HISTORY_EJB_JNDI =
		"CollectionContactHistoryEJBJNDI";

	public static final String COLLECTION_ADMIN_EJB_JNDI =
		"ManageCollectionAdministrationEJBJNDI";

	public static final String MANAGE_AGENT_PERFORMANCE_EJB_JNDI =
		"ManageAgentPerformanceEJBJNDI";

	public static final String MANAGE_TELEPHONIC_PROCESS_EJB_JNDI =
		"ManageTelephonicCollectionEJBJNDI";

	public static final String ORDER_ID = "ORDER_ID";
	public static final String ITEM_ID = "ITEM_ID";
	public static final String ORDER_ITEM_LIST = "ORDER_ITEM_LIST";
	public static final String CUSTOMER_COLLECTION_PAYMENT_HISTORY =
		"CUSTOMER_COLLECTION_PAYMENT_HISTORY";
	public static final String WRITE_OFF_REASON = "WRITE_OFF_REASON";
	public static final String WRITE_OFF_DATE = "WRITE_OFF_DATE";
	public static final String CUSTOMER_COLLECTION_CASE_HISTORY =
		"CUSTOMER_COLLECTION_CASE_HISTORY";
	public static final String CUSTOMER_ACCOUNT_INFO = "CUSTOMER_ACCOUNT_INFO";

	// Jana - Collection Constants
	public static final int INVOKEDFROM_COLLECTION_NCCAUTH=5;
	public static final int DELINQUENTORDERDETAILS_COMMON = 1001;
	public static final int INVOKEDBY_OAFCOLLECTIONAGENT = 1002;
	public static final int POP_UP_FROM_LEGALDOCUMENT = 14;
	public static String MANAGE_COLLECTION_DELINQ_BUCK_SETUP =
		"ManageCollectionDelinqBuckSetupEJBJNDI";
	public static String MANAGE_COLLECTION_AGENT_SETUP =
		"ManageCollectionAgentSetupEJBJNDI";
	public static String MANAGE_COLLECTION_OUTSOURCING_AGENCY_SETUP =
		"ManageCollectionOutsourcingAgencySetupEJBJNDI";
	public static String MANAGE_COLLECTION_PROCESS_SETUP =
		"ManageCollectionProcessSetupEJBJNDI";
	public static String MANAGE_LEGAL_COLLECTION =
		"ManageLegalCollectionEJBJNDI";
	public static final int INVOKEDBY_TRANSFERACROSSBUCKETS = 1001;
	public static final char ISNOTVALID = 'N';
	public static final String TOAF_OUTSOURCINGAGENCYSETUP =
		"TOAF_OUTSOURCINGAGENCYSETUP";
	public static final String TOAF_COLLECTIONPROCESS =
		"TOAF_COLLECTIONPROCESS";
	public static final String TOAF_COLLECTIONPROCESSSTEPS =
		"TOAF_COLLECTIONPROCESSSTEPS";

	public static final String TRANSACTIONMODE_NIL = "Nil";
	public static final String TRANSACTIONMODE_LOAD = "Load";
	public static final String TRANSACTIONMODE_SEARCH = "Search";
	public static final String TRANSACTIONMODE_ADD = "Add";
	public static final String TRANSACTIONMODE_MODIFY = "Modify";
	public static final String TRANSACTIONMODE_SAVE = "Save";
	public static final String TRANSACTIONMODE_UPDATE = "Update";
	public static final String TRANSACTIONMODE_DELETE = "Delete";
	public static final String TRANSACTIONMODE_INSERT = "Insert";
	public static final String TRANSACTIONMODE_NEW = "New";
	public static final String TRANSACTIONMODE_REMOVE = "Remove";

	public static final String TOAF_COLLECTIONDOCUMENT =
		"TOAF_COLLECTIONDOCUMENT";

	public static final String TOAF_BLACKLISTEDCUST="TOAF_BLACKLISTEDCUST";

	public static final int INVOKEDBY_COLLECTIONTELEPHONICPROCESS = 1003;
	public static final int INVOKEDBY_COLLECTIONLEGALPROCESS = 1004;

	public static final String ChangeCardNotificationPrint_ReportId = "OAF_0024";
	public static final String LegalNotificationPrint_ReportId = "OAF_0025";
	public static final String ConfiscationNotification1Print_ReportId = "OAF_0026";
	public static final String ConfiscationNotification2Print_ReportId = "OAF_0027";
	public static final String RegisteredNotificationByPostPrint_ReportId = "OAF_0028";
	public static final String RequestForLegalMitigationPrint_ReportId = "OAF_0029";
	public static final String OrderToPayPrint_ReportId = "OAF_0030";
	public static final String OutsourcingCertificatePrint_ReportId = "OAF_0031";
	public static final String RequestForFamilyDetailsDocumentPrint_ReportId = "OAF_0032";
	//Collection Legal Print H03 ReportId Add by Jessie 03/04/2006 Start
	public static final String ChangeCardNotificationPrint_ReportId_H03 = "OAF_0082";
	public static final String LegalNotificationPrint_ReportId_H03 = "OAF_0083";
	public static final String ConfiscationNotification1Print_ReportId_H03 = "OAF_0084";
	public static final String ConfiscationNotification2Print_ReportId_H03 = "OAF_0085";
	public static final String RegisteredNotificationByPostPrint_ReportId_H03 = "OAF_0086";
	public static final String RequestForLegalMitigationPrint_ReportId_H03 = "OAF_0087";
	public static final String OrderToPayPrint_ReportId_H03 = "OAF_0088";
	public static final String OutsourcingCertificatePrint_ReportId_H03 = "OAF_0089";
	public static final String RequestForFamilyDetailsDocumentPrint_ReportId_H03 = "OAF_0090";
	//Collection Legal Print H03 ReportId Add by Jessie 03/04/2006 End
	public static final String MonthlyAuthorizationFailed_ReportId = "OAF_0012";
	public static final String MonthlyAuthFailed_ReportName="MonthlyAuthorizationFailedReport";
	public static final String MonthlyAuthFailed_ImportSectionName="Report";
	public static final String MonthlyAuthFailed_QuerySectionNames="Query,Query2";
	public static final String MonthlyAuthFailed_QueryParam1="Year";
	public static final String MonthlyAuthFailed_Param1SectionName="Query";
	public static final String MonthlyAuthFailed_QueryParam2="Month";
	public static final String MonthlyAuthFailed_Param2SectionName="Query";
	public static final String MonthlyAuthFailed_ParamLimitOperator="=";
	public static final String MonthlyAuthFailed_QueryParam3="Domaincode";
	public static final String MonthlyAuthFailed_Param3SectionName="Query2";

	public static final String REQUESTRECEIPT_DELIVERY_EXPORT_FILENAME = "Delivery_";
	public static final String REQUESTRECEIPT_MERCHANDISEADMIN_EXPORT_FILENAME = "MerchandiseAdmin_";
	public static final String DELIVERY_EXPORT_SHEETNAME = "NORMALDELIVERY";
	public static final String MERCHANDISEADMIN_EXPORT_SHEETNAME = "MERCHANDISEADMINMA";
	public static final String DEPARTMENT_COLLECTION_FOR_REQUESTRECEIPT = "Collection";

	//Modify by Jessie 02/24/2006
	public static final String DONATIVE_INVOICE_MATCH_BATCHID = "OAF_143";
	public static final short LUCKYDRAW_DATEFROM_PARAM_ID =	1001;
	public static final short LUCKYDRAW_DATETO_PARAM_ID = 1002;
	public static final String DonativeInvoicePrint_ReportId = "OAF_0081";
	//	 add by Arnold for DonateInvoiceMatchBatchDAO
	public static final String DonateInvoiceMatch_BATCH_DAO =
		"ehsn.et1.db.oaf.batch.dao.DonateInvoiceMatchBatchDAO";

	//shala.v -for iteration3
	public static final String INVOICE_DEBIT_NOTE =
		"IssueDebitNoteInvoiceEJBJNDI";
	
	public static final String OUTDOOR_INVOICE_DEBIT_NOTE = "IssueOutDoorDebitNoteInvoiceEJBJNDI";
	public static final String OutDoorDebitNotePrint_Normal_ReportId = "OAF_0103";
	public static final String OutDoorDebitNotePrint_Manual_ReportId = "OAF_0104";
	
	public static final String INVOICE_NOT_RETURN = "InvoiceNotReturnEJBJNDI";
	//Add by Jessie 03/08/2006
	public static final String DONATIVE_INVOICE = "DonativeInvoiceEJBJNDI";
	public static final String INVOICE_MEDIAREPORT = "MediaReportEJBJNDI";
	public static final String MEDIAREPORT_IMPORT_MANUAL_INVOICE = "OAF_145";
	public static final String MEDIAREPORT_EXPORT_FROMOTHER_SYSTEMS = "OAF_147";
	public static final String MEDIAREPORT_EXPORT_TOFILE_BATCHID = "OAF_148";
	public static final String EXPORT_FROMOTHER_SYSTEMS =
		"ehsn.et1.db.oaf.batch.dao.MediaReportExportOtherSystemsDAO";
	public static final String EXPORT_TOFILE_DAO =
		"ehsn.et1.db.oaf.batch.dao.MediaReportExportToFileDAO";
	public static final int EXPORT_FROMOTHER_SYSTEMS_PARAMID = 1001;
	public static final int EXPORT_TOFILE_PARAMID = 1001;
	public static final int EXPORT_TOFILE_COMPANYID_PARAMID = 1002;
	public static final int EXPORT_TOFILE_STATUS = 0;
	public static final String EXPORT_FROMOTHER_SYSTEMS_TRANSACTIONID =
		"OAF_3952";
	public static final String EXPORT_TOFILE_TRANSACTIONID = "OAF_3953";
	public static final int MEDIAREPORT_EXPORTTOFILE_SEQNO_LENGTH = 7;
	public static String OAF_MINDATE = "1700/01/01";
	public static String OAF_MAXDATE = "5000/12/12";
	public static int OAF_MINVALUE = 1;
	public static int OAF_MAXVALUE = 99999999;
	public static int ZERO_VALUE = 0;
	public static int INVOICE_STATUS_FORCEDCLOSE = 1007;
	public static final String DEFAULT_YES = "Y";
	public static String RETURNS = "RETURNS";
	public static String SALES = "SALES";
	public static int RETURNS_COMPANYINVOICE = 33;
	//public static int RETURNS_PERSONALINVOICE =34;
	public static int SALES_COMPANYINVOICE = 31;
	//public static int SALES_PERSONALINVOICE =32;
	public static final int TAIWANYEAR_TOBEADDED = 1911;
	public static int PREFIX_LENGTH =2;

	public static final String MEDIAREPORT_SUPPLIERINVOICE_BATCHID ="OAF_146";
	public static final int EXPORT_SUPPLIERINVOICE_PARAMID1=1001;
	public static final int EXPORT_SUPPLIERINVOICE_PARAMID2=1002;

	//Prakash
	//Invoice Number Setup
	public static final String INVOCIENUMBER_SETUP =
		"InvoiceNumberSetupEJBJNDI";
	public static final String COMPANYNAMES = "COMPANYNAMES";
	public static final String INVOICEPREFIX = "INVOICEPREFIX";
	public static final String INVOICESETUPSEARCHCRITERIA =
		"INVOICESETUPSEARCHCRITERIA";
	public static final String INVOICESETUPSEARCH = "INVOICESETUPSEARCH";
	public static final String INVOICESETUPMODIFYSELECTED =
		"INVOICESETUPMODIFYSELECTED";
	public static String INVOICE_VALIDITY_YES = "Yes";
	public static String INVOICE_VALIDITY_NO = "No";
	public static String INVOICE_VALID = "Y";
	public static String INVOICE_NOTVALID = "N";
	public static final int INVOICESETUP_NORMAL = 1001;
	public static final int INVOICESETUP_MANUAL = 1002;

	public static final int INVOICESETUP_NUMBERVALIDMONTHS = 2;
	public static final String INVOICESETUP_ASSIGNUSERSTASKNAME = "OAF_ASSIGN_INVOICE_NO";
	public static final int POP_UP_FROM_BO_MODIFY_INVOICE=14;

	//IssueManualInvoice
	public static final String ISSUEMANUALINVOICE = "IssueManualInvoiceEJBJNDI";
	public static final int MANUALSEARCH_CUSTOMERID = 1001;
	public static final int MANUALSEARCH_CUSTOMERNAME = 1002;
	public static final int MANUALSEARCH_COMPANYREGID = 1003;
	public static final int MANUALSEARCH_PAYMENTMODE = 1004;

	public static final int POP_UP_FROM_BO_MANUAL_INVOICE = 13;

	public static String OPTION_SELECT = "Select";

	public static String MANUALINVOICE_EXPORT_FILENAME = "ManualInvoice_";
	public static String MANUALINVOICE_SHEETNAME = "ManualInvoice";
	public static final int MANUALINVOICE_EXCEL_ROWLIMIT = 20000;

	//Modify Invoice details
	public static final String MODIFYINVOICE = "ModifyInvoiceEJBJNDI";

	//Pradheepa it3
	public static int SALES_SUPPLIERINVOICE=21;
	public static int RETURNS_SUPPLIERINVOICE=23;

	public static final int CUSTOMER_REGISTRATION_1=1;
	public static final int CUSTOMER_REGISTRATION_2=2;

	//Issue automobile invoice screen
	public static final String ISSUE_AUTOMOBILE_INVOICE =
		"ManageIssueAutomobileInvoiceEJBJNDI";
	public static final int POP_UP_FROM_BO = 12;

	//Invoice number assign batch
	public static final String INVOICE_NUMBER_ASSIGN_BATCH_DAO =
		"ehsn.et1.db.oaf.batch.dao.InvoiceNumberAssignBatchDAO";
	//EDI file batch
	public static final String INVOICE_EDI_FILE_BATCH_DAO =
		"ehsn.et1.db.oaf.batch.dao.InvoiceEdiGenerationDAO";
	//Screen Issue Invoice EDI
	public static final String ISSUE_INVOICE_EDI = "ManageIssueInvoiceEJBJNDI";



	//== Funerary update DAO Arnold

	public static final String FUNERARYINSTALLMENT_BATCH_DAO =
		"ehsn.et1.db.oaf.batch.dao.impl.FuneraryInstallmentDAOImpl";


	//Import manual invoice Batch
	public static final String IMPORT_MANUAL_INVOICE_BATCH =
		"ehsn.et1.db.oaf.batch.dao.ImportManualInvoiceBatchDAO";
	public static final int IMPORT_MANUAL_INVOICE_PARAM_ID_INVOICETYPE = 1001;
	public static final int IMPORT_MANUAL_INVOICE_PARAM_ID_INVOICEUSERID = 1002;

	//Import manual invoice screen
	public static final String IMPORT_MANUAL_INVOICE =
		"ManageImportManualInvoiceEJBJNDI";

	//Media report extract batch
	public static final String MEDIA_REPORT_EXTRACT_BATCH_DAO =
		"ehsn.et1.db.oaf.batch.dao.MediaReportExtractBatchDAO";

	public static final int MEDIA_REPORT_EXTRACT_PARAM_ID_COMPANYID = 1001;
	public static final int MEDIA_REPORT_EXTRACT_PARAM_ID_YEARFROM = 1002;
	public static final int MEDIA_REPORT_EXTRACT_PARAM_ID_MONTHFROM = 1003;
	public static final int MEDIA_REPORT_EXTRACT_PARAM_ID_YEARTO = 1004;
	public static final int MEDIA_REPORT_EXTRACT_PARAM_ID_MONTHTO = 1005;
	
	//Media report extract batch Manual
	public static final int MEDIA_REPORT_CROSS_PERIOD_DATE = 1;

	public static final int OUTDOORINVOICE_BATCH_PARAM_COMPANY = 3201;
	public static final int OUTDOORINVOICE_BATCH_PARAM_YEARFROM = 3202;
	public static final int OUTDOORINVOICE_BATCH_PARAM_MONTHFROM = 3203;
	public static final int OUTDOORINVOICE_BATCH_PARAM_YEARTO = 3204;
	public static final int OUTDOORINVOICE_BATCH_PARAM_MONTHTO = 3205;

	public static final String OUTDOOR_INVOICES_EXTRACTION_BATCH="OAF_149";


	// automobile product lclass , mclass code
  	  public static final int AUTOMOBILE_PRODUCT_LCLASS_CODE=40000;
	  public static final int AUTOMOBILE_PRODUCT_MCLASS_CODE=460;
	  public static final int AUTOMOBILE_PRODUCT_MCLASS_CODE_1=40600;
	  public static final int AUTOMOBILE_PRODUCT_MCLASS_CODE_2=40700;
	// add by steven 20060324
	  public static final int AUTOMOBILE_PRODUCT_SCLASS_CODE_1=40415;

	//Supplier Invoice Batch

	public static final String INVOICE_SUPPLIER_INVOICE_BATCH_DAO=
		"ehsn.et1.db.oaf.batch.dao.ImportSupplierInvoiceBatchDAO";

	public static final int IMPORT_SUPPLIER_INVOICE_PARAM_ID_YEAR = 1001;
	public static final int IMPORT_SUPPLIER_INVOICE_PARAM_ID_MONTH = 1002;

	//Transaction code

	public static final int INVOICE_TRANSACTION_CODE_CUSTOMER_SALES = 31;
	public static final int INVOICE_TRANSACTION_CODE_CUSTOMER_RETURNS = 33;
	public static final int INVOICE_TRANSACTION_CODE_SUPPLIER_SALES = 21;
	public static final int INVOICE_TRANSACTION_CODE_SUPPLIER_RETURNS = 23;

	public static final String INVOICE_IMPORT_FILE_LOCATION_OUTDOOR="c:\\EDIOutputFiles\\OAF\\Invoicing\\ManualInvoice\\Outdoor\\";
	public static final String INVOICE_IMPORT_FILE_LOCATION_PRORDER="c:\\EDIOutputFiles\\OAF\\Invoicing\\ManualInvoice\\PROrder\\";
	public static final String INVOICE_IMPORT_FILE_LOCATION_COMPANY="c:\\EDIOutputFiles\\OAF\\Invoicing\\ManualInvoice\\Company\\";
	public static final String INVOICE_IMPORT_FILE_NAME_OUTDOOOR="Outdoor";
	public static final String INVOICE_IMPORT_FILE_NAME_PRORDER="PROrder";
	public static final String INVOICE_IMPORT_FILE_NAME_COMPANY="Company";

	public static final String INVOICE_IMPORT_FILE_LOCATION_READ_FILES_="c:\\EDIOutputFiles\\OAF\\Invoicing\\ManualInvoice\\FilesRead\\";
	//Accounts Payable Banu

	public static String MANAGE_OVERHEAD_COST_SETUP =
		"ManageOverheadCostSetupEJBJNDI";
	public static String MANAGE_SUPPLIER_SETT_AMOUNT_SETUP =
		"ManageSupplierSettAmountSetupEJBJNDI";
	public static String GREATERTHAN = ">";
	public static String LESSTHAN = "<=";
	public static String MANAGE_SUPPLIER_OVERHEADCOST =
		"ManageSupplierOverheadCostEJBJNDI";
	public static String OVERHEADCOST_STATUS = "ALL";
	public static int OVERHEAD_ALL_STATUS = 0;
	public static final int OVERHEADCOST_OTHERS = 9999;
	public static String OVERHEADCOST_DAY = "20";
	//xialiang 20140402 负销量费用种类
	public static int OVERHEADCOST_FXL = 0;//负销量
	//厂商月结单审批 初审复审标志
	public static String OVERHEADCOST_FIRSTCHECK = "1";//初审
	public static String OVERHEADCOST_SECONDCHECK = "2";//复审
	public static String NAME_VALUE_DELIMITER = "/";
	public static String MANAGE_PRODUCT_DISCREPANCY_REPORT =
		"ManageProductDiscrepancyReportEJBJNDI";
	public static String MANAGE_MONTHLYGOODS_TURNOVER_REPORT =
		"ManageMonthlygoodsTurnoverRepEJBJNDI";
	public static String NOVALUE = "0";
	public static String MANAGE_SUPPLIER_VAR_COST_SETTLEMENT =
		"ManageSupplierVarCostSettlementEJBJNDI";
	public static String BEGINNER = "(";
	public static String MANAGE_SUPPLIER_CATEGORY_A_REPORT =
		"ManageSupplierCategoryARepEJBJNDI";
	public static String SUPPLIER_CATEGORY_A_REPORT_EXPORT_FILENAME = "SupplierCategoryARepor_";
	public static String SUPPLIER_CATEGORY_A_REPORT_SHEETNAME = "SupplierCategoryARepor";
	public static int FIRSTMONTH=1;
	public static int LASTMONTH=12;
	public static String VALID_AMOUNTLEVEL="Y";
	public static String INVALID_AMOUNTLEVEL="N";

	public static String MANAGE_CLOSE_TRAVEL_ACCOUNTS =
		"ManageAccountsPayableCloseTravelAccountsEJBJNDI";
	public static String MANAGE_SEARCH_TRAVEL_RECORDS_LOAD_COMBO =
		"ManageAccountsPayableTravelRecordsLoadComboEJBJNDI";

	public static final String SECURITY_SERVICE_HISTORY_TRAVEL_RECORD_CREATION =
		"ManageHistoryRecordCreationEJBJNDI";
	public static final String SECURITY_SERVICE_TRAVEL_SETTLEMENT =
		"ManageTravelSettlementServiceEJBJNDI";
	public static final String DELETED = "N";
	public static final String ACTIVE = "Y";

	public static final String INVOICE_EDI_FILE_BATCH_TRANSACTIONSETID =
		"OAF_3951";
	public static String SPM_USER="SPMUSER";
	public static String BO_USER="BO_USER";
	//RISK MANAGEMENT CONSTANTS
	public static String MSG_CREDIT_LIMIT_DETAILS_NOT_FOUND = "OAF4501";
	public static String MSG_CREDIT_LIMIT_SETUP_SAVE_SUCCESS = "OAF4502";
	public static String MSG_CREDIT_LIMIT_SETUP_MODIFIED_SUCCESS = "OAF4503";
	public static String MSG_RISK_FACTOR_NOT_FOUND = "OAF4504";
	public static String MSG_RISK_FACTOR_SAVE_SUCCESS = "OAF4505";
	public static String MSG_RISK_FACTOR_MODIFY_SUCCESS = "OAF4506";
	public static String MSG_RISK_FACTOR_MODIFY_SCORE = "OAF4507";
	public static String MSG_RISK_FACTOR_DELETE_SCORE = "OAF4508";
	public static String MSG_ENTER_FROM_VALUE = "OAF4509";
	public static String MSG_ENTER_TO_VALUE = "OAF4510";
	public static String MSG_RISK_FACTOR_SCORE_DELETE_SUCCESS = "OAF4511";
	public static String MSG_RISK_FACTOR_SCORE_MODIFY_SUCCESS = "OAF4512";
	public static String MSG_RISK_FACTOR_SCORE_SAVE_SUCCESS = "OAF4513";
	public static String NOTIFICATION_VERIFICATION_CANCELLATION = "OAF_0043";
	public static String CUSTOMER_CREDIT_LIMIT_SETUP_EJB_JNDI =
		"CustomerCreditLimitSetupEJBJNDI";
	public static String MODIFY_MODE = "MODIFY";
	public static String ADD_MODE = "ADD";
	public static String DELETE_MODE = "DELETE";
	public static String RISK_FACTOR_SETUP_EJB_JNDI = "RiskFactorSetupEJBJNDI";
	public static String RISK_FACTOR_SCORE_SETUP_EJB_JNDI =
		"RiskFactorScoreSetupEJBJNDI";
	public static final String RISK_MANAGEMENT_BATCH_DAO =
		"ehsn.et1.db.oaf.batch.dao.RiskManagementBatchDAO";

		public static String RISK_FACTOR_RULE_SETUP_EJB_JNDI = "VerificationCriteriaEJBJNDI";
	public static String VERFICATION_FAILURE_CODE_SETUP_EJB_JNDI = "VerificationFailureReasonSetupEJBJNDI";
	public static String SELECTED_AND="AND";
	public static String SELECTED_OR="OR";
	public static String RISK_FIRST_MAIN_FACTOR_SETUP_EJB_JNDI = "RiskStageFactorSetupEJBJNDI";

	public static String[] PERSONAL_FACTOR_XLABELS = {"X3","X4","X7","X8","X9","X10","X11","X12","X13","X18",
														   "X20","X21","X22","X24","X25","X26","X27"
														   };
	public static String[] PERSONAL_FACTOR_YLABELS = {"Y1","Y2","Y3","Y4","Y5","Y6","Y7","Y8","Y9","Y10",
															   "Y11","Y12","Y13","Y14"
														  };

	public static String[] PERSONAL_FACTOR_ZLABELS = {"Z1","Z2","Z3","Z4","Z5","Z6","Z7","Z8","Z9","Z10",
														"Z11","Z12","Z13","Z14"
													 };

	public static String[] ORDER_FACTOR_YLABELS = {"Y15","Y16","Y17","Y18","Y19","Y20","Y21","Y22"};
	public static String[] ORDER_FACTOR_ZLABELS = {"Z15","Z16","Z17","Z18","Z19","Z20","Z21","Z22"};

	public static String B_FACTOR = "B";
	public static String MSG_FACTOR_MODIFY_SUCCESS = "OAF4517";
	public static String MSG_NO_RULES_FOUND = "OAF4518";
	public static String MSG_NO_ITEMS_FOUND = "OAF4514";
	public static String MSG_SELECT_ITEM_FOR_MODIFY = "OAF4516";
	public static String MSG_NO_FAILURE_REASONS_FOUND = "OAF4566";
	public static String MSG_FAILURE_REASON_SAVE_SUCCESS = "OAF4567";
	public static String MSG_RULE_CREATED_SUCCESSFULLY = "OAF4565";
	public static String MSG_RULE_MODIFIED_SUCCESSFULLY = "OAF4564";

	public static String RULE_VARIABLE_NOOFORDERS = ":NOOFORDERS";
	public static String RULE_VARIABLE_NOOFADDRESSES = ":NOOFADDRESSES";
	public static String RULE_VARIABLE_PRODUCTAMOUNT = ":PRODUCTAMOUNT";
	public static String RULE_VARIABLE_PRODUCTMIDDLECATEGORY = ":PRODUCTMIDDLECATEGORY";
	public static String RULE_VARIABLE_ORDERDATE = ":ORDERDATE";
	public static String RULE_VARIABLE_FIRSTORDERDATE = ":FIRSTORDERDATE";
	//change ORDERAMOUNT to PRODUCTAMOUNT into Rule_Condition  modify by meg
	public static String RULE_VARIABLE_ORDERAMOUNT = ":PRODUCTAMOUNT";

	public static String RULE_OPERATOR_BETWEEN = "between";

	//NEW CONSTANTS ADDED
	public static int MAIN_FACTOR_CONSTANT_ORDER = 8;
	public static int MAIN_FACTOR_CONSTANT_PERSONAL = 17;
	public static int MAIN_FACTOR_CONSTANT_PERSONAL_DISPLAY = 14;
	public static int MAIN_FACTOR_CONSTANT = 2;
	public static String ORDER_FACTOR_XLABELS = "X";

	public static String DOT_COM=".com";
	public static String DOT_NET=".net";
	public static String DOT_EDU=".edu";

	//RISK MANAGEMENT CONSTANTS

	public static final char IS_MARKED_FOR_EDI_FILE_GENERATION = 'Y';
	public static final int MANIPULATION_CODE = 12121241;
	public static final String IMPORT_MANUAL_INVOICE_BATCH_ID = "OAF_144";

	public static final short NCCCBATCHAUTHORIZATION_AUTHREQUESTTYPE_PARAM_ID = 1001;
	public static final short NCCCBATCHAUTHORIZATION_CARDTYPE_PARAM_ID = 1002;
	public static final short NCCCBATCHAUTHORIZATION_COMPANYID_PARAM_ID = 1003;
	public static final short NCCCBATCHAUTHORIZATION_INCLUDEREJECTED_PARAM_ID = 1004;
	public static final short NCCCBATCHAUTHORIZATION_PLANNEDAUTHDATEFROM_PARAM_ID = 1005;
	public static final short NCCCBATCHAUTHORIZATION_PLANNEDAUTHDATETO_PARAM_ID = 1006;
	public static final short NCCCBATCHAUTHORIZATION_ONLINEPLATFORM_PARAM_ID=1007;
	public static final short NCCCBATCHAUTHORIZATION_SPLITGROUP_PARAM_ID = 1008;
	
	public static final String NCCCBATCHAUTHORIZATION_BATCH_DAO =
		"ehsn.et1.db.oaf.batch.dao.NCCCBatchAuthorizationBatchDAO";

	public static final String NCCC_BATCHAUTHORIZATION_BATCH = "OAF_125";

  // OAF-IT3-SASI-START
  //Order And Personal Score Caluculation Batches
  public static final String OAF_ORDER_SCORE_CALC_BATCH_DAO = "ehsn.et1.db.oaf.batch.dao.OrderScoreCalculationBatchDAO";
  public static final String OAF_PERSONAL_SCORE_CALC_BATCH_DAO = "ehsn.et1.db.oaf.batch.dao.PersonalScoreCalculationBatchDAO";
  public static final int OAF_PAYMENT_MODE_ID = 3;//for credit card mode payment
  public static final int OAF_PAYMENT_STATUS_CANCELLED = 3204;
  public static final int OAF_PAYMENT_STATUS_OFFSET = 3205;
  public static final int OAF_ORDER_STATUS_CANCELLED = 1007;
  public static final int OAF_PAYMENT_ZEROTH_INSTALLMENT =0;
  public static final int OAF_PAYMENT_FIRST_INSTALLMENT =1;
  public static final String OAF_RISK_FACTOR_ID_3 = "D3";
  public static final String OAF_RISK_FACTOR_ID_4 = "D4";
  public static final String OAF_RISK_FACTOR_ID_5 = "D5";
  public static final String OAF_RISK_FACTOR_ID_6 = "D6";
  public static final String OAF_RISK_FACTOR_ID_7 = "D7";
  public static final String OAF_RISK_FACTOR_ID_8 = "D8";
  public static final String OAF_RISK_FACTOR_ID_9 = "D9";
  public static final String OAF_RISK_FACTOR_ID_10 = "D10";
  public static final String OAF_RISK_FACTOR_ID_11 = "D11";
  public static final String OAF_RISK_FACTOR_ID_12 = "D12";
  public static final String OAF_RISK_FACTOR_ID_13 = "D13";
  public static final String OAF_RISK_FACTOR_ID_14 = "D14";
  public static final String OAF_RISK_FACTOR_ID_15 = "D15";
  public static final String OAF_RISK_FACTOR_ID_16 = "D16";
  public static final String OAF_RISK_FACTOR_ID_17 = "D17";
  public static final String OAF_RISK_FACTOR_ID_18 = "D18";
  public static final String OAF_RISK_FACTOR_ID_19 = "D19";
  public static final String OAF_RISK_FACTOR_ID_20 = "D20";
  public static final String OAF_RISK_FACTOR_ID_21 = "D21";
  public static final String OAF_RISK_FACTOR_ID_22 = "D22";
  public static final String OAF_RISK_FACTOR_ID_23 = "D23";
  public static final String OAF_RISK_FACTOR_ID_24 = "D24";
  public static final double OAF_FINAL_CONSTANT_B15 = -0.9371;
  public static final double OAF_FINAL_CONSTANT_B24 = -0.6215;
  public static final double OAF_PERSONAL_SCORE_THRESHHOLD_CONST = 1.0;
  public static final double OAF_ORDER_SCORE_THRESHHOLD_CONST = 1.0;
  public static final String OAF_YES = "Y";
  public static final String OAF_NO = "N";
  public static final int OAF_SCORE_TYPE_ORDER_SCORE = 1002;
  public static final int OAF_SCORE_TYPE_PERSONAL_SCORE = 1001;
  public static final int OAF_MAIN_FACTOR = 1002;
  public static final int OAF_FIRST_STAGE_FACTOR = 1001;
  public static final int OAF_MIDDLE_STAGE_FACTOR = 1002;
  public static final int OAF_SECOND_LEVEL_FACTOR = 1001;
  public static final int OAF_CONSTANT_FACTOR = 1003;//for constants mu and sigma
  public static final int OAF_INSTALLMENT_STATUS_1006= 1006;
  //Change the date as per document
  //public static final String OAF_PLANNED_AUTHDATE_CHECK = "1993/05/01";
  public static final String OAF_PLANNED_AUTHDATE_CHECK = "2005/05/01";
  public static final int OAF_NO_OF_DAYS_3 = 3;
  public static final int OAF_NO_OF_DAYS_60 = 60;

  //orderVerificationSpecialSearch
  public static final String MANAGEORDERVERIFICATIONSPECIALSERVICE_EJB_JNDI = "OrderHistoryEJBJNDI";
  public static final int OAF_ORDER_STATUS_DELIVERY_CONFIRMED = 1004;
  public static final int OAF_ORDER_STATUS_DELIVERY_FAILED =1005;
  public static final int OAF_ORDER_STATUS_ORDER_RETURNED = 1006;
  public static final int OAF_ORDER_STATUS_ORDER_CANCELLED = 1007;
  public static final int OAF_ORDER_STATUS_SHIPPING_CANCELLED = 1008;
  public static final int OAF_REFUND_STATUS_REFUND_SUCCEESSFUL = 1005;
  public static final int OAF_REFUND_STATUS_REFUND_PROCESSCOMPLETED = 1007;
  public static final int OAF_REFUND_STATUS_PENDING_REFUND = 1002;
  public static final int OAF_REFUND_STATUS_READY_FOR_REFUND = 1003;
  public static final int OAF_REFUND_STATUS_REFUND_IN_PROGRESS = 1004;

  //Order Verification
  public static final String ORDERVERIFICATIONSERVICE_EJB_JNDI = "OrderVerificationEJBJNDI";
  public static final String OAF_DELIVERY_ADDRESS_TYPE = "D";
  public static final int OAF_MAXROWS_FOR_EXPORT = 100;
  public static final String EXPORT_FILENAME = "EHSNOrderVerificationInfo_";
  public static final String EXPORT_SHEETNAME = "EHSNOrderVerificationInfo";
  public static final String EXTENTION_XLS = ".xls";
  public static final String OAF_TABLE_HEADER_STATUS = "CREDITCARD STATUS";
  public static final String OAF_TABLE_HEADER_CUSTOMERID = "CUSTOMERID";
  public static final String OAF_TABLE_HEADER_CUSTOMERNAME = "CUSTOMER NAME";
  public static final String OAF_TABLE_HEADER_CUSTOMERLEVEL = "CUSTOMER LEVEL";
  public static final String OAF_TABLE_HEADER_ORDERID = "ORDER ID";
  public static final String OAF_TABLE_HEADER_ORDERDATE = "ORDER DATE";
  public static final String OAF_TABLE_HEADER_ORDERAMOUNT = "ORDER AMOUNT(NTD)";
  public static final String OAF_TABLE_HEADER_ORDERTYPE = "ORDER TYPE";
  public static final String OAF_TABLE_HEADER_ORDERPRIORITY = "ORDER PRIORITY";
  public static final String OAF_TABLE_HEADER_VERIFYRESULT = "VERIFY RESULT";
  public static final String OAF_TABLE_HEADER_VERIFICATIONLEVEL = "VERIFICATION LEVEL";
  public static final String OAF_TABLE_HEADER_CCNO = "CREDITCARD NO";

  //Risk Case Score
  public static final String RISKFACTORSETUP_EJB_JNDI = "RiskFactorSetupEJBJNDI";

  // OAF-IT3-SASI-END

	public static final long MAX_LONG_VALUE = 2147483647;
	public static final int SETTLEMENTSTAUS_PENDING = 1001;
	public static final int SETTLEMENTSTAUS_APPROVED = 1003;
	public static final int MAX_INT_VALUE=99999999;
	public static final int MIN_NUM_VALUE=0;
	public static final int FINANCE_USER=3412;
	public static final int MA_USER=3429;
	public static final String SUPPLIERDEBITNOTE_CREATENEWDEBITNOTE = "SUPPLIERDEBITNOTE_CREATENEWDEBITNOTE";

	/*
	 * START:Supplier DebitNote Constants
	 */
	public static final String MANAGESUPPLIERDEBITNOTESERVICE_EJB_JNDI = "ManageSupplierDebitNoteServiceEJBJNDI";
	public static final String GET_SUPPLIER_DEBITNOTE_SEARCH_WITHOUTDATE = "GET_SUPPLIER_DEBITNOTE_SEARCH_WITHOUTDATE";
	public static final String GET_SUPPLIER_DEBITNOTE_SEARCH = "GET_SUPPLIER_DEBITNOTE_SEARCH";
	public static final String GET_PRODUCTINFO = "GET_PRODUCTINFO";
	public static final String TOAF_SUPPLIERDEBITNOTE = "TOAF_SUPPLIERDEBITNOTE";
	public static final String SUPPLIERDEBITNOTE_ADDNEWDEBITNOTE = "SUPPLIERDEBITNOTE_ADDNEWDEBITNOTE";
	public static final String SUPPLIERDEBITNOTE_UPDATE = "SUPPLIERDEBITNOTE_UPDATE";
	public static final String UPDATE_ALL_FIELD_SUPPLIERDEBITNOTE = "UPDATE_ALL_FIELD_SUPPLIERDEBITNOTE";
	/*
	 * END:Supplier DebitNote Constants
	 */

	/*
	 * START:supplier Invoice Constants
	 */
	public static final String MANAGESUPPLIERINVOICESERVICE_EJB_JNDI = "ManageSupplierInvoiceServiceEJBJNDI";
	public static final String GET_PURCHASEID_FOR_SUPPLIERID = "GET_PURCHASEID_FOR_SUPPLIERID";
	public static final String GET_PURCHASEID_FOR_SUPPLIERID_DEBITNOTE = "GET_PURCHASEID_FOR_SUPPLIERID_DEBITNOTE";
	public static final String GET_SUPPLIER_INVOICE_SEARCH = "GET_SUPPLIER_INVOICE_SEARCH";
	public static final String GET_SUPPLIER_INVOICE_SEARCH_WITHOUTDATE = "GET_SUPPLIER_INVOICE_SEARCH_WITHOUTDATE";
	public static final String SUPPLIERINVOICE_UPDATE = "SUPPLIERINVOICE_UPDATE";
	public static final String SUPPLIERINVOICE_ADDNEWINVOICE = "SUPPLIERINVOICE_ADDNEWINVOICE";
	public static final String SUPPLIERINVOICE_DELETEINVOICE = "SUPPLIERINVOICE_DELETEINVOICE";
	public static final String TOAF_SUPPLIERINVOICE = "TOAF_SUPPLIERINVOICE";
	public static final String GET_INFO_SUPPLIERINVOICE = "GET_INFO_SUPPLIERINVOICE";
	public static final String GET_COUNT_SUPPLIERINVOICE = "GET_COUNT_SUPPLIERINVOICE";
	public static final int SUPPLIERSETTLEMENT_STATUS_PENDING = 1001;
	public static final String SUPPLIERINVOICE_UPDATESTATUS = "SUPPLIERINVOICE_UPDATESTATUS";
	public static final String SUPPLIERINVOICE_EXPORT_FILENAME = "SupplierInvoice_";
	public static final String SUPPLIERINVOICE_SHEETNAME = "SupplierInvoice";
	/*
	 * STOP:supplier Invoice Constants
	 */

	/*
	 * START:supplier settlement Constants
	 */
	 public static final String MANAGESUPPLIERSETTLEMENTSERVICE_EJB_JNDI = "ManageSupplierSettlementServiceEJBJNDI";
	 public static final String SUPPLIERSETTLEMENT_UPDATE = "SUPPLIERSETTLEMENT_UPDATE";
	 public static final String SUPPLIERSETTLEMENT_UPDATEDETAILS = "SUPPLIERSETTLEMENT_UPDATEDETAILS";
	 public static final String SUPPLIERSETTLEMENT_INVOICE_NEXT = "SUPPLIERSETTLEMENT_INVOICE_NEXT";
	 public static final String SUPPLIERSETTLEMENT_INVOICE_PREVIOUS_MODIFY = "SUPPLIERSETTLEMENT_INVOICE_PREVIOUS_MODIFY";
	 public static final String SUPPLIERSETTLEMENT_INVOICE_PREVIOUS = "SUPPLIERSETTLEMENT_INVOICE_PREVIOUS";
	 public static final String SUPPLIERSETTLEMENT_INVOICE_NEXT_MODIFY = "SUPPLIERSETTLEMENT_INVOICE_NEXT_MODIFY";
	 public static final String SUPPLIERSETTLEMENT_DETAILS = "SUPPLIERSETTLEMENT_DETAILS";
	 public static final String FIND_VARIABLECOST_DETAILS = "FIND_VARIABLECOST_DETAILS";
	  public static final String GET_SUPPLIER_INVOICE_FOR_SUPPLIERSETTLEMENT = "GET_SUPPLIER_INVOICE_FOR_SUPPLIERSETTLEMENT";
	 public static final String FIND_OTHERDETAILS = "FIND_OTHERDETAILS";
	 public static final String FIND_OVERHEADCOST_DETAILS = "FIND_OVERHEADCOST_DETAILS";
	 public static final int DELIVERY_TYPE_DIRECT = 1002;
	 public static final int DELIVERY_TYPE_TRAVEL = 1004;
	  /*
	  * END:supplier settlement Constants
	  */

	/***********
	 * SO sheeba
	 * ****/
	public static final int INITIAL_VALUE = -1;
	public static final String BANKSETUP_TABLE = "TOAF_BANKSETUP";
	public static final String BANK_SERVICE = "ManageBankSetupEJBJNDI";
	/**
	 * EO sheeba
	 * **************/
	public static String REQUESTRECEIPT_EJBJNDI = "ManageRequestReceiptEJBJNDI";
	public static String OUTSOURCING_EJBJNDI = "ManageOutsourcingEJBJNDI";
	public static String TRANSFERACROSSBUCKETS_EJBJNDI =
		"ManageTransferAcrossBucketsEJBJNDI";
	public static final String ISHOLD_NO = "N";
	public static final String ISHOLD_YES = "Y";
	public static final int INCLUDE_RESPONDEDSEARCH = 1;
	public static final String EXPORT_FILENAME_DIRECTDELIVERY =
		"DIRECT_DELIVERY_FILE";
	public static final String EXPORT_FILENAME_NORMALDELIVERY =
		"NORMAL_DELIVERY_FILE";
	public static final String DEPARTMENT_COLLECTION = "COLLECTION";
	public static final String ISCONTACTADDRESS = "Y";
	public static final char ISSUCCESSFUL = 'Y';
	public static final char ISNOTSUCCESSFUL = 'N';
	public static final String COMPLETED = "COMPLETED";
	public static final String VERIFIED = "VERIFIED";
	public static final String COLLECTION_CASE_ASSIGNED_NOTIFICATION="OAF_0041";
	public static final String COLLECTION_AMOUNT_ADDED_NOTIFICATION="OAF_0042";
	public static String MANAGE_OUTSOURCING_AGENCY_PAYMENTREPORT =
		"ManageOutsourcingAgencyPaymentReportEJBJNDI";
	public static String MANAGE_PRINT_LEGAL_DOCUMENTS =
		"ManagePrintLegalDocumentsEJBJNDI";

	public static final int NO_OF_PRIZE_TYPE=5;
	public static final int PRIZE_TYPE_SPECIAL=1002;

	public static String CUSTOMER_PAYMENT_MODE_SERVICE = "CustomerPaymentModeRestrictionEJBJNDI";

	public static final int TO_DO_REFERENCE_ID_FOR_LOTTERY=1009;
	public static final String AUTHORIZE_PRICE_CHANGE="OAF_AUTHORIZE_PRICE_CHANGE";
	
	/*(96/03/12) Milla CR 240*/
	public static final String AUTHORIZE_VIEW_CC_NO="OAF_AUTHORIZE_VIEW_CC_NO";
	public static int CRM_AUTHORIZE_VIEW_CC_NO_FORM = 1;
	public static int OAF_AUTHORIZE_VIEW_CC_NO_FORM = 2;
	public static int CRM_AUTHORIZE_SAVE_CC_NO_FORM = 3;
	public static int OAF_AUTHORIZE_SAVE_CC_NO_FORM = 4;
	public static int BO_AUTHORIZE_SAVE_CC_NO_FORM = 5;
   

	//SCM Domain Data for ImageType
	public static final int SCM_PRODUCT_IMAGETYPE_NORMAL_VIEW=1001;
	public static final int SCM_PRODUCT_IMAGETYPE_FRONT_VIEW=1002;
	public static final int SCM_PRODUCT_IMAGETYPE_REAR_VIEW=1003;
	public static final int SCM_PRODUCT_IMAGETYPE_TOP_VIEW=1004;
	public static final int SCM_PRODUCT_IMAGETYPE_BACK_VIEW=1005;

	//Constants for source of color and style selection.
	public static final int COLOR_STYLE_FOR_PRODUCTENQUIRY=1001;
	public static final int COLOR_STYLE_FOR_PROGRAMENQUIRY=1002;
	public static final int COLOR_STYLE_FOR_CATALOGENQUIRY=1003;
	public static final int COLOR_STYLE_FOR_KITPRODUCTS=1004;
	public static final int COLOR_STYLE_FOR_CROSSSELLUPSELL_CUSTOMER=1005;
	public static final int COLOR_STYLE_FOR_CROSSSELLUPSELL_OCCASSION=1006;
	public static final int COLOR_STYLE_FOR_CROSSSELLUPSELL_PRODUCT=1007;
	public static final int COLOR_STYLE_FOR_CSRTODO_PRODUCTSEARCH=1008;
	public static final int COLOR_STYLE_FOR_COMPLAINT_RESOLUTION=1009;

	public static final String CHARGEBACK_EDI_RESPONSE_BATCH = "ehsn.et1.db.oaf.batch.dao.ChargeBackServiceDAO";

	//Added for Incorporating UBOT CR
	public static final short NCCCBATCHAUTHORIZATION_ACQUIRINBANK_PARAM_ID=1007;	

	//Product Tax Category
	public static final String PRODUCT_TAX_CATEGORY_INCLUSIVE="I";
	public static final String PRODUCT_TAX_CATEGORY_EXCLUSIVE="E";

	public static final String MEDIA_REPORT_OUTDOOR_INV_EXTRACT_BATCH_DAO =
			"ehsn.et1.db.oaf.batch.dao.MediaReportOutdoorExtractBatchDAO";
	public static final long COLLECTION_SMS_PROJ_CODE=3;

	//constants for Media report Batch
	int MEDIA_REPORT_PARAMID1=1001;
	int MEDIA_REPORT_PARAMID2=1002;
	int MEDIA_REPORT_PARAMID3=1003;
	int MEDIA_REPORT_PARAMID4=1004;
	int MEDIA_REPORT_PARAMID5=1005;
	int MEDIA_REPORT_PARAMID6=1006;
	int MEDIA_REPORT_EXCEL_ROWLIMIT=1000;
	String MEDIA_REPORT_FILENAME = "MediaReport";
	String MEDIA_REPORT_DAILY_SHEET_NAME = "Daily_Summary";
	String MEDIA_REPORT_MONTHLY_SHEET_NAME = "Monthly_Summary";
	String MEDIA_REPORT_GENERAL_SHEET_NAME = "General";
	String MEDIA_REPORT_MANUAL_SHEET_NAME = "Manual";
	String MEDIA_REPORT_OTHER_SHEET_NAME = "Other";
	String MEDIA_REPORT_COLHEADER_INVOICEDATE = "INVOICEDATE";
	String MEDIA_REPORT_COLHEADER_TXNCODE = "TRANSACTIONCODE";
	String MEDIA_REPORT_COLHEADER_INVOICETYPE = "COMPANYPERSONAL";
	String MEDIA_REPORT_COLHEADER_TAXTYPE = "TAXTYPE";
	String MEDIA_REPORT_COLHEADER_AMTWITHOUTTAX = "TOTALAMOUNTWITHOUTTAX";
	String MEDIA_REPORT_COLHEADER_TOTTAX = "TOTALTAX";
	String MEDIA_REPORT_COLHEADER_NOREC = "NOOFRECORDS";
	String MEDIA_REPORT_COLHEADER_YEARMONTH = "YEARMONTH";
	String MEDIA_REPORT_SUMMARY_REPORT_XL_BATCH="OAF_099";
	public static final String OAF_INVOICE_TAX_TYPE_DOMAIN_NAME="Tax Type-OAF";
	public static final String OAF_INVOICE_TYPE_DOMAIN_NAME="InvoiceType";

	public static final char MEDIA_REPORT_TRANSACTION_CODE_STARTING_DIGIT_2='2';
	public static final char MEDIA_REPORT_TRANSACTION_CODE_STARTING_DIGIT_3='3';
	public static final String MEDIA_REPORT_ADDITIONAL_FLAG="A";


//	constants for Search Travel Records Batch
	  int SEARCH_TRAVEL_RECORDS_PARAMID1=1001; // Company ID
	  int SEARCH_TRAVEL_RECORDS_PARAMID2=1002; // Year
	  int SEARCH_TRAVEL_RECORDS_PARAMID3=1003; // Month
	  int SEARCH_TRAVEL_RECORDS_PARAMID4=1004; // Include Previous
	  int SEARCH_TRAVEL_RECORDS_PARAMID5=1005; // Include History
	  int SEARCH_TRAVEL_RECORDS_PARAMID6=1006; // Locale
	  int SEARCH_TRAVEL_RECORDS_EXCEL_ROWLIMIT=50000;
	  String SEARCH_TRAVEL_RECORDS_FILENAME = "TravelRecords";
	  String SEARCH_TRAVEL_RECORDS_SHEET_NAME = "Travel Records List";
	  String SEARCH_TRAVEL_RECORDS_COLHEADER_ITEMNO = "ITEMNO";
		String SEARCH_TRAVEL_RECORDS_COLHEADER_RECEIPTNO= "RECEIPTNO";
		String SEARCH_TRAVEL_RECORDS_COLHEADER_SETTLEMENTAMOUNT = "ORDERAMOUNT";
		String SEARCH_TRAVEL_RECORDS_COLHEADER_SELLINGPRICE = "COSTFROMSCM";
               String SEARCH_TRAVEL_RECORDS_COLHEADER_SERVICECHARGE = "SERVICEFEEORDERAMOUNTCOST";
		String SEARCH_TRAVEL_RECORDS_COLHEADER_COSTVERIFICATIONDATE = "COSTVERIFICATIONDATE";
		String SEARCH_TRAVEL_RECORDS_COLHEADER_REMARKS = "REMARKS";
	String SEARCH_TRAVEL_RECORDS_COLHEADER_TRAVELRECEIPTNO = "TRAVELAGENCYCOLLECTRECEIPT";
			String SEARCH_TRAVEL_RECORDS_COLHEADER_TAXID = "TAXCODE";
	String SEARCH_TRAVEL_RECORDS_COLHEADER_REGISTRATIONNO = "COMPANYREGISTRATIONNUMBER";
			String SEARCH_TRAVEL_RECORDS_COLHEADER_COMPANYNAME = "COMPANYNAME";

	public static final String SEARCH_TRAVEL_RECORDS_BATCHID ="OAF_102";


	public static final String CCSETTLEMENTCONFIRMATION_REPORTID = "OAF_0004";
	public static final String CCSETTLEMENTCONFIRMATION_REPORTNAME ="CCSettlementConfirmationReport";

	public static final String CCSETTLEMENTCONFIRMATION_IMPORTSECTIONNAME = "Settlement Confirmation List";

	public static final String CCSETTLEMENTCONFIRMATION_QUERYSECTIONNAMES = "Query2,SettlementConfirmation,Query";

	public static final String CCSETTLEMENTCONFIRMATION_PARAMLIMITOPERATOR = "=";

	public static final String CCSETTLEMENTCONFIRMATION_PARAMGREATOPERATOR = ">=";

	public static final String CCSETTLEMENTCONFIRMATION_PARAMLESSOPERATOR = "<=";

	public static final String CCSETTLEMENTCONFIRMATION_PARAMBETWEENOPERATOR = "BETWEEN";

	public static final String CCSETTLEMENTCONFIRMATION_QUERYPARAM1 = "Status";
	public static final String CCSETTLEMENTCONFIRMATION_PARAM1SECTIONNAME = "SettlementConfirmation";

	public static final String CCSETTLEMENTCONFIRMATION_QUERYPARAM2 = "Acquiringbank";
	public static final String CCSETTLEMENTCONFIRMATION_PARAM2SECTIONNAME = "SettlementConfirmation";


	public static final String CCSETTLEMENTCONFIRMATION_QUERYPARAM3 = "Companyid_2";
	public static final String CCSETTLEMENTCONFIRMATION_PARAM3SECTIONNAME = "SettlementConfirmation";


	public static final String CCSETTLEMENTCONFIRMATION_QUERYPARAM4 = "Paymentmodeid";
	public static final String CCSETTLEMENTCONFIRMATION_PARAM4SECTIONNAME = "SettlementConfirmation";


	public static final String CCSETTLEMENTCONFIRMATION_QUERYPARAM5 = "Needauthorization";
	public static final String CCSETTLEMENTCONFIRMATION_PARAM5SECTIONNAME = "SettlementConfirmation";


	public static final String CCSETTLEMENTCONFIRMATION_QUERYPARAM6 = "Creditcardtype";
	public static final String CCSETTLEMENTCONFIRMATION_PARAM6SECTIONNAME = "SettlementConfirmation";


	public static final String CCSETTLEMENTCONFIRMATION_QUERYPARAM7 = "Noofinstallment";
	public static final String CCSETTLEMENTCONFIRMATION_PARAM7SECTIONNAME = "SettlementConfirmation";


	public static final String CCSETTLEMENTCONFIRMATION_QUERYPARAM8 = "Noofinstallment2";
	public static final String CCSETTLEMENTCONFIRMATION_PARAM8SECTIONNAME = "SettlementConfirmation";


	public static final String CCSETTLEMENTCONFIRMATION_QUERYPARAM9 = "Comp_sett_req_date";
	public static final String CCSETTLEMENTCONFIRMATION_PARAM9SECTIONNAME = "SettlementConfirmation";


	public static final String CCSETTLEMENTCONFIRMATION_QUERYPARAM10 = "Moneytransferdate";
	public static final String CCSETTLEMENTCONFIRMATION_PARAM10SECTIONNAME = "SettlementConfirmation";

	public static final String CCSETTLEMENTCONFIRMATION_QUERYPARAM11 = "Settdate";
	public static final String CCSETTLEMENTCONFIRMATION_PARAM11SECTIONNAME = "SettlementConfirmation";


	// add by Arnold for NcccAuthSettlement
	public final String NCCC_AUTH_SETTLEMENT="NcccAuthSettlementEJBJNDI";
	public static final String NCCC_BATCHAUTHSETTLEMENT_BATCH = "OAF_128";
	//add by Arnold for NcccSettleRefun
	public final String NCCC_SETTLE_REFUND="NcccSettleRefundEJBJNDI";
	public static final String NCCC_BATCHSETTLEREFUND_BATCH = "OAF_129";
	public static final String NCCC_BATCHCANCELAUTH_BATCH = "OAF_130";
	// add by Arnold for NcccAuthSettlementBatchController
	public static final String NCCCAUTHSETTLEMENT_BATCH_DAO =
		"ehsn.et1.db.oaf.batch.dao.NcccAuthSettlementBatchDAO";
	// add by Arnold for NcccAuthSettlementBatchController
	public static final String NCCCSETTEREFUND_BATCH_DAO =
		"ehsn.et1.db.oaf.batch.dao.NcccSettleRefundBatchDAO";
	// add by Arnold for Call Bank from Auth Settlement
	public static final int INVOKEDFROM_AUTH_SETTLEMENT=6;
	// constants for Search Travel Monthly Close Batch
       public static final String TRAVEL_MONTH_CLOSE_BATCH="OAF_103"; // Batch Id
	public static final int TRAVEL_MONTH_CLOSE_PARAMID1=1001; // Year
	public static final int TRAVEL_MONTH_CLOSE_PARAMID2=1002; // Month
	public static final int TRAVEL_MONTH_CLOSE_PARAMID3=1003; // Company ID
	public static final String CLOSE_TRAVEL_PRODUCT_BATCH = "ehsn.et1.db.oaf.batch.dao.CloseTravelProductBatchDAO";

	// constants for Invoice Donation: Added by Thomas
	public static final char INVOICE_DONATED = 'Y';
	public static final char INVOICE_NOT_DONATED = 'N';
	public static final char INVOICE_DONATABLE = 'Y';
	public static final char INVOICE_NOT_DONATABLE = 'N';

	// add by Ben for OutDoor invoice debitnote
	public final String OUTDOOR_INVOICE_DEBITNOTE="IssueOutDoorDebitNoteInvoiceEJBJNDI";
	//add by Ben for Partial Refund Processing verification ejb
	public final String PARTIAL_REFUND_PROCESSING_VERIFICATION="PartialRefundProcessingVerificationEJBJNDI";

	// constants for Print legal document: Added by Jessie
	public static final String PRINT_LOCATION_H03 = "H03";
	public static final String PRINT_LOCATION_H01 = "H01";

	//---- Arnold Funerary -------start
	public static final String IMPORT_FUNERARY_DATA_BATCH_ID = "OAF_401";
	public static final String FUNERARY_MATCH_BATCH_ID = "OAF_402";
	public static final String EXPORT_TO_MONTHGOODTURNOVER_BATCH_ID = "OAF_403";
	public static final String FUNERARY_IMPORT_FILE_NAME="Funerary";
	//for EJB
	public final String FUNERARY_EXPORT= "FuneraryExportEJBJNDI";
	public final String UPDATE_FUNERARY_ACCOUNT= "UPDATE_FUNERARY_ACCOUNT";
	// for batch
	public static final String IMPORT_FUNERARY_ACCOUNT_DATA =
		"ehsn.et1.db.oaf.batch.dao.FuneraryAccountDataImportBatchDAO";
	public static final String FUNERARY_ACCOUNT_MATCH =
		"ehsn.et1.db.oaf.batch.dao.FuneraryAccountMatchBatchDAO";
	public static final String FUNERARYACCOUNT_TABLE="TOAF_FUNERARYACCOUNT";
	public static final int FUNERARY_SUPPLIER_MATCH_FILENAME = 1001;
	//----Arnold Funerary---------end

	public final String SESSION_PARTIAL_REFUND= "ManagePartialRefundEJBJNDI";

	//--- Arnold  donative invoice for generate excel
	String DONATIVE_INVOICE_EXCELFILE = "DonativeInvoice";
	
	/* Refund Type 
	 * (95/6/21) Thomas: Added for CR 112 - Refund Details screen. */
	public static final int REFUND_TYPE_ORDER = 1;
	public static final int REFUND_TYPE_RETURN = 1002;
	public static final int REFUND_TYPE_CANCEL = 1003;
	public static final int REFUND_TYPE_GC = 1004;
	
	/* 2006/11/03 Modified by Meg: Config the counts of transaction for Virtual Payment Gateway*/
	public static final int COUNT_VPG_TRANSACTION = 10;
	
	/* (95/11/11)Milla add for CR #575 */
	public static final int SHIPPING_CHARGE_ID_1000 = 225485;
	public static final int SHIPPING_CHARGE_ID_500 = 225484;
	
	
	
	/* add for CR_FIN378 by steven 2006/12/18*/	
	public static final int POP_UP_FROM_BO_MANUAL_INVOICE_ADDNEW = 16;
	public static final int INVOICE_STATUS_RETURNED = 1006;
	
	/*(96/02/01) Milla Added for CR 1082*/
	public static final int MARKETING_PRODUCT = 1001;
	public static final int LOTTERY_STATUS = 1004;
	
	//RETRUN STATUS
	public static final int RETURN_ACCEPTED = 1001;
	public static final int RETURN_MODIFIED = 1002;
	public static final int RETURN_IN_PROGRESS = 1003;
	public static final int RETURN_IN_TRANSIT = 1004;
	public static final int RETURN_CONFIRMED = 1005;
	public static final int RETURN_ABORTED = 1006;
	public static final int RETURN_REJECTED = 1007;
	public static final int RETURN_CANCELLED = 1008;
	//RETRUN TYPE
	public static final int RETRUN_TYPE_RETURN = 1001;
	public static final int RETRUN_TYPE_EXCHANGE = 1002;
	//EXCHANGE STATUS
	public static final int EXCHANGE_ABORTED=1005;
	
	
	// add for auto 
	
	public static final int SYSTEM_AUTO_ADD_LOTTERY=1040;
	public static final int SYSTEM_AUTO_ADD_TYPE=1080;
	
	
	// ADD FOR CR1029 BY STEVEN 2007/03/14
	public static final String VERIFICATIONLOG_MOVE_BATCH_DAO =
		"ehsn.et1.db.oaf.batch.dao.VerificationLogMoveBatchDAO";
	
	/*CR 4171 */
	public static final char INV_IS_EINVOICE = 'Y';
	public static final char INV_IS_NOT_EINVOICE = 'N';
	
	/*(96/03/16)Milla CR 1476-1 Invoice donate type*/
	public static final long INV_ALWAYS_DONATE = 1001;
	public static final long INV_ALWAYS_NOT_DONATE = 1002;
	public static final long INV_ALWAYS_NOT_SETUP = 0;
	
 /*CR-3025 DONATED TARGET*/
	public static final int GENESIS_SOCIAL_WELFARE_FOUNDATION=1001;
	public static final int EASTERN_FOUNDATION=1002;
	
	// ADD FRO CR901 BY STEVEN 2007/04/09
	public static String MENU_TASK_FOR_OAF_ORDER_VERIFICATION = "OAF_ORDER_VERIFICATION";
	public static String MENU_TASK_FOR_OAF_ORDER_VERIFICATION_INQUIRY = "OAF_ORDER_VERIFICATION_INQUIRY";
	
	public static final String DonativeInvoiceWinningPrint_ReportId = "OAF_5064";
	public static final String EDonativeInvoiceWinningPrint_ReportId = "OAF_0081";
   public static final int MANIPULATIONCODE=12121241;
   
   //Transaction Mode
   public static final int NORMAL_AUTH= 0;   //一般
   public static final int INSTALLMENT_AUTH = 1; //分期
   public static final int BONUS_AUTH = 2; //紅利
   
   public static final int TRANSACTION_MODE_NORMAL = 0;
   public static final int TRANSACTION_MODE_INSTALLMENT = 1;
   public static final int TRANSACTION_MODE_BONUS = 2;
	
   //COD PAYMENT MODE
   public static final String CODPAYMENTMODE_CASH = "C";
   public static final String CODPAYMENTMODE_POS = "P";
   
   //Supplier Overhead Cost
   public static final String OVERHEADCOST_EXPORT_FILENAME = "SupplierOverheadCost_";
   public static final String SUPPLIER_OVERHEADCOST_STATUS_DOMAINNAME= "SupplierOverheadCostStatus";
   
   /*(96/10/02) Thomas: China CR 88, CMB Online CC Payment. */
   public static final int CHINA_CMB_BANKID = 72;

   //Get Account & Order for External
   public static final String EXTERNAL_GET_ACCOUNT_INFO = "getAccountInfo";
   public static final String EXTERNAL_GET_ACCOUNT_STATEMENT = "getCustAccountStatement";
   public static final String EXTERNAL_GET_PRODUCT_DETAIL = "getProductDetailByOrder";
   public static final String EXTERNAL_GET_DELIVERY_DETAIL = "getDeliveryDetailByOrder";
      
   //(96/12/14)michelle for CR4316 for EJB
   public final String SECURITY_CHECK = "Security_Check";
   

   /* CR4355 */
   public static String BO_MANUALFAX_ROLEID = "10820";

	/*CR 4446 */
	public static final char IS_ONEDAY_SHIPPROD = 'Y';
	public static final char IS_NOT_ONEDAY_SHIPPROD = 'N';

   
	/* CR1195 */
	public static final String MANAGE_COLLECTION_MEMO_EJB_JNDI = "ManageCollectionMemoEJBJNDI";
	public static final String SESSION_OAF_AGENTID = "OAF_AGENTID";
	public static final String SESSION_OAF_COLLECTIONMEMOVO = "OAF_CollectionMemoVO";
	public static final String SESSION_OAF_COLLECTIONMEMOSEARCHSO = "OAF_CollectionMemoSearchSO";
	
	/*CR1120*/
	public static final String EDI_REFUND_IMPORT_TRANSACTIONSETID = "OAF_0650";
	
	public static final int EDI_REFUND_DETAIL_STATUS_INIT = 1000;
	public static final int EDI_REFUND_DETAIL_STATUS_SUCESS = 1001;
	public static final int EDI_REFUND_DETAIL_STATUS_FAILURE = 1002;
	
	public static final int REFUND_MODE_CREDIT_CARD = 1002;
	public static final int REFUND_MODE_CHEQUE = 1003;
	public static final int REFUND_MODE_BANK = 1004;
	public static final int REFUND_MODE_CASHACCOUNT = 1005;
	public static final int REFUND_MODE_MANUAL = 1006;
	
	public static final int CHEQUE_REFUND_STATUS_PENDING = 1002;
	public static final int CHEQUE_REFUND_STATUS_INIT = 1003;
	
	public static final int PRODUCT_RETURN_STATUS_RETURN_CONFIRMED = 1005;
	public static final int PRODUCT_RETURN_STATUS_RETURN_ABORTED = 1006;
	
	public static final int BANK_REFUND_STATUS_BAND_TRANSFER_PENDING = 1001; 
	
	public static final String S_USELOTTERYBONUS_DETAIL ="UseLotteryBonus_Detail";
	
	public static final int IMPORT_EXCEL_ROW_LIMIT = 65535;
	
	/** The Constant DISCOUNT_COUPON_FILE_UPLOAD. */
	public static final String BONUSPOINTS_BATCH_FILE_UPLOAD = "IMPORTBONUSPOINTS_FILE_";
	public static final String BONUSPOINTS_BATCH_ID = "OAF_802";
	public static final String BONUSPOINTS_AUTOBATCH_ID = "OAF_822";
	public static final long BONUSPOINTS_BATCH_PARAM_RUNBATCHID_ID = 1002;
	public static final long BONUSPOINTS_BATCH_PARAM_INFILENAME_ID = 1001;
	
	public static final String BONUSPOINTSBATCHEJBJNDI = "BonusPointsBatchEJBJNDI";	
	
	public static final int LOTTERY_BONUS_PROD_MIN_PRICE_LIMIT = 1000;
	
	public static final int LOTTERY_BONUS_TRANS = 4;
	
	public static final int LOTTERY_BONUS_TRANS_TRANSACTIONSEARCH = 5;
	public static final int LOTTERY_BONUS_TRANS_DETAILS = 6;
	public static final String S_CUSTACCDETSRCHSO = "CUSTACCDETSRCHSO";
	public static final String UPLOADDIR="C:/";//add by wujing 文件绝对路径
	
	
	//add by liuyin 2013年4月11日14:32:10
	public static final int PAYMENT_MODE_COD=4;
	
	public static final int LOTTERY_TRANSACTIONTYPE=1003;
	
	public static final int LOTTERY_BONUS_AUTO_IMPORT=1007;
	
	public static final int LOTTERY_BONUS_SPECIALADD=1060;
	
	public static final int EXCHANGE_PRODUCT_RETURNQTY_DEFAULT = 1;
	public static final int RETURN_PRODUCT_RETURNQTY_DEFAULT = 1;
	public static final String RETURN_PRODUCT_BEANNAME = "CustomerOrderInfo";
	public static final String RETURN_PRODUCT_APITYPE = "returnProductAPI";
	public static final String EXCHANGE_PRODUCT_BEANNAME = "CustomerOrderInfo";
	public static final String EXCHANGE_PRODUCT_APITYPE = "exchangeProductAPI";
	public static final String SHIP_CONFIRM_BEANNAME = "CustomerOrderInfo";
	public static final String SHIP_CONFIRM_APITYPE = "shippingConfirmedAPI";
	
	
	public static final int ACCOUNTSTATE_VALID = 1000;
	public static final int ACCOUNTSTATE_INVALID= 1001;
	
	public static final int rtncode=9999;//已存在
}
