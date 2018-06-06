package com.best1.api.utils;

public interface CRMConstants {

	String RESULT_INTRODUCERLIST = "INTRODUCERLIST";
	String RESULT_INTRODUCERSEARCHSO = "INTRODUCERSEARCHSO";
	String RESULT_SELECTINTRODUCERFLAG = "SELECTINTRODUCERFLAG";
	String SELECT_RESOLUTION_DESCRIPTION = "SELECT_RESOLUTION_DESCRIPTION";
	String UPDATE_COMPLAINT_STATUS = "UPDATE_COMPLAINT_STATUS";
	String EHSN_DATA_SOURCE = "EHSNDS";
	String COMPLAINT_SEARCH = "ComplaintSearchSessionEJBJndi";

	String TCRM_CALLWORKCODE = "TCRM_CALLWORKCODE";
	//LIST OF JNDI NAMES
	String RESOLUTIONJNDI = "ComplaintEJB";
	String COMPLAINTDETAILSJNDI = "ComplaintDetailsEJB";

	//LIST OF OPTIONIDS
	String RESOLUTION = "/Resolution";
	String SAVERESOLUTION = "/saveResolution";
	String MORECOMPLAINTDETAILS = "/GetMoreComplaintDetails";
	String TODOCOMPLAINTDETAILS = "/ToDoComplaintDetails";
	String VIEWCOMPLAINTDETAILS = "/ViewComplaintDetails";
	String CHANGEHISTORY = "/GetComplaintDetails";
	String FINDUSER = "/FindUser";
	String FINDAPPROVER = "/FindApprover";
	String SEARCHUSER = "/SearchUser";
	String SAVEREGCOMPRESOLUTION = "/SaveRegComplaintResolution";
	String RESOLVEREGCOMPLAINT = "/ResolveRegComplaint";
	String WORKINPROGRESS = "/WorkInProgress";

	String TCRM_MAILDISPATCH = "TCRM_MAILDISPATCH";

	//LIST OF QUERY POOL IDS FOR MEMBERSHIP BENEFITS
	String GETMEMBERSHIPID = "MEMBERSHIP_ID";
	String GETMEMBERBENEFITS = "MEMBERSHIP_BENEFITS";

	//BENEFIT IDS FOR THE RESOLUTION
	int BONUSPOINTSID = 4311;
	int DISCOUNTCOUPONID = 4312;
	int GIFTVALUEID = 4313;

	long DEFAULT_COMPANYID=1;
	//	LIST OF QUERY POOL IDS FOR COMPLAINT BENEFITS
	String GETCATEGORYID = "CATEGORYID";
	String GETCOMPLAINTBENEFITS = "COMPLAINT_BENEFITS";

	//LIST OF QUERY POOL IDS FOR SEARCH USER
	String GET_USERNAME_AND_ID_NEXT = "GET_USERNAME_AND_ID_NEXT";
	String GET_USERNAME_AND_ID_PREVIOUS = "GET_USERNAME_AND_ID_PREVIOUS";
	String GET_APPROVERNAME_AND_ID_PREVIOUS =
		"GET_APPROVERNAME_AND_ID_PREVIOUS";
	String GET_APPROVERNAME_AND_ID_NEXT = "GET_APPROVERNAME_AND_ID_NEXT";

	String SUPERVISOR_TASK_BENIFIT="CRM_SUP_BENIFIT_APPROVAL_TASK";

	//LIST OF QUERY POOL IDS FOR CATEGORYTREE
	String GET_CATEGORYINFO = "GET_CATEGORYINFO";
	String GET_HEADING_LEVELID_NOTZERO = "GET_HEADING_LEVELID_NOTZERO";
	String GET_HEADING_LEVELID_ZERO = "GET_HEADING_LEVELID_ZERO";
	String GET_HEADINGNAME_FORID = "GET_HEADINGNAME_FORID";

	//LIST OF COLUMN NAMES FOR RETREIVING COMPLAINT DETAILS
	String CATEGORYID = "COMPLAINTCATEGORYID";
	String ORDERSPLITITEMID = "ORDERSPLITITEMID";
	String ORDERSPLITID = "ORDERSPLITID";
	String MASTERORDERID = "MASTERORDERID";
	String DESCRIPTION = "DESCRIPTION";
	String STATUS = "STATUS";
	String RESOLUTIONCOMMENT = "RESOLUTIONCOMMENT";
	String RESOLUTIONMODE = "RESOLUTIONMODE";
	String COMPLAINTOWNER = "COMPLAINTOWNER";
	String CUSTOMERID = "CUSTOMERID";
	String CUSTOMERNAME = "CUSTOMERNAME";
	String DELIVERYDATE = "DELIVERYDATE";
	String PAYMENTMODE = "PAYMENTMODE";
	String MULTICODEID = "MULTICODEID";
	String CREATEDDATE = "CREATEDDATE";
	String STARTTIME = "STARTTIME";
	String DURATION = "DURATION";
	String ATTENDEDBY = "ATTENDEDBY";
	String ACTIONPENDING = "ACTIONPENDING";
	String CATEGORYMAPID = "CATEGORYMAPID";
	String HEADINGNAME = "HEADINGNAME";
	String ASSIGNDATE = "ASSIGNDATE";
	String ASSIGNTO = "AssignTo";
	String ASSIGNMENTID = "ASSIGNMENTID";
	String TEAMID = "TEAMID";
	String DEPARTMENTNAME = "departmentName";
	String DIVISIONNAME = "divisionName";
	String UNITNAME = "unitName";
	String TEAMNAME = "teamName";
	String RESOLVED = "Resolved";
	String COMMENTS = "comments";
	String SLAACTIVITYNAME = "SLAACTIVITYNAME";
	String SLAACTIVITYDESCRIPTION = "SLAACTIVITYDESCRIPTION";
	String RESOLUTIONTYPE = "RESOLUTIONTYPE";
	String VALUE = "VALUE";
	String CREATEDTIMESTAMP = "CREATEDTIMESTAMP";

	//LIST OF COLUMN NAMES FOR RETRIEVING MEMBERBENEFITS
	String MEMBERSHIPID = "MEMBERSHIPID";
	String BONUSPOINTSRATIO = "BONUSPOINTSRATIO";
	String GIFTPERCENTAGEVALUE = "GIFTPERCENTAGEVALUE";
	String DISCOUNTPERCENTAGEVALUE = "DISCOUNTPERCENTAGEVALUE";

	//LIST OF COLUMN NAMES FOR RETRIEVING COMPLAINT BENEFITS
	String BONUSPOINT = "BONUSPOINT";
	String GIFTVALUE = "GIFTVALUE";
	String DISCOUNTCOUPON = "DISCOUNTCOUPON";

	//LIST OF COLUMN NAME FOR RETRIEVING USER LIST
	String USERNAME = "userName";
	String USERID = "UserId";

	//LIST OF HASHMAP KEYS USED TO POPULATE VO'S
	String COMPLAINTVO = "ComplaintVO";
	String PRODUCTDETAILSVO = "ProductDetailsVO";
	String ORDERVO = "OrderVO";
	String CALLHISTORYARRAY = "CallHistoryArray";
	String HEADINGLISTNAME = "HeadingListName";
	String CUSTOMERDETAILS = "CustomerDetails";
	String CUSTOMERCONTACTINFO = "CustomerContactInfo";
	String ASSIGNMENTARRAY = "AssignmentArray";
	String SLAACTIVITYARRAY = "SLAActivityArray";
	String CUSTOMERADDRESS="CUSTOMERADDRESS";
	String AVAILEDBENEFITS = "AvailedBenefits";

	//LIST OF KEYS USED TO ADD VALUES AS REQUEST ATTRIBUTE
	String COMPLAINTDETAILS = "ComplaintDetails";
	String COMPLAINTNO = "ComplaintNo";
	String VALIDSTATUS = "VALID";
	String COMPLAINTASSIGNMENTARRAY = "ComplaintAssignmentArray";

	String FIND_ALLASSIGNMENTID = "FIND_ALLASSIGNMENTID";
	String TCRM_CONTACTHISTORY = "TCRM_CONTACTHISTORY";
	String TCRM_CONTACTCWCCOMMENTS = "TCRM_CONTACTCWCCOMMENTS";

	String TCRM_CONTACTREFERENCEDETAILS = "TCRM_CONTACTREFERENCEDETAILS";
	String SELECT_ASSIGNEDTO = "SELECT_ASSIGNEDTO";
	String ASSIGNEDTO = "ASSIGNEDTO";
	String ASSIGNEDTOIFREDIRECT = "ASSIGNEDTO_IFREDIRECT";

	String TXTUSERID = "txtUserId";
	String TCRM_USER_USERNAME = "USERNAME";
	String HEADINGID = "HEADINGID";
	String SELECT_ASSIGNMENTINFO = "SELECT_ASSIGNMENTINFO";
	String TXTUSERNAME = "txtUserName";
	public static final char ASSIGNED = 'A';
	String CHK_REDIRECT_TO_CSR = "chkRedirectToCSR";
	String TCRM_COMPLAINTASSIGN = "TCRM_COMPLAINTASSIGN";
	String ResolutionJNDI = "ResolutionSessionEJB";
	String SearchUserJNDI = "SearchUserEJB";
	String AssignComplaintToTeamMemberJNDI = "AssignComplaintToTeamMemberEJB";
	String ComplaintDetailsJNDI = "ComplaintDetailsEJB";
	String CommentsAdderJNDI = "CommentsAdderEJB";
	String UpdateCallHistoryJNDI = "UpdateCallHistoryEJB";

	String OPTIONID = "OPTIONID";
	String SAVE_UPDATE_CALLHISTORY = "/SaveUpdateCallHistory";
	//String VALID = "VALID";
	String CANCEL_UPDATE_CALLHISTORY = "/CancelUpdateCallHistory";
	String USERPROFILE = "USERPROFILE";
	String TCRM_CALLHISTORY = "TCRM_CALLHISTORY";
	String TXACOMMENTS = "txaComments";

	//String COMMENTS = "/Comments";
	String COMMENTSCOLLECTION = "commentsCollection";
	String UPDATECALLHISTORY = "/UpdateCallHistory";
	String ADDCOMMENT = "/AddComment";
	String SAVE_ADDCOMMENT = "/SaveAddComment";
	String CANCEL_ADDCOMMENT = "/CancelAddComment";
	String TCRM_COMPLAINTCOMMENTS = "TCRM_COMPLAINTCOMMENTS";
	String EHSNCONTROLVO = "EHSNCONTROLVO";

	String SELECT_COMMENTS = "SELECT_COMMENTS";
	String SELECT_USERINFO = "SELECT_USERINFO";
	String SELECT_ASSIGNMENTID = "SELECT_ASSIGNMENTID";
	String UNITID = "UNITID";
	String DIVISIONID = "DIVISIONID";
	String DEPARTMENTID = "DEPARTMENTID";

	String TCRM_COMPLAINTCOMMENTS_COMMENTID = "COMMENTID";
	String TCRM_COMPLAINTCOMMENTS_COMMENTS = "COMMENTS";
	String TCRM_COMPLAINTCOMMENTS_ASSIGNMENTID = "ASSIGNMENTID";
	String TCRM_COMPLAINTCOMMENTS_COMPLAINTID = "COMPLAINTID";
	String TCRM_COMPLAINTCOMMENTS_COMMENTTYPE = "COMMENTTYPE";
	String TCRM_COMPLAINTCOMMENTS_CREATEDTIMESTAMP = "CREATEDTIMESTAMP";

	String ASSIGNCOMPLAINT = "/AssignComplaint";
	String SAVE_ASSIGNCOMPLAINT = "/SaveAssignComplaint";
	String CANCEL_ASSIGNCOMPLAINT = "/CancelAssignComplaint";

	//	LIST OF OPTION ID'S.
	String OID_REGISTER_COMPLAINT = "/RegisterComplaint";
	String OID_CUSTOMER_SERVICE = "/CustomerService";
	String OID_PRODUCT_DETAILS = "/ProductDetails";
	String OID_COMPLAINT_LIST_MENU = "/ComplaintListMenu";
	String OID_SUBMIT_COMPLAINT = "/SubmitComplaint";

	String TID_VALID = "Valid";

	// LIST OF JNDI NAMES.
	String JNDI_COMPLAINT_EJB = "ComplaintEJB";

	// LIST OF QUERY POOL CONSTANTS.
	String SELECT_CUSTOMER_NAME = "SELECT_CUSTOMER_NAME";
	String SELECT_ORDER_DETAILS = "SELECT_ORDER_DETAILS";
	String SELECT_ORDER_DETAILS_PK = "SELECT_ORDER_DETAILS_PK";
	String SELECT_PRODUCT_DETAILS = "SELECT_PRODUCT_DETAILS";
	String COMPLAINT_INSERT = "COMPLAINT_INSERT";
	String SAVE_COMPLAINT_DETAILS = "SAVE_COMPLAINT_DETAILS";
	String UPDATE_COMPLAINT_DETAILS = "UPDATE_COMPLAINT_DETAILS";
	String UPDATE_DESCRIPTION_AND_CATEGORY = "UPDATE_DESCRIPTION_AND_CATEGORY";
	String SELECT_COMPLAINT_DETAILS = "SELECT_COMPLAINT_DETAILS";
	String GET_TL = "GET_TL";
	String GET_COMPLAINT_OWNER_TL = "GET_COMPLAINT_OWNER_TL";
	String GET_NODEID_CATEGORYID = "GET_NODEID_CATEGORYID";

	// LIST OF DB COLUMN NAME CONSTANTS
	String COL_CUSTOMERNAME = "customername";
	String COL_ORDERNUMBER = "orderid";
	String COL_ORDERDATE = "orderdate";
	String COL_ORDERAMOUNT = "totalorderamount";
	String COL_ORDERSTATUS = "deliverystatus";

	String COL_PRODUCTID = "PRODUCTID";
	String COL_PRODUCTNAME = "PRODUCTNAME";
	String COL_QUANTITY = "QUANTITY";
	String COL_MODEOFPAYMENT = "PAYMENTMODESHORTNAME";
	String COL_PREFERREDDELIVERYDATE = "PREFERREDDELIVERYDATE";
	String COL_EXPECTEDDELIVERYDATE = "EXPECTEDDELIVERYDATE";
	String COL_DELIVERYDATE = "ACTUALDELIVERYDATE";
	String COL_INVOICENUMBER = "INVOICENO";

	// LIST OF SESSION KEY CONSTANTS
	String KEY_CUST_BASIC_INFO = "customerBasicInfoVO";
	String KEY_ORDER_LIST = "orderList";
	String KEY_PRODUCT_LIST = "prodList";
	String KEY_PRODUCT_FLAG = "productFlag";
	String KEY_PRODUCT_DETAILSVO = "productDetailsVO";

	// LIST OF REQUEST KEY CONSTANTS
	String REQ_KEY_ORDER_INDEX = "orderIndex";

	//CUSTOMERCONSTANTS
	String INVALID = "N";
	String VALID = "Y";
	String MANAGE_CUSTOMER = "ManageCustomerEJBJndi";
	String MESSAGE = "The information has been saved";
	int SINGLE = 4204;
	int VERYHAPPY = 4901;
	int SMILE = 4902;
	int NORMAL = 4903;
	int SAD = 4904;
	int VERYSAD = 4905;
	int SELECT_LESSTHAN = 4101;
	int SELECT_LESSTHANEQUAL = 4102;
	int SELECT_GREATER = 4103;
	int SELECT_GREATERTHANEQUAL = 4104;
	int SELECT_BETWEEN = 4105;
	int LASTUPDATION_LESSTHAN = 4200;
	int LASTUPDATION_LESSTHANEQUAL = 4201;
	int LASTUPDATION_GREATERTHAN = 4202;
	int LASTUPDATION_GREATERTHANEQUAL = 4203;
	String DISTRICT = "DISTRICT";
	String CITY = "CITY";
	String ZIP = "ZIP";
	//SCRIPTS CONSTANTS
	String SCRIPTSJNDINAME = "ScriptsEJBJndi";
	int RETURNGOODSLEVELNORMAL=100;

	//	IMPORT FILE CONSTANTS
	String EXTENTION_CSV = ".csv";
	String EXTENTION_XLS = ".xls";
	String EXTENTION_TXT = ".txt";
	String FILE_UPLOAD_LOCATION = "./IMPORTCUSTOMER_FILE_";
	String ERROR_FILE_LOCATION = "./IMPORTCUSTOMER_ERRORFILE_";
	String IMPORT_DELIMITTER = ",";
	String ERROR_DELIMITTER = "|";
	String IMPORT_BATCH_ID = "CRM_001";
	String IMPORT_BATCH_DAO =
		"ehsn.et1.db.crm.batch.dao.ImportCustomerBatchDAO";
	String IMPORT_SMS_DAO="ehsn.et1.db.crm.batch.dao.ImportSMSBatchDAO";
	String DOMAINNAME_COUNTRY = "COUNTRY";
	String DOMAINNAME_DISTRICT = "DISTRICT";
	String DOMAINNAME_CITY = "CITY";
	String DOMAINNAME_BLOODGROUP = "BLOOD_GROUP";
	String DOMAINNAME_RELIGION = "RELIGION";
	String DOMAINNAME_CUSTOMERTYPE = "CUSTOMER_TYPE";
	String DOMAINNAME_SOURCEINFORMATION = "SOURCEINFORMATION";
	int IMPORT_PARAMID = 1001;
	String INSUFFICIENTDATA = "Insufficient Data";

	String FIND_ALLASSIGNMENTID_FOR_A_COMPLAINT =
		"FIND_ALLASSIGNMENTID_FOR_A_COMPLAINT";

	//SLA BATCH CONSTANTS
	String TCRM_TODODEFINITION = "TCRM_TODODEFINITION";
	String SLABatchDAO = "ehsn.et1.db.crm.batch.dao.SLABatchDAO";
	int TODOTYPE_REMINDER = 1002;
	int REFERENCETYPE_COMPLAINT = 1001;
	int TODOSTATUS_PENDING = 4506;
	int ASSIGNMENTSTATUS = 4500;

	//ACCOUNT TRANSACTION CONSTANTS
	int TRANSACTION_REFERENCETYPE = 4188;

	//Export File Constants
	String EXPORT_FILENAME = "EHSNCustomerInfo_";
	String EXPORT_SHEETNAME = "EHSNCustomerInfo";
	int EXPORT_MAXROWS = 100;
	String SEARCHMODE = "Search";
	String EXPORTMODE = "Export";

	/******************************************************************************
	 * CRM ITERATION I CONSTANTS DEFINITION BLOCK ENDS
	 ******************************************************************************/

	/******************************************************************************
	 * CRM ITERATION II CONSTANTS DEFINITION BLOCK BEGINS
	 ******************************************************************************/

	/******************************
	 * COMMON CONSTANTS
	 ******************************/

	/**
	 * PREVIOUS
	 */
	public static String PREVIOUS = "PREVIOUS";

	/**
	 * NEXT
	 */
	public static String NEXT = "NEXT";

	/**
	 * MODIFY
	 */
	public static String MODIFY = "MODIFY";

	/**
	 * SEARCH
	 */
	public static String SEARCH = "SEARCH";

	/**
	 * EMPTY_STRING
	 */
	public static String EMPTY_STRING = "";

	/**
	 * START
	 */
	public static String START = "START";

	/**
	 * Constants for All
	 */
	public static String ALL = "ALL";

	/**
	 * ADD_MODE
	 */
	public static String ADD_MODE = "ADD";

	/**
	 * ZERO VALUE
	 */
	public static long ZERO_VALUE = 0;

	/**
	 * LIKE SEARCH
	 */
	public static String LIKE_SEARCH = "%";

	/**
	 * COMMA
	 */
	public static String COMMA = ",";

	/**
	 * QUESTION_MARK
	 */
	public static String QUESTION_MARK = "?";

	/**
	 * CLOSING_BRACE
	 */
	public static String CLOSING_BRACE = ")";

	/**
	 * Logger Constants
	 */
	// METHOD_BEGINS
	public static String METHOD_BEGINS = "Method Begins :";

	// METHOD_ENDS
	public static String METHOD_ENDS = "Method Ends :";

	// SESSION_VALUE
	public static String SESSION_VALUE = "Value in Session :";

	/**
	 * TODO DESCRIPTION DOMAIN CONSTANTS
	 */

	//	BUDGETRESOURCEMANAGER
	public static int TODODESCRIPTION_BUDGETRESOURCEMANAGER = 4401;

	//	BUDGETRESOURCEMANAGERDELETE
	public static int TODODESCRIPTION_BUDGETRESOURCEMANAGERDELETE = 4402;

	//  TEAMLEAD
	public static int TODODESCRIPTION_TEAMLEAD = 4403;

	//	TEAMLEADDELETE
	public static int TODODESCRIPTION_TEAMLEADDELETE = 4404;

	// TODODESCRIPTION DOMAIN NAME
	public static String TODODESCRIPTIONDOMAIN = "TODODESCRIPTION";

	/**
	 * Constants for DOCUMENT_LOCATION
	 */
	//DOCUMENT_LOCATION
	 public static String DOCUMENT_LOCATION = "c:/\\";

	/**
	 * Common constants defined for Lottery
	 */

	public static String DOCUMENTS_FILENAME="Document_";

	//UPDATE_MODE
	public static char UPDATE_MODE = 'U';

	//CRITERIA_RULE_NAME
	public static String CRITERIA_RULE_NAME_SINGLE_ORDER =
		"CampnCritRSetEvaluate3";

	//	CRITERIA_RULE_NAME_CROSS_ORDER
	public static String CRITERIA_RULE_NAME_CROSS_ORDER =
		"CampnCritCrossOrderRSet";

	//	CRITERIA_RULE_NAME_GROUPPURCHASE
	public static String CRITERIA_RULE_NAME_GROUPPURCHASE =
		"CampnCritGroupPurchaseRSet";

	//CRITERIA_VALID_FLAG
	public static String CRITERIA_VALID_FLAG = "Y";

	/**
	 * MALE_GENDER
	 */
	//MALE_GENDER
	public static String MALE_GENDER = "M";

	/**
	 * FEMALE_GENDER
	 */
	//FEMALE_GENDER
	public static String FEMALE_GENDER = "F";

	/**
	 * GENDER_MR
	 */
	// GENDER_MR
	public static String GENDER_MR = "Mr.";

	/**
	 * GENDER_MISS
	 */
	//GENDER_MISS
	public static String GENDER_MISS = "Miss.";

	/******************************
	 * ACCOUNT INFO CONSTANTS
	 ******************************/

	/**
	 * Constants for Option : CRMAGCOnload
	 */
	// ACTION_CRMAGCONLOAD
	public static String ACTION_CRMAGCONLOAD = "/CRMAGCOnload";

	// RESULT_ACCOUNTGROUPSO
	public static String RESULT_ACCOUNTGROUPSO = "RESULT_AccountGroupSO";

	/**
	 * Constants for Option : CRMAGCAddAccountGroup
	 */
	// ACTION_CRMAGCADDACCOUNTGROUP
	public static String ACTION_CRMAGCADDACCOUNTGROUP =
		"/CRMAGCAddAccountGroup";

	/**
	 * Constants for Option : CRMAGCSaveAccountGroup
	 */
	// ACTION_CRMAGCSAVEACCOUNTGROUP
	public static String ACTION_CRMAGCSAVEACCOUNTGROUP =
		"/CRMAGCSaveAccountGroup";

	/**
	 * Constants for Option : CRMAGCEditAccountGroup
	 */
	// ACTION_CRMAGCEDITACCOUNTGROUP
	public static String ACTION_CRMAGCEDITACCOUNTGROUP =
		"/CRMAGCEditAccountGroup";

	// INPUT_ACCOUNTGROUPVO
	public static String INPUT_ACCOUNTGROUPVO = "INPUT_AccountGroupVO";

	/**
	 * Constants for Option : CRMAGCUpdateAccountGroup
	 */
	// ACTION_CRMAGCUPDATEACCOUNTGROUP
	public static String ACTION_CRMAGCUPDATEACCOUNTGROUP =
		"/CRMAGCUpdateAccountGroup";
	/**
	 * Constants for Option : CRMAGCCancelAccGrpCreation
	 */
	// ACTION_CRMAGCCANCELACCGRPCREATION
	public static String ACTION_CRMAGCCANCELACCSAVE = "/CRMAGCCancelAccGrpSave";

	/**
	 * Constants for Option : CRMAGCCancelAccGrpCreation
	 */
	// ACTION_CRMAGCCANCELACCGRPCREATION
	public static String ACTION_CRMATCCANCELACCSAVE =
		"/CRMAGCCancelAccTypeSave";
	/**
	 * Constants for Option : CRMAGCCancelAccGrpCreation
	 */
	// ACTION_CRMAGCCANCELACCGRPCREATION
	public static String ACTION_CRMAGCCANCELACCGRPCREATION =
		"/CRMAGCCancelAccGrpCreation";

	/**
	 * Constants for Option : CRMAGCCancelAccGrpCreation
	 */
	// CRMAGCCancelAccGrpCreationSection
	public static String ACTION_CRMATCCANCELACCTYPECREATIONSECTION =
		"/CRMAGCCancelAccGTypeCreationSection";

	/**
	 * Constants for Option : CRMAGCCancelAccGrpCreation
	 */
	// CRMAGCCancelAccGrpCreationSection
	public static String ACTION_CRMAGCCANCELACCGRPCREATIONSECTION =
		"/CRMAGCCancelAccGrpCreationSection";
	/**
	 * Constants for Option : CRMATCOnload
	 */
	// ACTION_CRMATCONLOAD
	public static String ACTION_CRMATCONLOAD = "/CRMATCOnload";

	// RESULT_ACCOUNTTYPESO
	public static String RESULT_ACCOUNTTYPESO = "RESULT_AccountTypeSO";

	/**
	 * Constants for Option : CRMATCAddAccountType
	 */
	// ACTION_CRMATCADDACCOUNTTYPE
	public static String ACTION_CRMATCADDACCOUNTTYPE = "/CRMATCAddAccountType";

	/**
	 * Constants for Option : CRMATCSaveAccountType
	 */
	// ACTION_CRMATCSAVEACCOUNTTYPE
	public static String ACTION_CRMATCSAVEACCOUNTTYPE =
		"/CRMATCSaveAccountType";

	/**
	 * Constants for Option : CRMATCEditAccountType
	 */
	// ACTION_CRMATCEDITACCOUNTTYPE
	public static String ACTION_CRMATCEDITACCOUNTTYPE =
		"/CRMATCEditAccountType";

	/**
	 * Constants for Option : CRMATCUpdateAccountType
	 */
	// ACTION_CRMATCUPDATEACCOUNTTYPE
	public static String ACTION_CRMATCUPDATEACCOUNTTYPE =
		"/CRMATCUpdateAccountType";

	/**
	 * Constants for Option : CRMATCCancelAccTypeCreation
	 */
	// ACTION_CRMATCCANCELACCTYPECREATION
	public static String ACTION_CRMATCCANCELACCTYPECREATION =
		"/CRMATCCancelAccTypeCreation";

	/**
	 * Constants for Option : CRMDCFOnload
	 */
	// ACTION_CRMDCFONLOAD
	public static String ACTION_CRMDCFONLOAD = "/CRMDCFOnload";

	// RESULT_ACCOUNTCONVERSIONFACTORSO
	public static String RESULT_ACCOUNTCONVERSIONFACTORSO =
		"RESULT_AccountConversionFactorSO";

	/**
	 * Constants for Option : CRMDCFAddConversionFactor
	 */
	// ACTION_CRMDCFADDCONVERSIONFACTOR
	public static String ACTION_CRMDCFADDCONVERSIONFACTOR =
		"/CRMDCFAddConversionFactor";

	/**
	 * Constants for Option : CRMDCFSaveConversionFactor
	 */
	// ACTION_CRMDCFSAVECONVERSIONFACTOR
	public static String ACTION_CRMDCFSAVECONVERSIONFACTOR =
		"/CRMDCFSaveConversionFactor";

	/**
	 * Constants for Option : CRMDCFEditConversionFactor
	 */
	// ACTION_CRMDCFEDITCONVERSIONFACTOR
	public static String ACTION_CRMDCFEDITCONVERSIONFACTOR =
		"/CRMDCFEditConversionFactor";

	/**
	 * Constants for Option : CRMDCFUpdateConversionFactor
	 */
	// ACTION_CRMDCFUPDATECONVERSIONFACTOR
	public static String ACTION_CRMDCFUPDATECONVERSIONFACTOR =
		"/CRMDCFUpdateConversionFactor";

	/**
	 * Constants for Option : CRMDCFDeleteConversionFactor
	 */
	// ACTION_CRMDCFDELETECONVERSIONFACTOR
	public static String ACTION_CRMDCFDELETECONVERSIONFACTOR =
		"/CRMDCFDeleteConversionFactor";

	/**
	 * Constants for Option : CRMDCFCancelConvFactorDefinition
	 */
	// ACTION_CRMDCFCANCELCONVFACTORDEFINITION
	public static String ACTION_CRMDCFCANCELCONVFACTORDEFINITION =
		"/CRMDCFCancelConvFactorDefinition";

	/**
	 * Constants for Option : CRMDCFCancelConvFactorDefinition
	 */
	//SESSION VARIABLE NAME FOR ACCOUNTTYPESEARCHSO
	public static String SEARCH_ACCOUNTTYPESO = "ACCOUNTTYPESEARCHSO";

	/**
	 * Constants for Option : CRMDCFCancelConvFactorDefinition
	 */
	//SESSION VARIABLE NAME FOR ACCOUNTGROUPSEARCHSO
	public static String SEARCH_ACCOUNTGROUPSO = "ACCOUNTGROUPSEARCHSO";

	/**
	 * Constants for displaying the add group section
	 */
	//SESSION VARIABLE NAME FOR ADDGROUP_SECTION_DISPLAY
	public static String INPUT_ADDGROUPSECTIONDISPLAY = "DISPLAYSECTION";
	/**
	 * Constants for displaying the add group section
	 */
	//SESSION VARIABLE NAME FOR ADDGROUP_SECTION_DISPLAY
	public static String INPUT_ADDTYPESECTIONDISPLAY = "DISPLAYSECTIONTYPE";

	/**
	 * Constants for dispaly value
	 */
	//SESSION VARIABLE NAME FOR DISPLAY_VALUE
	public static String INPUT_DISPLAYVALUE = "DISPLAY";
	/**
	 * Constants for dispaly value
	 */
	//SESSION VARIABLE NAME FOR DISPLAY_VALUE
	public static String INPUT_ACCOUNTTYPEDISPLAYVALUE = "DISPLAYTYPE";

	/**
	 * Constants for ACCOUNTGROUP_ID
	 */
	//REQUEST VARIABLE NAME FOR ACCOUNTGROUP_ID
	public static String INPUT_ACCOUNTGROUPID = "EDITVALUE_ACCOUNTGROUP_ID";
	/**
	 * Constants for INPUT_ACCOUNTTYPEID
	 */
	//REQUEST VARIABLE NAME FOR ACCOUNTGROUP_ID
	public static String INPUT_ACCOUNTTYPEID = "EDITVALUE_ACCOUNTTYPE_ID";

	/**
	 *
	 * Constant for AccountGroup Table
	 */
	public static String ACCOUNTGROUP_TABLE_NAME = "TCRM_ACCOUNTTYPES";
	/**
	 * INPUT_ACCOUNTGROUPLIST
	 */
	public static String INPUT_ACCOUNTGROUPLIST = "ACCOUNTGROPUPlIST";
	/**
	 * INPUT_ACCOUNTTYPELIST
	 */
	public static String INPUT_ACCOUNTTYPELIST = "ACCOUNTTYPElIST";

	//	ACCOUNT_GROUP
	public static String ACCOUNT_GROUPLIST = "/ACCOUNT_GroupList";

	//	ACCOUNT_TYPELIST
	public static String ACCOUNT_TYPELIST = "/ACCOUNT_TypeList";

	// SEARCH_ACCOUNTCONVERSIONFACTORSO
	public static String SEARCH_ACCOUNTCONVERSIONFACTORSO =
		"SEARCH_AccountConversionFactorSO";
	/**
	 * Constants for Option : CRMACFAddConversionFactor
	 */

	public static String INPUT_ADDCONVERSIONSECTIONDISPLAY =
		"/CRMACFAddConversionSectionDisplay";
	/**
	 * Constants for Option : CRMACFAddConversionFactor
	 */
	//	 ACTION_CRMACFCANCELCONVERSIONFACTOR
	public static String ACTION_CRMACFCANCELCONVERSIONFACTOR =
		"/CRMACFCancelConversionFactor";
	/**
	 * Constants for  INPUT_ACCOUNCONVFACTID
	 */
	// INPUT_ACCOUNCONVFACTID
	public static String INPUT_ACCOUNCONVFACTID = "/AccountConvFactId";

	/**
	 * Constants for  ACTION_CANCELACFSAVE
	 */
	// ACTION_CANCELACFSAVE
	public static String ACTION_CANCELACFSAVE =
		"/CRMACFCancelConversionFactorSave";

	/**
	 * Added for Account Info module as per OAF requirement
	 */
	// Bonus account type
	public static final int ACCOUNT_TYPE_BONUS = 4184;

	// cash account type
	public static final int ACCOUNT_TYPE_CASH = 4185;

	// gift certificate account type
	public static final int ACCOUNT_TYPE_CERT_GIFT = 4186;

	// pickup certificate account type
	public static final int ACCOUNT_TYPE_CERT_PICKUP = 4187;
	//add by liuyin 
	public static final int ACCOUNT_CAN_NOT_USELOTTERY = 4188;

	// Internal account number
	public static final int ACCOUNT_NUMBER_INTERNAL = 3001;

	// Order reference type
	public static final int REFERENCE_TYPE_ORDER = 4190;

	// Return reference type
	public static final int REFERENCE_TYPE_RETURN = 4191;

	// Refund reference type
	public static final int REFERENCE_TYPE_REFUND = 4408;

	// Certificate reference type
	public static final int REFERENCE_TYPE_CERTIFICATE = 4405;

	// atm reference type
	public static final int REFERENCE_TYPE_RECIEPT_BY_ATM = 4406;

	// post reference type
	public static final int REFERENCE_TYPE_RECIEPT_BY_POST = 4407;

	/******************************
	 * CERTIFICATE CONSTANTS
	 ******************************/

	/**
	 * Constants for Option : CRMCELOnload
	 */
	// ACTION_CRMCELONLOAD
	public static String ACTION_CRMCELONLOAD = "/CRMCELOnload";

	/**
	 * Constants for Option : CRMCELSearchCertificate
	 */
	// ACTION_CRMCELSEARCHCERTIFICATE
	public static String ACTION_CRMCELSEARCHCERTIFICATE =
		"/CRMCELSearchCertificate";

	// RESULT_CERTIFICATELISTSO
	public static String RESULT_CERTIFICATELISTSO = "RESULT_CertificateListSO";

	// SEARCH_CERTIFICATELISTSO
	public static String SEARCH_CERTIFICATELISTSO = "SEARCH_CertificateListSO";

	/**
	 * Constants for Option : CRMCELEditCertificate
	 */
	// ACTION_CRMCELEDITCERTIFICATE
	public static String ACTION_CRMCELEDITCERTIFICATE =
		"/CRMCELEditCertificate";

	// RESULT_CERTIFICATEMASTERVO
	public static String RESULT_CERTIFICATEMASTERVO =
		"RESULT_CertificateMasterVO";

	/**
	 * Constants for Option : CRMCELPlanCertificate
	 */
	// ACTION_CRMCELPLANCERTIFICATE
	public static String ACTION_CRMCELPLANCERTIFICATE =
		"/CRMCELPlanCertificate";

	/**
	 * Constants for Option : CRMCELResetCertificate
	 */
	// ACTION_CRMCELPLANCERTIFICATE
	public static String ACTION_CRMCELRESETCERTIFICATE =
		"/CRMCELResetCertificate";

	// RESULT_PUBLISHERSLISTSO
	public static String RESULT_PUBLISHERSLISTSO = "RESULT_PublishersListSO";

	//Key for setting the Search Result
	public static String RESULT_CRMSAVECERTRESULT = "SAVECERTRESULT";

	/**
	 * Constants for Option : CRMCPLSaveCertificateAsDraft
	 */
	// ACTION_CRMCPLSAVECERTIFICATEASDRAFT
	public static String ACTION_CRMCPLSAVECERTIFICATEASDRAFT =
		"/CRMCPLSaveCertificateAsDraft";

	/**
	 * Constants for Option : CRMCPLSendCertificateToPublisher
	 */
	// ACTION_CRMCPLSENDCERTIFICATETOPUBLISHER
	public static String ACTION_CRMCPLSENDCERTIFICATETOPUBLISHER =
		"/CRMCPLSendCertificateToPublisher";

	/**
	 * Constants for Option : CRMCPLReceiveCertificateFromPublisher
	 */
	// ACTION_CRMCPLRECEIVECERTIFICATEFROMPUBLISHER
	public static String ACTION_CRMCPLRECEIVECERTIFICATEFROMPUBLISHER =
		"/CRMCPLReceiveCertificateFromPublisher";

	/**
	 * Constants for Option : CRMCPLExportToExcel
	 */
	// ACTION_CRMCPLEXPORTTOEXCEL
	public static String ACTION_CRMCPLEXPORTTOEXCEL = "/CRMCPLExportToExcel";

	// RESULT_CERTIFICATEDETAILSSO
	public static String RESULT_CERTIFICATEDETAILSSO =
		"RESULT_CertificateDetailsSO";

