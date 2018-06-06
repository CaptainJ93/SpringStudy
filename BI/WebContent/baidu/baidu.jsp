<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8" %> 
<html> 
<head> 
<link rel="stylesheet" type="text/css" href="css/easyui.css">
<script src="js/jquery-1.7.2.min.js" type="text/javascript"></script>
<script src="js/jquery.easyui.min.js" type="text/javascript"></script>
<script type="text/javascript" src="http://api.map.baidu.com/api?v=1.5&ak=2b866a6daac9014292432d81fe9b47e3"></script>  
<script src="js/RichMarker_min.js" type="text/javascript"></script>

<link href="css/demo.css" rel="stylesheet" type="text/css" />
    <script src="js/boot.js" type="text/javascript"></script>
    <style type="text/css">
        .New_Button, .Edit_Button, .Delete_Button, .Update_Button, .Cancel_Button
        {
            font-size:11px;color:#1B3F91;font-family:Verdana;  
            margin-right:5px;          
        }
    </style>        
    
<style> 
  article, aside, figure, footer, header, hgroup, 
  menu, nav, section {  display:  block;  } 
  .west{ 
    width: 200px; 
  } 
  .north{ 
    height: 100px; 
  } 
</style> 
</head> 
<body  class ="easyui-layout"> 
   <div  region ="north"  class ="north"  title ="搜索"> 
     <h1>查询条件</h1> 
   </div> 
   <div  region ="center"  title ="百度地图"> 
   		<div style="width:100%-1;height:600px;border:0px solid gray" id="container">  
    	</div>  
   </div>  
   <div  region ="west"  class ="west"  title ="table"> 
   		<div id="dept_grid" class="mini-datagrid" style="width:200px-1;height:100%;" 
        url="data.json"  idField="id" sizeList="[20,30,50]" pageSize="20" onselectionchanged="onSelectionChanged"  selectOnLoad="false">
        <div property="columns">            
            <div field="id" width="40%" headerAlign="center" >ID</div>                                        
            <div field="name" width="60%" name="name" headerAlign="left" style="display: none;">部门名称</div>          
        </div>
    </div> 
   </div> 
   
