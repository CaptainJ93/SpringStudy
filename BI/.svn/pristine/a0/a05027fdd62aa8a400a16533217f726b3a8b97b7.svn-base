$(function() {
	$.getCaches("../cache!getCache.action","",function(cacheKeys){
		var options={
				url:"summaryStat!pgminfoDetailList.action",
				postData:{"paramMap.isCilckRefreshBtn":true},
				colModel:[
					{name:"md",label:"md姓名",width:"100",fixed:true},
					{name:"mday",label:"日期",width:"100",fixed:true},
					{name:"shiduan",label:"时段",width:"100",fixed:true},
					{name:"pgmlength",label:"节目时长",width:"100",fixed:true},
					{name:"productid",label:"商品品号",width:"100",fixed:true},
					{name:"productname",label:"商品名称",width:"200",fixed:true},
					{name:"sellingprice",label:"商品售价",width:"100",fixed:true},
					{name:"validordercc",label:"有效订单数",width:"100",fixed:true},
					{name:"validproductamount",label:"有效订单金额",width:"100",fixed:true},
					{name:"validmaoli",label:"有效订单毛利",width:"100",fixed:true},
					{name:"istape",label:"是否播带",width:"70",fixed:true},
					{name:"plannedtargetrevenue",label:"目标业绩",width:"100",fixed:true},
					{name:"pd1",label:"pd1",width:"100",fixed:true},
					{name:"pd2",label:"pd2",width:"100",fixed:true},
					{name:"sh1",label:"sh1",width:"100",fixed:true},
					{name:"sh2",label:"sh2",width:"100",fixed:true},
					{name:"sh3",label:"sh3",width:"100",fixed:true},
					{name:"day",label:"星期",width:"100",fixed:true},
					{name:"newcustordcount1d",label:"当天注册当天购买会员数",width:"150",fixed:true},
					{name:"newcustordcount30d",label:"30天内有多次购买会员数",width:"150",fixed:true},
					{name:"newcustordcount90d",label:"90天内有多次购买会员数",width:"150",fixed:true},
					{name:"newcustordcount1y",label:"1年内有多次购买会员数",width:"150",fixed:true},
					{name:"newcustordcount2y",label:"2年内有多次购买会员数",width:"150",fixed:true},
					{name:"newcustordcount3y",label:"3年内有多次购买会员数",width:"150",fixed:true},
					{name:"newcustordcount5y",label:"5年内有多次购买会员数",width:"150",fixed:true},
					{name:"newcustordcount7y",label:"7年内有多次购买会员数",width:"150",fixed:true},
					{name:"subchannelname",label:"通路名称",width:"100",fixed:true},
					{name:"custcount",label:"客户总数",width:"70",fixed:true},
					{name:"minorderdate",label:"最早订单时间",width:"200",fixed:true},
					{name:"maxorderdate",label:"最晚订单时间",width:"200",fixed:true}
				],
				multiselect:false,
				loadonce: false,
				caption:"节目业绩查询列表",
				sortname:"subchannelid,prdqstarttime",
				sortorder:"desc",
				rowNum:10,
				searchform: "#pgmForm",
				shrinkToFit:false,  //如果shrinkToFit为false且设置了width值，则每列的宽度不会成比例缩放，而是保持原有设置，而Grid将会有水平滚动条。
				allowOper : {add:false,del:false,update:false,exportexcel:false},
				onCellSelect:function(rowid,iCol,cellcontent,e){
					if(iCol == 4){
						$("#productinfoTodayForm").find("#productid").val(cellcontent);
						$("#productinfoTodayForm").find("#productname").val('');
						$("#refreshProductBtn").click();
						//同时查询该商品历史的节目业绩
						jQuery("#pgmHisTable").jqGrid("setGridParam", {url:"summaryStat!pgminfoDetailHisList.action"}); 
						jQuery("#pgmHisTable").jqGrid("setGridParam", {postData:{"paramMap.productid":cellcontent}}); 
						$("#pgmHisTable").hlGridRefresh();
						jQuery("#pgmHisTable").jqGrid("setGridParam", {postData:{"paramMap.isCilckRefreshBtn":false}}); 
					}
				}
			};
		$("#pgmTable").hlGrid(options);
		if (!$.browser.msie) {
			$("#pgmTable").setGridWidth($("#gbox_pgmTable").width()-15);
		}
		jQuery("#pgmTable").jqGrid("setGridParam", {postData:{"paramMap.isCilckRefreshBtn":false}}); 
		
		var optionsHis={
				url:"query!initList.action",
				postData:{"paramMap.isCilckRefreshBtn":true},
				colModel:[
				    {name:"subchannelname",label:"通路名称",width:"100",fixed:true},
					{name:"md",label:"md姓名",width:"100",fixed:true},
					{name:"mday",label:"日期",width:"100",fixed:true},
					{name:"shiduan",label:"时段",width:"100",fixed:true},
					{name:"pgmlength",label:"节目时长",width:"100",fixed:true},
					{name:"productid",label:"商品品号",width:"100",fixed:true},
					{name:"productname",label:"商品名称",width:"200",fixed:true},
					{name:"sellingprice",label:"商品售价",width:"100",fixed:true},
					{name:"validordercc",label:"有效订单数",width:"100",fixed:true},
					{name:"validproductamount",label:"有效订单金额",width:"100",fixed:true},
					{name:"validmaoli",label:"有效订单毛利",width:"100",fixed:true},
					{name:"istape",label:"是否播带",width:"70",fixed:true},
					{name:"plannedtargetrevenue",label:"目标业绩",width:"100",fixed:true},
					{name:"pd1",label:"pd1",width:"100",fixed:true},
					{name:"pd2",label:"pd2",width:"100",fixed:true},
					{name:"sh1",label:"sh1",width:"100",fixed:true},
					{name:"sh2",label:"sh2",width:"100",fixed:true},
					{name:"sh3",label:"sh3",width:"100",fixed:true},
					{name:"day",label:"星期",width:"100",fixed:true},
					{name:"newcustordcount1d",label:"当天注册当天购买会员数",width:"150",fixed:true},
					{name:"newcustordcount30d",label:"30天内有多次购买会员数",width:"150",fixed:true},
					{name:"newcustordcount90d",label:"90天内有多次购买会员数",width:"150",fixed:true},
					{name:"newcustordcount1y",label:"1年内有多次购买会员数",width:"150",fixed:true},
					{name:"newcustordcount2y",label:"2年内有多次购买会员数",width:"150",fixed:true},
					{name:"newcustordcount3y",label:"3年内有多次购买会员数",width:"150",fixed:true},
					{name:"newcustordcount5y",label:"5年内有多次购买会员数",width:"150",fixed:true},
					{name:"newcustordcount7y",label:"7年内有多次购买会员数",width:"150",fixed:true},
					{name:"custcount",label:"客户总数",width:"70",fixed:true},
					{name:"minorderdate",label:"最早订单时间",width:"200",fixed:true},
					{name:"maxorderdate",label:"最晚订单时间",width:"200",fixed:true}
				],
				multiselect:false,
				loadonce: false,
				caption:"商品历史节目业绩查询列表",
				sortname:"validordercc",
				sortorder:"desc",
				rowNum:10,
				searchform: "#pgmForm",
				shrinkToFit:false,  //如果shrinkToFit为false且设置了width值，则每列的宽度不会成比例缩放，而是保持原有设置，而Grid将会有水平滚动条。
				allowOper : {add:false,del:false,update:false,exportexcel:false}
			};
			$("#pgmHisTable").hlGrid(optionsHis);
			if (!$.browser.msie) {
				$("#pgmHisTable").setGridWidth($("#gbox_pgmHisTable").width()-15);
			}
		
		var options2={
				url:"summaryStat!campainsinfoDetailList.action",
				postData:{"paramMap.isCilckRefreshBtn":true},
				colModel:[
                    {name:"campaignno",label:"行销活动号",width:"100",fixed:true},
				    {name:"campaignname",label:"行销名",width:"400",fixed:true},
				    {name:"campaigntypename",label:"行销活动类型",width:"100",fixed:true},
					{name:"actualstartdate",label:"活动开始时间",width:"200",fixed:true},
					{name:"actualenddate",label:"活动截至时间",width:"200",fixed:true},
					{name:"days",label:"活动天数",width:"100",fixed:true},
					{name:"ordercc",label:"总订单数",width:"100",fixed:true},
					{name:"validordercc",label:"有效订单数",width:"100",fixed:true},
					{name:"validproductamount",label:"有效订单金额",width:"100",fixed:true},
					{name:"validmaoli",label:"有效订单毛利",width:"100",fixed:true},
					{name:"newcustordcount1d",label:"当天注册当天购买会员数",width:"150",fixed:true},
					{name:"newcustordcount30d",label:"30天内有多次购买会员数",width:"150",fixed:true},
					{name:"newcustordcount90d",label:"90天内有多次购买会员数",width:"150",fixed:true},
					{name:"newcustordcount1y",label:"1年内有多次购买会员数",width:"150",fixed:true},
					{name:"newcustordcount2y",label:"2年内有多次购买会员数",width:"150",fixed:true},
					{name:"newcustordcount3y",label:"3年内有多次购买会员数",width:"150",fixed:true},
					{name:"newcustordcount5y",label:"5年内有多次购买会员数",width:"150",fixed:true},
					{name:"newcustordcount7y",label:"7年内有多次购买会员数",width:"150",fixed:true},
					{name:"custcount",label:"总消费会员数",width:"100",fixed:true},
					{name:"prodcounts",label:"总参与商品数",width:"100",fixed:true},
					{name:"offcount",label:"赠品数",width:"100",fixed:true},
					{name:"prodcountquantity",label:"销售商品数量",width:"100",fixed:true},
					{name:"offquantity",label:"销售赠品数",width:"100",fixed:true},
					{name:"givecash",label:"总赠送现金金额",width:"100",fixed:true},
					{name:"zhekou",label:"总使用折扣金额",width:"100",fixed:true},
					{name:"zhejiaquan",label:"总使用折价券金额",width:"150",fixed:true}
				],
				multiselect:false,
				loadonce: false,
				caption:"行销活动业绩查询列表",
				sortname:"campaignno",
				sortorder:"desc",
				rowNum:10,
				searchform: "#campainsForm",
				shrinkToFit:false,//如果shrinkToFit为false且设置了width值，则每列的宽度不会成比例缩放，而是保持原有设置，而Grid将会有水平滚动条。
				hidegrid: false, //不显示收缩
				allowOper : {add:false,del:false,update:false,exportexcel:false}
			};
		
		$("#campainsTable").hlGrid(options2);
		if (!$.browser.msie) {
			$("#campainsTable").setGridWidth($("#gbox_campainsTable").width()-15);
		}
		jQuery("#campainsTable").jqGrid("setGridParam", {postData:{"paramMap.isCilckRefreshBtn":false}});
	});
		$("#refreshProductBtn").click(function(){
			//将查询按钮
			$("#productinfoTodayForm").find("#refreshProductBtn").attr("disabled", true);
			jQuery.ajax({
				url:'summaryStat!productinfoTodayList.action',
					type:'post',
					context:this,
					dataType: "json",
					data:{"paramMap.productid":$("#productid").val(),"paramMap.productname":$("#productname").val()},
					success:function(data){
						var chart1Reference = FusionCharts("chart1Id");
						if(data["chartXML"]["sumamount"] == null || data["chartXML"]["sumamount"] == "")
							chart1Reference.setDataXML("");
						else
							chart1Reference.setDataXML(data["chartXML"]["sumamount"]);
						
						var chart2Reference = FusionCharts("chart2Id");
						if(data["chartXML"]["ordercc"] == null || data["chartXML"]["ordercc"] == "")
							chart2Reference.setDataXML("");
						else
							chart2Reference.setDataXML(data["chartXML"]["ordercc"]);
						$("#productinfoTodayForm").find("#refreshProductBtn").attr("disabled", false);
					}
			});
		});	
		
		$("#refreshPgmBtn").click(function(){
			$("#pgmTable").hlGridRefresh();
		});	
		
		$("#refreshCampainsBtn").click(function(){
			$("#campainsTable").hlGridRefresh();
		});	
		
		/*
		 * 通路树选择 begin--节目
		 */
		var subchannel = {
				check: {
					enable: true//,
					//chkStyle: "radio",
					//radioType: "all"
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
		
		$("#clearPgmSubchannel").click(function() {
			$("#pgmForm").find("#subchannelName").val("");
			$("#pgmForm").find("#subchannelId").val("");
			var zTree = $.fn.zTree.getZTreeObj("subchannelTree");
			zTree.checkAllNodes(false);//同时将全部节点设置为非选中状态
		});
		/*
		 * 通路树选择 end
		 */
		
		/*
		 * 通路树选择 begin--行销活动
		 */
		var subchannel2 = {
				check: {
					enable: true,
					chkStyle: "radio",
					radioType: "all"
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
					beforeClick: beforeClickSubchannel2,
					onCheck: onCheckSubchannel2,
				}
			};
		$.fn.zTree.init($("#subchannelTree2"), subchannel2, null);
		
		$("#clearCampainsSubchannel").click(function() {
			$("#campainsForm").find("#subchannelName2").val("");
			$("#campainsForm").find("#subchannelId2").val("");
			var zTree = $.fn.zTree.getZTreeObj("subchannelTree2");
			zTree.checkAllNodes(false);//同时将全部节点设置为非选中状态
		});
		/*
		 * 通路树选择 end
		 */
		
	});

/*
 * 通路树选择 begin--节目
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
	$("#pgmForm").find("#subchannelName").val(name);
	$("#pgmForm").find("#subchannelId").val(id);
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
 * 通路树选择 begin--行销活动
 */
function showSubchannel2(){
	var Obj = $("#subchannelName2");
	var Offset = $("#subchannelName2").offset();
	$("#subchannelContent2").css({left:Offset.left + "px", top:Offset.top + Obj.outerHeight() + "px"}).slideDown("fast");
	$("body").bind("mousedown", onBodyDownSubchannel2);
}

function beforeClickSubchannel2(treeId, treeNode) {
	var zTree = $.fn.zTree.getZTreeObj("subchannelTree2");
	zTree.checkNode(treeNode, !treeNode.checked, null, true);
	return false;
}

function onCheckSubchannel2(e, treeId, treeNode) {
	var zTree = $.fn.zTree.getZTreeObj("subchannelTree2"),
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
	$("#campainsForm").find("#subchannelName2").val(name);
	$("#campainsForm").find("#subchannelId2").val(id);
}

function hideSubchannel2() {
	$("#subchannelContent2").fadeOut("fast");
	$("body").unbind("mousedown", onBodyDownSubchannel2);
}
function onBodyDownSubchannel2(event) {
	if (!(event.target.id == "subchannelName2" || event.target.id == "subchannelContent2" || $(event.target).parents("#subchannelContent2").length>0)) {
		hideSubchannel2();
	}
}
/*
 * 通路树选择 end
 */
