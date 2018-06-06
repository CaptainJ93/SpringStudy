<%@page import="com.best1.scm.common.utils.SCMConstants"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<% request.setAttribute("orderStatusShippingInProgress", SCMConstants.ORDER_STATUS_SHIPPING_IN_PROGRESS); %>
<% request.setAttribute("orderStatusShippingConfirmed", SCMConstants.ORDER_STATUS_SHIPPING_CONFIRMED); %>
<html>
<head>
	<title>指送订单管理</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function() {
			$("#btnDownloadList").click(function () {
				downloadWithForm("${ctx}/supplier/scmSupplierCsoinfo/downloadList");
			});
			$("#btnDownloadShipConfirmList").click(function () {
				downloadWithForm("${ctx}/supplier/scmSupplierCsoinfo/downloadShipConfirmList");
			});
			$("#btnDownloadLogisticsDeptExcel").click(function () {
				downloadWithForm("${ctx}/supplier/scmSupplierCsoinfo/downloadLogisticsDeptExcel");
			});
			$("#searchForm").validate({
				errorPlacement: function(error, element) {
					if (element.is(":checkbox")||element.is(":radio")||element.parent().is(".input-append")){
						error.appendTo(element.parent().parent());
					} else {
						error.insertAfter(element);
					}
				}
			});
		});
		function downloadWithForm(url) {
			var searchForm = $("#searchForm");
			var defaultUrl = $(searchForm).attr("action");
			$(searchForm).attr("action", url);
			searchForm.submit();
			$(searchForm).attr("action", defaultUrl);
		}
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
		<li class="active"><a href="${ctx}/supplier/scmSupplierCsoinfo/">指送订单列表</a></li>
		<shiro:hasPermission name="supplier:scmSupplierCsoinfo:shipConfirm">
			<li><a href="${ctx}/supplier/scmSupplierCsoinfo/batchShipConfirm">批量出货确认</a></li>
		</shiro:hasPermission>
		<shiro:hasPermission name="supplier:scmSupplierCsoinfo:print">
			<li><a href="${ctx}/supplier/scmSupplierCsoinfo/printList">面单打印</a></li>
		</shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="scmSupplierCsoinfo" action="${ctx}/supplier/scmSupplierCsoinfo/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			<li><label>商品代码：</label>
				<form:input path="productid" htmlEscape="false" maxlength="6" class="input-medium digits"/>
			</li>
			<li><label>订单号：</label>
				<form:input path="orderid" htmlEscape="false" maxlength="9" class="input-medium digits"/>
			</li>
			<li><label>订单序号：</label>
				<form:input path="itemid" htmlEscape="false" maxlength="2" class="input-medium digits"/>
			</li>
		</ul>
		<ul class="ul-form">
			<li><label>起始日期：</label>
				<input name="criteria.createDateFrom" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate"
					value="<fmt:formatDate value="${scmSupplierCsoinfo.criteria.createDateFrom}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:true});"/>
			</li>
			<li><label>截止日期：</label>
				<input name="criteria.createDateTo" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate"
					value="<fmt:formatDate value="${scmSupplierCsoinfo.criteria.createDateTo}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:true});"/>
			</li>
			<li><label>订单状态：</label>
				<form:select path="orderstatus" class="input-medium">
					<form:option value="" label="请选择"/>
					<form:options items="${fns:getDictList('OrderStatus')}" itemLabel="label" itemValue="value" htmlEscape="false"/>
				</form:select>
			</li>
		</ul>
		<ul class="ul-form">
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<shiro:hasPermission name="supplier:scmSupplierCsoinfo:download">
				<li class="btns"><input id="btnDownloadList" class="btn btn-primary" type="button" value="导出列表" /></li>
			</shiro:hasPermission>
			<shiro:hasPermission name="supplier:scmSupplierCsoinfo:downloadLogisticsDeptExcel">
				<li class="btns"><input id="btnDownloadLogisticsDeptExcel" class="btn btn-primary" type="button" value="导出出货明细列表" /></li>
			</shiro:hasPermission>
			<shiro:hasPermission name="supplier:scmSupplierCsoinfo:shipConfirm">
				<li class="btns"><input id="btnDownloadShipConfirmList" class="btn btn-primary" type="button" value="导出出货确认模板"></li>
			</shiro:hasPermission>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>序号</th>
				<th>商品代码</th>
				<th>订单号</th>
				<th>订单序号</th>
				<th>订单状态</th>
				<th>代收金额</th>
				<th>商品名称</th>
				<th>商品数量</th>
				<th>商品款式</th>
				<th>商品颜色</th>
				<th>通路</th>
				<th>商品供应商公司名</th>
				<th>收货地址1</th>
				<th>收货地址2</th>
				<th>客户姓名</th>
				<th>客户身份证</th>
				<th>电话</th>
				<th>手机</th>
				<th>配送单号</th>
				<th>子配送类别</th>
				<th>推荐的配送公司</th>
				<th>选择的配送公司</th>
				<th>仓库指送</th>
				<th>配送指示</th>
				<th>创建时间</th>
				<th>操作人</th>
				<th>操作时间</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="scmSupplierCsoinfo">
			<tr>
				<td>
					${page.getElementNo(scmSupplierCsoinfo)}
				</td>
				<td>
					${scmSupplierCsoinfo.productid}
				</td>
				<td>
					${scmSupplierCsoinfo.orderid}
				</td>
				<td>
					${scmSupplierCsoinfo.itemid}
				</td>
				<td>
					${fns:getDictLabel(scmSupplierCsoinfo.orderstatus, 'OrderStatus', '')}
				</td>
				<td>
					${scmSupplierCsoinfo.codamount}
				</td>
				<td>
					${scmSupplierCsoinfo.productname}
				</td>
				<td>
					${scmSupplierCsoinfo.productquantity}
				</td>
				<td>
					${scmSupplierCsoinfo.productstyledescription}
				</td>
				<td>
					${scmSupplierCsoinfo.productcolourdescription}
				</td>
				<td>
					${scmSupplierCsoinfo.subchannelid}
				</td>
				<td>
					${scmSupplierCsoinfo.suppliercompanyname}
				</td>
				<td>
					${scmSupplierCsoinfo.deliveryaddress1}
				</td>
				<td>
					${scmSupplierCsoinfo.deliveryaddress2}
				</td>
				<td>
					${scmSupplierCsoinfo.customername}
				</td>
				<shiro:hasPermission name="supplier:scmSupplierCsoinfo:table_idcard">
				<td>
					${scmSupplierCsoinfo.idcard}
				</td>
				</shiro:hasPermission>
				<td>
					${scmSupplierCsoinfo.hometelephone1}
				</td>
				<td>
					${scmSupplierCsoinfo.mobileno1}
				</td>
				<td>
					${scmSupplierCsoinfo.deliveryorderid}
				</td>
				<td>
					${fns:getDictLabel(scmSupplierCsoinfo.subdeliverytype, 'SubDeliveryType', '')}
				</td>
				<td>
					${scmSupplierCsoinfo.carrieridprimaryname}
				</td>
				<td>
					${scmSupplierCsoinfo.selectedcarriername}
				</td>
				<td>
					${scmSupplierCsoinfo.instructiontowms}
				</td>
				<td>
					${scmSupplierCsoinfo.instructiontoscm}
				</td>
				<td>
					<fmt:formatDate value="${scmSupplierCsoinfo.recordcreatedtime}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>
				<td>
					${scmSupplierCsoinfo.lastupdatedbyUsername}
				</td>
				<td>
					<fmt:formatDate value="${scmSupplierCsoinfo.lastupdatedtime}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>
				<shiro:hasPermission name="supplier:scmSupplierCsoinfo:shipConfirm">
				<td>
					<c:if test="${scmSupplierCsoinfo.orderstatus eq orderStatusShippingInProgress}">
	    				<a href="${ctx}/supplier/scmSupplierCsoinfo/shipConfirmForm?csoInfo.id=${scmSupplierCsoinfo.id}">出货确认</a>
					</c:if>
				</td>
				</shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>