$(function(){
	$.getCaches("../cache!getCache.action","SEX,EXCLUDERETURNFLAG",function(cacheKeys){
		$("#orderStartTime").datebox("setValue",getDateString(-30)+" 00:00:00");
		$("#orderEndTime").datebox("setValue",getDateString(1)+" 00:00:00");
		
		var options={
				url:"query!initList.action",
				defaultSearch:false,
				//exporturl:"detailStat!exportCustomerInfoAllOut.action",//用于数据导出url
				colModel:[
				    {label:"客户编号",name:"customerid"},
				    {label:"客户名称",name:"customername"},
				    {label:"身份证号码",name:"cardid",hidden:true},
				    {label:"地址1",name:"address1"},
				    {label:"地址2",name:"address2",hidden:true},
				    {label:"手机号码",name:"mobile",hidden:true},
				    {label:"总消费金额",name:"consumedamount"},
				    {label:"累计消费次数",name:"consumedtimes"},
				    {label:"销退次数",name:"returntimes"},
				    {label:"换货次数",name:"exchangetimes"},
				    {label:"累计取消订单次数",name:"canceltimes"}
				],
				multiselect:false,
				loadonce: false,
				caption:"查询列表",
				sortname:"customerid",
				searchform: "#customerInfoAllOutForm",
				allowOper : {add:false,del:false,update:false,exportexcel:false}
			};
		
			$("#customerInfoAllOutTable").hlGrid(options);
	});
	
	$("#refreshBtn").click(function() {
		if($("#orderEndTime").datebox("getValue") == null || $("#orderEndTime").datebox("getValue") == "" || $("#orderStartTime").datebox("getValue") == null || $("#orderStartTime").datebox("getValue") == ""){
			$.messager.alert("操作提示", "请输入订购起止时间!");
			return false;
		}
		
//		if(DateDiff($("#orderEndTime").datebox("getValue"),$("#orderStartTime").datebox("getValue"))>365*2+1){
//			$.messager.alert("操作提示", "订购起止时间在2年之内!");
//			return;
//		}
		
		if($("#customerInfoAllOutForm").find("#ageStart").val() != "" && ($("#customerInfoAllOutForm").find("#ageEnd").val() == null || $("#customerInfoAllOutForm").find("#ageEnd").val() == "")){
			$.messager.alert("操作提示", "起始年龄和终止年龄必须同时填写!");
			$("#customerInfoAllOutForm").find("#ageEnd").focus();
			return false;
	 	}
		
		if($("#customerInfoAllOutForm").find("#ageEnd").val() != "" && ($("#customerInfoAllOutForm").find("#ageStart").val() == null || $("#customerInfoAllOutForm").find("#ageStart").val() == "")){
			$.messager.alert("操作提示", "起始年龄和终止年龄必须同时填写!");
			$("#customerInfoAllOutForm").find("#ageStart").focus();
			return false;
	 	}
		
		if($("#registerEndTime").datebox("getValue") != "" &&($("#registerStartTime").datebox("getValue") == null || $("#registerStartTime").datebox("getValue") == "")){
			$.messager.alert("操作提示", "请输入注册起始时间!");
			$("#customerInfoAllOutForm").find("#registerStartTime").focus();
			return false;
		}
		
		if($("#actualEndTime").datebox("getValue") != "" &&($("#actualStartTime").datebox("getValue") == null || $("#actualStartTime").datebox("getValue") == "")){
			$.messager.alert("操作提示", "请输入行销活动起始时间!");
			$("#customerInfoAllOutForm").find("#actualStartTime").focus();
			return false;
		}
		
		if($("#orderEndTime").datebox("getValue") != "" &&($("#orderStartTime").datebox("getValue") == null || $("#orderStartTime").datebox("getValue") == "")){
			$.messager.alert("操作提示", "请输入订购起始时间!");
			$("#customerInfoAllOutForm").find("#orderStartTime").focus();
			return false;
		}
		
		if($("#registerStartTime").datebox("getValue")!=null&&$("#registerStartTime").datebox("getValue")!=''
			&&$("#registerEndTime").datebox("getValue")!=null&&$("#registerEndTime").datebox("getValue")!=''
				&&compareDate($("#registerStartTime").datebox("getValue"),$("#registerEndTime").datebox("getValue"))){
			$.messager.alert("操作提示", "注册结束时间应大于开始时间!");
			return;
		}
		
		if($("#actualStartTime").datebox("getValue")!=null&&$("#actualStartTime").datebox("getValue")!=''
			&&$("#actualEndTime").datebox("getValue")!=null&&$("#actualEndTime").datebox("getValue")!=''
				&&compareDate($("#actualStartTime").datebox("getValue"),$("#actualEndTime").datebox("getValue"))){
			$.messager.alert("操作提示", "行销活动结束时间应大于开始时间!");
			return;
		}
		
		if($("#orderStartTime").datebox("getValue")!=null&&$("#orderStartTime").datebox("getValue")!=''
			&&$("#orderEndTime").datebox("getValue")!=null&&$("#orderEndTime").datebox("getValue")!=''
				&&compareDate($("#orderStartTime").datebox("getValue"),$("#orderEndTime").datebox("getValue"))){
			$.messager.alert("操作提示", "订购结束时间应大于开始时间!");
			return;
		}
		
		jQuery("#customerInfoAllOutTable").jqGrid("setGridParam", {url:"detailStat!customerInfoAllOutList.action"}); 
		$("#customerInfoAllOutTable").hlGridRefresh();
	});
	
	$("#resetBtn").click(function(){
		$("#customerInfoAllOutForm").clearForm();
		//会员等级清空
		if($.fn.zTree.getZTreeObj("levelTree") != null){
			$.fn.zTree.getZTreeObj("levelTree").checkAllNodes(false);
		}
		//性别初始化
		$("#customerInfoAllOutForm").find("#sex").val(null);
		$("#customerInfoAllOutForm").find("#excludereturnflag").val("N");
		//会员类型
		$.fn.zTree.getZTreeObj("customerTypeTree").checkAllNodes(false);
		setCustomerTypeDefault();
		//商品分类
		if($.fn.zTree.getZTreeObj("productClassTree") != null){
			$.fn.zTree.getZTreeObj("productClassTree").checkAllNodes(false);
		}
		//通路
		if($.fn.zTree.getZTreeObj("subchannelTree") != null){
			$.fn.zTree.getZTreeObj("subchannelTree").checkAllNodes(false);
		}
		//订单类型
		$.fn.zTree.getZTreeObj("orderTypeTree").checkAllNodes(false);
		setOrderTypeDefault();
		//订单状态
		$.fn.zTree.getZTreeObj("orderStatusTree").checkAllNodes(false);
		setOrderStatusDefault();
		//商品品号excel清空
		$("#localFileName").empty();
		$("#fileName").val("");
		//订单创建人工号excel清空	
		$("#localFileUserName").empty();
		$("#fileOrderCreateName").val("");
	    //设置敏感数据--默认为非选中状态
	    setSensitiveDataFlag();
	    jQuery("#customerInfoAllOutTable").setGridParam({"postData":{"paramMap.sensitiveData":$("#sensitiveData").val()}}).hideCol(["mobile","cardid","address2"]);
	    $("#customerInfoAllOutTable").hlGridAdjustWidth();
	    //订购时间
		$("#orderStartTime").datebox("setValue",getDateString(-30)+" 00:00:00");
	    $("#orderEndTime").datebox("setValue",getDateString(1)+" 00:00:00");
	});
	
	//动态显示对应列
	$("#showPhone").change(function() {
		setSensitiveDataFlag();
		if (!$("#showPhone").attr("checked")) {
			jQuery("#customerInfoAllOutTable").setGridParam({"postData":{"paramMap.sensitiveData":$("#sensitiveData").val()}}).hideCol("mobile").trigger("reloadGrid");
        }else if($("#showPhone").attr("checked")){
        	jQuery("#customerInfoAllOutTable").setGridParam({"postData":{"paramMap.sensitiveData":$("#sensitiveData").val()}}).showCol("mobile").trigger("reloadGrid");
        }
		$("#customerInfoAllOutTable").hlGridAdjustWidth();
    });
	
	$("#showIdCard").change(function() {
		setSensitiveDataFlag();
		if (!$("#showIdCard").attr("checked")) {
			jQuery("#customerInfoAllOutTable").setGridParam({"postData":{"paramMap.sensitiveData":$("#sensitiveData").val()}}).hideCol("cardid").trigger("reloadGrid");
        }else if($("#showIdCard").attr("checked")){
        	jQuery("#customerInfoAllOutTable").setGridParam({"postData":{"paramMap.sensitiveData":$("#sensitiveData").val()}}).showCol("cardid").trigger("reloadGrid");
        }
		$("#customerInfoAllOutTable").hlGridAdjustWidth();
    });
	
	$("#showAddress").change(function() {
		setSensitiveDataFlag();
		if (!$("#showAddress").attr("checked")) {
			jQuery("#customerInfoAllOutTable").setGridParam({"postData":{"paramMap.sensitiveData":$("#sensitiveData").val()}}).hideCol("address2").trigger("reloadGrid");
        }else if($("#showAddress").attr("checked")){
        	jQuery("#customerInfoAllOutTable").setGridParam({"postData":{"paramMap.sensitiveData":$("#sensitiveData").val()}}).showCol("address2").trigger("reloadGrid");
        }
		$("#customerInfoAllOutTable").hlGridAdjustWidth();
    });
	
	//设置敏感数据的隐藏信息
	function setSensitiveDataFlag(){
		var flag = "";
		if($("#showPhone").attr("checked")){
			flag = flag + "手机号;";
		}
		if($("#showIdCard").attr("checked")){
			flag = flag + "身份证号;";
		}
		if($("#showAddress").attr("checked")){
			flag = flag + "详细地址;";
		}
		$("#sensitiveData").val(flag);
	}
	
	
	//商品品号excel清空
	$("#clearFile").click(function() {
		$("#localFileName").empty();
		$("#fileName").val("");
	});
	//订单创建人工号excel清空	
	$("#clearFileCreatebyid").click(function() {
		$("#localFileUserName").empty();
		$("#fileOrderCreateName").val("");
	});
	
		/*
		 * 注意：此部分必须在初始化之内
		 * 会员级别树选择 begin
		 */
		var lvl = {
				check: {
					enable: true,
					chkboxType: { "Y" : "ps", "N" : "ps" }
				},
				view: {
					dblClickExpand: false
				},
				data: {
					simpleData: {
						enable: true
					}
				},
				async: {
					enable: true,
					url:"./query!queryMemberShipLevel.action"
				},
				callback: {
					beforeClick: beforeClickLvl,
					onCheck: onCheckLvl
				}
			};
		$.fn.zTree.init($("#levelTree"), lvl, null);
		
		$("#clearLevel").click(function() {
			$("#customerInfoAllOutForm").find("#membershiplevelname").val("");
			$("#customerInfoAllOutForm").find("#membershiplevelid").val("");
			var zTree = $.fn.zTree.getZTreeObj("levelTree");
			zTree.checkAllNodes(false);//同时将全部节点设置为非选中状态
		});
		/*
		 * 会员级别树选择 end
		 */
		
		/*
		 * 会员类型树选择 begin
		 */
		var customerType = {
				check: {
					enable: true,
					chkboxType: { "Y" : "ps", "N" : "ps" }
				},
				view: {
					dblClickExpand: false
				},
				data: {
					simpleData: {
						enable: true
					}
				},
				async: {
					enable: true,
					url:"./query!queryDomainData.action",
					otherParam:{"paramMap.domainname":"CUSTOMER_TYPE"}
				},
				callback: {
					beforeClick: beforeClickCustomerType,
					onCheck: onCheckCustomerType,
					onAsyncSuccess: setCustomerTypeDefault	//设置会员类型默认值
				}
			};
		$.fn.zTree.init($("#customerTypeTree"), customerType, null);
		
		$("#clearCustomerType").click(function() {
			$("#customerInfoAllOutForm").find("#customerTypeName").val("");
			$("#customerInfoAllOutForm").find("#customerTypeId").val("");
			var zTree = $.fn.zTree.getZTreeObj("customerTypeTree");
			zTree.checkAllNodes(false);//同时将全部节点设置为非选中状态
		});
		/*
		 * 会员类型树选择 end
		 */
		
		/*
		 * 商品分类树选择 begin
		 */
		var productClass = {
				check: {
					enable: true,
					chkboxType: { "Y" : "ps", "N" : "ps" }
				},
				view: {
					dblClickExpand: true,
					addDiyDom: addProductClassDiyDom
				},
				data: {
					simpleData: {
						enable: true
					}
				},
				async: {
					enable: true,
					url:"./query!queryProductClass.action",
				},
				callback: {
					beforeClick: beforeClickProductClass,
					onCheck: onCheckProductClass,
				}
			};
		$.fn.zTree.init($("#productClassTree"), productClass, null);
		
		$("#clearProductClass").click(function() {
			$("#customerInfoAllOutForm").find("#productClassName").val("");
			$("#customerInfoAllOutForm").find("#productClassId").val("");
			var zTree = $.fn.zTree.getZTreeObj("productClassTree");
			zTree.checkAllNodes(false);//同时将全部节点设置为非选中状态
		});
		/*
		 * 商品分类树选择 end
		 */
		
		/*
		 * 通路树选择 begin
		 */
		var subchannel = {
				check: {
					enable: true,
					chkboxType: { "Y" : "ps", "N" : "ps" }
				},
				view: {
					dblClickExpand: false
				},
				data: {
					simpleData: {
						enable: true
					}
				},
				async: {
					enable: true,
					url:"./query!querySubchannel.action",
				},
				callback: {
					beforeClick: beforeClickSubchannel,
					onCheck: onCheckSubchannel,
				}
			};
		$.fn.zTree.init($("#subchannelTree"), subchannel, null);
		
		$("#clearSubchannel").click(function() {
			$("#customerInfoAllOutForm").find("#subchannelName").val("");
			$("#customerInfoAllOutForm").find("#subchannelId").val("");
			var zTree = $.fn.zTree.getZTreeObj("subchannelTree");
			zTree.checkAllNodes(false);//同时将全部节点设置为非选中状态
		});
		/*
		 * 通路树选择 end
		 */
		
		/*
		 * 订单类型树选择 begin
		 */
		var orderType = {
				check: {
					enable: true,
					chkboxType: { "Y" : "ps", "N" : "ps" }
				},
				view: {
					dblClickExpand: false
				},
				data: {
					simpleData: {
						enable: true
					}
				},
				async: {
					enable: true,
					url:"./query!queryDomainData.action",
					otherParam:{"paramMap.domainname":"OrderType"}
				},
				callback: {
					beforeClick: beforeClickOrderType,
					onCheck: onCheckOrderType,
					onAsyncSuccess: setOrderTypeDefault	//设置会员类型默认值
				}
			};
		$.fn.zTree.init($("#orderTypeTree"), orderType, null);
		
		$("#clearOrderType").click(function() {
			$("#customerInfoAllOutForm").find("#orderTypeName").val("");
			$("#customerInfoAllOutForm").find("#orderTypeId").val("");
			var zTree = $.fn.zTree.getZTreeObj("orderTypeTree");
			zTree.checkAllNodes(false);//同时将全部节点设置为非选中状态
		});
		/*
		 * 订单类型树选择 end
		 */
		
		/*
		 * 订单状态树选择 begin
		 */
		var orderStatus = {
				check: {
					enable: true,
					chkboxType: { "Y" : "ps", "N" : "ps" }
				},
				view: {
					dblClickExpand: false
				},
				data: {
					simpleData: {
						enable: true
					}
				},
				async: {
					enable: true,
					url:"./query!queryDomainData.action",
					otherParam:{"paramMap.domainname":"OrderStatus"}
				},
				callback: {
					beforeClick: beforeClickOrderStatus,
					onCheck: onCheckOrderStatus,
					onAsyncSuccess: setOrderStatusDefault	//设置会员类型默认值
				}
			};
		$.fn.zTree.init($("#orderStatusTree"), orderStatus, null);
		
		$("#clearOrderStatus").click(function() {
			$("#customerInfoAllOutForm").find("#orderStatusName").val("");
			$("#customerInfoAllOutForm").find("#orderStatusId").val("");
			var zTree = $.fn.zTree.getZTreeObj("orderStatusTree");
			zTree.checkAllNodes(false);//同时将全部节点设置为非选中状态
		});
		/*
		 * 订单状态树选择 end
		 */
});

