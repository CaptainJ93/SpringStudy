$(function(){
	$.getCaches("../cache!getCache.action","SEX",function(cacheKeys){ 
		var options={
				url:"logging!list.action",
				colModel:[
				    {label:"日志id",name:"logId",key:true},
				    {label:"操作员编号",name:"userId"}
				],
				loadonce: false,
				caption:"查询列表",
				searchform: "#loggingForm",
				allowOper : {add:false,del:false,update:false,exportexcel:false}
			};
		
		/*
		 * 注意：此部分必须在初始化之内
		 * 会员级别树选择 begin
		 */
		var lvl = {
				check: {
					enable: true,
					chkboxType: { "Y" : "ps", "N" : "ps" }
				},
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
					url:"./query!queryMemberShipLevel.action"
				},
				callback: {
					beforeClick: beforeClickLvl,
					onCheck: onCheckLvl
				}
			};
		$.fn.zTree.init($("#levelTree"), lvl, null);
		
		$("#clearLevel").click(function() {
			$("#queryForm").find("#membershiplevelname").val("");
			$("#queryForm").find("#membershiplevelid").val("");
			var zTree = $.fn.zTree.getZTreeObj("levelTree");
			zTree.checkAllNodes(false);//同时将全部节点设置为非选中状态
		});
		/*
		 * 会员级别树选择 end
		 */
		
		/*
		 * 销退主因树选择 begin
		 */
		var returnReason = {
				check: {
					enable: true,
					chkboxType: { "Y" : "ps", "N" : "ps" }
				},
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
					url:"./query!queryDomainData.action",
					otherParam:{"paramMap.domainname":"RETURNREASON"}
				},
				callback: {
					beforeClick: beforeClickReturnReason,
					onCheck: onCheckReturnReason
				}
			};
		$.fn.zTree.init($("#returnReasonTree"), returnReason, null);
		
		$("#clearReturnReason").click(function() {
			$("#queryForm").find("#returnReasonName").val("");
			$("#queryForm").find("#returnReasonId").val("");
			var zTree = $.fn.zTree.getZTreeObj("returnReasonTree");
			zTree.checkAllNodes(false);//同时将全部节点设置为非选中状态
		});
		/*
		 * 销退主因树选择 end
		 */
		
		/*
		 * 客诉主因树选择 begin
		 */
		var complaintCategory = {
				check: {
					enable: true,
					chkboxType: { "Y" : "ps", "N" : "ps" }
				},
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
					url:"./query!queryComplaintCategory.action",
				},
				callback: {
					beforeClick: beforeClickComplaintCategory,
					onCheck: onCheckComplaintCategory,
				}
			};
		$.fn.zTree.init($("#complaintCategoryTree"), complaintCategory, null);
		
		$("#clearComplaintCategory").click(function() {
			$("#queryForm").find("#complaintCategoryName").val("");
			$("#queryForm").find("#complaintCategoryId").val("");
			var zTree = $.fn.zTree.getZTreeObj("complaintCategoryTree");
			zTree.checkAllNodes(false);//同时将全部节点设置为非选中状态
		});
		/*
		 * 客诉主因树选择 end
		 */
		
	});
});

/*
 * 注意：此部分必须在初始化之外
 * 会员级别树选择 begin
 */
function showLevel(){
	var Obj = $("#membershiplevelname");
	var Offset = $("#membershiplevelname").offset();
	$("#levelContent").css({left:Offset.left + "px", top:Offset.top + Obj.outerHeight() + "px"}).slideDown("fast");
	$("body").bind("mousedown", onBodyDownLvl);
}

function beforeClickLvl(treeId, treeNode) {
	var zTree = $.fn.zTree.getZTreeObj("levelTree");
	zTree.checkNode(treeNode, !treeNode.checked, null, true);
	return false;
}

function onCheckLvl(e, treeId, treeNode) {
	var zTree = $.fn.zTree.getZTreeObj("levelTree"),
	nodes = zTree.getCheckedNodes(true),
	name = "";
	id = "";
	for (var i=0, l=nodes.length; i<l; i++) {
		if(nodes[i] && !nodes[i].isParent){
			name += nodes[i].name + ",";
			id += nodes[i].id + ",";
		}
	}
	if (name.length > 0 ) name = name.substring(0, name.length-1);
	if (id.length > 0 ) id = id.substring(0, id.length-1);
	$("#queryForm").find("#membershiplevelname").val(name);
	$("#queryForm").find("#membershiplevelid").val(id);
}

