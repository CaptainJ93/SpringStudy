<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
<%@ include file="/pub/include.jsp" %>
<script src="js/mergeColumns1.js" type="text/javascript"></script>
<script src="js/mergeColumns.js" type="text/javascript"></script>
</head>
<body style="overflow-x: hidden;">
	<div class="mainSilde mainBlock">
		<div class="searchTop">
		   <h2 class="showH">搜索</h2>
		</div>
		<form action="" id="menuForm" method="post">
		<input type="hidden" id="type" name="type" value="1"/>
		<div class="list searchList">
			<ul class="listBtn">
			   <li><input type="button" id="refreshBtn" value="搜索全国" onclick="refAll()"/> </li>
			   <li><input type="button" id="refreshBtn" value="搜索全省" onclick="refProvince()"/></li>
			   <li><input type="button" id="refreshBtn" value="搜索全市" onclick="refCity()"/></li>
			</ul>
		</div>
		</form>
		<table id="menuTable"></table>
	</div>
</body>
</html>