/*
 * 注意：此部分必须在初始化之外
 * 会员级别树选择 begin
 */
function showLevel(){
	var Obj = $("#membershiplevelname");
	var Offset = $("#membershiplevelname").offset();
	$("#levelContent").css({left:Offset.left + "px", top:Offset.top + Obj.outerHeight() + "px"}).slideDown("fast");
	$("body").bind("mousedown", onBodyDownLvl);
}

function beforeClickLvl(treeId, treeNode) {
	var zTree = $.fn.zTree.getZTreeObj("levelTree");
	zTree.checkNode(treeNode, !treeNode.checked, null, true);
	return false;
}

function onCheckLvl(e, treeId, treeNode) {
	var zTree = $.fn.zTree.getZTreeObj("levelTree"),
	nodes = zTree.getCheckedNodes(true),
	name = "";
	id = "";
	for (var i=0, l=nodes.length; i<l; i++) {
		if(nodes[i] && !nodes[i].isParent){
			name += nodes[i].name + ",";
			id += nodes[i].id + ",";
		}
	}
	if (name.length > 0 ) name = name.substring(0, name.length-1);
	if (id.length > 0 ) id = id.substring(0, id.length-1);
	$("#customerInfoAllOutForm").find("#membershiplevelname").val(name);
	$("#customerInfoAllOutForm").find("#membershiplevelid").val(id);
}

