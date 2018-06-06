<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
<%@ include file="/pub/include.jsp" %>
<script src="js/exportAuditList.js" type="text/javascript"></script>
</head>
<body style="overflow-x: hidden;">
	<div class="mainSilde mainBlock">
		<div class="searchTop">
		   <h2 class="showH">搜索</h2>
		</div>
		<form action="" id="exportAuditForm" method="post">
		<div class="list searchList">
			<ul class="listShow">
			   <li><label>导出人:</label><input type="text" id="exportUserName"/></li>
			   <li><label>导出时间:</label><input type="text" id="exportDate1" name="exportDate1" class="easyui-datebox"/>-<input type="text" id="exportDate2" name="exportDate2" class="easyui-datebox"/></li>
			</ul>
			<ul class="listBtn">
			   <li><input type="button" id="refreshBtn" value="搜索"/></li>
			   <li><input type="reset" id="resetBtn" value="重置"/></li>
			   <li><input type="reset" id="auditSuccessBtn" value="审核通过"/></li>
			   <li><input type="reset" id="auditFailBtn" value="审核不通过"/></li>
			</ul>
		</div>
		</form>
		<table id="exportAuditTable"></table>
	</div>
</body>
</html>