<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ include file="/WEB-INF/views/include/head.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>包裹路由信息</title>
<%
	String result = (String) request.getAttribute("result");
	//out.print(result);
	if((null ==result) || ("".equals(result))){
		out.print("<h3>未找到该面单号的配送信息...</h3>");
	}
%>
<script type="text/javascript">

$(document).ready(function(){
	var html = '<table><tr><td><h3>快递单号</h3></td><td><h3>路由描述</h3></td><td><h3>创建时间</h3></td></tr>';
	var json =<%=result%>;
	for(var i=0,l=json.length;i<l;i++){  
		html+='<tr>';
		   for(var key in json[i]){  
		       //alert(key+':'+json[i][key]);  
			   html=html+'<td>'+json[i][key]+'</td>';
		   } 
		   html+='</tr>';
	}
	html+='</table>';
	$('#result').html(html);
});
</script>
</head>
<body>





<div id="result"></div>
</body>
</html>