function hideLvl() {
	$("#levelContent").fadeOut("fast");
	$("body").unbind("mousedown", onBodyDownLvl);
}
function onBodyDownLvl(event) {
	if (!(event.target.id == "membershiplevelname" || event.target.id == "levelContent" || $(event.target).parents("#levelContent").length>0)) {
		hideLvl();
	}
}
/*
 * 会员级别树选择 end
 */

/*
 * 会员类型树选择 begin
 */
function showCustomerType(){
	var Obj = $("#customerTypeName");
	var Offset = $("#customerTypeName").offset();
	$("#customerTypeContent").css({left:Offset.left + "px", top:Offset.top + Obj.outerHeight() + "px"}).slideDown("fast");
	$("body").bind("mousedown", onBodyDownCustomerType);
}

function beforeClickCustomerType(treeId, treeNode) {
	var zTree = $.fn.zTree.getZTreeObj("customerTypeTree");
	zTree.checkNode(treeNode, !treeNode.checked, null, true);
	return false;
}

function onCheckCustomerType(e, treeId, treeNode) {
	var zTree = $.fn.zTree.getZTreeObj("customerTypeTree"),
	nodes = zTree.getCheckedNodes(true),
	name = "";
	id = "";
	for (var i=0, l=nodes.length; i<l; i++) {
		if(nodes[i] && !nodes[i].isParent){
			name += nodes[i].name + ",";
			id += nodes[i].id + ",";
		}
	}
	if (name.length > 0 ) name = name.substring(0, name.length-1);
	if (id.length > 0 ) id = id.substring(0, id.length-1);
	$("#customerInfoAllOutForm").find("#customerTypeName").val(name);
	$("#customerInfoAllOutForm").find("#customerTypeId").val(id);
}

