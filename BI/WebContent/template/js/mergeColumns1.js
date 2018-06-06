$(function(){
	var options={
			url:"template!getTmpUsers.action?paramMap.type=1",
			colModel:[
				{label:"省",name:"province"},
				{label:"市",name:"city"},
				{label:"地区",name:"country"},
				{label:"会员数",name:"num"}
			],
			loadonce: false,
			caption:"查询列表",
			searchform: "#menuForm",
			addform: "#menuEditForm",
			updateform: "#menuEditForm",
			delurl:"menu!delete.action",
			editurl:"menu!save.action",
			addurl:"menu!save.action",
			multiselect:false,//去掉checkbox
			loadComplete:function() {
				if($("#type").val()==1){
					jQuery("#menuTable").setGridParam().hideCol(["city","country"]);
					$("#menuTable").hlGridAdjustWidth();
				}else if($("#type").val()==2){
					jQuery("#menuTable").setGridParam().showCol("city");
					jQuery("#menuTable").setGridParam().hideCol("country");
					$.tableSpan.table_rowspan("#menuTable",1);
					$("#menuTable").hlGridAdjustWidth();
				}else{
					jQuery("#menuTable").setGridParam().showCol(["city","country"]);
					$.tableSpan.table_rowspan("#menuTable",1);
					$.tableSpan.table_rowspan("#menuTable",2);
					$("#menuTable").hlGridAdjustWidth();
				}
				},//表格加载完毕后调用mergeColumns.js方法，控制需要合并的列
			allowOper : {add:false,del:false,update:false,exportexcel:false}
		};
		
		$("#menuTable").hlGrid(options);
});

function refAll(){
	$("#type").val(1);
	jQuery("#menuTable").setGridParam({url:"template!getTmpUsers.action?paramMap.type=1"}).trigger("reloadGrid");
}

function refProvince(){
	$("#type").val(2);
	jQuery("#menuTable").setGridParam({url:"template!getTmpUsers.action?paramMap.type=2"}).trigger("reloadGrid");
}

function refCity(){
	$("#type").val(3);
	jQuery("#menuTable").setGridParam({url:"template!getTmpUsers.action?paramMap.type=3"}).trigger("reloadGrid");
}



