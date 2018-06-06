$(function(){
$.getCaches("../cache!getCache.action","SEX,LEVEL",function(cacheKeys){
	$("#templateForm").CascadeSelect({
		//"url": "../cache!getCache.action?paramName=SEX",            //数据源
		"data":cacheKeys["SEX"], //数据源
	    "AllowNull": true,						//是否允许不选
	    "NullName": "请选择",
	    "NullValue": "",
	    "lvcnt": 1,                    			//级联的级数,2为2级联动,3为3级联动,目前只支持3级
	    //"SelectedLevel": 1,
	    "SelectedValue":"",    //初始化的值
	    "lv1k": "VALUE",       				//第一级值   数据库字段名   
	    "lv1v": "NAME",  				//第一级名称 数据库字段名   
	    "lv1sel": "sex",          			//第一级下拉框
	   "lv1filter":"0,1,2"   //选择下拉框要显示的value值
	});
	var options={
			url:"template!list.action",
			exporturl:"template!exportFile.action",
			colModel:[
			    {label:"用户编号",name:"userid",key:true},
				{label:"用户名称",name:"username",hidden:true},
				{label:"性别",name:"sex",hidden:true},
				{label:"性别",name:"sexDes",codename:"sex",codedataobject:cacheKeys["SEX"]},
				{label:"级别",name:"levl",hidden:true},
				{label:"级别",name:"levlDes",codename:"levl",codedataobject:cacheKeys["LEVEL"]}
			],
			postData:{"paramMap.menuId":$("#menuId").val(),"paramMap.menuName":$("#menuName").val()},
			loadonce: false,
			caption:"查询列表",
			searchform: "#templateForm",
			addform: "#templateEditForm",
			updateform: "#templateEditForm",
			delurl:"template!delete.action",
			editurl:"template!save.action",
			addurl:"template!save.action",
			allowOper : {add:false,del:false,update:false,exportexcel:true}
		};
		
		$("#templateTable").hlGrid(options);
		
});
		$("#refreshBtn").click(function() {
			$("#templateTable").hlGridRefresh();
		});
		
		$("#resetBtn").click(function(){
			$("#templateForm").clearForm();
		});
		
		//动态显示对应列
		$("#showPhone").change(function() {
			if (!$("#showPhone").attr("checked")) {
				jQuery("#templateTable").setGridParam().hideCol("username").trigger("reloadGrid");
            }else if($("#showPhone").attr("checked")){
            	jQuery("#templateTable").setGridParam().showCol("username").trigger("reloadGrid");
            }
			setSensitiveDataFlag();
	    });
		
		$("#showIdCard").change(function() {
			if (!$("#showIdCard").attr("checked")) {
				jQuery("#templateTable").setGridParam().hideCol("sex").trigger("reloadGrid");
            }else if($("#showIdCard").attr("checked")){
            	jQuery("#templateTable").setGridParam().showCol("sex").trigger("reloadGrid");
            }
			setSensitiveDataFlag();
	    });
		//设置敏感数据的隐藏信息
		function setSensitiveDataFlag(){
			var flag = "";
			if($("#showPhone").attr("checked")){
				flag = flag + "手机号;";
			}
			if($("#showIdCard").attr("checked")){
				flag = flag + "身份证号";
			}
			$("#sensitiveDataFlag").val(flag);
		}
		
		/*
		$("#showPhone").click(function(){
			if(!$("#showPhone").attr("checked")){
				
			}
			jQuery("#templateTable").setGridParam().showCol("username").trigger("reloadGrid");
		});
		$("#showIdCard").click(function(){
			jQuery("#templateTable").setGridParam().showCol("sex").trigger("reloadGrid");
		});*/

		//编辑框（新增\修改）
	$("#editDiv").dialog({
		autoOpen: false,
		resizable: true,
		height: 400,
		width: 600,
		title: "编辑",
		modal: true
	}).dialog("close");
		
		/*
	 *修改
	 */
	$("#editBtn").click(function() {
		var selVal = jQuery("#templateTable").jqGrid('getGridParam','selarrrow');
		 if(selVal == "" ){
			alert("请选择一条记录!");
			return false;
		 }else if(selVal.length > 1){
			alert("只能选择一条记录！");
			return false;
		 }
		$("#editDiv").dialog("open");
		$("#oper").val("edit");
		var options = ({
			url: "template!edit.action",
			type:"post",
			param:{"paramMap.userid":selVal}
		});
		$("#templateEditForm").ajaxLoad(options);  
	});
		
	/*
	 *删除
	 */	 
	 $("#delBtn").click(function(){
	 	var selVal = jQuery("#templateTable").jqGrid('getGridParam','selarrrow');
		 if(selVal == "" ){
			alert("请至少选择一条记录!");
			return false;
		 }
		$("#templateTable").hlGridDelete();
	});
	
	/*
	 *保存编辑信息 
	 */
	$("#saveBtn").click(function() {
		if($("#oper").val()=="add") {
			$("#templateTable").hlGridAdd();
		} else if($("#oper").val()=="edit"){
			$("#templateTable").hlGridUpdate();
		}
		$("#editDiv").dialog("close");
	});
	
	/*
	 * 添加信息
	 */
	$("#addBtn").click(function() {
		$("#templateEditForm").resetForm();
		$("#editDiv").dialog("open");
		$("#oper").val("add");
	});
	
	/*
	 * 关闭编辑信息
	 */
	$("#closeBtn").click(function() {
		$("#editDiv").dialog("close");
	});
	
	$("#viewDiv").dialog({
		autoOpen: false,
		resizable: true,
		height: 400,
		width: 600,
		title: "编辑",
		modal: true
	}).dialog("close");
	
	/*
	 *查看
	 */
	$("#viewBtn").click(function() {
		var selVal = jQuery("#templateTable").jqGrid('getGridParam','selarrrow');
		 if(selVal == "" ){
			alert("请选择一条记录!");
			return false;
		 }else if(selVal.length > 1){
			alert("只能选择一条记录！");
			return false;
		 }
		$("#viewDiv").dialog("open");
		$("#oper").val("edit");
		var options = ({
			url: "template!edit.action",
			type:"post",
			param:{"paramMap.userid":selVal}
		});
		$("#templateViewForm").ajaxLoad(options);
	});
	
	/*
	 * 关闭查看
	 */
	$("#closeViewBtn").click(function() {
		$("#viewDiv").dialog("close");
	});
	
		
});