//设置默认值
function setCustomerTypeDefault(event, treeId, treeNode, msg) {
	var zTree = $.fn.zTree.getZTreeObj("customerTypeTree");
	zTree.checkNode(zTree.getNodeByParam("id", "1103", null), true, true);
	zTree.checkNode(zTree.getNodeByParam("id", "1111", null), true, true);
	onCheckCustomerType(event, treeId, treeNode);
}

function hideCustomerType() {
	$("#customerTypeContent").fadeOut("fast");
	$("body").unbind("mousedown", onBodyDownCustomerType);
}
function onBodyDownCustomerType(event) {
	if (!(event.target.id == "customerTypeName" || event.target.id == "customerTypeContent" || $(event.target).parents("#customerTypeContent").length>0)) {
		hideCustomerType();
	}
}
/*
 * 会员类型树选择 end
 */

/*
 * 商品分类树选择 begin
 */
function showProductClass(){
	var Obj = $("#productClassName");
	var Offset = $("#productClassName").offset();
	$("#productClassContent").css({left:Offset.left + "px", top:Offset.top + Obj.outerHeight() + "px"}).slideDown("fast");
	$("body").bind("mousedown", onBodyDownProductClass);
}

function beforeClickProductClass(treeId, treeNode) {
	var zTree = $.fn.zTree.getZTreeObj("productClassTree");
	zTree.checkNode(treeNode, !treeNode.checked, null, true);
	return false;
}

