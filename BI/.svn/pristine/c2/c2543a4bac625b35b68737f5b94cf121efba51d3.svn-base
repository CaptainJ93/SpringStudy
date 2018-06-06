<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8" %>
<%@ page import="com.best1.domain.UserInfo,com.best1.domain.MenuInfo" %>
<html>
<head>
<%@ include file="/pub/include.jsp" %>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/zTreeStyle.css">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.ztree.core-3.5.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.ztree.excheck-3.5.min.js"></script>
<script src="js/userList.js" type="text/javascript"></script>
<script src="js/departmentTree.js" type="text/javascript"></script>
<style>
a {color:#3C6E31;text-decoration: none;}
a:hover {background-color:#3C6E31;color:white;text-decoration: underline;}
ul.ztree {margin-top: 10px;border: 1px solid #617775;background: #f6faff;width:142px;height:180px;overflow-y:scroll;overflow-x:auto;}
</style>
</head>
<body style="overflow-x: hidden;">
	<div class="mainSilde mainBlock">
		<div class="searchTop">
		   <h2 class="showH">搜索</h2> 
		</div>
		<form action="" id="userForm" method="post">
			<input type="hidden" id="departmentid"/>
		
		<div class="list searchList"  style="display:relative;">
			<ul class="listShow">
			   <li><label>用户名称:</label><input type="text" id="username"/></li>
			   <li><label>登陆账号名:</label><input type="text" id="userloginidblur"/></select></li>
			   <li><label>手机号码:</label><input type="text" id="mobileno"/></li>
			   <li><label>状态:</label>
			   <select class="easyui-select" id="status" name="status" data="USER_STATUS" allownull="true" nullname="请选择" nullvalue=""></select>
				</li>
			   <li><label>职位级别:</label>
			   <select class="easyui-select" id="postlevel" name="postlevel" data="USER_POST_LEVEL" allownull="true" nullname="请选择" nullvalue=""></select>
				</li>
				<li class="zTreeDemoBackground title" style="margin-bottom:10px;"><label>所属部门: </label><input id="departmentname" name="departmentname"  onclick="showMenu1();" type="text" readonly value="" style=" margin-bottom:10px;" />
				</li>
			</ul>
			<div id="menuContent" class="menuContent" style="display:none; position: absolute; left: 40px;z-index:100;">
				<ul id="treeDemo1" class="ztree"></ul>
			</div>	
			<ul class="listBtn">
			   <li><input type="button" id="refreshBtn" value="搜索"/></li>
			   <li><input type="reset" id="resetBtn" value="重置"/></li>
			   <li><input type="button" id="addBtn" value="添加"/></li>
			   <li><input type="button" id="editBtn" value="修改"/></li>
			   <li><input type="button" id="delBtn" value="删除"/></li>
			   <li><input type="button" id="unlockBtn" value="解锁"/></li>
			   <li><input type="button" id="unusedBtn" value="注销"/></li>
			   <li><input type="button" id="showUserRole" value="用户角色绑定"/></li>
			</ul>
		</div>
		</form>
		<table id="userTable"></table>
	</div>
	
	<div style="display: none">
	<div id="editDiv">
		<form action="" id="userEditForm" method="post">
			<input type="hidden" id="oper" name="oper"/>
			<input type="hidden" id="userid" name="userInfo.userid"/>
			<input type="hidden" id="tmpuserloginid" name="tmpuserloginid"/>
			<input type="hidden" id="departmentid" name="userInfo.departmentid"/>
			<div class="list" style="display:relative;">
				<ul class="listShow">
						<li><label>用户名称:</label><input type="text" id="username" name="userInfo.username" maxlength="100"/><span style="color: red;">*</span></li>
						<li><label>登陆账号名:</label><input type="text" class = "userloginid" id="userloginid" name="userInfo.userloginid" maxlength="100"/><span style="color: red;">*</span></li>
						<li><label>手机号码:</label><input type="text" id="mobileno" name="userInfo.mobileno" maxlength="11"/><span style="color: red;">*</span></li>
						<li><label>email地址:</label><input type="text" id="emailid" name="userInfo.emailid" maxlength="100"/><span style="color: red;">*</span></li>
						<li><label>账号启用时间:</label><input type="text" id="startdate" name="userInfo.startdate" class="easyui-datebox"/><span style="color: red;">*</span></li>
						<li><label>账号结束时间:</label><input type="text" id="enddate" name="userInfo.enddate" class="easyui-datebox"/><span style="color: red;">*</span></li>
						<li><label>职位级别:</label>
						<select class="easyui-select" id="postlevel" name="userInfo.postlevel" data="USER_POST_LEVEL" allownull="false" nullname="请选择" nullvalue="" SelectedValue="0"></select>
						<span style="color: red;">*</span></li>
						<li class="zTreeDemoBackground title" style="margin-bottom:10px;"><label>所属部门: </label><input id="departmentname" name="userInfo.departmentname" type="text" readonly value="" onclick="showMenu();" style=" margin-bottom:10px;" />
						<span style="color: red;">*</span></li>
				</ul>	
			<div id="menuContent" class="menuContent" style="display:none; position: absolute; left: 40px;z-index:100;">
			<ul id="treeDemo" class="ztree"></ul>
			</div>
				<ul class="listBtn">
				   <li><input type="button" id="saveBtn" value="确定"/></li>
				   <li><input type="reset" id="eresetBtn" value="重置"/></li>
				   <li><input type="button" id="closeBtn" value="关闭"/></li>
				</ul>
			</div>
		</form>
	</div>
	
	
		<!-- 角色用户绑定 -->
		<div id="userRoleDiv" class="mainSilde mainBlock" style="overflow-x: hidden;">
			<div class="searchTop">
			   <h2 class="showH">搜索</h2>
			</div>
			<form action="" id="userRoleForm" method="post">
			<input type="hidden" id="userid" name="userid"/>
			<div class="list searchList">
				<ul class="listShow">
				   <li><label>角色编号:</label><input type="text" id="roleid"/></li>
				   <li><label>角色名称:</label><input type="text" id="rolename"/></li>
				</ul>
				<ul class="listBtn">
				   <li><input type="button" id="searchUserRoleBtn" value="搜索"/></li>
				   <li><input type="reset" id="resetUserRoleBtn" value="重置"/></li>
				   <li><input type="button" id="addUserRoleBtn" value="添加"/></li>
				   <li><input type="button" id="delUserRoleBtn" value="删除"/></li>
				   <li><input type="button" id="closeUserRoleDivBtn" value="关闭"/></li>
				</ul>
			</div>
			</form>
			<table id="userRoleTable"></table>
		</div>
		<!-- 角色搜寻 -->
		<div id="userRoleSearchDiv" class="mainSilde mainBlock" style="overflow-x: hidden;">
			<div class="searchTop">
			   <h2 class="showH">搜索</h2>
			</div>
			<form action="" id="userRoleSearchForm" method="post">
			<input type="hidden" id="userid" name="userid"/>
			<div class="list searchList">
				<ul class="listShow">
				   <li><label>角色编号:</label><input type="text" id="roleid"/></li>
				   <li><label>角色名称:</label><input type="text" id="rolename"/></li>
				</ul>
				<ul class="listBtn">
				   <li><input type="button" id="userRoleSearchBtn" value="搜索"/></li>
				   <li><input type="reset" id="resetUserRoleSearchBtn" value="重置"/></li>
				   <li><input type="button" id="saveUserRoleBtn" value="保存"/></li>
				   <li><input type="button" id="closeUserRoleSearchBtn" value="关闭"/></li>
				</ul>
			</div>
			</form>
			<table id="userRoleSearchTable"></table>
		</div>
	</div>
</body>
</html>