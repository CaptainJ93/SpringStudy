$(function(){
	var options={
			url:"department!list.action",
			colModel:[
			    {label:"部门编号",name:"departmentId",key:true},
				{label:"部门名称",name:"departmentName"},
				{label:"所属部门",name:"departmentPName"},
				{label:"创建人",name:"createdbyname"},
				{label:"创建时间",name:"createDate"},
				{label:"最后修改人",name:"lastmodifybyname"},
				{label:"最后修改时间",name:"lastModifyDate"}
			],
			loadonce: false,
			caption:"查询列表",
			searchform: "#departmentForm",
			addform: "#departmentEditForm",
			updateform: "#departmentEditForm",
			delurl:"department!delete.action",
			editurl:"department!save.action",
			addurl:"department!save.action",
			allowOper : {add:false,del:false,update:false,exportexcel:false}
		};
		
		$("#departmentTable").hlGrid(options);
		
		$("#refreshBtn").click(function() {
			$("#departmentTable").hlGridRefresh();
		});
		
		$("#resetBtn").click(function(){
			var departmentid = $("#departmentEditForm").find("#departmentId").val();
			$("#departmentForm").clearForm();
			$("#departmentEditForm").find("#departmentId").val(departmentid);
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
		var selVal = jQuery("#departmentTable").jqGrid('getGridParam','selarrrow');
		 if(selVal == "" ){
			alert("请选择一条记录!");
			return false;
		 }else if(selVal.length > 1){
			alert("只能选择一条记录！");
			return false;
		 }
		$("#departmentEditForm").resetForm();
		$("#editDiv").dialog("open");
		$("#oper").val("edit");
		var options = ({
			url: "department!edit.action",
			type:"post",
			param:{"paramMap.departmentId":selVal}
		});
		$("#departmentEditForm").ajaxLoad(options);  
	});
		
	/*
	 *删除
	 */	 
	 $("#delBtn").click(function(){
	 	var selVal = jQuery("#departmentTable").jqGrid('getGridParam','selarrrow');
		 if(selVal == "" ){
			alert("请至少选择一条记录!");
			return false;
		 }
		$("#departmentTable").hlGridDelete();
	});
	
	/*
	 *保存编辑信息 
	 */
	$("#saveBtn").click(function() {
		if($("#departmentEditForm").find("#departmentName").val()==null||$("#departmentEditForm").find("#departmentName").val()==""){
			$.messager.alert("操作提示", "部门名称不能为空!");
			$("#departmentEditForm").find("#departmentName").focus();
			return false;
		}
		if($("#oper").val()=="add") {
			$("#departmentTable").hlGridAdd();
		} else if($("#oper").val()=="edit"){
			$("#departmentTable").hlGridUpdate();
		}
		$("#editDiv").dialog("close");
	});
	
	/*
	 * 添加信息
	 */
	$("#addBtn").click(function() {
		$("#departmentEditForm").resetForm();
		$("#editDiv").dialog("open");
		$("#oper").val("add");
	});
	
	/*
	 * 关闭编辑信息
	 */
	$("#closeBtn").click(function() {
		$("#editDiv").dialog("close");
	});
	
	/*
	 * 部门目录选择--查询条件
	 */
	$("#showDeptLBtn").click(function() {
		var setting = {
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
				url:"./zTree!getDepartmentTree.action"
			},
			callback: {
				onClick: onClickL
			}
		};
		var zNodes = [];
		$.fn.zTree.init($("#deptTreeL"), setting, zNodes);
		var Obj = $("#departmentPName");
		var Offset = $("#departmentPName").offset();
		$("#deptContentL").css({left:Offset.left+1 + "px", top:Offset.top + Obj.outerHeight()+1 + "px"}).slideDown("fast");
		$("body").bind("mousedown", onBodyDownL);
	});
	
	function onClickL(e, treeId, treeNode) {
		var zTree = $.fn.zTree.getZTreeObj("deptTreeL"),
		nodes = zTree.getSelectedNodes(),
		id = "";
		name = "";
		nodes.sort(function compare(a,b){return a.id-b.id;});
		for (var i=0, l=nodes.length; i<l; i++) {
			id = nodes[i].id;
			name = nodes[i].name;
		}
		$("#departmentForm").find("#departmentPName").val(name);
		$("#departmentForm").find("#departmentPid").val(id);
		hideDeptL();
	}
	
	function hideDeptL() {
		$("#deptContentL").fadeOut("fast");
		$("body").unbind("mousedown", onBodyDownL);
	}
	function onBodyDownL(event) {
		if (!(event.target.id == "showDeptLBtn" || event.target.id == "deptContentL" || $(event.target).parents("#deptContentL").length>0)) {
			hideDeptL();
		}
	}
	
	$("#clearLBtn").click(function() {
		$("#departmentForm").find("#departmentPName").val("");
		$("#departmentForm").find("#departmentPid").val("");
	});
	
	
	/*
	 * 部门目录选择--添加/修改
	 */
	$("#showDeptBtn").click(function() {
		if($("#oper").val()=="add") {
			$("#departmentEditForm").find("#departmentId").val(null);
		}
		var setting = {
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
				url:"./zTree!getDepartmentTree.action",
				otherParam:{"paramMap.departmentId":$("#departmentEditForm").find("#departmentId").val()}
			},
			callback: {
				onClick: onClick
			}
		};
		var zNodes = [];
		$.fn.zTree.init($("#deptTree"), setting, zNodes);
		var Obj = $("#departmentPName");
		var Offset = $("#departmentPName").offset();
		$("#deptContent").css({left:Offset.left+7 + "px", top:Offset.top + Obj.outerHeight()+6 + "px"}).slideDown("fast");
		$("body").bind("mousedown", onBodyDown);
	});
	
	function onClick(e, treeId, treeNode) {
		var zTree = $.fn.zTree.getZTreeObj("deptTree"),
		nodes = zTree.getSelectedNodes(),
		id = "";
		name = "";
		nodes.sort(function compare(a,b){return a.id-b.id;});
		for (var i=0, l=nodes.length; i<l; i++) {
			id = nodes[i].id;
			name = nodes[i].name;
		}
		$("#departmentEditForm").find("#departmentPName").val(name);
		$("#departmentEditForm").find("#departmentPid").val(id);
		hideDept();
	}
	
	function hideDept() {
		$("#deptContent").fadeOut("fast");
		$("body").unbind("mousedown", onBodyDown);
	}
	function onBodyDown(event) {
		if (!(event.target.id == "showDeptBtn" || event.target.id == "deptContent" || $(event.target).parents("#deptContent").length>0)) {
			hideDept();
		}
	}
	
	$("#clearBtn").click(function() {
		$("#departmentEditForm").find("#departmentPName").val("");
		$("#departmentEditForm").find("#departmentPid").val("");
	});
	
	
});

