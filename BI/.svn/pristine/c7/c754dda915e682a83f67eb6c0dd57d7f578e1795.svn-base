<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ include file="/pub/include.jsp"%>
<script type="text/javascript">
$(document).ready(function(){
	selectProvince();
	$("#province").bind("change",selectCity);
	$("#city").bind("change",selectCountry);
});

	function selectProvince(){
	$("#province").html("<option value=\"-1\">请选择省</option>");
		$.ajax({
			async:true,
			type:"POST",
			url:"./ComboBoxServlet",
			data:{"type":"PROVINCE"},
			dataType:"json",
			success:function(data,textStatus){
			var jsonpros = data;
			for(var i = 0;i<jsonpros.length;i++){
				var jsonpro = jsonpros[i];
				var $optpro = $("<option></option>");
				$optpro.attr("value",jsonpro.value);
				$optpro.text(jsonpro.name);
				$("#province").append($optpro);
			}
			selectCity();
			},
			error:function(xhr,textStatus,errorThrown){}
			});
	}
	function selectCity(){
		$("#city").html("<option value=\"-1\">请选择市</option>");
		$.ajax({
			async:true,
			type:"POST",
			url:"./ComboBoxServlet",
			data:{"type":"CITY","provinceId":$("#province").attr("value")},
			dataType:"json",
			success:function(data,textStatus){
			var jsonpros = data;
			for(var i = 0;i<jsonpros.length;i++){
				var jsonpro = jsonpros[i];
				var $optpro = $("<option></option>");
				$optpro.attr("value",jsonpro.value);
				$optpro.text(jsonpro.name);
				$("#city").append($optpro);
			}
			selectCountry();
			},
			error:function(xhr,textStatus,errorThrown){}
			});
	}
	
	function selectCountry(){
		$("#country").html("<option value=\"-1\">请选择区</option>");
		$.ajax({
			async:true,
			type:"POST",
			url:"./ComboBoxServlet",
			data:{"type":"AREA","cityId":$("#city").attr("value")},
			dataType:"json",
			success:function(data,textStatus){
			var jsonpros = data;
			for(var i = 0;i<jsonpros.length;i++){
				var jsonpro = jsonpros[i];
				var $optpro = $("<option></option>");
				$optpro.attr("value",jsonpro.value);
				$optpro.text(jsonpro.name);
				$("#country").append($optpro);
			}
			},
			error:function(xhr,textStatus,errorThrown){}
			});
	}
	
</script>
</head>
<body>
<!--
<div align="center"> 

<input id="cc" style="width:100px"
			url="./ComboBoxServlet"
			valueField="id" textField="text">
	</input>
 <select id="aa" class="easyui-combobox">

    <option value="1">1</option>

    <option value="2">2</option>

    <option value="3">3</option>

</select>

<input id="userAttrArea"  class="easyui-combobox">
	</input>省
	<input id="userAttrCity" class="easyui-combobox">
	</input>市
	<input id="userAttrCounty" class="easyui-combobox">
	</input>区
</div>

<div align="center">
<div>
<select id="province">
<option value="-1">请选择省</option>
</select>
<select id="city">
<option value="-1">请选择市</option>
</select>
<select id="country">
<option value="-1">请选择区</option>
</select>
</div>

</div>
-->
<div><select id="province">
	
</select> <select id="city">
	
</select> <select id="country">
	
</select>
</div>

</body>
</html>