<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
<%@ include file="/pub/include.jsp" %>
<script src="js/loggingList.js" type="text/javascript"></script>
</head>
<body style="overflow-x: hidden;">
	<div class="mainSilde mainBlock">
		<div class="searchTop">
		   <h2 class="showH">搜索</h2>
		</div>
		<form action="" id="loggingForm" method="post">
		<div class="list searchList">
			<ul class="listShow">
			   <li><label>操作员编号:</label><input type="text" id="userid"/></li>
			   <li><label>操作员名称:</label><input type="text" id="username"/></li>
			   <li><label>菜单名称:</label><input type="text" id="menuname"/></select></li>
			   <li><label>操作时间:</label><input type="text" id="createDate1" name="createDate1" class="easyui-datebox"/>-<input type="text" id="createDate2" name="createDate2" class="easyui-datebox"/></li>
			   <li><label>是否有敏感数据:</label><input type="checkbox" name="is_sensitiveData" value="" id="ChangeSensitiveData"/>是</li>
			</ul>
			<ul class="listBtn">
			   <li><input type="button" id="refreshBtn" value="搜索"/></li>
			   <li><input type="reset" id="resetBtn" value="重置"/></li>
			</ul>
		</div>
		</form>
		<table id="loggingTable"></table>
	</div>
</body>
</html>