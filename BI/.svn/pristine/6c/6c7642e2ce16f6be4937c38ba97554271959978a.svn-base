<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
<%@ include file="/pub/include.jsp" %>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/zTreeStyle.css">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.ztree.core-3.5.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.ztree.excheck-3.5.min.js"></script>
<script src="js/roleList.js" type="text/javascript"></script>
</head>
<body style="overflow-x: hidden;">
	<div class="mainSilde mainBlock">
		<div class="searchTop">
		   <h2 class="showH">搜索</h2>
		</div>
		<form action="" id="roleForm" method="post">
		<div class="list searchList">
			<ul class="listShow">
			   <li><label>角色编号:</label><input type="text" id="roleid"/></li>
			   <li><label>角色名称:</label><input type="text" id="rolename"/></li>
			</ul>
			<ul class="listBtn">
			   <li><input type="button" id="refreshBtn" value="搜索"/></li>
			   <li><input type="reset" id="resetBtn" value="重置"/></li>
			   <li><input type="button" id="addBtn" value="添加"/></li>
			   <li><input type="button" id="editBtn" value="修改"/></li>
			   <li><input type="button" id="delBtn" value="删除"/></li>
			   <li><input type="button" id="showMenuTree" value="角色菜单绑定"/></li>
			   <li><input type="button" id="showPrivilege" value="角色权限绑定"/></li>
			</ul>
		</div>
		</form>
		<table id="roleTable"></table>
	</div>
	<div style="display: none">
		<div id="editDiv" >
			<form action="" id="roleEditForm" method="post">
				<input type="hidden" id="oper" name="oper"/>
				<input type="hidden" id="roleid" name="role.roleid"/>
				<div class="list">
					<ul class="listShow">
							<li><label>角色名称:</label><input type="text" id="rolename" name="role.rolename" maxlength="100"/><span style="color: red;">*</span></li>
							<li><label>角色描述:</label><input type="text" id="roledesc" name="role.roledesc" maxlength="200"/></li>
					</ul>
					<ul class="listBtn">
					   <li><input type="button" id="saveBtn" value="确定"/></li>
					   <li><input type="reset" value="重置"/></li>
					   <li><input type="button" id="closeBtn" value="关闭"/></li>
					</ul>
				</div>
			</form>
		</div>
		
		<!-- 角色绑定菜单 -->
		<div id="menuDiv">
			<form action="" id="menuTreeForm" method="post">
				<b>角色管理－菜单导航树：</b>
				<input type="hidden" id="roleid" name="roleid"/>
				<ul id="menuTree" class="ztree"></ul>
				<input type="button" id="saveMenuBtn" value="保存">
				<input type="button" id="closeMenuDivBtn" value="关闭"/>
			</form>
		</div>
		
		<!-- 角色绑定权限 -->
		<div id="privilegeDiv" class="mainSilde mainBlock">
			<div class="searchTop">
			   <h2 class="showH">搜索</h2>
			</div>
			<form action="" id="privilegeForm" method="post">
			<input type="hidden" id="roleid" name="roleid"/>
			<div class="list searchList">
				<ul class="listShow">
				   <li><label>模块名称:</label><input type="text" id="moduleName"/></li>
				   <li><label>模块编码:</label><input type="text" id="moduleCode"/></li>
				   <li><label>权限名称:</label><input type="text" id="privilegeName"/></li>
				   <li><label>权限编码:</label><input type="text" id="privilegeCode"/></li>
				   <li><label>权限类型:</label><select id="privilegeType" name="privilegeType"></select></li>
				</ul>
				<ul class="listBtn">
				   <li><input type="button" id="refreshPrivilegeBtn" value="搜索"/></li>
				   <li><input type="reset" id="resetPrivilegeBtn" value="重置"/></li>
				   <li><input type="button" id="addPrivilegeBtn" value="添加"/></li>
				   <li><input type="button" id="delPrivilegeBtn" value="删除"/></li>
				   <li><input type="button" id="closePrivilegeDivBtn" value="关闭"/></li>
				</ul>
			</div>
			</form>
			<table id="privilegeTable"></table>
		</div>
		
		
		<div id="privilegeSerachDiv" class="mainSilde mainBlock">
			<div class="searchTop">
			   <h2 class="showH">搜索</h2>
			</div>
			<form action="" id="privilegeSerachForm" method="post">
			<input type="hidden" id="noroleid" name="noroleid" value=""/>
			<div class="list searchList">
				<ul class="listShow">
				   <li><label>模块名称:</label><input type="text" id="moduleName"/></li>
				   <li><label>模块编码:</label><input type="text" id="moduleCode"/></li>
				   <li><label>权限名称:</label><input type="text" id="privilegeName"/></li>
				   <li><label>权限编码:</label><input type="text" id="privilegeCode"/></li>
				   <li><label>权限类型:</label><select id="privilegeType" name="privilegeType"></select></li>
				</ul>
				<ul class="listBtn">
				   <li><input type="button" id="refreshPrivilegeSerachBtn" value="搜索"/></li>
				   <li><input type="reset" id="resetPrivilegeSerachBtn" value="重置"/></li>
				   <li><input type="button" id="savePrivilegeBtn" value="保存"/></li>
				   <li><input type="button" id="closePrivilegeDivSerachBtn" value="关闭"/></li>
				</ul>
			</div>
			</form>
			<table id="privilegeSerachTable"></table>
		</div>
	</div>
</body>
</html>