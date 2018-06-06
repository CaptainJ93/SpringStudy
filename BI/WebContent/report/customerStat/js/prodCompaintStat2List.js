$(function(){
$.getCaches("../cache!getCache.action","",function(cacheKeys){
	var options={
			url:"query!initList.action",
			defaultSearch:false,
			exporturl:"customerStat!prodCompaintStat2Download.action",//用于数据导出url
			colModel:[
			    {label:"商品编号",name:"productid"},
			    {label:"商品名",name:"productname"},
			    {label:"客诉主因",name:"complaintcategoryname"},
			    {label:"客诉量",name:"complaintquantity"}
			],
			multiselect:false,
			loadonce: false,
			caption:"查询列表",
			sortname:"complaintquantity",
			sortorder:"desc",
			searchform: "#prodCompaintStat2Form",
			allowOper : {add:false,del:false,update:false,exportexcel:true}
		};
	$("#prodCompaintStat2Table").hlGrid(options);
	
	$("#orderStartTime").datebox("setValue",getDateString(-30)+" 00:00:00");
	$("#orderEndTime").datebox("setValue",getDateString(1)+" 00:00:00");
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
			$("#prodCompaintStat2Form").find("#orderStartTime").focus();
			return false;
		}
		
		if($("#orderStartTime").datebox("getValue")!=null&&$("#orderStartTime").datebox("getValue")!=''
			&&$("#orderEndTime").datebox("getValue")!=null&&$("#orderEndTime").datebox("getValue")!=''
				&&compareDate($("#orderStartTime").datebox("getValue"),$("#orderEndTime").datebox("getValue"))){
			$.messager.alert("操作提示", "订购结束时间应大于开始时间!");
			return;
		}
		
		jQuery("#prodCompaintStat2Table").jqGrid("setGridParam", {url:"customerStat!prodCompaintStat2List.action"}); 
		$("#prodCompaintStat2Table").hlGridRefresh();
	});
	
	$("#resetBtn").click(function(){
		$("#prodCompaintStat2Form").clearForm();
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
			$("#prodCompaintStat2Form").find("#membershiplevelname").val("");
			$("#prodCompaintStat2Form").find("#membershiplevelid").val("");
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
			$("#prodCompaintStat2Form").find("#customerTypeName").val("");
			$("#prodCompaintStat2Form").find("#customerTypeId").val("");
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
			$("#prodCompaintStat2Form").find("#returnReasonName").val("");
			$("#prodCompaintStat2Form").find("#returnReasonId").val("");
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
			$("#prodCompaintStat2Form").find("#complaintCategoryName").val("");
			$("#prodCompaintStat2Form").find("#complaintCategoryId").val("");
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
	$("#prodCompaintStat2Form").find("#membershiplevelname").val(name);
	$("#prodCompaintStat2Form").find("#membershiplevelid").val(id);
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
	$("#prodCompaintStat2Form").find("#customerTypeName").val(name);
	$("#prodCompaintStat2Form").find("#customerTypeId").val(id);
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
	$("#prodCompaintStat2Form").find("#returnReasonName").val(name);
	$("#prodCompaintStat2Form").find("#returnReasonId").val(id);
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
	$("#prodCompaintStat2Form").find("#complaintCategoryName").val(name);
	$("#prodCompaintStat2Form").find("#complaintCategoryId").val(id);
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
			url:'customerStat!upload.action?paramMap.prefix=prodCompaintStat2_product_',//用于文件上传的服务器端请求地址
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
			url:'customerStat!uploadUserId.action?paramMap.prefix=prodCompaintStat2_userid_',//用于文件上传的服务器端请求地址
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
			url:'customerStat!uploadHandleUserId.action?paramMap.prefix=prodCompaintStat2_userid2_',//用于文件上传的服务器端请求地址
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