<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>配送费用计算管理</title>
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
		<li><a href="${ctx}/deliveryfee/scmDeliveryfeeCodfee/">配送费用计算列表</a></li>
		<li class="active"><a href="${ctx}/deliveryfee/scmDeliveryfeeCodfee/form?id=${scmDeliveryfeeCodfee.id}">配送费用计算<shiro:hasPermission name="deliveryfee:scmDeliveryfeeCodfee:edit">${not empty scmDeliveryfeeCodfee.id?'修改':'添加'}</shiro:hasPermission><shiro:lacksPermission name="deliveryfee:scmDeliveryfeeCodfee:edit">查看</shiro:lacksPermission></a></li>
	</ul><br/>
	<form:form id="inputForm" modelAttribute="scmDeliveryfeeCodfee" action="${ctx}/deliveryfee/scmDeliveryfeeCodfee/save" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<sys:message content="${message}"/>		
		<div class="control-group">
			<label class="control-label">快递公司：</label>
			<div class="controls">
				<form:input path="selectedcarrier" htmlEscape="false" maxlength="20" class="input-xlarge  digits"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">cod费率 百分比的值：</label>
			<div class="controls">
				<form:input path="codfeerate" htmlEscape="false" maxlength="4" class="input-xlarge  number"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">拒收优惠折扣比：</label>
			<div class="controls">
				<form:input path="rejectrate" htmlEscape="false" maxlength="4" class="input-xlarge  number"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">记录有效 开始时间：</label>
			<div class="controls">
				<input name="expbegindate" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate "
					value="<fmt:formatDate value="${scmDeliveryfeeCodfee.expbegindate}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">记录有效 结束时间：</label>
			<div class="controls">
				<input name="expenddate" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate "
					value="<fmt:formatDate value="${scmDeliveryfeeCodfee.expenddate}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>
			</div>
		</div>
		<div class="form-actions">
			<shiro:hasPermission name="deliveryfee:scmDeliveryfeeCodfee:edit"><input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>&nbsp;</shiro:hasPermission>
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
	</form:form>
</body>
</html>