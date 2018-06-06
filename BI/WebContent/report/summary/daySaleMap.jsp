<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
<%@ include file="/pub/include.jsp" %>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/zTreeStyle.css">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.ztree.core-3.5.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.ztree.excheck-3.5.js"></script>
<script src="js/daySaleMap.js" type="text/javascript"></script>
<script type="text/javascript" src="http://api.map.baidu.com/api?v=1.5&ak=94d412e70c54d93e91727e2bc1dbf813"></script>  
<script src="js/RichMarker_min.js" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/FusionChart/js/FusionCharts.js"></script>
<style>
	ul.ztree {margin-top: 10px;border: 1px solid #617775;background: #f0f6e4;width:220px;height:360px;overflow-y:scroll;overflow-x:auto;}
	.datebox{
	   width:100px;
	}
</style>
<style>
  .west{
    width:900px;
    height: 1200px;
  }
  .north{
    height:100px;
  }
</style>
</head>
<body class="easyui-layout">
<!-- 
  <div region="north" class="north" >
    <h1>最简单的左右结构实现，及tab的右键菜单实现，右键查看源码</h1>
  </div>
   -->
  <div region="center" title="<div style='height:18px'>各通路实时业绩</div>" style="height: 1200px">
    <div id="chart1div" align="center">正在加载数据，请稍等...</div>
  </div>
  <div region="west" class="west" title="<label>通路:</label> <input type='text' id='subchannelName' readonly='readonly' onclick='showSubchannel()'/>&nbsp;<a id='clearSubchannel' href='javascript:void(0)'>清空</a><input type='hidden' id='subchannelId'/>">
    <div style="width:100%;height:1000px;" id="container">  
    </div>  
    <div style="display: none">
		<div id="cityDiv">
		</div>
	</div>
    <div id="subchannelContent" class="menuContent" style="display:none; position: absolute;z-index: 999">
		<ul id="subchannelTree" class="ztree" style="margin-top:0; width:180px;height: 200px;"></ul>
	</div>
  </div>
  
  <script type="text/javascript">
  	var cityData;
  	var cityName='杭州市';
  	var mapLvl = 8;
    var map = new BMap.Map("container",{minZoom:7,maxZoom:9});  
    map.centerAndZoom(new BMap.Point(121.353364,28.469546), mapLvl);  
	map.addControl(new BMap.NavigationControl({type: BMAP_NAVIGATION_CONTROL_SMALL}));
	map.enableScrollWheelZoom();
	map.addEventListener("zoomend", function(){ //监听地图放大级别
		if(7<=map.getZoom() && map.getZoom()<=9 && (mapLvl < 7 || mapLvl > 9)){
			map.clearOverlays();
			showCityDataToMap(cityData);
		}
		else if(map.getZoom() < 7 || map.getZoom() > 9){
			mapLvl = map.getZoom();
			map.clearOverlays();
		}
	});
	showCity();
	showZipData(cityName);
	showSubChannel();
	
	
	window.setInterval(showCity,300000);//定时
	window.setInterval(function(){showZipData(cityName)},300000);//定时
	window.setInterval(showSubChannel,300000);//定时
	

//通路业绩图表
function showSubChannel(){
	jQuery.ajax({
		url:'summaryStat!showSubChannel.action',
			type:'post',
			context:this,
			dataType: "json",
			success:function(data){
				var chart1Reference = FusionCharts("chart1Id");
				if(chart1Reference == null ){
					FusionCharts.setCurrentRenderer('javascript');
					var chart1 = new FusionCharts("<%=request.getContextPath()%>/FusionChart/MSBar2D.swf", "chart1Id", "300", "600");　　　　 
					chart1.setDataXML(data["value"]);
					chart1.render("chart1div");
				}else{
					chart1Reference.setDataXML(data["value"]);
				}
			}
	});
}
</script>
</body>
</html>