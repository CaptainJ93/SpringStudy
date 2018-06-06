<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>restful test</title>
</head>
<body>
	<h3>查询</h3>
	<form action="${pageContext.request.contextPath}/restfultest.action" method="get">
		<input type="hidden" name="user_id" value="1000">
		<input type="submit" value="提交">
	</form>
	
	<h3>新增</h3>
	<form action="${pageContext.request.contextPath}/restfultest.action" method="post">
		<input type="hidden" name="username" value="jsz">
		<input type="hidden" name="password" value="123456">
		<input type="submit" value="提交">
	</form>
	
	<h3>修改</h3>
	<form action="${pageContext.request.contextPath}/restfultest.action" method="post">
		<input type="hidden" name="user_id" value="1000">
		<input type="hidden" name="username" value="jiasz">
		<input type="hidden" name="_method" value="put">
		<input type="submit" value="提交">
	</form>
	
	<h3>删除</h3>
	<form action="${pageContext.request.contextPath}/restfultest/1000.action" method="post">
		<input type="hidden" name="_method" value="delete">
		<input type="submit" value="提交">
	</form>
</body>
</html>