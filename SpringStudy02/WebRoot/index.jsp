<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<!-- request对象获取参数 -->
	<form action="${pageContext.request.contextPath}/param/test1.action" method="POST">
		姓名：<input type="text" name="username"/>
		密码：<input type="password" name="password"/>
		<input type="submit" value="提交"/>
	</form>
	
	<!-- PathVariable获取参数 -->
	<form action="${pageContext.request.contextPath}/param/test2/贾世禛1/321312.action" method="POST">
		<input type="submit" value="提交"/>
	</form>
	
	<!-- 简单数据类型获取参数 -->
	<form action="${pageContext.request.contextPath}/param/test3.action" method="POST">
		姓名：<input type="text" name="name"/>
		密码：<input type="password" name="password"/>
		<input type="submit" value="提交"/>
	</form>
	
	<!-- JavaBean获取参数 -->
	<form action="${pageContext.request.contextPath}/param/test4.action" method="POST">
		姓名：<input type="text" name="name"/>
		密码：<input type="password" name="password"/>
		电话：<input type="text" name="tel"/>
		邮箱：<input type="text" name="email"/>
		<input type="submit" value="提交"/>
	</form>
	
	<!-- 包装JavaBean获取参数 -->
	<form action="${pageContext.request.contextPath}/param/test5.action" method="POST">
		姓名：<input type="text" name="user.username"/>
		密码：<input type="password" name="user.password"/>
		电话：<input type="text" name="user.tel"/>
		邮箱：<input type="text" name="user.email"/>
		性别：<input type="radio" name="gender" value="男"/>男
			<input type="radio" name="gender" value="女"/>女
		<input type="submit" value="提交"/>
	</form>
	
	<!-- 数组接收参数 -->
	<form action="${pageContext.request.contextPath}/param/test6.action" method="POST">
		<input type="checkbox" name="idq" value="1"/>1
		<input type="checkbox" name="idq" value="2"/>2
		<input type="checkbox" name="id" value="3"/>3
		<input type="checkbox" name="id" value="4"/>4
		<input type="submit" value="提交"/>
	</form>
</body>
</html>