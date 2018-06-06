var setting = {
	data: {
		simpleData: {
		enable: true
		// idKey:"id",
		// pIdKey:"pId",
		}
	}
	,async: {
		enable: true,
		url:"./zTree!treeInfos.action",
		autoParam:["id", "name"],
		otherParam:{"otherParam":"zTreeAsyncTest"},
		// dataType: "text",//默认text
		// type:"get",//默认post
		dataFilter: filter //异步返回后经过Filter
	}
	,callback:{
		// beforeAsync: zTreeBeforeAsync, // 异步加载事件之前得到相应信息
		asyncSuccess: zTreeOnAsyncSuccess,//异步加载成功的fun
		asyncError: zTreeOnAsyncError, //加载错误的fun
		beforeClick:beforeClick //捕获单击节点之前的事件回调函数
	}
};
//treeId是treeDemo
function filter(treeId, parentNode, childNodes) {
	if (!childNodes) return null;
	for (var i=0, l=childNodes.length; i<l; i++) {
		childNodes[i].name = childNodes[i].name.replace('','');
	}
	return childNodes;
}

function zTreeOnAsyncSuccess(event, treeId, treeNode, msg){

}
function zTreeOnAsyncError(event, treeId, treeNode){
	alert("异步加载失败!");
}
var tabpanel;
function beforeClick(treeId,treeNode){
	if(!treeNode.isParent){
		if(!tabpanel||$("#tab").html()==""){
			tabpanel = new TabPanel({  
		        renderTo:'tab',
		        width:'100%',
		        height:'100%',
		        border:'none',  
		        active : 0,
		        maxLength : 10,
		        items : [
					{id:"tabMenu"+treeNode.id,title:treeNode.name,html:'<iframe src="'+treeNode.menuURL+'" width="100%" height="98%" frameborder="0" class="iframe" ></iframe>',closable: true}
					]
		    });
		}else{
			tabpanel.addTab({
				   id: "tabMenu"+treeNode.id, 
				   title: treeNode.name,
				   html:'<iframe src="'+treeNode.menuURL+'" width="100%" height="98%" frameborder="0" class="iframe" style="overflow-y:hidden"></iframe>',
				   closable:true
				}); 
		}
	}
}

/***********************当你点击父节点是,会异步访问servlet,把id传过去*****************************/
var zNodes=[];
$(document).ready(function(){
	$.fn.zTree.init($("#treeDemo"), setting, zNodes);
}); 


$(function(){
	$("#passwordDialog").dialog({
		autoOpen : false,
		resizable : true,
		height : 200,
		width : 400,
		title : "密码修改",
		modal : true
	}).dialog("close");

	$("#closeBtn").click(function() {		
		$("#passwordDialog").dialog("close");
	});
	
	$("#changePassword").click(function() {	
		var passwordVal = $("#passwordForm").find("#password").val();
	 	var newpasswordVal = $("#passwordForm").find("#newpassword").val();
	 	var confirmpasswordVal = $("#passwordForm").find("#confirmpassword").val();
	 	if(passwordVal == ""){
			$.messager.alert("提示", "请输入原密码!");
			return false;
		}
		
		if(newpasswordVal == ""){
			$.messager.alert("提示", "请输入新密码!");
			return false;
		}
		 if(confirmpasswordVal == ""){
			$.messager.alert("提示", "请输入新密码的确认密码!");
			return false;
		}
		if(confirmpasswordVal != newpasswordVal){
			$.messager.alert("提示", "确认密码与新密码不一致，请重新输入!");
			return false;
		}
		if(Evaluate(newpasswordVal, {
		     minlength: 6,                                    //要限定的最小长度
		     maxlength: 16,									//要限定的最大长度
		     count: 2,                                     //复杂度，至少要两种混合
		     eye: true,                                   //是否大小写敏感
		     msgLengthMin: "密码长度不能少于6位！",   //密码过短时的提示
		     msgLengthMax: "密码长度不能多于16位！",   //密码过长时的提示
		     msgCount: "密码至少包含数字、字母(区分大小写)、特殊符号中的2种！",    //密码种类太少的提示
		     fun: $.messager.alert                                    //要调用的提示函数，可以是 alert console.log function(xx){xxx}
		})){
			var options = ({
				url: "login!editPwd.action",
				type:"post",
				param:{"paramMap.password":passwordVal,"paramMap.newpassword":newpasswordVal,"paramMap.confirmpassword":confirmpasswordVal},
				success:function(data){
								$.messager.alert("提示","操作结果：" + data['errMsg']);
								if(data['errCode'] == 0){
									$("#passwordForm").clearForm();
									$("#closeBtn").attr("disabled",false);
									$("#passwordDialog").dialog("close");
								}
								
							}
			});
			$("#passwordForm").ajaxLoad(options);
		}
	});
});

function Evaluate(word, config){
    var conf = config || {};
    var min = conf.minlength || 8;                                                //默认判断长度8
    var max = conf.maxlength || 16;                                                //默认判断长度16
    var cont = conf.count || 2;                                           //默认复杂度2种
    var key = conf.eye || false;                                          //默认大小写不敏感
    var msgLengthMin = conf.msgLengthMin || "密码过短!";        //默认密码过短提示
    var msgLengthMax = conf.msgLengthMax || "密码过长!";        //默认密码过短提示
    var msgCount = conf.msgCount || "种类太少!";           //默认种类不够提示
    var msg = conf.fun || _msg;                                         //默认消息提示空函数
    
    if(word.length < min){
        msg("操作提示",msgLengthMin);
        return false;
    }else if(word.length > max){
    	msg("操作提示",msgLengthMax);
        return false;
    }else{
        var check = 0;
        if(key){
            check = word.match(/[a-z](?![^a-z]*[a-z])|[A-Z](?![^A-Z]*[A-Z])|\d(?![^\d]*\d)|[^a-zA-Z\d](?![a-zA-Z\d]*[^a-zA-Z\d])/g).length;
        }else{
            check = word.match(/[a-zA-Z](?![^a-zA-Z]*[a-zA-Z])|\d(?![^\d]*\d)|[^a-zA-Z\d](?![a-zA-Z\d]*[^a-zA-Z\d])/g).length;
        }
        if(check < cont){
            msg("操作提示",msgCount);
            return false;
        }
    }
    return true;
}
/*用于消息推送
(function($) {
    $.fn.extend({
        Show: function(widht,height) {
       var TopY=0;//初始化元素距父元素的距离
        $(this).css("width",widht+"px").css("height",height+"px");//设置消息框的大小
        $(this).slideDown(1000);//弹出
        $("#messageTool").css("margin-top",-height);//为内容部分创建高度   溢出
        $("#message_close").click(function() {//当点击关闭按钮的时候
            if(TopY==0)
             {
                   $("#message").slideUp(1000);//这里之所以用slideUp是为了兼用Firefox浏览器
             }
           else
            {
                  $("#message").animate({top: TopY+height}, "slow", function() { $("#message").hide(); });//当TopY不等于0时   ie下和Firefox效果一样
            }
         });
         $(window).scroll(function() {
             $("#message").css("top", $(window).scrollTop() + $(window).height() - $("#message").height());//当滚动条滚动的时候始终在屏幕的右下角
             TopY=$("#message").offset().top;//当滚动条滚动的时候随时设置元素距父原素距离
          });
        }
     })}
)(jQuery);
*/