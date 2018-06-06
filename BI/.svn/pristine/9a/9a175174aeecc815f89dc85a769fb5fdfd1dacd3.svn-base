<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
<!-- 使用了 /themes/base、themes/ui-lightness、ui下的文件 <script src="js/jquery-1.10.2.js"></script>-->
<link rel="stylesheet" href="<%=request.getContextPath()%>/themes/base/jquery.ui.all.css">
<%@ include file="/pub/include.jsp" %>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/zTreeStyle.css">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.ztree.core-3.5.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.ztree.excheck-3.5.js"></script>
<script src="<%=request.getContextPath()%>/FusionChart/js/FusionCharts.js"></script>
<script src="js/daySaleSummary.js"></script>
<script src="js/portal.js"></script>
<script src="<%=request.getContextPath()%>/ui/jquery.ui.core.js"></script>
<script src="<%=request.getContextPath()%>/ui/jquery.ui.widget.js"></script>
<script src="<%=request.getContextPath()%>/ui/jquery.ui.mouse.js"></script>
<script src="<%=request.getContextPath()%>/ui/jquery.ui.sortable.js"></script>
<link rel="stylesheet" href="css/portal.css">

<style>
	ul.ztree {margin-top: 10px;border: 1px solid #617775;background: #f0f6e4;width:220px;height:360px;overflow-y:scroll;overflow-x:auto;}
	.datebox{
	   width:100px;
	}
</style>
<style type="text/css">
	.leftDiv{width:50%;float:left;margin: 0px;border: 0px;}
	.rightDiv{width:50%;float:right;margin: 0px;border: 0px;}
</style>
</head>
<body>
<div class="column2">

	<div class="portlet">
		<div class="portlet-header">各通路当天销售情况统计</div>
		<div class="portlet-content">
			<div class="mainSilde mainBlock">
				<form action="" id="productinfoTodayForm" method="post">
				<div class="list searchList">
					<ul class="listShow">
				   		<li>
				   			<label>品号</label>
				   			<input type="text" id="productid" onkeyup="this.value=this.value.replace(/[^\d]/g,'')"/>
				   		</li>
				   		<li>
					   		<label>品名:</label>
					   		<input type="text" id="productname" />
						</li>
				   		<li>
				   			<input type="button" id="refreshProductBtn" value="查询"/>
				   		</li>
					</ul>
				</div>
				</form>
				<div style="width:100%;height: auto"> 
						<div class="leftDiv"> 
							<div id="chart1div" align="center">正在加载数据，请稍等...</div>
						</div> 
						<div class="rightDiv">
							<div id="chart2div" align="center">正在加载数据，请稍等...</div>
						</div>
				</div>				
			</div>
		</div>
	</div>
	<div class="portlet">
		<div class="portlet-header">节目业绩查询</div>
		<div class="portlet-content">
			<div class="mainSilde mainBlock">
				<!-- 节目业绩 -->
				<form action="" id="pgmForm" method="post">
					<div class="list searchList">
						<ul class="listShow">
							<li></li>
						   <li>
						   		<label>通路:</label>
						   		<input type="text" id="subchannelName" readonly="readonly" onclick="showSubchannel();"/>&nbsp;<a id="clearPgmSubchannel" href="javascript:void(0)">清空</a>
								<input type="hidden" id="subchannelId"/>
						   </li>
						   <li><input type="button" id="refreshPgmBtn" value="查询"/></li>
						</ul>
						<div id="subchannelContent" class="menuContent" style="display:none; position: absolute;z-index: 999">
							<ul id="subchannelTree" class="ztree" style="margin-top:0; width:180px;height: 200px;"></ul>
						</div>
					</div>
				</form>
				<table id="pgmTable"></table>
			</div>
		</div>
	</div>
	<div class="portlet">
		<div class="portlet-header">行销活动业绩查询</div>
		<div class="portlet-content">
			<div class="mainSilde mainBlock">
				<!-- 行销活动业绩 -->
				<form action="" id="campainsForm" method="post">
					<div class="list searchList">
						<ul class="listShow">
							<li></li>
						   <li>
						   		<label>通路:</label>
						   		<input type="text" id="subchannelName2" readonly="readonly" onclick="showSubchannel2();"/>&nbsp;<a id="clearCampainsSubchannel" href="javascript:void(0)">清空</a>
								<input type="hidden" id="subchannelId2"/>
						   </li>
						   <li><input type="button" id="refreshCampainsBtn" value="查询"/></li>
						</ul>
						<div id="subchannelContent2" class="menuContent" style="display:none; position: absolute;z-index: 999">
							<ul id="subchannelTree2" class="ztree" style="margin-top:0; width:180px;height: 200px;"></ul>
						</div>
					</div>
				</form>
				<table id="campainsTable"></table>
			</div>
		</div>
	</div>
</div>
<script language="JavaScript">
  	//将查询按钮
	$("#productinfoTodayForm").find("#refreshProductBtn").attr("disabled", true);
	jQuery.ajax({
		url:'summaryStat!productinfoTodayList.action',
			type:'post',
			context:this,
			dataType: "json",
			data:{"paramMap.productid":$("#productid").val(),"paramMap.productname":$("#productname").val()},
			success:function(data){
				var chart1 = new FusionCharts("<%=request.getContextPath()%>/FusionChart/ScrollCombiDY2D.swf", "chart1Id", "600", "300");　　　　 
				chart1.setDataXML(data["chartXML"]["sumamount"]);
			　　 chart1.render("chart1div");
			
				var chart2 = new FusionCharts("<%=request.getContextPath()%>/FusionChart/ScrollCombiDY2D.swf", "chart2Id", "600", "300");　　　　 
				chart2.setDataXML(data["chartXML"]["ordercc"]);
			　　 chart2.render("chart2div");
			
				$("#productinfoTodayForm").find("#refreshProductBtn").attr("disabled", false);
			}
	});
	
</script>　

</body>
</html>