<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>upload demo</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/upload/upload.action" method="post" enctype="multipart/form-data">
		用户名：<input type="text" name="username">
		密    码：<input type="text" name="password">
		头    像：<input type="file" name="img">
		<input type="submit" value="提交">
	</form>
</body>
</html>