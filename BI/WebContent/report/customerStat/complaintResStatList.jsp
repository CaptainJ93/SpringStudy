<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
<%@ include file="/pub/include.jsp" %>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/zTreeStyle.css">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.ztree.core-3.5.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.ztree.excheck-3.5.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/ajaxfileupload.js"></script>
<script src="js/complaintResStatList.js" type="text/javascript"></script>
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
		<form action="" id="complaintResStatForm" method="post">
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
			   		<label>会员类型:</label>
			   		<input type="text" id="customerTypeName" readonly="readonly" onclick="showCustomerType();"/>&nbsp;<a id="clearCustomerType" href="#">清空</a>
					<input type="hidden" id="customerTypeId"/> 
			   </li>
			   <li>
			   		<label>供应商名称:</label>
			   		<input type="text" id="suppliername" />
			   </li>
			    
			   <!-- 商品信息 -->
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
			   <!-- 购买信息 -->
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
			   		<label>客诉处理人名称:</label>
			   		<input type="text" id="handlebyname"/>
			   </li>
			   <li>
			   		<label>客诉处理人工号:</label>
			   		<input type="text" id="handlebyid" onkeyup="this.value=this.value.replace(/[^\d!,]/g,'')"/>&nbsp;<span>","分割</span>
			   </li>
			   <li>
			   		<label>客诉处理人工号(Excel):</label>
			   		<input type="file" id="fileHandlebyid" name="fileHandlebyid" onchange="ajaxFileUploadUserId2()" style="width: 70px"/>
			   		<img src="<%=request.getContextPath()%>/css/img/loading.gif" id="HandlebyidLoading" style="display: none;"/>
			   		<span id="localFileUserName2"></span>&nbsp;
			   		<a id="clearFileHandlebyid" href="#">清空</a>&nbsp;<a href="../template/userId.xls">模板</a>
			   		<input type="hidden" id="fileOrderHandleName" />
			   </li>
			   <li>
			   		<label>订购时间:</label>
			   		<input id="orderStartTime" name="orderStartTime" class="easyui-datetimebox" style="width: 95px"/>-<input  id="orderEndTime" name="orderEndTime" class="easyui-datetimebox" style="width: 95px"/>&nbsp;<span style="color: red;">*</span>
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
			<div id="returnReasonContent" class="menuContent" style="display:none; position: absolute;z-index:999">
				<ul id="returnReasonTree" class="ztree" style="margin-top:0; width:240px;height: 200px;"></ul>
			</div>
			<div id="complaintCategoryContent" class="menuContent" style="display:none; position: absolute;z-index:999">
				<ul id="complaintCategoryTree" class="ztree" style="margin-top:0; width:260px;height: 200px;"></ul>
			</div>
		</div>
		</form>
		<table id="complaintResStatTable"></table>
	</div>
</body>
</html>