<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>批量出货确认</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
	$(document).ready(function(){
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
		<li><a href="${ctx}/supplier/scmSupplierCsoinfo/">指送订单列表</a></li>
		<shiro:hasPermission name="supplier:scmSupplierCsoinfo:shipConfirm">
			<li class="active"><a href="${ctx}/supplier/scmSupplierCsoinfo/batchShipConfirm">批量出货确认</a></li>
		</shiro:hasPermission>
		<shiro:hasPermission name="supplier:scmSupplierCsoinfo:print">
			<li><a href="${ctx}/supplier/scmSupplierCsoinfo/printList">面单打印</a></li>
		</shiro:hasPermission>
	</ul>
	<sys:message content="${message}"/>
	<form:form id="inputForm" action="${ctx}/supplier/scmSupplierCsoinfo/uploadBatchShipConfirmFile" method="post" class="form-horizontal" enctype="multipart/form-data">
		<div class="control-group">
			<label class="control-label">出货确认文件：</label>
			<div class="controls">
				<input type="file" id="file" name="file" class="required"/>
				<span class="help-inline">支持文件格式：xls、xlsx</span>
			</div>
		</div>
		<div class="form-actions">
			<input id="btnSubmit" class="btn btn-primary" type="submit" value="提 交"/>
			<input class="btn btn-primary" type="button" value="模板" onclick="window.location.href='${ctx}/supplier/scmSupplierCsoinfo/downloadBatchShipConfirmTemplate'">
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
	</form:form>
</body>
</html>