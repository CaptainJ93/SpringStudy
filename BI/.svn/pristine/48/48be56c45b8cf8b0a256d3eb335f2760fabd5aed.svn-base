$(function(){
	$.getCaches("../cache!getCache.action","SEX",function(cacheKeys){ 
		$("#registerStartTime").datebox("setValue",getDateString(-30));
		$("#registerEndTime").datebox("setValue",getDateString(1));
		var options={
				url:"query!initList.action",
				defaultSearch:false,
				colModel:[
				    {label:"总会员数",name:"customercount"},
				    {label:"新会员活跃数",name:"newcustomercount"},
				    {label:"老会员活跃数",name:"oldcustomercount"}
				],
				loadonce: false,
				caption:"查询列表",
				sortname:"customercount",
				searchform: "#activeCustStatForm",
				allowOper : {add:false,del:false,update:false,exportexcel:true}
			};
		
			$("#activeCustStatTable").hlGrid(options);
	});
		
		$("#refreshBtn").click(function() {
			if($("#activeCycle").val() == null || $("#activeCycle").val() == ""){
				$.messager.alert("操作提示", "请输入活跃周期数!");
				return;
			}
			
			if($("#registerEndTime").datebox("getValue") == null || $("#registerEndTime").datebox("getValue") == "" || $("#registerStartTime").datebox("getValue") == null || $("#registerStartTime").datebox("getValue") == ""){
				$.messager.alert("操作提示", "请输入注册起止时间!");
				return false;
			}
			
//			if(DateDiff($("#registerEndTime").datebox("getValue"),$("#registerStartTime").datebox("getValue"))>365*2+1){
//				$.messager.alert("操作提示", "注册起止时间在2年之内!");
//				return;
//			}
			
			if($("#newCustomerDays").val() == null || $("#newCustomerDays").val() == ""){
				$.messager.alert("操作提示", "请输入新会员定义天数!");
				return;
			}
			
			if($("#registerStartTime").datebox("getValue")!=null&&$("#registerStartTime").datebox("getValue")!=''
				&&$("#registerEndTime").datebox("getValue")!=null&&$("#registerEndTime").datebox("getValue")!=''
					&&compareDate($("#registerStartTime").datebox("getValue"),$("#registerEndTime").datebox("getValue"))){
				$.messager.alert("操作提示", "注册结束时间应大于起始时间!");
				return;
			}
			
			jQuery("#activeCustStatTable").jqGrid("setGridParam", {url:"customerStat!activeCustStatList.action"}); 
			$("#activeCustStatTable").hlGridRefresh();
		});
		
		$("#resetBtn").click(function(){
			$("#activeCustStatForm").clearForm();
			//活跃周期
			$("#activeCustStatForm").find("#activeCycle").val(3);
			//新会员定义
			$("#activeCustStatForm").find("#newCustomerDays").val(3);
			//会员等级清空
			if($.fn.zTree.getZTreeObj("levelTree") != null){
				$.fn.zTree.getZTreeObj("levelTree").checkAllNodes(false);
			}
			//会员类型
			$.fn.zTree.getZTreeObj("customerTypeTree").checkAllNodes(false);
			setCustomerTypeDefault();
			//性别初始化
			$("#activeCustStatForm").find("#sex").val(null);
			//注册时间
			$("#registerStartTime").datebox("setValue",getDateString(-30));
		    $("#registerEndTime").datebox("setValue",getDateString(1));
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
			$("#activeCustStatForm").find("#membershiplevelname").val("");
			$("#activeCustStatForm").find("#membershiplevelid").val("");
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
			$("#activeCustStatForm").find("#customerTypeName").val("");
			$("#activeCustStatForm").find("#customerTypeId").val("");
			var zTree = $.fn.zTree.getZTreeObj("customerTypeTree");
			zTree.checkAllNodes(false);//同时将全部节点设置为非选中状态
		});
		/*
		 * 会员类型树选择 end
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
	$("#activeCustStatForm").find("#membershiplevelname").val(name);
	$("#activeCustStatForm").find("#membershiplevelid").val(id);
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
	$("#activeCustStatForm").find("#customerTypeName").val(name);
	$("#activeCustStatForm").find("#customerTypeId").val(id);
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

