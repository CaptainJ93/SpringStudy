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
		<li><a href="${ctx}/deliveryfee/scmDeliveryfeePackagedetail/">配送费用计算列表</a></li>
		<li class="active"><a href="${ctx}/deliveryfee/scmDeliveryfeePackagedetail/form?id=${scmDeliveryfeePackagedetail.id}">配送费用计算<shiro:hasPermission name="deliveryfee:scmDeliveryfeePackagedetail:edit">${not empty scmDeliveryfeePackagedetail.id?'修改':'添加'}</shiro:hasPermission><shiro:lacksPermission name="deliveryfee:scmDeliveryfeePackagedetail:edit">查看</shiro:lacksPermission></a></li>
	</ul><br/>
	<form:form id="inputForm" modelAttribute="scmDeliveryfeePackagedetail" action="${ctx}/deliveryfee/scmDeliveryfeePackagedetail/save" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<sys:message content="${message}"/>		
		<div class="control-group">
			<label class="control-label">快递单号：</label>
			<div class="controls">
				<form:input path="trackingnumber" htmlEscape="false" maxlength="20" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">包裹委托派送的快递公司编码：</label>
			<div class="controls">
				<form:input path="selectedcarrier" htmlEscape="false" maxlength="10" class="input-xlarge  digits"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">实际出货日期时间：</label>
			<div class="controls">
				<input name="actualshipdate" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate "
					value="<fmt:formatDate value="${scmDeliveryfeePackagedetail.actualshipdate}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">包裹状态码：</label>
			<div class="controls">
				<form:input path="trackingstatus" htmlEscape="false" maxlength="4" class="input-xlarge  digits"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">收件地邮编：</label>
			<div class="controls">
				<form:input path="receivingzipcode" htmlEscape="false" maxlength="30" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">首重：</label>
			<div class="controls">
				<form:input path="fheavy" htmlEscape="false" class="input-xlarge  number"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">首重价格：</label>
			<div class="controls">
				<form:input path="fheavyprice" htmlEscape="false" class="input-xlarge  number"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">续重单位：</label>
			<div class="controls">
				<form:input path="cheavyunit" htmlEscape="false" class="input-xlarge  number"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">续重单位价格：</label>
			<div class="controls">
				<form:input path="cheavyunitprice" htmlEscape="false" class="input-xlarge  number"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">1代表配送费用 2代表揽收费用：</label>
			<div class="controls">
				<form:input path="type" htmlEscape="false" maxlength="4" class="input-xlarge  digits"/>
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
			<label class="control-label">首重金额：</label>
			<div class="controls">
				<form:input path="fheavynum" htmlEscape="false" class="input-xlarge  number"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">续重金额：</label>
			<div class="controls">
				<form:input path="cheavynum" htmlEscape="false" class="input-xlarge  number"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">cod手续费金额：</label>
			<div class="controls">
				<form:input path="codfeenum" htmlEscape="false" class="input-xlarge  number"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">拒收折扣金额：</label>
			<div class="controls">
				<form:input path="rejectnum" htmlEscape="false" class="input-xlarge  number"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">最终结果金额：</label>
			<div class="controls">
				<form:input path="resultnum" htmlEscape="false" class="input-xlarge  number"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">最终结果产生时间：</label>
			<div class="controls">
				<input name="resulttime" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate "
					value="<fmt:formatDate value="${scmDeliveryfeePackagedetail.resulttime}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>
			</div>
		</div>
		<div class="form-actions">
			<shiro:hasPermission name="deliveryfee:scmDeliveryfeePackagedetail:edit"><input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>&nbsp;</shiro:hasPermission>
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
	</form:form>
</body>
</html>