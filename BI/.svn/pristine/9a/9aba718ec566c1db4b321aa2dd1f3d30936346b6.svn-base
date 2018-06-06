$(function(){
$.getCaches("../cache!getCache.action","EXPORT_AUDIT_STATUS",function(cacheKeys){
	var options={
			url:"exportAudit!list.action",
			colModel:[
			    {label:"文件编号",name:"exportId",key:true},
			    {label:"所属功能",name:"menuName"},
			    {label:"文件路径",name:"exportPath",hidden:true},
			    {label:"文件名称",name:"exportFileName"},
			    {label:"敏感数据",name:"sensitiveData"},
				{label:"导出时间",name:"exportDate"},
				{label:"当前状态",name:"status",hidden:true},
				{label:"当前状态",name:"statusDesc"}
			],
			loadonce: false,
			caption:"查询列表",
			searchform: "#exportAuditForm",
			allowOper : {add:false,del:false,update:false,exportexcel:false}
		};
		
		$("#exportAuditTable").hlGrid(options);
});
		$("#refreshBtn").click(function() {
			$("#exportAuditTable").hlGridRefresh();
		});
		
		$("#resetBtn").click(function(){
			$("#exportAuditForm").clearForm();
		});
		
		$("#downloadBtn").click(function() {
			var selVal = jQuery("#exportAuditTable").jqGrid('getGridParam','selarrrow');
			if(selVal == "" ){
				$.messager.alert("操作提示", "请至少选择一条记录!");
				return false;
			 }else if(selVal.length > 1){
				$.messager.alert("操作提示", "只能选择一条记录！");
				return false;
			 }
			 for(i=0;i<selVal.length;i++){
				 var rowData = $("#exportAuditTable").jqGrid('getRowData',selVal[i]);
				 if(rowData.status != 99){
					 $.messager.alert("提示", "请选择状态为【审核通过】的记录！");
					 return false;
				 }
			 }
			 self.location.href="exportAudit!download.action?paramMap.exportId="+selVal;
		});
});