	/**
	 * Constants for Option : CRMCELReceiveCertificateFromPublisher
	 */
	// ACTION_CRMCELRECEIVECERTIFICATEFROMPUBLISHER
	public static String ACTION_CRMCELRECEIVECERTIFICATEFROMPUBLISHER =
		"/CRMCELReceiveCertificateFromPublisher";

	/**
	 * Constants for Option : CRMCELExportToExcel
	 */
	// ACTION_CRMCELEXPORTTOEXCEL
	public static String ACTION_CRMCELEXPORTTOEXCEL = "/CRMCELExportToExcel";

	/**
	 * Constants for Option : CRMCELCancelCertificateListing
	 */
	// ACTION_CRMCELCANCELCERTIFICATELISTING
	public static String ACTION_CRMCELCANCELCERTIFICATELISTING =
		"/CRMCELCancelCertificateListing";

	/**
	 * Constants for Option : CRMCELCancelCertificateListing
	 */
	// ACTION_CRMCPLCANCELCERTIFICATELISTING
	public static String ACTION_CRMCPLCANCELCERTIFICATEPLAN =
		"/CRMCPLCancelCertificatePlan";

	/**
	 * Constants for File Name : Export File Name
	 */
	public static String INPUT_EXPORTLISTFILENAME = "CertificateListExport";

	/**
	 * Constants for File Name : File Type
	 */
	public static String INPUT_EXTENTIONXLS = ".xls";

	/**
	 * Constants for File Name : Export File Name
	 */
	public static String INPUT_EXPORTPLANFILENAME = "CertificatePlanExport";

	/**
	 * Export Sheet Name
	 */
	public static String INPUT_EXPORTLISTSHEETNAME = "CertificateListSheet";

	/**
	 * Export Sheet Name
	 */
	public static String INPUT_EXPORTPLANSHEETNAME = "CertificatePlanSheet";

	/**
	 *  Check for the Certificate Search Result is obtained and exported to Excel
	 */
	public static String RESULT_CERTIFICATECELEXPORTEXCEL =
		"CertificateSearchExport";

	/**
	 *  Check for the Maximum number of rows for the excel sheet.
	 */
	public static int INPUT_EXCELMAXROWS = 100;

	/**
	 *  Action variable on click of cancel in Certificate Planning
	 */
	public static String ACTION_CRMCELCANCELCERTIFICATEPLAN =
		"/CRMCELCancelCertificatePlan";

	/**
	 *  Action variable on Load in Certificate Planning
	 */
	public static String ACTION_CRMCPLONLOAD = "/CRMCPLOnload";

	/**
	 *  Input variable need to be passed
	 */
	public static String INPUT_VALIDFLAG = "VALID";

	/**
	 *  Input variable to hold the Search SO
	 */
	public static String INPUT_CERTIFICATESEARCHSO = "CertificateSearchSO";

	/**
	 * Input Variables to hold domain codes of certificate status.
	 */
	public static int INPUT_STATUSDRAFT = 4097;
	public static int INPUT_STATUSSENDTOPUBLISHER = 4098;
	public static int INPUT_STATUSRECEIVEDFROMPUBLISHER = 4099;

	/**
	 * Added for batch
	 */
	public static int INPUT_STATUSRECGENERATED = 1001;

	/**
	 * Constant to hold the value of the certificate batch dao
	 */

	public static String CERTIFICATE_BATCHDAO_NAME =
		"ehsn.et1.db.crm.batch.dao.CertificateBatchDAO";

	/**
	 * Added for OAF module constants
	 */
	//transacion Details - starts
	public static final int TRANSACTION_DETAILS_SHORTAGE_PAYMENT_CASH_ACCOUNT_ATM =
		1001;
	public static final int TRANSACTION_DETAILS_SHORTAGE_PAYMENT_CASH_ACCOUNT_POST =
		1002;
	public static final int TRANSACTION_DETAILS_INTER_COMPANY_TRANFER_BONUS_POINTS =
		1003;
	public static final int TRANSACTION_DETAILS_INTER_COMPANY_TRANFER_CASH =
		1004;
	public static final int TRANSACTION_DETAILS_INTER_COMPANY_TRANFER_GIFT_CERTIFICATE =
		1005;
	public static final int TRANSACTION_DETAILS_INTER_COMPANY_TRANFER_PICKUP_CERTIFICATE =
		1006;
	public static final int TRANSACTION_DETAILS_REFUND_CASH = 1007;
	public static final int TRANSACTION_DETAILS_REFUND_BONUS_POINTS = 1008;
	public static final int TRANSACTION_DETAILS_REFUND_GIFT_CERTIFICATE = 1009;
	public static final int TRANSACTION_DETAILS_REFUND_PICKUP_CERTIFICATE =
		1010;
	public static final int TRANSACTION_DETAILS_PURCHASE_PRODUCT = 1011;
	public static final int TRANSACTION_DETAILS_OFFER_CASH = 1012;
	public static final int TRANSACTION_DETAILS_OFFER_BONUS_POINTS = 1013;
	public static final int TRANSACTION_DETAILS_PAYMENT_BONUS_POINTS = 1014;
	public static final int TRANSACTION_DETAILS_PAYMENT_CASH = 1015;
	public static final int TRANSACTION_DETAILS_PAYMENT_GIFT_CERTIFICATE = 1016;
	public static final int TRANSACTION_DETAILS_PAYMENT_PICKUP_CERTIFICATE =
		1017;
	public static final int TRANSACTION_DETAILS_ACTIVATION_GIFT_CERTIFICATE =
		1018;
	public static final int TRANSACTION_DETAILS_ACTIVATION_PICKUP_CERTIFICATE =
		1019;
	public static final int TRANSACTION_DETAILS_REDEMPTION_GIFT_CERTIFICATE =
		1020;
	public static final int TRANSACTION_DETAILS_REDEMPTION_PICKUP_CERTIFICATE =
		1021;
	public static final int TRANSACTION_DETAILS_RETURN_CASH = 1022;
	public static final int TRANSACTION_DETAILS_RETURN_BONUS_POINTS = 1023;
	public static final int TRANSACTION_DETAILS_CANCEL_RETURN_CASH = 1024;
	public static final int TRANSACTION_DETAILS_CANCEL_RETURN_BONUS_POINTS =
		1025;
	public static final int TRANSACTION_DETAILS_EXCESS_PAYMENT_IN_ATM_RECEIPT =
		1026;
	public static final int TRANSACTION_DETAILS_COMPLAINT_RESOLUTION_BENEFITES_BONUS_POINTS =
		1027;

	public static final int TRANSACTION_DETAILS_CANCELPRODUCT_REFUND_CASH =
		1030;
	public static final int TRANSACTION_DETAILS_CANCELPRODUCT_REFUND_BONUS =
		1031;
	public static final int TRANSACTION_DETAILS_CANCELPRODUCT_REFUND_PICKUP =
		1032;
	public static final int TRANSACTION_DETAILS_CANCELPRODUCT_REFUND_GIFT =
		1033;
	public static final int TRANSACTION_DETAILS_CANCELPRODUCT_BONUSPOINT = 1034;
	public static final int TRANSACTION_DETAILS_CANCELPRODUCT_CASH = 1035;
	public static final int REFERENCE_TYPE_CANCEL = 4409;

	public static final char CREDITDEBITFLAG_CREDIT = 'C';

	public static final int OFFER_CATEGORY_BONUS_POINTS = 4177;
	public static final int OFFER_CATEGORY_DISCOUNTS = 4178;
	public static final int OFFER_CATEGORY_INSTALLMENTS = 4179;
	public static final int OFFER_CATEGORY_PRODUCT_GIVEAWAYS = 4180;
	public static final int OFFER_CATEGORY_CASH = 4181;
	public static final int OFFER_CATEGORY_DELIVERYDATE = 4182;

	/*******************************************
	 * CAMPAIGN PLANNING - BUDGETING CONSTANTS *
	 *******************************************/

	/**
	 * Constants for Option : CRMBDAOnload
	 */
	// ACTION_CRMBDAONLOAD
	public static String ACTION_CRMBDAONLOAD = "/CRMBDAOnload";

	/**
	 * Constants for Option : CRMBDASearchBudget
	 */
	// ACTION_CRMBDASEARCHBUDGET
	public static String ACTION_CRMBDASEARCHBUDGET = "/CRMBDASearchBudget";

	// RESULT_BUDGETSO
	public static String RESULT_BUDGETSO = "RESULT_BudgetSO";

	// RESULT_TOTALBUDGETSO
	public static String RESULT_TOTALBUDGETSO = "RESULT_TotalBudgetSO";

	// SEARCH_BUDGETSO
	public static String SEARCH_BUDGETSO = "SEARCH_BudgetSO";

	/**
	 * Constants for Option : CRMBDAAddBudget
	 */
	// ACTION_CRMBDAADDBUDGET
	public static String ACTION_CRMBDAADDBUDGET = "/CRMBDAAddBudget";

	/**
	 * Constants for Option : CRMBDASaveBudget
	 */
	// ACTION_CRMBDASAVEBUDGET
	public static String ACTION_CRMBDASAVEBUDGET = "/CRMBDASaveBudget";

	/**
	 * Constants for Option : CRMBDACancelBudgetAllocation
	 */
	// ACTION_CRMBDACANCELBUDGETALLOCATION
	public static String ACTION_CRMBDACANCELBUDGETALLOCATION =
		"/CRMBDACancelBudgetAllocation";

	/**
	 * Constants for Option : CRMBDACancelBudgetDef
	 */
	// ACTION_CRMBDACANCELBUDGETALLOCATION
	public static String ACTION_CRMBDACANCELBUDGETDEF =
		"/CRMBDACancelBudgetDef";

	/**
	 * Constants for Option : CRMBRDOnload
	 */
	// ACTION_CRMBRDONLOAD
	public static String ACTION_CRMBRDONLOAD = "/CRMBRDOnload";

	/**
	 * Constants for Option : CRMBRDSearchBudgetResource
	 */
	// ACTION_CRMBRDSEARCHBUDGETRESOURCE
	public static String ACTION_CRMBRDSEARCHBUDGETRESOURCE =
		"/CRMBRDSearchBudgetResource";

	// RESULT_BUDGETRESOURCESOS
	public static String RESULT_BUDGETRESOURCESOS = "RESULT_BudgetResourceSOs";

	// SEARCH_BUDGETRESOURCESOS
	public static String SEARCH_BUDGETRESOURCESOS = "SEARCH_BudgetResourceSOs";

	//RESULT_BUDGETYEARVALUE
	public static String RESULT_BUDGETYEARVALUE = "RESULT_BUDGETYEARVALUE";
	//RESULT_BUDGETRESOURCEIDVALUE
	public static String RESULT_BUDGETRESOURCEIDVALUE =
		"RESULT_BUDGETRESOURCEIDVALUE";
	//RESULT_BUDGETCAMPAIGNIDVALUE
	public static String RESULT_BUDGETCAMPAIGNIDVALUE =
		"RESULT_BUDGETCAMPAIGNIDVALUE";
	//RESULT_BUDGETTEAMMANAGERIDVALUE
	public static String RESULT_BUDGETTEAMMANAGERIDVALUE =
		"RESULT_BUDGETTEAMMANAGERIDVALUE";
	//RESULT_BUDGETCAMPAIGNSTATUSVALUE
	public static String RESULT_BUDGETCAMPAIGNSTATUSVALUE =
		"RESULT_BUDGETCAMPAIGNSTATUSVALUE";
	public static String SPACE = " ";

	/**
	 * Constants for Option : CRMBRDAddBudgetResource
	 */
	// ACTION_CRMBRDADDBUDGETRESOURCE
	public static String ACTION_CRMBRDADDBUDGETRESOURCE =
		"/CRMBRDAddBudgetResource";

	// RESULT_TEAMMANAGERSO
	public static String RESULT_TEAMMANAGERSO = "RESULT_TeamManagerSO";

	//RESULT_COMPANIESLIST
	public String RESULT_COMPANIESLIST = "RESULT_COMPANIESLIST";

	/**
	 * Constants for Option : CRMBRCSaveBudgetResourceInsert
	 */
	// ACTION_CRMBRCSAVEBUDGETRESOURCEINSERT
	public static String ACTION_CRMBRCSAVEBUDGETRESOURCEINSERT =
		"/CRMBRCSaveBudgetResourceInsert";

	/**
	 * Constants for Option : CRMBRDEditBudgetResource
	 */
	// ACTION_CRMBRDEDITBUDGETRESOURCE
	public static String ACTION_CRMBRDEDITBUDGETRESOURCE =
		"/CRMBRDEditBudgetResource";

	/**
	 * Constants for Option : CRMBRCSaveBudgetResourceUpdate
	 */
	// ACTION_CRMBRCSAVEBUDGETRESOURCEUPDATE
	public static String ACTION_CRMBRCSAVEBUDGETRESOURCEUPDATE =
		"/CRMBRCSaveBudgetResourceUpdate";

	/**
	 * Constants for Option : CRMBRDDeleteBudgetResource
	 */
	// ACTION_CRMBRDDELETEBUDGETRESOURCE
	public static String ACTION_CRMBRDDELETEBUDGETRESOURCE =
		"/CRMBRDDeleteBudgetResource";

	/**
	 * Constants for Option : CRMBRDCancelBudgetResource
	 */
	// ACTION_CRMBRDCANCELBUDGETRESOURCE
	public static String ACTION_CRMBRDCANCELBUDGETRESOURCE =
		"/CRMBRDCancelBudgetResource";

	// MANAGERDESIGNATIONID
	public static long MANAGERDESIGNATIONID = 3;

	public static int BUDGETRESOURCETODOTYPE = 1005;
	/**
	 * Constants for Option : CRMBRAOnload
	 */
	// ACTION_CRMBRAONLOAD
	public static String ACTION_CRMBRAONLOAD = "/CRMBRAOnload";

	// RESULT_MARKETINGTEAMSO
	public static String RESULT_MARKETINGTEAMSO = "RESULT_MarketingTeamSO";

	/**
	 * Constants for Option : CRMBRASearchBRForYear
	 */
	// ACTION_CRMBRASEARCHBRFORYEAR
	public static String ACTION_CRMBRASEARCHBRFORYEAR =
		"/CRMBRASearchBRForYear";

	// RESULT_BUDGETRESOURCESO
	public static String RESULT_BUDGETRESOURCESO = "RESULT_BudgetResourceSO";

	// RESULT_BUDGETRESOURCEPURPOSE
	public static String RESULT_BUDGETRESOURCEPURPOSE =
		"RESULT_BudgetResourcePurpose";

	// SEARCH_BUDGETRESOURCESO
	public static String SEARCH_BUDGETRESOURCESO = "SEARCH_BudgetResourceSO";

	/**
	 * Constants for Option : CRMBRASaveBudgetResourceAllocation
	 */
	// ACTION_CRMBRASAVEBUDGETRESOURCEALLOCATION
	public static String ACTION_CRMBRASAVEBUDGETRESOURCEALLOCATION =
		"/CRMBRASaveBudgetResourceAllocation";

	/**
	 * Constants for Option : CRMBRACancelBudgetResourceAllocation
	 */
	// ACTION_CRMBRACANCELBUDGETRESOURCEALLOCATION
	public static String ACTION_CRMBRACANCELBUDGETRESOURCEALLOCATION =
		"/CRMBRACancelBudgetResourceAllocation";

	/**
	 * Constants for Option : CRMBRAGetTeamForBudgetId
	 */
	// ACTION_CRMBRAGETTEAMFORBUDGETID
	public static String ACTION_CRMBRAGETTEAMFORBUDGETID =
		"/CRMBRAGetTeamForBudgetId";

	/**
	 * Constants for Option : CRMMTDOnload
	 */
	// ACTION_CRMMTDONLOAD
	public static String ACTION_CRMMTDONLOAD = "/CRMMTDOnload";

	// SEARCH_MARKETINGTEAMSO
	public static String SEARCH_MARKETINGTEAMSO = "SEARCH_MarketingTeamSO";

	/**
	 * Constants for Option : CRMMTDSearch
	 */
	//ACTION_CRMMTDSEARCH
	public static String ACTION_CRMMTDSEARCH = "/CRMMTDSearch";
	/**
	 * Constants for Option : CRMMTDAddMarketingTeam
	 */
	// ACTION_CRMMTDADDMARKETINGTEAM
	public static String ACTION_CRMMTDADDMARKETINGTEAM =
		"/CRMMTDAddMarketingTeam";

	/**
	 * Constants for Option : CRMMTDSaveTeamInsert
	 */
	// ACTION_CRMMTDSAVETEAMINSERT
	public static String ACTION_CRMMTDSAVETEAMINSERT = "/CRMMTDSaveTeamInsert";

	/**
	 * Constants for Option : CRMMTDEditMarketingTeam
	 */
	// ACTION_CRMMTDEDITMARKETINGTEAM
	public static String ACTION_CRMMTDEDITMARKETINGTEAM =
		"/CRMMTDEditMarketingTeam";

	/**
	 * Constants for Option : CRMMTDSaveTeamUpdate
	 */
	// ACTION_CRMMTDSAVETEAMUPDATE
	public static String ACTION_CRMMTDSAVETEAMUPDATE = "/CRMMTDSaveTeamUpdate";

	/**
	 * Constants for Option : CRMMTDDeleteMarketingTeam
	 */
	// ACTION_CRMMTDDELETEMARKETINGTEAM
	public static String ACTION_CRMMTDDELETEMARKETINGTEAM =
		"/CRMMTDDeleteMarketingTeam";

	/**
	 * Constants for Option : CRMMTDShowEmployeeList
	 */
	// ACTION_CRMMTDSHOWEMPLOYEELIST
	public static String ACTION_CRMMTDSHOWEMPLOYEELIST =
		"/CRMMTDShowEmployeeList";

	/**
	 * Constants for Option : CRMMTDCancelTeamDefinitionSection
	 */
	//ACTION_CRMMTDCANCELTEAMDEFINITIONSECTION
	public static String ACTION_CRMMTDCANCELTEAMDEFINITIONSECTION =
		"/CRMMTDCancelTeamDefinitionSection";

	/**
	 * Constants for Option : CRMMTDCancelTeamDefinition
	 */
	// ACTION_CRMMTDCANCELTEAMDEFINITION
	public static String ACTION_CRMMTDCANCELTEAMDEFINITION =
		"/CRMMTDCancelTeamDefinition";

	public static int MARKETINGTEAMTODOTYPE = 1006;

	/**
	 * INPUT_ADDBUDGET
	 */
	public static String INPUT_ADDBUDGET = "ADDBUDGET";

	/**
	 * INPUT_SHOWADDBUDGETSECTION
	 */
	public static String INPUT_SHOWADDBUDGETSECTION = "SHOWADDBUDGETSECTION";

	/**
	 *
	 * Constant for Budget Table
	 */
	public static String BUDGET_TABLE_NAME = "TCRM_BUDGET";

	/**
	 * Constant for LSTTEAM
	 */
	public static String LSTTEAM = "LSTTEAM";

	/**
	* Constant for LSTTEAM1
	*/
	public static String LSTTEAM1 = "LSTTEAM1";

	/**
	* Constant for SELECTEDYEAR
	*/
	public static String SELECTEDYEAR = "SELECTEDYEAR";

	/**
	* Constant for SELECTEDSTATUS
	*/
	public static String SELECTEDSTATUS = "SELECTSTATUS";

	/**
	 * Constant for YEARVALUE
	 */
	public static String YEARVALUE = "YEARVALUE";

	/**
	 * Constant for YEARLIMIT
	 */
	public static int YEARLIMIT = 10;

	/**
	 * Constants for Separator
	 */
	public static String SEPARATOR = ";";

	/**
	 * Constants for SELECTEDBUDGETID
	 */
	public static String SELECTEDBUDGETID = "SELECTEDBUDGETID";

	// SEARCH_BUDGETRESOURCEVO
	public static String SEARCH_BUDGETRESOURCEVO = "SEARCH_BudgetResourceVO";

	// INPUT_BUDGETRESOURCEVO
	public static String INPUT_BUDGETRESOURCEVO = "INPUT_BudgetResourceVO";

	//INPUT_BUDGERRESOURCEID
	public static String INPUT_BUDGERRESOURCEID = "INPUT_BudgetResourceId";

	//TEMP_BUDGETPERCENTAGE
	public static String TEMP_BUDGETPERCENTAGE = "TEMP_BudgetPercentage";

	//TEMP_BUDGETALLOCATED
	public static String TEMP_BUDGETALLOCATED = "TEMP_BudgetAllocated";

	//TEMP_BUDGETTOTAL
	public static String TEMP_BUDGETTOTAL = "TEMP_BudgetTotal";

	//INPUT_BUDGETRESOURCE_YEAR
	public static String INPUT_BUDGETRESOURCE_YEAR = "INPUT_BudgetResourceYear";

	/**
	 * RESULT_SUCCESS_FLAG
	 */
	public static String RESULT_SUCCESS_FLAG = "Result_SuccessFlag";

	/**
	 * RESULT_SUCCESS_VALUE
	 */

	public static String RESULT_SUCCESS_VALUE = "true";

	/**
	 * RESULT_FAILED_VALUE
	 */
	public static String RESULT_FAILED_VALUE = "false";

	/**
	 * EDIT_BUDGETRESOURCESO
	 */
	public static String EDIT_BUDGETRESOURCESO = "EDIT_BudgetResourceSO";

	public static String TABLE_TCRM_BUDGETRESOURCE = "TCRM_BUDGETRESOURCE";
	/**
	 * METHOD_MIDDLE
	 */
	public static String METHOD_MIDDLE = "MIDDLE OF THE METHODS";

	//	TABLE TCRM_MARKETINGTEAM
	public static String MARKETINGTEAM_TABLE_NAME = "TCRM_MARKETINGTEAM";

	/**
	 * Constants for Team Name
	 */
	//REQUEST VARIABLE NAME FOR TEAM NAME
	public static String INPUT_TEAMNAME = "TEAMNAME";

	//	SESSION VARIABLE NAME FOR ADDMARKETINGTEAM_SECTION_DISPLAY
	public static String INPUT_ADDMARKETINGTEAMSECTIONDISPLAY =
		"DISPLAYSECTION";

	/**
	 * Constants for INPUT_MARKETINGTEAMID
	 */
	//REQUEST VARIABLE NAME FOR MARKETINGTEAM_ID
	public static String INPUT_MARKETINGTEAMID = "EDITVALUE_MARKETINGTEAM_ID";

	//SEARCH_EMPLOYEEDETAILSSO
	public static String SEARCH_EMPLOYEEDETAILSSO = "SEARCHEMPLOYEEDETAILSSO";

	/**
	 * BUDGET_RESOURCE_DELIMITER
	 */
	public static String BUDGET_RESOURCE_DELIMITER = "~";

	/**
	 * CURRENT_DATE
	 */
	public static String CURRENTDATE = "CURRENTDATE";

	/**
	 * RESULT_TEAMMANAGERSFORBUDGETRESOURCEID
	 */
	public static String RESULT_TEAMMANAGERSFORBUDGETRESOURCEID =
		"TEAMMANAGERSFORBUDGETRESOURCEID";

	/**
	 * RESULT_BUDGETEXCEEDS
	 */
	public static String RESULT_BUDGETEXCEEDS = "RESULT_BUDGETEXCEEDS";

	public static String BUDGETRESOURCESOEDITMODE = "BUDGETRESOURCESOEDITMODE";

	/**
	 * BUDGET RESOURCE STATUS CONSTANTS
	 */
	// BUDGETRESOURCESTATUS DOMAIN NAME
	public static String BUDGETRESOURCESTATUS = "BUDGETRESOURCESTATUS";

	// BUDGETRESOURCESTATUS_UNUSED
	public static int BUDGETRESOURCESTATUS_UNUSED = 4401;

	// BUDGETRESOURCESTATUS_ASSIGNED
	public static int BUDGETRESOURCESTATUS_ASSIGNED = 4402;

	// BUDGETRESOURCESTATUS_APPROVED
	public static int BUDGETRESOURCESTATUS_APPROVED = 4403;

	/**
	 * MAILING TABLE CONSTANTS FOR BUDGET RESOURCE ID AND MARKETING TEAM
	 */
	public static String ADDMARKETINGTEAMMESSAGEID = "CRM_0001";
	public static String DELETEMARKETINGTEAMMESSAGEID = "CRM_0004";
	public static String ADDBUDGETRESOURCEMANAGER = "CRM_0002";
	public static String DELETEBUDGETRESOURCEMANAGER = "CRM_0003";
	public static String SENTTO = "NAME";
	public static String SENTFROM = "USERNAME";
	public static String MAILMARKETINGTEAMID = "TEAMID";
	public static String MAILBUDGETRESOURCEID = "BUDGETRESOURCEID";
	/*******************************************
	 * LIST OF EMPLOYEES CONSTANTS             *
	 *******************************************/

	/**
	* Constants for Option : CRMLOEClkDept
	*/
	//	  ACTION_CRMLOECLKDEPT
	public static String ACTION_CRMLOECLKDEPT = "/CRMLOEClkDept";

	//	  ACTION_CRMLOEONLOAD
	public static String ACTION_CRMLOEONLOAD = "/CRMLOEOnload";

	/**
	  * Constants for Option : CRMLOEClkDept
	  */
	//	  ACTION_CRMLOECLKDEPT
	/**
	* Constants for Option : CRMLOEClkDivision
	*/
	//	  ACTION_CRMLOECLKDIVISION
	public static String ACTION_CRMLOECLKDIVISION = "/CRMLOEClkDivision";

	//	  ACTION_CRMLOECLKUNITS
	public static String ACTION_CRMLOECLKUNITS = "/CRMLOEClkUnits";

	/**
	* Constants for Option : CRMLOEClkTeam
	*/
	//	  ACTION_CRMLOECLKTEAM
	public static String ACTION_CRMLOECLKTEAM = "/CRMLOEClkTeam";

	/**
	* Constants for Option : CRMLOERefreshEmployee
	*/
	//	  CRMLOERefreshEmployee
	public static String ACTION_CRMLOERefreshEmployee =
		"/CRMLOERefreshEmployee";

	/**
	* Constants for Option : CRMLOEAddToList
	*/
	//	  ACTION_CRMLOEADDTOLIST
	public static String ACTION_CRMLOEADDTOLIST = "/CRMLOEAddToList";

	/**
	* Constants for Option : CRMLOEDeleteFromList
	*/
	//	  ACTION_CRMLOEDELETEFROMLIST
	public static String ACTION_CRMLOEDELETEFROMLIST = "/CRMLOEDeleteFromList";
	/**
	* Constants for Option : CRMLOESave
	*/
	//	  ACTION_CRMLOESAVE
	public static String ACTION_CRMLOESAVE = "/CRMLOESave";

	/**
	* Constants for Option : CRMLOECancel
	*/
	//	  ACTION_CRMLOECANCEL
	public static String ACTION_CRMLOECANCEL = "/CRMLOECancel";

	/**
	* Constants for Option : CRMLOEUpdate
	*/
	//	  ACTION_CRMLOEUPDATE
	public static String ACTION_CRMLOEUPDATE = "/CRMLOEUpdate";

	//	RESULT_DIVISIONSO
	public static String RESULT_DIVISIONSO = "RESULT_DivisionSO";

	//RESULT_UNITSO
	public static String RESULT_UNITSO = "RESULT_UnitSO";

	//RESULT_TEAMSO
	public static String RESULT_TEAMSO = "RESULT_TeamSO";
	//RESULT_DEPARTMENTDETAILSSO
	public static String RESULT_DEPARTMENTDETAILSSO =
		"RESULT_DepartmentDetailsSO";

	//	RESULT_EMPLOYEEDETAILSSO
	public static String RESULT_EMPLOYEEDETAILSSO = "RESULT_EmployeeDetailsSO";
	/**
	  * RESULT_SELECTEDLIST
	  */
	public static String RESULT_SELECTEDLIST = "SELECTED lIST";

	/**
	 * INPUT_SESSIONEmployeeList
	 */
	public static String INPUT_SESSIONEmployeeList = "Identifier Object";

	/**
	 * ACTION_CRMLOEPREVIOUSLIST
	 **/
	public static String ACTION_CRMLOEPREVIOUSLIST = "/CRMLOEPreviousList";

	/**
	 * ACTION_CRMLOENEXTLIST
	 **/
	public static String ACTION_CRMLOENEXTLIST = "/CRMLOENextList";
	/**
	 * EMPLOYEELISTPAGENO
	 */
	public static String EMPLOYEELISTPAGENO = "PAGENO";

	/**
	 * EMPLOYEELISTINITIALPAGENO
	 */
	public static String EMPLOYEELISTINITIALPAGENO = "1";

	/**
	 * LOECANCEL
	 */
	public static String LOECANCEL = "Cancel";

	public static String EDITMODELOE = "EditModeLOE";

	/*******************************************
	 * TODO CONSTANTS                          *
	 *******************************************/

	/**
	 * Constants for Option : CRMTDLList
	 */
	public static String ACTION_CRMTDLLIST1 = "/CRMTDLList1";

	// add a additional string for result
	public static String RESULT_TODODETAILS = "TODODETAILS";

	// ACTION_CRMTDLLIST
	public static String ACTION_CRMTDLLIST = "/CRMTDLList";

	// RESULT_TODODEFINITIONSO
	public static String RESULT_TODODEFINITIONSO = "RESULT_ToDoDefinitionSO";

	// SEARCH_TODODEFINITIONSO
	public static String SEARCH_TODODEFINITIONSO = "SEARCH_ToDoDefinitionSO";

	// SEARCH_TODOSO
	public static String SEARCH_TODOSO = "SEARCH_ToDoSO";

	/**
	 * Constants for Option : CRMTDDOnClickSearch
	 */
	// ACTION_CRMTDDONCLICKSEARCH
	public static String ACTION_CRMTDDONCLICKSEARCH = "/CRMTDDOnClickSearch";

	// ACTION_CRMTDDONCLICKSEARCH
	public static String UPDATEASSIGNTOCSR = "UPDATEASSIGNTOCSR";

	// RESULT_CSRNAMESSO
	public static String RESULT_CSRNAMESSO = "RESULT_CSRNamesSO";

	// RESULT_CSRNAMESSO
	public static String SEARCH_ASSIGNCSRSO = "SEARCH_AssignCSRSO";

	/**
	 * Constants for Option : CRMTDLList
	 */
	// CSR
	public static String CSR = "CSR";

	// CUST
	public static String CUST = "CUST";

	/**
	 * Constants for Option : CRMTDDOnClickSave
	 */
	// ACTION_CRMTDDONCLICKSAVE
	public static String ACTION_CRMTDDONCLICKSAVE = "/CRMTDDOnClickSave";

	//INSERTSTATUS
	public static String INSERTSTATUS = "INSERTSTATUS";

	/**
	 * Constants for Option : CRMTDLUpdateStatus
	 */
	// ACTION_CRMTDLUPDATESTATUS
	public static String ACTION_CRMTDLUPDATESTATUS = "/CRMTDLUpdateStatus";

	// STATUS_WORKINPROGRESS
	public static int STATUS_WORKINPROGRESS = 4501;

	// STATUS_COMPLETE
	public static int STATUS_COMPLETE = 4508;

	// ACTION_CRMTDDONCLICKSEARCH
	public static String UPDATESTATUS = "UPDATESTATUS";

	/**
	 * Constants for Option : CRMTDLOnClickAdd
	 */
	// ACTION_CRMTDLONCLICKADD
	public static String ACTION_CRMTDLONCLICKADD = "/CRMTDLOnClickAdd";

	/**
	 * Constants for Option : CRMTDDOnClickRow
	 */
	// ACTION_CRMTDLONCLICKROW
	public static String ACTION_CRMTDDONCLICKROW = "/CRMTDDOnClickRow";

	/**
	 * Constants for Option : CRMTDLOnSubmit
	 */
	// ACTION_CRMTDLONSUBMIT
	public static String ACTION_CRMTDDONCANCEL = "/CRMTDDOnClickCancel";

	/**
	 * Constants for Option : CRMTDLOnSubmit
	 */
	// ACTION_CRMTDLONSUBMIT
	public static String ACTION_CRMTDLONSUBMIT = "/CRMTDLOnSubmit";

	/**
	 * Constants for Option : CRMTDLOnCancel
	 */
	// ACTION_CRMTDLONCANCEL
	public static String ACTION_CRMTDLONCANCEL = "/CRMTDLOnCancel";

	//INSERTTODODETAILSSTATUS
	public static String INSERTTODODETAILSSTATUS = "INSERTTODODETAILSSTATUS";

	// btnStartDone
	public static String HIDSTARTDONE = "hidStartDone";

	// btnStartDone
	public static String BTNSTARTDONE = "btnStartDone";

	// TODO_REFTYPE_COMPLAINT
	public static int TODO_REFTYPE_COMPLAINT = 4235;

	//	TODO_REFTYPE_CAMPAIGN
	public static int TODO_REFTYPE_CAMPAIGN = 4236;

	// TODOTYPE_REFERENCE
	public static int TODOTYPE_REFERENCE = 1001;

	//TODOTYPE_GENERAL
	public static int TODOTYPE_GENERAL = 1003;

	//TODOSTATUS_OPEN
	public static int TODOSTATUS_OPEN = 4506;

	//TODOSTATUS_WORKINPROGRSS
	public static int TODOSTATUS_WORKINPROGRSS = 4501;

	//TODOSTATUS_CLOSED
	public static int TODOSTATUS_CLOSED = 4508;

	//TODOSTATUS_REJECTED
	public static int TODOSTATUS_REJECTED = 4510;

	//TODOSTATUS_REGISTERED
	public static int TODOSTATUS_REGISTERED = 4511;

//	TODOSTATUS_HISTORY
	  public static int TODOSTATUS_HISTORY= 4512;


	//REPEATBY_DAYS
	public static int REPEATBY_DAYS = 4128;

	//REPEATBY_WEEKS
	public static int REPEATBY_WEEKS = 4129;

	//REPEATBY_MONTHS
	public static int REPEATBY_MONTHS = 4130;

	//	TODOPAGESIZE
	public static int TODOPAGESIZE = 4;

	/*******************************************
	 * CUSTOMERDESC CONSTANTS                          *
	 *******************************************/

	// RESULT_CUSTOMERDESCSO
	public static String RESULT_CUSTOMERDESCSO = "RESULT_CustomerDescSO";

  // SEARCH_CUSTOMERDESCSO
	public static String SEARCH_CUSTOMERDESCSO = "SEARCH_CustomerDescSO";

	// DESCPAGESIZE
	public static int DESCPAGESIZE = 2;

	/*******************************************
	 * MEMBERSHIP CONSTANTS                    *
	 *******************************************/

	/*
	 * Upgrade Downgrade SMS ID
	 */
	public static String UPGRADE_SMSID = "CRM_002";

	/*
	 *UpgradeSMSMessage
	 */
	public static String UPGRADE_SMSMSG = "UPGRADEDOWNGRADEMESSAGE";

	/*
	 * Mail message id
	 */
	public static String TRANSACTION_MAILMSG = "CRM_0022";
	/*
	 * MEMBERSHIPLEVELTO
	 */
	public static String MEMBERSHIPLEVELTO_VALUE = "MEMBERSHIPLEVELTO";

	/*
	 * Membership changes
	 */
	public static String RESULT_ADDRESS = "Address";
	/*
	 * Zip Code variable
	 */
	public static String ZIPCODE = "ZipCode";
	/*
	 * Channel variable
	 */
	public static String CHANNELS = "Channel";
	/*
	 * RESULT VARIABLE FOR ADDRESSLINE1
	 */
	public static String RESULT_ADDRESSLINE1 = "AddressLin1List";

	/**
	 * Default Priority
	 */
	public static int INPUT_DEFAULT_PRIORITY = 9;

	/**
	 * Default send status
	 */
	public static String INPUT_DEFAULT_SENDSTATUS = "00";

	/**
	 * Document Location
	 */
	public static String INPUT_DOCUMENTLOCATION = "C:\nLocation";

	/**
	 * Mail Dispatch Reference operator
	 */
	public static String INPUT_MAILDISPATCH_ITEM = "SPECIALUPDOWNGRADE";

	/**
	 * Mail Dispatch Reference operator
	 */
	public static String INPUT_MAILDISPATCH_REFERENCE = "UPGRADEDOWNGRADE";

	/**
	 * Check for AND DB OPerator
	 */
	public static String INPUT_AND_DB_OP = " AND ";

	/**
	 * Default Date
	 */
	public static String INPUT_DEFAULT_DATE = "3000-01-01";

	//	DEFAULT_MODE
	public static char INPUT_DEFAULT_MODEYES = 'Y';

	//	DEFAULT_MODE
	public static char INPUT_DEFAULT_MODENO = 'N';

	/**
	 * Set the result for zip code
	 */
	public static String RESULT_ZIPCODELISTSO = "RESULT_ZIPCODELISTSO";

	/**
	 * Set the Input Search SO
	 *
	 */
	public static String INPUT_UPGRADESEARCHSO = "INPUT_UPGRADESEARCH";

	/**
	 * Set the Input Search SO
	 *
	 */
	public static String INPUT_CUSTOMERSEARCHSO = "INPUT_CUSTOMERSEARCH";

	/**
	 * Set the Customer Credit Limit
	 */
	public static long CUSTOMER_CREDITLIMIT = 100000;

	/*
	 * Normal Code for Customer
	 */
	public static int INPUT_NORAMLTYPECUSTOMER = 1103;
	
	/*
	 * Customer Type - EHSN Card Member
	 */
	public static int CUSTOMERTYPE_EHSN_CARD_MEMBER = 1106;
	