function onCheckProductClass(e, treeId, treeNode) {
	var zTree = $.fn.zTree.getZTreeObj("productClassTree"),
	nodes = zTree.getCheckedNodes(true),
	name = "";
	id = "";
	for (var i=0, l=nodes.length; i<l; i++) {
		if(nodes[i] && !nodes[i].isParent){
			name += nodes[i].name + ",";
			id += nodes[i].id + ",";
		}
	}
	if (name.length > 0 ) name = name.substring(0, name.length-1);
	if (id.length > 0 ) id = id.substring(0, id.length-1);
	$("#customerInfoAllOutForm").find("#productClassName").val(name);
	$("#customerInfoAllOutForm").find("#productClassId").val(id);
}

function hideProductClass() {
	$("#productClassContent").fadeOut("fast");
	$("body").unbind("mousedown", onBodyDownProductClass);
}
function onBodyDownProductClass(event) {
	if (!(event.target.id == "productClassName" || event.target.id == "productClassContent" || $(event.target).parents("#productClassContent").length>0)) {
		hideProductClass();
	}
}
function addProductClassDiyDom(treeId, treeNode) {
	var aObj = $("#" + treeNode.tId + IDMark_A);
	if (treeNode.isParent) {
		var editStr = "<a id='diyBtn1_" +treeNode.id+ "' onclick=changeNode('"+treeNode.id+"','productClassTree','onCheckProductClass()');>反选</a>";
		aObj.after(editStr);
	}
}
/*
 * 商品分类树选择 end
 */

