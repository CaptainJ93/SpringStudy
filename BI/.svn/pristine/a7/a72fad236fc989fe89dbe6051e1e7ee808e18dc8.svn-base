<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
<%@ include file="/pub/include.jsp" %>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/zTreeStyle.css">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.ztree.core-3.5.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.ztree.excheck-3.5.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/ajaxfileupload.js"></script>
<script src="js/saleDetails.js" type="text/javascript"></script>
<style>
	ul.ztree {margin-top: 10px;border: 1px solid #617775;background: #f0f6e4;width:220px;height:360px;overflow-y:scroll;overflow-x:auto;}
	.datebox{
	   width:100px;
	}
</style>
<script type="text/javascript">
document.onkeydown = function(e)
	{
    	var e = window.event?window.event:e; 
    	if(e.keyCode == 13){
     		var btn=document.getElementById("refreshBtn");
     		btn.click();
     		}
	}
	
</script>
</head>
<body style="overflow-x: hidden;">
	<div class="mainSilde mainBlock">
		<div class="searchTop">
		   <h2 class="showH">搜索</h2>
		</div>
		<form action="" id="productTodayForm" method="post">
		<%
			String menuName = "";
			if(request.getParameter("menuName") != null && !request.getParameter("menuName").equals("")){
				menuName = new String(request.getParameter("menuName").getBytes("ISO8859-1"),"UTF-8");
			}
		%>
		<input type="hidden" name="menuId" id="menuId" value="<%=request.getParameter("menuId") %>"/>
		<input type="hidden" name="menuName" id="menuName" value="<%=menuName %>"/>
		<div class="list searchList">
			<ul class="listShow">
			   <li>
			   		<label>商品名称:</label>
			   		<input type="text" id="productname" />
			   </li>
			   <li>
			   		<label>商品品号:</label>
			   		<input type="text" id="productid" onkeyup="this.value=this.value.replace(/[^\d]/g,'')"/>
			   </li>
			   <li>
			   		<label>通路:</label>
			   		<input type="text" id="subchannelName" readonly="readonly" onclick="showSubchannel();"/>&nbsp;<a id="clearSubchannel" href="#">清空</a>
					<input type="hidden" id="subchannelId"/>
			   </li>
			</ul>
			<ul class="listBtn">
			   <li><input type="button" id="refreshBtn" value="搜索"/></li>
			   <li><input type="button" id="resetBtn" value="重置"/></li>
			</ul>
			<div id="subchannelContent" class="menuContent" style="display:none; position: absolute;z-index: 999">
				<ul id="subchannelTree" class="ztree" style="margin-top:0; width:180px;height: 200px;"></ul>
			</div>
		</div>
		</form>
		<table id="productTodayTable"></table>
	</div>
</body>
</html>