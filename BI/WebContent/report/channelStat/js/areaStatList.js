$(function(){
	$.getCaches("../cache!getCache.action","SEX,EXCLUDERETURNFLAG",function(cacheKeys){
		$("#orderStartTime").datebox("setValue",getDateString(-30)+" 00:00:00");
		$("#orderEndTime").datebox("setValue",getDateString(1)+" 00:00:00");
		
		var options={
				url:"query!initList.action",
				defaultSearch:false,
				colModel:[
				    {label:"省",name:"province"},
				    {label:"市",name:"city",hidden:true},
				    {label:"区",name:"area",hidden:true},
				    {label:"订单数",name:"ordercount"},
				    {label:"订单金额",name:"orderamout"},
				    {label:"有效订单数",name:"validordercount"},
				    {label:"有效订单金额",name:"validorderamout"},
				    {label:"毛利额",name:"maoli"},
				    {label:"毛利率",name:"maolilv"},
				    {label:"占总订单数百分比",name:"percernt"}
				],
				multiselect:false,
				loadonce: false,
				caption:"查询列表",
				searchform: "#areaStatForm",
				sortname:"province",
				allowOper : {add:false,del:false,update:false,exportexcel:true}
			};
		
		$("#areaStatTable").hlGrid(options);
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
		
		if($("#areaStatForm").find("#ageStart").val() != "" && ($("#areaStatForm").find("#ageEnd").val() == null || $("#areaStatForm").find("#ageEnd").val() == "")){
			$.messager.alert("操作提示", "起始年龄和终止年龄必须同时填写!");
			$("#areaStatForm").find("#ageEnd").focus();
			return false;
	 	}
		
		if($("#areaStatForm").find("#ageEnd").val() != "" && ($("#areaStatForm").find("#ageStart").val() == null || $("#areaStatForm").find("#ageStart").val() == "")){
			$.messager.alert("操作提示", "起始年龄和终止年龄必须同时填写!");
			$("#areaStatForm").find("#ageStart").focus();
			return false;
	 	}
		
		if($("#registerEndTime").datebox("getValue") != "" &&($("#registerStartTime").datebox("getValue") == null || $("#registerStartTime").datebox("getValue") == "")){
			$.messager.alert("操作提示", "请输入注册起始时间!");
			$("#areaStatForm").find("#registerStartTime").focus();
			return false;
		}
		
		if($("#actualEndTime").datebox("getValue") != "" &&($("#actualStartTime").datebox("getValue") == null || $("#actualStartTime").datebox("getValue") == "")){
			$.messager.alert("操作提示", "请输入行销活动起始时间!");
			$("#areaStatForm").find("#actualStartTime").focus();
			return false;
		}
		
		if($("#orderEndTime").datebox("getValue") != "" &&($("#orderStartTime").datebox("getValue") == null || $("#orderStartTime").datebox("getValue") == "")){
			$.messager.alert("操作提示", "请输入订购起始时间!");
			$("#areaStatForm").find("#orderStartTime").focus();
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
		
		jQuery("#areaStatTable").jqGrid("setGridParam", {url:"channelStat!areaStatList.action"}); 
		var dimensionVal=$('input:radio[name="dimension"]:checked').val();
		$("#checkDimension").val(dimensionVal);
		if(dimensionVal == 10){
			jQuery("#areaStatTable").setGridParam().hideCol(["city","area"]);
		}else if(dimensionVal == 11){
			jQuery("#areaStatTable").setGridParam().showCol("city");
			jQuery("#areaStatTable").setGridParam().hideCol("area");
		}else{
			jQuery("#areaStatTable").setGridParam().showCol(["city","area"]);
		}
		$("#areaStatTable").hlGridRefresh();
		$("#areaStatTable").hlGridAdjustWidth();
	});
	
	$("#resetBtn").click(function(){
		$("#areaStatForm").clearForm();
		//地区清空
		$.fn.zTree.getZTreeObj("areaZipCodeTree").checkAllNodes(false);
		//会员等级清空
		$.fn.zTree.getZTreeObj("levelTree").checkAllNodes(false);
		//性别初始化
		$("#areaStatForm").find("#sex").val(null);
		$("#areaStatForm").find("#excludereturnflag").val("N");
		$("#areaStatForm").find("#dimensionProvince").attr("checked","checked");
		//会员类型
		$.fn.zTree.getZTreeObj("customerTypeTree").checkAllNodes(false);
		setCustomerTypeDefault();
		//商品分类
		$.fn.zTree.getZTreeObj("productClassTree").checkAllNodes(false);
		//通路
		$.fn.zTree.getZTreeObj("subchannelTree").checkAllNodes(false);
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
		//订购时间
		$("#orderStartTime").datebox("setValue",getDateString(-30)+" 00:00:00");
	    $("#orderEndTime").datebox("setValue",getDateString(1)+" 00:00:00");
	});
	
	
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
		 * 地区树选择 begin
		 */
		var areaZipCode = {
				check: {
					enable: true,
					chkboxType: { "Y" : "ps", "N" : "ps" }
				},
				view: {
					dblClickExpand: true,
					addDiyDom: addAreaZipCodeDiyDom
				},
				data: {
					simpleData: {
						enable: true
					}
				},
				async: {
					enable: true,
					url:"./query!queryAreaZipCode.action",
				},
				callback: {
					beforeClick: beforeClickAreaZipCode,
					onCheck: onCheckAreaZipCode,
				}
			};
		$.fn.zTree.init($("#areaZipCodeTree"), areaZipCode, null);
	
		$("#clearAreaZipCode").click(function() {
			$("#areaStatForm").find("#areaZipCodeName").val("");
			$("#areaStatForm").find("#areaZipCodeId").val("");
			var zTree = $.fn.zTree.getZTreeObj("areaZipCodeTree");
			zTree.checkAllNodes(false);//同时将全部节点设置为非选中状态
		});
		/*
		 * 地区树选择 end
		 */
	
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
			$("#areaStatForm").find("#membershiplevelname").val("");
			$("#areaStatForm").find("#membershiplevelid").val("");
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
			$("#areaStatForm").find("#customerTypeName").val("");
			$("#areaStatForm").find("#customerTypeId").val("");
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
			$("#areaStatForm").find("#productClassName").val("");
			$("#areaStatForm").find("#productClassId").val("");
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
			$("#areaStatForm").find("#subchannelName").val("");
			$("#areaStatForm").find("#subchannelId").val("");
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
			$("#areaStatForm").find("#orderTypeName").val("");
			$("#areaStatForm").find("#orderTypeId").val("");
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
			$("#areaStatForm").find("#orderStatusName").val("");
			$("#areaStatForm").find("#orderStatusId").val("");
			var zTree = $.fn.zTree.getZTreeObj("orderStatusTree");
			zTree.checkAllNodes(false);//同时将全部节点设置为非选中状态
		});
		/*
		 * 订单状态树选择 end
		 */
});

