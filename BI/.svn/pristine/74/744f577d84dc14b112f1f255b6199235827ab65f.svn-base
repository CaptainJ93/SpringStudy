<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
<%@ include file="/pub/include.jsp" %>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/zTreeStyle.css">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.ztree.core-3.5.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.ztree.excheck-3.5.js"></script>
<link rel="stylesheet" type="text/css" href="<%=path %>/css/TabPanel.css">
<script type="text/javascript" src="<%=path %>/js/Fader.js"></script>
<script type="text/javascript" src="<%=path %>/js/TabPanel.js"></script>
<script type="text/javascript" src="<%=path %>/js/Math.uuid.js"></script>
<script src="<%=request.getContextPath()%>/FusionChart/js/FusionCharts.js"></script>
<script src="js/custDevelopStatList.js" type="text/javascript"></script>
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
		<div class="searchTop">
		   <h2 class="showH">搜索</h2>
		</div>
		<form action="" id="custDevelopStatForm" method="post">
		<%
			String menuName = "";
			if(request.getParameter("menuName") != null && !request.getParameter("menuName").equals("")){
				menuName = new String(request.getParameter("menuName").getBytes("ISO8859-1"),"UTF-8");
			}
		%>
		<input type="hidden" name="menuId" id="menuId" value="<%=request.getParameter("menuId") %>"/>
		<input type="hidden" name="menuName" id="menuName" value="<%=menuName %>"/>
		<div class="list searchList">
			<ul class="listShow">
			   <li>
	   				<label>订购日期</label>
	   				<input type="text" id="orderStartTime" name="orderStartTime" class="easyui-datebox" style="width: 95px"/>-<input type="text" id="orderEndTime" name="orderEndTime" class="easyui-datebox" style="width: 95px"/>&nbsp;<span style="color: red;">*</span>
	   		   </li>
	   		   <li>
		   			<label>维度:</label>
		   			<select class="easyui-select" id="statCycle" name="statCycle" data="STAT_CYCLE" allownull="false" nullname="全部" nullvalue=""></select>&nbsp;<span style="color: red;">*</span>
			   </li>
			   <li>
			   		<label>活跃周期:</label>
			   		<input type="text" id="activeCycle" value="3" title="活跃周期：X月内有消费" onkeyup="this.value=this.value.replace(/[^\d]/g,'')" onafterpaste="this.value=this.value.replace(/[^\d]/g,'')"/>&nbsp;月&nbsp;<span style="color: red;">*</span>
			   </li>
			   <li>
			   		<label>流失周期:</label>
			   		<input type="text" id="lossCycle" value="12" title="流失周期：X月内无消费" onkeyup="this.value=this.value.replace(/[^\d]/g,'')" onafterpaste="this.value=this.value.replace(/[^\d]/g,'')"/>&nbsp;月&nbsp;<span style="color: red;">*</span>
			   </li>
				<!-- 会员信息 -->
			   <li>
			   		<label>会员等级:</label>
			   		<input type="text" id="membershiplevelname" readonly="readonly" onclick="showLevel();"/>&nbsp;<a id="clearLevel" href="#">清空</a>
					<input type="hidden" id="membershiplevelid"/> 
			   </li>
			   <li>
			   		<label>会员类型:</label>
			   		<input type="text" id="customerTypeName" readonly="readonly" onclick="showCustomerType();"/>&nbsp;<a id="clearCustomerType" href="#">清空</a>
					<input type="hidden" id="customerTypeId"/> 
			   </li>
			   <li>
			   		<label>新会员定义:</label>
			   		<input type="text" id="newCustomerDays" style="width: 64px;float: none" onkeyup="this.value=this.value.replace(/[^\d]/g,'')" onafterpaste="this.value=this.value.replace(/[^\d]/g,'')" value="3"/>天内注册并消费&nbsp;<span style="color: red;">*</span>
			   </li>
			   <li>
			   		<label>年龄:</label>
			   		<input type="text" id="ageStart" style="width: 64px;float: none" onkeyup="this.value=this.value.replace(/[^\d]/g,'')" onafterpaste="this.value=this.value.replace(/[^\d]/g,'')" maxlength="3"/>
			   		-
			   		<input type="text" id="ageEnd" style="width: 64px;float: none" onkeyup="this.value=this.value.replace(/[^\d]/g,'')" onafterpaste="this.value=this.value.replace(/[^\d]/g,'')" maxlength="3"/>
			   </li>
			   <li>
			   		<label>性别:</label>
			   		<select class="easyui-select" id="sex" name="sex" data="SEX" allownull="true" nullname="全部" nullvalue=""></select>
			   </li>
			   <li>
			   		<label>注册时间:</label>
			   		<input id="registerStartTime" name="registerStartTime" class="easyui-datetimebox" style="width: 100px"/>-<input  id="registerEndTime" name="registerEndTime" class="easyui-datetimebox" style="width: 100px"/>
			   </li>
			   <li>
			   		<label>地址:</label>
			   		<input type="text" id="address" />
			   </li>
			</ul>
			<ul class="listBtn">
			   <li><input type="button" id="refreshBtn" value="搜索"/></li>
			   <li><input type="button" id="resetBtn" value="重置"/></li>
			</ul>
			<div id="levelContent" class="menuContent" style="display:none; position: absolute;z-index:999">
				<ul id="levelTree" class="ztree" style="margin-top:0; width:180px;height: 200px;"></ul>
			</div>
			<div id="customerTypeContent" class="menuContent" style="display:none; position: absolute;z-index: 999">
				<ul id="customerTypeTree" class="ztree" style="margin-top:0; width:180px;height: 200px;"></ul>
			</div>
		</div>
		</form>
		<table id="custDevelopStatTable"></table>
		<!-- <div id="chartTab"></div> -->
	</div>
</body>
</html>