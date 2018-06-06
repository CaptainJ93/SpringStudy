$(function () {
	$("#cityDiv").dialog({
		autoOpen: false,
		resizable: true,
		height: "auto",
		width: 180,
		left:720,
		top:29,
		title: "区级业绩排名",
		modal: false//是否模式对话框，默认为 false
	}).dialog("open");
	
	
	/*
	 * 通路树选择 begin
	 */
	var subchannel = {
			check: {
				enable: true
			},
			view: {
				dblClickExpand: false
			},
			data: {
				simpleData: {
					enable: true
				}
			},
			async: {
				enable: true,
				url:"./query!querySubchannel.action",
			},
			callback: {
				beforeClick: beforeClickSubchannel,
				onCheck: onCheckSubchannel,
			}
		};
	$.fn.zTree.init($("#subchannelTree"), subchannel, null);
	
	$("#clearSubchannel").click(function() {
		$("#subchannelName").val("");
		$("#subchannelId").val("");
		var zTree = $.fn.zTree.getZTreeObj("subchannelTree");
		zTree.checkAllNodes(false);//同时将全部节点设置为非选中状态
		showCity();
		showZipData(cityName);
	});
	/*
	 * 通路树选择 end
	 */
	
});

function showCity(){
	$.ajax({
		url:'summaryStat!areaOrderList.action',
		type:'post',
		data:{"paramMap.subchannelId":$("#subchannelId").val()},
		dataType: "json",
		success:function(data){
			cityData = data;
			mapLvl = map.getZoom();
			if(mapLvl >= 7 && mapLvl <= 9){
				showCityDataToMap(data);
			}
		}
	});	
}

function showCityDataToMap(data){
	map.clearOverlays();
	for(var o in data["rows"]){  
        var img = "textup";
        var divtop = -35;
        var labeltop = -35;
        if(data["rows"][o].city_image_fix != 1){
        	img = "textdown";
        	divtop = 0;
        	labeltop = 7;
        }
        var labelleft = -2;
        if(data["rows"][o].ranking.length > 1) labelleft = -5;
        var html = '<a href="#" onclick="showZipData(\''+data["rows"][o].city+'\')">' 
        		+'<div style="position: absolute; margin: 0pt; padding: 0pt; width: 190px; height: 26px; left: -10px; top: '+divtop+'px; overflow: hidden;">'
				+     '<img id="rm3_image" style="border:none;left:0px; top:0px; position:absolute;" src="'+contextPath+'/css/img/'+img+'.png">'
				+ '</div>'
				+ '<label class="BMapLabel" unselectable="on" style="position: absolute; -moz-user-select: none; display: inline; cursor: inherit; border: 0px none; padding: 2px 1px 1px; white-space: nowrap; font: 13px 宋体;font-weight:bold; z-index: 80; color: rgb(255, 255, 255); left: '+labelleft+'px; top: '+labeltop+'px;">'+data["rows"][o].ranking+'</label>'
				+ '<label class="BMapLabel" unselectable="on" style="position: absolute; -moz-user-select: none; display: inline; cursor: inherit; border: 0px none; padding: 2px 1px 1px; white-space: nowrap; font: 12px arial,simsun; z-index: 80; color: rgb(255, 102, 0); left: 15px; top: '+labeltop+'px;">'+data["rows"][o].city+':[金]'+data["rows"][o].sumamount+'&nbsp;&nbsp;[件]'+data["rows"][o].ordercc+'</label></a>';
		myRichMarker2 = new BMapLib.RichMarker(html, new BMap.Point(data["rows"][o].city_longitude,data["rows"][o].city_latitude),{
	                                                  "anchor" : new BMap.Size(data["rows"][o].city_offset_x, data["rows"][o].city_offset_y),
													  "enableDragging" : true});
		map.addOverlay(myRichMarker2);
   }
}
function showZipData(city){
	cityName = city;
	$.ajax({
		url:'summaryStat!zipOrderList.action',
		type:'post',
		data:{"paramMap.subchannelId":$("#subchannelId").val(),"paramMap.city":city},
		dataType: "json",
		success:function(data){
			var content = "<table><tr><td width=40%>"+city+"</td><td>销售额</td><td>订单数</td></tr>";
			for(var o in data["rows"]){
				content = content +'<tr><td>'+ data["rows"][o].ranking + ':' + data["rows"][o].area + '</td><td>'+data["rows"][o].sumamount+'</td><td>'+data["rows"][o].ordercc+"</td></tr>";
			}
			content = content +'</table>';
			document.getElementById('cityDiv').innerHTML="";
			$("#cityDiv").append(content);
		}
	});
}


/*
 * 通路树选择
 */
function showSubchannel(){
	var Obj = $("#subchannelName");
	var Offset = $("#subchannelName").offset();
	$("#subchannelContent").css({left:Offset.left + "px", top:Offset.top + Obj.outerHeight() + "px"}).slideDown("fast");
	$("body").bind("mousedown", onBodyDownSubchannel);
}

function beforeClickSubchannel(treeId, treeNode) {
	var zTree = $.fn.zTree.getZTreeObj("subchannelTree");
	zTree.checkNode(treeNode, !treeNode.checked, null, true);
	return false;
}

function onCheckSubchannel(e, treeId, treeNode) {
	var zTree = $.fn.zTree.getZTreeObj("subchannelTree"),
	nodes = zTree.getCheckedNodes(true),
	name = "";
	id = "";
	for (var i=0, l=nodes.length; i<l; i++) {
		if(nodes[i] && !nodes[i].isParent){
			name += nodes[i].name + ",";
			id += nodes[i].id + ",";
		}
	}
	if (name.length > 0 ) name = name.substring(0, name.length-1);
	if (id.length > 0 ) id = id.substring(0, id.length-1);
	$("#subchannelName").val(name);
	$("#subchannelId").val(id);
	showCity();
	showZipData(cityName);
}

function hideSubchannel() {
	$("#subchannelContent").fadeOut("fast");
	$("body").unbind("mousedown", onBodyDownSubchannel);
}
function onBodyDownSubchannel(event) {
	if (!(event.target.id == "subchannelName" || event.target.id == "subchannelContent" || $(event.target).parents("#subchannelContent").length>0)) {
		hideSubchannel();
	}
}
/*
 * 通路树选择 end
 */

