<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
<%@ include file="/pub/include.jsp" %>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/zTreeStyle.css">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.ztree.core-3.5.js"></script>
<script src="js/menuList.js" type="text/javascript"></script>
<style>
	ul.ztree {margin-top: 10px;border: 1px solid #617775;background: #f0f6e4;width:220px;height:360px;overflow-y:scroll;overflow-x:auto;}
</style>
</head>
<body style="overflow-x: hidden;">
	<div class="mainSilde mainBlock">
		<div class="searchTop">
		   <h2 class="showH">搜索</h2>
		</div>
		<form action="" id="menuForm" method="post">
		<div class="list searchList">
			<ul class="listShow">
			   <li><label>菜单名称:</label><input type="text" id="menuname"/></li>
			   <li><label>所属目录:</label>
					<input type="text" id="menupname" readonly="readonly"/>&nbsp;<a id="showMenuLBtn" href="#">选择</a>&nbsp;<a id="clearLBtn" href="#">清空</a>
					<input type="hidden" id="menupid"/>
				</li>
			   <li><label>菜单类型:</label><select class="easyui-select" id="menutype" name="menutype" data="MENU_TYPE" allownull="true" nullname="全部" nullvalue=""></select></li>
			   <li><label>菜单状态:</label><select class="easyui-select" id="status" name="status" data="MENU_STATUS" allownull="true" nullname="全部" nullvalue=""></select></li>
			</ul>
			<ul class="listBtn">
			   <li><input type="button" id="refreshBtn" value="搜索"/></li>
			   <li><input type="reset" id="resetBtn" value="重置"/></li>
			   <li><input type="button" id="addBtn" value="添加"/></li>
			   <li><input type="button" id="editBtn" value="修改"/></li>
			   <li><input type="button" id="delBtn" value="删除"/></li>
			</ul>
			<div id="menuContentL" class="menuContent" style="display:none; position: absolute; z-index:9999">
				<ul id="menuTreeL" class="ztree" style="margin-top:0; width:160px;height: 200px;"></ul>
			</div>
		</div>
		</form>
		<table id="menuTable"></table>
	</div>
	<div style="display: none">
		<div id="editDiv">
			<form action="" id="menuEditForm" method="post">
			<input type="hidden" id="oper" name="oper"/>
			<input type="hidden" id="menuid" name="menu.menuid"/>
			<div class="list">
				<ul class="listShow">
						<li><label>菜单名称:</label><input type="text" id="menuname" name="menu.menuname" maxlength="80"/><span style="color: red;">*</span></li>
						<li><label>所属目录:</label>
							<input type="text" id="menupname" name="menu.menupname" readonly="readonly"/>&nbsp;<a id="showMenuBtn" href="#">选择</a>&nbsp;<a id="clearBtn" href="#">清空</a>
							<input type="hidden" id="menupid" name="menu.menupid" />
						</li>
						<li>
							<label>菜单类型:</label>
							<select class="easyui-select" id="menutype" name="menu.menutype" data="MENU_TYPE"></select><span style="color: red;">*</span>
						</li>
						<li><label>菜单路径:</label><input type="text" id="menuurl" name="menu.menuurl"/></li>
						<li>
				    	  <label>状态:</label>
				    	  <select class="easyui-select" id="status" name="menu.status" data="MENU_STATUS" allownull="false"></select><span style="color: red;">*</span>
				    	</li>
				    	<li>
			   				<label>菜单显示顺序:</label>
			   				<input type="text" id="menuorder" name="menu.menuorder" onkeyup="this.value=this.value.replace(/[^\d]/g,'')" onafterpaste="this.value=this.value.replace(/[^\d]/g,'')" maxlength="5"/>
			   			</li>
						<li>
							<label>菜单描述:</label>
							<textarea type="text" cols=20 rows=2 id="menudesc" name="menu.menudesc" style="width: 250px; height: 50px;"></textarea>
						</li>
				</ul>
				<ul class="listBtn">
				   <li><input type="button" id="saveBtn" value="确定"/></li>
				   <li><input type="reset" value="重置"/></li>
				   <li><input type="button" id="closeBtn" value="关闭"/></li>
				</ul>
			</div>
			</form>
			<div id="menuContent" class="menuContent" style="display:none; position: absolute;">
				<ul id="menuTree" class="ztree" style="margin-top:0; width:160px;height: 200px;"></ul>
			</div>
		</div>
	</div>
	
</body>
</html>