<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
<%@ include file="/pub/include.jsp" %>
<script src="js/fileConfigList.js" type="text/javascript"></script>
</head>
<body style="overflow-x: hidden;">
	<div class="mainSilde mainBlock">
		<div class="searchTop">
		   <h2 class="showH">搜索</h2>
		</div>
		<form action="" id="queryForm" method="post">
		<div class="list searchList">
			<ul class="listShow">
				<li>
			   		<label>文件名:</label>
			   		<select class="easyui-select" id="filepath" name="filepath" data="REPORT_FILE_PATH" allownull="true" nullname="全部" nullvalue=""></select>
			   </li>

			</ul>
			<ul class="listBtn">
			   <li><input type="button" id="saveBtn" value="保存"/></li>
			</ul>
		</div>
		</form>
		<div style="width:100%"> 
			<textarea id="fileContent" name="fileContent" style="width: 100%;height: 500px;overflow: auto"></textarea>
		</div>
	</div>
</body>
</html>