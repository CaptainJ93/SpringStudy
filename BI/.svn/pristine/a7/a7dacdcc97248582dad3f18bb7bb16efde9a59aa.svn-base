$(function(){
$.getCaches("../cache!getCache.action","PRIVILEGE_TYPE",function(cacheKeys){
	var options={
			url:"privilege!list.action",
			colModel:[
					    {label:"权限编号",name:"privilegeId",key:true},
					    {label:"模块名称",name:"moduleName"},
					    {label:"模块编码",name:"moduleCode"},
					    {label:"权限名称",name:"privilegeName"},
						{label:"权限编码",name:"privilegeCode"},
						{label:"权限值",name:"privilegeValue"},
						{label:"权限类型",name:"privilegeType",hidden:true},
						{label:"权限类型",name:"privilegeTypeDes",codename:"privilegeType",codedataobject:cacheKeys["PRIVILEGE_TYPE"]},
						{label:"描述",name:"privilegeDesc"}
					],
			loadonce: false,
			caption:"查询列表",
			searchform: "#privilegeForm",
			addform: "#privilegeEditForm",
			updateform: "#privilegeEditForm",
			delurl:"privilege!delete.action",
			editurl:"privilege!save.action",
			addurl:"privilege!save.action",
			allowOper : {add:false,del:false,update:false,exportexcel:false}
		};
		
		$("#privilegeTable").hlGrid(options);
});
		$("#refreshBtn").click(function() {
			$("#privilegeTable").hlGridRefresh();
		});
		
		$("#resetBtn").click(function(){
			var privilegeId = $("#privilegeEditForm").find("#privilegeId").val();
			$("#privilegeForm").clearForm();
			$("#privilegeEditForm").find("#privilegeId").val(privilegeId);
		});

		//编辑框（新增\修改）
	$("#editDiv").dialog({
		autoOpen: false,
		resizable: true,
		height: 300,
		width: 900,
		title: "编辑",
		modal: true
	}).dialog("close");
		
	/*
	 *修改
	 */
	$("#editBtn").click(function() {
		var selVal = jQuery("#privilegeTable").jqGrid('getGridParam','selarrrow');
		 if(selVal == "" ){
			alert("请选择一条记录!");
			return false;
		 }else if(selVal.length > 1){
			alert("只能选择一条记录！");
			return false;
		 }
		$("#privilegeEditForm").resetForm();
		$("#editDiv").dialog("open");
		$("#oper").val("edit");
		var options = ({
			url: "privilege!edit.action",
			type:"post",
			param:{"paramMap.privilegeId":selVal}
		});
		$("#privilegeEditForm").ajaxLoad(options);  
	});
		
	/*
	 *删除
	 */	 
	 $("#delBtn").click(function(){
	 	var selVal = jQuery("#privilegeTable").jqGrid('getGridParam','selarrrow');
		 if(selVal == "" ){
			alert("请至少选择一条记录!");
			return false;
		 }
		$("#privilegeTable").hlGridDelete();
	});
	
	/*
	 *保存编辑信息 
	 */
	$("#saveBtn").click(function() {
		if($("#privilegeEditForm").find("#moduleName").val()==null||$("#privilegeEditForm").find("#moduleName").val()==""){
			$.messager.alert("操作提示", "模块名称不能为空!");
			return false;
		}
		if($("#privilegeEditForm").find("#moduleCode").val()==null||$("#privilegeEditForm").find("#moduleCode").val()==""){
			$.messager.alert("操作提示", "模块编码不能为空!");
			return false;
		}
		if($("#privilegeEditForm").find("#privilegeName").val()==null||$("#privilegeEditForm").find("#privilegeName").val()==""){
			$.messager.alert("操作提示", "权限名称不能为空!");
			return false;
		}
		if($("#privilegeEditForm").find("#privilegeCode").val()==null||$("#privilegeEditForm").find("#privilegeCode").val()==""){
			$.messager.alert("操作提示", "权限编码不能为空!");
			return false;
		}
		if($("#privilegeEditForm").find("#privilegeValue").val()==null||$("#privilegeEditForm").find("#privilegeValue").val()==""){
			$.messager.alert("操作提示", "权限值不能为空!");
			return false;
		}
		if($("#privilegeEditForm").find("#privilegeType").val()==null||$("#privilegeEditForm").find("#privilegeType").val()==""){
			$.messager.alert("操作提示", "权限类型不能为空!");
			return false;
		}
		if($("#oper").val()=="add") {
			$("#privilegeTable").hlGridAdd();
		} else if($("#oper").val()=="edit"){
			$("#privilegeTable").hlGridUpdate();
		}
		$("#editDiv").dialog("close");
	});
	
	/*
	 * 添加信息
	 */
	$("#addBtn").click(function() {
		$("#privilegeEditForm").resetForm();
		$("#editDiv").dialog("open");
		$("#oper").val("add");
	});
	
	/*
	 * 关闭编辑信息
	 */
	$("#closeBtn").click(function() {
		$("#editDiv").dialog("close");
	});
	
});

