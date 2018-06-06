$(function(){
	$.getCaches("../cache!getCache.action","",function(cacheKeys){
		var options={
				url:"financeSaleDetails!getsaleDetailsList.action",
				postData:{"paramMap.isCilckRefreshBtn":true},
				defaultSearch:false,
				colModel:[
					{label:"客代",name:"customerid" ,sortable:false},
					{label:"出货单号",name:"shiporderid"},
					{label:"序号",name:"sequenceno"},
					{label:"品号",name:"productid"},
					{label:"品名",name:"productname"},
					{label:"小分类",name:"sclasscode"},
					{label:"地区",name:"province"},
					{label:"地市",name:"city"},
					{label:"县市",name:"town"},
					{label:"通路",name:"subchannelname"},
					{label:"订单号",name:"orderid"},
				    {label:"配送方式",name:"deliverytype"},
				    {label:"出货日",name:"actualshippeddate"},
				    {label:"配送单号",name:"deliveryorderid"},
				    {label:"厂商代码",name:"supplierid"},
				    
				    {label:"发票金额",name:"invoiceamount"},
				    
				    {label:"订单金额",name:"productamount"}
				    
				],
				multiselect:false,
				loadonce: false,
				caption:"查询列表",
				searchform: "#productTodayForm",
				sortname:"orderid",
				sortorder:"desc",
				allowOper : {add:false,del:false,update:false,exportexcel:true}
			};
		
		$("#productTodayTable").hlGrid(options);
		jQuery("#productTodayTable").jqGrid("setGridParam",{postData:{"paramMap.isCilckRefreshBtn":false}});
	});
	
	$("#refreshBtn").click(function() {
		$("#productTodayTable").hlGridRefresh();
	});
	
	$("#resetBtn").click(function(){
		$("#productTodayForm").clearForm();
		//通路
		if($.fn.zTree.getZTreeObj("subchannelTree") != null){
			$.fn.zTree.getZTreeObj("subchannelTree").checkAllNodes(false);
		}
	});
	
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
			$("#productTodayForm").find("#subchannelName").val("");
			$("#productTodayForm").find("#subchannelId").val("");
			var zTree = $.fn.zTree.getZTreeObj("subchannelTree");
			zTree.checkAllNodes(false);//同时将全部节点设置为非选中状态
		});
		/*
		 * 通路树选择 end
		 */
});


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
	$("#productTodayForm").find("#subchannelName").val(name);
	$("#productTodayForm").find("#subchannelId").val(id);
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