function hideLvl() {
	$("#levelContent").fadeOut("fast");
	$("body").unbind("mousedown", onBodyDownLvl);
}
function onBodyDownLvl(event) {
	if (!(event.target.id == "membershiplevelname" || event.target.id == "levelContent" || $(event.target).parents("#levelContent").length>0)) {
		hideLvl();
	}
}
/*
 * 会员级别树选择 end
 */

/*
 * 销退主因树选择 begin
 */
function showReturnReason(){
	var Obj = $("#returnReasonName");
	var Offset = $("#returnReasonName").offset();
	$("#returnReasonContent").css({left:Offset.left + "px", top:Offset.top + Obj.outerHeight() + "px"}).slideDown("fast");
	$("body").bind("mousedown", onBodyDownReturnReason);
}

function beforeClickReturnReason(treeId, treeNode) {
	var zTree = $.fn.zTree.getZTreeObj("returnReasonTree");
	zTree.checkNode(treeNode, !treeNode.checked, null, true);
	return false;
}

function onCheckReturnReason(e, treeId, treeNode) {
	var zTree = $.fn.zTree.getZTreeObj("returnReasonTree"),
	nodes = zTree.getCheckedNodes(true),
	name = "";
	id = "";
	for (var i=0, l=nodes.length; i<l; i++) {
		if(nodes[i] && !nodes[i].isParent){
			name += nodes[i].name + ",";
			id += nodes[i].id + ",";
		}
	}
	if (name.length > 0 ) name = name.substring(0, name.length-1);
	if (id.length > 0 ) id = id.substring(0, id.length-1);
	$("#queryForm").find("#returnReasonName").val(name);
	$("#queryForm").find("#returnReasonId").val(id);
}

function hideReturnReason() {
	$("#returnReasonContent").fadeOut("fast");
	$("body").unbind("mousedown", onBodyDownReturnReason);
}
function onBodyDownReturnReason(event) {
	if (!(event.target.id == "returnReasonName" || event.target.id == "returnReasonContent" || $(event.target).parents("#returnReasonContent").length>0)) {
		hideReturnReason();
	}
}
/*
 * 销退主因树选择 end
 */

/*
 * 客诉主因树选择 begin
 */
function showComplaintCategory(){
	var Obj = $("#complaintCategoryName");
	var Offset = $("#complaintCategoryName").offset();
	$("#complaintCategoryContent").css({left:Offset.left + "px", top:Offset.top + Obj.outerHeight() + "px"}).slideDown("fast");
	$("body").bind("mousedown", onBodyDownComplaintCategory);
}

function beforeClickComplaintCategory(treeId, treeNode) {
	var zTree = $.fn.zTree.getZTreeObj("complaintCategoryTree");
	zTree.checkNode(treeNode, !treeNode.checked, null, true);
	return false;
}

function onCheckComplaintCategory(e, treeId, treeNode) {
	var zTree = $.fn.zTree.getZTreeObj("complaintCategoryTree"),
	nodes = zTree.getCheckedNodes(true),
	name = "";
	id = "";
	for (var i=0, l=nodes.length; i<l; i++) {
		if(nodes[i] && !nodes[i].isParent){
			name += nodes[i].name + ",";
			id += nodes[i].id + ",";
		}
	}
	if (name.length > 0 ) name = name.substring(0, name.length-1);
	if (id.length > 0 ) id = id.substring(0, id.length-1);
	$("#queryForm").find("#complaintCategoryName").val(name);
	$("#queryForm").find("#complaintCategoryId").val(id);
}

function hideComplaintCategory() {
	$("#complaintCategoryContent").fadeOut("fast");
	$("body").unbind("mousedown", onBodyDownComplaintCategory);
}
function onBodyDownComplaintCategory(event) {
	if (!(event.target.id == "complaintCategoryName" || event.target.id == "complaintCategoryContent" || $(event.target).parents("#complaintCategoryContent").length>0)) {
		hideComplaintCategory();
	}
}
/*
 * 客诉主因树选择 end
 */