/*
 * 通路树选择 begin
 */
function showSubchannel(){
	var Obj = $("#subchannelName");
	var Offset = $("#subchannelName").offset();
	$("#subchannelContent").css({left:Offset.left + "px", top:Offset.top + Obj.outerHeight() + "px"}).slideDown("fast");
	$("body").bind("mousedown", onBodyDownSubchannel);
}

function beforeClickSubchannel(treeId, treeNode) {
	var zTree = $.fn.zTree.getZTreeObj("subchannelTree");
	zTree.checkNode(treeNode, !treeNode.checked, null, true);
	return false;
}

function onCheckSubchannel(e, treeId, treeNode) {
	var zTree = $.fn.zTree.getZTreeObj("subchannelTree"),
	nodes = zTree.getCheckedNodes(true),
	name = "";
	id = "";
	for (var i=0, l=nodes.length; i<l; i++) {
		if(nodes[i] && !nodes[i].isParent){
			name += nodes[i].name + ",";
			id += nodes[i].id + ",";
		}
	}
	if (name.length > 0 ) name = name.substring(0, name.length-1);
	if (id.length > 0 ) id = id.substring(0, id.length-1);
	$("#customerInfoAllOutForm").find("#subchannelName").val(name);
	$("#customerInfoAllOutForm").find("#subchannelId").val(id);
}