	/*
	 * Customer Type - Black customer
	 */
	public static int CUSTOMERTYPE_EHSN_BLACK_CUSTOMER = 1108;
	
	/*
	 * Customer Type - Banking Customer
	 */
	public static int CUSTOMERTYPE_BANKING_CUSTOMER = 1109;

	/* (97/2/15) Thomas: CR 4848. New variable.
	 * Customer Type - Deleted Customer
	 */
	public static int CUSTOMERTYPE_DELETED_CUSTOMER = 1112;	
	
	/* TODO (97/2/29) Thomas: CR 3713. New variable - Birthday Alert. */
	public static String BIRTHDAY_ALERT_7DAYS  = "S";	
	public static String BIRTHDAY_ALERT_30DAYS = "L";		
	
	/*
	 * TOAF_CUSTOMERCREDITLIMITSETUP
	 * CustomerCreditLevelId - Delay Observation
	 */
	public static int CUSTOMERCREDITLEVELID_DELAY_OBSERVATION = 3;
	
	public static int CUSTOMERCREDITLEVELID_NORMAL = 1;

	/*
	 * ReturnGoodsLevel - Return Observation
	 */
	public static int RETURNGOODSLEVEL_RETURN_OBSERVATION = 120;
	
	/**
	* Set the Input RESULT SO
	*/
	public static String INPUT_CUSTOMERRESULTSO = "INPUT_CUSTOMERRESULT";

	/*
	* Constants for option:CRMMUDViewCustomerInfo
	*/
	public static String ACTION_CRMMUDVIEWCUSTOMERINFO =
		"/CRMMUDViewCustomerInfo";

	/*
	 * Constants for Storing the result
	 */
	public static String RESULT_SOURCEINFOSO = "RESULT_SOURCEINFO";

	/**
	 * Constants for Option : CRMMLDOnload
	*/
	// ACTION_CRMMLDONLOAD
	public static String ACTION_CRMMLDONLOAD = "/membershiplevellisting";

	// RESULT_PARENTMEMBERSHIPLEVELLISTSO
	public static String RESULT_PARENTMEMBERSHIPLEVELLISTSO =
		"RESULT_PARENTMEMBERSHIPLEVELLISTSO";

	// RESULT_MEMBERSHIPLEVELLISTSO
	public static String RESULT_MEMBERSHIPLEVELLISTSO =
		"RESULT_MembershipLevelListSO";

	// SEARCH_MEMBERSHIPLEVELLISTSO
	public static String SEARCH_MEMBERSHIPLEVELLISTSO =
		"SEARCH_MembershipLevelListSO";

	// INPUT_MEMBERSHIPLEVELDEFINITIONVO
	public static String INPUT_MEMBERSHIPLVLDEFINITIONVO =
		"INPUT_MembershipLevelDefinitionVO";

	/**
	 * Constants for Option : CRMMLDAddMembershipLevel
	 */
	// ACTION_CRMMLDADDMEMBERSHIPLEVEL
	public static String ACTION_CRMMLDADDMEMBERSHIPLEVEL =
		"/CRMMLDAddMembershipLevel";

	/**
	 * Constants for Option : CRMMLDEditMembershipLevel
	 */
	// ACTION_CRMMLDEDITMEMBERSHIPLEVEL
	public static String ACTION_CRMMLDEDITMEMBERSHIPLEVEL =
		"/CRMMLDEditMembershipLevel";

	// RESULT_MEMBERSHIPLEVELDEFINITIONSO
	public static String RESULT_MEMBERSHIPLEVELDEFINITIONSO =
		"RESULT_MembershipLevelDefinitionSO";

	/**
	 * Constants for Option : CRMMLDDeleteMembershipLevel
	 */
	// ACTION_CRMMLDDELETEMEMBERSHIPLEVEL
	public static String ACTION_CRMMLDDELETEMEMBERSHIPLEVEL =
		"/CRMMLDDeleteMembershipLevel";

	/**
	 * Constants for Option : CRMMLDSaveMembershipLevelDef
	 */
	// ACTION_CRMMLDSAVEMEMBERSHIPLEVELDEF
	public static String ACTION_CRMMLDSAVEMEMBERSHIPLEVELDEF =
		"/CRMMLDSaveMembershipLevelDef";

	/**
	 * Constants for Option : CRMMLDCancelMembershipLvlDef
	 */
	// ACTION_CRMMLDCANCELMEMBERSHIPLVLDEF
	public static String ACTION_CRMMLDCANCELMEMBERSHIPLVLDEF =
		"/CRMMLDCancelMembershipLvlDef";

	/**
	 * Constants for Option : CRMMLDCancelMembershipLvlListing
	 */
	// ACTION_CRMMLDCANCELMEMBERSHIPLVLLISTING
	public static String ACTION_CRMMLDCANCELMEMBERSHIPLVLLISTING =
		"/CRMMLDCancelMembershipLvlListing";

	/**
	 * Constants for Option : CRMMLDParentMembershipLvlDef
	 */
	// ACTION_CRMMLDPARENTMEMBERLVLDEF
	public static String ACTION_CRMMLDPARENTMEMBERLVLDEF =
		"/CRMMLDParentMembershipLvlDef";

	/**
	 * Constants for Result: Parent Membership Level Information
	 */
	// RESULT_PARENTMEMBERSHIPLEVEL
	public static String RESULT_PARENTMEMBERSHIPLEVEL = "PARENTMEMBERSHIPLEVEL";

	/**
	 * Constants for Option : CRMUDLOnload
	 */
	// ACTION_CRMUDLONLOAD
	public static String ACTION_CRMUDLONLOAD = "/CRMUDLOnload";

	/**
	 * Constants for Option : CRMUDLSearchUpgradeDowngradeDef
	 */
	// ACTION_CRMUDLSEARCHUPGRADEDOWNGRADEDEF
	public static String ACTION_CRMUDLSEARCHUPGRADEDOWNGRADEDEF =
		"/CRMUDLSearchUpgradeDowngradeDef";

	// RESULT_UPGRADEDOWNGRADELISTSO
	public static String RESULT_UPGRADEDOWNGRADELISTSO =
		"RESULT_UpgradeDowngradeListSO";

	// SEARCH_UPGRADEDOWNGRADELISTSO
	public static String SEARCH_UPGRADEDOWNGRADELISTSO =
		"SEARCH_UpgradeDowngradeListSO";

	/**
	 * Constants for Option : CRMUDLAddUpgradeDowngradeDef
	 */
	// ACTION_CRMUDLADDUPGRADEDOWNGRADEDEF
	public static String ACTION_CRMUDLADDUPGRADEDOWNGRADEDEF =
		"/CRMUDLAddUpgradeDowngradeDef";

	/**
	 * Constants for Option : CRMUDLEditUpgradeDowngradeDef
	 */
	// ACTION_CRMUDLEDITUPGRADEDOWNGRADEDEF
	public static String ACTION_CRMUDLEDITUPGRADEDOWNGRADEDEF =
		"/CRMUDLEditUpgradeDowngradeDef";

	/**
	 * Constants for Option : CRMUDLDeleteUpgradeDowngradeDef
	 */
	// ACTION_CRMUDLEDITUPGRADEDOWNGRADEDEF
	public static String ACTION_CRMUDLDELUPGRADEDOWNGRADEDEF =
		"/CRMUDLDeleteUpgradeDowngradeDef";

	// RESULT_UPGRADEDOWNGRADENORAMLSO
	public static String RESULT_UPGRADEDOWNGRADENORAMLSO =
		"RESULT_UpgradeDowngradeNoramlSO";

	/**
	 * Constants for Option : CRMUDLCancelUpgradeDowngradeListing
	 */
	// ACTION_CRMUDLCANCELUPGRADEDOWNGRADELISTING
	public static String ACTION_CRMUDLCANCELUPGRADEDOWNGRADELISTING =
		"/CRMUDLCancelUpgradeDowngradeListing";

	/**
	 * Constants for Option : CRMUDDSaveNormalUpgradeDowngradeDef
	 */
	// ACTION_CRMUDDSAVENORMALUPGRADEDOWNGRADEDEF
	public static String ACTION_CRMUDDSAVENORMALUPGRADEDOWNGRADEDEF =
		"/CRMUDDSaveNormalUpgradeDowngradeDef";

	/**
	 * Constants for Option : CRMUDDResetNormalUpgradeDowngradeDef
	 */
	// ACTION_CRMUDDRESETNORMALUPGRADEDOWNGRADEDEF
	public static String ACTION_CRMUDDRESETNORMALUPGRADEDOWNGRADEDEF =
		"/CRMUDDResetNormalUpgradeDowngradeDef";

	/**
	 * Constants for Option : CRMUDDCancelNormalUpgradeDowngradeDef
	 */
	// ACTION_CRMUDDCANCELNORMALUPGRADEDOWNGRADEDEF
	public static String ACTION_CRMUDDCANCELNORMALUPGRADEDOWNGRADEDEF =
		"/CRMUDDCancelNormalUpgradeDowngradeDef";

	/**
	 * Constants for Option : CRMUDDResetManualUpgDwngDef
	 */
	// ACTION_CRMUDDRESETMANUALUPGDWNGDEF
	public static String ACTION_CRMUDDRESETMANUALUPGDWNGDEF =
		"/CRMUDDResetManualUpgDwngDef";

	/**
	 * Constants for Option : CRMUDDShowManualUpgDwngDef
	 */
	// ACTION_CRMUDDSHOWMANUALUPGDWNGDEF
	public static String ACTION_CRMUDDSHOWMANUALUPGDWNGDEF =
		"/CRMUDDShowManualUpgDwngDef";

	/**
	 * Constants for Option : CRMUDDCLEARMANUALUPGDWNGDEF
	 */
	//	ACTION_CRMUDDCLEARMANUALUPGDWNGDEF
	public static String ACTION_CRMUDDCLEARMANUALUPGDWNGDEF =
		"/CRMUDDClearManualUpgDwngDef";

	/**
	 * Constants for Option : CRMMUDSearchCustomer
	 */
	// ACTION_CRMMUDSEARCHCUSTOMER
	public static String ACTION_CRMMUDSEARCHCUSTOMER = "/CRMMUDSearchCustomer";

	// RESULT_CUSTOMERSO
	public static String RESULT_CUSTOMERSO = "RESULT_CustomerSO";

	// SEARCH_CUSTOMERSO
	public static String SEARCH_CUSTOMERSO = "SEARCH_CustomerSO";

	/**
	 * Constants for Option : CRMMUDManualUpgradeDowngrade
	 */
	// ACTION_CRMMUDMANUALUPGRADEDOWNGRADE
	public static String ACTION_CRMMUDMANUALUPGRADEDOWNGRADE =
		"/CRMMUDManualUpgradeDowngrade";

	/**
	 * Constants for Option : CRMUDPUpgradeDowngradeCustomer
	 */
	// ACTION_CRMUDPUPGRADEDOWNGRADECUSTOMER
	public static String ACTION_CRMUDPUPGRADEDOWNGRADECUSTOMER =
		"/CRMUDPUpgradeDowngradeCustomer";

	/**
	 * Constants for Option : CRMUDPCancelPopUp
	 */
	// ACTION_CRMUDPCANCELPOPUP
	public static String ACTION_CRMUDPCANCELPOPUP = "/CRMUDPCancelPopUp";

	/**
	 * Constants for Option : CRMMUDCancelManualUpgDowng
	 */
	// ACTION_CRMMUDCANCELMANUALUPGDOWNG
	public static String ACTION_CRMMUDCANCELMANUALUPGDOWNG =
		"/CRMMUDCancelManualUpgDowng";

	/**
	 * Constants for Batch
	 */
	public static String DOMAINNAME_ACCOUNTTYPE = "ACCOUNT_TYPE";

	/**
	 * Constants for Batch
	 */
	public static char CHAR_Y = 'Y';

	/**
	 * Batch Constant
	 */
	public int BATCH_UPGRADEDOWNGRADEID = 4001;

	public int BATCH_SLABATCH = 4002;

	/**
	 * Batch No - Execute
	 */
	public static String UPGRADEDOWNGRADEEXECUTEBATCH = "CRM_005";

	/**
	 * Batch No - Schedule
	 */
	public static String UPGRADEDOWNGRADESCHEDULEBATCH = "CRM_003";

	public static String UPGRADEDOWNGRADE_IMPORT_FILENAME = "UpgradeDowngrade_";

	public static String UPLOAD_UPGRADEDOWNGRADE_BATCHID = "CRM_018";

	public static int UPGRADEDOWNGRADE_IMPORT_PARAMID = 4001;

	public static String IMPORT_UPGRADEDOWNGRADE_DAONAME =
		"ehsn.et1.db.crm.batch.dao.ImportUpgradeDowngradeCustomerDAO";

	public static String UPGRADEDOWNGRADE_IMPORT_ERRORFILENAME =
		"ErrorLog_UpgradeDowngradeCustomers_";

	/**
	 * MailDispatch Reference Id
	 */
	public int INPUT_MAILDISPATCHREFERENCEVALUE_UPDWNGRADE = 4601;

	/*
	 *  for ST Defect fix
	 */
	public static String DELETE_MEMBERSHIPLEVELID = "DELETE_MEMBERSHIPLEVELID";

	/*
	 *  for ST Defect fix
	 */
	public static String DELETE_DEFAULTFLAG = "DELETE_DEFAULTFLAG";

	public static String SLAMEMBERSHIP_BATCHDAO_NAME =
		"ehsn.et1.db.crm.batch.dao.SLAMembershipBatchDAO";

	public static String UPGRADEDOWNGRADE_BATCHDAO_NAME =
		"ehsn.et1.db.crm.batch.dao.UpgradeDowngradeScheduleBatchDAO";

	public static String UPGRADEDOWNGRADEEXEC_BATCHDAO_NAME =
		"ehsn.et1.db.crm.batch.dao.UpgradeDowngradeExecutionBatchDAO";

	public static String SLABATCH = "CRM_004";

	//	ACTION_CRMHLDONLOAD
	public static String ACTION_CRMHLDONLOAD = "/CRMHLDOnload";

	//	RESULT_COMPLAINTHEADINGLEVELSO
	public static String RESULT_COMPLAINTHEADINGLEVELSO =
		"RESULT_ComplaintHeadingLevelSO";

	//	RESULT_DELETEHEADINGLEVEL
	public static String RESULT_DELETEHEADINGLEVEL =
		"RESULT_ComplaintHeadingLevelSO";

	/**
	 * Constants for Option : CRMHLDClkAddHeading
	 */
	//	ACTION_CRMHLDCLKADDHEADING
	public static String ACTION_CRMHLDCLKADDHEADING = "/CRMHLDClkAddHeading";

	/**
	 * Constants for Option : CRMHLDClkAddHeading
	 */
	//	ACTION_CRMHLDCANCEL
	public static String ACTION_CRMHLDCANCEL = "/CRMHLDCancel";

	/**
	 * Constants for Option : CRMHLDEditHeadingLevel
	 */
	//	ACTION_CRMHLDEDITHEADINGLEVEL
	public static String ACTION_CRMHLDEDITHEADINGLEVEL =
		"/CRMHLDEditHeadingLevel";

	//	INPUT_COMPLAINTHEADINGLEVELVO
	public static String INPUT_COMPLAINTHEADINGLEVELVO =
		"INPUT_ComplaintHeadingLevelVO";

	/**
	 * Constants for Option : CRMHLDUpdateHeadingLevel
	 */
	//	ACTION_CRMHLDUPDATEHEADINGLEVEL
	public static String ACTION_CRMHLDUPDATEHEADINGLEVEL =
		"/CRMHLDUpdateHeadingLevel";

	/**
	 * Constants for Option : CRMHLDSaveHeadingLevel
	 */
	//	ACTION_CRMHLDSAVEHEADINGLEVEL
	public static String ACTION_CRMHLDSAVEHEADINGLEVEL =
		"/CRMHLDSaveHeadingLevel";

	/**
	 * Constants for Option : CRMHLDDeleteHeadingLevel
	 */
	//	ACTION_CRMHLDDELETEHEADINGLEVEL
	public static String ACTION_CRMHLDDELETEHEADINGLEVEL =
		"/CRMHLDDeleteHeadingLevel";

	/**
	 * Constants for Option : CRMHLDDeleteHeadingLevel
	 */
	//	ACTION_CRMHLDDELETEHEADINGLEVEL
	public static String ACTION_CRMHLDDELETEHEADING = "/CRMHLDDeleteHeading";

	/**
	 * Constants for Option : CRMHLDGetHeadings
	 */
	//	ACTION_CRMHLDGETHEADINGS
	public static String ACTION_CRMHLDGETHEADINGS = "/CRMHLDGetHeadings";

	/**
	 * Constants for Option : CRMHLDRemoveHeading
	 */
	//	ACTION_CRMHLDREMOVEHEADINGS
	public static String ACTION_CRMHLDREMOVEHEADINGS = "/CRMHLDRemoveHeading";

	//	RESULT_COMPLIANTHEADINGDETAILSSO
	public static String RESULT_COMPLIANTHEADINGDETAILSSO =
		"RESULT_CompliantHeadingDetailsSO";

	/**
	 * Constants for Option : CRMHLDAddHeading
	 */
	//	ACTION_CRMHLDADDHEADING
	public static String ACTION_CRMHLDADDHEADING = "/CRMHLDAddHeading";

	/**
	 * Constants for Option : CRMHLDAddOrEditHeadingLevel
	 */
	//	ACTION_CRMHLDADDOREDITHEADINGLEVEL
	public static String ACTION_CRMHLDADDOREDITHEADINGLEVEL =
		"/CRMHLDAddOrEditHeadingLevel";

	//	RESULT_HEAIDNGDETAILSSO
	public static String RESULT_HEADINGDETAILSSO = "RESULT_HeadingDetailsSO";

	/**
	 * Constants for Option : CRMHDClkContact
	 */
	//	ACTION_CRMHDCLKCONTACT
	public static String ACTION_CRMHDCLKCONTACT = "/CRMHDClkContact";

	/**
	 * Constants for Option : CRMHDAddDepartmentDetails
	 */
	//	ACTION_CRMHDADDDEPARTMENTDETAILS
	public static String ACTION_CRMHDADDDEPARTMENTDETAILS =
		"/CRMHDAddDepartmentDetails";

	//	RESULT_SLASO
	public static String RESULT_SLASO = "RESULT_SLASO";

	//	RESULT_DEPARTMENTSO
	public static String RESULT_DEPARTMENTSO = "RESULT_DEPARTMENTSO";

	/**
	 * Constants for Option : CRMHDSaveHeading
	 */
	//	ACTION_CRMHDSAVEHEADING
	public static String ACTION_CRMHDSAVEHEADING = "/CRMHDSaveHeading";

	/**
	 * Constants for Option : CRMHDClkDeptOrVendor
	 */
	//	ACTION_CRMHDClkDeptOrVendor
	public static String ACTION_CRMHDClkDeptOrVendor = "/CRMHDClkDeptOrVendor";

	/**
	 * Constants for Option : CRMHDEditDepartmentDetails
	 */
	//	ACTION_CRMHDEDITDEPARTMENTDETAILS
	public static String ACTION_CRMHDEDITDEPARTMENTDETAILS =
		"/CRMHDEditDepartmentDetails";

	//	RESULT_HEADINGDEPARTMENTSO
	public static String RESULT_HEADINGDEPARTMENTSO =
		"RESULT_HeadingDepartmentSO";

	/**
	 * Constants for Option : CRMHDUpdateHeading
	 */
	//	ACTION_CRMHDUPDATEHEADING
	public static String ACTION_CRMHDUPDATEHEADING = "/CRMHDUpdateHeading";

	/**
	 * Constants for Option : CRMHDDeleteHeading
	 */
	//	ACTION_CRMHDDELETEHEADING
	public static String ACTION_CRMHDDELETEHEADING = "/CRMHDDeleteHeading";

	/**
	 * Constants for Option : CRMHDSaveDepartment
	 */
	//	ACTION_CRMHDSAVEDEPARTMENT
	public static String ACTION_CRMHDSAVEDEPARTMENT = "/CRMHDSaveDepartment";

	/**
	 * Constants for Option : CRMHDUpdateDepartment
	 */
	//	ACTION_CRMHDUPDATEDEPARTMENT
	public static String ACTION_CRMHDUPDATEDEPARTMENT =
		"/CRMHDUpdateDepartment";

	/**
	 * Constants for Option : CRMHDDeleteDepartment
	 */
	//	ACTION_CRMHDDELETEDEPARTMENT
	public static String ACTION_CRMHDDELETEDEPARTMENT =
		"/CRMHDDeleteDepartment";

	/**
	 * Constants for Option : CRMHDCancelHeadingDepartment
	 */
	//	ACTION_CRMHDCANCELHEADINGDEPARTMENT
	public static String ACTION_CRMHDCANCELHEADINGDEPARTMENT =
		"/CRMHDCancelHeadingDepartment";

	/**
	 * Constants for Option : CRMHDCancelHeading
	 */
	//	ACTION_CRMHDCANCELHEADING
	public static String ACTION_CRMHDCANCELHEADING = "/CRMHDCancelHeading";

	//	ACTION_CRMHDCANCELHEADING
	public static String ACTION_CRMHDCANCELCONTACT = "/CRMHDCancelContact";

	/**
	 * Constants for CRMHDCancelContact
	 */
	public static String INPUT_ADDHEADINGLEVEL = "addHeadingLevelFlag";

	/**
	 * Constants for SHOW_DETAILS
	 */
	public static String SHOW_DETAILS = "SHOW_DETAILS";

	/**
	 * Constants for TEAMTYPE_VENDOR
	 */
	public static int TEAMTYPE_VENDOR = 2;

	/**
	 * Constants for TEAMTYPE_CARRIER
	 */
	public static int TEAMTYPE_CARRIER = 3;

	/**
	 * Constants for TEAMTYPE_MD
	 */
	public static int TEAMTYPE_MD = 4;

	/**
	 * Constants for showFlag
	 */
	public static String INPUT_SHOWFLAG = "showFlag";

	/**
	 * Constants for INPUT_ACCOUNTTYPEID
	 */
	//REQUEST VARIABLE NAME FOR INPUT_ADDHEADINGLEVEL
	public static String BOOLEAN_UPDATEHEADINGLEVEL =
		"BOOLEAN_UPDATEHEADINGLEVEL";

	/**
	 * Constants for INPUT_ACCOUNTTYPEID
	 */
	//REQUEST VARIABLE NAME FOR INPUT_ADDHEADINGLEVEL
	public static String BOOLEAN_SAVEHEADINGLEVEL = "BOOLEAN_SAVEHEADINGLEVEL";

	/**
	* Constants for INPUT_ACCOUNTTYPEID
	*/
	//REQUEST VARIABLE NAME FOR INPUT_ADDHEADINGLEVEL
	public static String SEARCH_COMPLAINTHEADINGDETAILSSO =
		"SEARCH_COMPLAINTHEADINGDETAILSSO";

	/**
	* Constants for CUSTOMERSERVICEHEADING
	*/
	//VARIABLE NAME FOR CUSTOMERSERVICEHEADING
	public static String CUSTOMERSERVICEHEADING = "CUSTOMERSERVICEHEADING";

	/**
	* Constants for HEADINGNAME_SESSION
	*/
	//VARIABLE NAME FOR HEADINGNAME_SESSION
	public static String HEADINGNAME_SESSION = "headingName";

	/**
	* Constants for HEADINGID_SESSION
	*/
	//VARIABLE NAME FOR HEADINGID_SESSION
	public static String HEADINGID_SESSION = "headingId";

	/**
	* Constants for HEADINGLEVELID_SESSION
	*/
	//VARIABLE NAME FOR HEADINGLEVELID_SESSION
	public static String HEADINGLEVELID_SESSION = "headingLevelId";

	/**
	* Constants for LEVELNAME_SESSION
	*/
	//VARIABLE NAME FOR LEVELNAME_SESSION
	public static String LEVELNAME_SESSION = "levelName";

	/**
	* Constants for INPUT_SAVEMODE
	*/
	//VARIABLE NAME FOR INPUT_SAVEMODE
	public static String INPUT_SAVEMODE = "SAVEMODE";

	/**
	 * Constants for REQUEST_SAVEHEADNIGLEVEL
	 */
	//VARIABLE NAME FOR REQUEST_SAVEHEADNIGLEVEL
	public static String REQUEST_SAVEHEADNIGLEVEL = "saveHeadingLevel";

	/**
	 * Constants for ACTION_CRMCCLISTONLOAD
	 */
	//	ACTION_CRMCCLISTONLOAD
	public static String ACTION_CRMCCLISTONLOAD = "/CRMCCListOnload";

	/**
	 * Constants for Option : CRMCCDefnOnload
	 */
	//	ACTION_CRMCCDEFNONLOAD
	public static String ACTION_CRMCCDEFNONLOAD = "/CRMCCDefnOnload";

	/**
	 * Constants for Option : CRMCCClkSearch
	 */
	//	ACTION_CRMCCCLKSEARCH
	public static String ACTION_CRMCCCLKSEARCH = "/CRMCCClkSearch";

	//	RESULT_COMPLAINTCATEGORYSO
	public static String RESULT_COMPLAINTCATEGORYSO =
		"RESULT_ComplaintCategorySO";

	//	SEARCH_COMPLAINTCATEGORYSO
	public static String SEARCH_COMPLAINTCATEGORYSO =
		"SEARCH_ComplaintCategorySO";

	/**
	 * Constants for Option : CRMCCClkOk
	 */
	//	ACTION_CRMCCCLKOK
	public static String ACTION_CRMCCCLKOK = "/CRMCCClkOk";

	/**
	 * Constants for Option : CRMCCClkGo
	 */
	//	ACTION_CRMCCCLKGO
	public static String ACTION_CRMCCCLKGO = "/CRMCCClkGo";

	/**
	 * Constants for Option : RESULT_COMPLAINTHEADINGDETAILSSO
	 */
	//	RESULT_COMPLAINTHEADINGDETAILSSO
	public static String RESULT_COMPLAINTHEADINGDETAILSSO =
		"RESULT_ComplaintHeadingDetailsSO";

	/**
	 * Constants for Option : CRMCCClkHeading
	 */
	//	ACTION_CRMCCCLKHEADING
	public static String ACTION_CRMCCCLKHEADING = "/CRMCCClkHeading";

	/**
	 * Constants for Option : RESULT_HEADINGDEPARTMENTDETAILSSO
	*/
	//	RESULT_HEADINGDEPARTMENTDETAILSSO
	public static String RESULT_HEADINGDEPARTMENTDETAILSSO =
		"RESULT_HeadingDepartmentDetailsSO";

	/**
	 * Constants for Option : RESULT_HEADINGDEPARTMENTDETAILSSO
		 */
	//	SEARCH_HEADINGDEPARTMENTDETAILSSO
	public static String SEARCH_HEADINGDEPARTMENTDETAILSSO =
		"SEARCH_HeadingDepartmentDetailsSO";

	/**
	 * Constants for Option : CRMCCClkDepartment
	 */
	//	ACTION_CRMCCCLKDEPARTMENT
	public static String ACTION_CRMCCCLKDEPARTMENT = "/CRMCCClkDepartment";

	/**
	 * Constants for Option : RESULT_SLAMEMBERSHIPOVERRIDESO
	 */
	//	RESULT_SLAMEMBERSHIPOVERRIDESO
	public static String RESULT_SLAMEMBERSHIPOVERRIDESO =
		"RESULT_SLAMembershipOverrideSO";

	/**
	 * Constants for Option : CRMCCClkVendor
	 */
	//	ACTION_CRMCCCLKVENDOR
	public static String ACTION_CRMCCCLKVENDOR = "/CRMCCClkVendor";

	/**
	 * Constants for Option : RESULT_VENDORSLA
	 */

	//	RESULT_VENDORSLA
	public static String RESULT_VENDORSLA = "RESULT_VendorSLA";

	/**
	 * Constants for Option : CRMCCClkSaveSLA
	 */
	//	ACTION_CRMCCCLKSAVESLA
	public static String ACTION_CRMCCCLKSAVESLA = "/CRMCCClkSaveSLA";

	//	INPUT_SLASO
	public static String INPUT_SLASO = "INPUT_SLASO";

	/**
	 * Constants for Option : CRMCCAddResolution
	 */
	//	ACTION_CRMCCADDRESOLUTION
	public static String ACTION_CRMCCADDRESOLUTION = "/CRMCCAddResolution";

	/**
	 * Constants for Option : CRMCCClkSaveResolution
	 */
	//	ACTION_CRMCCCLKSAVERESOLUTION
	public static String ACTION_CRMCCCLKSAVERESOLUTION =
		"/CRMCCClkSaveResolution";

	/**
	 * Constants for Option : CRMCCClkUpdateResolution
	 */
	//	INPUT_COMPLAINTRESOLUTIONBENEFITSVO
	public static String INPUT_COMPLAINTRESOLUTIONBENEFITSLIST =
		"INPUT_ComplaintResolutionBenefitsVO";

	/**
	 * Constants for Option : CRMCCSaveCategory
	 */
	//	ACTION_CRMCCSAVECATEGORY
	public static String ACTION_CRMCCSAVECATEGORY = "/CRMCCSaveCategory";

	/**
	 * Constants for Option : CRMCCUpdateCategory
	 */
	//	ACTION_CRMCCUPDATECATEGORY
	public static String ACTION_CRMCCUPDATECATEGORY = "/CRMCCUpdateCategory";

	/**
	 * Constants for RESULT_SAVEHIERARCHY
	 */
	//RESULT_SAVEHIERARCHY
	public static String RESULT_SAVEHIERARCHY = "SAVE_HIERARCHY";

	/*
	 * Constants for INPUT_SHOWVENDOR
	 */
	//INPUT_SHOWVENDOR
	public static String INPUT_SHOWVENDOR = "SHOWVENDOR";

	/*
	 * Constants INPUT_SETDISPLAYVALUE
	 */
	//INPUT_SETDISPLAYVALUE
	public static String INPUT_SETDISPLAYVALUE = "DISPLAY";

	/*
	 * Constants for INPUT_RESOLUTIONBENEFITID
	 */
	//INPUT_RESOLUTIONBENEFITID
	public static String INPUT_RESOLUTIONBENEFITID = "RESOLUTION_ID";

	/*
	 * Constants for RESULT_SLA
	 */
	//RESULT_SLA
	public static String RESULT_SLA = "RESULT_SLA";

	/*
	 *Constants for RESULT_MEMBERSHIP
	 */
	//RESULT_MEMBERSHIP
	public static String RESULT_MEMBERSHIP = "ALALMEMBERSHIPS";

	/*
	 * Constants for RESULT_COMPLAINTHEADINGLEVEL
	 */
	//RESULT_COMPLAINTHEADINGLEVEL
	public static String RESULT_COMPLAINTHEADINGLEVEL = "HEADINGLEVEL";
	/*
	 * Constants for INPUT_DISPLAYVENDORYES
	 */
	//INPUT_DISPLAYVENDORYES
	public static String INPUT_DISPLAYVENDORYES = "DISPLAYYES";

	/*
	 * Constants for INPUT_DISPLAYVENDORNO
	 */
	//INPUT_DISPLAYVENDORNO
	public static String INPUT_DISPLAYVENDORNO = "DISPLAYNO";

	/*
	 *Constants for  RESULT_MEMBERSHIPS
	 */
	//RESULT_MEMBERSHIPS
	public static String RESULT_MEMBERSHIPS = "MEMBERSHIPS";
	/*
	 * Constants for INPUT_DISPLAYVENDORNO
	 */
	//INPUT_DISPLAYVENDORNO
	public static String INPUT_HEADINGID = "HEADINGID";

	/*
	 *Constants for  INPUT_TEAMID
	 */
	//INPUT_TEAMID
	public static String INPUT_TEAMID = "TEAMID";

	/**
	 * Constants for Option : CRMPMLOnload
	 */
	//	  ACTION_CRMPMLONLOAD
	public static String ACTION_CRMPMLONLOAD = "/CRMPMLOnload";

	/**
	 * Constants for  RESULT_SLAACTIVITYSO
	 */
	//	  RESULT_SLAACTIVITYSO
	public static String RESULT_SLAACTIVITYSO = "RESULT_SLAActivitySO";

	/**
	* Constants for Option : CRMPMLAddEditSLA
	*/
	//	  ACTION_CRMPMLADDEDITSLA
	public static String ACTION_CRMPMLADDEDITSLA = "/CRMPMLAddEditSLA";

	/**
	* Constants for Option : CRMPMLDeleteSLA
	*/
	//	  ACTION_CRMPMLDELETESLA
	public static String ACTION_CRMPMLDELETESLA = "/CRMPMLDeleteSLA";

	/**
	* Constants for Option : CRMPMLAddEditActivity
	*/
	//	  ACTION_CRMPMLADDEDITACTIVITY
	public static String ACTION_CRMPMLADDEDITACTIVITY =
		"/CRMPMLAddEditActivity";

	/**
	* Constants for Option : CRMPMLDeleteActivity
	*/
	//	  ACTION_CRMPMLDELETEACTIVITY
	public static String ACTION_CRMPMLDELETEACTIVITY = "/CRMPMLDeleteActivity";
	/**
	* Constants for Option : CRMSDFSaveSLADefinition
	*/
	//	  ACTION_CRMSDFSAVESLADEFINITION
	public static String ACTION_CRMSDFSAVESLADEFINITION =
		"/CRMSDFSaveSLADefinition";

	/**
	* Constants for Option : CRMADFSaveSLAActivity
	*/
	//	  ACTION_CRMADFSAVESLAACTIVITY
	public static String ACTION_CRMADFSAVESLAACTIVITY =
		"/CRMADFSaveSLAActivity";

	/**
	* Constants for Option : CRMADFCancel
	*/
	//	  ACTION_CRMADFCANCEL
	public static String ACTION_CRMADFCANCEL = "/CRMADFCancel";

	/**
	* Constants for Option : CRMSDFCancel
	*/
	//	  ACTION_CRMSDFCANCEL
	public static String ACTION_CRMSDFCANCEL = "/CRMSDFCancel";

	/**
		 * Constants for INPUT_COMPLAINTRESOLUTIONBENEFITSVO
	 */
	//	INPUT_COMPLAINTRESOLUTIONBENEFITSVO
	public static String INPUT_COMPLAINTRESOLUTIONBENEFITSVO =
		"INPUT_ComplaintResolutionBenefitsVO";

	/**
	 * Constants for Option : CRMCCClkUpdateResolution
	 */
	// ACTION_CRMCCCLKUPDATERESOLUTION
	public static String ACTION_CRMCCCLKUPDATERESOLUTION =
		"/CRMCCClkUpdateResolution";

	/**
	 * Constants for Option : CRMCCDeleteResolution
	 */
	// ACTION_CRMCCDELETERESOLUTION
	public static String ACTION_CRMCCDELETERESOLUTION =
		"/CRMCCDeleteResolution";

	/**
	 * Constants for Option : CRMCCCancelCategory
	 */
	// ACTION_CRMCCCANCELCATEGORY
	public static String ACTION_CRMCCCANCELCATEGORY = "/CRMCCCancelCategory";

	/**
	 * Constants for Option : CRMCCEditResolution
	 */
	// ACTION_CRMCCEDITRESOLUTION
	public static String ACTION_CRMCCEDITRESOLUTION = "/CRMCCEditResolution";

	/**
	 * Constants for Option : CRMCCDeleteCategory
	 */
	// ACTION_CRMCCDELETECATEGORY
	public static String ACTION_CRMCCDELETECATEGORY = "/CRMCCDeleteCategory";

	/**
	 * Constants for Option : CRMCCClkEditCategory
	 */
	// ACTION_CRMCCCLKEDITCATEGORY
	public static String ACTION_CRMCCCLKEDITCATEGORY = "/CRMCCClkEditCategory";

	/**
	 * Constants for Option : ACTION_CRMCCCLKCANCELCATEGORY
	 */
	//	   ACTION_CRMCCCLKCANCELCATEGORY
	public static String ACTION_CRMCCCLKCANCELCATEGORY =
		"/CRMCCClkCancelCategory";

	/**
	 * Constants for Option : ACTION_CRMCCCLKCANCELCATEGORYSEARCH
	 */
	//ACTION_CRMCCCLKCANCELCATEGORYSEARCH
	public static String ACTION_CRMCCCLKCANCELCATEGORYSEARCH =
		"/CRMCCClkCancelCategorySearch";

	/**
	 * Constants for CALLWORKCODEID_COMPLAINTENQUIRY
	 */
	// CALLWORKCODEID_COMPLAINTENQUIRY
	public static int CALLWORKCODEID_COMPLAINTENQUIRY = 1;

	/**
	 * Constants for CALLWORKCODEID_COMPLAINTENQUIRY
	 */
	// CALLWORKCODEID_COMPLAINTENQUIRY
	public static String CALLWORKCODENAME_COMPLAINTENQUIRY =
		"Complaint Enquiry";

	/**
	 * Constants for COMPLAINT_REFERENCE_TYPE
	 */
	// COMPLAINT_REFERENCE_TYPE
	public static int COMPLAINT_REFERENCE_TYPE = 1001;

	/**
	 * Constants for COMPLAINT_REFERENCE_TYPE
	 */
	// COMPLAINT_REFERENCE_TYPE
	public static int DISCOUNTCOUPON_REFERENCE_TYPE = 4500;

	/**
	 * Constants for DISCOUNT_COUPAN
	 */
	// DISCOUNT_COUPAN
	public static int DISCOUNT_COUPON = 4500;

	/**
	 * Constants for RESULT_DEPARTMENTLIST
	 */
	//RESULT_DEPARTMENTLIST
	public static String RESULT_DEPARTMENTLIST = "RESULT_DEPARTMENTLIST";

