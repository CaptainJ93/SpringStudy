$(function(){
	$.getCaches("../cache!getCache.action","REPORT_FILE_PATH",function(cacheKeys){
		
	});
	
	$("#filepath").change(function() {
		if($("#filepath").val() == null || $("#filepath").val() == ''){
			$("#fileContent").val("");
		}else{
			$.ajax({
				url: "fileConfig!getFileContent.action",
				type:'post',
				dataType:'json',
				data:{"paramMap.filepath":$("#filepath").val()},
				success:function(data,status){
					if (data==undefined||data["errCode"]==undefined||data["errCode"]!=0) {
						if (data["errMsg"]!=undefined)
							alert("服务器返回错误: "+data.errMsg);
						else
							alert("服务器返回错误");
						return;
					}
					$("#fileContent").val(data.value);
				}
			});	
		}
	});
	
	$("#saveBtn").click(function(){
		if($("#fileContent").val() == null || $("#fileContent").val() == ''){
			$.messager.alert("操作提示", "请选择文件！");
		}else{
			$.ajax({
				url: "fileConfig!saveFileContent.action",
				type:'post',
				dataType:'json',
				data:{"paramMap.filepath":$("#filepath").val(),"paramMap.content":$("#fileContent").val()},
				success:function(data,status){
					if (data==undefined||data["errCode"]==undefined||data["errCode"]!=0) {
						if (data["errMsg"]!=undefined)
							alert("服务器返回错误: "+data.errMsg);
						else
							alert("服务器返回错误");
						return;
					}
					$.messager.alert("操作结果", "保存成功！");
					$("#fileContent").val("");
					$("#filepath").val(null);
				}
			});	
		}
	});
	
});
