<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Json处理</title>
</head>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<body>
<script type="text/javascript">
	$(function(){
		$("#putAndGet").click(function(){
			$.ajax({
				url:"json/test1.action",
				data:'{"username":"贾世禛","password":"123456","tel":"87654321"}',
				contentType:"application/json",
				type:"post",
				dataType:"json",
				success:function(data){
					alert(JSON.stringify(data));
				},
			});
		});
	});
</script>
	<input type="button" value="Json" id="putAndGet">
</body>
</html>