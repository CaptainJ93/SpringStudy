<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>出货确认</title>
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
		<li class="active"><a href="${ctx}/supplier/scmSupplierCsoinfo/shipConfirmForm">出货确认</a></li>
	</ul><br/>
	<sys:message content="${message}" />
	<form:form id="inputForm" modelAttribute="scmSupplierShipConfirmInfo" action="${ctx}/supplier/scmSupplierCsoinfo/shipConfirm" method="post" class="form-horizontal">
		<form:hidden path="csoInfoId"/>
		<div class="control-group">
			<label class="control-label">订单号：</label>
			<div class="controls">
				<form:input path="orderId" readonly="true"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">订单序号：</label>
			<div class="controls">
				<form:input path="itemId" readonly="true"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">配送公司：</label>
			<div class="controls">
				<c:if test="${scmSupplierShipConfirmInfo.carrierReadonly}">
					<form:hidden path="carrierId"/>
					<form:input path="carrierName" class="input-medium required" disabled="true"/>
				</c:if>
				<c:if test="${!scmSupplierShipConfirmInfo.carrierReadonly}">
					<form:select path="carrierId" class="input-medium required" >
						<form:option value="" label="请选择"/>
						<form:options items="${carrierInfos}" itemLabel="carriername" itemValue="carrierid" htmlEscape="false"/>
					</form:select>
				</c:if>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">配送单号：</label>
			<div class="controls">
				<c:if test="${scmSupplierShipConfirmInfo.carrierReadonly}">
					<form:input path="trackingNumber" htmlEscape="false" maxlength="20" class="input-xlarge required" readonly="true"/>
				</c:if>
				<c:if test="${!scmSupplierShipConfirmInfo.carrierReadonly}">
					<form:input path="trackingNumber" htmlEscape="false" maxlength="20" class="input-xlarge required"/>
				</c:if>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">包裹重量(kg)：</label>
			<div class="controls">
				<form:input path="packageWeight" htmlEscape="false" class="input-xlarge  number"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">包裹备注：</label>
			<div class="controls">
				<form:input path="packageRemark" htmlEscape="false" maxlength="100" class="input-xlarge "/>
			</div>
		</div>
		<div class="form-actions">
			<input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>&nbsp;
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
	</form:form>
</body>
</html>