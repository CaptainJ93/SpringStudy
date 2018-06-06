$(function(){
	$.getCaches("../cache!getCache.action","",function(cacheKeys){
	$("#orderStartTime").datebox("setValue",getDateString(-30)+" 00:00:00");
	$("#orderEndTime").datebox("setValue",getDateString(1)+" 00:00:00");
	
	var options={
			url:"query!initList.action",
			exporturl:"detailStat!exportReturnResonStat.action",//用于数据导出url
			defaultSearch:false,
			colModel:[
			    {label:"客户编号",name:"customerid",width:"100",fixed:true},
			    {label:"客户名称",name:"customername",width:"100",fixed:true},
			    {label:"会员等级",name:"membershiplevelname",width:"100",fixed:true},
			    {label:"订单号",name:"orderid",width:"100",fixed:true},
			    {label:"项次号",name:"itemid",width:"100",fixed:true},
			    {label:"销退单号",name:"returnid",width:"100",fixed:true},
			    {label:"销退状态",name:"returnstatus",width:"100",fixed:true},
			    {label:"销退日期",name:"returndate",width:"150",fixed:true},
			    {label:"品号",name:"productid",width:"100",fixed:true},
			    {label:"品名",name:"productname",width:"200",fixed:true},
			    {label:"地址一",name:"address1",width:"150",fixed:true},
			    {label:"销退主因",name:"returnreason",width:"100",fixed:true},
			    {label:"客诉号",name:"complaintid",width:"100",fixed:true},
			    {label:"客诉描述",name:"complaintdescription",width:"300",fixed:true}
			],
			multiselect:false,
			loadonce: false,
			caption:"查询列表",
			sortname:"orderid",
			sortorder:"desc",
			searchform: "#returnResonStatForm",
			shrinkToFit:false,  //如果shrinkToFit为false且设置了width值，则每列的宽度不会成比例缩放，而是保持原有设置，而Grid将会有水平滚动条。
			allowOper : {add:false,del:false,update:false,exportexcel:true}
		};
	
		$("#returnResonStatTable").hlGrid(options);
		$("#returnResonStatTable").closest(".ui-jqgrid-bdiv").css({ 'overflow-x' : 'hidden' });
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
		
		if($("#orderEndTime").datebox("getValue") != "" &&($("#orderStartTime").datebox("getValue") == null || $("#orderStartTime").datebox("getValue") == "")){
			$.messager.alert("操作提示", "请输入订购起始时间!");
			$("#returnResonStatForm").find("#orderStartTime").focus();
			return false;
		}
		
		if($("#orderStartTime").datebox("getValue")!=null&&$("#orderStartTime").datebox("getValue")!=''
			&&$("#orderEndTime").datebox("getValue")!=null&&$("#orderEndTime").datebox("getValue")!=''
				&&compareDate($("#orderStartTime").datebox("getValue"),$("#orderEndTime").datebox("getValue"))){
			$.messager.alert("操作提示", "订购结束时间应大于开始时间!");
			return;
		}
		
		jQuery("#returnResonStatTable").jqGrid("setGridParam", {url:"detailStat!returnResonStatList.action"}); 
		$("#returnResonStatTable").hlGridRefresh();
		$("#returnResonStatTable").closest(".ui-jqgrid-bdiv").css({ 'overflow-x' : 'scroll' });
	});
	
	$("#resetBtn").click(function(){
		$("#returnResonStatForm").clearForm();
		//会员等级清空
		if($.fn.zTree.getZTreeObj("levelTree") != null){
			$.fn.zTree.getZTreeObj("levelTree").checkAllNodes(false);
		}
		//会员类型
		$.fn.zTree.getZTreeObj("customerTypeTree").checkAllNodes(false);
		setCustomerTypeDefault();
		//销退主因清空
		if($.fn.zTree.getZTreeObj("returnReasonTree") != null){
			$.fn.zTree.getZTreeObj("returnReasonTree").checkAllNodes(false);
		}
		//客诉主因清空
		if($.fn.zTree.getZTreeObj("complaintCategoryTree") != null){
			$.fn.zTree.getZTreeObj("complaintCategoryTree").checkAllNodes(false);
		}
		//商品品号excel清空
		$("#localFileName").empty();
		$("#fileName").val("");
		//订单创建人工号excel清空	
		$("#localFileUserName").empty();
		$("#fileOrderCreateName").val("");
		//订单处理人工号excel清空	
		$("#localFileUserName2").empty();
		$("#fileOrderHandleName").val("");
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
	//订单处理人工号excel清空	
	$("#clearFileHandlebyid").click(function() {
		$("#localFileUserName2").empty();
		$("#fileOrderHandleName").val("");
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
			$("#returnResonStatForm").find("#membershiplevelname").val("");
			$("#returnResonStatForm").find("#membershiplevelid").val("");
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
			$("#returnResonStatForm").find("#customerTypeName").val("");
			$("#returnResonStatForm").find("#customerTypeId").val("");
			var zTree = $.fn.zTree.getZTreeObj("customerTypeTree");
			zTree.checkAllNodes(false);//同时将全部节点设置为非选中状态
		});
		/*
		 * 会员类型树选择 end
		 */
		
		/*
		 * 销退主因树选择 begin
		 */
		var returnReason = {
				check: {
					enable: true,
					chkboxType: { "Y" : "ps", "N" : "ps" }
				},
				view: {
					dblClickExpand: false,
					addDiyDom: addReturnReasonDiyDom
				},
				data: {
					simpleData: {
						enable: true
					}
				},
				async: {
					enable: true,
					url:"./query!queryDomainData.action",
					otherParam:{"paramMap.domainname":"RETURNREASON"}
				},
				callback: {
					beforeClick: beforeClickReturnReason,
					onCheck: onCheckReturnReason
				}
			};
		$.fn.zTree.init($("#returnReasonTree"), returnReason, null);
		
		$("#clearReturnReason").click(function() {
			$("#returnResonStatForm").find("#returnReasonName").val("");
			$("#returnResonStatForm").find("#returnReasonId").val("");
			var zTree = $.fn.zTree.getZTreeObj("returnReasonTree");
			zTree.checkAllNodes(false);//同时将全部节点设置为非选中状态
		});
		/*
		 * 销退主因树选择 end
		 */
		
		/*
		 * 客诉主因树选择 begin
		 */
		var complaintCategory = {
				check: {
					enable: true,
					chkboxType: { "Y" : "ps", "N" : "ps" }
				},
				view: {
					dblClickExpand: false,
					addDiyDom: addComplaintCategoryDiyDom
				},
				data: {
					simpleData: {
						enable: true
					}
				},
				async: {
					enable: true,
					url:"./query!queryComplaintCategory.action",
				},
				callback: {
					beforeClick: beforeClickComplaintCategory,
					onCheck: onCheckComplaintCategory,
				}
			};
		$.fn.zTree.init($("#complaintCategoryTree"), complaintCategory, null);
		
		$("#clearComplaintCategory").click(function() {
			$("#returnResonStatForm").find("#complaintCategoryName").val("");
			$("#returnResonStatForm").find("#complaintCategoryId").val("");
			var zTree = $.fn.zTree.getZTreeObj("complaintCategoryTree");
			zTree.checkAllNodes(false);//同时将全部节点设置为非选中状态
		});
		/*
		 * 客诉主因树选择 end
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
	$("#returnResonStatForm").find("#membershiplevelname").val(name);
	$("#returnResonStatForm").find("#membershiplevelid").val(id);
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
	$("#returnResonStatForm").find("#customerTypeName").val(name);
	$("#returnResonStatForm").find("#customerTypeId").val(id);
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
 * 销退主因树选择 begin
 */
function showReturnReason(){
	var Obj = $("#returnReasonName");
	var Offset = $("#returnReasonName").offset();
	$("#returnReasonContent").css({left:Offset.left + "px", top:Offset.top + Obj.outerHeight() + "px"}).slideDown("fast");
	$("body").bind("mousedown", onBodyDownReturnReason);
}

function beforeClickReturnReason(treeId, treeNode) {
	var zTree = $.fn.zTree.getZTreeObj("returnReasonTree");
	zTree.checkNode(treeNode, !treeNode.checked, null, true);
	return false;
}

function onCheckReturnReason(e, treeId, treeNode) {
	var zTree = $.fn.zTree.getZTreeObj("returnReasonTree"),
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
	$("#returnResonStatForm").find("#returnReasonName").val(name);
	$("#returnResonStatForm").find("#returnReasonId").val(id);
}

function hideReturnReason() {
	$("#returnReasonContent").fadeOut("fast");
	$("body").unbind("mousedown", onBodyDownReturnReason);
}
function onBodyDownReturnReason(event) {
	if (!(event.target.id == "returnReasonName" || event.target.id == "returnReasonContent" || $(event.target).parents("#returnReasonContent").length>0)) {
		hideReturnReason();
	}
}
function addReturnReasonDiyDom(treeId, treeNode) {
	var aObj = $("#" + treeNode.tId + IDMark_A);
	if (treeNode.isParent) {
		var editStr = "<a id='diyBtn1_" +treeNode.id+ "' onclick=changeNode('"+treeNode.id+"','returnReasonTree','onCheckReturnReason()');>反选</a>";
		aObj.after(editStr);
	}
}
/*
 * 销退主因树选择 end
 */

/*
 * 客诉主因树选择 begin
 */
function showComplaintCategory(){
	var Obj = $("#complaintCategoryName");
	var Offset = $("#complaintCategoryName").offset();
	$("#complaintCategoryContent").css({left:Offset.left + "px", top:Offset.top + Obj.outerHeight() + "px"}).slideDown("fast");
	$("body").bind("mousedown", onBodyDownComplaintCategory);
}

function beforeClickComplaintCategory(treeId, treeNode) {
	var zTree = $.fn.zTree.getZTreeObj("complaintCategoryTree");
	zTree.checkNode(treeNode, !treeNode.checked, null, true);
	return false;
}

function onCheckComplaintCategory(e, treeId, treeNode) {
	var zTree = $.fn.zTree.getZTreeObj("complaintCategoryTree"),
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
	$("#returnResonStatForm").find("#complaintCategoryName").val(name);
	$("#returnResonStatForm").find("#complaintCategoryId").val(id);
}

function hideComplaintCategory() {
	$("#complaintCategoryContent").fadeOut("fast");
	$("body").unbind("mousedown", onBodyDownComplaintCategory);
}
function onBodyDownComplaintCategory(event) {
	if (!(event.target.id == "complaintCategoryName" || event.target.id == "complaintCategoryContent" || $(event.target).parents("#complaintCategoryContent").length>0)) {
		hideComplaintCategory();
	}
}
function addComplaintCategoryDiyDom(treeId, treeNode) {
	var aObj = $("#" + treeNode.tId + IDMark_A);
	if (treeNode.isParent) {
		var editStr = "<a id='diyBtn1_" +treeNode.id+ "' onclick=changeNode('"+treeNode.id+"','complaintCategoryTree','onCheckComplaintCategory()');>反选</a>";
		aObj.after(editStr);
	}
}
/*
 * 客诉主因树选择 end
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
			url:'detailStat!upload.action?paramMap.prefix=returnResonStat_product_',//用于文件上传的服务器端请求地址
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
			url:'detailStat!uploadUserId.action?paramMap.prefix=returnResonStat_userid_',//用于文件上传的服务器端请求地址
			secureuri:false,//一般设置为false
			fileElementId:'fileCreatebyid',
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

/**
 * 订单处理人工号excel上传
 */
function ajaxFileUploadUserId2()
{
	$("#HandlebyidLoading").show();
	$.ajaxFileUpload
	(
		{
			url:'detailStat!uploadHandleUserId.action?paramMap.prefix=returnResonStat_userid2_',//用于文件上传的服务器端请求地址
			secureuri:false,//一般设置为false
			fileElementId:'fileHandlebyid',
			dataType: 'json',//返回值类型 一般设置为json
			success: function (data, status)  //服务器成功响应处理函数
			{
				if (data==undefined||data["errCode"]==undefined||data["errCode"]!=0) {
					if (data["errMsg"]!=undefined)
						$.messager.alert("操作提示", data.errMsg);
					else
						$.messager.alert("error", "服务器返回错误");
					$("#HandlebyidLoading").hide();
					return;
				}
				var names = data["value"].split(",");
				$("#localFileUserName2").empty();
				$("#localFileUserName2").append(names[0]);
				$("#fileOrderHandleName").val(names[1]);
				$("#HandlebyidLoading").hide();
			},
			error: function (data, status, e)//服务器响应失败处理函数
			{
				$("#HandlebyidLoading").hide();
				$.messager.alert("error", e);
			}
		}
	)
}