	/**
	 * Constants for RESULT_DIVISIONLIST
	 */
	//RESULT_DIVISIONLIST
	public static String RESULT_DIVISIONLIST = "RESULT_DIVISIONLIST";

	/**
	 * Constants for RESULT_UNITLIST
	 */
	//RESULT_UNITLIST
	public static String RESULT_UNITLIST = "RESULT_UNITLIST";

	/**
	 * Constants for RESULT_TEAMLIST
	 */
	//RESULT_TEAMLIST
	public static String RESULT_TEAMLIST = "RESULT_TEAMLIST";

	/**
	 * Constants for INCLUDE_HOLIDAYS
	 */
	//INCLUDE_HOLIDAYS
	public static String INCLUDE_HOLIDAYS = "INCLUDE_HOLIDAYS";

	/**
	 * Constants for INCLUDE_CALLOUT
	 */
	//INCLUDE_CALLOUT
	public static String INCLUDE_CALLOUT = "INCLUDE_CALLOUT";

	/**
	 * Constants for PEOPLETOALARM
	 */
	//PEOPLETOALARM
	public static String PEOPLETOALARM = "PEOPLE_TO_ALARM_LIST";

	/**
	 * Constants for OLDTEAMID
	 */
	//OLDTEAMID
	public static String OLDTEAMID = "OLD_TEAM_ID";

	/**
	 * Constants for CLICK_CANCEL
	 */
	//CLICK_CANCEL
	public static String CLICK_CANCEL = "CLICK_CANCEL";

	/**
	 * Constants for COMPLAINT_CATEGORYID
	 */
	//COMPLAINT_CATEGORYID
	public static String COMPLAINT_CATEGORYID = "COMPLAINT_CATEGORYID";

	/**
	 * Constants for DEPT_EDIT_CONFIRM
	 */
	//DEPT_EDIT_CONFIRM
	public static String DEPT_EDIT_CONFIRM = "DEPT_EDIT_CONFIRM";

	/**
	 * ITERATION-1 Complaint Constants Additions
	 */

	/**
	 * Constants for DELIVERY_TYPE
	 */
	//DELIVERY_TYPE
	public static int DELIVERY_TYPE = 3; //TODO Constants Has to be identified

	/**
	 * Constants for POSTED_FLAG
	 */
	//POSTED_FLAG

	public static char POSTED_FLAG = 'N';

	public static String DOMAINNAME_COMPLAINTSTATUS = "COMPLAINTSTATUS";
	
	/**
	 * Constants for COMPLAINTSTATUS_REGISTERED
	 */
	//COMPLAINTSTATUS_REGISTERED
	public static int COMPLAINTSTATUS_REGISTERED = 4504;

	/**
	 * Constants for COMPLAINTSTATUS_ASSIGNED
	 */
	//COMPLAINTSTATUS_ASSIGNED
	public static int COMPLAINTSTATUS_ASSIGNED = 4500;

	/**
	 * Constants for COMPLAINTSTATUS_UNABLETOCATEGORIZE
	 */
	//COMPLAINTSTATUS_UNABLETOCATEGORIZE
	public static int COMPLAINTSTATUS_UNABLETOCATEGORIZE = 4503;
	/**
	 * Constants for COMMENTTYPE_CLOSED
	 */
	//COMMENTTYPE_CLOSED
	public static String COMMENTTYPE_CLOSED = "C";

	/**
	 * Constants for COMMENTTYPE_RESOLVED
	 */
	//COMMENTTYPE_RESOLVED
	public static String COMMENTTYPE_RESOLVED = "R";

	/**
	 * Constants for COMMENTTYPE_GENERAL
	 */
	//COMMENTTYPE_GENERAL
	public static String COMMENTTYPE_GENERAL = "G";

	/**
	 * Constants for COMMENTTYPE_ASSIGNED
	 */
	//COMMENTTYPE_ASSIGNED
	public static String COMMENTTYPE_ASSIGNED = "A";

	/**
	 * Constants for COMMENTTYPE_REJECTED
	 */
	//COMMENTTYPE_ASSIGNED
	public static String COMMENTTYPE_REJECTED = "J";

	/**
	 * Constants for RESOLUTION BENEFIT
	 */
	//	RESOLUTION BENEFIT
	public static int RESOLUTIONBENEFIT = 4104;

	/**
	 * Constants for YESSTRING
	 */
	//	RESOLUTION YESSTRING
	public static String YESSTRING = "Y";

	/**
	 * Constants for YESSTRING_LOWER
	 */
	//	RESOLUTION YESSTRING_LOWER
	public static String YESSTRING_LOWER = "y";

	/**
	 * Constants for TODOSTATUS_REASSIGNED
	 */
	//TODOSTATUS_REASSIGNED
	public static int TODOSTATUS_REASSIGNED = 4507;

	/**
	 * Constants for TODOSTATUS_REDIRECTTOCSR
	 */
	//TODOSTATUS_REDIRECTTOCSR
	public static int TODOSTATUS_REDIRECTTOCSR = 4509;

	/**
	 * Constants for YESSTRING
	 */
	//LASTASSIGNEDSTATUS_ASSIGNED
	public static int LASTASSIGNEDSTATUS_ASSIGNED = 4500;

	/**
	 * Constants for LASTASSIGNEDSTATUS_WORKINPROGRESS
	 */
	//LASTASSIGNEDSTATUS_WORKINPROGRESS
	public static int LASTASSIGNEDSTATUS_WORKINPROGRESS = 4501;

	/**
	 * Constants for LASTASSIGNEDSTATUS_RESOLVED
	 */
	//LASTASSIGNEDSTATUS_RESOLVED
	public static int LASTASSIGNEDSTATUS_RESOLVED = 4502;

	/**
	 * Constants for LASTASSIGNEDSTATUS_REOPENED
	 */
	//LASTASSIGNEDSTATUS_RESOLVED
	public static int LASTASSIGNEDSTATUS_REOPENED = 4503;

	/**
	 * Constants for LASTASSIGNEDSTATUS_REJECTED
	 */
	//LASTASSIGNEDSTATUS_RESOLVED
	public static int LASTASSIGNEDSTATUS_REJECTED = 4504;

	//	LASTASSIGNEDSTATUS_REGISTERED
	public static int LASTASSIGNEDSTATUS_REGISTERED = 4505;

	/**
	 * Constants for BONUSPOINTS_GROUPID
	 */
	//BONUSPOINTS_GROUPID
	public static int BONUSPOINTS_TYPEID = 4184;

	/**
	 * Constants for COMPLAINTSTATUS_CLOSED
	 */
	//
	public static int COMPLAINTSTATUS_CLOSED = 4508;

	/**
	 * Constants for NOSTRING
	 */
	//NOSTRING
	public static String NOSTRING = "N";

	/**
	 * Constants for COMPLAINTSTATUS_RESOLVED
	 */
	//COMPLAINTSTATUS_RESOLVED
	public static int COMPLAINTSTATUS_RESOLVED = 4502;

	/**
	 * Constants for  ID
	 */
	//	DESIGNATIONID_TEAMLEAD
	public static int DESIGNATIONID_TEAMLEAD = 9;

	/**
	 * Constants for DESIGNATIONID_SUPERVISOR
	 */
	//DESIGNATIONID_SUPERVISOR
	public static int DESIGNATIONID_SUPERVISOR = 10;

	/**
	 * Constants for DESIGNATIONID_TEAMMEMBER
	 */
	//DESIGNATIONID_TEAMMEMBER
	public static int DESIGNATIONID_TEAMMEMBER = 1;

	/**
	 * Constants for OUTBOUND
	 */
	//OUTBOUND
	public static String CONTACTTYPE_OUTBOUND = "OUTBOUND";

	/**
	 * COMPLAINT_MESSAGEID
	 */
	public static String COMPLAINT_MESSAGEID = "CRM_0013";

	/**
	 * COMPLAINT_MESSAGEID
	 */
	public static String COMPLAINT_SLABATCH_MSGID = "CRM_0024";
	/**
	 * COMPLAINT_MESSAGEID
	 */
	public static String CERTIFICATE_MESSAGEID = "CRM_0014";

	/**
	 * CONSTANTS FOR MESSAGE BODY IN COMPLAINT SLA ALARM
	 */
	public static String COMPLAINTID = "COMPLAINTID";

	public static String CATEGORYNAME = "CATEGORYNAME";



	/*******************************************
	 * CAMPAIGN PLANNING - CAMPAIGNS LIST *
	 *******************************************/
	public static String CAMPAIGN_SEARCH_MODE = "CampaignSearchMode";

	public static String CAMPAIGN_SEARCH_NUMBER = "CampaignSearchNumber";

	// ACTION_CRMCLTONLOAD
	public static String ACTION_CRMCLTONLOAD = "/CRMCLTOnload";

	// ACTION_CRMCLTSEARCHCAMPAIGN
	public static String ACTION_CRMCLTSEARCHCAMPAIGN = "/CRMCLTSearchCampaign";

	// RESULT_CAMPAIGNSEARCHSO
	public static String RESULT_CAMPAIGNSEARCHSO = "RESULT_CampaignSearchSO";

	//	RESULT_CAMPAIGNSEARCHLIST
	public static String RESULT_CAMPAIGNSEARCHLIST =
		"RESULT_CampaignSearchList";

	// ACTION_CRMCLTSAVECAMPAIGNAS
	public static String ACTION_CRMCLTSAVECAMPAIGNAS = "/CRMCLTSaveCampaignAs";

	// ACTION_CRMCLTDELETECAMPAIGN
	public static String ACTION_CRMCLTDELETECAMPAIGN = "/CRMCLTDeleteCampaign";

	// ACTION_CRMCLTSHOWAPPROVALFIELDS
	public static String ACTION_CRMCLTSHOWAPPROVALFIELDS =
		"/CRMCLTShowApprovalFields";

	// ACTION_CRMCLTGETTEAMSFORRESOURCEIDS
	public static String ACTION_CRMCLTGETTEAMSFORRESOURCEIDS =
		"/CRMCLTGetTeamsForResourceIds";

	//	RESULT_RESOURCEIDLIST
	public static String RESULT_RESOURCEIDLIST = "RESULT_ResourceIdList";

	// RESULT_CAMPAIGNAPPROVALSO
	public static String RESULT_CAMPAIGNAPPROVALSO =
		"RESULT_CampaignApprovalSO";

	//RESULT_CAMPAIGNAPPROVALSO
	public static String RESULT_TEAMSFORRESOURCEIDS =
		"RESULT_TeamsForResourceIds";

	// ACTION_CRMCLTVIEWCOMMENTS
	public static String ACTION_CRMCLTVIEWCOMMENTS = "/CRMCLTViewComments";

	//ACTION_CRMCLTVIEWTEAMMEMBERS
	public static String ACTION_CRMCLTVIEWTEAMMEMBERS =
		"/CRMCLTViewTeamMembers";

	// RESULT_CAMPAIGNAPPROVALHISTORYSO
	public static String RESULT_CAMPAIGNAPPROVALHISTORYSO =
		"RESULT_CampaignApprovalHistorySO";

	//RESULT_CAMPAIGNAPPROVALHISTORYSO
	public static String RESULT_CAMPAIGNAPPROVALHISTORYLIST =
		"RESULT_CampaignApprovalHistoryLIST";

	// SEARCH_CAMPAIGNAPPROVALHISTORYSO
	public static String SEARCH_CAMPAIGNAPPROVALHISTORYSO =
		"SEARCH_CampaignApprovalHistorySO";

	// ACTION_CRMCLTCAMPAIGNAPPROVAL
	public static String ACTION_CRMCLTCAMPAIGNAPPROVAL =
		"/CRMCLTCampaignApproval";

	// ACTION_CRMCLTCANCELCAMPAIGNAPPROVAL
	public static String ACTION_CRMCLTCANCELCAMPAIGNAPPROVAL =
		"/CRMCLTCancelCampaignApproval";

	// ACTION_CRMCLTCALCELSEARCH
	public static String ACTION_CRMCLTCANCELSEARCH = "/CRMCLTCancelSearch";

	//	ACTION_CRMEXECUTEBATCHORDER
	public static String ACTION_CRMEXECUTEGROUPPURCHASE =
		"/CRMExecuteGroupPurchase";

	//	ACTION_CRMEXECUTECROSSORDER
	public static String ACTION_CRMEXECUTECROSSORDER = "/CRMExecuteCrossOrder";

	//Constants for default combo box value
	public static String INPUT_NOTSELECTED = "-1";

	//RESULT_APPROVALSTATUS
	//Whether the user has approved/rejected
	public static String RESULT_APPROVALSTATUS = "RESULT_APPROVALSTATUS";

	public static String CAMPAIGNNO_SEARCH = "number";

	public static String CAMPAIGNDETAILS_SEARCH = "details";

	/**
	 * Constants for  Workflow
	 */
	public static String ROUTINGCRITERIA_APPROVED = "APPROVED";
	public static String ROUTINGCRITERIA_COMPLETED = "COMPLETED";
	public static String ROUTINGCRITERIA_REJECTED = "REJECTED";
	public static String NOTIFICATIONID_APPROVED = "CRM_1001";
	public static String NOTIFICATIONID_APPROVED_CHANNELBOOKING = "CRM_1008";
	public static String NOTIFICATIONID_REJECTED = "CRM_1002";
	public static String HASHMAPKEY_CAMPAIGNNO = "CAMPAIGNNUMBER";
	public static String HASHMAPKEY_SCHEDULEID = "SCHEDULEID";
	public static String WORKFLOWMESSAGE_APPROVAL =
		"A camplaign plan requires your approval";
	public static String WORKFLOWMESSAGE_COMPLETION =
		"Camplaign plan approval completed by user";
	public static String WORKFLOWMESSAGE_REJECTION = "";

	public static String WORKFLOWMESSAGE_NEWACTIVITY =
		"A new campaign activity has been assigned to you";

	/**
	 * Constants for  Status
	 */
	public static int CAMPAIGNSTATUS_DRAFT = 4113;
	public static int CAMPAIGNSTATUS_PENDINGFORAPPROVAL = 4114;
	public static int CAMPAIGNSTATUS_APPROVED = 4115;
	public static int CAMPAIGNSTATUS_REJECTED = 4116;
	public static int CAMPAIGNSTATUS_ONHOLD = 4117;
	public static int CAMPAIGNSTATUS_CANCELLED = 4118;
	public static int CAMPAIGNSTATUS_ONGOING = 4119;
	public static int CAMPAIGNSTATUS_COMPLETED = 4120;
	public static int CAMPAIGNSTATUS_PENDINGWITHOUTRESOURCE = 9999;
	public static int CAMPAIGNSTATUS_WITHOUTRESOURCEAPPROVED = 9998;
	//Constants for holding the currect work flow tasks
	public static String CAMPAIGNAPPROVAL_TEAMMANAGER =
		"CRM_CAMPAIGN_APPROVAL_TEAMMANAGER";
	public static String CAMPAIGNAPPROVAL_SUPERVISOR =
		"CRM_CAMPAIGN_APPROVAL_SUPERVISOR";
	public static String CAMPAIGNACTIVITY = "CRM_CAMPAIGNACTIVITY";

	//constants for holding the approval status flags.
	public static String INPUT_STATUSPENDING = "T";
	public static String INPUT_STATUSAPPROVED = "A";
	public static String INPUT_STATUSREJECTED = "R";
	public static String INPUT_STATUSPENDINGWITHOUTRESOURCE = "N";

	/**
	 * Constants for Option : CRMCMDSearchParentCampaign
	 */
	//	   ACTION_CRMCMDSEARCHPARENTCAMPAIGN
	public static String ACTION_CRMCMDSEARCHPARENTCAMPAIGN =
		"/CRMCMDSearchParentCampaign";

	/**
	 * Constants for Option : CRMPCSSearchCampaign
	 */
	//	   ACTION_CRMPCSSEARCHCAMPAIGN
	public static String ACTION_CRMPCSSEARCHCAMPAIGN = "/CRMPCSSearchCampaign";

	//	   RESULT_CAMPAIGNSEARCHRESULTSO
	public static String RESULT_CAMPAIGNSEARCHRESULTSO =
		"RESULT_CampaignSearchResultSO";

	//	   SEARCH_CAMPAIGNSEARCHRESULTSO
	public static String SEARCH_CAMPAIGNSEARCHRESULTSO =
		"SEARCH_CampaignSearchResultSO";

	/**
	 * Constants for Option : CRMPCSChooseCampaign
	 */
	//	   ACTION_CRMPCSCHOOSECAMPAIGN
	public static String ACTION_CRMPCSCHOOSECAMPAIGN = "/CRMPCSChooseCampaign";

	/**
	 * Constants for Option : CRMCONOnload
	 */
	//	   ACTION_CRMCONONLOAD
	public static String ACTION_CRMCONONLOAD = "/CRMCONOnload";

	//	   RESULT_CONTACTMEDIASO
	public static String RESULT_CONTACTMEDIASO = "RESULT_ContactMediaSO";

	/**
	 * Constants for Option : CRMCONSaveContactMedia
	 */
	//	   ACTION_CRMCONSAVECONTACTMEDIA
	public static String ACTION_CRMCONSAVECONTACTMEDIA =
		"/CRMCONSaveContactMedia";

	/**
	 * Constants for Option : CRMCONAnnounceCampaign
	 */
	//	   ACTION_CRMCONANNOUNCECAMPAIGN
	public static String ACTION_CRMCONANNOUNCECAMPAIGN =
		"/CRMCONAnnounceCampaign";
	
   //(2007/4/9) Amanda : CR-1081
	/**
	 * Constants for Option : CRMCMDGetExclusiveType
	 */
	public static String ACTION_CRMCMDGETEXCLUSIVETYPE =
		"/CRMCMDGetExclusiveType";
	
	/**
	 * INPUT_EXCLUSIVE_TYPE
	 */
	public static String INPUT_EXCLUSIVE_TYPE = "EXCLUSIVETYPE";
	

	public static String ANNOUNCE_CAMPAIGN_BATCH_ID = "CRM_007";

	public static long ANNOUNCE_CAMPAIGN_PARAMETER_1 = 1001;

	public static long ANNOUNCE_CAMPAIGN_PARAMETER_2 = 1002;

	public static String REFERENCETYPE_CAMPAIGN = "4602";

	/**
	 * Constants for Option : CRMCMDShowMessageHistory
	 */
	//	   ACTION_CRMCMDSHOWMESSAGEHISTORY
	public static String ACTION_CRMCMDSHOWMESSAGEHISTORY =
		"/CRMCMDShowMessageHistory";

	/**
	 * Constants for Option : CRMMSHOnload
	 */
	//	   ACTION_CRMMSHONLOAD
	public static String ACTION_CRMMSHONLOAD = "/CRMMSHOnload";

	//	   RESULT_MESSAGEHISTORYSO
	public static String RESULT_MESSAGEHISTORYSO = "RESULT_MessageHistorySO";

	//	   SEARCH_MESSAGEHISTORYSO
	public static String SEARCH_MESSAGEHISTORYSO = "SEARCH_MessageHistorySO";

	/******************************************
	 * CONTACT MEDIA CONSTANTS  BEGINS
	 *******************************************/
	public static String INPUT_CAMPAIGNNO = "INPUT_CAMPAIGNNO";

	public static String MEDIATYPE_OUTBOUNDCALL = "4151";

	public static String ANNOUNCEMENTSTATUS_ANNOUNCED = "4149";

	public static String MEDIATYPE_FAX = "4154";

	public static String MEDIATYPE_EMAIL = "4153";

	public static String MEDIATYPE_POST = "4152";

	public static String CAMPAIGNCONTACTMEDIA_TABLE_NAME =
		"TCRM_CAMPAIGNCONTACTMEDIA";

	public static String MEDIATYPE_SMS = "4150";

	public static String RESULT_CONTACTSTATISTICSSO =
		"RESULT_ContactStatisticsSO";

	public static String ACTION_CRMCONCANCEL = "/CRMCONCancel";

	public static String ANNOUNCEMENTSTATUS_PENDING = "4148";

	public static String ANNOUNCEMENTSTATUS_DRAFT = "4147";

	public static String NO_OF_MEDIA_TYPES = "5";

	public static String FLAG_SMS = "smsFlag";

	public static String FLAG_OUTBOUNDCALL = "callFlag";

	public static String FLAG_EMAIL = "emailFlag";

	public static String FLAG_POST = "postFlag";

	public static String FLAG_FAX = "faxFlag";

	public static String CBX_DEFAULT_VALUE = "on";

	public static String BATCH_ID = "abcdef";

	public static String TABLE_TCRM_CMPGNAREACODEDEFINITION =
		"TCRM_CMPGNAREACODEDEFINITION";

	public static String BUFFER_SIZE = "128";

	/*
	 * INTEGER CONSTANTS FOR CONTACT MEDIA TYPE DOMAIN VALUES
	 */
	public static int CONTACTMEDIA_SMS = 4150;
	public static int CONTACTMEDIA_OUTBOUNDCALL = 4151;
	public static int CONTACTMEDIA_POST = 4152;
	public static int CONTACTMEDIA_EMAIL = 4153;
	public static int CONTACTMEDIA_FAX = 4154;

	/*
	 * CustomerMessageDBO
	 */
	public static String CUSTOMERMESSAGEDBO_PATH =
		"ehsn.et1.bc.crm.batch.vo.CustomerMessageDBO";
	/*
	 * CustomerMessageListDBO
	 */
	public static String CUSTOMERMESSAGELISTDBO_PATH =
		"ehsn.et1.bc.crm.batch.vo.CustomerMessageListDBO";
	/*
	 * 	CustomerMessageObjDBO
	 */
	public static String CUSTOMERMESSAGEOBJDBO_PATH =
		"ehsn.et1.bc.crm.batch.vo.CustomerMessageObjDBO";

	/****************************************
	 * CAMPAIGN BATCH EXECUTION CONSTANTS BEGINS
	 *****************************************/


	/*
	 * CustomerProductDBO
	 */
	public static String CUSTOMERPRODUCTDBO_PATH =
		"ehsn.et1.bc.crm.batch.vo.CustomerProductDBO";
	/*
	 * CustomerProductNTDBO
	 */
	public static String CUSTOMERPRODUCTNTDBO_PATH =
		"ehsn.et1.bc.crm.batch.vo.CustomerProductNTDBO";
	/*
	 * 	OtcrmCustomerproduct
	 */
	public static String OTCRMCUSTOMERPRODUCTDBO_PATH =
		"ehsn.et1.bc.crm.batch.vo.OtcrmCustomerproduct";

	/*
	 * OfferProductIdListDBO
	 */
	public static String OFFERPRODUCTIDLISTDBO_PATH =
		"ehsn.et1.bc.crm.batch.vo.OfferProductIdListDBO";
	/*
	 * 	OfferProductListDBO
	 */
	public static String OFFERPRODUCTLISTDBO_PATH =
		"ehsn.et1.bc.crm.batch.vo.OfferProductListDBO";


	/****************************************
	 * AREA CODE DEFINITION CONSTANTS BEGINS
	 *****************************************/

	/**
	 * Constants for Option : CRMCMDDefineAreaCode
	 */
	//		   ACTION_CRMCMDDEFINEAREACODE
	public static String ACTION_CRMCMDDEFINEAREACODE = "/CRMCMDDefineAreaCode";

	/**
	 * Constants for Option : CRMACDOnload
	 */
	//		   ACTION_CRMACDONLOAD
	public static String ACTION_CRMACDONLOAD = "/CRMACDOnload";

	//		   RESULT_AREACODEDEFINITIONSO
	public static String RESULT_AREACODEDEFINITIONSO =
		"RESULT_AreaCodeDefinitionSO";

	//		   SEARCH_AREACODEDEFINITIONSO
	public static String SEARCH_AREACODEDEFINITIONSO =
		"SEARCH_AreaCodeDefinitionSO";

	/**
	 * Constants for Option : CRMACDAddAreaCode
	 */
	//		   ACTION_CRMACDADDAREACODE
	public static String ACTION_CRMACDADDAREACODE = "/CRMACDAddAreaCode";

	/**
	 * Constants for Option : CRMACDSaveNewAreaCode
	 */
	//		   ACTION_CRMACDSAVENEWAREACODE
	public static String ACTION_CRMACDSAVENEWAREACODE =
		"/CRMACDSaveNewAreaCode";

	/**
	 * Constants for Option : CRMACDEditAreaCode
	 */
	//		   ACTION_CRMACDEDITAREACODE
	public static String ACTION_CRMACDEDITAREACODE = "/CRMACDEditAreaCode";

	/**
	 * Constants for Option : CRMACDSaveExistingAreaCode
	 */
	//		   ACTION_CRMACDSAVEEXISTINGAREACODE
	public static String ACTION_CRMACDSAVEEXISTINGAREACODE =
		"/CRMACDSaveExistingAreaCode";

	/**
	 * Constants for Option : CRMACDCancelAreaCodeDef
	 */
	//		   ACTION_CRMACDCANCELAREACODEDEF
	public static String ACTION_CRMACDCANCELAREACODEDEF =
		"/CRMACDCancelAreaCodeDef";

	/**
	 * Constants for Option : MODIFY_MODE_FLAG
	 */

	/**
	 * Constants for Option : CRMACDDeleteAreaCode
	 */
	//		   ACTION_CRMACDDELETEAREACODE
	public static String ACTION_CRMACDDELETEAREACODE = "/CRMACDDeleteAreaCode";

	//		SEARCH_AREACODEDEFINITIONSO
	public static String AREACODE_LIST = "AreaCode_List";
	//store area code id
	public static String AREACODEID = "AreaCode_ID";

	public static String DETAILS_AREACODEDEFINITIONSO =
		"Details_AreaCodeDefinitionSO";

	public static String INDEX_DELIMITER = "~";

	public static int START_END_DATE_FLAG = 1;

	public static String INPUT_AREACODESECTIONDISPLAY = "AreaCodeDisplay";

	public static String EDIT_MODE = "E";

	/* Area Code Definition Constants  Ends*/

	public static String YEARALLVALUE = "";

	public static String YEARALLLABEL = "ALL";

	/* PARENT CAMPAIGN CONSTANTS END */

	/*******************************************
	 * CAMPAIGN PLANNING - CAMPAIGN DETAILS *
	 *******************************************/

	/**
	 * Constants for Option : CRMCLDAddCampaign
	 */
	//	   ACTION_CRMCLDADDCAMPAIGN
	public static String ACTION_CRMCLDADDCAMPAIGN = "/CRMCLDAddCampaign";

	//	   RESULT_BUDGETRESOURCELISTSO
	public static String RESULT_BUDGETRESOURCETEAMMAP =
		"RESULT_BudgetResourceTeamMap";

	/**
	 * Constants for Option : CRMCLDEditCampaign
	 */
	//	   ACTION_CRMCLDEDITCAMPAIGN
	public static String ACTION_CRMCLDEDITCAMPAIGN = "/CRMCLDEditCampaign";

	//	   RESULT_CAMPAIGNDETAILSSO
	public static String RESULT_CAMPAIGNDETAILSSO = "RESULT_CAMPAIGNDETAILSSO";

	//		List of Budget Resources
	public static String RESULT_BUDGETRESOURCELIST =
		"RESULT_BudgetResourceList";

	//	List of Selected Marketing Teams
	public static String RESULT_SELECTEDTEAMLIST = "RESULT_SelectedTeamList";

	//Holds the initial value of the campaignMode
	public static String RESULT_ORIGINALSO = "RESULT_OriginalSO";

	/**
	 * Constants for Option : CRMCMDCampaignTypeChange
	 */
	// ACTION_CRMCMDCAMPAIGNTYPECHANGE
	public static String ACTION_CRMCMDCAMPAIGNTYPECHANGE =
		"/CRMCMDCampaignTypeChange";

	// RESULT_COUPONGROUPSO
	public static String RESULT_COUPONGROUPSO = "RESULT_CouponGroupSO";

	// INPUT_CAMPAIGNTYPE
	public static String INPUT_CAMPAIGNTYPE = "INPUT_CampaignType";

	// NORMAL CAMPAIGN
	public static String NORMALCAMPAIGN = "4101";
	public static int CAMPAIGNTYPE_NORMAL = 4101;

	// LOTTERY CAMPAIGN
	public static String LOTTERYCAMPAIGN = "4102";
	public static int CAMPAIGNTYPE_LOTTERY = 4102;

	// LIVE PROMOTION CAMPAIGN
	public static String LIVEPROMOTION = "4103";
	public static int CAMPAIGNTYPE_LIVEPROMOTION = 4103;
	// DISCOUNT COUPONS CAMPAIGN
	public static String DISCOUNTCOUPONCAMPAIGN = "4104";
	public static int CAMPAIGNTYPE_DISCOUNTCOUPON = 4104;

	// REFERENCE CAMPAIGN
	public static String REFERENCECAMPAIGN = "4105";
	public static int CAMPAIGNTYPE_REFERENCE = 4105;

	//REPEAT TYPE FOR NORMAL CAMPAIGNS
	public int DONOTREPEAT = 4121;
	public int REPEAT_BYMINUTES = 4122;
	public int REPEAT_BYHOURS = 4123;
	public int REPEAT_BYDAYS = 4124;
	public int REPEAT_BYWEEKS = 4125;
	public int REPEAT_BYMONTHS = 4126;
	public int REPEAT_BYYEARS = 4127;

	//DURATION TYPES FOR NORMAL CAMPAIGNS
	public int DURATION_MINUTES = 4131;
	public int DURATION_HOURS = 4132;
	public int DURATION_DAYS = 4133;
	public int DURATION_WEEKS = 4134;
	public int DURATION_MONTHS = 4135;
	public int DURATION_YEARS = 4136;

	//SPECIFIER TYPES FOR NORMAL CAMPAIGNS
	public int SPECIFIERUNIT_MONTH = 4137;
	public int SPECIFIERUNIT_WEEKNO = 4138;
	public int SPECIFIERUNIT_WEEKDAY = 4139;
	public int SPECIFIERUNIT_DAY = 4141;
	public int SPECIFIERUNIT_HOUR = 4142;
	public int SPECIFIERUNIT_MINUTE = 4143;

	public String SCHEDULEGENERATOR_BATCHDAO =
		"ehsn.et1.db.crm.batch.dao.CampaignScheduleGeneratorBatchDAO";

	public String SCHEDULEGENERATOR_BATCHID = "CRM_016";
	public int SCHEDULEGENERATOR_BATCHPARAM1 = 1001;

	/**
	 * Constants for Option : CRMCMDGetTeamsForBudgetResource
	 */
	// ACTION_CRMCMDGETTEAMSFORBUDGETRESOURCE
	public static String ACTION_CRMCMDGETTEAMSFORBUDGETRESOURCE =
		"/CRMCMDGetTeamsForBudgetResource";

	// RESULT_MARKETINGTEAMLIST
	public static String RESULT_MARKETINGTEAMLIST = "RESULT_MarketingTeamList";

	/**
	 * Constants for Option : CRMCMDAddScheduleRow
	 */
	// ACTION_CRMCMDADDSCHEDULEROW
	public static String ACTION_CRMCMDADDSCHEDULEROW = "/CRMCMDAddScheduleRow";

	/**
	 * Constants for Option : CRMCMDRemoveScheduleRow
	 */
	// ACTION_CRMCMDREMOVESCHEDULEROW
	public static String ACTION_CRMCMDREMOVESCHEDULEROW =
		"/CRMCMDRemoveScheduleRow";

	/**
	 * Constants for Option : CRMCMDDiscountGroupNumberOnChange
	 */
	// ACTION_CRMCMDDISCOUNTGROUPNUMBERONCHANGE
	public static String ACTION_CRMCMDDISCOUNTGROUPNUMBERONCHANGE =
		"/CRMCMDDiscountGroupNumberOnChange";

	/**
	 * Constants for Option : CRMCMDKeepCampaignOnHold
	 */
	//  ACTION_CRMCMDCAMPAIGNSTATUSCHANGE
	public static String ACTION_CRMCMDCAMPAIGNSTATUSCHANGE =
		"/CRMCMDCampaignStatusChange";

	public static char APPROVALSTATUS_INITIATED = 'I';
	public static char APPROVALSTATUS_TRIGGERED = 'T';
	public static char APPROVALSTATUS_TRIGGEREDWITHOUTRESOURCE = 'N';

	//  ACTION_CRMCMCSTATUSCHANGEAPPROVAL
	public static String ACTION_CRMCMCSTATUSCHANGEAPPROVAL =
		"/CRMCMCStatusChangeApproval";

	public static String KEEPONHOLD = "KeepOnHold";

	public static String RESUMECAMPAIGN = "Resume";

	public static String CANCELCAMPAIGN = "CancelCampaign";

	// ACTION_VIEWSCHEDULEDATES
	public String ACTION_VIEWSCHEDULEDATES = "/CRMCMDViewScheduleDates";

	// ACTION_VIEWSCHEDULEDATESOK
	public String ACTION_VIEWSCHEDULEDATESOK = "/CRMCMDViewScheduleDatesOk";

	// RESULT_CAMPAIGNSCHEDULEDATESLIST
	public String RESULT_CAMPAIGNSCHEDULEDATESLIST =
		"RESULT_CAMPAIGNSCHEDULEDATESLIST";

	//	INPUT_CAMPAIGNSCHEDULEDATESSEARCHSO
	 public String INPUT_CAMPAIGNSCHEDULEDATESSEARCHSO =
		 "INPUT_CAMPAIGNSCHEDULEDATESSEARCHSO";

	// INPUT_CLOSESCHEDULEDATES
	public String INPUT_CLOSESCHEDULEDATES = "INPUT_CLOSESCHEDULEDATES";

	/**
	 * Constants for Option : CRMCMDOnSelectCustomerSearch
	 */
	// ACTION_CRMCMDONSELECTCUSTOMERSEARCH
	public static String ACTION_CRMCMDONSELECTCUSTOMERSEARCH =
		"/CRMCMDOnSelectCustomerSearch";

	// RESULT_MEMBERSHIPLEVELLISTSO
	public static String RESULT_MEMBERSHIPADDRESS1LISTSO =
		"RESULT_MembershipAddress1ListSO";

	//	Constant to show the Search section
	public static String CUSTOMER_SEARCH = "S";

	//	Constant to show the Import section
	public static String CUSTOMER_IMPORT = "I";

	//	ACTION_CRMCMDVIEWINFO
	public static String ACTION_CRMCMDVIEWINFO = "/CRMCMDViewInfo";

	// RESULT_IMPORTEDCUSTOMER
	public static String RESULT_IMPORTEDCUSTOMER = "ViewImportSearchCriteria";

	/**
	 * Constants for Option : CRMCMDImportCustomerInformation
	 */
	// ACTION_CRMCMDIMPORTCUSTOMERINFORMATION
	public static String ACTION_CRMCMDIMPORTCUSTOMERINFORMATION =
		"/CRMCMDImportCustomerInformation";

	/**
	 * Constants for Option : CRMCMDChooseAction
	 */
	// ACTION_CRMCMDCHOOSEACTION
	public static String ACTION_CRMCMDCHOOSEACTION = "/CRMCMDChooseAction";

	/**
	 * Constants for Option : CRMCMDSaveCampaignPlanAsDraft
	 */
	//	   ACTION_CRMCMDSAVECAMPAIGNPLANASDRAFT
	public static String ACTION_CRMCMDSAVECAMPAIGNPLANASDRAFT =
		"/CRMCMDSaveCampaignPlanAsDraft";

	// SEQ_CAMPAIGNNO
	public static String SEQ_CAMPAIGNNO = "S_CAMPAIGNPLAN";

	//	SEQ_CAMPAIGNSERIALNO
	public static String SEQ_CAMPAIGNSERIALNO = "S_CAMPAIGNSERIALNO";

	//	SEQ_PARENTCAMPAIGN
	public static String SEQ_PARENTCAMPAIGN = "S_PARENTCAMPAIGN";

	//	SEQ_CHILDCAMPAIGN
	public static String SEQ_CHILDCAMPAIGN = "S_CHILDCAMPAIGN";

	//	SEQ_SEARCHCRITERIANO
	public static String SEQ_SEARCHCRITERIANO = "S_CUSTOMERSEARCHCRITERIA";

	// PARENT
	public static String PARENT = "P";

	// CHILD
	public static String CHILD = "C";

	//	DISCOUNT_BOOKLET
	public static String DISCOUNT_SERIAL = "1001";

	//	DISCOUNT_COUPON
	public static String DISCOUNT_NOSERIAL = "1002";

	//	DISCOUNT_COUPON
	public static String DISCOUNT_BOOKLET = "1003";
	
	//	DISCOUNT_COUPON
	public static String DISCOUNT_ELECTRONIC = "1004";

	//	DISCOUNTTYPE_BOOKLET
	public static String DISCOUNTTYPE_BOOKLET = "booklet";

	//	DISCOUNTTYPE_COUPON
	public static String DISCOUNTTYPE_COUPON = "coupon";

	// SEARCH_TARGETCUSTOMER
	public static String SEARCH_TARGETCUSTOMER = "SEARCH";

	/**
	 * Constants for Option : CRMCMDSaveBudgetResource
	 */
	//	   ACTION_CRMCMDSAVEBUDGETRESOURCE
	public static String ACTION_CRMCMDSAVEBUDGETRESOURCE =
		"/CRMCMDSaveBudgetResource";

	/**
	 * Constants for Option : CRMCMDSubmitCampaign
	 */
	//	   ACTION_CRMCMDSUBMITCAMPAIGN
	public static String ACTION_CRMCMDSUBMITCAMPAIGN = "/CRMCMDSubmitCampaign";

