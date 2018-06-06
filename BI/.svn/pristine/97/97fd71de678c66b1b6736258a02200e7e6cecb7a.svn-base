<!DOCTYPE HTML>
<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
<%@ include file="/pub/include.jsp" %>
<style>
html,body{ overflow:hidden;}
</style>

<script type="text/javascript">
$(function(){
			$('#tt2').tree({
				checkbox: false,
				onClick:function(node){
					$(this).tree('toggle', node.target);
				},
				onContextMenu: function(e, node){
					e.preventDefault();
					$('#tt2').tree('select', node.target);
					$('#mm').menu('show', {
						left: e.pageX,
						top: e.pageY
					});
				}
			});
		});
function changeMenu(){
	$("#tt2").html('<li><div class="tree-node" node-id="" style="cursor: pointer;"><span class="tree-indent"></span><span class="tree-icon tree-file"></span><span class="tree-title"><a href="system/text!insertLoginLog.action" target="mainwindow">2222222</a></span></div></li>');
}

function cancel(){
	$.ajax({
			url:'<%=request.getContextPath()%>/LoginServlet?method=cancel',
			type:'post',
			success:function(){
				window.location="<%=request.getContextPath()%>";
			}
		});	
}
function quit(){
		$.ajax({
			url:'<%=request.getContextPath()%>/LoginServlet?method=quit',
			type:'post',
			success:function(){
				window.opener=null;
				window.open('','_self');
				window.close();
			}
		});	
	}
	</script>
</head>

<body>
	<div class="head">
	   
	   <div class="systemOpreate" style="right: 10px">
	   		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	      <a title="返回" onClick="window.history.back(-1)"><img src="images/back.png"></a>
	      <a title="注销" onclick="cancel()"><img src="images/restart.png"></a>
		  <a title="退出" onClick="quit()"><img src="images/quit.png"></a>
	      <!-- 
	      <a title="重新登录"><img src="images/login.png"></a>
		  <a title="个人账户信息"><img src="images/information.png"></a>
		  <a title="公告"><img src="images/notice.png"></a>
		  <a title="帮助"><img src="images/help.png"></a>
		  -->
	   </div>
	  
	   
	   <!---->
	   <ul class="meau">
	       <li class="silde sed"><a>Chat系统</a></li>
	   </ul>
	   <div class="sildeCon">
		   <ul class="block">
			   <li>欢迎使用chat系统</li>
			  <!-- <li><a href="#" onclick="changeMenu()">欢迎使用chat系统</a></li>-->
		   </ul>
	   </div>
	   
	   
	</div>
	
	<div class="left">
		<ul id="tt2">
			<li><a href="${pageContext.request.contextPath}/chat/chat.jsp" target="mainwindow">业绩信息</a></li>
			<li><a href="${pageContext.request.contextPath}/chat/active.jsp" target="mainwindow">互动&电话小结</a></li>
			<li><a href="${pageContext.request.contextPath}/chat/resultHistory.jsp" target="mainwindow">历史业绩信息</a></li>
			<li><a href="http://sms.best1.com:8080/Sms/loingaction.htm" target="_blank">短信平台</a></li>
			<!-- <li><a href="${pageContext.request.contextPath}/template/templateList.jsp" target="mainwindow">模板(list)</a></li> -->
		</ul>
		<div id="mm" class="easyui-menu" style="width:120px;">
			<div onclick="append()" iconCls="icon-add">Append</div>
			<div onclick="remove()" iconCls="icon-remove">Remove</div>
			<div class="menu-sep"></div>
			<div onclick="expand()">Expand</div>
			<div onclick="collapse()">Collapse</div>
		</div>
	</div>
	
	<div class="split">
	    <img src="images/Lefthidden.gif" class="hidden">
		<img src="images/Leftshow.gif" class="show">
	</div>
	
	<div class="main">
	<div class="foot">
	    <ul>
		    <li><span class="Fleft">.</span><a>技术支持:好易购技术部</a><span class="Fright">.</span></li>
		</ul>
	</div>
		<iframe id="mainwindow" name="mainwindow" src="${pageContext.request.contextPath}/chat/chat.jsp"  frameborder="no" class="iframe"></iframe>
	</div>
</body>

</html>