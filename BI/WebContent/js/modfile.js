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
});

/****** dobatchid start********/ 
  function dobatchid(batchId){
     var url = "gcms/UpdateFileStatusByBatchId.action";
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
    	 //  	var fileBatchId2 = $("#batchId").val();
	        QueryFileByBatchId(batchId);
    	   	}
    	   });
}
/******  end********/