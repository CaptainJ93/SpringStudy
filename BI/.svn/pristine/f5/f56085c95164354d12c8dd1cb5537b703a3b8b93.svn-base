<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
<%@ include file="/pub/include.jsp" %>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/zTreeStyle.css">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.ztree.core-3.5.js"></script>
<script src="js/departmentList.js" type="text/javascript"></script>
<style>
	ul.ztree {margin-top: 10px;border: 1px solid #617775;background: #f0f6e4;width:220px;height:360px;overflow-y:scroll;overflow-x:auto;}
</style>
</head>
<body style="overflow-x: hidden;">
	<div class="mainSilde mainBlock">
		<div class="searchTop">
		   <h2 class="showH">搜索</h2>
		</div>
		<form action="" id="departmentForm" method="post">
		<div class="list searchList">
			<ul class="listShow">
			   <li><label>部门名称:</label><input type="text" id="departmentName"/></li>
			   <li><label>所属部门:</label>
					<input type="text" id="departmentPName" readonly="readonly"/>&nbsp;<a id="showDeptLBtn" href="#">选择</a>&nbsp;<a id="clearLBtn" href="#">清空</a>
					<input type="hidden" id="departmentPid"/>
				</li>
			</ul>
			<ul class="listBtn">
			   <li><input type="button" id="refreshBtn" value="搜索"/></li>
			   <li><input type="reset" id="resetBtn" value="重置"/></li>
			   <li><input type="button" id="addBtn" value="添加"/></li>
			   <li><input type="button" id="editBtn" value="修改"/></li>
			   <li><input type="button" id="delBtn" value="删除"/></li>
			</ul>
			<div id="deptContentL" class="menuContent" style="display:none; position: absolute; z-index:9999">
				<ul id="deptTreeL" class="ztree" style="margin-top:0; width:160px;height: 200px;"></ul>
			</div>
		</div>
		</form>
		<table id="departmentTable"></table>
	</div>
	<div style="display: none">
		<div id="editDiv">
			<form action="" id="departmentEditForm" method="post">
			<input type="hidden" id="oper" name="oper"/>
			<input type="hidden" id="departmentId" name="department.departmentId"/>
			<div class="list">
				<ul class="listShow">
						<li><label>部门名称:</label><input type="text" id="departmentName" name="department.departmentName" maxlength="80"/><span style="color: red;">*</span></li>
						<li><label>所属部门:</label>
							<input type="text" id="departmentPName" name="department.departmentPName"/>&nbsp;<a id="showDeptBtn" href="#">选择</a>&nbsp;<a id="clearBtn" href="#">清空</a>
							<input type="hidden" id="departmentPid" name="department.departmentPid" />
						</li>
				</ul>
				<ul class="listBtn">
				   <li><input type="button" id="saveBtn" value="确定"/></li>
				   <li><input type="reset" value="重置"/></li>
				   <li><input type="button" id="closeBtn" value="关闭"/></li>
				</ul>
			</div>
			</form>
			<div id="deptContent" class="menuContent" style="display:none; position: absolute;">
				<ul id="deptTree" class="ztree" style="margin-top:0; width:160px;height: 200px;"></ul>
			</div>
		</div>
	</div>
	
</body>
</html>