	//ACTION_CRMCMDUPLOADTARGETCUSTOMERS
	public static String ACTION_CRMCMDUPLOADTARGETCUSTOMERS =
		"/CRMCMDUploadTargetCustomers";

	// Constants for the current security tasks
	public static String TASK_TEAMLEAD = "CRM_CAMPAIGNPLANNING";

	public static String TASK_TEAMMANAGER = "CRM_CAMPAIGNPLANNING_TEAMMANAGER";

	public static String TASK_SUPERVISOR = "CRM_CAMPAIGNPLANNING_SUPERVISOR";

	/**
	 * Constants for Option : CRMCMDCancelCampaignDetails
	 */
	//	   ACTION_CRMCMDCANCELCAMPAIGNDETAILS
	public static String ACTION_CRMCMDCANCELCAMPAIGNDETAILS =
		"/CRMCMDCancelCampaignDetails";

	//Constants required for the Actions drop down in the jsp
	public static int ACTIVITIES = 1001;
	public static int TEAM = 1002;
	public static int CHANNELBOOKING = 1003;
	public static int VIEWCALENDAR = 1004;
	public static int CRITERIA = 1005;
	public static int TARGET = 1006;
	public static int LOTTERYDEFINITION = 1007;

	//Constants required for the camapign workflow part
	public static String SUBMIT = "SUBMIT";
	public static String KEEPONHOLDCMPGN = "KEEPONHOLD";
	public static String CANCELCMPGN = "CANCELCAMPAIGN";
	public static String RESUME = "RESUME";

	/**
	 * Constants for Option : CRMCMDDefineContactMedia
	 */
	//	   ACTION_CRMCMDDEFINECONTACTMEDIA
	public static String ACTION_CRMCMDDEFINECONTACTMEDIA =
		"/CRMCMDDefineContactMedia";

	//IMPORTCAMPAIGNTARGETS_BATCH_DAO
	public static String IMPORTCAMPAIGNTARGETS_BATCH_DAO =
		"ehsn.et1.db.crm.batch.dao.ImportCampaignTargetCustomersBatchDAO";

	//CAMPAIGN_IMPORT_PARAMID
	public static int CAMPAIGN_IMPORT_PARAMID1 = 1001;

	//CAMPAIGN_IMPORT_PARAMID
	public static int CAMPAIGN_IMPORT_PARAMID2 = 1002;

	public static String CAMPAIGN_IMPORT_FILENAME = "CampaignTargetCustomers_";

	public static String CAMPAIGN_IMPORT_ERRORFILENAME =
		"ErrorLog_CampaignTargetCustomers_";

	public static String CAMPAIGN_IMPORT_BATCHID = "CRM_012";

	public static String CampaignOffer_BATCHDAO_NAME =
		"ehsn.et1.db.crm.batch.dao.CampaignOfferBatchDAO";

	public static int CAMPAIGN_OFFER_PARAMETER_1 = 1001;

	public static int CAMPAIGN_OFFER_PARAMETER_2 = 1002;

	//Constants to set focus on screen refresh
	public String INPUT_REFRESHMODE = "INPUT_REFRESHMODE";
	public String INPUT_REFRESHMODE_TYPECHANGE = "TypeChange";
	public String INPUT_REFRESHMODE_TARGETCUSTOMER = "TargetCustomerMode";
	public String INPUT_REFRESHMODE_GETTEAMS = "GetTeamsForBR";
	public String INPUT_REFRESHMODE_ADDROW = "AddSpecifierRow";

	/**
	 * Targets Excel Generation Batch
	 */

	//IMPORTCAMPAIGNTARGETS_BATCH_DAO
	public static String TARGETSEXCELGEN_BATCH_DAO =
		"ehsn.et1.db.crm.batch.dao.CampaignTargetsExcelGenerationBatchDAO";

	public static String CAMPAIGNTARGETSEXCELFILENAME =
		"CampaignTargetsExcel_";

	public static String CAMPAIGNTARGETSEXCELSHEETNAME =
		"Campaign Targets Sheet ";

	public static int TARGETEXCEL_ROWLIMIT = 65000;

	/*******************************************
	 * CAMPAIGN ACTIVITY CONSTANTS BEGINS      *
	 *******************************************/
	/**
	 * Constants for Option : CRMCALOnload
	 */
	//	   ACTION_CRMCALONLOAD
	public static String ACTION_CRMCALONLOAD = "/CRMCALOnload";

	//	   RESULT_CAMPAIGNACTIVITYDETAILSSO
	public static String RESULT_CAMPAIGNACTIVITYDETAILSSO =
		"RESULT_CampaignActivityDetailsSO";

	//	   SEARCH_CAMPAIGNACTIVITYDETAILSSO
	public static String SEARCH_CAMPAIGNACTIVITYDETAILSSO =
		"SEARCH_CampaignActivityDetailsSO";

	/**
	 * Constants for Option : CRMCALNewActivity
	 */
	//	   ACTION_CRMCALNEWACTIVITY
	public static String ACTION_CRMCALNEWACTIVITY = "/CRMCALNewActivity";

	/**
	 * Constants for Option : CRMCADSaveActivityUpdate
	 */
	//	   ACTION_CRMCADSAVEACTIVITYUPDATE
	public static String ACTION_CRMCADSAVEACTIVITYUPDATE =
		"/CRMCADSaveActivityUpdate";

	/**
	  * Constants for Option : CRMCADSaveActivityInsert
	  */
	//		ACTION_CRMCADSAVEACTIVITYUPDATE
	public static String ACTION_CRMCADSAVEACTIVITYINSERT =
		"/CRMCADSaveActivityInsert";

	/**
	 * Constants for Option : CRMCADCancel
	 */
	//	   ACTION_CRMCADCANCEL
	public static String ACTION_CRMCADCANCEL = "/CRMCADCancel";

	/**
	 * Constants for Option : CRMCADCampaignTeam
	 */
	//	   ACTION_CRMCADCAMPAIGNTEAM
	public static String ACTION_CRMCADCAMPAIGNTEAM = "/CRMCADCampaignTeam";

	/**
	 * Constants for Option : CRMCALDeleteActivity
	 */
	//	   ACTION_CRMCALDELETEACTIVITY
	public static String ACTION_CRMCALDELETEACTIVITY = "/CRMCALDeleteActivity";

	/**
	 * Constants for Option : CRMCALEditActivity
	 */
	//	   ACTION_CRMCALEDITACTIVITY
	public static String ACTION_CRMCALEDITACTIVITY = "/CRMCALEditActivity";

	// ACTION_FAILED

	public static String FAILED = "FAILED";

	// COOWNER FLAG

	public static String COOWNER = "Y";

	public static char ACTIVITYEDITMODE = 'U';

	public static char COOWNERMEMBER = 'Y';

	public static char ACTIVITYMEMBER = 'N';

	public static String PREDECESSORACTIVITYIDS = "PredecessorActivityIds";

	public static String CAMPAIGN_TEAM_CLICK = "CampaignTeamClick";

	public static String CAMPAIGN_TEAM_LIST = "CampaignTeamList";

	public static String CAMPAIGN_OWNER = "OWNER";

	public static String CAMPAIGN_MEMBER = "MEMBER";

	public static String CAMPAIGN_RESPPERSON = "RESPPERSON";

	public static String TABLE_TCRM_CAMPAIGNACTIVITYDETAILS =
		"TCRM_CAMPAIGNACTIVITYDETAILS";

	public static String STRING_TOKEN = ";";

	public static int ACTIVITY_END_DATE_FLAG = 1;

	public static int PRDECESSOR_ACTIVITY_DATE_FLAG = 2;

	public static String MODIFY_MODE_FLAG = "MODIFY";

	public static char SETALARM = 'N';

	public static String MINUTE_ZEROVALUE = "50";

	public static String HOUR_ZEROVALUE = "24";

	//	RESULT_CAMPAIGNACTIVITYDETAILSSO
	public static String DETAILS_CAMPAIGNACTIVITYDETAILSSO =
		"DETAILS_CampaignActivityDetailsSO";

	/**
	 * Constants for Option : CRMATMOnload
	 */
	//	   ACTION_CRMATMONLOAD
	public static String ACTION_CRMATMONLOAD = "/CRMATMOnload";

	/**
	 * Constants for Option : CRMATMSaveTeamMember
	 */
	//	   ACTION_CRMATMSAVETEAMMEMBER
	public static String ACTION_CRMATMSAVETEAMMEMBER = "/CRMATMSaveTeamMember";

	/**
	 * Constants for Option : CRMCALCampaignDetails
	 */
	//	   ACTION_CRMCALCAMPAIGNDETAILS
	public static String ACTION_CRMCALCAMPAIGNDETAILS =
		"/CRMCALCampaignDetails";

	/**
	 * Constants for Option : CRMCALCancel
	 */
	//	   ACTION_CRMCALCANCEL
	public static String ACTION_CRMCALCANCEL = "/CRMCALCancel";

	public String CAMPAIGNOFFER_BATCHID = "CRM_011";

	public int CAMPAIGNOFFER_BATCHPARAM1 = 1001;

	public int CAMPAIGNOFFER_BATCHPARAM2 = 1002;

	public String LOTTERYELIGIBLECUSTOMERS_BATCHID = "CRM_022";

	public int LOTTERYELIGIBLECUSTOMERS_BATCHPARAM1 = 1001;

	/**
	 * Constants for Option : CRMCALViewActivityGraph
	 */
	//	   ACTION_CRMCALVIEWACTIVITYGRAPH
	public static String ACTION_CRMCALVIEWACTIVITYGRAPH =
		"/CRMCALViewActivityGraph";

	//	   RESULT_ACTIVITYTIMELINESO
	public static String RESULT_ACTIVITYTIMELINESO =
		"RESULT_ActivityTimelineSO";
	//MAIL_NEWCAMPAIGNACTIVITY
	public static String MAIL_NEWCAMPAIGNACTIVITY = "CRM_0009";

	//MAIL_CAMPAIGNACTIVITYCHANGED
	public static String MAIL_CAMPAIGNACTIVITYCHANGED = "CRM_0008";

	//MAIL_CAMPAIGNACTIVITYREMOVED
	public static String MAIL_CAMPAIGNACTIVITYREMOVED = "CRM_0010";

	//ACTIVITYNAME
	public static String ACTIVITYNAME = "ACTIVITYNAME";

	//CAMPAIGNNAME
	public static String CAMPAIGNNAME = "CAMPAIGNNAME";

	//CAMPAIGNNO
	public static String CAMPAIGN_NO = "CAMPAIGNNO";

	//MAPKEY_RESPONSIBLEPERSON
	public static String MAPKEY_RESPONSIBLEPERSON = "RESPONSIBLEPERSON";

	//MAPKEY_COOWNERLIST
	public static String MAPKEY_COOWNERLIST = "OWNERMEMBERLIST";

	//MAPKEY_ACTIVITYMEMBERSLIST
	public static String MAPKEY_ACTIVITYMEMBERSLIST = "ACTIVITYMEMBERSLIST";

	//MAPKEY_ACTIVITYNAME
	public static String MAPKEY_ACTIVITYNAME = "ACTIVITYNAME";

	//MAPKEY_CAMPAIGNNO
	public static String MAPKEY_CAMPAIGNNO = "CAMPAIGNNO";

	//NOTIFICATIONID_ACTIVITYCHANGE
	public static String NOTIFICATIONID_ACTIVITYCHANGE = "CRM_1003";

	//ACTIVITY_CODE_NEW
	public static String ACTIVITY_CODE_NEW = "1001";

	//ACTIVITYSTATUS_NEW
	public static int ACTIVITYSTATUS_NEW = 1001;

	//ACTIVITYSTATUS_INPROGRESS
	public static int ACTIVITYSTATUS_INPROGRESS = 1002;

	//MAILID_ACTIVITYNOTBEGUN
	public static String MAILID_ACTIVITYNOTSTARTED = "CRM_0011";

	//MAILID_ACTIVITYNOTCOMPLETED
	public static String MAILID_ACTIVITYNOTCOMPLETED = "CRM_0012";

	//NOTIFICATIONID_ACTIVITYNOTSTARTED
	public static String NOTIFICATIONID_ACTIVITYNOTSTARTED = "CRM_1004";

	//NOTIFICATIONID_ACTIVITYNOTCOMPLETED
	public static String NOTIFICATIONID_ACTIVITYNOTCOMPLETED = "CRM_1005";

	public static String RESULT_CAMPAIGNVIEWCALENDARSO = "Result_CalendarView";
	/*******************************************
	 * CAMPAIGN VIEW CALENDAR CONSTANTS BEGINS
	 ********************************************/
	/**
	* Constants for Option : CRMCCDOnload
	*/
	// ACTION_CRMCCDONLOAD
	public static String ACTION_CRMCCDONLOAD = "/CRMCCDOnload";

	// RESULT_CAMPAIGNCALENDARSO
	public static String RESULT_CAMPAIGNCALENDARSO =
		"RESULT_CampaignCalendarSO";

	// SEARCH_CAMPAIGNCALENDARSO
	public static String SEARCH_CAMPAIGNCALENDARSO =
		"SEARCH_CampaignCalendarSO";

	/**
	 * Constants for Option : CRMCCDProductSearch
	 */
	// ACTION_CRMCCDPRODUCTSEARCH
	public static String ACTION_CRMCCDPRODUCTSEARCH = "/CRMCCDProductSearch";

	/**
	 * Constants for Option : CRMCCDProgramSearchCriteria
	 */
	// ACTION_CRMCCDPROGRAMSEARCHCRITERIA
	public static String ACTION_CRMCCDPROGRAMSEARCHCRITERIA =
		"/CRMCCDProgramSearchCriteria";

	/**
	 * Constants for Option : CRMCCDChannelTypeChange
	 */
	// ACTION_CRMCCDCHANNELTYPECHANGE
	public static String ACTION_CRMCCDCHANNELTYPECHANGE =
		"/CRMCCDChannelTypeChange";

	/**
	 * Constants for Option : CRMCCDGetProgram
	 */
	// ACTION_CRMCCDGETPROGRAM
	public static String ACTION_CRMCCDGETPROGRAM = "/CRMCCDGetProgram";

	/**
	 * Constants for Option : CRMCCDCancel
	 */
	//ACTION_CRMCCDCANCEL
	public static String ACTION_CRMCCDCANCEL = "/CRMCCDCancel";

	public static String DOMAINNAME_MONTH = "MONTH";

	public static String RESULT_CHANNELTYPES = "RESULT_ChannelTypes";

	public static String RESULT_SUBCHANNELTYPES = "RESULT_SubChannelTypes";

	public static String RESULT_PROGRAMPLANNINGS = "RESULT_ProgramPlannings";

	public static String INPUT_PROGRAMSECTIONDISPLAY =
		"INPUT_ProgramSectionDisplay";

	public static String INPUT_CHANNELSECTIONDISPLAY =
		"INPUT_ChannelSectionDisplay";

	public static String INPUT_CAMPAIGNSTATUS = "CAMPAIGN_STATUS";

	public static String INPUT_CAMPAIGNSTARTDATE = "CAMPAIGN_STARTDATE";

	public static String INPUT_CAMPAIGNENDDATE = "CAMPAIGN_ENDDATE";

	public static String INPUT_CHANNELID = "CHANNEL_ID";

	public static String INPUT_CHANNELTYPE = "CHANNEL_TYPE";

	public static String INPUT_SUBCHANNELTYPE = "SUBCHANNEL_TYPE";

	public static String INPUT_PLANNEDPROGDATE = "PLANNED_PROG_DATE";

	public static String INPUT_PROGRAM = "PROGRAM";

	public static String INPUT_PROGSRCHCRITERIA = "PROG_SRCH_CRITERIA";

	public static String SEARCH_VIEWCALENDARSO = "SEARCH_ViewCalendarSO";

	public static String INPUT_RADIOCLICKED = "INPUT_RadioClicked";

	public static String NOSELECT = "0";

	//CampaignStatus_BATCHDAO_NAME
	public static String CampaignStatus_BATCHDAO_NAME =
		"ehsn.et1.db.crm.batch.dao.CampaignStatusBatchDAO";

	public static String LotteryEligibleCustomers_BATCHDAO_NAME =
			"ehsn.et1.db.crm.batch.dao.LotteryEligibleCustomersBatchDAO";

	//CampaignContactMedia_BATCHDAO_NAME
	public static String CampaignContactMedia_BATCHDAO_NAME =
		"ehsn.et1.db.crm.batch.dao.CampaignContactMediaBatchDAO";

	//CampaignTargets_BATCHDAO_NAME
	public static String CampaignTargets_BATCHDAO_NAME =
		"ehsn.et1.db.crm.batch.dao.CampaignTargetsBatchDAO";

	//CampaignActivityAlarm_BATCHDAO_NAME
	public static String CampaignActivityAlarm_BATCHDAO_NAME =
		"ehsn.et1.db.crm.batch.dao.CampaignActivityAlarmBatchDAO";

	public int CAMPAIGN_CTIREFERENCEID = 1001;

	/***********************************
	 * CAMPAIGN TEAM CONSTANTS BEGINS
	 ************************************/
	/**
	 * Constants for Option : CRMCMTOnload
	 */
	//	ACTION_CRMCMTONLOAD
	public static String ACTION_CRMCMTONLOAD = "/CRMCMTOnload";

	//	RESULT_CAMPAIGNTEAMSO
	public static String RESULT_CAMPAIGNTEAMSO = "RESULT_CampaignTeamSO";

	//	SEARCH_CAMPAIGNTEAMSO
	public static String SEARCH_CAMPAIGNTEAMSO = "SEARCH_CampaignTeamSO";

	/**
	 * Constants for Option : CRMCMTAddCampaignTeamMember
	 */
	//	ACTION_CRMCMTADDCAMPAIGNTEAMMEMBER
	public static String ACTION_CRMCMTADDCAMPAIGNTEAMMEMBER =
		"/CRMCMTAddCampaignTeamMember";
	/**
		 * Flag to determine contents of RESULT_SELECTEDLIST
		 */

	public static String INPUT_SELECTEDLISTFLAG = "SELECTEDLISTFLAG";

	/**
	 *  Values for INPUT_SELECTEDLISTFLAG
	 */

	// RESULT_SELECTEDLIST Has the Campaign Team Records
	public static String HASDATA = "HASDATA";

	//RESULT_SELECTEDLIST Has the Updated Set Of Campaign Team Records
	public static String HASUPDATEDDATA = "HASUPDATEDDATA";
	public static String INPUT_TEAMMEMBERID = "TEAMMEMBERID";

	/**
	 * Constants for Option : CRMCMTDeleteCampaignTeamMember
	 */
	//	ACTION_CRMCMTDELETECAMPAIGNTEAMMEMBER
	public static String ACTION_CRMCMTDELETECAMPAIGNTEAMMEMBER =
		"/CRMCMTDeleteCampaignTeamMember";

	/**
	 * Constants for Option : CRMCMTCampaignDetails
	 */
	//	ACTION_CRMCMTCAMPAIGNDETAILS
	public static String ACTION_CRMCMTCAMPAIGNDETAILS =
		"/CRMCMTCampaignDetails";

	/**
	 * Constants for Option : CRMCMTCancel
	 */
	//	ACTION_CRMCMTCANCEL
	public static String ACTION_CRMCMTCANCEL = "/CRMCMTCancel";

	// INVALIDTEAMMEMBERID
	public static long INVALIDTEAMMEMBERID = -1;

	// LOESELECTEDLIST
	public static String LOESELECTEDLIST = "LOESELECTEDLIST";

	// LISTOFCAMPAIGNMEMBERS
	public static String LISTOFCAMPAIGNMEMBERS = "LISTOFCAMPAIGNMEMBERS";

	// EMPLOYEE_STATUS_QUIT
	public static String EMPLOYEE_STATUS_QUIT = "-1";

	/***********************************
	 * CAMPAIGN TARGETS CONSTANTS BEGINS
	 ************************************/
	//	ACTION_CRMCTGCANCEL
	public static String ACTION_CRMCTGCANCEL = "/CRMCTGCancel";
	/**
	 * CAMPAIGNTARGETS_TABLE_NAME
	 */
	public static String CAMPAIGNTARGETS_TABLE_NAME = "TCRM_CAMPAIGNTARGETS";
	/**
		* Constants for Option : CRMCTGOnload
		*/
	// ACTION_CRMCTGONLOAD
	public static String ACTION_CRMCTGONLOAD = "/CRMCTGOnload";

	/**
		 * Constants for Option : CRMCTGSaveTargetUpdate
		 */
	// ACTION_CRMCTGSAVETARGETUPDATE
	public static String ACTION_CRMCTGSAVETARGETUPDATE =
		"/CRMCTGSaveTargetUpdate";

	/**
	 * Constants for Option : CRMCTGSaveTargetInsert
	 */
	// ACTION_CRMCTGSAVETARGETINSERT
	public static Object ACTION_CRMCTGSAVETARGETINSERT =
		"/CRMCTGSaveTargetInsert";

	/**
	 * Constants for Option : CRMCTGCampaignDetails
	 */
	// ACTION_CRMCTGCAMPAIGNDETAILS
	public static String ACTION_CRMCTGCAMPAIGNDETAILS =
		"/CRMCTGCampaignDetails";

	// RESULT_CAMPAIGNTARGETSO
	public static String RESULT_CAMPAIGNTARGETSO = "RESULT_CampaignTargetSO";

	/**
	 * Constants for Option : CRMCTGTargetProductSearch
	 */
	//	ACTION_CRMCTGTARGETPRODUCTSEARCH
	public static String ACTION_CRMCTGTARGETPRODUCTSEARCH =
		"/CRMCTGTargetProductSearch";

	public static String INPUT_TARGETID = "TARGETID";

	/**
	 * Constants for Option : CRMCTPSaveTargetValues
	 */
	// ACTION_CRMCTPSAVETARGETVALUES
	public static String ACTION_CRMCTPSAVETARGETVALUES =
		"/CRMCTPSaveTargetValues";

	/**
	 * Constants for Option : CRMCTPCancel
	 */
	// ACTION_CRMCTPSAVETARGETVALUES
	public static String ACTION_CRMCTPCANCEL = "/CRMCTPCancel";

	// RESULT_CAMPAIGNTARGETPRODUCTSSO
	public static String RESULT_CAMPAIGNTARGETPRODUCTSSO =
		"RESULT_CampaignTargetProductsSO";

	// SEARCH_CAMPAIGNTARGETPRODUCTSSO
	public static String SEARCH_CAMPAIGNTARGETPRODUCTSSO =
		"SEARCH_CampaignTargetProductsSO";

	// ACTION_CRMCTPONLOAD
	public static String ACTION_CRMCTPONLOAD = "/CRMCTPOnload";

	/**
	 * CAMPAIGN STATUS CODES AND CAMPAIGN NO CONSTANTS BEGINS
	 */
	public static String INPUT_CAMPAIGNDETAILSO = "INPUT_CAMPAIGNDETAILSO";

	public static String DRAFT_STRING = "DRAFT";

	public static String PENDINGFORAPPROVAL_STRING = "Pending for Approval";

	public static String APPROVED_STRING = "Approved";

	public static String REJECTED_STRING = "Rejected";

	public static String ONHOLD_STRING = "On hold";

	public static String CANCELLED_STRING = "Cancelled";

	public static String ONGOING_STRING = "Ongoing";

	public static String COMPLETED_STRING = "Completed";

	public static String DRAFT_CODE = "4113";

	public static String PENDINGFORAPPROVAL_CODE = "4114";

	public static String APPROVED_CODE = "4115";

	public static String REJECTED_CODE = "4116";

	public static String ONHOLD_CODE = "4117";

	public static String CANCELLED_CODE = "4118";

	public static String ONGOING_CODE = "4119";

	public static String COMPLETED_CODE = "4120";

	public static String EMPLOYEE_QUITE_CODE = "1";

	/**
	 * MAILING TABLE CONSTANTS FOR CAMPAIGN APPROVAL
	 */
	public static String MAIL_CAMPAIGNAPPROVAL = "CRM_0005";

	public static String MAIL_CAMPAIGNAPPROVED = "CRM_0006";

	public static String MAIL_CAMPAIGNREJECTED = "CRM_0007";

	public static String CAMPAIGNNO = "CAMPAIGNNO";

	public static final long SYSTEM_USER_ID = 1;

	/*******************************************
	 * PRODUCT SEARCH - CONSTANTS 			   *
	 *******************************************/

	/**
	 * PRODUCT SEARCH FOR CONDITION CONSTANTS BEGINS
	 **/

	//ACTION_CRMPDSSEARCHBYSUPPLIERID
	public static String ACTION_CRMPDSSEARCHBYSUPPLIERID =
		"/CRMPDSSearchBySupplierId";
	
	//ACTION_CRMPDSSEARCHBYMULTICODEID
	public static String ACTION_CRMPDSSEARCHBYMULTICODEID =
		"/CRMPDSSearchByMultiCodeId";

	//ACTION_CRMPDSSEARCHBYPRODUCID
	public static String ACTION_CRMPDSSEARCHBYPRODUCID =
		"/CRMPDSSearchByProductId";

	//	   ACTION_CRMPDSSEARCHBYCLASSCODE
	public static String ACTION_CRMPDSSEARCHBYCLASSCODE =
		"/CRMPDSSearchByClassCode";

	/**
	 * Constants for Option : CRMPDSSearchAllProducts
	 */
	//	   ACTION_CRMPDSSEARCHALLPRODUCTS
	public static String ACTION_CRMPDSSEARCHALLPRODUCTS =
		"/CRMPDSSearchAllProducts";

	/**
	 * Constants for Option : CRMPDSAddToList
	 */
	//	   ACTION_CRMPDSADDTOLIST
	public static String ACTION_CRMPDSADDTOLIST = "/CRMPDSAddToList";

	/**
	 * Constants for Option : CRMPDSImportToList
	 */
	//	   ACTION_CRMPDSREMOVEFROMLIST
	public static String ACTION_CRMPDSREMOVEFROMLIST = "/CRMPDSRemoveFromList";

	/**
	 * Constants for Option : CRMPDSImportToList
	 */
	//	   ACTION_CRMPDSIMPORTTOLIST
	public static String ACTION_CRMPDSIMPORTTOLIST = "/CRMPDSImportToList";

	/**
	 * Constants for Option : CRMPDSProductAddToList
	 */
	//	   ACTION_CRMPDSPRODUCTIDADDTOLIST
	public static String ACTION_CRMPDSP_PRODUCTADDTOLIST =
		"/CRMPDSProductIdAddToList";

	/**
	 * Constants for Option : CRMPDSGetMClassCodes
	 */
	//	   ACTION_CRMPDSGETMCLASSCODES
	public static String ACTION_CRMPDSGETMCLASSCODES = "/CRMPDSGetMClassCodes";

	/**
	 * Constants for Option : CRMPDSGetSClassCodes
	 */
	//	   ACTION_CRMPDSGETSCLASSCODES
	public static String ACTION_CRMPDSGETSCLASSCODES = "/CRMPDSGetSClassCodes";

	//	   ACTION_CRMPDSCANCELCRITERIA
	public static String ACTION_CRMPDSCANCELCRITERIA = "/CRMPDSCancelCriteria";

	//	ACTION_CRMPDSONLOAD
	public static String ACTION_CRMPDSONLOAD = "/CRMPDSOnLoad";

	// RESULT_EDITPRODUCTSEARCHCRITERIASO
	public static String RESULT_EDITPRODUCTSEARCHCRITERIASO =
		"RESULT_EDITPRODUCTSEARCHCRITERIASO";

	/**
	 * Constants for Option : CRMPDSClear
	 */
	//	ACTION_CRMPDSCLEAR
	public static String ACTION_CRMPDSCLEAR = "/CRMPDSClear";

	/**
	 * Constants for Option : CRMPDSClear
	 */
	//	ACTION_CRMPDSCLEAR
	public static String ACTION_CRMPDSCLEARALL = "/CRMPDSClearAll";

	//	ACTION_CRMPDSCLEAR
	public static String ACTION_CRMPDSATTACHCRITERIA = "/CRMPDSAttachCriteria";

	//RESULT_PRODUCTSEARCHCRITERIASO
	public static String RESULT_PRODUCTSEARCHCRITERIASO =
		"RESULT_PRODUCTSEARCHCRITERIASO";

	//SEARCHTYPE
	public static String SEARCHTYPE = "SearchCriteria";

	// PRODUCTSEARCHBYMULTIID
	public static String PRODUCTSEARCHBYMULTIID = "A";

	// PRODUCTSEARCHBYCLASS
	public static String PRODUCTSEARCHBYCLASS = "B";

	// PRODUCTSEARCHALL
	public static String PRODUCTSEARCHALL = "C";

	//	PRODUCTSEARCHBYPRODUCTID
	public static String PRODUCTSEARCHBYPRODUCTID = "D";
	
	//	PRODUCTSEARCHBYSUPPLIERID
	public static String PRODUCTSEARCHBYSUPPLIERID = "E";

	// ATTACHCRITERIA
	public static String ATTACHCRITERIA = "ATTACHCRITERIA";

	/***************************************************
	 * PRODUCT SEARCH FOR OFFERS CONSTANTS BEGINS
	 ***************************************************/

	/**
	 * ATTACHOFFERPRODUCTLIST
	 */
	public static String ATTACHOFFERPRODUCTLIST = "ATTACHOFFERPRODUCTLIST";
	/**
	 * SELECTEDID
	 */
	public static String SELECTEDID = "id";
	/**
	 * SELECTEDMULTICODEID
	 */
	public static String SELECTEDMULTICODEID = "SelectedMultiCodeId";

	/**
	 * SELECTEDPRODUCTID
	 */
	public static String SELECTEDPRODUCTID = "SelectedProductId";

	//	ACTION_CRMPSLDISPLAYCOLOURSTYLE
	public static String ACTION_CRMPSLDISPLAYCOLOURSTYLE =
		"/CRMPSLDisplayColourStyle";

	//	RESULT_PRODUCTDETAILSSO
	public static String RESULT_OFFERPRODUCTDETAILSSO =
		"RESULT_OfferProductDetailsSO";

	//	SEARCH_PRODUCTDETAILSSO
	public static String SEARCH_PRODUCTDETAILSSO = "SEARCH_ProductDetailsSO";

	/**
	 * Constants for Option : CRMPSLAddToList
	 */
	//	ACTION_CRMPSLADDTOLIST
	public static String ACTION_CRMPSLADDTOLIST = "/CRMPSLAddToList";

	// INPUT_KEY
	public static String INPUT_KEY = "Key";

	//	INPUT_PRODUCTDETAILSSO
	public static String INPUT_PRODUCTDETAILSSO = "INPUT_ProductDetailsSO";

	/**
	 * Constants for Option : CRMPSLDeleteFromList
	 */
	//	ACTION_CRMPSLDELETEFROMLIST
	public static String ACTION_CRMPSLDELETEFROMLIST = "/CRMPSLDeleteFromList";

	//	INPUT_PRODUCTMULTICODESO
	public static String INPUT_PRODUCTMULTICODESO = "INPUT_ProductMultiCodeSO";

	/**
	 * Constants for Option : CRMPSLAttachProducts
	 */
	//	ACTION_CRMPSLATTACHPRODUCTS
	public static String ACTION_CRMPSLATTACHPRODUCTS = "/CRMPSLAttachProducts";

	/**
	 * Constants for Option : CRMPSLClearList
	 */
	//	ACTION_CRMPSLCLEARLIST
	public static String ACTION_CRMPSLCLEARLIST = "/CRMPSLClearList";

	/**
	 * Constants for Option : CRMPSLDisplayColourStyleDetails
	 */
	//	ACTION_CRMPSLDISPLAYCOLOURSTYLEDETAILS
	public static String ACTION_CRMPSLDISPLAYCOLOURSTYLEDETAILS =
		"/CRMPSLDisplayColourStyleDetails";

	// PRODUCTCATEGORYDOMAINNAME
	public static String PRODUCTCATEGORYDOMAINNAME = "ProductCategory";

	// CLASSCODEDOMAINNAME
	public static String CLASSCODEDOMAINNAME = "ClassCode";
	/**
	 * Constants for Option : CRMPSLCancel
	 */
	//	ACTION_CRMPSLCANCEL
	public static String ACTION_CRMPSLCANCEL = "/CRMPSLCancel";

	/**
	 * Constants for Option : CRMPSLSelectCriteria
	 */
	//	ACTION_CRMPSLSELECTCRITERIA
	public static String ACTION_CRMPSLSELECTCRITERIA = "/CRMPSLSelectCriteria";

	/**
	 * Constants for Option : CRMPSLClearAll
	 */
	//ACTION_CRMPSLCLEARALL
	public static String ACTION_CRMPSLCLEARALL = "/CRMPSLClearAll";

	/**
	  * Constants for Option : CRMPSLCancel
	  */
	//	 ACTION_CRMPSLCANCEL
	public static String SEARCH_OFFERPRODUCTFORSELECTEDID =
		"SEARCH_OFFERPRODUCTFORSELECTEDID";

	/**
	 * ACTION_CRMPSLONLOAD
	 */
	public static String ACTION_CRMPSLONLOAD = "/CRMPSLOnload";

	/**
	 * RESULT_OFFERPRODUCTDETAILSMAP
	 */
	public static String RESULT_OFFERPRODUCTDETAILSMAP =
		"RESULT_OfferProductDetailsMap";

	/**
	 * RESULT_COLOURSTYLEDETAILSFORMULTICODEID
	 */
	public static String RESULT_COLOURSTYLEDETAILSFORSELECTEDID =
		"RESULT_ColourStyleDetailsForSelectedId";

	/**
	 * RESULT_PRODUCTSSELECTEDFOROFFER
	 */
	public static String RESULT_PRODUCTSSELECTEDFOROFFER =
		"RESULT_ProductsSelectedForOffer";
	/**
	 * RESULT_SELECTEDLLIST
	 */
	public static String RESULT_SELECTEDLLIST = "RESULT_SELECTEDLLIST";
	/**
	 * RESULT_SELECTEDLLIST
	 */
	public static String RESULT_SELECTEDMLIST = "RESULT_SELECTEDMLIST";

	/**
	 * RESULT_MULTICODEIDSELECTED
	 */
	public static String RESULT_MULTICODEIDSELECTED =
		"RESULT_MultiCodeIdSelected";

	/**
	 * RESULT_PRODUCTIDSELECTED
	 */
	public static String RESULT_PRODUCTIDSELECTED = "RESULT_ProductIdSelected";

	/**
	 * RESULT_PRODUCTFOROFFERS
	 */
	public static String RESULT_PRODUCTFOROFFERS = "RESULT_PRODUCTFOROFFERS";

	/**
	 * COLORVALUEDOMAINNAME
	 */
	public static String COLORVALUEDOMAINNAME = "ColorValue";

	/**
	 * COLORCLASSDOMAINNAME
	 */
	public static String COLORCLASSDOMAINNAME = "ColorClass";

	/**
	 * STYLECLASSDOMAINNAME
	 */
	public static String STYLECLASSDOMAINNAME = "StyleClass";

	/**
	 * STYLEVALUEDOMAINNAME
	 */
	public static String STYLEVALUEDOMAINNAME = "StyleValue";

	/**
	 * PRODUCT SEARCH FOR OFFERS ENDS
	 **/

	/*******************************************
	 * CAMPAIGN CRITERIA  - CONSTANTS 		   *
	 *******************************************/
	// INPUT_CAMPAIGNNO
	//public static String INPUT_CAMPAIGNNO = "CAMPAIGNNO";

	// RESULT_CRITERISSO
	public static String RESULT_BASECRITERISSO = "RESULT_BaseCriterisSO";

	// SEARCH_CRITERISSO
	public static String SEARCH_BASECRITERISSO = "SEARCH_BaseCriterisSO";

	// INPUT_CAMPAIGNDETAILSO
	//public static String INPUT_CAMPAIGNDETAILSO = "CamapignSO";

	//	   ISBASECRITERIA
	public static String ISBASECRITERIA = "Y";

	//	   ISNOTBASECRITERIA
	public static String ISNOTBASECRITERIA = "N";

	//	ACTION_CRMCMCRCLKCHANNEL
	public static String ACTION_CRMCMCRCLKCHANNEL = "/CRMCMCRCLKChannel";

	//	ACTION_CRMCMGETSUBCHANNEL
	public static String ACTION_CRMCMGETSUBCHANNEL = "/CRMCMCRGETSUBChannel";

	//	ACTION_CRMCMCGETPROGRAM
	public static String ACTION_CRMCMCGETPROGRAM = "/CRMCMCRGetProgram";

	//	ACTION_CRMCMCSEARCHPROGRAM
	public static String ACTION_CRMCMCSEARCHPROGRAM = "/CRMCMCRSearchProgram";

	//	ACTION_CRMCMCSELECTPROGRAM
	public static String ACTION_CRMCMCSELECTPROGRAM = "/CRMCMCRSelectProgram";

	//	ACTION_CRMCMCGETISSUE
	public static String ACTION_CRMCMCGETISSUE = "/CRMCMCRGetIssues";

	//	ACTION_CRMCMCGETISSUE
	public static String ACTION_CRMCMCGETDATE = "/CRMCMCRGetDate";
	//	ACTION_CRMCMCGETDIVISION
	public static String ACTION_CRMCMCGETDIVISION = "/CRMCMCRGetDivisions";

	//	ACTION_CRMCMCGETPAGE
	public static String ACTION_CRMCMCGETPAGE = "/CRMCMCRGetPages";

	//	ACTION_CRMCMCGETPAGE
	public static String ACTION_CRMCMCADDTOLIST = "/CRMCMCRAddToList";

