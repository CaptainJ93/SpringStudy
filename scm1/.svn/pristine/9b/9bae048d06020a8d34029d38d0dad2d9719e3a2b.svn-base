<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>配送大区评分管理</title>
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
		<li><a href="${ctx}/delivery/scmDeliveryTimezoneratescore/">配送大区评分列表</a></li>
		<li class="active"><a href="${ctx}/delivery/scmDeliveryTimezoneratescore/form?id=${scmDeliveryTimezoneratescore.id}">配送大区评分<shiro:hasPermission name="delivery:scmDeliveryTimezoneratescore:edit">${not empty scmDeliveryTimezoneratescore.id?'修改':'添加'}</shiro:hasPermission><shiro:lacksPermission name="delivery:scmDeliveryTimezoneratescore:edit">查看</shiro:lacksPermission></a></li>
	</ul><br/>
	<form:form id="inputForm" modelAttribute="scmDeliveryTimezoneratescore" action="${ctx}/delivery/scmDeliveryTimezoneratescore/save" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<sys:message content="${message}"/>		
		<div class="control-group">
			<label class="control-label">大全类别：</label>
			<div class="controls">
				<form:input path="hourzone" htmlEscape="false" maxlength="20" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">比例起：</label>
			<div class="controls">
				<form:input path="ratebegin" htmlEscape="false" maxlength="4" class="input-xlarge  digits"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">比例止：</label>
			<div class="controls">
				<form:input path="rateend" htmlEscape="false" maxlength="4" class="input-xlarge  digits"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">比例得分：</label>
			<div class="controls">
				<form:input path="ratescore" htmlEscape="false" maxlength="4" class="input-xlarge  digits"/>
			</div>
		</div>
		<div class="form-actions">
			<shiro:hasPermission name="delivery:scmDeliveryTimezoneratescore:edit"><input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>&nbsp;</shiro:hasPermission>
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
	</form:form>
</body>
</html>