//多文件上传
$(function(){
    var options = { 
          dataType:  'json',        // 'xml', 'script', or 'json' (expected server response type)
           success:  function(data){
           alert('文件上载成功！');
          var  jresult = eval(data);
          var  batchId = jresult[0].batchId;
          $("#batchId").val(batchId);          
          $("#uploaddlg").dialog("close");
        }  
    }; 
  $("#fup").ajaxForm(options);
  $("#uploaddlg").dialog({autoOpen:false,width:400,height:700});
  
  $("#btnupload").click(function() {
    
    $("#uploaddlg").dialog("open");
  });  
});

/****** dobatchid start********/ 
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
    	   success:function (json){}
    	   });
}
/******  end********/

