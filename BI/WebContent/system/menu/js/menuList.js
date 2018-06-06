$(function(){
$.getCaches("../cache!getCache.action","MENU_TYPE,MENU_STATUS",function(cacheKeys){
	var options={
			url:"menu!list.action",
			colModel:[
			    {label:"菜单编号",name:"menuid",key:true},
				{label:"菜单名称",name:"menuname"},
				{label:"所属目录",name:"menupname"},
				{label:"菜单类型",name:"menutype",hidden:true},
				{label:"菜单类型",name:"menutypeDes",codename:"menutype",codedataobject:cacheKeys["MENU_TYPE"]},
				{label:"菜单路径",name:"menuurl"},
				{label:"菜单描述",name:"menudesc",hidden:true},
				{label:"状态",name:"status",hidden:true},
				{label:"状态",name:"statusDes",codename:"status",codedataobject:cacheKeys["MENU_STATUS"],hidden:true}
			],
			loadonce: false,
			caption:"查询列表",
			searchform: "#menuForm",
			addform: "#menuEditForm",
			updateform: "#menuEditForm",
			delurl:"menu!delete.action",
			editurl:"menu!save.action",
			addurl:"menu!save.action",
			allowOper : {add:false,del:false,update:false,exportexcel:false}
		};
		
		$("#menuTable").hlGrid(options);
});
		$("#refreshBtn").click(function() {
			$("#menuTable").hlGridRefresh();
		});
		
		$("#resetBtn").click(function(){
			var menuid = $("#menuEditForm").find("#menuid").val();
			$("#menuForm").clearForm();
			$("#menuEditForm").find("#menuid").val(menuid);
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
		var selVal = jQuery("#menuTable").jqGrid('getGridParam','selarrrow');
		 if(selVal == "" ){
			alert("请选择一条记录!");
			return false;
		 }else if(selVal.length > 1){
			alert("只能选择一条记录！");
			return false;
		 }
		$("#menuEditForm").resetForm();
		$("#editDiv").dialog("open");
		$("#oper").val("edit");
		var options = ({
			url: "menu!edit.action",
			type:"post",
			param:{"paramMap.menuid":selVal}
		});
		$("#menuEditForm").ajaxLoad(options);  
	});
		
	/*
	 *删除
	 */	 
	 $("#delBtn").click(function(){
	 	var selVal = jQuery("#menuTable").jqGrid('getGridParam','selarrrow');
		 if(selVal == "" ){
			alert("请至少选择一条记录!");
			return false;
		 }
		$("#menuTable").hlGridDelete();
	});
	
	/*
	 *保存编辑信息 
	 */
	$("#saveBtn").click(function() {
		if($("#menuEditForm").find("#menuname").val()==null||$("#menuEditForm").find("#menuname").val()==""){
			$.messager.alert("操作提示", "菜单名称不能为空!");
			$("#menuEditForm").find("#menuname").focus();
			return false;
		}
		if($("#menuEditForm").find("#menutype").val()==null||$("#menuEditForm").find("#menutype").val()==""){
			$.messager.alert("操作提示", "菜单类型不能为空!");
			$("#menuEditForm").find("#menutype").focus();
			return false;
		}
		if($("#menuEditForm").find("#menutype").val()==null||$("#menuEditForm").find("#status").val()==""){
			$.messager.alert("操作提示", "菜单状态不能为空!");
			$("#menuEditForm").find("#status").focus();
			return false;
		}
		if($("#menuEditForm").find("#menutype").val()=="1"){
			if($("#menuEditForm").find("#menuurl").val()==null||$("#menuEditForm").find("#menuurl").val()==""){
				$.messager.alert("操作提示", "菜单路径不能为空!");
				$("#menuEditForm").find("#menuurl").focus();
				return false;
			}
		}
		if($("#oper").val()=="add") {
			$("#menuTable").hlGridAdd();
		} else if($("#oper").val()=="edit"){
			$("#menuTable").hlGridUpdate();
		}
		$("#editDiv").dialog("close");
	});
	
	/*
	 * 添加信息
	 */
	$("#addBtn").click(function() {
		$("#menuEditForm").resetForm();
		$("#editDiv").dialog("open");
		$("#oper").val("add");
	});
	
	/*
	 * 关闭编辑信息
	 */
	$("#closeBtn").click(function() {
		$("#editDiv").dialog("close");
	});
	
	function onClick(e, treeId, treeNode) {
		var zTree = $.fn.zTree.getZTreeObj("menuTree"),
		nodes = zTree.getSelectedNodes(),
		id = "";
		name = "";
		nodes.sort(function compare(a,b){return a.id-b.id;});
		for (var i=0, l=nodes.length; i<l; i++) {
			id = nodes[i].id;
			name = nodes[i].name;
		}
		$("#menuEditForm").find("#menupname").val(name);
		$("#menuEditForm").find("#menupid").val(id);
		hideMenu();
	}
	
	function hideMenu() {
		$("#menuContent").fadeOut("fast");
		$("body").unbind("mousedown", onBodyDown);
	}
	function onBodyDown(event) {
		if (!(event.target.id == "showMenuBtn" || event.target.id == "menuContent" || $(event.target).parents("#menuContent").length>0)) {
			hideMenu();
		}
	}
	
	function onClickL(e, treeId, treeNode) {
		var zTree = $.fn.zTree.getZTreeObj("menuTreeL"),
		nodes = zTree.getSelectedNodes(),
		id = "";
		name = "";
		nodes.sort(function compare(a,b){return a.id-b.id;});
		for (var i=0, l=nodes.length; i<l; i++) {
			id = nodes[i].id;
			name = nodes[i].name;
		}
		$("#menuForm").find("#menupname").val(name);
		$("#menuForm").find("#menupid").val(id);
		hideMenuL();
	}
	
	function hideMenuL() {
		$("#menuContentL").fadeOut("fast");
		$("body").unbind("mousedown", onBodyDownL);
	}
	function onBodyDownL(event) {
		if (!(event.target.id == "showMenuLBtn" || event.target.id == "menuContentL" || $(event.target).parents("#menuContentL").length>0)) {
			hideMenuL();
		}
	}
	
	/*
	 * 菜单目录选择--查询条件
	 */
	$("#showMenuLBtn").click(function() {
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
				url:"./zTree!getMenuDirectory.action"
			},
			callback: {
				onClick: onClickL
			}
		};
		var zNodes = [];
		$.fn.zTree.init($("#menuTreeL"), setting, zNodes);
		var Obj = $("#menupname");
		var Offset = $("#menupname").offset();
		$("#menuContentL").css({left:Offset.left+1 + "px", top:Offset.top + Obj.outerHeight()+1 + "px"}).slideDown("fast");
		$("body").bind("mousedown", onBodyDownL);
	});
	
	$("#clearLBtn").click(function() {
		$("#menuForm").find("#menupname").val("");
		$("#menuForm").find("#menupid").val("");
	});
	
	/*
	 * 菜单目录选择
	 */
	$("#showMenuBtn").click(function() {
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
				url:"./zTree!getMenuDirectory.action",
				otherParam:{"paramMap.menuid":$("#menuEditForm").find("#menuid").val()}
			},
			callback: {
				onClick: onClick
			}
		};
		var zNodes = [];
		$.fn.zTree.init($("#menuTree"), setting, zNodes);
		var Obj = $("#menupname");
		var Offset = $("#menupname").offset();
		$("#menuContent").css({left:Offset.left+7 + "px", top:Offset.top + Obj.outerHeight()+6 + "px"}).slideDown("fast");
		$("body").bind("mousedown", onBodyDown);
	});
	
	$("#clearBtn").click(function() {
		$("#menuEditForm").find("#menupname").val("");
		$("#menuEditForm").find("#menupid").val("");
	});
});