</body>
</html> 
<script type="text/javascript">  

    var map = new BMap.Map("container");  
    map.centerAndZoom(new BMap.Point(119.650242,29.098807), 8);  
	map.addControl(new BMap.NavigationControl({type: BMAP_NAVIGATION_CONTROL_SMALL}));
	map.enableScrollWheelZoom();
	
	
	var html2 = '<div style="position: absolute; margin: 0pt; padding: 0pt; width: 80px; height: 26px; left: -10px; top: -35px; overflow: hidden;">'
                +     '<img id="rm3_image" style="border:none;left:0px; top:0px; position:absolute;" src="./image/back1.png">'
				+ '</div>'
				+ '<label class=" BMapLabel" unselectable="on" style="position: absolute; -moz-user-select: none; display: inline; cursor: inherit; border: 0px none; padding: 2px 1px 1px; white-space: nowrap; font: 12px arial,simsun; z-index: 80; color: rgb(255, 102, 0); left: 15px; top: -35px;">杭州:xx单</label>',
	
	myRichMarker2 = new BMapLib.RichMarker(html2,  new BMap.Point(120.13777,30.287489),{
                                                  "anchor" : new BMap.Size(-5, -5),
												  "enableDragging" : true});
	map.addOverlay(myRichMarker2);			
	
	
	var html3 = '<div style="position: absolute; margin: 0pt; padding: 0pt; width: 80px; height: 26px; left: -10px; top: -35px; overflow: hidden;">'
                +     '<img id="rm3_image" style="border:none;left:0px; top:0px; position:absolute;" src="./image/back1.png">'
				+ '</div>'
				+ '<label class=" BMapLabel" unselectable="on" style="position: absolute; -moz-user-select: none; display: inline; cursor: inherit; border: 0px none; padding: 2px 1px 1px; white-space: nowrap; font: 12px arial,simsun; z-index: 80; color: rgb(255, 102, 0); left: 15px; top: -35px;">丽水:xx单</label>',			
	
	myRichMarker2 = new BMapLib.RichMarker(html3,  new BMap.Point(119.926201,28.491055),{
                                                  "anchor" : new BMap.Size(-5, -5),
												  "enableDragging" : true});
	map.addOverlay(myRichMarker2);
	
	
	
	map.addEventListener("zoomend", function(){ //监听地图放大级别
		if(map.getZoom()==11||map.getZoom()==12||map.getZoom()==13){
			map.clearOverlays();
			showZone('');
		}else if(7<=map.getZoom()&&map.getZoom()<=10){
			map.clearOverlays();
			showCountry();
		}else{
			map.clearOverlays();
		}
	});
	
	function showZone(country){
		var html4 = '<div style="position: absolute; margin: 0pt; padding: 0pt; width: 80px; height: 26px; left: -10px; top: -35px; overflow: hidden;">'
                +     '<img id="rm3_image" style="border:none;left:0px; top:0px; position:absolute;" src="./image/back1.png">'
				+ '</div>'
				+ '<label class=" BMapLabel" unselectable="on" style="position: absolute; -moz-user-select: none; display: inline; cursor: inherit; border: 0px none; padding: 2px 1px 1px; white-space: nowrap; font: 12px arial,simsun; z-index: 80; color: rgb(255, 102, 0); left: 15px; top: -35px;">滨江区:xx单</label>',			
	
		myRichMarker2 = new BMapLib.RichMarker(html4,  new BMap.Point(120.148119,30.327896),{
                                                  "anchor" : new BMap.Size(-3, -3),
												  "enableDragging" : true});
		map.addOverlay(myRichMarker2);
		
		
		var html4 = '<div style="position: absolute; margin: 0pt; padding: 0pt; width: 80px; height: 26px; left: -10px; top: -35px; overflow: hidden;">'
                +     '<img id="rm3_image" style="border:none;left:0px; top:0px; position:absolute;" src="./image/back1.png">'
				+ '</div>'
				+ '<label class=" BMapLabel" unselectable="on" style="position: absolute; -moz-user-select: none; display: inline; cursor: inherit; border: 0px none; padding: 2px 1px 1px; white-space: nowrap; font: 12px arial,simsun; z-index: 80; color: rgb(255, 102, 0); left: 15px; top: -35px;">江干区:xx单</label>',			
	
		myRichMarker2 = new BMapLib.RichMarker(html4,  new BMap.Point(120.211072,30.264783),{
                                                  "anchor" : new BMap.Size(-3, -3),
												  "enableDragging" : true});
		map.addOverlay(myRichMarker2);
	}
	function showCountry(){
		var html2 = '<div style="position: absolute; margin: 0pt; padding: 0pt; width: 80px; height: 26px; left: -10px; top: -35px; overflow: hidden;">'
                +     '<img id="rm3_image" style="border:none;left:0px; top:0px; position:absolute;" src="./image/back1.png">'
				+ '</div>'
				+ '<label class=" BMapLabel" unselectable="on" style="position: absolute; -moz-user-select: none; display: inline; cursor: inherit; border: 0px none; padding: 2px 1px 1px; white-space: nowrap; font: 12px arial,simsun; z-index: 80; color: rgb(255, 102, 0); left: 15px; top: -35px;">杭州:xx单</label>',
	
		myRichMarker2 = new BMapLib.RichMarker(html2,  new BMap.Point(120.13777,30.287489),{
                                                  "anchor" : new BMap.Size(-5, -5),
												  "enableDragging" : true});
		map.addOverlay(myRichMarker2);			
	
	
		var html3 = '<div style="position: absolute; margin: 0pt; padding: 0pt; width: 80px; height: 26px; left: -10px; top: -35px; overflow: hidden;">'
                +     '<img id="rm3_image" style="border:none;left:0px; top:0px; position:absolute;" src="./image/back1.png">'
				+ '</div>'
				+ '<label class=" BMapLabel" unselectable="on" style="position: absolute; -moz-user-select: none; display: inline; cursor: inherit; border: 0px none; padding: 2px 1px 1px; white-space: nowrap; font: 12px arial,simsun; z-index: 80; color: rgb(255, 102, 0); left: 15px; top: -35px;">丽水:xx单</label>',			
	
		myRichMarker2 = new BMapLib.RichMarker(html3,  new BMap.Point(119.926201,28.491055),{
                                                  "anchor" : new BMap.Size(-5, -5),
												  "enableDragging" : true});
		map.addOverlay(myRichMarker2);
	}
	
	 /////////////////////////////////////////////////////// 
        mini.parse();
        var dept_grid = mini.get("dept_grid");
        dept_grid.load();
        //dept_grid.hideColumn("name"); 
        function onSelectionChanged(e) {
            var grid = e.sender;
            var record = grid.getSelected();
            if (record) {
                alert(record.name);
            }
        }
				
	/*
	var countrys = ["杭州市","宁波市","温州市","嘉兴市","舟山市","台州市","丽水市","金华市"];
	var colours = ["#C8C1E3","#FBC5DC","#DBEDC7","#E7CCAF","#DBEDC7","#FEFCBF","#E7CCAF","#C8C1E3"];
	var name = "";
	var colour = "";
	for(var j=0; j<countrys.length;j++){
		name = countrys[j];
		colour = colours[j];
		getBoundary(name,colour);
	}
	
	
	function getBoundary(province,colour) {
    var boundary = new BMap.Boundary();
    	boundary.get(province, function(rs){ 
     	//一个省可能有好几个闭合的多边形区域
     	for (var i = 0; i < rs.boundaries.length; i++) {
     	alert(colour);
	     	var ply = new BMap.Polygon(rs.boundaries[i], {strokeWeight: 2, strokeColor: colour}); //建立多边形覆盖物
            map.addOverlay(ply);  //添加覆盖物
     	}    
    	});  
	} 
	
	*/
	
    
    /* 
    var icon = new BMap.Icon('markers1.png', new BMap.Size(20, 32), {
    	anchor: new BMap.Size(10, 30)
	});
    var marker=new BMap.Marker(new BMap.Point(120.146969,30.295472));  
    map.addOverlay(marker); 
    var sContent ="<div style='line-height:1.8em;font-size:12px;'><b>地　　址：</b>传媒学院<br/></div>";
     var infoWindow = new BMap.InfoWindow(sContent);  // 创建信息窗口对象
      marker.addEventListener("click", function(){          
                      this.openInfoWindow(infoWindow);  
                      });
       */               
</script>
