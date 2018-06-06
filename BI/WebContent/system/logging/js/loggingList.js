$(function(){
$.getCaches("../cache!getCache.action","BUSI_LOG_TYPE",function(cacheKeys){
	var options={
			url:"logging!list.action",
			colModel:[
			    {label:"日志id",name:"logId",key:true},
			    {label:"操作员编号",name:"userId"},
				{label:"操作员名称",name:"userName"},
				{label:"主机名称",name:"hostName"},
				{label:"主机IP",name:"hostIp"},
				{label:"菜单编号",name:"menuId"},
				{label:"菜单名称",name:"menuName"},
				{label:"业务描述",name:"busiDesc"},
				{label:"查询条件",name:"queryCondition"},
				{label:"执行SQL",name:"sql"},
				{label:"敏感数据",name:"sensitiveData"},
				{label:"类型",name:"logType",hidden:true},
				{label:"类型",name:"logTypeDes",codename:"logType",codedataobject:cacheKeys["BUSI_LOG_TYPE"]},
				{label:"创建时间",name:"createDate"},
				{label:"备注",name:"remark"}
			],
			loadonce: false,
			caption:"查询列表",
			searchform: "#loggingForm",
			allowOper : {add:false,del:false,update:false,exportexcel:false}
		};
		
		$("#loggingTable").hlGrid(options);
});
		$("#refreshBtn").click(function() {
			$("#loggingTable").hlGridRefresh();
		});
		
		$("#resetBtn").click(function(){
			$("#loggingForm").clearForm();
			$("#ChangeSensitiveData").val(null);
		});
		
		$("#ChangeSensitiveData").change(function() {
			if (!$("#ChangeSensitiveData").attr("checked")) {
				$("#ChangeSensitiveData").val(null);
            }else if($("#ChangeSensitiveData").attr("checked")){
            	$("#ChangeSensitiveData").val("true");
            }
	    });

});