	//	ACTION_CRMCMCGETPAGE
	public static String ACTION_CRMCMCDELETEFROMLIST = "/CRMCMCRDeleteFromList";

	//	RESULT_SUBCHANNELSLIST
	public static String RESULT_SUBCHANNELSLIST = "RESULT_SUBCHANNELSLIST";

	//	RESULT_ISSUESLIST
	public static String RESULT_ISSUESLIST = "RESULT_ISSUESLIST";

	//	RESULT_DIVISIONSLIST
	public static String RESULT_DIVISIONSLIST = "RESULT_DIVISIONSLIST";

	//	RESULT_DIVISIONSLIST
	public static String RESULT_PAGESLIST = "RESULT_PAGESLIST";

	// RESULT_MAPSESSION
	public static String RESULT_MAPSESSION = "MAPSESSION";

	//USED AS KEY TO HOLD DATA ABOUT SEARCH BY TYPE
	public static String RESULT_SEARCHTYPE = "SEARCHTYPE";

	/**
	 * Constants for Option : CRMCMCRCLKCustomer
	 */
	//	ACTION_CRMCMCRCLKCUSTOMER
	public static String ACTION_CRMCMCRCLKCUSTOMER = "/CRMCMCRCLKCustomer";

	//	RESULT_MEMBERSHIPSO
	public static String RESULT_MEMBERSHIPSO = "RESULT_MembershipSO";

	/**
	 * Constants for Option : CRMCMCRCLKPayments
	 */
	//	ACTION_CRMCMCRCLKPAYMENTS
	public static String ACTION_CRMCMCRCLKPAYMENTS = "/CRMCMCRCLKPayments";

	/**
	 * Constants for Option : CRMCMCRCLKDate
	 */
	//	ACTION_CRMCMCRCLKDATE
	public static String ACTION_CRMCMCRCLKDATE = "/CRMCMCRCLKDate";

	/**
	 * Constants for Option : CRMCMCRCHNGSubChannel
	 */
	//	ACTION_CRMCMCRCHNGSUBCHANNEL
	public static String ACTION_CRMCMCRCHNGSUBCHANNEL =
		"/CRMCMCRCHNGSubChannel";

	/**
	 * Constants for Option : CRMCMCRCLKAttach
	 */
	//	ACTION_CRMCMCRCLKATTACH
	public static String ACTION_CRMCMCRCLKATTACH = "/CRMCMCRCLKAttach";
	/**
	 * Constants for Option : CRMCMCRCLKAttach
	 */
	//	ACTION_CRMCMCRCLKATTACH
	public static String ACTION_CRMCMCRCLKCLEARATTACH = "/CRMClearCondition";
	/**
	 * Constants for Option : CRMCMCRCLKGeneralPlus
	 */
	//	ACTION_CRMCMCRCLKGENERALPLUS
	public static String ACTION_CRMCMCRCLKGENERALPLUS =
		"/CRMCMCRCLKGeneralPlus";

	/**
	 * Constants for Option : CRMCMCRCLKGeneralPlus
	 */
	//	ACTION_CRMCMCRCLKGENERALPLUS
	public static String ACTION_CRMCMCRCLKGENERAL = "/CRMCMCRCLKGeneral";
	/**
		 * Constants for Option : CRMCMCRCLKGeneralPlus
		 */
	//	ACTION_CRMCMCRCLKGENERALPLUS
	public static String ACTION_CRMCMCRCLKNOOFCUSTOMER =
		"/CRMCMCRCLKNoOfCustomer";

	/**
	 * Constants for Option : CRMCMCRCLKGeneralMinus
	 */
	//	ACTION_CRMCMCRCLKGENERALMINUS
	public static String ACTION_CRMCMCRCLKGENERALMINUS =
		"/CRMCMCRCLKGeneralMinus";

	/**
	 * Constants for Option : CRMCMCRCLKAdditionalValuePlus
	 */
	//	ACTION_CRMCMCRCLKADDITIONALVALUEPLUS
	public static String ACTION_CRMCMCRCLKADDITIONALVALUEPLUS =
		"/CRMCMCRCLKAdditionalValuePlus";
	/**
	 * Constants for Option : CRMCMCRCLKAdditionalValuePlus
	 */
	//	ACTION_CRMCMCRCLKADDITIONALVALUE
	public static String ACTION_CRMCMCRCLKADDITIONALVALUE =
		"/CRMCMCRCLKAdditionalValue";
	/**
	 * Constants for Option : CRMCMCRCLKAdditionalValueMinus
	 */
	//	ACTION_CRMCMCRCLKADDITIONALVALUEMINUS
	public static String ACTION_CRMCMCRCLKADDITIONALVALUEMINUS =
		"/CRMCMCRCLKAdditionalValueMinus";

	/**
	 * Constants for Option : CRMCMCRCLKFrequencyPlus
	 */
	//	ACTION_CRMCMCRCLKFREQUENCYPLUS
	public static String ACTION_CRMCMCRCLKFREQUENCYPLUS =
		"/CRMCMCRCLKFrequencyPlus";

	/**
	 * Constants for Option : CRMCMCRCLKFrequencyMinus
	 */
	//	ACTION_CRMCMCRCLKFREQUENCYMINUS
	public static String ACTION_CRMCMCRCLKFREQUENCYMINUS =
		"/CRMCMCRCLKFrequencyMinus";
	/**
	 * Constants for Option : CRMCMCRCLKAdditionalValuePlus
	 */
	//	ACTION_CRMCMCRCLKADDITIONALVALUE
	public static String ACTION_CRMCMCRCLKCUSTOMEROFFER =
		"/CRMCMCRCLKCustomerOffer";
	/**
	 * Constants for Option : CRMCMCRCLKCustomerPlus
	 */
	//	ACTION_CRMCMCRCLKCUSTOMERPLUS
	public static String ACTION_CRMCMCRCLKCUSTOMERPLUS =
		"/CRMCMCRCLKCustomerPlus";

	/**
	 * Constants for Option : CRMCMCRCLKCustomerMinus
	 */
	//	ACTION_CRMCMCRCLKCUSTOMERMINUS
	public static String ACTION_CRMCMCRCLKCUSTOMERMINUS =
		"/CRMCMCRCLKCustomerMinus";

	/**
	 * Constants for Option : CRMCMCRListOnload
	 */
	//	ACTION_CRMCMCRLISTONLOAD
	public static String ACTION_CRMCMCRLISTONLOAD = "/CRMCMCRListOnload";

	//	RESULT_CRITERISSO
	public static String RESULT_CRITERISSO = "RESULT_CriterisSO";

	//	SEARCH_CRITERISSO
	public static String SEARCH_CRITERISSO = "SEARCH_CriterisSO";

	/**
	 * Constants for Option : CRMCMCRCLKAddCriteria
	 */
	//	ACTION_CRMCMCRCLKADDCRITERIA
	public static String ACTION_CRMCMCRCLKADDCRITERIA =
		"/CRMCMCRCLKAddCriteria";

	/**
	 * Constants for Option : CRMCMCRDelete
	 */
	//	ACTION_CRMCMCRDELETE
	public static String ACTION_CRMCMCRDELETE = "/CRMCMCRDelete";

	/**
	 * Constants for Option : CRMCMEditCriteria
	 */
	//	ACTION_CRMCMEDITCRITERIA
	public static String ACTION_CRMCMEDITCRITERIA = "/CRMCMEditCriteria";

	/**
	 * Constants for Option : CRMCMCLKCampaignDetails
	 */
	//	ACTION_CRMCMCLKCAMPAIGNDETAILS
	public static String ACTION_CRMCMCLKCAMPAIGNDETAILS =
		"/CRMCMCLKCampaignDetails";

 /**
	 * Constants for Option : CRMFOSearchCriteria Modify by Jessie 01/12/2006
	 */
	//	ACTION_CRMCMCLKCAMPAIGNDETAILS
	public static String ACTION_CRMFOSEARCHCRITERIA =
		"/CRMFOSearchCriteria";

	/**
	 * Constants for Option : CRMCMCRCLKImportBaseCriteria
	 */
	//	ACTION_CRMCMCRCLKIMPORTBASECRITERIA
	public static String ACTION_CRMCMCRCLKIMPORTBASECRITERIA =
		"/CRMCMCRCLKImportBaseCriteria";

	/**
	 * Constants for Option : CRMCMCRSaveBaseCriteria
	 */
	//	ACTION_CRMCMCRSAVEBASECRITERIA
	public static String ACTION_CRMCMCRSAVEBASECRITERIA =
		"/CRMCMCRSaveBaseCriteria";

	/**
	 * Constants for Option : CRMCMCRCLKCancel
	 */
	//	ACTION_CRMCMCRCLKCANCEL
	public static String ACTION_CRMCMCRCLKCANCEL = "/CRMCMCRCLKCancel";

	/**
	 * Constants for Option : CRMCMCRSaveCriteria
	 */
	//	ACTION_CRMCMCRSAVECRITERIA
	public static String ACTION_CRMCMCRSAVECRITERIA = "/CRMCMCRSaveCriteria";

	/**
	 * Constants for Option : CRMCMCRUpdateCriteria
	 */
	//	ACTION_CRMCMCRUPDATECRITERIA
	public static String ACTION_CRMCMCRUPDATECRITERIA =
		"/CRMCMCRUpdateCriteria";

	/**
	 * Constants for Option : CRMCMCRCancelCriteria
	 */
	//	ACTION_CRMCMCRCANCELCRITERIA
	public static String ACTION_CRMCMCRCANCELCRITERIA =
		"/CRMCMCRCancelCriteria";
	/**
	 * ACTION_ATTACHPRODUCT
	 */
	public static String ACTION_ATTACHPRODUCT =
		"/CRMCMCRAttachProductsCondition";
	/**
	 * RESULT_CHANNELSLIST
	 */
	public static String RESULT_CHANNELSLIST = "CHANNELLIST";
	/**
	 * RESULT_CREDITCARDBANKS
	 */
	public static String RESULT_CREDITCARDBANKS = "CREDITCARDBANKS";
	/**
	 * RESULT_HOLIDAYS
	 */
	public static String RESULT_HOLIDAYS = "HOLIDAYLIST";
	/**
	 * ACTION_CRMCMCRCLKOFFERTYPE
	 */
	public static String ACTION_CRMCMCRCLKOFFERTYPE = "OFFERTYPE";
	/**
	 * INPUT_OFFERTYPE GENERAL
	 */
	public static String INPUT_OFFERTYPE_GENERAL = "OFFERTYPESGENERAL";

	/**
	 * INPUT_OFFERTYPE GENERAL
	 */
	public static String INPUT_OFFERTYPE_CUSTOMER = "OFFERTYPESCUSTOMER";
	/**
	 * INPUT_OFFERTYPE GENERAL
	 */
	public static String INPUT_OFFERTYPE_CUSTOMERS = "OFFERTYPESCUSTOMERS";
	/**
	 * INPUT_OFFERTYPE ADDITIONAL
	 */
	public static String INPUT_OFFERTYPE_ADDITIONAL = "OFFERTYPESADDITIONAL";
	/**
	 * INPUT_NOOFROWS GENERAL
	 */
	public static String INPUT_NOOFROWS_GENERAL = "OFFERNOOFROWSGENERAL";
	/**
	 * INPUT_NOOFROWS GENERAL
	 */
	public static String INPUT_NOOFROWS_CUSTOMERS = "OFFERNOOFROWSCUSTOMERS";
	/**
	 * INPUT_NOOFROWS ADDITIONAL
	 */
	public static String INPUT_NOOFROWS_ADDITIONAL = "OFFERNOOFROWSADDITIONAL";
	/**
	 * ACTION_CRMCRCLKCHNGCATEGORY
	 */
	public static String ACTION_CRMCRCLKCHNGCATEGORY = "/CRMCMCRChngCATEGORY";
	/** @COMMENT TAG : CONSTANTS DEFINITION BLOCK ENDS **/
	/**
	 * INPUT_SESSIONCRITERIAOBJECT
	 */
	public static String INPUT_SESSIONCRITERIAOBJECT = "CRITERIAOBJECT";
	
	public static String INPUT_SHOWAREA = "SHOWAREA";
	/**
	 * INPUT_SHOWCHANNEL
	 */
	public static String INPUT_SHOWCHANNEL = "SHOWCHANNEL";
	/**
	 * INPUT_SHOWCHANNEL
	 */
	public static String INPUT_SHOWPRODUCT = "SHOWPRODUCT";
	/**
	 * INPUT_SHOWCHANNEL
	 */
	public static String INPUT_SHOWCUSTOMER = "SHOWCUSTOMER";
	/**
	 * INPUT_SHOWCHANNEL
	 */
	public static String INPUT_SHOWPAYMENT = "SHOWPAYMENT";
	/**
	 * INPUT_SHOWCHANNEL
	 */
	public static String INPUT_SHOWDATE = "SHOWDATE";
	/**
	 * INPUT_ALL
	 */
	public static String INPUT_ALL = "ALL";
	/**
	 * INPUT_ANY
	 */
	public static String INPUT_ANY = "ANY";
	/**
	 * INPUT_I
	 */
	public static String INPUT_INCLUDE = "I";
	/**
	 * INPUT_E
	 */
	public static String INPUT_EXCLUDE = "E";
	/**
	 * INPUT_NATIONALHOILDAYS
	 */
	public static String INPUT_NATIONALHOILDAYS = "N";
	/**
	 * INPUT_EHSNOILDAYS
	 */
	public static String INPUT_EHSNHOILDAYS = "E";

	/**
	 * ACTION_CRMCMCRCLKGOVERMENT
	 */
	public static String ACTION_CRMCMCRCLKGOVERMENT = "/CRMCMCRCLKGOVERMENT";
	/**
	 * ACTION_CRMCMCRCLKEHSN
	 */
	public static String ACTION_CRMCMCRCLKEHSN = "/CRMCMCRCLKEHSN";
	/**
	 * ACTION_CRMCMCRCLKEHSN
	 */
	public static String ACTION_CRMCMCRCLKEHSNHOLIDAYS =
		"/CRMCMCRCHNGSubChannel";
	/**
	 * ACTION_CRMCMCRCLKEHSN
	 */
	public static String ACTION_CRMCMCRCLKPRODUCT = "/CRMCMCRCLKProduct";
	/**
	 * RESULT_SUBCHANNELLIST
	 */
	public static String RESULT_SUBCHANNELLIST = "SUBCHANNELS";
	/**
	 * RESULT_SUBCHANNELLIST
	 */
	public static String RESULT_CONDITIONOFFER = "SUBCHANNELS";
	/**
	 * INPUT_DELAYEDINSTALLMENTUNIT
	 */
	public static long INPUT_DELAYEDINSTALLMENTUNIT = 4130;
	/**
	 * INPUT_ADDITIONALVALUEUNIT
	 */
	public static long INPUT_ADDITIONALVALUEUNIT = 4183;
	/**
	 * RESULT_NATIONALHOLIDAYLIST
	 */
	public static String RESULT_NATIONALHOLIDAYLIST = "NATIONALHOLIDAYLIST";
	/**
	 * RESULT_SUBCHANNELHOLIDAY
	 */
	public static String RESULT_SUBCHANNELHOLIDAY = "SUBCHANNELHOLIDAYLIST";

	/**
	 * 	INPUT_SINGLEORDER
	 */
	public static int INPUT_SINGLEORDER = 4232;
	/**
	 * INPUT_CROSSORDER
	 */
	public static int INPUT_CROSSORDER = 4233;
	/**
	 * INPUT_GROUPPURCHASE
	 */
	public static int INPUT_GROUPPURCHASE = 4234;

	/**
	 * INPUT_FILTER Add by Jessie 01/12/2006
	 */
	public static String INPUT_FILTER = "FILTER";

	/**
	 * INPUT_OFFER Add by Jessie 01/12/2006
	 */
	public static String INPUT_OFFER = "OFFER";

	/**
	 * INPUT_CONDITION Add by Jessie 01/12/2006
	 */
	public static String INPUT_CONDITION = "CONDITION";

	/**
	 * INPUT_EDITLISTMAPKEY
	 */
	public static String INPUT_EDITLISTMAPKEY = "EDITLIST";
	/**
	 * INPUT_STATUS
	 */
	public static String INPUT_STATUS = "TRUE";
	/**
	 * INPUT_CHANNELMAP
	 */
	public static String INPUT_CHANNELMAP = "CHANNELMAP";
	/**
	 * INPUT_CREDITCARDBANK
	 */
	public static String INPUT_CREDITCARDBANK = "CREDITCARDBANK";
	/**
	 * INPUT_MAPSESSION
	 */
	public static String INPUT_MAPSESSION = "MAPSESSION";
	/**
	 * INPUT_ALLQUANTITY
	 */
	public static String INPUT_ALLQUANTITY = "ALLQ";
	/**
	 * INPUT_ANYQUANTITY
	 */
	public static String INPUT_ANYQUANTITY = "ANYQ";
	/**
	 * INPUT_ANYPRODUCT
	 */
	public static String INPUT_ANYPRODUCT = "ANYP";
	/**
	 * INPUT_BONUSPOINTS
	 */
	public static int INPUT_BONUSPOINTS = 4177;
	/**
	 * INPUT_CASH
	 */
	public static int INPUT_CASH = 4181;
	/**
	 * INPUT_DELIVERYDATE
	 */
	public static int INPUT_DELIVERYDATE = 4182;
	/**
	 * INPUT_PRODUCTGIVEAWAYS
	 */
	public static int INPUT_PRODUCTGIVEAWAYS = 4180;
	/**
	 * INPUT_INSTALLMENTS
	 */
	public static int INPUT_INSTALLMENTS = 4179;
	/**
	 *INPUT_DISCOUNT
	 */
	public static int INPUT_DISCOUNT = 4178;
	/**
	 * INPUT_OFFERTYPEGENERAL
	 */
	public static int INPUT_OFFERTYPEGENERAL = 100;
	/**
	 * INPUT_OFFERTYPEADDITIONAL
	 */
	public static int INPUT_OFFERTYPEADDITIONAL = 101;
	/**
	 * INPUT_OFFERTYPECUSTOMETR
	 */
	public static int INPUT_OFFERTYPECUSTOMETR = 102;
	/**
	 * INPUT_OFFERTYPEFREQUENCY
	 */
	public static int INPUT_OFFERTYPEFREQUENCY = 103;
	/**
	 * INPUT_GENERALTYPE
	 */
	public static String INPUT_GENERALTYPE = "G";
	/**
	 * INPUT_ADDITIONALTYPE
	 */

	public static String INPUT_ADDITIONALTYPE = "A";
	/**
	 * INPUT_DISCOUNTPERCENTAGE
	 */
	public static int INPUT_DISCOUNTPERCENTAGE = 4182;
	/**
	 * INPUT_DISCOUNTNTD
	 */
	public static int INPUT_DISCOUNTNTD = 4183;
	/**
	 * INPUT_CUSTOMERTYPE
	 */
	public static String INPUT_CUSTOMERTYPE = "C";
	/**
	 * INPUT_ONE
	 */
	public static int INPUT_ONE = 1;
	/**
	 * INPUT_NEWPRODUCT
	 */
	public static String INPUT_NEWPRODUCT = "N";
	/**
	 * INPUT_GIFTRETURNABLE
	 */
	public static String INPUT_GIFTRETURNABLE = "N";
	/**
	 * INPUT_STATUSVALID
	 */
	public static String INPUT_STATUSVALID = "Y";
	/**
	 * INPUT_STATUSINVLAID
	 */
	public static String INPUT_STATUSINVLAID = "N";
	/**
	 * INPUT_CRITERIAOFFEROBJECT
	 */
	public static String INPUT_CRITERIAOFFEROBJECT = "CRITERIAOFFEROBJECT";
	/**
	 * INPUT_CRITERIAOBJECT
	 */
	public static String INPUT_CRITERIAOBJECT = "CRITERIAOBJECT";
	/**
	 * INPUT_OFFERLISTOBJECT
	 */
	public static String INPUT_OFFERLISTOBJECT = "OFFEROBJECTLIST";
	/**
	 * INPUT_OFFEROBJECT
	 */
	public static String INPUT_OFFEROBJECT = "OFFEROBJECT";
	/**
	 * INPUT_CUSTOMERLIST
	 */
	public static String INPUT_CUSTOMERLIST = "CUSTOMERLIST";
	/**
	 * INPUT_GENERAL
	 */
	public static String INPUT_GENERAL = "GENERAL";
	/**
	 * INPUT_ADDITIONAL
	 */

	public static String INPUT_ADDITIONAL = "ADDITIONAL";
	/**
	 * INPUT_CUSTOMERS
	 */
	public static String INPUT_CUSTOMERS = "NOOFCUSTOMERS";
	/**
	 * INPUT_OFFERPRODUCTLIST
	 */
	public static String INPUT_OFFERPRODUCTLIST = "OFFERPRODUCTLIST";
	/**
	 * INPUT_PRODUCTSEARCHCRITERIA
	 */
	public static String INPUT_PRODUCTSEARCHCRITERIA = "PRODUCTSEARCHCONDITION";
	/**
	 * INPUT_CRITERIA
	 */
	public static String INPUT_CRITERIA = "CRITERIA";
	/**
	 * INPUT_CUSTOMERIDLIST
	 */
	public static String INPUT_CUSTOMERIDLIST = "CUSTOMERIDLIST";
	/**
	 * INPUT_SAVEUPDATECONDITIONY
	 */
	public static String INPUT_SAVEUPDATECONDITIONY = "Y";
	/**
	 * INPUT_SAVEUPDATECONDITIONN
	 */
	public static String INPUT_SAVEUPDATECONDITIONN = "N";
	/**
	 * RESULT_CAMPAIGNDETAILSSO
	 */
	//public static String RESULT_CAMPAIGNDETAILSSO = "resultso";
	/**
	 * INPUT_MEMBERSHIPLIST
	 */
	public static String INPUT_MEMBERSHIPLIST = "membershiplist";

	/**
	 * CONSTANTS FOR CROSS ORDER CRITERIA
	 */
	public static long DURATIONBYMINUTES = 1001;
	/**
	 * DURATIONBYHOURS
	 */
	public static long DURATIONBYHOURS = 1002;
	/**
	 * DURATIONBYDAYS
	 */
	public static long DURATIONBYDAYS = 1003;
	/**
	 * DURATIONBYWEEKS
	 */
	public static long DURATIONBYWEEKS = 1004;
	/**
	 * DURATIONBYMONTHS
	 */
	public static long DURATIONBYMONTHS = 1005;
	/**
	 * DURATIONBYYEARS
	 */
	public static long DURATIONBYYEARS = 1006;
	/**
	 * DURATION_CRITERIACONDITIONNAME
	 */
	public static String DURATION_CRITERIACONDITIONNAME =
		"DURATION_CRITERIACONDITION";
	/**
	 * DURATION_CRITERIACONDITIONDOMAINCODE
	 */
	public static long DURATION_CRITERIACONDITIONDOMAINCODE = 4170;
	/**
	 * DURATION_DURATIONTYPE
	 */
	public static long DURATION_DURATIONTYPE = 4162;
	/**
	 * CHOOSEDATE_DURATIONTYPE
	 */
	public static long CHOOSEDATE_DURATIONTYPE = 4163;
	/**
	 * CAMPAIGNDATE_DURATIONTYPE
	 */
	public static long CAMPAIGNDATE_DURATIONTYPE = 4164;
	/**
	 * DURATION_TYPEDOMAINNAME
	 */
	public static String DURATION_TYPEDOMAINNAME = "DURATION_TYPE";
	/**
	 * DURATION_TYPEDOMAINCODE
	 */
	public static long DURATION_TYPEDOMAINCODE = 4129;
	/**
	 * ACTION_DURATIONTYPE
	 */
	public static String ACTION_DURATIONTYPE = "/CRMCMCRDurationType";
	/**
	 * DURATION_TYPESELECT
	 */
	public static String DURATION_TYPESELECT = "0";
	/**
	 * INPUT_DURATIONTYPEDURATION
	 */
	public static String INPUT_DURATIONTYPEDURATION =
		"INPUT_DURATIONTYPEDURATION";
	/**
	 * INPUT_DURATIONTYPECHOOSEDATE
	 */
	public static String INPUT_DURATIONTYPECHOOSEDATE =
		"INPUT_DURATIONTYPECHOOSEDATE";
	/**
	 *
	 */
	public static String INPUT_DURATIONTYPECAMPAIGNDATE =
		"INPUT_DURATIONTYPECAMPAIGNDATE";
	/**
	 * INPUT_DURATIONTYPECAMPAIGNDATE
	 */
	public static String ACTION_CRMCMCRCLKFREQUENCY = "/CRMCMCRCLKFrequency";
	/**
	 * ACTION_CRMCMCRCLKFREQUENCYPLUSCROSSORDER
	 */
	public static String ACTION_CRMCMCRCLKFREQUENCYPLUSCROSSORDER =
		"/CRMCMCRCLKFrequencyPlusCrossOrder";
	/**
	 * ACTION_CRMCMCRCLKFREQUENCYMINUSCROSSORDER
	 */
	public static String ACTION_CRMCMCRCLKFREQUENCYMINUSCROSSORDER =
		"/CRMCMCRCLKFrequencyMinusCrossOrder";
	/**
	 * INPUT_NOOFROWS_FREQUENCY
	 */
	public static String INPUT_NOOFROWS_FREQUENCY = "INPUT_NOOFROWS_FREQUENCY";
	/**
	 * INPUT_OFFERTYPE_FREQUENCY
	 */
	public static String INPUT_OFFERTYPE_FREQUENCY =
		"INPUT_OFFERTYPE_FREQUENCY";
	/**
	 * INPUT_FREQUENCY
	 */
	public static String INPUT_FREQUENCY = "FREQUENCY";
	/**
	 * INPUT_FREQUENCYTYPE
	 */
	public static String INPUT_FREQUENCYTYPE = "F";

	public static int paymentTypePost = 1;

	public static int paymentTypeCreditCard = 3;

	/*******************************************
	 * VIEW CALENDAR PRODUCT SEARCH  - CONSTANTS 		   *
	 *******************************************/

	/**
	* Constants for Option : CRMVCPOnload
	*/
	//	   ACTION_CRMVCPONLOAD
	public static String ACTION_CRMVCPONLOAD = "/CRMVCPOnload";

	/**
	 * Constants for Option : CRMVCPGetMClassCodes
	 */
	//	   ACTION_CRMVCPGETMCLASSCODES
	public static String ACTION_CRMVCPGETMCLASSCODES = "/CRMVCPGetMClassCodes";

	//	   INPUT_VIEWCALENDARPRODUCTSSO
	public static String INPUT_VIEWCALENDARPRODUCTSSO =
		"INPUT_ViewCalendarProductsSO";

	/**
	 * Constants for Option : CRMVCPAttach
	 */
	//	   ACTION_CRMVCPATTACH
	public static String ACTION_CRMVCPATTACH = "/CRMVCPAttach";

	/**
	 * Constants for Option : CRMVCPGetSClassCodes
	 */
	//	   ACTION_CRMVCPGETSCLASSCODES
	public static String ACTION_CRMVCPGETSCLASSCODES = "/CRMVCPGetSClassCodes";

	/**
	 * Constants for Option : CRMVCPCancel
	 */
	//	   ACTION_CRMVCPCANCEL
	public static String ACTION_CRMVCPCANCEL = "/CRMVCPCancel";

	// RESULT_VIEWCALENDARPRODUCTSEARCHSO
	public static String RESULT_VIEWCALENDARPRODUCTSO =
		"RESULT_VIEWCALENDARPRODUCTSEARCHSO";

	// RESULT_EDITVIEWCALENDARPRODUCTSEARCHSO
	public static String RESULT_EDITVIEWCALENDARPRODUCTSO =
		"RESULT_EDITVIEWCALENDARPRODUCTSEARCHSO";

	//	ATTACHVIEWCAMPAIGNCALENDARSO
	public static String ATTACHVIEWCAMPAIGNCALENDARSO =
		"ATTACHVIEWCAMPAIGNCALENDARSO";

	/**
	 * Constants for Option : CRMCMCRSaveBaseCriteria
	 */
	public static String ACTION_CRMCMCRADDBASECRITERIA =
		"/CRMCMCRAddBaseCriteria";
	public static String ACTION_CRMCMCRBASECRITERIA =
		"/CRMCMCRBaseCriteriaOnload";

	public static String ACTION_CRMCMCRCLKBASESINGLEORDER =
		"/CRMCMCRCLKBaseSingleOrder";

	public static String ACTION_CRMCMCRCLKBASECROSSORDER =
		"/CRMCMCRCLKBaseCrossOrder";

	public static String ACTION_CRMCMCRCLKBASEGROUPPURCHASE =
		"/CRMCMCRCLKBaseGroupPurchase";

	public static String ACTION_CRMCMCRSAVEBASECRITERIADEFINITION =
		"/CRMCMCRSaveBaseCriteriaDefinition";

	public static String ACTION_CRMCMCRUPDATEBASECRITERIADEFINITION =
		"/CRMCMCRUpdateBaseCriteriaDefinition";

	public static String ACTION_CRMCMCRCANCELBASECRITERIA =
		"/CRMCMCRCancelBaseCriteria";

	public static String ACTION_CRMCMCREDITBASECRITERIA =
		"/CRMCMCREditBaseCriteria";

	public static String ACTIONDELETEBASECITERIA = "/CRMCMCRDeleteBaseCriteria";

	public static String INPUT_CAMPAIGNSESSION = "CAMPAIGNSESSION";

	public static String PRGeneration_BATCHDAO_NAME =
		"ehsn.et1.db.crm.batch.dao.PurchaseRequestGenerateBatchDAO";

	public static String STOCKREDUCTION_DOWNLOAD_BATCHDAO =
			"ehsn.et1.db.crm.batch.dao.ImportStockReductionProductsBatchDAO";

	public static int INPUT_TAIWAN_COUNRY_CODE = 9002;

	/** CONSTANTS FOR CRM REPORTS BEGINS */

	/**
	 * Constants for Option : CompVsCat
	 */
	public static String ACTION_COMP_CAT_ONLOAD = "/CompVsCat";

	/**
	 * Constants for Option : CompVsSLA
	 */
	public static String ACTION_COMP_SLA_ONLOAD = "/CompVsSLA";

	/**
	 * Constants for Option : CompVsIncompleteDefn
	 */
	public static String ACTION_COMP_INCOMPLETE_DEFN_ONLOAD =
		"/CompVsIncompleteDefn";

	/**
	 * Constants for Option : CustAccAnalysis
	 */
	public static String ACTION_CUST_ACC_ANALYSIS_ONLOAD = "/CustAccAnalysis";

	/**
	 * Constants for Option : getIncompleteDefnReport
	 */
	public static String ACTION_COMPLAINT_REPORT = "/getIncompleteDefnReport";

	/**
	 * Constants for Option : getCompCatReport
	 */
	public static String ACTION_CATEGORY_REPORT = "/getCompCatReport";

	/**
	 * Constants for Option : getCompSLAReport
	 */
	public static String ACTION_SLA_REPORT = "/getCompSLAReport";

	/**
	 * Constants for Option : getCustAccAnalysisReport
	 */
	public static String ACTION_CUST_ACC_ANALYSIS_REPORT =
		"/getCustAccAnalysisReport";

	/** CONSTANTS FOR CRM REPORTS ENDS */

	/******************************************************************************
	 * CRM ITERATION II CONSTANTS DEFINITION BLOCK ENDS
	 ******************************************************************************/

	/******************************************************************************
	 * CRM ITERATION III CONSTANTS DEFINITION BLOCK BEGINS
	 ******************************************************************************/
	public static String CROSSELLUPSELL_PRODUCT = "CROSSELLUPSELLPRODUCT";
	public static String PRIME_PRODUCT = "PRIMEPRODUCT";
	public static String PRODUCT_SEARCH_FOR = "SEARCHFOR";
	public static String RESULT_CROSSELLUPSELLPRODUCT =
		"RESULTCROSSELLUPSELLPRODUCT";
	public static String RESULT_PRIMEPRODUCT = "RESULTPRIMEPRODUCT";
	public static String RESULT_EDITPRIMEPRODUCT = "RESULTEDITPRIMEPRODUCT";
	public static String RESULT_EDITCROSSELLUPSELLPRODUCT =
		"RESULTEDITCROSSELLUPSELLPRODUCT";
	public static char PRODUCTTYPE_PRIME = 'P';
	public static char PRODUCTTYPE_CROSSSELLUPSELL = 'C';

	public static String STORE_CRITERIA_ID = "STORE_CRITERIA_ID";
	public static String GET_PDT_TO_PDT_MAPDETAILS =
		"GET_PDT_TO_PDT_MAPDETAILS";
	public static String EDIT_CRITERIA_ID = "EDIT_CRITERIA_ID";
	public static String SEARCH_PRODUCT_CRITERIA = "SEARCH_PRODUCT_CRITERIA";
	public static String DELETE_PRODUCT_PRODUCTMAP =
		"DELETE_PRODUCT_PRODUCTMAP";
	public static String GET_CROSSUPSELL_LIST = "GET_CROSSUPSELL_LIST";

	//	For viewing the product product map list starts
	public static String GET_CROSSUPSELL_LIST_NEXT =
		"GET_CROSSUPSELL_LIST_NEXT";
	public static String GET_CROSSUPSELL_LIST_PREVIOUS =
		"GET_CROSSUPSELL_LIST_PREVIOUS";
	public static String GET_CROSSUPSELL_LIST_NEXT_MODIFY =
		"GET_CROSSUPSELL_LIST_NEXT_MODIFY";
	public static String GET_CROSSUPSELL_LIST_PREVIOUS_MODIFY =
		"GET_CROSSUPSELL_LIST_PREVIOUS_MODIFY";
	public static String CHECK_PRODUCT_MODIFIED = "CHECK_PRODUCT_MODIFIED";
	//	For viewing the product product map list ends

	//For product List starts
	public static String GET_PRODUCT_LIST_NEXT = "GET_PRODUCT_LIST_NEXT";
	public static String GET_PRODUCT_LIST_PREVIOUS =
		"GET_PRODUCT_LIST_PREVIOUS";

	public static String GET_OCCASION_PRODUCT_LIST_NEXT =
		"GET_OCCASION_PRODUCT_LIST_NEXT";
	public static String GET_OCCASION_PRODUCT_LIST_PREVIOUS =
		"GET_OCCASION_PRODUCT_LIST_PREVIOUS";

	//	For product List ends

	//Max Value For Long
	public static long GET_MAXVALUE_FORLONG = 2147483647;

	//For view the occasion product map list starts
	public static String GET_OCCASION_LIST_NEXT = "GET_OCCASION_LIST_NEXT";
	public static String GET_OCCASION_LIST_PREVIOUS =
		"GET_OCCASION_LIST_PREVIOUS";
	public static String GET_OCCASION_LIST_MODIFY_NEXT =
		"GET_OCCASION_LIST_MODIFY_NEXT";
	public static String GET_OCCASION_LIST_MODIFY_PREVIOUS =
		"GET_OCCASION_LIST_MODIFY_PREVIOUS";
	public static String CHECK_OCC_PDT_MODIFIED = "CHECK_OCC_PDT_MODIFIED";
	public static String GET_OCCASIONDETAILS = "GET_OCCASIONDETAILS";
	public static String VALIDATE_OCCASION_TITLE = "VALIDATE_OCCASION_TITLE";
	public static String OCCASIONBIRTHDAY = "1001";
	public static String OCCASIONSPOUSEBIRTHDAY = "1002";
	public static String OCCASIONCHILD1BIRTHDAY = "1003";
	public static String OCCASIONCHILD2BIRTHDAY = "1004";
	public static String OCCASIONWEDDINGANNIVERSARY = "1005";
	public static String OCCASIONDELIVERYDATE = "1006";
	public static int OCCASIONMEDIANONE = 4100;
	public static String OCCASION_TITLE = "OCCASION_TITLE";
	public static String FAXTABLENAME = "S_CTI13";
	//For view the occasion product map list ends

	//Occasion Catgeory
	public static String OCCASION_CATEGORY_GENERAL = "1001";
	public static String OCCASION_CATEGORY_CUSTOMER_SPECIFIC = "1002";
	public static String OCCASIONTYPE_OUTBOUNDCALL = "OCCASIONOUTBOUNDCALL";
	public static int OCCASIONBATCH_SMS_SENDORDERBY=4;
	public static String OCCASIONBATCH_SMS_SENDSMSC=null;
	public static String  OCCASIONBATCH_SMS_SENDSTATCD="00";

	//Lead Time Units
	public static int LEADTIME_UNIT_DAYS = 1001;

	//Occasion product Query Id
	public static String ADD_OCCASION_PRODUCTMAP = "ADD_OCCASION_PRODUCTMAP";
	public static String EDIT_OCCASION_PRODUCTMAP = "EDIT_OCCASION_PRODUCTMAP";
	public static String DELETE_OCCASION_PRODUCTMAP =
		"DELETE_OCCASION_PRODUCTMAP";

	//Process Modes
	public static String MODE = "PRODUCT_MODE";
	public static String OCCASION_MODE = "OCCASION_MODE";
	public static String MODE_EDIT = "EDITMODE";
	public static String MODE_ADD = "ADDMODE";

	//To get the occasion details and the search criteria when edit is clicked
	public static String GET_OCCASION_PRODUCT_DETAILS = "GET_OCC_PDT_DETAILS";

	//to get the customer centric details.
	public static String GET_CUSTOMERCENTRIC_DETAILS =
		"GET_CUSTOMERCENTRIC_DETAILS";

	//To hold the last modified TimeStamp
	public static String LASTMODIFIEDTS = "LASTMODIFIEDTS";