function hideSubchannel() {
	$("#subchannelContent").fadeOut("fast");
	$("body").unbind("mousedown", onBodyDownSubchannel);
}
function onBodyDownSubchannel(event) {
	if (!(event.target.id == "subchannelName" || event.target.id == "subchannelContent" || $(event.target).parents("#subchannelContent").length>0)) {
		hideSubchannel();
	}
}
/*
 * 通路树选择 end
 */

/*
 * 订单类型树选择 begin
 */
function showOrderType(){
	var Obj = $("#orderTypeName");
	var Offset = $("#orderTypeName").offset();
	$("#orderTypeContent").css({left:Offset.left + "px", top:Offset.top + Obj.outerHeight() + "px"}).slideDown("fast");
	$("body").bind("mousedown", onBodyDownOrderType);
}

function beforeClickOrderType(treeId, treeNode) {
	var zTree = $.fn.zTree.getZTreeObj("orderTypeTree");
	zTree.checkNode(treeNode, !treeNode.checked, null, true);
	return false;
}

function onCheckOrderType(e, treeId, treeNode) {
	var zTree = $.fn.zTree.getZTreeObj("orderTypeTree"),
	nodes = zTree.getCheckedNodes(true),
	name = "";
	id = "";
	for (var i=0, l=nodes.length; i<l; i++) {
		if(nodes[i] && !nodes[i].isParent){
			name += nodes[i].name + ",";
			id += nodes[i].id + ",";
		}
	}
	if (name.length > 0 ) name = name.substring(0, name.length-1);
	if (id.length > 0 ) id = id.substring(0, id.length-1);
	$("#customerInfoAllOutForm").find("#orderTypeName").val(name);
	$("#customerInfoAllOutForm").find("#orderTypeId").val(id);
}

//设置默认值
function setOrderTypeDefault(event, treeId, treeNode, msg) {
	var zTree = $.fn.zTree.getZTreeObj("orderTypeTree");
	zTree.checkNode(zTree.getNodeByParam("id", "1", null), true, true);
	onCheckOrderType(event, treeId, treeNode);
}

function hideOrderType() {
	$("#orderTypeContent").fadeOut("fast");
	$("body").unbind("mousedown", onBodyDownOrderType);
}
function onBodyDownOrderType(event) {
	if (!(event.target.id == "orderTypeName" || event.target.id == "orderTypeContent" || $(event.target).parents("#orderTypeContent").length>0)) {
		hideOrderType();
	}
}
/*
 * 订单类型树选择 end
 */

/*
 * 订单状态树选择 begin
 */
function showOrderStatus(){
	var Obj = $("#orderStatusName");
	var Offset = $("#orderStatusName").offset();
	$("#orderStatusContent").css({left:Offset.left + "px", top:Offset.top + Obj.outerHeight() + "px"}).slideDown("fast");
	$("body").bind("mousedown", onBodyDownOrderStatus);
}

function beforeClickOrderStatus(treeId, treeNode) {
	var zTree = $.fn.zTree.getZTreeObj("orderStatusTree");
	zTree.checkNode(treeNode, !treeNode.checked, null, true);
	return false;
}

