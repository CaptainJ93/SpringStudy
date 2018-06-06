<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>配送区域时效管理</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function() {
			//$("#name").focus();
			$("#inputForm").validate({
				submitHandler: function(form){
					loading('正在提交，请稍等...');
					form.submit();
				},
				errorContainer: "#messageBox",
				errorPlacement: function(error, element) {
					$("#messageBox").text("输入有误，请先更正。");
					if (element.is(":checkbox")||element.is(":radio")||element.parent().is(".input-append")){
						error.appendTo(element.parent().parent());
					} else {
						error.insertAfter(element);
					}
				}
			});
		});
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li><a href="${ctx}/vws/carrierzipcode/">配送区域时效列表</a></li>
		<li class="active"><a href="${ctx}/vws/carrierzipcode/form?id=${carrierzipcode.id}">配送区域时效<shiro:hasPermission name="vws:carrierzipcode:edit">${not empty carrierzipcode.id?'修改':'添加'}</shiro:hasPermission><shiro:lacksPermission name="vws:carrierzipcode:edit">查看</shiro:lacksPermission></a></li>
	</ul><br/>
	<form:form id="inputForm" modelAttribute="carrierzipcode" action="${ctx}/vws/carrierzipcode/save" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<sys:message content="${message}"/>		
	 
		
			<div class="control-group">
			<label class="control-label">配送公司代码：</label>
		<div class="controls">
                <sys:treeselectCode id="carrier" name="carrier.carrierid" value="${carrierzipcode.carrier.carrierid}" labelName="carrier.carriername" labelValue="${carrierzipcode.carrier.carriername}"
					title="配送商" url="/sys/office/treeData?type=4" cssClass="required"/><span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
	
		<div class="control-group">
			<label class="control-label">省市区：</label>
		<div class="controls">
                <sys:treeselectCode id="zipcode" name="area.zipcode" value="${carrierzipcode.area.zipcode}" labelName="area.adress" labelValue="${carrierzipcode.area.adress}"
					title="省市区" url="/sys/area/treeDataArea4 " cssClass="required"/><span class="help-inline"><font color="red">*</font> </span>
			</div>
			
			
		</div>
			
	
		<div class="control-group">
			<label class="control-label">配送时效(小时)：</label>
			<div class="controls">
				<form:input path="limitations" htmlEscape="false" maxlength="4" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">回款时效(小时)：</label>
			<div class="controls">
				<form:input path="receivedpayments" htmlEscape="false" maxlength="4" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">退货时效(小时)：</label>
			<div class="controls">
				<form:input path="returntime" htmlEscape="false" maxlength="4" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">是否生效：</label>
				<form:select path="freeze">
					<form:options items="${fns:getDictList('yes_no')}" itemLabel="label" itemValue="value" htmlEscape="false"/>
				</form:select>
		</div>
		
		
		<div class="form-actions">
			<shiro:hasPermission name="vws:carrierzipcode:edit"><input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>&nbsp;</shiro:hasPermission>
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
	</form:form>
</body>
</html>