$(function() {
	$.getCaches("../cache!getCache.action","STAT_CYCLE_TIME",function(cacheKeys){
		$("#statCycle").val(3);
		//$("#statCycle option[value='4']").remove();
		
		var options={
				url:"query!initList.action",
				defaultSearch:false,
				colModel:[
				    {label:"时间",name:"orderdate"},
				    {label:"有效订单金额",name:"orderamout"},
				    {label:"毛利额",name:"maoli"},
				    {label:"毛利率",name:"maoliv"},
				    {label:"业绩同比增长额",name:"amountbianhua"},
				    {label:"业绩同比增长率",name:"amountbianhualv1"},
				    {label:"毛利同比增长额",name:"maolibianhua"},
				    {label:"毛利同比增长率",name:"amountbianhualv1"}
				],
				multiselect:false,
				loadonce: false,
				caption:"查询列表",
				searchform: "#channelAreaStatForm",
				sortname:"orderdate",
				sortorder:"desc",
				rowNum:10,
				allowOper : {add:false,del:false,update:false,exportexcel:false}
			};
		
		$("#timeOrderTable").hlGrid(options);
		
	});

		$("#refreshBtn").click(function(){
			var startTime = $("#orderStartTime").datebox("getValue");
			var endTime = $("#orderEndTime").datebox("getValue");
			if(startTime == null || startTime == '' || endTime == null || endTime == ''){
				$.messager.alert("操作提示", "日期不能为空!");
				return false;
			}
			if(compareDate($("#orderStartTime").datebox("getValue"),$("#orderEndTime").datebox("getValue"))){
				$.messager.alert("操作提示", "结束时间必须晚于开始时间!");
				return false;
			}
			if($("#statCycle").val()==3 || $("#statCycle").val()==4){
				var days = DateDiff($("#orderStartTime").datebox("getValue"),$("#orderEndTime").datebox("getValue"));
				if(days > 90){
					$.messager.alert("操作提示", "查询日期请保持在90天之内!");
					return false;
				}
			}else if($("#statCycle").val()==2){
				var months = MonthDiff($("#orderStartTime").datebox("getValue"),$("#orderEndTime").datebox("getValue"));
				if(months+1 > 120){
					$.messager.alert("操作提示", "您查询的时间跨度太大了，请重新选择!");
					return false;
				}
			}else{
				var years = YearDiff($("#orderStartTime").datebox("getValue"),$("#orderEndTime").datebox("getValue"));
				if(years > 100){
					$.messager.alert("操作提示", "您查询的时间跨度太大了，请重新选择!");
					return false;
				}
			}
			//将查询按钮
			$("#refreshBtn").attr("disabled", true);
			$.ajax({
				url:'summaryStat!timeOrderXml.action',
					type:'post',
					data:{"paramMap.orderStartTime":$("#orderStartTime").datebox("getValue"),"paramMap.orderEndTime":$("#orderEndTime").datebox("getValue"),"paramMap.statCycle":$("#statCycle").val(),"paramMap.subchannelId":$("#subchannelId").val()},
					success:function(data){
						var chartReference = FusionCharts("chart1Id");
						if(data == null || data == "")
							chartReference.setDataXML("");
						else
							chartReference.setDataXML(data);
		  				$("#refreshBtn").attr("disabled", false);
		  				
		  				jQuery("#timeOrderTable").jqGrid("setGridParam", {url:"summaryStat!timeOrderList.action"}); 
						$("#timeOrderTable").hlGridRefresh();
					}
			});	
		});	
		
		/*
		 * 通路树选择 begin--节目
		 */
		var subchannel = {
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
					beforeClick: beforeClickSubchannel,
					onCheck: onCheckSubchannel,
				}
			};
		$.fn.zTree.init($("#subchannelTree"), subchannel, null);
		
		$("#clearSubchannel").click(function() {
			$("#summaryForm").find("#subchannelName").val("");
			$("#summaryForm").find("#subchannelId").val("");
			var zTree = $.fn.zTree.getZTreeObj("subchannelTree");
			zTree.checkAllNodes(false);//同时将全部节点设置为非选中状态
		});
		/*
		 * 通路树选择 end
		 */
		
	});

/*
 * 通路树选择 
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
	$("#summaryForm").find("#subchannelName").val(name);
	$("#summaryForm").find("#subchannelId").val(id);
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

//计算两个日期的间隔天数
function DateDiff(sDate1, sDate2){ //sDate1和sDate2是2002-12-18格式
	var aDate, oDate1, oDate2, iDays;
	aDate = sDate1.split("-");
	oDate1 = new Date(aDate[0],aDate[1],aDate[2]," "," "," ");
	aDate = sDate2.split("-");
	oDate2 = new Date(aDate[0],aDate[1],aDate[2]," "," "," "); 
	iDays = parseInt(Math.abs(oDate1 - oDate2) / 1000 / 60 / 60 /24); //把相差的毫秒数转换为天数  
	return iDays;
}

//计算两个日期的间隔月数
function MonthDiff(sDate1, sDate2){ //sDate1和sDate2是2002-12-18格式
	var date1 = sDate1.split('-');
	date1 = parseInt(date1[0]) * 12 + parseInt(date1[1]);
	var date2 = sDate2.split('-');
	date2 = parseInt(date2[0]) * 12 + parseInt(date2[1]);
	var m = Math.abs(date1 - date2);
	return m;
}

//计算两个日期的间隔月年数
function YearDiff(sDate1, sDate2){ //sDate1和sDate2是2002-12-18格式
	var date1 = sDate1.split('-');
	date1 = parseInt(date1[0]);
	var date2 = sDate2.split('-');
	date2 = parseInt(date2[0]);
	var m = Math.abs(date1 - date2);
	return m;
}
