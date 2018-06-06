/*函数名:上传下载组件
  支持的参数:
  params={
    "dotype": "up",                   //操作类型：up表示编辑和新增， down表示仅仅是下载
    "batchId": "batchId",             //批次号
    "fromid": "formid",               //上传文件formid
    "uploaddlg": "uploaddlg",         //上传文件对话框id
    "btnupload": "btnupload",         //上传按钮
    "filelist":"filelist"             //文件列表展示div id
  }; 
**/
jQuery.fn.extend({
	fileupdown:function(params){		
		  	var dotype=$("#"+params.dotype);
		  	var formid=$("#"+params.fromid);
			var uploaddlg=$("#"+params.uploaddlg);
			var batch_Id=$("#"+params.batchId);
			var btnupload=$("#"+params.btnupload);	
			var filelist=$("#"+params.filelist);	  
				
		  var formoptions = { 
		           url:'sMuliFileUpload.action',
		           dataType:'json',        
                    success:function(data){
		           alert('文件上载成功！');
		           var  jresult = eval(data);
		           var  batchId = jresult[0].batchId; //返回的批次号
		           batch_Id.val();    
		            if(batch_Id.val()!=null && batch_Id.val()!=""){
		             dobatchid(batchId);
		           }	     
		          QueryFileByBatchId(batchId,params.dotype,params.filelist);
		        }  
		    }; 
		  formid.ajaxForm(formoptions);
		  
		  uploaddlg.dialog({autoOpen:false,width:400,height:700});
		  
		  btnupload.click(function() {		    
		    uploaddlg.dialog("open");
		    QueryFileByBatchId(batch_Id.val(),params.dotype,params.filelist);
		    if(dotype=="down"){alert(formid.style.display);
		      formid.style.display = "none";
		    }
		  }); 
		  
		 
  /*****根据批次号查询文件列表 start********/
 function QueryFileByBatchId(batchId,vtypes,vfilelist){
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
	           if(vtypes=="up"){
	           strInner += "<img src ='themes/icons/cancel.png' width='16'height='16' onclick='deletefile("+fileId+",\""+vtypes+"\",\""+vfilelist+"\");' style='cursor: pointer;'/><a href='DownloadFile.action?fileId="+fileId+"'>"+ oriFileName +"</a><br>";
	           }else{
	           	strInner += "<a href='DownloadFile.action?fileId="+fileId+"'>"+ oriFileName +"</a><br>";
	           }
	         }
	       }
	       $("#"+vfilelist).empty();
	       $("#"+vfilelist).append(strInner);
	}});
 }
/*****根据批次号查询文件列表 end********/
  
}	
});

  /*****根据批次号查询文件列表 start********/
 function queryfile(batchId,vtypes,vfilelist){
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
	           if(vtypes=="up"){
	           strInner += "<img src ='images/delete.png' width='16'height='16' onclick='deletefile("+fileId+",\""+vtypes+"\",\""+vfilelist+"\");' style='cursor: pointer;'/><a href='DownloadFile.action?fileId="+fileId+"'>"+ oriFileName +"</a><br>";
	           }else{
	           	strInner += "<a href='DownloadFile.action?fileId="+fileId+"'>"+ oriFileName +"</a><br>";
	           }
	         }
	       }
	       $("#"+vfilelist).empty();
	       $("#"+vfilelist).append(strInner);
	}});
 }
/*****根据批次号查询文件列表 end********/

/******根据文件编号删除文件 start 物理删除**********/ 
 function deletefile(fileId,vtypes,vfilelist){
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
       queryfile($("#batchId").val(),vtypes,vfilelist);
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





