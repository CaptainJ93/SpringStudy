<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>退货单头信息管理</title>
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
		<shiro:hasPermission name="supplier:scmSupplierSroheader:view"><li><a href="${ctx}/supplier/scmSupplierSroheader/">退货单头信息列表</a></li></shiro:hasPermission>
		<li class="active"><a>退货单头信息查看</a></li>
	</ul><br/>
	<form:form id="inputForm" modelAttribute="scmSupplierSroheader" action="${ctx}/supplier/scmSupplierSroheader/save" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<sys:message content="${message}"/>	
		<div class="container-fluid breadcrumb">
		<div >
			<span >前台销退号：<form:input readonly="true" path="returnid" htmlEscape="false" maxlength="20" style="width:100px" class="input-xlarge required digits"/></span>
&nbsp;&nbsp;&nbsp;&nbsp;<span >邮编: <b>${scmSupplierSroheader.zipcode}</b></span>
&nbsp;&nbsp;&nbsp;&nbsp;<span >收货地址1: <b>${scmSupplierSroheader.receiveaddress1}</b></span>			
&nbsp;&nbsp;&nbsp;&nbsp;<span >收货地址2: <b>${scmSupplierSroheader.receiveaddress2}</b></span>
		</div>
		<div >
		<br>
			<span >客户姓名：<b>${scmSupplierSroheader.customername}</b></span>
&nbsp;&nbsp;&nbsp;&nbsp;<span >客户电话号码：<b>${scmSupplierSroheader.telephonenumber}</b></span>
&nbsp;&nbsp;&nbsp;&nbsp;<span >客户手机号码：<b>${scmSupplierSroheader.mobilenumber}</b></span>
&nbsp;&nbsp;&nbsp;&nbsp;<span >销退建立时间：<b><fmt:formatDate value="${scmSupplierSroheader.returntime}" pattern="yyyy-MM-dd HH:mm:ss"/></b></span>
		</div>
		<div >
		<br>
			<span >仓库编码: <b>${scmSupplierSroheader.warehouseid}</b></span>
&nbsp;&nbsp;&nbsp;&nbsp;<span >销退类型：<b>${fns:getDictLabel(scmSupplierSroheader.returntype, 'ReturnOrderType', '')}</b></span>
&nbsp;&nbsp;&nbsp;&nbsp;<span >客户编号：<b>${scmSupplierSroheader.customerid}</b></span>
&nbsp;&nbsp;&nbsp;&nbsp;<span >修改人：<b>${scmSupplierSroheader.lastupdatedby}</b></span>
&nbsp;&nbsp;&nbsp;&nbsp;<span >修改时间：<b><fmt:formatDate value="${scmSupplierSroheader.lastupdatedtime}" pattern="yyyy-MM-dd HH:mm:ss"/></b></span>
		</div>
		<div >
		<br>
			<span >是否当面退款：<b>${fns:getDictLabel(scmSupplierSroheader.isfacetofacerefund, 'yes_no', '')}</b></span>
&nbsp;&nbsp;&nbsp;&nbsp;<span >当面退款cod金额：<b>${scmSupplierSroheader.refundcodnumber}</b></span>
&nbsp;&nbsp;&nbsp;&nbsp;<span >是否需要回收发票：<b>${fns:getDictLabel(scmSupplierSroheader.isneedinvoice, 'yes_no', '')}</b></span>
&nbsp;&nbsp;&nbsp;&nbsp;<span >收货成功时间：<b><fmt:formatDate value="${scmSupplierSroheader.receiptsuccesstime}" pattern="yyyy-MM-dd HH:mm:ss"/></b></span>
&nbsp;&nbsp;&nbsp;&nbsp;<span >收回状态：<b>${fns:getDictLabel(scmSupplierSroheader.receiptstatus, 'Receipt_Status', '')}</b></span>

		</div>
		<div >
		<br>
			<span >到达好易购仓库时间：<b><fmt:formatDate value="${scmSupplierSroheader.tohygwarehousetime}" pattern="yyyy-MM-dd HH:mm:ss"/></b></span>
&nbsp;&nbsp;&nbsp;&nbsp;<span >好易购仓库收货确认时间：<b><fmt:formatDate value="${scmSupplierSroheader.receiptconfirmtime}" pattern="yyyy-MM-dd HH:mm:ss"/></b></span>
&nbsp;&nbsp;&nbsp;&nbsp;<span >子配送方式：<b>${fns:getDictLabel(scmSupplierSroheader.subdeliverytype, 'SubDeliveryType', '')}</b></span>		
		</div>
		<div >
		<br>
			<span >记录创建时间：<b><fmt:formatDate value="${scmSupplierSroheader.recordcreatedtime}" pattern="yyyy-MM-dd HH:mm:ss"/></b></span>		
&nbsp;&nbsp;&nbsp;&nbsp;<span >记录创建人：<b>${scmSupplierSroheader.recordcreatedby}</b></span>


&nbsp;&nbsp;&nbsp;&nbsp;<span >配送公司：<form:select path="selectedcarrier" class="input-medium required">
					<form:option value="" label="请选择"/>
					<form:options items="${carrierInfos}" itemLabel="carriername" itemValue="carrierid" htmlEscape="false"/>
			</form:select></span>
&nbsp;&nbsp;&nbsp;&nbsp;<span >收回使用的快递单号：<form:input path="receiptdeliveryorderid" htmlEscape="false" maxlength="40" style="width:100px" class="input-xlarge "/></span>

		</div>
		</div>
	</form:form>
	<div class="breadcrumb">
			<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
			<th>前台销退号</th>
			<th>供应商ID</th>
			<th>订单号</th>
			<th>商品名称</th>
			<th>颜色值</th>
			<th>款式分类</th>
			<th>商品数量</th>
			<th>商品明细</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach items="${scmSupplierSrodetailList}" var="scmSupplierSrodetail">
			<tr>
			<td>${scmSupplierSrodetail.returnid}</td>
			<td>${scmSupplierSrodetail.supplierid}</td>
			<td>${scmSupplierSrodetail.orderid}</td>
			<td>${scmSupplierSrodetail.productname}</td>
			<td>${scmSupplierSrodetail.colorvalue}</td>
			<td>${scmSupplierSrodetail.colorclasscode}</td>
			<td>${scmSupplierSrodetail.productnumber}</td>
			<td>${scmSupplierSrodetail.productdetail}</td>		
			</tr>
		</c:forEach>
		</tbody>
	</table>
	</div>
	<div class="form-actions">
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
	</div>
</body>
</html>