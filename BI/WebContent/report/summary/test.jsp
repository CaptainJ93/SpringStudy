<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
 <SCRIPT LANGUAGE="Javascript" SRC="../../FusionChart/js/FusionCharts.js"></SCRIPT>　　 
</head>
<body>
	 <div id="chart1div">　　 
　　　　　　　　 FusionCharts　　　 
　　　　　 </div>　　 
　　　　　 <script language="JavaScript">　　　　 
　　　　　　　　 var chart1 = new FusionCharts("../../FusionChart/MSColumn3DLineDY.swf", "chart1Id", "800", "500");　　　　 
　　　　　　　　// chart1.setDataXML("<graph><set name='A' value='10' color='D64646' link='n-http://www.baidu.com'/><set name='B' value='11' color='AFD8F8' link='http://www.sohu.com' /></graph>");
　　　 			chart1.setXMLUrl("data.xml");　
　　　　　　　　 chart1.render("chart1div");　　　 
 
　　　　　 </script>　　　　 
</body>
</html>