<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>面单打印</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function() {
			$("#searchForm").validate({
				errorPlacement: function(error, element) {
					if (element.is(":checkbox")||element.is(":radio")||element.parent().is(".input-append")){
						error.appendTo(element.parent().parent());
					} else {
						error.insertAfter(element);
					}
				}
			});
			$("#dataForm").validate({
				errorPlacement: function(error, element) {
					if (element.is(":checkbox")||element.is(":radio")||element.parent().is(".input-append")){
						error.appendTo(element.parent().parent());
					} else {
						error.insertAfter(element);
					}
				}
			});
			$("#dataForm").submit(function() {
				var ids = buildIdArrStr();
				if (ids == "") {
					alert("请至少选择一项");
					return false;
				}
				$("#txtIds").val(ids);
				return true;
			});
			var select = false;
			$("#selectAll").click(function() {
				select = !select;
				$("input[name='chbSelect']").each(function() {
					$(this).attr("checked", select);
				});
			});
			$("#btnPrint").click(function() {
				var idArrStr = buildIdArrStr();
				if (idArrStr == "") {
					alert("请至少选择一项");
					return;
				}
				$("#printFormTxtIds").val(idArrStr);
				$("#printForm").submit();
			});
		});
		function buildIdArrStr() {
			var ids = $('input[name="chbSelect"]:checked');
			if (ids.size() == 0) {
				return "";
			}
			var idArrStr = "";
			ids.each(function() {
				idArrStr += $(this).val();
				idArrStr += ",";
			});
			return idArrStr;
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
		<li><a href="${ctx}/supplier/scmSupplierCsoinfo/">指送订单列表</a></li>
		<shiro:hasPermission name="supplier:scmSupplierCsoinfo:shipConfirm">
			<li><a href="${ctx}/supplier/scmSupplierCsoinfo/batchShipConfirm">批量出货确认</a></li>
		</shiro:hasPermission>
		<shiro:hasPermission name="supplier:scmSupplierCsoinfo:print">
			<li class="active"><a href="${ctx}/supplier/scmSupplierCsoinfo/printList">面单打印</a></li>
		</shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="scmSupplierCsoinfo" action="${ctx}/supplier/scmSupplierCsoinfo/printList" method="post" class="breadcrumb form-search">
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
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
		</ul>
	</form:form>
	<form:form id="dataForm" modelAttribute="scmSupplierCsoinfo" action="${ctx}/supplier/scmSupplierCsoinfo/assignCarrier" method="post" class="breadcrumb form-search">
		<ul class="ul-form">
			<li><label>配送公司：</label>
				<select class="input-medium required" id="selectCarrier" name="selectCarrier">
					<option value="">请选择</option>
					<c:forEach items="${carrierdeliverorderidList}" var="carrierdeliverorderid">
						<option value="${carrierdeliverorderid.carrierid }">${carrierdeliverorderid.carrier.carriername }</option>
					</c:forEach>
				</select>
			</li>
			<li class="btns">
				<input type="submit" class="btn btn-primary" value="分派配送单号">
			</li>
			<li class="btns">
				<input type="button" id="btnPrint" class="btn btn-primary" value="打印面单">
			</li>
			<input type="hidden" name="ids" id="txtIds">
		</ul>
	</form:form>
	<form:form id="printForm" action="${ctx}/supplier/scmSupplierCsoinfo/print" target="_blank" method="post">
		<input type="hidden" name="ids" id="printFormTxtIds">
	</form:form>
	<div class="control-group">
		<div class="controls">
		</div>
	</div>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th><a id="selectAll" style="cursor: pointer;">全选</a></th>
				<th>序号</th>
				<th>商品代码</th>
				<th>订单号</th>
				<th>订单序号</th>
				<th>订单状态</th>
				<th>代收金额</th>
				<th>商品名称</th>
				<th>配送公司</th>
				<th>配送单号</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="scmSupplierCsoinfo">
			<tr>
				<td>
					<input type="checkbox" name="chbSelect" value="${scmSupplierCsoinfo.id }">
				</td>
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
					${scmSupplierCsoinfo.selectedcarriername}
				</td>
				<td>
					${scmSupplierCsoinfo.deliveryorderid}
				</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>