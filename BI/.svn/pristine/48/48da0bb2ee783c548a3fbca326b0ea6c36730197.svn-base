$(function(){
	var options={
			url:"role!list.action",
			colModel:[
			    {label:"角色编号",name:"roleid",key:true},
			    {label:"角色名称",name:"rolename"},
			    {label:"角色描述",name:"roledesc"},
			    {label:"创建人编号",name:"createdby",hidden:true},
				{label:"创建人",name:"createdbyname"},
				{label:"创建日期",name:"createdtimestamp"},
				{label:"最后修改人编号",name:"lastmodifiedby",hidden:true},
				{label:"最后修改人",name:"lastmodifiedbyname"},
				{label:"最后修改日期",name:"lastmodifiedtimestamp"}
			],
			loadonce: false,
			caption:"查询列表",
			searchform: "#roleForm",
			addform: "#roleEditForm",
			updateform: "#roleEditForm",
			delurl:"role!delete.action",
			editurl:"role!save.action",
			addurl:"role!save.action",
			allowOper : {add:false,del:false,update:false,exportexcel:false}
		};
		$("#roleTable").hlGrid(options);

		$("#refreshBtn").click(function() {
			$("#roleTable").hlGridRefresh();
		});
		
		$("#resetBtn").click(function(){
			var oper = $("#roleEditForm").find("#oper").val();
			var roleid = $("#roleEditForm").find("#roleid").val();
			$("#roleForm").clearForm();
			$("#roleEditForm").find("#oper").val(oper);
			$("#roleEditForm").find("#roleid").val(roleid);
		});
		
		//编辑框（新增\修改）
		$("#editDiv").dialog({
			autoOpen: false,
			resizable: true,
			height: 200,
			width: 400,
			title: "编辑",
			modal: true
		}).dialog("close");
		
		/*
		 *修改
		 */
		$("#editBtn").click(function() {
			var selVal = jQuery("#roleTable").jqGrid('getGridParam','selarrrow');
			 if(selVal == "" ){
				$.messager.alert("操作提示", "请至少选择一条记录!");
				return false;
			 }else if(selVal.length > 1){
				$.messager.alert("操作提示", "只能选择一条记录！");
				return false;
			 }
			$("#editDiv").dialog("open");
			$("#oper").val("edit");
			var options = ({
				url: "role!edit.action",
				type:"post",
				param:{"paramMap.roleid":selVal}
			});
			$("#roleEditForm").ajaxLoad(options);  
		});
		
		/*
		 *删除
		 */	 
		 $("#delBtn").click(function(){
		 	var selVal = jQuery("#roleTable").jqGrid('getGridParam','selarrrow');
			 if(selVal == "" ){
				$.messager.alert("操作提示", "请至少选择一条记录!");
				return false;
			 }
			$("#roleTable").hlGridDelete();
		});
		 
		 /*
		 *保存编辑信息 
		 */
		$("#saveBtn").click(function() {
			if($("#roleEditForm").find("#rolename").val()==null||$("#roleEditForm").find("#rolename").val()==""){
				$.messager.alert("操作提示", "角色名称不能为空!");
				$("#roleEditForm").find("#rolename").focus();
				return false;
			}
			if($("#oper").val()=="add") {
				$("#roleTable").hlGridAdd();
			} else if($("#oper").val()=="edit"){
				$("#roleTable").hlGridUpdate();
			}
			$("#editDiv").dialog("close");
		});
		
		/*
		 * 添加信息
		 */
		$("#addBtn").click(function() {
			$("#roleEditForm").resetForm();
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
		 * 菜单与角色绑定begin
		 */
		//编辑框（新增\修改）
		$("#menuDiv").dialog({
			autoOpen: false,
			resizable: true,
			height: 500,
			width: 600,
			title: "菜单导航树",
			modal: true
		}).dialog("close");
		
		$("#showMenuTree").click(function() {
			var selVal = jQuery("#roleTable").jqGrid('getGridParam','selarrrow');
			 if(selVal == "" ){
				$.messager.alert("操作提示", "请至少选择一条记录!");
				return false;
			 }else if(selVal.length > 1){
				alert("只能选择一条记录！");
				$.messager.alert("操作提示", "只能选择一条记录！");
				return false;
			 }
			 var zNodes = [];
			var setting = {
				check: {
					enable: true
				},
				data: {
					simpleData: {
						enable: true
					}
				},
				async: {
					enable: true,
					url:"./zTree!getMenuTree.action",
					otherParam:{"paramMap.roleid":selVal}
				}
			};
			$("#menuTreeForm").find("#roleid").val(selVal);
			$.fn.zTree.init($("#menuTree"), setting, zNodes);
			$("#menuDiv").dialog("open");
		});
			
		$("#closeMenuDivBtn").click(function() {
			$("#menuDiv").dialog("close");
		});
		//点击保存，将菜单与角色绑定
		$("#saveMenuBtn").click(function() {
			var zTree = $.fn.zTree.getZTreeObj("menuTree"),
			nodes = zTree.getCheckedNodes(true),
			v = "";
			for (var i=0, l=nodes.length; i<l; i++) {
				v += nodes[i].id + ",";
			}
			if (v.length > 0 ) v = v.substring(0, v.length-1);
			
			$.ajax({
				url: "role!saveRoleMenu.action",
				type:'post',
				dataType:'json',
				data:{"paramMap.roleid":$("#menuTreeForm").find("#roleid").val(),"paramMap.menuid":v},
				success:function(data,status){
						$.messager.alert("操作结果", "操作成功！");
						$("#menuDiv").dialog("close");
				}
			});	
			
		});
		
		/*
		 * 菜单与角色绑定end
		 */
		/*
		 * 权限与角色绑定begin
		 */
		$.getCaches("../cache!getCache.action","PRIVILEGE_TYPE",function(cacheKeys){
			$("#privilegeForm").CascadeSelect({
				"data":cacheKeys["PRIVILEGE_TYPE"], //数据源
			    "AllowNull": true,						//是否允许不选
			    "NullName": "请选择",
			    "NullValue": "",
			    "lvcnt": 1,                    			//级联的级数,2为2级联动,3为3级联动,目前只支持3级
			    "SelectedValue":"",    //初始化的值
			    "lv1k": "VALUE",       				//第一级值   数据库字段名   
			    "lv1v": "NAME",  				//第一级名称 数据库字段名   
			    "lv1sel": "privilegeType"          			//第一级下拉框
			});
			$("#privilegeSerachForm").CascadeSelect({
				"data":cacheKeys["PRIVILEGE_TYPE"], //数据源
			    "AllowNull": true,						//是否允许不选
			    "NullName": "请选择",
			    "NullValue": "",
			    "lvcnt": 1,                    			//级联的级数,2为2级联动,3为3级联动,目前只支持3级
			    "SelectedValue":"",    //初始化的值
			    "lv1k": "VALUE",       				//第一级值   数据库字段名   
			    "lv1v": "NAME",  				//第一级名称 数据库字段名   
			    "lv1sel": "privilegeType"          			//第一级下拉框
			});
		});
		$("#privilegeDiv").dialog({
			autoOpen: false,
			resizable: true,
			height: 500,
			width: 1000,
			title: "角色权限关系",
			modal: true
		}).dialog("close");
		
		$("#showPrivilege").click(function(){
			var selVal = jQuery("#roleTable").jqGrid('getGridParam','selarrrow');
			 if(selVal == "" ){
				$.messager.alert("操作提示", "请至少选择一条记录!");
				return false;
			 }else if(selVal.length > 1){
				$.messager.alert("操作提示", "只能选择一条记录！");
				return false;
			 }
			 if($("#privilegeForm").find("#roleid").val()!=null&&$("#privilegeForm").find("#roleid").val()!=""){
				 $("#privilegeForm").find("#roleid").val(selVal);
				 $("#privilegeTable").hlGridRefresh();
				 $("#privilegeDiv").dialog("open");
			 }else{
				 $.getCaches("../cache!getCache.action","PRIVILEGE_TYPE",function(cacheKeys){
						var optionsPrivilege={
								url:"role!listPrivilege.action",
								colModel:[
								    {label:"编号",name:"roleSourceId",key:true,hidden:true},
								    {label:"角色id",name:"roleId",hidden:true},
								    {label:"所属角色名称",name:"roleName"},
								    {label:"权限编号",name:"privilegeId"},
								    {label:"模块名称",name:"moduleName"},
								    {label:"模块编码",name:"moduleCode"},
								    {label:"权限名称",name:"privilegeName"},
									{label:"权限编码",name:"privilegeCode"},
									{label:"权限值",name:"privilegeValue"},
									{label:"描述",name:"privilegeDesc"},
									{label:"权限类型",name:"privilegeType",hidden:true},
									{label:"权限类型",name:"privilegeTypeDes",codename:"privilegeType",codedataobject:cacheKeys["PRIVILEGE_TYPE"]}
								],
								postData:{"paramMap.roleid":selVal},
								loadonce: false,
								caption:"查询列表",
								searchform: "#privilegeForm",
								delurl:"role!deleteRolePrivilege.action",
								allowOper : {add:false,del:false,update:false,exportexcel:false}
							};
						$("#privilegeDiv").dialog("open");
						$("#privilegeTable").hlGridAdjustWidth();
						$("#privilegeTable").hlGrid(optionsPrivilege);
						$("#privilegeForm").find("#roleid").val(selVal);
					}); 
			 }
		});
		
		$("#refreshPrivilegeBtn").click(function() {
			$("#privilegeTable").hlGridRefresh();
		});
		
		$("#resetPrivilegeBtn").click(function(){
			var roleid = $("#privilegeForm").find("#roleid").val();
			$("#roleForm").clearForm();
			$("#privilegeForm").find("#roleid").val(roleid);
		});
		
		$("#closePrivilegeDivBtn").click(function(){
			$("#privilegeDiv").dialog("close");
		});
		
		/*
		 *删除角色权限关系
		 */	 
		 $("#delPrivilegeBtn").click(function(){
		 	var selVal = jQuery("#privilegeTable").jqGrid('getGridParam','selarrrow');
			 if(selVal == "" ){
				$.messager.alert("操作提示", "请至少选择一条记录!");
				return false;
			 }
			$("#privilegeTable").hlGridDelete();
		});
		 
		 $("#privilegeSerachDiv").dialog({
				autoOpen: false,
				resizable: true,
				height: 400,
				width: 900,
				title: "权限查询",
				modal: true
			}).dialog("close");
		 
		 $("#addPrivilegeBtn").click(function(){
				 if($("#privilegeSerachForm").find("#noroleid").val()!=null&&$("#privilegeSerachForm").find("#noroleid").val()!=""){
					 $("#privilegeSerachForm").find("#noroleid").val($("#privilegeForm").find("#roleid").val());
					 $("#privilegeSerachTable").hlGridRefresh();
					 $("#privilegeSerachDiv").dialog("open");
				 }else{
					 $.getCaches("../cache!getCache.action","PRIVILEGE_TYPE",function(cacheKeys){
							var optionsPrivilege={
									url:"privilege!list.action",
									colModel:[
									    {label:"权限编号",name:"privilegeId",key:true},
									    {label:"模块名称",name:"moduleName"},
									    {label:"模块编码",name:"moduleCode"},
									    {label:"权限名称",name:"privilegeName"},
										{label:"权限编码",name:"privilegeCode"},
										{label:"权限值",name:"privilegeValue"},
										{label:"描述",name:"privilegeDesc"},
										{label:"权限类型",name:"privilegeType",hidden:true},
										{label:"权限类型",name:"privilegeTypeDes",codename:"privilegeType",codedataobject:cacheKeys["PRIVILEGE_TYPE"]}
									],
									postData:{"paramMap.noroleid":$("#privilegeForm").find("#roleid").val()},
									loadonce: false,
									caption:"查询列表",
									searchform: "#privilegeSerachForm",
									allowOper : {add:false,del:false,update:false,exportexcel:false}
								};
							
							$("#privilegeSerachDiv").dialog("open");
							$("#privilegeSerachTable").hlGridAdjustWidth();
							$("#privilegeSerachTable").hlGrid(optionsPrivilege);
							$("#privilegeSerachForm").find("#noroleid").val($("#privilegeForm").find("#roleid").val());
						}); 
				 }
			});
		 
		 $("#refreshPrivilegeSerachBtn").click(function() {
				$("#privilegeSerachTable").hlGridRefresh();
			});
		 
		 $("#resetPrivilegeSerachBtn").click(function(){
				var roleid = $("#privilegeSerachForm").find("#noroleid").val();
				$("#roleForm").clearForm();
				$("#privilegeSerachForm").find("#noroleid").val(roleid);
			});
		 
		 $("#closePrivilegeDivSerachBtn").click(function(){
				$("#privilegeSerachDiv").dialog("close");
			});
		 
		 $("#savePrivilegeBtn").click(function() {
			 var selVal = jQuery("#privilegeSerachTable").jqGrid('getGridParam','selarrrow');
			 if(selVal == "" ){
				$.messager.alert("操作提示", "请至少选择一条记录!");
				return false;
			 }
			$.ajax({
				url: "role!saveRolePrivilege.action",
				type:'post',
				dataType:'json',
				data:{"paramMap.privilegeId":selVal,"paramMap.roleid":$("#privilegeSerachForm").find("#noroleid").val()},
				success:function(data,status){
						$.messager.alert("操作结果", "操作成功！");
						$("#privilegeSerachDiv").dialog("close");
						$("#privilegeTable").hlGridRefresh();
				}
			});	
				
			});
		 
		 /*
		 * 权限与角色绑定end
		 */	
});

