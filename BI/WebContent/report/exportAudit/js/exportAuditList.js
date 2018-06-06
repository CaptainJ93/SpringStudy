$(function(){
	var options={
			url:"exportAudit!auditlist.action",
			colModel:[
			    {label:"文件编号",name:"exportId",key:true},
			    {label:"所属功能",name:"menuName"},
			    {label:"文件路径",name:"exportPath",hidden:true},
			    {label:"文件名称",name:"exportFileName"},
			    {label:"敏感数据",name:"sensitiveData"},
				{label:"导出人",name:"exportUserName"},
				{label:"导出时间",name:"exportDate"}
			],
			loadonce: false,
			caption:"查询列表",
			searchform: "#exportAuditForm",
			allowOper : {add:false,del:false,update:false,exportexcel:false}
		};
		
		$("#exportAuditTable").hlGrid(options);

		$("#refreshBtn").click(function() {
			$("#exportAuditTable").hlGridRefresh();
		});
		
		$("#resetBtn").click(function(){
			$("#exportAuditForm").clearForm();
		});
		
		$("#auditSuccessBtn").click(function() {
			var selVal = jQuery("#exportAuditTable").jqGrid('getGridParam','selarrrow');
			 if(selVal == "" ){
				alert("请至少选择一条记录!");
				return false;
			 }
			jQuery.ajax({
				type: "GET",
				url: "exportAudit!audit.action",
				data:{"paramMap.exportId":selVal,"paramMap.auditFlag":"0"},
				context:this,
				dataType: "json",
				success: function(data,textStatus) {
					if (data["errCode"]!=undefined && data["errCode"]!=0) {
						if (data["errMsg"]!=undefined) alert("服务端返回错误："+data.errMsg);	
						else alert("服务端返回错误");
						return false;
					}
					$("#exportAuditTable").hlGridRefresh();
			  }
			});
		});
		
		$("#auditFailBtn").click(function() {
			var selVal = jQuery("#exportAuditTable").jqGrid('getGridParam','selarrrow');
			 if(selVal == "" ){
				alert("请选择一条记录!");
				return false;
			 }
			jQuery.ajax({
				type: "GET",
				url: "exportAudit!audit.action",
				data:{"paramMap.exportId":selVal,"paramMap.auditFlag":"1"},
				context:this,
				dataType: "json",
				success: function(data,textStatus) {
					if (data["errCode"]!=undefined && data["errCode"]!=0) {
						if (data["errMsg"]!=undefined) alert("服务端返回错误："+data.errMsg);	
						else alert("服务端返回错误");
						return false;
					}
					$("#exportAuditTable").hlGridRefresh();
			  }
			});
		});

});
