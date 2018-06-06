<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<% 
String path = request.getContextPath();
%>
<link rel="stylesheet" type="text/css" media="screen,projection" href="<%=path %>/css/bridge.css"/>
<link rel="stylesheet" type="text/css" href="<%=path %>/themes/default/easyui.css">
<script src="<%=path %>/js/jquery.min.js" type="text/javascript"></script>
<script src="<%=path %>/js/jquery.easyui.min.js" type="text/javascript" ></script>
<script src="<%=path %>/js/jquery.hl.js" type="text/javascript"></script>
<title>BI</title>
<script language="JavaScript">
if (window != top)
top.location.href = location.href;
</script> 
</head>

<body style="background:url(<%=path %>/images/loginBg.gif) repeat-x;">
<form action="" id="loginForm" method="post">
<div class="login">
    <div class="loginLog"></div>
	<div class="loginArea">
	    <div class="list loginList">
			<ul class="listShow">
			   <li><label style="background: #FFFFFF">用户名:</label><input style="height: 20px" type="text" id="loginId" name="paramMap.loginId"/></li>
			   <li><label style="background: #FFFFFF">密码:</label><input style="height: 20px;width: 150" type="password" id="password" name="paramMap.password" class="textMiddle" /></li>
			</ul>
		</div>
		<br/>
		<div align="center">
			<input type="button" value="登录" name="loginBtn" id="loginBtn" onclick="login()" class="btn" style="height: 25px;">
			<input type="reset" value="重置" name="resetBtn" class="btn" style="height: 25px;"><label style="background: #FFFFFF"></label>
		</div>
		<br/>
		<br/>
		<br/>
		<div align="center">本系统建议使用Chrome或Firefox浏览器</div>
		<br/>
		<br/>
		<br/><br/><br/><br/><br/>
		
		 
	</div>
	
</div>
</form>
</body>
<script type="text/javascript">
function login(){
	if($("#loginId").val()==null||$("#loginId").val()==""){
			alert("用户名不能为空!");
			$("#loginId").focus();
			return false; 
		}
		if($("#password").val()==null||$("#password").val()==""){
			alert("密码不能为空!");
			$("#password").focus();
			return false; 
		}
		var options = {
				url:"login!login.action", 
				type:"post",
				dataType:"json",
				success:function(data){
					if(data['errCode'] == 0){
						if($("#password").val()=="111111")
							window.location="<%=request.getContextPath()%>/main.jsp?modify_pwd=true";
						else
							window.location="<%=request.getContextPath()%>/main.jsp";
					}else{
						$.messager.alert("操作结果","登录失败原因：" + data['errMsg'], "error", null);
					}
				}
			};
		$("#loginForm").ajaxSubmit(options);
}

	$("#loginId").focus();
	var error = '';
	if(error!=null&&error!=''&&error!='null'){
		$("#error").html(error);
		$("#loginId").val(<%=(String)request.getAttribute("loginId")%>);
	}
	document.onkeydown = function(e)
	{
    	var e = window.event?window.event:e; 
    	if(e.keyCode == 13){
     		var btn=document.getElementById("loginBtn");
     		btn.click();
     		}
	}
</script>
</html>
