$(function(){
	$.getCaches("../cache!getCache.action","",function(cacheKeys){
		var options={
				url:"productStat!productTodayList.action",
				postData:{"paramMap.isCilckRefreshBtn":true},
				defaultSearch:false,
				colModel:[
				    {label:"厂商名称",name:"suppliername"},
				    {label:"商品品号",name:"productid"},
				    {label:"商品名称",name:"productname"},
				    {label:"小分类",name:"lclassname"},
				    {label:"MD姓名",name:"mdname"},
				    {label:"好易购价格",name:"price"},
				    {label:"订单数（排除取消）",name:"ordercc"},
				    {label:"商品数",name:"sumquantity"},
				    {label:"订单金额",name:"sumamount"},
				    {label:"毛利额(元)",name:"maoli"},
				    {label:"毛利率",name:"maolilv"}
				],
				multiselect:false,
				loadonce: false,
				caption:"查询列表",
				searchform: "#productTodayForm",
				sortname:"ordercc",
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

