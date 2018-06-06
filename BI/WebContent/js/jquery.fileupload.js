/**
  支持的参数:
  params={
    "dotype": "new",                  //操作类型：new:新增文件 edit：编辑
    "batchId": "batchId",             //批次号
    "fromid": "formid",               //上传文件formid
    "uploaddlg": "uploaddlg",         //上传文件对话框id
    "btnupload": "btnupload",         //上传按钮
    "filelist":"filelist"             //文件列表展示div id
  }; 
**/
jQuery.fn.extend({
	fileedit:function(params){		
		  	var dotype=$("#"+params.dotype);
		  	var formid=$("#"+params.fromid);
				var uploaddlg=$("#"+params.uploaddlg);
				var batch_Id=$("#"+params.batchId);
				var btnupload=$("#"+params.btnupload);	
				var filelist=$("#"+params.filelist);	  
				
		  var options = { 
		           dataType:  'json',   
		           success:  function(data){
		           alert('文件上载成功！');
		          var  jresult = eval(data);
		          var  batchId = jresult[0].batchId; //返回的批次号
		          batch_Id.val(batchId); 
		          if(dotype=="edit"){       
		           dobatchid(batchId);
		          }
		          QueryFileByBatchId(batchId);
		        }  
		    }; 
		  formid.ajaxForm(options);
		  uploaddlg.dialog({autoOpen:false,width:400,height:700});
		  
		  btnupload.click(function() {		    
		    uploaddlg.dialog("open");
		  }); 
		  
		 
  /*****根据批次号查询文件列表 start********/
 function QueryFileByBatchId(batchId){
   var strInner = "";
	var url = "QueryFileStorageRecoreByBatchId.action";
	var pars = "batchId="+ batchId;
	$.ajax({url:url, 
	       type:"post", 
	       dataType:"text", 
	       async:"false",
	       data:pars + "&date=" + new Date(),
	       error:function (json) {
	    	alert("\u7cfb\u7edf\u7e41\u5fd9\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5");
    	   }, 
    	   success:function (text) {
	       var jresult = eval(text);
	       if (jresult.length > 0) {
	         for (var i = 0; i < jresult.length; i++) {
	           var oriFileName = jresult[i].oriFileName;
	           var fileId = jresult[i].fileId;
	           strInner += "<img src ='images/delete.png' width='16'height='16' onclick='deletefile("+fileId+")' style='cursor: pointer;'/><a href='DownloadFile.action?fileId="+fileId+"'>"+ oriFileName +"</a><br>";
	         }
	       }
	       filelist.append(strInner);
	}});
 }
/*****根据批次号查询文件列表 end********/

/******根据文件编号删除文件 start 物理删除**********/ 
 function deletefile(fileId){
    if(confirm('该删除为物理删除，不可逆！确定要删除吗?')){
    var url = "DeleteFileByFileId.action";
	var pars = "fileId="+ fileId;
	$.ajax({url:url, 
	       type:"post", 
	       dataType:"text", 
	       async:"false",
	       data:pars + "&date=" + new Date(),
	       error:function (json) {
	    	alert("\u7cfb\u7edf\u7e41\u5fd9\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5");
    	   }, 
    	   success:function (json){}
    	   });
       QueryFileByBatchId($("#batchId").val());
    }
 }
/******根据文件编号删除文件 end 物理删除**********/

/****** 提供给业务程序进行批次变更文件为有效 start********/ 
  function dobatchid(batchId){
     var url = "UpdateFileStatusByBatchId.action";
	 var pars = "batchId="+ batchId;
	 $.ajax({url:url, 
	       type:"post", 
	       dataType:"text", 
	       async:"false",
	       data:pars + "&date=" + new Date(),
	       error:function (json) {
	    	alert("\u7cfb\u7edf\u7e41\u5fd9\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5");
    	   }, 
    	   success:function (json){
    	   	}
    	   });
}
/****** 提供给业务程序进行批次变更文件为有效 end********/
		  
		}	
});



