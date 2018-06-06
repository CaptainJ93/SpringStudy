<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
<%@ include file="/pub/include.jsp" %>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/zTreeStyle.css">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.ztree.core-3.5.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.ztree.excheck-3.5.js"></script>
<script src="<%=request.getContextPath()%>/FusionChart/js/FusionCharts.js"></script>
<script src="js/summary.js"></script>
<style>
	ul.ztree {margin-top: 10px;border: 1px solid #617775;background: #f0f6e4;width:220px;height:360px;overflow-y:scroll;overflow-x:auto;}
	.datebox{
	   width:100px;
	}
</style>
<script type="text/javascript">
document.onkeydown = function(e)
	{
    	var e = window.event?window.event:e; 
    	if(e.keyCode == 13){
     		var btn=document.getElementById("refreshBtn");
     		btn.click();
     		}
	}
</script>
</head>
<body style="overflow-x: hidden;">
<div class="mainSilde mainBlock">
	<form action="" id="summaryForm" method="post">
	<div class="list searchList">
		<ul class="listShow">
	   		<li>
			   		<label>时间:</label>
			   		<input id="orderStartTime" name="orderStartTime" class="easyui-datebox" style="width: 100px"/>-<input  id="orderEndTime" name="orderEndTime" class="easyui-datebox" style="width: 100px"/>&nbsp;<span style="color: red;">*</span>
			</li>
			<li>
			   		<label>通路:</label>
			   		<input type="text" id="subchannelName" readonly="readonly" onclick="showSubchannel();"/>&nbsp;<a id="clearSubchannel" href="javascript:void(0)">清空</a>
					<input type="hidden" id="subchannelId"/>
			</li>
	   		<li>
			   		<label>维度:</label>
			   		<select class="easyui-select" id="statCycle" name="statCycle" data="STAT_CYCLE_TIME" allownull="false" nullname="全部" nullvalue=""></select>&nbsp;<span style="color: red;">*</span>
			</li>
	   		<li>
	   			<input type="button" id="refreshBtn" value="查询"/>
	   		</li>
		</ul>
		<div id="subchannelContent" class="menuContent" style="display:none; position: absolute;z-index: 999">
				<ul id="subchannelTree" class="ztree" style="margin-top:0; width:180px;height: 200px;"></ul>
			</div>
	</div>
	</form>
	<div id="chart1div" align="center">正在加载数据，请稍等...</div>
	<table id="timeOrderTable"></table>
</div>
<script language="JavaScript">　　　
	var startTime = new Date();
	startTime.setDate(startTime.getDate()-31);
    var year = startTime.getFullYear(); 
    var month = startTime.getMonth()+1; 
    var day = startTime.getDate(); 
    var startTime1 = year+"-"+month+"-"+day;
    $("#orderStartTime").val(year+"-"+month+"-"+day);
    
    var endTime = new Date();
	endTime.setDate(endTime.getDate());
   	var year = endTime.getFullYear(); 
    var month = endTime.getMonth()+1; 
    var day = endTime.getDate(); 
    $("#orderEndTime").val(year+"-"+month+"-"+day);
  	var endTime1 = year+"-"+month+"-"+day;
  	
  	//将查询按钮
	$("#refreshBtn").attr("disabled", true);
	$.ajax({
			url:'summaryStat!timeOrderXml.action',
			type:'post',
			data:{"paramMap.orderStartTime":startTime1,"paramMap.orderEndTime":endTime1,"paramMap.statCycle":3},
			success:function(data){
				var chart1 = new FusionCharts("<%=request.getContextPath()%>/FusionChart/ScrollCombiDY2D.swf", "chart1Id", "1000", "450");　　　　 
				chart1.setDataXML(data);
				//chart1.setXMLUrl("data.xml");　
			　　 chart1.render("chart1div");
  				$("#refreshBtn").attr("disabled", false);
  				
  				jQuery("#timeOrderTable").jqGrid("setGridParam", {url:"summaryStat!timeOrderList.action"}); 
				$("#timeOrderTable").hlGridRefresh();
			}
	});
</script>　
</body>
</html>