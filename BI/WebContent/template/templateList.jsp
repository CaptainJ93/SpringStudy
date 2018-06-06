<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
<%@ include file="/pub/include.jsp" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<script src="js/templateList.js" type="text/javascript"></script>
<style type="text/css">
.left{width:50%;float:left;margin: 0px;border: 0px;}
.right{width:50%;float:right;margin: 0px;border: 0px;}
</style>
</head>
<body style="overflow-x: hidden;">
	<div class="mainSilde mainBlock">
		<div class="searchTop">
		   <h2 class="showH">搜索</h2>
		</div>
		<form action="" id="templateForm" method="post">
		<%
			String menuName = "";
			if(request.getParameter("menuName") != null && !request.getParameter("menuName").equals("")){
				menuName = new String(request.getParameter("menuName").getBytes("ISO8859-1"),"UTF-8");
			}
		%>
		<input type="hidden" name="menuId" id="menuId" value="<%=request.getParameter("menuId") %>"/>
		<input type="hidden" name="menuName" id="menuName" value="<%=menuName %>"/>
		<input type="hidden" name="sensitiveData" id="sensitiveDataFlag"/><!-- 用于判断敏感数据导出 -->
		<div class="list searchList">
			<ul class="listShow">
			   <li><label>用户编号:</label><input type="text" id="userid"/></li>
			   <li><label>用户名称:</label><input type="text" id="username"/></li>
			   <li><label>性别:</label><select id="sex" name="sex"></select></li>
			   	<li>
			   			<label>开始日期<span style="color: red;">*</span></label>
			   			<input type="text" id="startdate" name="startdate" class="easyui-datebox"/>
			   		</li>
			   		<li>
			   			<label>结束日期<span style="color: red;">*</span></label>
			   			<input type="text" id="enddate" name="enddate" class="easyui-datebox"/>
			   		</li>
			   		<s:if test='#session.user.getSensitiveData().get("PHONE")=="true" || #session.user.getSensitiveData().get("IDCARD")=="true" || #session.user.getSensitiveData().get("ADDRESS")=="true"'>
			   			<li>
			   			<label>显示敏感数据：</label>
			   			<s:if test='#session.user.getSensitiveData().get("PHONE")=="true"'>
			   				<input type="checkbox" name="手机号显示" id="showPhone"/>手机号&nbsp;
			   			</s:if>
			   			<s:if test='#session.user.getSensitiveData().get("IDCARD")=="true"'>
			   				<input type="checkbox" name="身份证显示" id="showIdCard"/>身份证号&nbsp;
			   			</s:if>
			   			<s:if test='#session.user.getSensitiveData().get("ADDRESS")=="true"'>
			   				<input type="checkbox" name="详细地址显示" id="showPhone"/>详细地址
			   			</s:if>
			   		</li>
			   		</s:if>
			</ul>
			<ul class="listBtn">
			   <li><input type="button" id="refreshBtn" value="搜索"/></li>
			   <li><input type="reset" id="resetBtn" value="重置"/></li>
			   <li><input type="button" id="addBtn" value="添加"/></li>
			   <li><input type="button" id="editBtn" value="修改"/></li>
			   <li><input type="button" id="viewBtn" value="查看"/></li>
			   <li><input type="button" id="delBtn" value="删除"/></li>
			   <!-- <li><input type="button" id="showPhone" value="显示手机号码"/></li> -->
			</ul>
		</div>
		</form>
		<div style="width:100%"> 
			<div class="left"> 
				<table id="templateTable"></table>
			</div> 
			<div class="right"> 
				你在右边 
			</div>
		</div>
	</div>
	
	<div id="editDiv">
		<form action="" id="templateEditForm" method="post">
			<input type="hidden" id="oper" name="oper"/>
		
		<div class="list">
			<ul class="listShow">
					<li><label>用户编号:</label><input type="text" id="userid" name="userInfo.userid" maxlength="32"/><span style="color: red;">*</span></li>
					<li><label>用户名称:</label><input type="text" id="username" name="userInfo.username" maxlength="32"/><span style="color: red;">*</span></li>
					<li>
			    	  <label>性别:</label>
			    	  <select class="easyui-select" id="sex" name="userInfo.sex" data="SEX"></select><span style="color: red;">*</span>
			    	</li>
			</ul>
			<ul class="listBtn">
			   <li><input type="button" id="saveBtn" value="确定"/></li>
			   <li><input type="reset" value="重置"/></li>
			   <li><input type="button" id="closeBtn" value="关闭"/></li>
			</ul>
		</div>
		</form>
	</div>
	
	<div id="viewDiv">
		<form action="" id="templateViewForm" method="post">
		<div class="list">
			<ul class="listShow">
					<li><label>用户编号:</label><span id="userid" name="userid"></span></li>
					<li><label>用户名称:</label><span id="username" name="username"></span></li>
					<li><label>性别:</label><span id="sex" name="sex" data="SEX"></span></li>
					<li><label>级别:</label><span id="levl" name="levl" data="LEVEL"></span></li>
			</ul>
			<ul class="listBtn">
			   <li><input type="button" id="closeViewBtn" value="关闭"/></li>
			</ul>
		</div>
		</form>
	</div>
</body>
</html>