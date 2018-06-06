var tabpanel;
$(function(){
	$.getCaches("../cache!getCache.action","SEX,STAT_CYCLE",function(cacheKeys){ 
		/*
		tabpanel = new TabPanel({
	        renderTo:'chartTab',
	        width:'100%',
	        height:'450px',
	        border:'none',  
	        active : 0,
	        maxLength : 10,
	        items : [
				{
					id:"search",
					title:"查询结果",
					html:'<table id="custDevelopStatTable"></table>',
					closable: false
				},
				{
					id:"chart",
					title:"图表显示",
					html:'<div id="custDevelopStatChartDiv" align="center"></div>',
					closable: false
				}
			]
	    });
		*/

		$("#orderStartTime").datebox("setValue",getDateString(-5));
		$("#orderEndTime").datebox("setValue",getDateString(0));
		//维度
		$("#custDevelopStatForm").find("#statCycle").val(10);
		
		var options={
				url:"query!initList.action",
				defaultSearch:false,
				colModel:[
				    {label:"时间",name:"time"},
				    {label:"新增数",name:"addedcustomercnt"},
				    {label:"流失数",name:"lapsedcustomercnt"},
				    {label:"活跃数",name:"activecustomercnt"},
				    {label:"平均每日会员新增数",name:"avgdailyaddedcustcnt",hidden:true},
				    {label:"当日流失数",name:"avgdailylapsedcustcnt",hidden:true}
				],
				multiselect:false,
				loadonce: false,
				scroll:true,//创建一个动态滚动的表格，当为true时，翻页栏被禁用，使用垂直滚动条加载数据，且在首次访问服务器端时将加载所有数据到客户端。当此参数为数字时，表格只控制可见的几行，所有数据都在这几行中加载
				rowNum:10000,
				caption:"查询列表",
				sortname:"time",
				searchform: "#custDevelopStatForm",
				//chartFunction:"drawFusionChart(s.chartXML)",//s.chartXML指定jqgrid执行ajax后success执行的js方法，s为success返得到的数据
				allowOper : {add:false,del:false,update:false,exportexcel:true}
			};
		$("#custDevelopStatTable").hlGrid(options);
	});
		
		$("#refreshBtn").click(function() {
			if($("#orderEndTime").datebox("getValue") == null || $("#orderEndTime").datebox("getValue") == "" || $("#orderStartTime").datebox("getValue") == null || $("#orderStartTime").datebox("getValue") == ""){
				$.messager.alert("操作提示", "请输入订购起止时间!");
				return false;
			}
			
			if($("#statCycle").val() == 10 && DateDiff($("#orderEndTime").datebox("getValue"),$("#orderStartTime").datebox("getValue"))>31){
				$.messager.alert("操作提示", "按天统计：订购起止时间请选择30天之内!");
				return;
			}
			if($("#statCycle").val() == 11 && MonthDiff($("#orderEndTime").datebox("getValue"),$("#orderStartTime").datebox("getValue"))>11){
				$.messager.alert("操作提示", "按月统计：订购起止时间请选择12个内!");
				return;
			}
			if($("#statCycle").val() == 12 && YearDiff($("#orderEndTime").datebox("getValue"),$("#orderStartTime").datebox("getValue"))>2){
				$.messager.alert("操作提示", "按年统计：订购起止时间请选择2年内!");
				return;
			}
			
			if($("#orderStartTime").datebox("getValue")!=null&&$("#orderStartTime").datebox("getValue")!=''
				&&$("#orderEndTime").datebox("getValue")!=null&&$("#orderEndTime").datebox("getValue")!=''
					&&compareDate($("#orderStartTime").datebox("getValue"),$("#orderEndTime").datebox("getValue"))){
				$.messager.alert("操作提示", "订购结束时间应大于起始时间!");
				return;
			}
			
			if($("#activeCycle").val() == null || $("#activeCycle").val() == ""){
				$.messager.alert("操作提示", "请输入活跃周期数!");
				return;
			}
			
			if($("#lossCycle").val() == null || $("#lossCycle").val() == ""){
				$.messager.alert("操作提示", "请输入流失周期数!");
				return;
			}
			
			if($("#newCustomerDays").val() == null || $("#newCustomerDays").val() == ""){
				$.messager.alert("操作提示", "请输入新会员定义天数!");
				return;
			}
			
			jQuery("#custDevelopStatTable").jqGrid("setGridParam", {url:"customerStat!custDevelopStatList.action"}); 
			$("#custDevelopStatTable").hlGridRefresh();
		});
		
		$("#resetBtn").click(function(){
			$("#custDevelopStatForm").clearForm();
			//活跃周期
			$("#custDevelopStatForm").find("#activeCycle").val(3);
			//维度
			$("#custDevelopStatForm").find("#statCycle").val(10);
			//流失周期
			$("#custDevelopStatForm").find("#lossCycle").val(12);
			//新会员定义
			$("#custDevelopStatForm").find("#newCustomerDays").val(3);
			//会员等级清空
			if($.fn.zTree.getZTreeObj("levelTree") != null){
				$.fn.zTree.getZTreeObj("levelTree").checkAllNodes(false);
			}
			//会员类型
			$.fn.zTree.getZTreeObj("customerTypeTree").checkAllNodes(false);
			setCustomerTypeDefault();
			//性别初始化
			$("#custDevelopStatForm").find("#sex").val(null);
			//订购时间
			$("#orderStartTime").datebox("setValue",getDateString(-5));
		    $("#orderEndTime").datebox("setValue",getDateString(0));
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
			$("#custDevelopStatForm").find("#membershiplevelname").val("");
			$("#custDevelopStatForm").find("#membershiplevelid").val("");
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
			$("#custDevelopStatForm").find("#customerTypeName").val("");
			$("#custDevelopStatForm").find("#customerTypeId").val("");
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
	$("#custDevelopStatForm").find("#membershiplevelname").val(name);
	$("#custDevelopStatForm").find("#membershiplevelid").val(id);
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
	$("#custDevelopStatForm").find("#customerTypeName").val(name);
	$("#custDevelopStatForm").find("#customerTypeId").val(id);
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

function drawFusionChart(xml){
	if(getChartFromId("custDevelopStatChat")){
		var chartReference = FusionCharts("custDevelopStatChat");
		if(xml == null || xml.chartXML == null || xml.chartXML == "")
			chartReference.setDataXML("");
		else
			chartReference.setDataXML(xml.chartXML);
	}else{
		//FusionCharts.setCurrentRenderer('javascript');//改用javascript方式显示图表
		var chart1 = new FusionCharts(contextPath+"/FusionChart/ScrollLine2D.swf", "custDevelopStatChat", "1000", "400");　　
		if(xml == null || xml.chartXML == null || xml.chartXML == "")
			chart1.setDataXML("");
		else
			chart1.setDataXML(xml.chartXML);　　 
	　　 chart1.render("custDevelopStatChartDiv");
	}
}
