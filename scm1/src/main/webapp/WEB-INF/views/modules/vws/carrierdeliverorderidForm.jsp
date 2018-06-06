<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>配送公司面单管理</title>
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
		<li><a href="${ctx}/vws/carrierdeliverorderid/">配送公司面单列表</a></li>
		<li class="active"><a href="${ctx}/vws/carrierdeliverorderid/form?id=${carrierdeliverorderid.id}">配送公司面单<shiro:hasPermission name="vws:carrierdeliverorderid:edit">${not empty carrierdeliverorderid.id?'修改':'添加'}</shiro:hasPermission><shiro:lacksPermission name="vws:carrierdeliverorderid:edit">查看</shiro:lacksPermission></a></li>
	</ul><br/>
	<form:form id="inputForm" modelAttribute="carrierdeliverorderid" action="${ctx}/vws/carrierdeliverorderid/save" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<sys:message content="${message}"/>		
		<div class="control-group">
			<label class="control-label">配送公司：</label>
			<div class="controls">
				<sys:treeselectCode id="carrierid" name="carrierid" value="${carrierdeliverorderid.carrierid}" labelName="carrier.carriername" labelValue="${carrierdeliverorderid.carrier.carriername}"	title="配送商" url="/sys/office/treeData?type=4" cssClass="required"/> 
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">面订单号：</label>
			<div class="controls">
				<form:input path="deliveryorderid" htmlEscape="false" maxlength="20" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">是否已使用：</label>
			<div class="controls">
				<form:input path="status" htmlEscape="false" maxlength="4" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="form-actions">
			<shiro:hasPermission name="vws:carrierdeliverorderid:edit"><input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>&nbsp;</shiro:hasPermission>
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
	</form:form>
</body>
</html>