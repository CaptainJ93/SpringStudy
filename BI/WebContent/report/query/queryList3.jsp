<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
<%@ include file="/pub/include.jsp" %>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/zTreeStyle.css">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.ztree.core-3.5.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.ztree.excheck-3.5.js"></script>
<script src="js/queryList3.js" type="text/javascript"></script>
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
			   		<input id="registerStartTime" name="registerStartTime" class="easyui-datebox" style="width: 100px"/>-<input  id="registerEndTime" name="registerEndTime" class="easyui-datebox" style="width: 100px"/>
			   </li>
			   <li>
			   		<label>地址:</label>
			   		<input type="text" id="address" />
			   </li>
			</ul>
			<ul class="listBtn">
			   <li><input type="button" id="refreshBtn" value="搜索"/></li>
			   <li><input type="reset" id="resetBtn" value="重置"/></li>
			</ul>
			<div id="levelContent" class="menuContent" style="display:none; position: absolute;z-index:999">
				<ul id="levelTree" class="ztree" style="margin-top:0; width:160px;height: 200px;"></ul>
			</div>
		</div>
		</form>
	</div>
</body>
</html>