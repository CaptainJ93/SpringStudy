	var setting = {
			view: {
				dblClickExpand: false
			},data: {
				simpleData: {
					enable: true
				}
			}
			,callback:{
				onClick: onClick
			}
		};
		

		var zNodes =[];
		function onClick(e, treeId, treeNode) {
			var zTree = $.fn.zTree.getZTreeObj("treeDemo");
			$("#userEditForm").find("#departmentname").val(treeNode.name);
			$("#userEditForm").find("#departmentid").val(treeNode.id);
			hideMenu();
			return false;
		}

		function showMenu() {
			var cityObj = $("#userEditForm").find("#departmentname");
			var cityOffset = $("#userEditForm").find("#departmentname").position();
 			$("#userEditForm").find("#menuContent").css({left:cityOffset.left + "px", top:cityOffset.top + 6 + "px"}).slideDown("fast");
			$("#userEditForm").bind("mousedown", onBodyDown);
			
			$.getJSON("./zTree!getDepartmentTree.action", initZNodes);
		}
		
		function initZNodes(json){
			zNodes = json;
			$.fn.zTree.init($("#userEditForm").find("#treeDemo"), setting, zNodes);
		}
		
		function hideMenu() {
			$("#userEditForm").find("#menuContent").fadeOut("fast");
			$("#userEditForm").unbind("mousedown", onBodyDown);
		}
		function onBodyDown(event) {
			if (!(event.target.id == "departmentname" || event.target.id == "menuContent" || $(event.target).parents("#menuContent").length>0)) {
				hideMenu();
			}
		}

	var setting1 = {
			view: {
				dblClickExpand: false
			},data: {
				simpleData: {
					enable: true
				}
			}
			,callback:{
				onClick: onClick1
			}
		};
		

		var zNodes1 =[];
		function onClick1(e, treeId, treeNode) {
			var zTree = $.fn.zTree.getZTreeObj("treeDemo1");
			$("#userForm").find("#departmentname").val(treeNode.name);
			$("#userForm").find("#departmentid").val(treeNode.id);
			hideMenu1();
			return false;
		}

		function showMenu1() {
			var cityObj = $("#userForm").find("#departmentname");
			var cityOffset = $("#userForm").find("#departmentname").position();
 			$("#userForm").find("#menuContent").css({left:cityOffset.left + "px", top:cityOffset.top + 6 + "px"}).slideDown("fast");
			$("#userForm").bind("mousedown", onBodyDown1);
			
			$.getJSON("./zTree!getDepartmentTree.action", initZNodes1);
		}
		
		function initZNodes1(json){
			zNodes1 = json;
			$.fn.zTree.init($("#userForm").find("#treeDemo1"), setting1, zNodes1);
		}
		
		function hideMenu1() {
			$("#userForm").find("#menuContent").fadeOut("fast");
			$("#userForm").unbind("mousedown", onBodyDown1);
		}
		function onBodyDown1(event) {
			if (!( event.target.id == "departmentname" || event.target.id == "menuContent" || $(event.target).parents("#menuContent").length>0)) {
				hideMenu1();
			}
		}

			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		