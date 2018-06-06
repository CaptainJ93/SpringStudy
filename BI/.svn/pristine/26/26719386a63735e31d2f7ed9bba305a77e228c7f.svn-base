/*
 * 定义日期格式的函数
 * */
function formatDate(v) {
	if (v instanceof Date) {
		var y = v.getFullYear();
		var m = v.getMonth() + 1;
		var d = v.getDate();
		var h = v.getHours();
		var i = v.getMinutes();
		var s = v.getSeconds();
		var ms = v.getMilliseconds();
		if (ms > 0)
			return y + '-' + m + '-' + d + ' ' + h + ':' + i + ':' + s
					+ '.' + ms;
		if (h > 0 || i > 0 || s > 0)
			return y + '-' + m + '-' + d + ' ' + h + ':' + i + ':' + s;
		return y + '-' + m + '-' + d;
	}
	return '';
}
/*
 *将取回的数据赋值给表单元素
 * */
function editForm(obj,target){
	$.each(obj,function(n,value){
		$("#"+target+"").find("#"+n).val(value);
	});
};
function editFormAppend(obj,target){
	$.each(obj,function(n,value){
		$("#"+target+"").find("#"+n).append(value);
	});
};
function showLoading(){
	$("<div class=\"datagrid-mask\" ondblclick=\"removeLoading()\"></div>").css({display:"block",width:"100%",height:$(window).height()}).appendTo("body"); 
	$("<div class=\"datagrid-mask-msg\"></div>").html("正在处理，请稍候。。。").appendTo("body").css({display:"block",left:($(document.body).outerWidth(true) - 190) / 2,top:($(window).height() - 45) / 2});
};
function removeLoading(){
	$(".datagrid-mask").remove();
	$(".datagrid-mask-msg").remove();
};

/*
 *时间比较 
 */
function compareDate(d1, d2) {  // 时间比较的方法，如果d1时间比d2时间大，则返回true   
    return Date.parse(d1.replace(/-/g, "/")) > Date.parse(d2.replace(/-/g, "/"))   
}

/*
 * 根据dates计算当前日期的前后日期
 */
function getDateString(dates){
	dates = dates -1;
	var date = new Date();
	date.setDate(date.getDate()+(dates));
    var year = date.getFullYear(); 
    var month = date.getMonth()+1; 
    var day = date.getDate(); 
	return year+"-"+month+"-"+day;
}

//计算两个日期的间隔天数
function DateDiff(sDate1, sDate2){ //sDate1和sDate2是2002-12-18格式
	sDate1 = /\d{4}-\d{1,2}-\d{1,2}/g.exec(sDate1).toString();
	sDate2 = /\d{4}-\d{1,2}-\d{1,2}/g.exec(sDate2).toString();//截取带时分秒的日期格式
	var aDate, oDate1, oDate2, iDays;
	aDate = sDate1.split("-");
	oDate1 = new Date(aDate[0],aDate[1],aDate[2]," "," "," ");
	aDate = sDate2.split("-");
	oDate2 = new Date(aDate[0],aDate[1],aDate[2]," "," "," "); 
	iDays = parseInt(Math.abs(oDate1 - oDate2) / 1000 / 60 / 60 /24); //把相差的毫秒数转换为天数  
	return iDays;
}

//计算两个日期的间隔天数
function MonthDiff(sDate1, sDate2){ //sDate1和sDate2是2002-12-18格式
	sDate1 = /\d{4}-\d{1,2}-\d{1,2}/g.exec(sDate1).toString();
	sDate2 = /\d{4}-\d{1,2}-\d{1,2}/g.exec(sDate2).toString();//截取带时分秒的日期格式
	var aDate, oDate1, oDate2, iDays;
	aDate = sDate1.split("-");
	oDate1 = parseInt(aDate[0]) * 12 + parseInt(aDate[1]);
	aDate = sDate2.split("-");
	oDate2 = parseInt(aDate[0]) * 12 + parseInt(aDate[1]);
	return Math.abs(oDate1 - oDate2);
}

//计算两个日期的间隔年数
function YearDiff(sDate1, sDate2){ //sDate1和sDate2是2002-12-18格式
	sDate1 = /\d{4}-\d{1,2}-\d{1,2}/g.exec(sDate1).toString();
	sDate2 = /\d{4}-\d{1,2}-\d{1,2}/g.exec(sDate2).toString();//截取带时分秒的日期格式
	return sDate1.split("-")[0]-sDate2.split("-")[0];
}

/*
 * zTree反选功能
 */
var IDMark_A = "_a";
function changeNode(nodeId,treeName,funName){
	var treeObj = $.fn.zTree.getZTreeObj(treeName);
	var nodes = treeObj.transformToArray(treeObj.getNodes());
	var i = 0;
	while(i<nodes.length)
	{
		if(nodes[i].id==nodeId){
			var flag = changeCheck(treeObj,nodes[i]);
			nodes[i].checked = flag;
			treeObj.updateNode(nodes[i]);
			break;
		}
		i = i + 1;
	}
	eval(funName);
}

function changeCheck(treeObj,treeNode){
	var flag = false;
	var flagTmp;
	if(treeNode.isParent){
		if(treeNode.children != undefined && treeNode.children.length > 0){
			var i = 0;
			while(i < treeNode.children.length){
				flagTmp = changeCheck(treeObj,treeNode.children[i]);
				if(!flag) flag = flagTmp;
				i = i + 1;
			}
		}
		treeNode.checked = flag;
		treeObj.updateNode(treeNode);
	}else{
		treeNode.checked = !treeNode.checked;
		if(!flag) flag = treeNode.checked;
		treeObj.updateNode(treeNode);
	}
	return flag;
}
/*
 * 
 */