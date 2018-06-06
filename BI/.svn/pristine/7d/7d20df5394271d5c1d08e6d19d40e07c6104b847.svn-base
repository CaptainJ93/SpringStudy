/*****上传文件编辑时start********/
$(function(){
    var options = { 
          dataType:  'json',        
           success:  function(data){
          var  jresult = eval(data);
          var  batchId = jresult[0].batchId;
          $("#batchId").val(batchId);
          dobatchid(batchId);
        }  
    }; 
  $("#fup").ajaxForm(options);
  $("#uploaddlg").dialog({autoOpen:false,width:400,height:700});
   
  $("#btnupload").click(function() {
    QueryFileByBatchId($("#batchId").val());
    $("#uploaddlg").dialog("open");
  });   
});

/*****上传文件 end********/

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
	       var pageid = document.getElementById("filelist");
		   pageid.innerHTML = strInner; 	
		
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
    	   	  QueryFileByBatchId(batchId);
    	   	}
    	   });
}
/****** 提供给业务程序进行批次变更文件为有效 end********/