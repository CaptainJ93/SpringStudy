<!DOCTYPE HTML>
<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<%@ include file="/pub/include.jsp" %>
<style>
html,body{ overflow:hidden;}
</style>

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/zTreeStyle.css">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.ztree.core-3.5.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.ztree.excheck-3.5.min.js"></script>
<script src="<%=request.getContextPath()%>/main.js" type="text/javascript"></script>

<link rel="stylesheet" type="text/css" href="css/TabPanel.css">
<script type="text/javascript" src="js/Fader.js"></script>
<script type="text/javascript" src="js/TabPanel.js"></script>
<script type="text/javascript" src="js/Math.uuid.js"></script>

<script type="text/javascript">
/*用于消息推送
$(document).ready(function() {
			//$("#message_content").append("<h>标题</h>");
             $("#message").Show(310,195);
          });
          */
function init(){
	if(<%=request.getParameter("modify_pwd")%>){
		$("#passwordDialog").dialog("open");
		$("#closeBtn").attr("disabled",true);
	}
}

function cancel(){
	$.ajax({
			url:'login!cancel.action',
			type:'post',
			success:function(){
				window.location="<%=request.getContextPath()%>";
			}
		});	
}
function quit(){
		$.ajax({
			url:'login!quit.action',
			type:'post',
			success:function(){
				window.opener=null;
				window.open('','_self');
				window.close();
			}
		});	
	}

	function changePwd()
	{
		$("#passwordDialog").dialog("open");
	}
	</script>
	
</head>

<body onload="init()">
	<div class="head">
	
	   <div class="systemOpreate" style="right: 10px">
	   		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	      <a title="修改密码" onClick="changePwd()"><img src="images/information.png"></a>
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
	       <li class="silde sed">&nbsp;<a>BI系统</a>&nbsp;</li>
	   </ul>
	   <div class="sildeCon">
		   <ul class="block">
			   <li>欢迎使用营销数据支撑系统</li>
			  <!-- <li><a href="#" onclick="changeMenu()">欢迎使用chat系统</a></li>-->
		   </ul>
	   </div>
	   
	   
	</div>
	<div class="left">
	<div class="zTreeDemoBackground left"><ul id="treeDemo" class="ztree"></ul></div>
	</div>
	<div class="split">
	    <img src="images/Lefthidden.gif" class="hidden">
		<img src="images/Leftshow.gif" class="show">
	</div>
	
	<div class="main" style="overflow-x:hidden;overflow-y:hidden">
	<!-- <input type="hidden" name="menuId" id="menuId"/>
	<input type="hidden" name="menuName" id="menuName"/> -->
	
	<div id="tab"></div>
	<!--  
	<div class="foot">
	    <ul>
		    <li><span class="Fleft">.</span><a>技术支持:好易购技术部</a><span class="Fright">.</span></li>
		    <li><span class="Fleft">.</span><a href="SearchList2.htm" target="mainwindow">TABSelect2</a><span class="Fright">.</span></li>
			<li><span class="Fleft">.</span><a href="Detail.htm" target="mainwindow">TABSelect3</a><span class="Fright">.</span></li>
		</ul>
	</div>
	
	<iframe id="mainwindow" name="mainwindow" src=""  frameborder="no" class="iframe"></iframe>-->
	</div>
	<!-- 用于消息推送
	<div id="message" style="z-index: 100; position: absolute; display: none; bottom: 0;right: 0; overflow: hidden;">
        <div id="backimage"><img src="<%=request.getContextPath()%>/images/tip.png" alt="" /></div>
        <div style="width: 100%; height: 25px; overflow: hidden;" id="messageTool">
            <div style="padding: 3px 0 0 35px; width: 100px; line-height: 20px; text-align: center;overflow: hidden; position: absolute;" id="msgtitle">
            </div>
            <img id="message_close" src="<%=request.getContextPath()%>/images/tip_close.png" style="padding: 0px 0 0 35px;right: 4px; width: 30px;height: 17px; text-align: center; cursor: pointer;position: absolute;"/>
            <div style="clear: both;">
            </div>
        </div>
        <div id="message_content" style="margin: 0 5px 0 5px; width: 305px;height: 135px; text-align: left; overflow: hidden;">
        	<div align="center" style="font-size: 20px">通	知</div>
        	<div>
        		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;系统更新通知：系统更新通知、系统更新通知、系统更新通知、系统更新通知、系统更新通知、系统更新通知、
        		系统更新通知、系统更新通知、系统更新通知、系统更新通知;
        		<br/>
        		<div align="right">2014-8-28&nbsp;&nbsp;&nbsp;&nbsp;</div>
        	</div>
        </div>
    </div>
     -->
	<div style="display: none">
	<div id="passwordDialog">
		<form action="" id="passwordForm" method="post">
		<div class="list searchList">
				<ul class="listShow">
					<li><label>原密码:</label><input type="password" id="password" name="password" class="textMiddle"/>&nbsp;<span style="color: red;">*</span></li>
					
					<li><label>新密码:</label><input type="password" id="newpassword" name="newpassword" class="textMiddle"/>&nbsp;<span style="color: red;">*</span></li>
					
					<li><label>确认密码:</label><input type="password" id="confirmpassword" name="confirmpassword" class="textMiddle"/>&nbsp;<span style="color: red;">*</span></li>
					<li><label>密码格式要求:</label>6-16位字符，至少包含数字、字母(区分大小写)、特殊符号中的2种</li>
				</ul>
				<ul class="listBtn">
					<li><input type="button" id="changePassword" value="确认"/></li>
			 		<li><input type="reset" value="重置"/></li>
					<li><input type="button" id="closeBtn" value="关闭" /></li>
				</ul>
			</div>
		</form>
	</div>
	</div>
</body>
</html>