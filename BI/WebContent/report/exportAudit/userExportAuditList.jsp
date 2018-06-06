<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
<%@ include file="/pub/include.jsp" %>
<script src="js/userExportAuditList.js" type="text/javascript"></script>
</head>
<body style="overflow-x: hidden;">
	<div class="mainSilde mainBlock">
		<div class="searchTop">
		   <h2 class="showH">搜索</h2>
		</div>
		<form action="" id="exportAuditForm" method="post">
		<div class="list searchList">
			<ul class="listShow">
			   <li><label>导出时间:</label><input type="text" id="exportDate1" name="exportDate1" class="easyui-datebox"/>-<input type="text" id="exportDate2" name="exportDate2" class="easyui-datebox"/></li>
			   <li><label>审核状态:</label><select class="easyui-select" id="status" name="status" data="EXPORT_AUDIT_STATUS" allownull="true" nullname="全部" nullvalue=""></select></li>
			</ul>
			<ul class="listBtn">
			   <li><input type="button" id="refreshBtn" value="搜索"/></li>
			   <li><input type="reset" id="resetBtn" value="重置"/></li>
			   <li><input type="reset" id="downloadBtn" value="下载"/></li>
			</ul>
		</div>
		</form>
		<table id="exportAuditTable"></table>
	</div>
</body>
</html>