	//To insert and update records in Customer CrossSell UpSell
	public static String CUSTOMER_CRSUPSELL_UPDATE =
		"CUSTOMER_CRSUPSELL_UPDATE";
	public static String CUSTOMER_CRSUPSELL_INSERT =
		"CUSTOMER_CRSUPSELL_INSERT";

	public static String GET_CUST_CENTRIC_CRSSUPSELLPDTS =
		"GET_CUST_CENTRIC_CRSSUPSELLPDTS";

	//	For customer CrossSell UpSell Product List starts
	public static String CUSTCRSSUPSELL_PDT_LIST_NEXT =
		"CUSTCRSSUPSELL_PDT_LIST_NEXT";
	public static String CUSTCRSSUPSELL_PDT_LIST_PREVIOUS =
		"CUSTCRSSUPSELL_PDT_LIST_PREVIOUS";
	//	For customer CrossSell UpSell Product List ends

	//	For customer CrossSell UpSell Product List starts
	public static String PDT_CRSSUPSELL_PDT_LIST_NEXT =
		"PDT_CRSSUPSELL_PDT_LIST_NEXT";
	public static String PDT_CRSSUPSELL_PDT_LIST_PREVIOUS =
		"PDT_CRSSUPSELL_PDT_LIST_PREVIOUS";
	//	For customer CrossSell UpSell Product List ends

	//	To get the list of occasions  for the CrossSell UpSell
	public static String GET_OCCASIONLIST = "GET_OCCASIONLIST";

	//Constants for CrossSellUpSellExecution
	public static String GETCROSSSELLUPSELLPDT = "GETCROSSSELLUPSELLPDT";
	public static String CUSTCENTRIC_EXE_PDT_SRCH =
		"CRMCustCentricExePdtSearch";
	public static String OCC_EXE_PDT_SRCH = "CRMOccasionExePdtSearch";
	public static String PDT_EXEC_PDT_SRCH = "CRMProductExePdtSearch";
	public static String CROSSSELLUPSELLPRODUCTLIST =
		"CROSSSELLUPSELLPRODUCTLIST";
	public static String OCCASIONLIST = "OCCASIONLIST";
	public static String OCCASIONPRODUCTLIST = "OCCASIONPRODUCTLIST";

	/****************************************************
		 * DISCOUNT COUPON LISTING AND PLANNING  - CONSTANTS
		 ****************************************************/

	/**
	* Constants for Option :
	*/
	public static String ACTION_CRMLISTCOUPONTYPESELECT =
		"/CRMLISTCouponTypeSelect";

	/**
	* Constants for Option :
	*/

	public static String RESULT_DEPARTMENTCODEDETAILSVO =
		"RESULT_DepartmentCodeDetailsVO";

	/**
	* Constants for Option :
	*/
	public static String RESULT_DISCOUNTCOUPONDETAILSVO =
		"RESULT_DiscountCouponDetailsVO";

	/**
	* Constants for Option :
	*/

	public static String ACTION_CRMLISTPLANCOUPON = "/CRMLISTPlanCoupon";

	/**
	* Constants for Option :
	*/

	public static String ACTION_CRMLISTSEARCH = "/CRMLISTSearch";

	/**
	* Constants for Option :
	*/

	public static String ACTION_CRMLISTCANCEL = "/CRMLISTCancel";

	public static String RESULT_DISCOUNTCOUPONLIST =
		"/RESULT_DiscountCouponList";
	public static String DISCOUNTSEARCHSO = "DiscountSearchSO";
	public static int SELECT = -1;

	public static int NO_SERIAL_CODE = 1002;

	public static String ACTION_CRMDCCDepartmentSelect =
		"/CRMDCCDepartmentSelect";

	public static String ACTION_CRMDCCPLANCOUPON = "/CRMDCCPlanCoupon";

	public static String ACTION_CRMDCCSERIALCOUPONTYPE =
		"/CRMDCCSerialCouponType";

	public static String ACTION_CRMDCCNOSERIALCOUPONTYPE =
		"/CRMDCCNoSerialCouponType";

	public static String ACTION_CRMDCCBOOKLETCOUPONTYPE =
		"/CRMDCCBookletCouponType";
	
	public static String ACTION_CRMDCCELECTRONICCOUPONTYPE =
		"/CRMDCCElectronicCouponType";
	
	public static String ACTION_CRMDCCBOOKLETNOOFPAGES =
		"/CRMDCCBookletNoOfPages";

	public static String ACTION_COUPONDEPARTMENTCODE =
		"/CRMDCCCouponDepartmentCode";

	public static String ACTION_CRMDCCDISCOUNTCOUPONSAVE =
		"/CRMDCCDiscountCouponSave";

	public static String NOSERIALSECTION = "NOSERIALSECTION";

	public static String SERIALSECTION = "SERIALSECTION";

	public static String BOOKLETSECTION = "BOOKLETSECTION";
	
	public static String ELECTRONICECTION = "ELECTRONICECTION";

	public static String DISCOUNTCOUPONSTATUS_DOMAINNAME =
		"DISCOUNT_COUPON_STATUS";

	public static String NOSERIAL_USAGEDOMAIN = "NOSERIAL_USAGE";

	public static String SERIALBOOKLET_USAGEDOMAIN = "SERIALBOOKLET_USAGE";

	public static String DISCOUNTCOUPONTYPE_DOMAIN = "DISCOUNTCOUPONTYPE";

	public static char COUPONVALID = 'Y';

	public static char COUPONINVALID = 'N';

	public static char COUPONDATEEXPIRY = 'R';

	public static char COUPONNOCAMPAIGN = 'C';

	public static char COUPONUSED = 'U';
	
	public static char COUPONBELONGTOOTHERCUSTOMER = 'O';
	
	public static char COUPONNOTBELONGTOANYONE = 'A';

	public static int MULTIPLEUSAGE = 1002;


	public static int CUSTOMERCENTRIC  =1001;

	public static int SINGLEUSAGE = 1003;

	public static String DISCOUNTPUBLISHERCODE = "D";

	public static String DISCOUNTPUBLISHER = "DISCOUNTPUBLISHER";

	public static String DISCOUNTDEPARTMENT = "DISCOUNTDEPARTMENT";

	public static String RESULT_DISCOUNTDEPARTMENTDETAILS =
		"RESULT_DISCOUNTDEPARTMENTDETAILS";

	public static String RESULT_DISCOUNTPUBLISHERDETAILS =
		"RESULT_DISCOUNTPUBLISHERDETAILS";

	public static String DISCOUNTUNITDOMAIN = "DISCOUNT_UNIT";
	public static String RESULT_DISCOUNTCOUPONMASTERSO =
		"RESULT_DISCOUNTCOUPONMASTERSO";

	public static long COUPONSTATUS_DRAFT = 1002;

	public static long COUPONSTATUS_SENDTOPUBLISHER = 1003;

	public static long COUPONSTATUS_RECEIVEDFROMPUBLISHER = 1004;

	public static int COUPONSTATUS_SENDTOPUBLISHERSEARCH = 1003;

	public static int COUPONSTATUS_RECEIVEDFROMPUBLISHERSEARCH = 1004;

	public static String ACTION_SAVEDISCOUNTCOUPON =
		"/CRMDCCSaveDiscountCoupon";

	public static String ACTION_CRMDCCDELETEDISCOUNTCOUPON =
		"/CRMDCCDeleteDiscountCoupon";

	public static String RESULT_DISCOUNTPRODUCTS = "RESULT_DISCOUNTPRODUCTS";

	public static char DISCOUNTCOUPON_INSERT = 'I';

	public static char DISCOUNTCOUPON_UPDATE = 'U';

	public static String ACTION_CRMDCCEDITCOUPON = "/CRMDCCEditCoupon";

	public static String RESULT_COUPONDETAILS = "RESULT_COUPONDETAILS";

	public static String RESULT_EDITCOUPONDETAILS = "RESULT_EDITCOUPONDETAILS";

	public static String ACTION_CRMDCCSENDTOPUBLISHER =
		"/CRMDCCSendToPublisher";

	public static String ACTION_CRMDCCRECEIVEFROMPUBLISHER =
		"/CRMDCCReceiveFromPublisher";

	public static String BOOKLETPAGENO = "BOOKLETPAGENO";

	public static String BOOKLETPAGENOVALUE = "1";

	public static String ACTION_CRMDCCNEXTBOOKLETPAGE =
		"/CRMDCCNextBookletPage";

	public static String ACTION_CRMDCCPREVIOUSBOOKLETPAGE =
		"/CRMDCCPreviousBookletPage";

	public static String ACTION_CRMDCCProductSearch = "/CRMDCCProductSearch";

	public static String ACTION_CRMDCCSERIALTYPESEARCH =
		"/CRMDCCSerialCouponTypeSearch";

	public static String ACTION_CRMDCCBOOKLETTYPESEARCH =
		"/CRMDCCBookletCouponTypeSearch";

	public static String ACTION_CRMDCCNOSERIALTYPESEARCH =
		"/CRMDCCNoSerialCouponTypeSearch";

	public static String ACTION_CRMDCCCANCELDISCOUNTCOUPONDEFINITION =
		"/CRMDCCCancelDiscountCouponDefinition";

	public static long DISCOUNTCOUPONMAXLIMIT = 999999;

	public static int COUPONMAXLIMITEXCEEDED = 2;

	public static int COUPONSUCCESS = 1;

	public static int COUPONFAILURE = 0;

	public static String ACTION_CRMDCCONLOAD = "/CRMDCCOnLoad";

	public static String ACTION_CRMDCCSEARCH = "/CRMDCCSearch";

	public static String ACTION_CRMDCCDepartmentSelectSearch =
		"/CRMDCCDepartmentSelectSearch";

	public static String ACTION_CRMDCCPREVIOUSSEARCH =
		"/CRMDCCpreviousDiscountCouponSearch";

	public static String ACTION_CRMDCCNEXTSEARCH =
		"/CRMDCCnextDiscountCouponSearch";

	public static String ACTION_CRMDCCMODIFYSEARCH =
		"/CRMDCCDiscountCouponSearchModify";

	public static String ACTION_CRMDCCSEARCHADD = "/CRMDCCSearchAdd";

	public static int CONCURRENCYCHECKFAILURE = 4;

	public static String ACTION_CRMDCCCANCELSEARCH = "/CRMDCCCancelSearch";

	public static String ACTION_CRMDCCSearchReceiveFromPublisher =
		"/CRMDCCSearchReceiveFromPublisher";

	public static int DISCOUNTUNITPERCENTAGE = 1001;

	public static int DISCOUNTUNITNTD = 1002;

	public static String DISCOUNT_BATCH_ID = "CRM_015";

	public static long DISCOUNT_PARAM_ID = 1001;

	/**
	 * Constants for File Name : Export File Name
	 */

	public static String DISCOUNTCOUPONFILE = "DiscountCouponFile";

	public static String COUPONDETAILSSHEET = "CouponDetailsSheet";

	public static String DEPARTMENTCODESLIST = "DEPARTMENTCODESLIST";

	/****************************************************
	 * CUSTOMER SURVEY CONSTANTS
	 ****************************************************/

	/**
	 * CUSTOMER SURVEY LISTING, PARTICIPANTS AND RESPONSE
	 */

	public static String CUSTOMERSURVEYSEARCHSO = "CustomerSurveySearchSO";
	public static String ACTION_CRMCSSCANCEL = "CustomerSurveyCancel";

	public static String RESULT_CUSTOMERSURVEYSEARCHLIST =
		"Result_CustomerSurveySearchList";
	public static String CUSTOMERSURVEYRESPONSEVO = "customerSurveyResponseVO";
	public static String RESULT_CUSTOMERSURVEYRESPONSESEARCHLIST =
		"customerSurveyResponseSearchSOList";

	public static String SURVEYNO = "surveyNO";

	public static String PERCENTAGE = "%";

	public static String ACTION_CRMCSRONLOAD = "/CRMCSROnLoad";
	public static String ACTION_CRMCSRVIEW = "/CRMCSRView";
	public static String ACTION_CRMCSLONLOAD = "/CRMCSLOnLoad";
	public static String ACTION_CRMCSLSEARCH = "/CRMCSLSearch";
	public static String ACTION_CRMCSLCANCEL = "/CRMCSCancel";
	public static String ACTION_CRMCSPONLOAD = "/CRMCSPOnLoad";
	public static String ACTION_CRMCSPSEARCH = "/CRMCSPSearch";
	public static String ACTION_CRMCSPCLEAR = "/CRMCSPClear";
	public static String ACTION_CRMCSPCANCEL = "/CRMCSPCancel";
	public static String MEMBERSHIPLEVEL = "membershipLevel";
	public static String SOURCEINFORMATION = "sourceInformation";
	public static String ACTION_CRMCSLCancel = "/CRMCSLCancel";

	public static String CUSTOMERLIST = "customerList";
	public static String ACTION_CRMCSPRESPONSELOAD = "/CRMCSPResponseLoad";
	public static String TEXTFIELDFLAG = "Y";

	/**
	 * SURVEY DEFINITION CONSTANTS
	 */

	public static String ACTION_CRMCSDOnload = "/CRMCSDOnload";

	public static String ACTION_CRMCSDDeleteQuestion = "/CRMCSDDeleteQuestion";

	public static String ACTION_CRMCSDMoveUpQuestion = "/CRMCSDMoveUpQuestion";

	public static String ACTION_CRMCSDMoveDownQuestion =
		"/CRMCSDMoveDownQuestion";

	public static String ACTION_CRMCSDSelectAnswerForQuestion =
		"/CRMCSDSelectAnswerForQuestion";

	public static String ACTION_CRMCSDAddAnswer = "/CRMCSDAddAnswer";

	public static String ACTION_CRMCSDEditAnswer = "/CRMCSDEditAnswer";

	public static String ACTION_CRMCSDDeleteAnswer = "/CRMCSDDeleteAnswer";

	public static String ACTION_CRMCSDAnswerAddToList =
		"/CRMCSDAnswerAddToList";

	public static String RESULT_ANSWERSFORQUESTION =
		"RESULT_ANSWERSFORQUESTION";

	public static String ANSWERSFORQUESTIONSECTION =
		"ANSWERSFORQUESTIONSECTION";

	public static String ENTERANSWERSECTION = "ENTERANSWERSECTION";

	public static String ANSWERCHOSENFOREDIT = "ANSWERCHOSENFOREDIT";

	public static String ACTION_CRMCSDPreviousQuestionList =
		"/CRMCSDPreviousQuestionList";

	public static String ACTION_CRMCSDNextQuestionList =
		"/CRMCSDNextQuestionList";

	public static String SURVEYQUESTIONPAGE = "SURVEYQUESTIONPAGE";

	public static String SURVEYQUESTIONPAGENUMBER = "1";

	public static String RESULT_CUSTOMERSURVEYMASTERSO =
		"RESULT_CUSTOMERSURVEYMASTERSO";

	public static String ACTION_CRMCSDRefreshSurveyDefinition =
		"/CRMCSDRefreshSurveyDefinition";

	public static String SELECTEDSURVEYQUESTION = "SELECTEDSURVEYQUESTION";

	public static String SURVEYDEFINITIONPAGE = "SURVEYANSWERPAGE";

	public static String SURVEYDEFINITIONPAGEVALUE = "1";

	public static String ACTION_CRMCSDDeleteSurveyDefinition =
		"/CRMCSDDeleteSurveyDefinition";

	public static String EDITANSWERNO = "EDITANSWERNO";

	public static String ACTION_CRMCSDSaveDefinition = "/CRMCSDSaveDefinition";

	public static String ACTION_CRMCSDAnswerCancel = "/CRMCSDAnswerCancel";

	public static long SURVEYSTATUS_DEFINED = 1001;

	public static String SURVEYDEFINITIONVO = "SURVEYDEFINITIONVO";

	public static String QUESTIONDEFINITIONVOS = "QUESTIONDEFINITIONVOS";

	public static String ANSWERDEFINITIONVOS = "ANSWERDEFINITIONVOS";

	public static String SURVEYQUESTIONDEFINITION_TABLENAME =
		"TCRM_SURVEYQUESTIONDEFINITION";

	public static String ACTION_CRMCSDEditSurveyDefinition =
		"/CRMCSDEditSurveyDefinition";

	/**
	 * CUSTOMER SURVEY ADD QUESTIONS
	 */
	public static String ACTION_CRMCSQEditQuestion = "/CRMCSQEditQuestion";

	public static String ACTION_CRMCSQAddToList = "/CRMCSQAddToList";

	public static String ACTION_CRMCSQCancelQuestionDefinition =
		"/CRMCSQCancelQuestionDefinition";

	public static String ACTION_CRMCSQNextList = "/CRMCSQNextList";

	public static String ACTION_CRMCSQPreviousList = "/CRMCSQPreviousList";

	public static String ADDQUESTIONPAGENO = "ADDQUESTIONPAGENO";

	public static String ADDQUESTIONPAGEVALUE = "1";

	public static String RESULT_SURVEYQUESTIONDETAILSSO =
		"RESULT_SURVEYQUESTIONDETAILSSO";

	public static String RESULT_ADDQUESTIONNO = "RESULT_ADDQUESTIONNO";

	public static String RESULT_EDITQUESTIONNO = "RESULT_EDITQUESTIONNO";

	public static String ACTION_CRMCSQSaveQuestionsToList =
		"/CRMCSQSaveQuestionsToList";

	public static String QUESTIONADDTOLISTSAVE = "QUESTIONADDTOLISTSAVE";

	public static String QUESTIONNUMBER = "QUESTIONNUMBER";

	public static String QUESTIONNUMBERVALUE = "0";

	public static String EDITQUESTIONNAME = "EDITQUESTIONNAME";

	public static String EDITQUESTIONRESPONSETYPE = "EDITQUESTIONRESPONSETYPE";

	public static String QUESTIONPAGINGLOGICMAP = "QUESTIONPAGINGLOGICMAP";

	public static String ACTION_CRMCSDCreateLikeSurveyDefinition =
		"/CRMCSDCreateLikeSurveyDefinition";

	public static long SURVEYCONCURRENCYCHECKFLAG = -2;

	public static long FAILUREFLAG = -1;

	public static String ACTION_CRMCSDCancelSurveyDefinition =
		"/CRMCSDCancelSurveyDefinition";

	/**
	 * CUSTOMER SURVEY - RELEASE
	 */
	public static int NOTSENTSTATUS = 1001;

	public static int SENTSTATUS = 1002;

public static String SURVEYANALYSISREPORTFILENAME = "SurveyAnalysisReport_";

	static String SURVEY_IMPORT_FILENAME = "SurveyTargetCustomers_";

	public static String IMPORTSURVEYCUSTOMERSBATCHID = "CRM_020";

	public static int IMPORTSURVEYCUSTOMERS_PARAM1 = 1001;

	public static int IMPORTSURVEYCUSTOMERS_PARAM2 = 1002;

	public static String IMPORTSURVEYTARGETS_BATCH_DAO =
			"ehsn.et1.db.crm.batch.dao.ImportSurveyTargetCustomersBatchDAO";

	public static String SURVEY_IMPORT_ERRORFILENAME =
			"ErrorLog_Survey_TargetCustomers_";

	public static String ACTION_CRMCSRLImportCustomers =
		"/CRMCSRLImportCustomers";

	public static String RESULT_SELECTEDCUSTOMERSLIST =
		"RESULT_SELECTEDCUSTOMERSLIST";

	public static String ACTION_CRMCSRLSearchQuestionAndAnswers =
		"/CRMCSRLSearchQuestionAndAnswers";

	public static String ACTION_CRMCSRLOnload = "/CRMCSRLOnload";

	public static String RESULT_CUSTOMERSURVEYRELEASESO =
		"RESULT_CUSTOMERSURVEYRELEASESO";

	public static String RESULT_RELEASESURVEYSEARCHSO =
		"RESULT_RELEASESURVEYSEARCHSO";

	public static String ACTION_CRMCSRLCustomerSearchCriteria =
		"/CRMCSRLCustomerSearchCriteria";

	public static String ACTION_CRMCSRLRequestId = "/CRMCSRLRequestId";

	public static String ACTION_CRMCSRLReleaseSurvey = "/CRMCSRLReleaseSurvey";

	public static long SURVEYRELEASESTATUS = 1002;

	public static int SURVEYSTATUS_RELEASE = 1002;

	public static int SURVEYDEFINEDSTATUS = 1001;

	public static String COMMUNICATION_MEDIA = "COMMUNICATION_MEDIA";

	public static String CUSTOMERSEARCHCRITERIAVO = "CUSTOMERSEARCHCRITERIAVO";

	public static String ACTION_CRMCSRLCancelReleaseSurvey =
		"/CRMCSRLCancelReleaseSurvey";

	public static String ACTION_CRMCSRLSurveyDefinition =
		"/CRMCSRLSurveyDefinition";

	public static String YESFLAGFORSURVEYRELEASE = "Y";

	public static String ACTION_CRMCSRLSearchCustomer =
		"/CRMCSRLSearchCustomer";

	public static String SEARCH_RELEASECUSTOMERCRITERIA =
		"SEARCH_RELEASECUSTOMERCRITERIA";

	public static String RESULT_RELEASECUSTOMERLIST =
		"RESULT_RELEASECUSTOMERLIST";

	public static String CANCELQUESTIONDEFINITION = "CANCELQUESTIONDEFINITION";

	public static String ACTION_CRMCSRLClearCustomerSearch =
		"/CRMCSRLClearCustomerSearch";

	public static String ACTION_CRMSurveyResponseByNet =
		"/CRMSurveyResponseByNet";

	public static String ACTION_CRMSurveyResponseByNetFirstQuestion =
		"/CRMSurveyResponseByNetFirstQuestion";

	public static String SURVEYBYNET = "SURVEYBYNET";

	/****************************************************
	 * 					SURVEY BATCH CONSTANTS			*
	****************************************************/
	public static String SURVEYANNOUNCEMENT_BATCHDAO_NAME =
		"ehsn.et1.db.crm.batch.dao.SurveyAnnouncementDetailsDAO";

	public static int CTISURVEYREFERENCEID = 1002;

	public static int SURVEYPOSTEDSTATUS = 1003;

	public static int SURVEYREFERENCETYPE = 4457;

	/****************************************************
	* 					LotteryDefinitionSTARTS     	*
	****************************************************/

	//JNDI NAMES
	public static String LOTTERYDEFINITIONJNDI = "LotteryDefinitionEJBJNDI";

	/**
	 * Constants for Option : RESULT_LOTTERYCAMPAIGNDETAILSSO
	 */

	public static String RESULT_LOTTERYCAMPAIGNDETAILSSO =
		"ResultLotteryCampaignDetailsSO";

	/**
	 * Constants for Option : RESULT_LOTTERYDEFINITIONDETAILSSO
	 */

	public static String RESULT_LOTTERYDEFINITIONDETAILSSO =
		"ResultLotteryDefinitionDetailsSO";

	/**
	 * Constants for Option : SEARCH_LOTTERYDEFINITIONDETAILSSO
	 */
	public static String SEARCH_LOTTERYDEFINITIONDETAILSSO =
		"SearchLotteryDefinitionDetailsSO";

	/**
	 * Constants for Option : RESULT_LOTTERYWINNERSLISTSO
	 */
	public static String RESULT_LOTTERYWINNERSLISTSO =
		"ResultLotteryWinnersListSO";

	/**
	 * Constants for Option : SEARCH_LOTTERYWINNERSLISTSO
	 */
	public static String SEARCH_LOTTERYWINNERSLISTSO =
		"SearchLotteryWinnersListSO";

	/**
	 * Constants for Option : RESULT_LOTTERYSTATUSLISTSO
	 */
	public static String RESULT_LOTTERYSTATUSLISTSO =
		"ResultLotteryStatusListSO";

	/**
	 * Constants for Option : SEARCH_LOTTERYSTATUSSO
	 */
	public static String SEARCH_LOTTERYSTATUSSO = "SearchLotteryStatusSO";

	/**
	 * Constants for Option : LOTTERY_CRITERIANAMESLIST
	 */
	public static String LOTTERY_CRITERIANAMESLIST = "LotteryCriteriaNamesList";

	/**
	 * Constants for Option : LOTTERY_CRITERIANAMESLIST
	 */
	public static String LOTTERY_CONDUCTED = "LotteryConducted";

	/**
	 * Constants for Option : LOTTERY_CRITERIANAMESLIST
	 */
	public static String LOTTERY_PRIZECRITERIAASSOCIATIONLIST =
		"LotteryPrizeCriteriaAssociationList";

	/**
	 * Constants for Option : LOTTERY_CRITERIANAMESLIST
	 */
	public static String DETAILS_LOTTERYDEFINITIONDETAILSVO =
		"LotteryDefinitionDetailsVO";
	/*
	* Constants for Option : LOTTERY_EXECYTION_WINNERS
	*/
	public static String LOTTERY_EXECUTION_WINNERS_LIST =
		"LotteryExecutionWinnersList";

	/*
	* Constants for Option : LOTTERY_EXECUTION_PRIZE_CATEGORY
	*/
	public static String LOTTERY_EXECUTION_CURRENT_DRAW = "Prizecategoryhit";

	/**
	 * Constants for Option : EDIT_LOTTERYDEFINITIONDETAILSSO
	 */
	public static String EDIT_LOTTERYDEFINITIONDETAILSSO =
		"EditLotteryDefinitionDetailsSO";

	/**
	 * Constants for Option : ACTION_CRMLOTDEFONLOAD
	 */
	// ACTION_CRMLOTDEFONLOAD
	public static String ACTION_CRMLOTDEFONLOAD = "/CRMLOTDEFOnload";

	/**
	 * Constants for Option : ACTION_CRMLOTNEWDEFINITION
	 */
	// ACTION_CRMLOTNEWDEFINITION
	public static String ACTION_CRMLOTNEWDEFINITION = "/CRMLOTNewDefinition";

	/**
	 * Constants for Option : CRMLOTEditDefinition
	 */
	// ACTION_CRMLOTEDITDEFINITION
	public static String ACTION_CRMLOTEDITDEFINITION = "/CRMLOTEditDefinition";

	/**
	 * Constants for Option : CRMLOTWinnersList
	 */
	// ACTION_CRMLOTDELETEDEFINITION
	public static String ACTION_CRMLOTWINLIST = "/CRMLOTWinnersList";

	/**
	 * Constants for Option : CRMLOTWinnersCancel
	 */
	// ACTION_CRMLOTWINCANCEL
	public static String ACTION_CRMLOTWINCANCEL = "/CRMLOTWinnersCancel";

	/**
	 * Constants for Option : CRMLOTStatusList
	 */
	// ACTION_CRMLOTSTATUS
	public static String ACTION_CRMLOTSTATUS = "/CRMLOTStatusList";

	/**
	 * Constants for Option : CRMLOTStatusOk
	 */
	// ACTION_CRMLOTSTATUSOK
	public static String ACTION_CRMLOTSTATUSOK = "/CRMLOTStatusOk";
	/**
		 * Constants for Option : CRMLOTStatusOk
		 */
	// ACTION_CRMLOTSTATUSOK
	public static String ACTION_CRMCMCSHOWPROGRAMS = "/CRMCMCRShowPrograms";

	/**
		 * Constants for Option : CRMLOTStatusOk
		 */
	// ACTION_CRMLOTSTATUSOK
	public static String RESULT_PROGRAMLIST = "PROGRAMLIST";

	/**
		 * Constants for Option : CRMLOTStatusOk
		 */
	// ACTION_CRMLOTSTATUSOK
	public static String RESULT_PROGRAMMAP = "PROGRAMMAP";

	/**
	 * Constants for Option : CRMLOTDeleteDefinition
	 */
	// ACTION_CRMLOTDELETEDEFINITION
	public static String ACTION_CRMLOTDELETEDEFINITION =
		"/CRMLOTDeleteDefinition";

	/**
	 * Constants for Option : CRMLOTCampaignDetails
	 */
	// ACTION_CRMLOTCampaignDetails
	public static String ACTION_CRMLOTCampaignDetails =
		"/CRMLOTCampaignDetails";

	/**
	 * Constants for Option : CRMLOTSaveDefinitionUpdate
	 */
	//	   ACTION_CRMLOTSAVEDEFINITIONUPDATE
	public static String ACTION_CRMLOTSAVEDEFINITIONUPDATE =
		"/CRMLOTSaveDefinitionUpdate";

	/**
	  * Constants for Option : CRMLOTSaveDefinitionInsert
	  */
	//		ACTION_CRMLOTSAVEDEFINITIONINSERT
	public static String ACTION_CRMLOTSAVEDEFINITIONINSERT =
		"/CRMLOTSaveDefinitionInsert";

	/**
	 * Constants for Option : CRMLOTDEFCancel
	 */
	// ACTION_CRMLOTDEFCANCEL
	public static String ACTION_CRMLOTDEFCANCEL = "/CRMLOTDEFCancel";

	/**
	 * Constants for Option : CRMLOTLISTCancel
	 */
	// ACTION_CRMLOTLISTCANCEL
	public static String ACTION_CRMLOTLISTCANCEL = "/CRMLOTLISTCancel";

	/**
	 * Constants for Option : CRMLOTLISTCancel
	 */
	// ACTION_CRMLOTLISTCANCEL
	public static String ACTION_CRMLOTCRViewDetails = "/CRMLOTCRViewDetails";

	/**
	 * Constants for Option : CRMLOTCancel
	 */
	// ACTION_CRMLOTCANCEL
	public static String ACTION_CRMLOTCANCEL = "/CRMLOTCancel";

	/**
	 * Constants for Option : CRMLOTDeleteDefinition
	 */
	// ACTION_CRMLOTDELETELOTTERY
	public static String ACTION_CRMLOTDELETELOTTERY = "/CRMLOTDeleteDefinition";

	/**
	 * CRMLOTConduct
	 */
	//	ACTION_CRMLOTCONDUCT
	public static String ACTION_CRMLOTCONDUCT = "/CRMLOTConduct";

	/**
	 * CRMLOTStartDraw
	 */
	//	ACTION_CRMLOTStartDraw
	public static String ACTION_CRMLOTSTARTDRAW = "/CRMLOTStartDraw";

	/**
	 * CRMLOTExecute
	 */
	//	ACTION_CRMLOTEXECUTE
	public static String ACTION_CRMLOTEXECUTE = "/CRMLOTExecute";

	/**
	 * CRMLOTExecute
	 */
	//	ACTION_CRMLOTCONFIRMWINNERS
	public static String ACTION_CRMLOTCONFIRMWINNERS = "/CRMLOTConfirmWinners";

	/**
	 * Constants for TABLE_TCRM_LOTTERYDEFINITION
	 */
	public static String TABLE_TCRM_LOTTERYDEFINITION =
		"TCRM_LOTTERYDEFINITION";

	/**
	 * Constants for TABLE_TCRM_LOTTERYEXECUTION
	 */
	public static String TABLE_TCRM_LOTTERYEXECUTION = "TCRM_LOTTERYEXECUTION";

	/**
	 * Constants for Option : EDIT_DRAWNO
	 */
	public static String EDIT_DRAWNO = "EDIT_DRAWNO";

	/**
	 * Constants for Option : CLOSE_LOTTERY_STATUS
	 */
	public static String CLOSE_LOTTERY_STATUS = "CloseLotteryStatusPage";

	/**
	 * Constants for Option : CAMPAIGN_MODE
	 */
	public static String CAMPAIGN_MODE = "CampaignMode";

	/**
	 * Constatns for CONDUCTLOTTERY_DRAWDETAILS
	 */
	public static String CONDUCTLOTTERY_DRAWDETAILS =
		"ConductLotteryDrawDetails";

	/**
	 * Constatns for CONDUCTLOTTERY_OPTIONS
	 */
	public static String CONDUCTLOTTERY_OPTIONS = "ConductLotteryOptions";

	/**
	 * Constatns for LOTTERYONCE
	 */
	public static String LOTTERYONCE = "O";

	/**
	 * Constatns for LOTTERYFOREACHPRIZE
	 */
	public static String LOTTERYFOREACHPRIZE = "E";

	/**
	 * CONDUCT LOTTERY
	 */

	public static String CONDUCTLOTTERY = "ConductLottery";

	/**
	 * EXCLUDEWINNERS
	 */

	public static String EXCLUDEWINNERS = "E";

	/**
	 * NORMALIZE
	 */

	public static String NORMALIZE = "N";

	/**
	 * INCLUDEPRECUST
	 */

	public static String INCLUDEPRECUST = "Y";

	/**
	 * Constants for OUTBOUND CALL MEDIA
	 */
	public static int LOTTERY_POST = 4152;

	/**
	 * Constants for OUTBOUND CALL MEDIA
	 */
	public static int LOTTERY_OUTBOUNDCALL = 4151;

	/**
	 * Constants for EMAIL MEDIA
	 */
	public static int LOTTERY_EMAIL = 4153;

	/**
	 * Constants for SMS MEDIA
	 */
	public static int LOTTERY_SMS = 4150;

	/**
	 * Constants for LOTTERY TO REFERENCE TYPE
	 */

	public static int LOTTERY_REFERENCE_TYPE=1009;

	/**
	 * Constants for LOTTERY_TODO_DESCRIPTION
	 */

	public static int LOTTERY_TODO_DESCRIPTION=4102;

	/**
	 * IS Lottery
	 */
	public static String ISLOTTERY = "IsLottery";

	//Lottery Status constants for CHM service.
	public String LOTTERYSTATUS_EXECUTED = "Lottery_Executed";
	public String LOTTERYSTATUS_NOTEXECUTED = "Lottery_NotExecuted";

	//RESULT_CONDUCTLOTTERYVO
	public String RESULT_CONDUCTLOTTERYVO = "Result_ConductLotteryVO";
	//ACTION_SAVECONDUCTLOTTERYOPTIONS
	public String ACTION_SAVECONDUCTLOTTERYOPTIONS =
		"/CRMLOTSaveConductOptions";

	public int ACCOUNT_REFENCETYPE_CAMPAIGN = 4189;
	public int TRANSACTIONDETAILSID_BONUSPOINT = 1013;
	public int TRANSACTIONDETAILSID_CASH = 1012;

		//	SEQ_MAILDISPATCH
	public static String SEQ_MAILDISPATCH = "S_MAILDISPATCH";


	public static String LOTTERYWINNER = "LOTTERYWINNER";

	public static String LOTTERYMSG = "LOTTERYWINNER";

	/**
	 * Constants for LOTTERY MAILDISPATCH REFERENCE TYPE
	 */

	public static int LOTTERY_MAILDISPATCHREF_TYPE = 4501;

	/**
	 * Constants for LOTTERY ERRORMSGID
	 */

	public static String LOTTERY_ERRORMSGID = "CRM6928";


	/****************************************************
	* 					LotteryDefinition ENDS      	*
	****************************************************/

	/**
	 * Constants for CALLWORKCODE AND CONTACTHISTORY BEGINS
	 */
	public static String CONTACT_CHANNEL = "ContactChannelEJBJNDI";
	public static String CONTACT_HISTORY = "ContactHistoryEJBJNDI";
	public static String CALLWORKCODELIST = "CallWorkCodeList";
	public static String CALLWORKCODEADD = "CallWorkCodeAdd";
	public static String CALLWORKCODEADDVIEW = "CallWorkCodeAddView";
	public static String CALLWORKCODEVO = "CallWorkCodeVO";
	public static String CALLWORKCODEEDIT = "CallWorkCodeEdit";
	public static String CALLWORKCODEEDITVIEW = "CallWorkCodeEditView";
	public static String CALLWORKCODELISTNAVIGATION =
		"CallWorkCodeListNavigation";
	public static String CALLWORKCODELISTTREE = "CallWorkCodeListTree";
	public static long ZERO = 0;
	public static String CONTACTHISTORYNAVIGATION = "ContactHistoryNavigation";
	public static String CONTACTHISTORYLIST = "ContactHistoryList";
	public static String CALLWORKCODECOMMENTSLIST = "CallWorkCodeCommentsList";
	public static String REFERENCEDETAILSLIST = "ReferenceDetailsList";
	public static String CWCCOMMENTS = "CWCComments";
	public static String REFERENCEDETAILS = "ReferenceDetails";
	public static String ADDCONTACTHISTORY = "ACWC";
	public static String CONTACTHISTORY_MOBILENOS = "MobileNos";
	public static String CONTACTHISTORY_IMPORT = "IMPORT_CONTACT_HISTORY";
	public static String CONTACTHISTORY_IMPORTCALLINGLIST = "IMPORTCALLINGLIST";
	public static String INPUT_WHERE_DB_OP=" WHERE ";
	String IMPORTCALLINGLIST_BATCH_ID = "CRM_012";
	String NOTIFICATIONID_ACTIVITYASSIGNED = "CRM_1006";
	public static String CALLINGLIST_IMPORT_FILENAME = "CallingList_";
	public static String SMS_IMPORT_FILENAME="SMS_";
	public static String SMSCUSTOMERLIST_BATCH_ID = "CRM_019";
	public static long SMS1_PARAMID=1004;
	public static long SMS2_PARAMID=1005;
	public static int CONTACTTYPE_POST=1001;
	public static int CONTACTTYPE_EMAIL=1002;
	public static int CONTACTTYPE_FAX=1003;
	public static int CONTACTTYPE_VOICEINBOUND=1004;
	public static int CONTACTTYPE_VOICEOUTBOUND=1005;
	public static int CONTACTTYPE_CTIOUTBOUND=1006;
	public static int CONTACTTYPE_GENESYSEMAILIN=1007;
	public static int CONTACTTYPE_GENESYSEMAILOUT=1008;
	public static int CONTACTTYPE_SMS=1009;
	public static int CONTACTTYPE_IVR=1010;
	public static int CONTACTTYPE_VOICEOUTBOUNDCALLBACK=1011;
	public static long CONTACTHISTORY_SMS_PROJECTCODE=19;
	public static long CONTACTHISTORY_PASSWD_SMS_PROJECTCODE=15;
	public static int CONTACTHISTORY_SMS_SENDORDERBY=8;

