$(function(){
$.getCaches("../cache!getCache.action","USER_STATUS,USER_POST_LEVEL",function(cacheKeys){
	
	var options={
			url:"user!list.action",
			colModel:[
			    {label:"用户编号",name:"userid",key:true},
			    {label:"用户名称",name:"username"},
				{label:"登陆账号名",name:"userloginid"},
				{label:"手机号码",name:"mobileno"},
				{label:"email地址",name:"emailid"},
				{label:"账号启用时间",name:"startdate"},
				{label:"账号结束时间",name:"enddate"},
				{label:"状态",name:"status",hidden:true},
				{label:"状态",name:"statusDes",codename:"status",codedataobject:cacheKeys["USER_STATUS"]},
				{label:"职位级别",name:"postlevel",hidden:true},
				{label:"职位级别",name:"postlevelDes",codename:"postlevel",codedataobject:cacheKeys["USER_POST_LEVEL"]},
				{label:"所属部门编号",name:"departmentid",hidden:true},
			    {label:"所属部门",name:"departmentname"},
				{label:"创建人",name:"createby"},
				{label:"创建时间",name:"createdate"},
				{label:"最后修改人",name:"lastcreateby"},
				{label:"最后修改时间",name:"lastcreatedate"}
			],
			loadonce: false,
			caption:"查询列表",
			searchform: "#userForm",
			addform: "#userEditForm",
			updateform:"#userEditForm",
			delurl:"user!delete.action",
			editurl:"user!save.action",
			addurl:"user!save.action",
			allowOper : {add:false,del:false,update:false,exportexcel:false}
		};
		
		$("#userTable").hlGrid(options);
});
		$("#refreshBtn").click(function() {
			$("#userTable").hlGridRefresh();
		});
		
		$("#resetBtn").click(function(){
			$("#userForm").clearForm();
		});
		
	/*
	 *注销账号
	 */	 
	 $("#unusedBtn").click(function(){
	 	var selVal = jQuery("#userTable").jqGrid('getGridParam','selarrrow');
		  if(selVal == "" ){
			$.messager.alert("操作提示", "请至少选择一条记录!");
			return false;
		 }
		for(i=0;i<selVal.length;i++){
			 var rowData = $("#userTable").jqGrid('getRowData',selVal[i]);
			 
			 if(rowData.status == 2){
				 $.messager.alert("提示", "请选择状态为【正常】或【锁定状态】的记录！");
				 return false;
			 }
		 }
			var options = ({
				url: "user!editStatus.action",
				type:"post",
				param:{"paramMap.userid":selVal,"paramMap.status":"2"},
				success: function(){
						$("#userTable").hlGridRefresh();
						$.messager.alert("操作结果", "操作成功！");
					}
			});
			$("#userForm").ajaxLoad(options); 
		
	});
		
	/*
	 *删除
	 */	 
	 $("#delBtn").click(function(){
	 	var selVal = jQuery("#userTable").jqGrid('getGridParam','selarrrow');
		 if(selVal == "" ){
			$.messager.alert("操作提示", "请至少选择一条记录!");
			return false;
		 }
		$("#userTable").hlGridDelete();
	});
	
	/*
	 * 解锁用户
	 */
	$("#unlockBtn").click(function() {
		var selVal = jQuery("#userTable").jqGrid('getGridParam','selarrrow');
		 if(selVal == "" ){
			$.messager.alert("操作提示", "请选择一条记录!");
			return false;
		 }
		 for(i=0;i<selVal.length;i++){
		 	var rowData = $("#userTable").jqGrid('getRowData',selVal[i]);
		 
			 if(rowData.status != 0){
				 $.messager.alert("提示", "请选择状态为【锁定】的记录！");
				 return false;
			 }
		 }
			var options = ({
				url: "user!editStatus.action",
				type:"post",
				param:{"paramMap.userid":selVal},
				success: function(){
						$("#userTable").hlGridRefresh();
						$.messager.alert("操作结果", "操作成功！");
					}
			});
			$("#userForm").ajaxLoad(options); 
		
	});
	
	
	
	/*
	 * 添加信息
	 */
	$("#addBtn").click(function() {
		$("#userEditForm").resetForm();
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
	 * 编辑框（新增\修改）
	 */
	$("#editDiv").dialog({
		autoOpen: false,
		resizable: true,
		height: 400,
		width: 850,
		title: "编辑",
		modal: true
	}).dialog("close");
	
	
	/*
	 *保存编辑信息 
	*/
	$(".userloginid").blur(function(){
	 	if($("#userEditForm").find("#userloginid").val() == ""){
			$.messager.alert("操作提示", "请输入登陆账户名!");
			return false;
	 	}else if($("#oper").val()=="add" ||(($("#oper").val()=="edit") && ($("#userEditForm").find("#tmpuserloginid").val() != $("#userEditForm").find("#userloginid").val()))){
		 	var userloginVal = $("#userEditForm").find("#userloginid").val();
			var options = ({
				url: "user!checkUserloginid.action",
				type:"post",
				param:{"paramMap.userloginid":userloginVal},
				success:function(data){
							if(data['errCode'] == 1){
								$.messager.alert("操作结果","操作失败原因：" + data['errMsg'], "error");
								}
							}
			});
			$("#userEditForm").ajaxLoad(options);
		}
	}); 
	
	/*
	 *保存编辑信息 
	 */
	$("#saveBtn").click(function() {
		var selVal = $("#userEditForm").find("#userid").val();
	 	var userloginVal = $("#userEditForm").find("#userloginid").val();
	 	
	 	if($("#userEditForm").find("#username").val() == ""){
			$.messager.alert("操作提示", "请输入用户名称!");
			$("#userEditForm").find("#username").focus();
			return false;
	 	}
	 	if($("#userEditForm").find("#userloginid").val() == ""){
			$.messager.alert("操作提示", "请输入登陆账户名!");
			$("#userEditForm").find("#userloginid").focus();
			return false;
	 	}
	 	if($("#userEditForm").find("#mobileno").val() == ""){
			$.messager.alert("操作提示", "请输入手机号!");
			$("#userEditForm").find("#mobileno").focus();
			return false;
	 	}else if(!isMobile($("#userEditForm").find("#mobileno").val())){
			$.messager.alert("操作提示", "请输入正确手机号!");
			$("#userEditForm").find("#mobileno").focus();
			return false;
	 	}
	 	 
	 	if($("#userEditForm").find("#emailid").val() == ""){
			$.messager.alert("操作提示", "请输入电子邮箱!");
			$("#userEditForm").find("#emailid").focus();
			return false;
	 	}else if(!isEmail($("#userEditForm").find("#emailid").val())){
			$.messager.alert("操作提示", "请输入正确的电子邮箱!");
			$("#userEditForm").find("#emailid").focus();
			return false;
	 	}
	 	
	 	if($("#userEditForm").find("#startdate").datebox('getValue') == ""){
			$.messager.alert("操作提示", "请输入账号启用时间!");
			return false;
	 	}
		//账号启用日期必须大于等于当前日期 
//		if(($("#oper").val()=="add") && (!compareDate(setNow(),$("#userEditForm").find("#startdate").datebox('getValue')))){
//		 	$.messager.alert("操作提示", "账号启用时间不得小于当前日期!");
//			return false;
//		}
	 	if($("#userEditForm").find("#enddate").datebox('getValue') == ""){
			$.messager.alert("操作提示", "请输入账号结束日期!");
			return false;
	 	}
//	 	if(!compareDate($("#userEditForm").find("#startdate").datebox('getValue'),$("#userEditForm").find("#enddate").datebox('getValue'))){
//	 		$.messager.alert("操作提示", "账号结束日期不得小于启用时间!");
//	 		return false;
//	 	}
	 	if($("#userEditForm").find("#departmentname").val() == ""){
			$.messager.alert("操作提示", "请选择所属部门!");
			$("#userEditForm").find("#departmentname").focus();
			return false;
	 	}
		if($("#oper").val()=="add") {
				$("#userTable").hlGridAdd();
			} else if($("#oper").val()=="edit"){
				$("#userTable").hlGridUpdate();
			}
			$("#editDiv").dialog("close");	
	});
	
	/*
	 *修改
	 */
	$("#editBtn").click(function() {
		var selVal = jQuery("#userTable").jqGrid('getGridParam','selarrrow');
		 if(selVal == "" ){
			$.messager.alert("操作提示", "请选择一条记录!");
			return false;
		 }else if(selVal.length > 1){
			$.messager.alert("操作提示", "只能选择一条记录!");
			return false;
		 }
		$("#editDiv").dialog("open");
		$("#oper").val("edit");
		$("#userEditForm").find("#eresetBtn").hide();
		var options = ({
			url: "user!edit.action",
			type:"post",
			param:{"paramMap.userid":selVal},
			success:function(data){
						$("#userEditForm").find("#tmpuserloginid").val($("#userEditForm").find("#userloginid").val());
					}
			});
		$("#userEditForm").ajaxLoad(options);  
		
		
	});
	
    //返回当前时间格式为 2014-03-05 14:18:00
    function setNow(){
        var now = new Date();
        var year = now.getFullYear();
        var month = now.getMonth()+1;
        var day = now.getDate();      
        var m_datetime = year+"-"+month+"-"+day+" 00:00:00";
        return m_datetime;
    }
    
	// 校验手机号码：必须以数字开头，除数字外，可含有“-” 
     function isMobile(object){
        var re= /^(1[358][0-9]{9})$/;
        var my = false ;
        if(re.test(object)){
         my = true;
        }
        return my;
       }
       
       
    //JS验证电子邮件
    function isEmail(object){
		var reg = /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
	   	if(object.length<1 ||!reg.test(object)){
		   // alert('请填写正确的邮箱地址');
		    return false;
	    }else{
	    	return true;
	    }
	 }
	 
		$("#userRoleDiv").dialog({
			autoOpen: false,
			resizable: true,
			height: 500,
			width: 950,
			title: "用户角色绑定",
			modal: true
		}).dialog("close");
	 
		$("#showUserRole").click(function(){
			var selVal = jQuery("#userTable").jqGrid('getGridParam','selarrrow');
			 if(selVal == "" ){
				$.messager.alert("操作提示", "请至少选择一条记录!");
				return false;
			 }else if(selVal.length > 1){
				$.messager.alert("操作提示", "只能选择一条记录！");
				return false;
			 }
			 if($("#userRoleForm").find("#userid").val()!=null && $("#userRoleForm").find("#userid").val()!=""){
				$("#userRoleForm").find("#userid").val(selVal);
				$("#userRoleTable").hlGridRefresh();
				$("#userRoleDiv").dialog("open");
			 }else{
			  var options={
						url:"user!listUserRole.action",
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
						postData:{"paramMap.userid":selVal},
						loadonce: false,
						caption:"查询列表",
						searchform: "#userRoleForm",
						allowOper : {add:false,del:false,update:false,exportexcel:false}
					};
				$("#userRoleDiv").dialog("open");
				$("#userRoleTable").hlGridAdjustWidth();
				$("#userRoleTable").hlGrid(options);
				$("#userRoleForm").find("#userid").val(selVal);
			 }
				
		});
		
		 $("#searchUserRoleBtn").click(function() {
				$("#userRoleTable").hlGridRefresh();
		});
		 
		 $("#resetUserRoleBtn").click(function(){
				var userid = $("#userRoleForm").find("#userid").val();
				$("#userRoleForm").clearForm();
				$("#userRoleForm").find("#userid").val(userid);
		 });
		 
		 $("#closeUserRoleDivBtn").click(function(){
				$("#userRoleDiv").dialog("close");
		 });
		 
		/*
		 *删除用户关系
		 */	 
		 $("#delUserRoleBtn").click(function(){
		 	var selVal = jQuery("#userRoleTable").jqGrid('getGridParam','selarrrow');
			 if(selVal == "" ){
				$.messager.alert("操作提示", "请至少选择一条记录!");
				return false;
			 }
			 $.ajax({
				url: "user!deleteUserRole.action",
				type:'post',
				dataType:'json',
				data:{"paramMap.roleid":selVal,"paramMap.userid":$("#userRoleForm").find("#userid").val()},
				success:function(data,status){
						$.messager.alert("操作结果", "操作成功！");
						$("#userRoleTable").hlGridRefresh();
				}
			});
		});
		
		 $("#userRoleSearchDiv").dialog({
				autoOpen: false,
				resizable: true,
				height: 400,
				width: 900,
				title: "角色查询",
				modal: true
			}).dialog("close");
		 
		 $("#addUserRoleBtn").click(function(){
		 
		 	if($("#userRoleSearchForm").find("#userid").val()!= null && $("#userRoleSearchForm").find("#userid").val()!=""){
		 		 $("#userRoleSearchForm").find("#userid").val($("#userRoleForm").find("#userid").val());
				 $("#userRoleSearchTable").hlGridRefresh();
				 $("#userRoleSearchDiv").dialog("open");
		 	}else{
			 	var optionsUserRoleSearch={
						url:"user!listRole.action",
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
						postData:{"paramMap.userid":$("#userRoleForm").find("#userid").val()},
						loadonce: false,
						caption:"查询列表",
						searchform: "#userRoleSearchForm",
						allowOper : {add:false,del:false,update:false,exportexcel:false}
					};
					$("#userRoleSearchDiv").dialog("open");
					$("#userRoleSearchTable").hlGridAdjustWidth();
					$("#userRoleSearchTable").hlGrid(optionsUserRoleSearch);
					$("#userRoleSearchForm").find("#userid").val($("#userRoleForm").find("#userid").val());
		 	}
		 		
				
		 });
		 $("#userRoleSearchBtn").click(function() {
				$("#userRoleSearchTable").hlGridRefresh();
		});
		 
		 $("#resetUserRoleSearchBtn").click(function(){
				var userid = $("#userRoleSearchForm").find("#userid").val();
				$("#userRoleSearchForm").clearForm();
				$("#userRoleSearchForm").find("#userid").val(userid);
		 });
		 
		 $("#closeUserRoleSearchBtn").click(function(){
				$("#userRoleSearchDiv").dialog("close");
		 });
		 
		 $("#saveUserRoleBtn").click(function(){
			 var selVal = jQuery("#userRoleSearchTable").jqGrid('getGridParam','selarrrow');
			 if(selVal == "" ){
				$.messager.alert("操作提示", "请至少选择一条记录!");
				return false;
			 }
			$.ajax({
				url: "user!saveUserRole.action",
				type:'post',
				dataType:'json',
				data:{"paramMap.roleid":selVal,"paramMap.userid":$("#userRoleSearchForm").find("#userid").val()},
				success:function(data,status){
						$.messager.alert("操作结果", "操作成功！");
						$("#userRoleSearchDiv").dialog("close");
						$("#userRoleTable").hlGridRefresh();
				}
			});	
			
		 });
		 
});

