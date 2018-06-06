<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>exceptionTest</title>
</head>
<body>
	<a href="${pageContext.request.contextPath}/exception/test1.action">exceptiontest,exceptionHandler</a>
	
	<a href="${pageContext.request.contextPath}/exception/test2.action">simpleMappingExceptionResolver</a>
	
	<a href="${pageContext.request.contextPath}/exception/test3.action">handlerExceptionResolver</a>
</body>
</html>