/*
 * 地区树选择 begin
 */
function showAreaZipCode(){
	var Obj = $("#areaZipCodeName");
	var Offset = $("#areaZipCodeName").offset();
	$("#areaZipCodeContent").css({left:Offset.left + "px", top:Offset.top + Obj.outerHeight() + "px"}).slideDown("fast");
	$("body").bind("mousedown", onBodyDownAreaZipCode);
}

function beforeClickAreaZipCode(treeId, treeNode) {
	var zTree = $.fn.zTree.getZTreeObj("areaZipCodeTree");
	zTree.checkNode(treeNode, !treeNode.checked, null, true);
	return false;
}

function onCheckAreaZipCode(e, treeId, treeNode) {
	var zTree = $.fn.zTree.getZTreeObj("areaZipCodeTree"),
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
	$("#areaStatForm").find("#areaZipCodeName").val(name);
	$("#areaStatForm").find("#areaZipCodeId").val(id);
}

function hideAreaZipCode() {
	$("#areaZipCodeContent").fadeOut("fast");
	$("body").unbind("mousedown", onBodyDownAreaZipCode);
}
function onBodyDownAreaZipCode(event) {
	if (!(event.target.id == "areaZipCodeName" || event.target.id == "areaZipCodeContent" || $(event.target).parents("#areaZipCodeContent").length>0)) {
		hideAreaZipCode();
	}
}

function addAreaZipCodeDiyDom(treeId, treeNode) {
	var aObj = $("#" + treeNode.tId + IDMark_A);
	if (treeNode.isParent) {
		var editStr = "<a id='diyBtn1_" +treeNode.id+ "' onclick=changeNode('"+treeNode.id+"','areaZipCodeTree','onCheckAreaZipCode()');>反选</a>";
		aObj.after(editStr);
	}
}
/*
 * 地区树选择 end
 */

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
	$("#areaStatForm").find("#membershiplevelname").val(name);
	$("#areaStatForm").find("#membershiplevelid").val(id);
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
	$("#areaStatForm").find("#customerTypeName").val(name);
	$("#areaStatForm").find("#customerTypeId").val(id);
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
	$("#areaStatForm").find("#productClassName").val(name);
	$("#areaStatForm").find("#productClassId").val(id);
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
	$("#areaStatForm").find("#subchannelName").val(name);
	$("#areaStatForm").find("#subchannelId").val(id);
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
	$("#areaStatForm").find("#orderTypeName").val(name);
	$("#areaStatForm").find("#orderTypeId").val(id);
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
	$("#areaStatForm").find("#orderStatusName").val(name);
	$("#areaStatForm").find("#orderStatusId").val(id);
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
			url:'channelStat!upload.action?paramMap.prefix=areastat_product_',//用于文件上传的服务器端请求地址
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
			url:'channelStat!uploadUserId.action?paramMap.prefix=areastat_userid_',//用于文件上传的服务器端请求地址
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