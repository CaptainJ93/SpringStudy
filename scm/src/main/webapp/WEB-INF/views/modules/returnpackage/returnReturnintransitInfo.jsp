<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>退换货管理</title>
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
		<li><a href="${ctx}/returnpackage/returnReturnintransit/">退换货列表</a></li>
		<li class="active"><a href="${ctx}/returnpackage/returnReturnintransit/form?id=${returnReturnintransit.id}">退换货<shiro:hasPermission name="returnpackage:returnReturnintransit:edit">${not empty returnReturnintransit.id?'修改':'添加'}</shiro:hasPermission><shiro:lacksPermission name="returnpackage:returnReturnintransit:edit">查看</shiro:lacksPermission></a></li>
	</ul><br/>
	<form:form id="inputForm" modelAttribute="rdeturnReturnintransit" action="${ctx}/returnpackage/returnReturnintransit/save" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<sys:message content="${message}"/>	
		
			<div class="container-fluid breadcrumb">
		<div class="row-fluid span12">
			<span class="span4">仓库编码: ${rdeturnReturnintransit.warehouseid}---${fns:getDictLabel(rdeturnReturnintransit.warehouseid, 'Warehouse_Code', '')} </span>
			<span class="span4">配送公司: <b>${rdeturnReturnintransit.carrier.carriername}</b></span>
			<span class="span4">快递单号: <b>${rdeturnReturnintransit.receiptdeliveryorderid}</b></span>	
		</div>
			
			<div class="row-fluid span12">
			<span class="span4">配送区域: <b>${rdeturnReturnintransit.carrierzipcode.deliveryarea}</b></span>
			<span class="span4">时效: <b>${rdeturnReturnintransit.carrierzipcode.returntime}</b></span>
			<span class="span4">预计到达时间: <b></b></span>
			<!-- 
			
			fns:addHours(deliveryOrderintransit.actualshipdate, deliveryOrderintransit.carrierzipcode.limitations) -->
		</div>
		
		
		<div class="row-fluid span8">
			<span class="span4">客户代码: ${rdeturnReturnintransit.customerid}</span>
			<span class="span4">收件人: ${rdeturnReturnintransit.customername}</span>	
			<span class="span4">联系方式: <b>${rdeturnReturnintransit.telephonenumber}/${rdeturnReturnintransit.mobilenumber}</b></span>
		</div>
		<div class="row-fluid span8">
			<span class="span4">收件地址: ${rdeturnReturnintransit.receiveaddress1}${rdeturnReturnintransit.receiveaddress2}</span>
			<span class="span4">销退号: ${rdeturnReturnintransit.returnid}</span>	
			<span class="span4">销退建立时间: <fmt:formatDate value="${returnReturnintransit.returntime}" pattern="yyyy-MM-dd HH:mm:ss"/></span>
		</div>
		
		<div class="row-fluid span8">
			<span class="span4">销退类型: ${fns:getDictLabel(rdeturnReturnintransit.returntype, 'ReturnOrderType', '')}</span>
			<span class="span4">当面退款: ${rdeturnReturnintransit.isfacetofacerefund}</span>	
			<span class="span4">退款金额: ${returnReturnintransit.refundcodnumber}</span>
		</div>
		
	

			<div class="row-fluid span8">
			<span class="span4">收货成功时间: <fmt:formatDate value="${returnReturnintransit.receiptsuccesstime}" pattern="yyyy-MM-dd HH:mm:ss"/></span>
			<span class="span4">到达好易购仓库时间: <fmt:formatDate value="${returnReturnintransit.tohygwarehousetime}" pattern="yyyy-MM-dd HH:mm:ss"/></span>	
			<span class="span4">收货确认时间: <fmt:formatDate value="${returnReturnintransit.receiptconfirmtime}" pattern="yyyy-MM-dd HH:mm:ss"/></span>
		</div>
		
		<div class="row-fluid span8">
			<span class="span4">需要回收发票: ${rdeturnReturnintransit.isneedinvoice}</span>
			<span class="span4">销退状态：${fns:getDictLabel(returnReturnintransit.receiptstatus, 'Receipt_Status', '')}</span>	
			<span class="span4"> </span>
		</div>
		
		<div class="row-fluid span8">
			<span class="span4"></span>
	        <span class="span4"></span>
			<span class="span4"></span>
	 </div>
	
	
	</div>
	
<div class="breadcrumb">
			<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
			<th>订单号</th>
			<th>订单序号</th>
			<th>商品号</th>
			<th>商品名称</th>
			<th>颜色</th>
			<th>款式</th>
			<th>数量</th>
			<th>商品装箱明细</th>
			<th>商品明细</th>
		</tr>
		</thead>
		<tbody>
			<c:forEach items="${rdeturnReturnintransit.returnReturnintransitDetail}" var="returnReturnintransitDetail">
			<tr>
			
			<td>${returnReturnintransitDetail.orderid}</td>
			<td>${returnReturnintransitDetail.itemid}</td>
			<td>${returnReturnintransitDetail.productid}</td>
			<td>${returnReturnintransitDetail.productname}</td>
			<td>${returnReturnintransitDetail.colorvalue}</td>
			<td>${returnReturnintransitDetail.stylevalue}</td>
			<td>${returnReturnintransitDetail.productnumber}</td>
			<td>${returnReturnintransitDetail.productboxingdetail}</td>
			<td>${returnReturnintransitDetail.productdetail}</td>
			
			</tr>
		</c:forEach>
		</tbody>
	</table>
	</div>
	
	<div class="breadcrumb">
			<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
			<th>配送路由编号</th>
			<th>路由描述</th>
			<th>路由时间</th>
			<th>收货成功时间</th>
			
			<th>配送员</th>
			<th>配送员联系方式</th>
			<th>创建时间</th>
			<th>创建人</th>
			<th>路由状态码</th>
		</tr>
		</thead>
		<tbody>
		
	<c:forEach items="${rdeturnReturnintransit.returnReturnintransitPathdetail}" var="returnReturnintransitPathdetail">
			<tr>
			<td>${returnReturnintransitPathdetail.pathid}</td>
			<td>${returnReturnintransitPathdetail.pathdesc}</td>
			<td><fmt:formatDate value="${returnReturnintransitPathdetail.pathdatetime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
			<td><fmt:formatDate value="${returnReturnintransitPathdetail.receiptsuccesstime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
			<td>${returnReturnintransitPathdetail.receiptperson}</td>
			<td>${returnReturnintransitPathdetail.receiptpersoncontact}</td>
			<td><fmt:formatDate value="${returnReturnintransitPathdetail.recordcreatedtime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
			<td>${returnReturnintransitPathdetail.recordcreatedby}</td>
			<td>${fns:getDictLabel(returnReturnintransitPathdetail.returncode, 'Receipt_Status', '')}	</td>
		
			</tr>
		</c:forEach>
		</tbody>
	</table>
	</div>
	
	
		<div class="form-actions">
			<shiro:hasPermission name="returnpackage:returnReturnintransit:edit"><input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>&nbsp;</shiro:hasPermission>
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
	</form:form>
</body>
</html>