function onCheckOrderStatus(e, treeId, treeNode) {
	var zTree = $.fn.zTree.getZTreeObj("orderStatusTree"),
	nodes = zTree.getCheckedNodes(true),
	name = "";
	id = "";
	for (var i=0, l=nodes.length; i<l; i++) {
		if(nodes[i] && !nodes[i].isParent){
			name += nodes[i].name + ",";
			id += nodes[i].id + ",";
		}
	}
	if (name.length > 0 ) name = name.substring(0, name.length-1);
	if (id.length > 0 ) id = id.substring(0, id.length-1);
	$("#customerInfoAllOutForm").find("#orderStatusName").val(name);
	$("#customerInfoAllOutForm").find("#orderStatusId").val(id);
}

//设置默认值
function setOrderStatusDefault(event, treeId, treeNode, msg) {
	var zTree = $.fn.zTree.getZTreeObj("orderStatusTree");
	zTree.checkNode(zTree.getNodeByParam("id", "1001", null), true, true);
	zTree.checkNode(zTree.getNodeByParam("id", "1002", null), true, true);
	zTree.checkNode(zTree.getNodeByParam("id", "1003", null), true, true);
	zTree.checkNode(zTree.getNodeByParam("id", "1004", null), true, true);
	onCheckOrderStatus(event, treeId, treeNode);
}

function hideOrderStatus() {
	$("#orderStatusContent").fadeOut("fast");
	$("body").unbind("mousedown", onBodyDownOrderStatus);
}
function onBodyDownOrderStatus(event) {
	if (!(event.target.id == "orderStatusName" || event.target.id == "orderStatusContent" || $(event.target).parents("#orderStatusContent").length>0)) {
		hideOrderStatus();
	}
}
/*
 * 订单状态树选择 end
 */

/**
 * 商品品号excel上传
 */
function ajaxFileUpload()
{
	$("#productLoading").show();
	$.ajaxFileUpload
	(
		{
			url:'detailStat!upload.action?paramMap.prefix=customerinfoallout_product_',//用于文件上传的服务器端请求地址
			secureuri:false,//一般设置为false
			fileElementId:'file',//文件上传空间的id属性  <input type="file" id="file" name="file" />
			dataType: 'json',//返回值类型 一般设置为json
			success: function (data, status)  //服务器成功响应处理函数
			{
				if (data==undefined||data["errCode"]==undefined||data["errCode"]!=0) {
					if (data["errMsg"]!=undefined)
						$.messager.alert("操作提示", data.errMsg);
					else
						$.messager.alert("error", "服务器返回错误");
					$("#productLoading").hide();
					return;
				}
				var names = data["value"].split(",");
				$("#localFileName").empty();
				$("#localFileName").append(names[0]);
				$("#fileName").val(names[1]);
				$("#productLoading").hide();
			},
			error: function (data, status, e)//服务器响应失败处理函数
			{
				$("#productLoading").hide();
				$.messager.alert("error", e);
			}
		}
	)
}
/**
 * 订单创建人工号excel上传
 */
function ajaxFileUploadUserId()
{
	$("#CreatebyidLoading").show();
	$.ajaxFileUpload
	(
		{
			url:'detailStat!uploadUserId.action?paramMap.prefix=customerinfoallout_userid_',//用于文件上传的服务器端请求地址
			secureuri:false,//一般设置为false
			fileElementId:'fileCreatebyid',//文件上传空间的id属性  <input type="file" id="file" name="file" />
			dataType: 'json',//返回值类型 一般设置为json
			success: function (data, status)  //服务器成功响应处理函数
			{
				if (data==undefined||data["errCode"]==undefined||data["errCode"]!=0) {
					if (data["errMsg"]!=undefined)
						$.messager.alert("操作提示", data.errMsg);
					else
						$.messager.alert("error", "服务器返回错误");
					$("#CreatebyidLoading").hide();
					return;
				}
				var names = data["value"].split(",");
				$("#localFileUserName").empty();
				$("#localFileUserName").append(names[0]);
				$("#fileOrderCreateName").val(names[1]);
				$("#CreatebyidLoading").hide();
			},
			error: function (data, status, e)//服务器响应失败处理函数
			{
				$("#CreatebyidLoading").hide();
				$.messager.alert("error", e);
			}
		}
	)
}
