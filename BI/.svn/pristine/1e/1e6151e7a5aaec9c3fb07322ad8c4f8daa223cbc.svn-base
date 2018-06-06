<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
<%@ include file="/pub/include.jsp" %>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/zTreeStyle.css">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.ztree.core-3.5.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.ztree.excheck-3.5.js"></script>
<script src="js/queryList4.js" type="text/javascript"></script>
<style>
	ul.ztree {margin-top: 10px;border: 1px solid #617775;background: #f0f6e4;width:220px;height:360px;overflow-y:scroll;overflow-x:auto;}
	.datebox{
	   width:100px;
	}
</style>
</head>
<body style="overflow-x: hidden;">
	<div class="mainSilde mainBlock">
		<div class="searchTop">
		   <h2 class="showH">搜索</h2>
		</div>
		<form action="" id="queryForm" method="post">
		<div class="list searchList">
			<ul class="listShow">
				<li>
			   		<label>购买时间:</label>
			   		<input id="orderStartTime" name="orderStartTime" class="easyui-datebox" style="width: 100px"/>-<input  id="orderEndTime" name="orderEndTime" class="easyui-datebox" style="width: 100px"/>
			   </li>
			   <li>
			   		<label>商品品号:</label>
			   		<input type="text" id="productid" onkeyup="this.value=this.value.replace(/[^\d!,]/g,'')"/>&nbsp;<span>","分割</span>
			   </li>
			   <li>
			   		<label>建立人名称:</label>
			   		<input type="text" id="createbyname" onkeyup="this.value=this.value.replace(/[，]/g,',')"/>&nbsp;<span>","分割</span>
			   </li>
			   <li>
			   		<label>建立人工号:</label>
			   		<input type="text" id="createbyid" onkeyup="this.value=this.value.replace(/[^\d!,]/g,'')"/>&nbsp;<span>","分割</span>
			   </li>
			   <li>
			   		<label>处理人名称:</label>
			   		<input type="text" id="createbyname" onkeyup="this.value=this.value.replace(/[，]/g,',')"/>&nbsp;<span>","分割</span>
			   </li>
			   <li>
			   		<label>处理人工号:</label>
			   		<input type="text" id="createbyid" onkeyup="this.value=this.value.replace(/[^\d!,]/g,'')"/>&nbsp;<span>","分割</span>
			   </li>
			   <li>
			   		<label>销退主因:</label>
			   		<input type="text" id="returnReasonName" readonly="readonly" onclick="showReturnReason();"/>&nbsp;<a id="clearReturnReason" href="#">清空</a>
					<input type="hidden" id="returnReasonId"/> 
			   </li>
			   <li>
			   		<label>客诉主因:</label>
			   		<input type="text" id="complaintCategoryName" readonly="readonly" onclick="showComplaintCategory();"/>&nbsp;<a id="clearComplaintCategory" href="#">清空</a>
					<input type="hidden" id="complaintCategoryId"/> 
			   </li>
			   <li>
			   		<label>供应商名称:</label>
			   		<input type="text" id="suppliername" />
			   </li>
			   <li>
			   		<label>会员等级:</label>
			   		<input type="text" id="membershiplevelname" readonly="readonly" onclick="showLevel();"/>&nbsp;<a id="clearLevel" href="#">清空</a>
					<input type="hidden" id="membershiplevelid"/> 
			   </li>

			</ul>
			<ul class="listBtn">
			   <li><input type="button" id="refreshBtn" value="搜索"/></li>
			   <li><input type="reset" id="resetBtn" value="重置"/></li>
			</ul>
			<div id="levelContent" class="menuContent" style="display:none; position: absolute;z-index:999">
				<ul id="levelTree" class="ztree" style="margin-top:0; width:160px;height: 200px;"></ul>
			</div>
			<div id="returnReasonContent" class="menuContent" style="display:none; position: absolute;z-index:999">
				<ul id="returnReasonTree" class="ztree" style="margin-top:0; width:240px;height: 200px;"></ul>
			</div>
			<div id="complaintCategoryContent" class="menuContent" style="display:none; position: absolute;z-index:999">
				<ul id="complaintCategoryTree" class="ztree" style="margin-top:0; width:260px;height: 200px;"></ul>
			</div>
		</div>
		</form>
	</div>
</body>
</html>