	public static String SMS_SETUP_CONSTRAINT="SMS_SETUP";
	public static String CONTACTHISTORY_SMS_SENDDESC="CONTACTHISTORY_SMS_SENDDESC";
	public static String CONTACTHISTORY_SMS_SENDSTATCD="00";
	public static String CONTACTHISTORY_SMS_SENDSMSC=null;
	public static int CUSTOMER_DASHBOARD_ROWNUM=2;

	/**
	 * Constants for CALLWORKCODE AND CONTACTHISTORY ENDS
	 */
	/**
	* Constants for PROMOTIONS STARTS
	*/
	public static String RESULT_PROMOTIONSLIST = "PromotionsList";
	public static String RESULT_PROMOTIONSVO = "PromotionsVO";
	public static String ACTION_PROMOTIONSONLOAD = "/PromotionsOnLoad";
	public static String ACTION_PROMOTIONS_PRODUCTSEARCH =
		"/Promotions_ProductSearchOnLoad";
	public static String ACTION_PROMOTIONSPROGRAMSEARCHCRITERIA =
		"/PromotionsProgramSearchCriteria";
	public static String ACTION_PROMOTIONSCHANNELTYPECHANGE =
		"/PromotionsChannelTypeChange";
	public static String ACTION_PROMOTIONSGETPROGRAM = "/PromotionsGetProgram";
	public static String ACTION_PROMOTIONSSEARCHBYMULTICODEID =
		"/PromotionsSearchByMultiCodeId";
	public static String ACTION_PROMOTIONSSEARCHBYCLASSCODE =
		"/PromotionsSearchByClassCode";
	public static String ACTION_PROMOTIONSSEARCHALLPRODUCTS =
		"/PromotionsSearchAllProducts";
	public static String ACTION_PROMOTIONSGETMCLASSCODES =
		"/PromotionsGetMClassCodes";
	public static String ACTION_PROMOTIONSGETSCLASSCODES =
		"/PromotionsGetSClassCodes";
	public static String ACTION_PROMOTIONSADDTOLIST = "/PromotionsAddToList";
	public static String ACTION_PROMOTIONSATTACHCRITERIA =
		"/PromotionsAttachCriteria";
	public static String ACTION_PROMOTIONSCLEAR = "/PromotionsClear";

	/**
	* Constants for PROMOTIONS ENDS
	*/

	/*******************************************
		 * PUBLISHER DETAILS CONSTANTS             *
	 *******************************************/
	//ACTION_CRMPDSAVEPUBLISHERDETAILS
	public static String ACTION_CRMSAVEPUBLISHERDETAILS =
		"/CRMSavePublisherDetails";

	//ACTION_CRMPDCANCELPUBLISHERDETAILS
	public static String ACTION_CRMCANCELPUBLISHERDETAILS =
		"/CRMCancelPublisherDetails";

	public static String ACTION_CRMDisplayZipCodeDetails =
		"/CRMDisplayZipCodeDetails";
	//ACTION_CRMPDCANCELPUBLISHERDETAILS
	public static String CRM_PUBLISHER_DETAILS_ONLOAD =
		"/CRMPublisherDetailsOnLoad";

	//TABLE_TCRM_TCRM_PUBLISHERDETAILS
	public static String TABLE_TCRM_TCRM_PUBLISHERDETAILS =
		"TCRM_PUBLISHERDETAILS";

	//CRM_PUBLISHER_DETAILS_GETZIPCODE
	public static String CRM_PUBLISHER_DETAILS_GETZIPCODE =
		"/CRMPublisherDetailsZipCode";

	//CRM_CRMUPDATEPUBLISHERDETAILS
	public static String CRM_CRMUPDATEPUBLISHERDETAILS =
		"/CRMUpdatePublisherDetails";

	//CRM_CRMDELETEPUBLISHERDETAILS
	public static String CRM_CRMDELETEPUBLISHERDETAILS =
		"/CRMDeletePublisherDetails";

	//CRM_PUBLISHERLISTONLOAD
	public static String CRM_PUBLISHERLISTONLOAD = "/CRMPublisherListOnLoad";

	//PUBLISHERDETAILSSO
	public static String PUBLISHERDETAILSSO = "PublisherSO";

	//PUBLISHERLISTSERACHSO
	public static String PUBLISHERLISTSERACHSO = "PUBLISHERLISTSERACHSO";

	//PUBLISHERLISTSO
	public static String PUBLISHERLISTSO = "PUBLISHERLISTSO";

	//PUBLISHERZIPCODE
	public static String PUBLISHERZIPCODE = "PUBLISHERZIPCODE";

	//PUBLISHERDETAILSVO
	public static String PUBLISHERDETAILSVO = "PUBLISHERDETAILSVO";

	//ACTION_CRMEDITPUBLISHERDETAILS
	public static String ACTION_CRMEDITPUBLISHERDETAILS =
		"/CRMEditPublisherDetails";

	//PUBLISHEREDITSO
	public static String PUBLISHEREDITSO = "PUBLISHEREDITSO";

	//CRM_CRMZIPCODEDETAILS
	public static String CRM_CRMZIPCODEDETAILS = "/CRMZipCode";

	//PUBLISHERNOOFJOBSPENDING
	public static String PUBLISHERNOOFJOBSPENDING = "PUBLISHERNOOFJOBSPENDING";

	//ACTION_CRMCANCELPUBLISHERLIST
	public static String ACTION_CRMCANCELPUBLISHERLIST =
		"/CRMCancelPublisherList";

	//PUBLISHERID
	public static String PUBLISHERID = "PUBLISHERID";

	//CRM_CERTIFICATE
	public static String CRM_CERTIFICATE = "CERTIFICATE";

	//CRM_DISCOUNTCOUPON
	public static String CRM_DISCOUNTCOUPON = "DISCOUNT COUPON";

	public static char CRM_ISISLAND = 'Y';
	public static char CRM_PUBLISHERTYPE = 'Y';
	public static String PUBLISHER = "PUBLISHER";

	/*******************************************
				MAILDISPATCH CONSTANTS
	*******************************************/
	public static String CRM_MAILDISPATCH_ONLOAD = "/CRMMailDispatchOnLoad";
	public static String CRM_PREVIOUS_MAILDISPATCH = "/previousMailDispatch";
	public static String CRM_NEXT_MAILDISPATCH = "/nextMailDispatch";
	public static String CRM_MAILDISPATCHSEARCHCRITERIA =
		"MailDispatchSearchCriteria";
	public static String ACTION_CRMMAILDISPATCHSEARCHCLICK =
		"/CRMMailDispatchOnSearch";
	public String MAILDISPATCH_SEARCHMODE = "Search";
	public String MAILDISPATCHSO = "MAILDISPATCHSO";
	public static String MAILDISPATCHSEARCHSO = "MAILDISPATCHSEARCHSO";
	public static String CRM_SELECT = "Select";
	public static String MAILDISPATCHLISTSO = "MAILDISPATCHLISTSO";
	public static String ACTION_CRMMAILDISPATCHCANCELCLICK =
		"/CRMMailDispatchCancel";
	public static String MAILDISPATCHNEWSO = "MAILDISPATCHNEWSO";
	public static String CRM_YES = "YES";
	public static String CRM_NO = "NO";
	public static String CRM_SELECTDEFAULT = "-1";
	public static String ACTION_CRMCLICKPOST = "/onClickPost";
	public static String ACTION_CRMSURVEYLISTONLOAD = "/CRMSurveyListOnLoad";
	public static String ACTION_CRMCUSTOMERSURVEY = "/CRMCustomerSurvey";
	public static String ACTION_CRMNEXTONCLICK = "/nextOnClick";
	public static String ACTION_CRMPREVIOUSONCLICK = "/previousOnClick";
	public static String ACTION_CRMCANCELONCLICK = "/cancelOnClick";
	public static String ACTION_CRMSAVEONCLICK = "/saveOnClick";

	/********************************************************************
	 * FOR CROSSSELL UPSELL BATCH STARTS
	 ********************************************************************/
	public static int PROCESSEDSTATE_SUCCESSFULL = 1001;
	public static int PROCESSEDSTATE_SENT = 1002;
	public static int PROCESSEDSTATE_UNSENT = 1003;
	public static int PROCESSEDSTATE_FAILED = 1004;
	/********************************************************************
	 * FOR CROSSSELL UPSELL BATCH ENDS
	 ********************************************************************/

	/********************************************************************
	 * FOR DOCUMENTS DISPLAY STARTS
	 ********************************************************************/

	public static String RESULT_POSTALADDRESSLIST = "PostalAddressList";
	public static String SURVEYNO1 = "participantssurveyno";

	public static String RESULT_DOCCATEGORYLIST = "documentcategorylist ";
	public static String RESULT_DOCLIST = "documnetlist";
	public static String SENDTOCUSTOMER = "Y";
	public static String CUSTOMERBASICINFOVO = "cutomerbasicinfovo";
	public static String DOCUMENTCATEGORYVO = "documentcategoryvo";
	public static String POST = "4235";
	public static String FAX = "4236";
	public static String EMAIL = "4237";
	public static String SMS = "4238";
	public static String POSTEDFLAG_NO = "N";
	public static String DELIVERYTYPE = "";
	public static String TABLE_TCRM_MAILDISPATCH = "TCRM_MAILDISPATCH";
	public static String DELIVERYTYPESESSION = "deliverytypesession";
	public static String DOCDEMANDDELIVERYTYPE = "docDemandDeliveryType";
	public static String DOCDEMANDTYPE = "docDemandType";
	public static String DOCUMENTIDS = "documentIds";
	public static String DOCSEARCHSO = "docsearchso";
	public static String MAILITEMNAME = "Document";
	public static String DOCUMENTMESSAGEID = "CRM_0020";
	public static String DOCTYPE_POST = "M";
	public static String DOCTYPE_FAX = "F";

	public static char DOCUMENTS_FAX_PROCESSCODE='F';
	public static char DOCUMENTS_FAX_STATUSID='N';
	public static int DOCUMENTS_FAX_QUANTITY=1;
	public static int DOCUMENTS_FAX_PRIORITY=1;

	public static int DOCUMENTREFERENCETYPE = 4458;
	public static String HIDDOCUMENTIDS = "hiddocumentids";
	public static String HIDDOCUMENTLOCATIONS = "hiddocumentlocations";
	public static String HIDDOCUMENTNAMES = "hiddocumentnames";

	public static String ACTION_CRMBONEXTONCLICK = "/BOnextOnClick";
	public static String ACTION_CRMBOPREVIOUSONCLICK = "/BOpreviousOnClick";
	public static String ACTION_CRMBOCANCELONCLICK = "/BOcancelOnClick";
	public static String ACTION_CRMBOSAVEONCLICK = "/BOsaveOnClick";
	public static String ACTION_CRMENTERSURVEY = "/CRMEnterSurvey";
	public static String SURVEY_MULTIPLERESPONSE = "M";
	public static String SURVEY_SINGLERESPONSE = "S";
	public static String SEARCHSURVEYHISTORY = "SearchSurveyHistory";
	public static String QUESTIONANSWERLIST = "QuestionAnswerList";
	public static String SURVEY_CUSTOMERDETAILS = "customerdetails";
	public static String SURVEYNUMBER = "SurveyNumber";
	public static String DISPLAYID = "DisplayID";
	public static String SURVEYHISTORYLIST = "SurveyHistoryList";
	public static String SURVEY_CUSTOMERID = "CustomerID";
	public static String PREVIOUSDISPLAYID = "previousDisplayID";

	/********************************************************************
	* FOR DOCUMENTS DISPLAY BATCH ENDS
	********************************************************************/

	/********************************************************************
	* FOR DOCUMENTS ADMINISTRATION STARTS
	********************************************************************/

	public static String HEIGHT = "280";
	public static String NEWDOCCATEGORY = "NDC";
	public static String ADD_DOCUMENT = "AD";
	public static String EDITDOCUMENT = "ED";
	public static String EDITDOCCATEGORY = "EDC";
	public static String DELETEDOCCATEGORY = "DDC";
	public static String DELETEDOCUMENT = "DD";
	public static int HEIGHT_INCREMENT = 100;
	public static String TABLE_DOCUMENTCATEGORY = "TCRM_DOCUMENTCATEGORY";
	public static String TABLE_DOCUMENTDETAILS = "TCRM_DOCUMENTDETAILS";
	public static String SENDTOCUSTOMER_N = "N";
	/********************************************************************
	* FOR DOCUMENTS ADMINISTRATION STARTS
	********************************************************************/

	/****************************************************************
	 * CRM  ACTIVITYEXECUTION  BLOCK BEGINS
	 ****************************************************************/

	//	TABLE Name
	public static String TABLE_TCRM_ACTIVITYSTATUSREPORT =
		"TCRM_ACTIVITYSTATUSREPORT";

	public static String ACTIVITYEXECUTIONJNDI = "ActivityExecutionEJBJNDI";

	//	FOR WorkFlow
	/**
	 * CRM_CAMPAIGNACTIVITY_COMPLETED
	 */
	//CRM_CAMPAIGNACTIVITY_COMPLETED
	public static String CRM_CAMPAIGNACTIVITY_COMPLETED =
		"CRM_CAMPAIGNACTIVITY_COMPLETED";

	/**
	 * CRM_CAMPAIGNACTIVITY_ROUTING_COMPLETED
	 */
	//	CRM_CAMPAIGNACTIVITY_ROUTING_COMPLETED
	public static String CRM_CAMPAIGNACTIVITY_ROUTING_COMPLETED = "COMPLETED";

	/**
	 * CRM_CAMPAIGNACTIVITY_ROUTING_COMPLETED
	 */
	//	CRM_CAMPAIGNACTIVITY_ROUTING_COMPLETED
	public static String CRM_CAMPAIGNACTIVITY_APPROVAL_LEAD =
		"CRM_CAMPAIGNACTIVITY_APPROVAL_LEAD";
	public String CRM_CAMPAIGNACTIVITY_APPROVAL_MANAGER =
		"CRM_CAMPAIGNACTIVITY_APPROVAL_MANAGER";
	public String CRM_CAMPAIGNACTIVITY_APPROVAL_SUPERVISOR =
		"CRM_CAMPAIGNACTIVITY_APPROVAL_SUPERVISOR";

	/**
	 * Constants for Option : ACTION_CRMACTEONLOAD
	 */
	// ACTION_CRMACTEONLOAD
	public static String ACTION_CRMACTEONLOAD = "/CRMACTEOnLoad";

	/**
	 * Constants for Option : ACTION_CRMACTESTARTACTIVITY
	 */
	// ACTION_CRMACTESTARTACTIVITY
	public static String ACTION_CRMACTESTARTACTIVITY = "/CRMACTEStartActivity";

	/**
	 * Constants for Option : ACTION_CRMACTECOMPLETEACTIVITY
	 */
	// ACTION_CRMACTECOMPLETEACTIVITY
	public static String ACTION_CRMACTECOMPLETEACTIVITY =
		"/CRMACTECompleteActivity";

	/**
	 * Constants for Option : ACTION_CRMACTESTATUSREPORT
	 */
	// ACTION_CRMACTESTATUSREPORT
	public static String ACTION_CRMACTESTATUSREPORT = "/CRMACTEStatusReport";

	/**
	 * Constants for Option : ACTION_CRMACTEPENFORAPPROVELLIST
	 */
	// CRMACTEPenForAppList
	public static String ACTION_CRMACTEPENFORAPPROVELLIST =
		"/CRMACTEPenForAppList";

	/**
	 * Constants for Option : ACTION_CRMACTEREJECTEDLIST
	 */
	// CRMACTERejList
	public static String ACTION_CRMACTEREJECTEDLIST = "/CRMACTERejList";

	/**
	 * Constants for Option : ACTION_CRMACTEAPPROVE
	 */
	// ACTION_CRMACTEAPPROVE
	public static String ACTION_CRMACTEAPPROVE = "/CRMACTEApprove";

	/**
	 * Constants for Option : ACTION_CRMACTEREJECT
	 */
	// ACTION_CRMACTEREJECT
	public static String ACTION_CRMACTEREJECT = "/CRMACTEReject";

	/**
	 * Constants for Option : ACTION_CRMACTECOMCANCEL
	 */
	// ACTION_CRMACTECOMCANCEL
	public static String ACTION_CRMACTECOMCANCEL = "/CRMACTECOMCancel";

	/**
	 * Constants for Option : ACTION_CRMACTECANCEL
	 */
	// ACTION_CRMACTECANCEL
	public static String ACTION_CRMACTECANCEL = "/CRMACTECancel";

	/**
	 * Constants for Option : ACTION_CRMACTESADD
	 */
	// ACTION_CRMACTESADD
	public static String ACTION_CRMACTESADD = "/CRMACTESAdd";

	/**
	 * Constants for Option : ACTION_CRMACTESEDIT
	 */
	// ACTION_CRMACTESEDIT
	public static String ACTION_CRMACTESEDIT = "/CRMACTESEdit";

	/**
	 * Constants for Option : ACTION_CRMACTESDELETE
	 */
	// ACTION_CRMACTESDELETE
	public static String ACTION_CRMACTESDELETE = "/CRMACTESDelete";

	/**
	 * Constants for Option : ACTION_CRMACTESCANCEL
	 */
	// ACTION_CRMACTESCANCEL
	public static String ACTION_CRMACTESCANCEL = "/CRMACTESCancel";

	/**
	 * Constants for Option : ACTION_CRMACTESSAVENEW
	 */
	// ACTION_CRMACTESSAVENEW
	public static String ACTION_CRMACTESSAVENEW = "/CRMACTESSaveNew";

	/**
	 * Constants for Option : ACTION_CRMACTESSAVEEXIST
	 */
	// ACTION_CRMACTESSAVEEXIST
	public static String ACTION_CRMACTESSAVEEXIST = "/CRMACTESSaveExist";

	/**
	 * Constants for Option : ACTION_CRMACTESCOMCANCEL
	 */
	// ACTION_CRMACTESCOMCANCEL
	public static String ACTION_CRMACTESCOMCANCEL = "/CRMACTESCOMCancel";

	/**
	 * Constants for Option : RESULT_ACTIVITYEXECUTIONSO
	 */
	public static String RESULT_ACTIVITYEXECUTIONSO =
		"ResultActivityExecutionSO";

	/**
	 * Constants for Option : SEARCH_ACTIVITYEXECUTIONSO
	 */
	public static String SEARCH_ACTIVITYEXECUTIONSO =
		"SearchActivityExecutionSO";

	/**
	 * Constants for Option : RESULT_ACTIVITYSTATUSSO
	 */
	public static String RESULT_ACTIVITYSTATUSSO = "ResultActivityStatusO";

	/**
	 * Constants for Option : SEARCH_ACTIVITYSTATUSSO
	 */
	public static String SEARCH_ACTIVITYSTATUSSO = "SearchActivityStatusSO";

	/**
	 * Constants for Option : SEARCH_ACTIVITYSTATUSSO
	 */
	public static String DETAILS_ACTIVITYSTATUSSO = "DetailsActivityStatusSO";

	/**
	 * Constants for Option : EDIT_ACTIVITY_STATUS_REPORT
	 */
	public static String EDIT_ACTIVITY_STATUS_REPORT =
		"EditActivityStatusReport";

	/**
	 * Constants for Option : EDIT_ACTIVITYID
	 */
	public static String EDIT_ACTIVITYID = "EditActivityID";

	/**
	 * Constants for Option : CLOSE_ACTIVITY_STATUS
	 */
	public static String CLOSE_ACTIVITY_STATUS = "CloseActivityStatusPage";

	/**
	 * ACTIVITY_STATUS_CONSTANTS
	 */

	public static String ACTIVITY_EXECUTION_NEW = "1001";

	public static String ACTIVITY_EXECUTION_ONGOING = "1002";

	public static String ACTIVITY_EXECUTION_PENDING = "1003";

	public static String ACTIVITY_EXECUTION_APPROVED = "1004";

	public static String ACTIVITY_EXECUTION_REJECTED = "1005";

	/****************************************************************
	 * CONSTANTS ACTIVITYEXECUTION  BLOCK ENDS
	 ****************************************************************/

	/**********************************************************
	 * 		CHANNELBOOKING BEIGNS HERE						  *
	 * ********************************************************/

	/**
	 * JNDI NAME
	 */
	public static String CAMPAIGNCHANNELBOOKINGJNDI =
		"CampaignChannelBookingEJBJNDI";
	/***
	 * TABLE_TCRM_CAMPAIGNCHANNELBOOKING
	 */
	//	TABLE Name
	public static String TABLE_TCRM_CAMPAIGNCHANNELBOOKING =
		"TCRM_CAMPAIGNCHANNELBOOKING";

	/**
	 * RESULT_CHANNLELISTTVRADIOSO
	 */
	public static String RESULT_CHANNLELISTTVRADIOSO =
		"ResultChannelListTvRadio";

	/**
	 * RESULT_SUBCHANNLELISTTVRADIOSO
	 */
	public static String RESULT_SUBCHANNLELISTTVRADIOSO =
		"ResultSubChannelListTvRadio";

	/**
	 * RESULT_CAMPAIGNCHANNELBOOKINGLISTSO
	 */
	public static String RESULT_CAMPAIGNCHANNELBOOKINGLISTSO =
		"ResultCampaignChannelBookingListSO";

	/**
	 * SEARCH_CAMPAIGNCHANNELBOOKINGSO
	 */
	public static String SEARCH_CAMPAIGNCHANNELBOOKINGSO =
		"SearchCampaignChannelBookingListSO";

	/**
	 * RESULT_PROGRAMDETAILSFORSUBCHANNEL
	 */
	public static String RESULT_PROGRAMDETAILSFORSUBCHANNEL =
		"ResultProgramDetailsForSubChannel";

	/**
	 * CHANNELID_CAMPAIGNBOOKING
	 */
	public static String CHANNELID_CAMPAIGNBOOKING = "ChannelIdCampaignBooking";

	/**
	 * RESULT_CAMPAIGNCHANNELBOOKINGDETAILSSO
	 */
	public static String RESULT_CAMPAIGNCHANNELBOOKINGDETAILSSO =
		"ResultCampaignChannelBookingDetailsSO";

	/**
	 * SUCCESS_FLAG
	 */
	public static String SUCCESS_FLAG = "SuccessFlag";

	/**
	 * CLOSE_CAMPAIGNCHANNEL_BOOKING
	 */
	public static String CLOSE_CAMPAIGNCHANNEL_BOOKING =
		"CloseChannelBookingAddPage";

	/**
	 * CAMPAIGN_CHANNELDETAILSSO
	 */
	public static String CAMPAIGN_CHANNELDETAILSSO = "CampaignChannelDetails";

	/**
	 * EDIT_PRGMSCHEDULEID
	 */
	public static String EDIT_PRGMSCHEDULEID = "EditProgramScheduleId";

	/**
	 * Constants for Option : ACTION_CRMCCHBONLOAD
	 */
	// ACTION_CRMCCHBONLOAD
	public static String ACTION_CRMCCHBONLOAD = "/CRMCCHBOnLoad";

	/**
	 * Constants for Option : ACTION_CRMCCHBCHANNELONCHANGE
	 */
	// ACTION_CRMCCHBCHANNELONCHANGE
	public static String ACTION_CRMCCHBCHANNELONCHANGE =
		"/CRMCCHBChannelOnChange";

	/**
	 * Constants for Option : ACTION_CRMCCHBADD
	 */
	// ACTION_CRMCCHBADD
	public static String ACTION_CRMCCHBADD = "/CRMCCHBAdd";

	/**
	 * Constants for Option : ACTION_CRMCCHBEDIT
	 */
	// ACTION_CRMCCHBEDIT
	public static String ACTION_CRMCCHBEDIT = "/CRMCCHBEdit";

	/**
	 * Constants for Option : ACTION_CRMCCHBDELETE
	 */
	// ACTION_CRMCCHBDELETE
	public static String ACTION_CRMCCHBDELETE = "/CRMCCHBDelete";

	/**
	 * Constants for Option : ACTION_CRMCCHBCANCEL
	 */
	// ACTION_CRMCCHBCANCEL
	public static String ACTION_CRMCCHBCANCEL = "/CRMCCHBCancel";

	/**
	 * Constants for Option : ACTION_CRMCCHBCLICKGO
	 */
	// ACTION_CRMCCHBCLICKGO
	public static String ACTION_CRMCCHBCLICKGO = "/CRMCCHBClickGo";

	/**
	 * Constants for Option : ACTION_CRMCCHBSAVENEW
	 */
	// ACTION_CRMCCHBSAVENEW
	public static String ACTION_CRMCCHBSAVENEW = "/CRMCCHBSaveNew";

	/**
	 * Constants for Option : ACTION_CRMCCHBSAVEEXISTING
	 */
	// ACTION_CRMCCHBSAVEEXISTING
	public static String ACTION_CRMCCHBSAVEEXISTING = "/CRMCCHBSaveExisting";

	/**
	 * Constants for Option : ACTION_CRMCCHBSAVECANCEL
	 */
	// ACTION_CRMCCHBSAVECANCEL
	public static String ACTION_CRMCCHBSAVECANCEL = "/CRMCCHBSaveCancel";

	/**ERRORCODES****/

	/**
	 * RECORDEXISTFOR_LIVEPROMOTION
	 */
	//RECORDEXISTFOR_LIVEPROMOTION
	public static String RECORDEXISTFOR_LIVEPROMOTION = "-2";

	/**
	 * NORMAL_SCHEDULE_LISTEMPTY
	 */
	//NORMAL_SCHEDULE_LISTEMPTY
	public static String NORMAL_SCHEDULE_LISTEMPTY = "-1";

	/**
	 * PROGRAMDATE_IN_RANGE
	 */
	//PROGRAMDATE_IN_RANGE
	public static String PROGRAMDATE_IN_RANGE = "0";

	/**
	 * PROGRAMDATE_NOT_IN_RANGE
	 */
	//PROGRAMDATE_NOT_IN_RANGE
	public static String PROGRAMDATE_NOT_IN_RANGE = "1";

	/**
	 * INSERT_CAMPAIGNCHANNELBOOKING
	 */
	public static String INSERT_CAMPAIGNCHANNELBOOKING = "INSERT";

	/**
	 * INSERT_CAMPAIGNCHANNELBOOKING
	 */
	public static String UPDATE_CAMPAIGNCHANNELBOOKING = "UPDATE";

	/**
	 * INSERT_CAMPAIGNCHANNELBOOKING
	 */
	public static String DELETE_CAMPAIGNCHANNELBOOKING = "DELETE";

	/**
	 * SELECTED CHANNEL ID
	 */
	public static String SELECTED_CHANNELID = "SelectedChannelId";

	/**
	 * TODO DESCRPTION FOR CHANNEL BOOKING
	 */

	public static String CHANNELBOOKING_INSERT_TODO = "1001";

	public static String CHANNELBOOKING_UPDATE_TODO = "1002";

	public static String CHANNELBOOKING_DELETE_TODO = "1003";

	public static int CHANNELBOOKING_REFERENCE_TYPE = 1001;

	public static String SUBCHCHNAGEFLAG="SubChannelChangeFlag";

	public static String TRUE_STRING ="true";

	/**********************************************************
	 * 		CHANNELBOOKING ENDS HERE						  *
	 **********************************************************/

	/**********************************************************
	 * 		DEPARTMENT CODE DEFINITION BEGINS				  *
	**********************************************************/

	public static String ACTION_CRMDDCOnload = "/CRMDDCOnload";

	public static String ACTION_CRMDDCAddCode = "/CRMDDCAddCode";

	public static String ACTION_CRMDDCEditCode = "/CRMDDCEditCode";

	public static String ACTION_CRMDDCDeleteCode = "/CRMDDCDeleteCode";

	public static String ACTION_CRMDDCCancelDefinition =
		"/CRMDDCCancelDefinition";

	public static String ACTION_CRMDDCSaveDefinition = "/CRMDDCSaveDefinition";

	public static String ACTION_CRMDDCSearchCode = "/CRMDDCSearchCode";

	public static String ACTION_CRMDDCCancel = "/CRMDDCCancel";

	public static String DEPARTMENTCODEDEFINITIONSECTION =
		"DEPARTMENTCODEDEFINITIONSECTION";

	public static String SEARCH_DEPARTMENTCODEVO = "SEARCH_DEPARTMENTCODEVO";

	public static String RESULT_DEPARTMENTCODEVO = "RESULT_DEPARTMENTCODEVO";

	public static String EDIT_DEPARTMENTCODEVO = "EDIT_DEPARTMENTCODEVO";

	public static String SELECT_DEPARTMENTCODE = "SELECT_DEPARTMENTCODE";

	public static long MAXLIMIT = 9999999999L;

	//	OccasionProductBatchDAO
	  public static String OccasionProductBatchDAO_BATCHDAO_NAME =
		  "ehsn.et1.db.crm.batch.dao.OccasionProductBatchDAO";
	/**********************************************************
		* 		DEPARTMENT CODE DEFINITION ENDS					  *
		**********************************************************/

	/****************************************************************
	 * CRM ITERATION III CONSTANTS DEFINITION BLOCK ENDS
	 ****************************************************************/

	/****************************************************************
	 * CRM CTI INTERFACE CONSTANTS DEFINITION BLOCK BEGINS
	 ****************************************************************/

	String GREETINGSJNDINAME = "GreetingsManagementEJBJndi";
	String CTIMODE = "CTI";

	/****************************************************************
	 * CRM CTI INTERFACE CONSTANTS DEFINITION BLOCK ENDS
	 ****************************************************************/
	/****************************************************************
	* CRM IT3 REPORTS STARTS HERE
	****************************************************************/

	public static String REPORT_TYPE1 = "Product-Product";
	public static String REPORT_TYPE2 = "Occasion-Product";
	public static String OCCASION1 = "1001";
	public static String OCCASION2 = "1002";
	public static String PRODUCTCATEGORY = "PRODUCTCATEGORY";
	public static String OCCASIONCATEGORY = "OCCASIONCATEGORY";
	public static String SEARCH_CROSSUPSELLSO = "SEARCH_CROSSUPSELLSO";
	public static String SURVEYFILENAME = "surveyfilename_";
	public static String CAMPAIGNCRITERIAFILENAME =
		"Campaigncriteriadescription_";
	public static String CAMPAIGNCRITERIASHEETNAME =
		"Campaign Criteria Description List";
	/*
	 * Incoming / Outgoing Media Vs Demography
	 */

	public static String OUTCOMINGCHANNELS = "OUTCOMINGCHANNELS";

	public static int INCOMINGEMAIL = 1002;

	public static int INCOMINGCALL = 1001;

	public static int INCOMINGIVR = 1010;

	public static String MEMBERSHIPLEVELS = "MEMBERSHIPLEVELS";

	public static String ADDRESS1LIST = "ADDRESS1LIST";

	public static int CROSSORDERBATCH_CAMPGN_NUMBER = 1001;
	public static int GROUPPURCHASEBATCH_CAMPGN_NUMBER = 1001;

	public static String CROSSORDER_CAMPAIGN = "CRM_029";
	public static String GROUPPURCHASE_CAMPAIGN = "CRM_030";
	public static String MAILING_CUSTOMERLIST = "CRM_021";
	public static String CUSTOMERADDRESS_LIST_REPORT="CRM_0040";
	public static String CUSTOMERADDRESS_SUMMARY_REPORT="CRM_0041";
	public static int MAILINGLIST_PARAMID=1001;
	public static  long CROSSSELLUPSELL_PROJECTCODE=19;
	public static String OCCASIONBATCH_SMS_SENDDESC= "OCCASIONBATCH_SMS_SENDDESC";


	public static String COUNTRYCODE_INDIA="9001";
	public static String COUNTRYCODE_TAIWAN="9002";
	public static String COUNTRYCODE_USA="9003";
   public static String COUNTRYCODE_CHINA="9004";

	public static String SEARCH_CRITERIADESCRIPTION =
		"SEARCH_CRITERIADESCRIPTION";
	public static String RESULT_CRITERIADESCRIPTION =
		"RESULT_CRITERIADESCRIPTION";
	public static int DOMAIN_REFERENCETYPE_REMINDER = 1010;
	public static String COMPLAINTANALYSISCATEGORYREPORTFILENAME = "ComplaintAnalysisCategory";
	public static String COMPLAINTANALYSISSLAREPORTFILENAME = "ComplaintAnalysisSLA";
	public static String CERTIFICATEREPORTFILENAME = "CertificateReport";
	public static String NEWCUSTOMERINFORMATION = "NewCustomerInformation";
	public static String SURVEYANALYSISREPORTBATCHID = "CRM_023";
	public static String CERTIFICATEUSAGEBATCHID = "CRM_024";
	public static String COMPLAINTCATEGORYANALYSISBATCHID = "CRM_025";
	public static String COMPLAINTSLAANALYSISBATCHID = "CRM_026";
	public static String NEWCUSTOMERINFORMATIONBATCHID = "CRM_027";
	public static String CUSTOMEROCCUPATIONBATCHID = "CRM_028";
	public static String CUSTOMEROCCUPATIONREPORTFILE = "CustomerOccupationReport_";
	public static String COMPLAINTCATEGORYREPORTID = "CRM_0003";
	public static String SURVEYANALYSISREPORTID = "CRM_0034";
	public static String CERTIFICATEUSAGEREPORT = "CRM_0005";
	public static String CERTIFICATEUSAGEREPORT_OCCUPATION = "CRM_0082";
	public static String QUERYLIMITOPERATOR = "=";
	public static String COMMONREPORTBATCHCONTROLLER = "CMN_018";
	public static String SURVEYMEDIAOFRELEASE = "SURVEYMEDIAOFRELEASE";
	public static String COMPLAINTSLAREPORTID = "CRM_0002";
	public static String NEWCUSTOMERINFORMATIONREPORTID = "CRM_0017";
	public static String CUSTOMEROCCUPATIONINFORMATIONREPORTID = "CRM_0046";
	/****************************************************************
	* CRM IT3 REPORTS ENDS HERE
	****************************************************************/

	/**************************************************************
	 * Complaint SLA constants  for Start of Office and End of Office-Starts
	 * ************************************************************/
	public static int OFFICE_START_HOUR = 9;
	public static int OFFICE_END_HOUR = 18;
	public static int OFFICE_NOTWORKING_HOURS = 15;
	public static int OFFICE_WORKING_HOURS = 9;

	public static int UNIT_HOURS=4132;
	public static int UNIT_DAYS=4133;
	public static int UNIT_MONTHS=4134;



	/**************************************************************
	 * Complaint SLA constants  for Start of Office and End of Office-ends
	 * ************************************************************/

	public static int CustomerType_Member = 1111;
	public static int CustomerType_Employee = 1101;
	public static int CustomerType_Related_Staff = 1104;
	public static int CustomerType_EHSN_Staff = 1105;
	//xialiang 20130829 鍏充紒鍛樺伐-鍗?
	public static int CustomerType_Related_Staff_Card = 1113;
	public static int CustomerType_Hexin_Company_Staff = 1114;


	/**************************************************************
	 * Credit Card Type constants - Starts
	 * ************************************************************/
	public static int CREDIT_CARD_TYPE_UCARD = 1903;

	/**************************************************************
	 * Credit Card Type constants - ends
	 * ************************************************************/

	public static long FO_SUPERVISOR_ROLEID = 3008;
	
	
	/**************************************************************
	 *  SPM Complaint List Export File Name and Sheet Name 
	 * ************************************************************/
	public static final String SPM_COMPLAINTLIST_EXPORT_FILENAME = "EHSNSPMComplaintList_";
	public static final String SPM_COMPLAINTLIST_EXPORT_SHEETNAME = "EHSNSPMComplaintList";
	
	/**************************************************************
	 *  CR_4446 2007/12/29  TCRM_MEMBERSHIPLEVELDEFINITION.BONUSPOINTTOVALUE<>-1
	 *  hungchang_lee
	 *  MembershipLevelSRV.validateCustForOneDayShip( long customerID,  EHSNControlVO control, Connection con) 
	 * ************************************************************/
	public static long BONUSPOINTTOVALUE_NEGATIVE = -1;
	
	/**************************************************************
	 * CR_4434
	 * member ship level constants - Starts
	 * ************************************************************/
	public static int MEMBERSHIP_LEVEL_E = 3;
	public static int MEMBERSHIP_LEVEL_I = 12;
	/**************************************************************
	 * member ship level constants - ends
	 * ************************************************************/
	
	/**************************************************************
	 * Domain Name:UPGRADE_CONTACT Domain Code constants - Starts
	 * ************************************************************/
	public static int UPGRADE_CONTACT_NONE = 4229;
	public static int UPGRADE_CONTACT_SMS = 4230;
	public static int UPGRADE_CONTACT_EMAIL = 4231;
	/**************************************************************
	 * Domain Name:UPGRADE_CONTACT Domain Code constants - ends
	 * ************************************************************/
	

   /*add by JMF 20130729 */
   public static final String COMPLAINTS_BATCH_FILE_UPLOAD = "IMPORTBATCHCOMPLAINTS_FILE_";
	//JNDI NAMES
	public static String COMPLAINTIMPORTBATCHJNDI = "ComplaintImportBatchEJBJNDI";
   /*add by JMF 20130717 end*/
	
	
	
	public static final int CREDENTIALTYPE_MOBILENUMBER=1005;
}
