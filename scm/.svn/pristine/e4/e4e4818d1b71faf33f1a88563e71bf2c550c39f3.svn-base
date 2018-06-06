<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>配送包裹明细管理</title>
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
		<li><a href="${ctx}/delivery/deliveryOrderintransitDetail/">配送包裹明细列表</a></li>
		<li class="active"><a href="${ctx}/delivery/deliveryOrderintransitDetail/form?id=${deliveryOrderintransitDetail.id}">配送包裹明细<shiro:hasPermission name="delivery:deliveryOrderintransitDetail:edit">${not empty deliveryOrderintransitDetail.id?'修改':'添加'}</shiro:hasPermission><shiro:lacksPermission name="delivery:deliveryOrderintransitDetail:edit">查看</shiro:lacksPermission></a></li>
	</ul><br/>
	<form:form id="inputForm" modelAttribute="deliveryOrderintransitDetail" action="${ctx}/delivery/deliveryOrderintransitDetail/save" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<sys:message content="${message}"/>		
		<div class="control-group">
			<label class="control-label">客户订购ERP订单号：</label>
			<div class="controls">
				<form:input path="orderid" htmlEscape="false" maxlength="20" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">客户订购ERP中订单序号：</label>
			<div class="controls">
				<form:input path="itemid" htmlEscape="false" maxlength="4" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">客户订购ERP中出货单号：</label>
			<div class="controls">
				<form:input path="shiporderid" htmlEscape="false" maxlength="20" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">客户订购ERP中出货单序号：</label>
			<div class="controls">
				<form:input path="shipordersequence" htmlEscape="false" maxlength="4" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">客户订购ERP中商品编号：</label>
			<div class="controls">
				<form:input path="productid" htmlEscape="false" maxlength="10" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">商品版本号：</label>
			<div class="controls">
				<form:input path="productversion" htmlEscape="false" maxlength="4" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">客户订购ERP中商品名称：</label>
			<div class="controls">
				<form:input path="productname" htmlEscape="false" maxlength="50" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">客户订购ERP中颜色类别代码：</label>
			<div class="controls">
				<form:input path="colorclasscode" htmlEscape="false" maxlength="4" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">客户订购ERP中颜色代码：</label>
			<div class="controls">
				<form:input path="colorcode" htmlEscape="false" maxlength="4" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">客户订购ERP中款式类别代码：</label>
			<div class="controls">
				<form:input path="styleclasscode" htmlEscape="false" maxlength="4" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">客户订购ERP中款式代码：</label>
			<div class="controls">
				<form:input path="stylecode" htmlEscape="false" maxlength="4" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">客户订购ERP中颜色值：</label>
			<div class="controls">
				<form:input path="colorvalue" htmlEscape="false" maxlength="10" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">客户订购ERP中款式值：</label>
			<div class="controls">
				<form:input path="stylevalue" htmlEscape="false" maxlength="10" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">客户订购ERP中订购商品重量：</label>
			<div class="controls">
				<form:input path="productnum" htmlEscape="false" maxlength="4" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">订单cod金额：</label>
			<div class="controls">
				<form:input path="codnum" htmlEscape="false" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">客户订购ERP中订单创建时间：</label>
			<div class="controls">
				<input name="createdtimestamp" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate required"
					value="<fmt:formatDate value="${deliveryOrderintransitDetail.createdtimestamp}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">对应的包裹号(快递单号)：</label>
			<div class="controls">
				<form:input path="trackingnumber" htmlEscape="false" maxlength="20" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">订单配送状态，当半签半退时使用：</label>
			<div class="controls">
				<form:input path="orderdeliverystatus" htmlEscape="false" maxlength="4" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">记录创建时间：</label>
			<div class="controls">
				<input name="recordcreatedtime" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate "
					value="<fmt:formatDate value="${deliveryOrderintransitDetail.recordcreatedtime}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">记录创建人：</label>
			<div class="controls">
				<form:input path="recordcreatedby" htmlEscape="false" maxlength="4" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">lastupdatedby：</label>
			<div class="controls">
				<form:input path="lastupdatedby" htmlEscape="false" maxlength="4" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">lastupdatedtime：</label>
			<div class="controls">
				<input name="lastupdatedtime" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate "
					value="<fmt:formatDate value="${deliveryOrderintransitDetail.lastupdatedtime}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>
			</div>
		</div>
		<div class="form-actions">
			<shiro:hasPermission name="delivery:deliveryOrderintransitDetail:edit"><input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>&nbsp;</shiro:hasPermission>
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
	</form:form>
</body>
</html>