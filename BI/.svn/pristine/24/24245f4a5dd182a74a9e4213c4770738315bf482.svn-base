<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
<%@ include file="/pub/include.jsp" %>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/zTreeStyle.css">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.ztree.core-3.5.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.ztree.excheck-3.5.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/ajaxfileupload.js"></script>
<link rel="stylesheet" type="text/css" href="<%=path %>/css/TabPanel.css">
<script type="text/javascript" src="<%=path %>/js/Fader.js"></script>
<script type="text/javascript" src="<%=path %>/js/TabPanel.js"></script>
<script type="text/javascript" src="<%=path %>/js/Math.uuid.js"></script>
<script src="<%=request.getContextPath()%>/FusionChart/js/FusionCharts.js"></script>
<script src="js/channelOrderStatList.js" type="text/javascript"></script>
<style>
	ul.ztree {margin-top: 10px;border: 1px solid #617775;background: #f0f6e4;width:220px;height:360px;overflow-y:scroll;overflow-x:auto;}
	.datebox{
	   width:100px;
	}
	.left{width:50%;float:left;margin: 0px;border: 0px;}
	.right{width:50%;float:right;margin: 0px;border: 0px;}
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
		<form action="" id="channelOrderStatForm" method="post">
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
				<!-- 会员信息 -->
			   <li>
			   		<label>会员等级:</label>
			   		<input type="text" id="membershiplevelname" readonly="readonly" onclick="showLevel();"/>&nbsp;<a id="clearLevel" href="#">清空</a>
					<input type="hidden" id="membershiplevelid"/> 
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
			   <li>
			   		<label>会员类型:</label>
			   		<input type="text" id="customerTypeName" readonly="readonly" onclick="showCustomerType();"/>&nbsp;<a id="clearCustomerType" href="#">清空</a>
					<input type="hidden" id="customerTypeId"/> 
			   </li>
			   <!-- 商品信息 -->
			   <li>
			   		<label>商品分类:</label>
			   		<input type="text" id="productClassName" readonly="readonly" onclick="showProductClass();"/>&nbsp;<a id="clearProductClass" href="#">清空</a>
					<input type="hidden" id="productClassId"/>
			   </li>
			   <li>
			   		<label>商品名称:</label>
			   		<input type="text" id="productname" />
			   </li>
			   <li>
			   		<label>商品品号:</label>
			   		<input type="text" id="productid" onkeyup="this.value=this.value.replace(/[^\d!,]/g,'')"/>&nbsp;<span>","分割</span>
			   </li>
			   <li>
			   		<label>商品品号(Excel):</label>
			   		<input type="file" id="file" name="file" onchange="ajaxFileUpload()" style="width: 70px"/>
			   		<img src="<%=request.getContextPath()%>/css/img/loading.gif" id="productLoading" style="display: none;"/>
			   		<span id="localFileName"></span>&nbsp;
			   		<a id="clearFile" href="#">清空</a>&nbsp;<a href="../template/productId.xls">模板</a>
			   		<input type="hidden" id="fileName" />
			   </li>
			   <li>
			   		<label>供应商名称:</label>
			   		<input type="text" id="suppliername" />
			   </li>
			   <!-- 购买信息 -->
			   <li>
			   		<label>通路:</label>
			   		<input type="text" id="subchannelName" readonly="readonly" onclick="showSubchannel();"/>&nbsp;<a id="clearSubchannel" href="#">清空</a>
					<input type="hidden" id="subchannelId"/>
			   </li>
			   <li>
			   		<label>行销活动名:</label>
			   		<input type="text" id="campaignname" />
			   </li>
			   <li>
			   		<label>行销活动号:</label>
			   		<input type="text" id="campaignid" onkeyup="this.value=this.value.replace(/[^\d!,]/g,'')"/>&nbsp;<span>","分割</span>
			   </li>
			   <li>
			   		<label>行销活动时间:</label>
			   		<input id="actualStartTime" name="actualStartTime" class="easyui-datebox" style="width: 100px"/>-<input  id="actualEndTime" name="actualEndTime" class="easyui-datebox" style="width: 100px"/>
			   </li>
			   <li>
			   		<label>订单类型:</label>
			   		<input type="text" id="orderTypeName" readonly="readonly" onclick="showOrderType();"/>&nbsp;<a id="clearOrderType" href="#">清空</a>
					<input type="hidden" id="orderTypeId"/> 
			   </li>
			   <li>
			   		<label>订单状态:</label>
			   		<input type="text" id="orderStatusName" readonly="readonly" onclick="showOrderStatus();"/>&nbsp;<a id="clearOrderStatus" href="#">清空</a>
					<input type="hidden" id="orderStatusId"/> 
			   </li>
			   <li>
			   		<label>订购时间:</label>
			   		<input id="orderStartTime" name="orderStartTime" class="easyui-datetimebox" style="width: 100px"/>-<input  id="orderEndTime" name="orderEndTime" class="easyui-datetimebox" style="width: 100px"/>&nbsp;<span style="color: red;">*</span>
			   </li>
			   <li>
			   		<label>订单创建人名称:</label>
			   		<input type="text" id="createbyname"/>
			   </li>
			   <li>
			   		<label>订单创建人工号:</label>
			   		<input type="text" id="createbyid" onkeyup="this.value=this.value.replace(/[^\d!,]/g,'')"/>&nbsp;<span>","分割</span>
			   </li>
			   <li>
			   		<label>订单创建人工号(Excel):</label>
			   		<input type="file" id="fileCreatebyid" name="fileCreatebyid" onchange="ajaxFileUploadUserId()" style="width: 70px"/>
			   		<img src="<%=request.getContextPath()%>/css/img/loading.gif" id="CreatebyidLoading" style="display: none;"/>
			   		<span id="localFileUserName"></span>&nbsp;
			   		<a id="clearFileCreatebyid" href="#">清空</a>&nbsp;<a href="../template/userId.xls">模板</a>
			   		<input type="hidden" id="fileOrderCreateName" />
			   </li>
			   <li>
			   		<label>是否排除销退:</label>
			   		<select class="easyui-select" id="excludereturnflag" name="excludereturnflag" data="EXCLUDERETURNFLAG" allownull="false"></select>
			   </li>
			</ul>
			<ul class="listBtn">
			   <li><input type="button" id="refreshBtn" value="搜索"/></li>
			   <li><input type="button" id="resetBtn" value="重置"/></li>
			</ul>
			<div id="levelContent" class="menuContent" style="display:none; position: absolute;z-index: 999">
				<ul id="levelTree" class="ztree" style="margin-top:0; width:180px;height: 200px;"></ul>
			</div>
			<div id="customerTypeContent" class="menuContent" style="display:none; position: absolute;z-index: 999">
				<ul id="customerTypeTree" class="ztree" style="margin-top:0; width:180px;height: 200px;"></ul>
			</div>
			<div id="productClassContent" class="menuContent" style="display:none; position: absolute;z-index: 999">
				<ul id="productClassTree" class="ztree" style="margin-top:0; width:200px;height: 200px;"></ul>
			</div>
			<div id="subchannelContent" class="menuContent" style="display:none; position: absolute;z-index: 999">
				<ul id="subchannelTree" class="ztree" style="margin-top:0; width:180px;height: 200px;"></ul>
			</div>
			<div id="orderTypeContent" class="menuContent" style="display:none; position: absolute;z-index: 999">
				<ul id="orderTypeTree" class="ztree" style="margin-top:0; width:180px;height: 200px;"></ul>
			</div>
			<div id="orderStatusContent" class="menuContent" style="display:none; position: absolute;z-index: 999">
				<ul id="orderStatusTree" class="ztree" style="margin-top:0; width:180px;height: 200px;"></ul>
			</div>
		</div>
		</form>
		<div id="chartTab"></div>
	</div>
</body>
</html>