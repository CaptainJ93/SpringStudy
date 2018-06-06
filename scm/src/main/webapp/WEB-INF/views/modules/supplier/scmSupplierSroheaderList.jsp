<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>退货单明细信息管理</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function() {
			
		});
		function page(n,s){
			$("#pageNo").val(n);
			$("#pageSize").val(s);
			$("#searchForm").submit();
        	return false;
        }
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/supplier/scmSupplierSroheader/">退货单明细信息列表</a></li>
	</ul>
	<form:form id="searchForm" modelAttribute="scmSupplierSroheader" action="${ctx}/supplier/scmSupplierSroheader/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
	<table>
		<tr width="90%">
			<td width="30%">仓库编号：
				<form:input path="warehouseid" htmlEscape="false" maxlength="20" class="input-medium"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</td>
			<td width="30%">前台销退号：
				<form:input path="returnid" htmlEscape="false" maxlength="20" class="input-medium"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</td>
			<td width="30%">客户编号：
				<form:input path="customerid" htmlEscape="false" maxlength="20" class="input-medium"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</td>
			
		</tr>
		<tr>
			<td>配送公司：
			<form:select path="selectedcarrier" class="input-medium required">
					<form:option value="" label="请选择"/>
					<form:options items="${carrierInfos}" itemLabel="carriername" itemValue="carrierid" htmlEscape="false"/>
			</form:select>
			</td>
			<td>收回状态：
				<form:select path="receiptstatus" class="input-medium">
					<form:option value="" label="请选择"/>
					<form:options items="${fns:getDictList('Receipt_Status')}" itemLabel="label" itemValue="value" htmlEscape="false"/>
				</form:select>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</td>
			<td>是否当面退款：
				<form:select path="isfacetofacerefund" class="input-medium">
					<form:option value="" label="请选择"/>
					<form:options items="${fns:getDictList('yes_no')}" itemLabel="label" itemValue="value" htmlEscape="false"/>
				</form:select>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</td>
			
		</tr>
		<tr>
			<td>销退类型：
				<form:select path="returntype" class="input-medium">
					<form:option value="" label="请选择"/>
					<form:options items="${fns:getDictList('ReturnOrderType')}" itemLabel="label" itemValue="value" htmlEscape="false"/>
				</form:select>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</td>
			<td>子配送方式：
				<form:select path="subdeliverytype" class="input-medium">
					<form:option value="" label="请选择"/>
					<form:options items="${fns:getDictList('SubDeliveryType')}" itemLabel="label" itemValue="value" htmlEscape="false"/>
				</form:select>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</td>
			<td>是否需要回收发票：
				<form:select path="isneedinvoice" class="input-medium">
					<form:option value="" label="请选择"/>
					<form:options items="${fns:getDictList('yes_no')}" itemLabel="label" itemValue="value" htmlEscape="false"/>
				</form:select>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</td>
		</tr>
		<tr>
			<td>销退建立时间起：
				<input name="returntimeStart" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate"
					value="<fmt:formatDate value="${scmSupplierSroheader.returntimeStart}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</td>
			<td>销退建立时间止：
				<input name="returntimeEnd" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate"
					value="<fmt:formatDate value="${scmSupplierSroheader.returntimeEnd}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</td>
			<td>收货成功时间起：
				<input name="receiptsuccesstimeStart" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate"
					value="<fmt:formatDate value="${scmSupplierSroheader.receiptsuccesstimeStart}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</td>
		</tr>
		<tr>
			<td>收货成功时间止：
				<input name="receiptsuccesstimeEnd" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate"
					value="<fmt:formatDate value="${scmSupplierSroheader.receiptsuccesstimeEnd}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</td>
			<td>记录创建时间起：
				<input name="recordcreatedtimeStart" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate"
					value="<fmt:formatDate value="${scmSupplierSroheader.recordcreatedtimeStart}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</td>
			<td>记录创建时间止：
				<input name="recordcreatedtimeEnd" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate"
					value="<fmt:formatDate value="${scmSupplierSroheader.recordcreatedtimeEnd}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</td>
		</tr>
		</table>
		<ul class="ul-form">
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</li>
			<li class="clearfix"></li>
		</ul>
		
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>前台销退号</th>
				<th>仓库编号</th>
				<th>邮编</th>
				<th>收货地址1</th>
				<th>收货地址2</th>
				<th>客户姓名</th>
				<th>客户电话号码</th>
				<th>客户手机号码</th>
				<th>销退建立时间</th>
				<th>销退类型</th>
				<th>客户编号</th>
				<th>配送公司</th>
				<th>是否当面退款</th>
				<th>当面退款cod金额</th>
				<th>是否需要回收发票</th>
				<th>收货成功时间</th>
				<th>收回使用的快递单号</th>
				<th>收回状态</th>
				<th>记录创建时间</th>
				<th>记录创建人</th>
				<th>修改时间</th>
				<th>子配送方式</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="scmSupplierSroheader">
			<tr>
				<td><a href="${ctx}/supplier/scmSupplierSroheader/form?id=${scmSupplierSroheader.id}&returnid=${scmSupplierSroheader.returnid}">
					${scmSupplierSroheader.returnid}</a>
				</td>
				<td>
					${scmSupplierSroheader.warehouseid}
				</td>
				<td>
					${scmSupplierSroheader.zipcode}
				</td>
				<td>
					${scmSupplierSroheader.receiveaddress1}
				</td>
				<td>
					${scmSupplierSroheader.receiveaddress2}
				</td>
				<td>
					${scmSupplierSroheader.customername}
				</td>
				<td>
					${scmSupplierSroheader.telephonenumber}
				</td>
				<td>
					${scmSupplierSroheader.mobilenumber}
				</td>
				<td>
					<fmt:formatDate value="${scmSupplierSroheader.returntime}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>
				<td>
					${fns:getDictLabel(scmSupplierSroheader.returntype, 'ReturnOrderType', '')}
				</td>
				<td>
					${scmSupplierSroheader.customerid}
				</td>
				<td>
					${scmSupplierSroheader.selectedcarriername}
				</td>
				<td>
					${fns:getDictLabel(scmSupplierSroheader.isfacetofacerefund, 'yes_no', '')}
				</td>
				<td>
					${scmSupplierSroheader.refundcodnumber}
				</td>
				<td>
					${fns:getDictLabel(scmSupplierSroheader.isneedinvoice, 'yes_no', '')}
				</td>
				<td>
					<fmt:formatDate value="${scmSupplierSroheader.receiptsuccesstime}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>
				<td>
					${scmSupplierSroheader.receiptdeliveryorderid}
				</td>
				<td>
					${fns:getDictLabel(scmSupplierSroheader.receiptstatus, 'Receipt_Status', '')}
				</td>
				<td>
					<fmt:formatDate value="${scmSupplierSroheader.recordcreatedtime}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>
				<td>
					${scmSupplierSroheader.recordcreatedby}
				</td>
				<td>
					<fmt:formatDate value="${scmSupplierSroheader.lastupdatedtime}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>
				<td>
					${fns:getDictLabel(scmSupplierSroheader.subdeliverytype, 'SubDeliveryType', '')}
				</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>