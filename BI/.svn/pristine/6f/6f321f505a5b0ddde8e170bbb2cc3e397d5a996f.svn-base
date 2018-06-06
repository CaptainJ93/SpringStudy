<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
<%@ include file="/pub/include.jsp" %>
<script src="js/privilegeList.js" type="text/javascript"></script>
</head>
<body style="overflow-x: hidden;">
	<div class="mainSilde mainBlock">
		<div class="searchTop">
		   <h2 class="showH">搜索</h2>
		</div>
		<form action="" id="privilegeForm" method="post">
		<div class="list searchList">
			<ul class="listShow">
			   <li><label>模块名称:</label><input type="text" id="moduleName"/></li>
			   <li><label>模块编码:</label><input type="text" id="moduleCode"/></li>
			   <li><label>权限名称:</label><input type="text" id="privilegeName"/></li>
			   <li><label>权限编码:</label><input type="text" id="privilegeCode"/></li>
			   <li><label>权限类型:</label><select class="easyui-select" id="privilegeType" name="privilegeType" data="PRIVILEGE_TYPE" allownull="true" nullname="全部" nullvalue=""></select></li>
			</ul>
			<ul class="listBtn">
			   <li><input type="button" id="refreshBtn" value="搜索"/></li>
			   <li><input type="reset" id="resetBtn" value="重置"/></li>
			   <li><input type="button" id="addBtn" value="添加"/></li>
			   <li><input type="button" id="editBtn" value="修改"/></li>
			   <li><input type="button" id="delBtn" value="删除"/></li>
			</ul>
		</div>
		</form>
		<table id="privilegeTable"></table>
	</div>
	<div style="display: none">
		<div id="editDiv">
			<form action="" id="privilegeEditForm" method="post">
			<input type="hidden" id="oper" name="oper"/>
			<input type="hidden" id="privilegeId" name="privilege.privilegeId"/>
			<div class="list">
				<ul class="listShow">
						<li><label>模块名称:</label><input type="text" id="moduleName" name="privilege.moduleName" maxlength="64"/><span style="color: red;">*</span></li>
						<li><label>模块编码:</label><input type="text" id="moduleCode" name="privilege.moduleCode" maxlength="64"/><span style="color: red;">*</span></li>
						<li><label>权限名称:</label><input type="text" id="privilegeName" name="privilege.privilegeName" maxlength="64"/><span style="color: red;">*</span></li>
						<li><label>权限编码:</label><input type="text" id="privilegeCode" name="privilege.privilegeCode" maxlength="64"/><span style="color: red;">*</span></li>
						<li><label>权限值:</label><input type="text" id="privilegeValue" name="privilege.privilegeValue" maxlength="64"/><span style="color: red;">*</span></li>
						<li>
				    	  <label>权限类型:</label>
				    	  <select class="easyui-select" id="privilegeType" name="privilege.privilegeType" data="PRIVILEGE_TYPE" allownull="false"></select><span style="color: red;">*</span>
				    	</li>
				    	<li><label>描述:</label><textarea type="text" cols=20 rows=2 id="privilegeDesc" name="privilege.privilegeDesc" style="width: 250px; height: 50px;"></textarea></li>
				</ul>
				<ul class="listBtn">
				   <li><input type="button" id="saveBtn" value="确定"/></li>
				   <li><input type="reset" value="重置"/></li>
				   <li><input type="button" id="closeBtn" value="关闭"/></li>
				</ul>
			</div>
			</form>
		</div>
	</div>
	
</body>
</html>