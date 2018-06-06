<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>配送包裹详细信息</title>
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
		<li><a href="${ctx}/delivery/deliveryOrderintransit/">配送包裹列表</a></li>
		<li class="active"><a href="${ctx}/delivery/deliveryOrderintransit/form?id=${deliveryOrderintransit.id}">配送包裹<shiro:hasPermission name="delivery:deliveryOrderintransit:edit">${not empty deliveryOrderintransit.id?'修改':'添加'}</shiro:hasPermission><shiro:lacksPermission name="delivery:deliveryOrderintransit:edit">查看</shiro:lacksPermission></a></li>
	</ul><br/>
	<form:form id="inputForm" modelAttribute="deliveryOrderintransit" action="${ctx}/delivery/deliveryOrderintransit/save" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<sys:message content="${message}"/>	
		
		<div class="container-fluid breadcrumb">
		<div class="row-fluid span12">
			<span class="span4">仓库编码: ${deliveryOrderintransit.warehouseid}---${fns:getDictLabel(deliveryOrderintransit.warehouseid, 'Warehouse_Code', '')} </span>
			<span class="span4">配送公司: <b>${deliveryOrderintransit.carrier.carriername}</b></span>
			<span class="span4">快递单号: <b>${deliveryOrderintransit.trackingnumber}</b></span>	
		</div>
		<div class="row-fluid span12">
			<span class="span4">配送区域: <b>${deliveryOrderintransit.carrierzipcode.deliveryarea}</b></span>
			<span class="span4">时效: <b>${deliveryOrderintransit.carrierzipcode.limitations}</b></span>
			<span class="span4">预计到达时间: <b></b></span>
			<!-- 
			
			fns:addHours(deliveryOrderintransit.actualshipdate, deliveryOrderintransit.carrierzipcode.limitations) -->
		</div>
		
		<div class="row-fluid span8">
			<span class="span4">客户代码: ${deliveryOrderintransit.customerid}</span>
			<span class="span4">收件人: ${deliveryOrderintransit.customername}</span>	
			<span class="span4">联系方式: <b>${deliveryOrderintransit.customertelnumber}/${deliveryOrderintransit.customermobnumber}</b></span>
		</div>
		<div class="row-fluid span8">
			<span class="span4">收件地址: ${deliveryOrderintransit.receivingaddress1}${deliveryOrderintransit.receivingaddress2}</span>
			<span class="span4">包裹重量: ${deliveryOrderintransit.packageweight}</span>	
			<span class="span4">代收货款金额: ${deliveryOrderintransit.packagecodnum}</span>
		</div>
		
		
		<div class="row-fluid span8">
			<span class="span4">包裹备注信息：${deliveryOrderintransit.packageremark}</span>
	        <span class="span4">实际出货日期时间：<fmt:formatDate value="${deliveryOrderintransit.actualshipdate}" pattern="yyyy-MM-dd HH:mm:ss"/></span>
			<span class="span4">包裹状态码：${fns:getDictLabel(deliveryOrderintransit.trackingstatus, 'Tracking_Status', '')}</span>
	 </div>
		
		
		<div class="row-fluid span8">
			<span class="span4">记录创建时间: <fmt:formatDate value="${deliveryOrderintransit.recordcreatedtime}" pattern="yyyy-MM-dd HH:mm:ss"/></span>
			<span class="span4">记录创建人: ${deliveryOrderintransit.recordcreatedby}</span>
			<span class="span4">包裹类型：${fns:getDictLabel(deliveryOrderintransit.packagetype, 'Package_Type', '')}</span>	
	</div>
			<div class="row-fluid span8">
		<span class="span4">最后修改人: ${deliveryOrderintransit.lastupdatedby}</span>
		<span class="span4">最后修改时间: <fmt:formatDate value="${deliveryOrderintransit.lastupdatedtime}" pattern="yyyy-MM-dd HH:mm:ss"/></span>
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
			<th>订单金额</th>
			<th>订单配送状态</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach items="${deliveryOrderintransit.deliveryOrderintransitDetail}" var="deliveryOrderintransitDetail">
			<tr>
			<td>${deliveryOrderintransitDetail.orderid}</td>
			<td>${deliveryOrderintransitDetail.itemid}</td>
			<td>${deliveryOrderintransitDetail.productid}</td>
			<td>${deliveryOrderintransitDetail.productname}</td>
			<td>${deliveryOrderintransitDetail.colorvalue}</td>
			<td>${deliveryOrderintransitDetail.stylevalue}</td>
			<td>${deliveryOrderintransitDetail.productnum}</td>
			<td>${deliveryOrderintransitDetail.codnum}</td>
			<td>${fns:getDictLabel(deliveryOrderintransitDetail.orderdeliverystatus, 'Tracking_Status', '')}	</td>
		
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
			<th>签收/拒收时间</th>
			<th>签收人</th>
			<th>配送员</th>
			<th>配送员联系方式</th>
			<th>创建时间</th>
			<th>创建人</th>
			<th>路由状态码</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach items="${deliveryOrderintransit.deliveryOrderintransitPathdetail}" var="deliveryOrderintransitPathdetail">
			<tr>
			<td>${deliveryOrderintransitPathdetail.pathid}</td>
			<td>${deliveryOrderintransitPathdetail.pathdesc}</td>
			<td><fmt:formatDate value="${deliveryOrderintransitPathdetail.pathdatetime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
			<td><fmt:formatDate value="${deliveryOrderintransitPathdetail.receiptorrejecttime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
			<td>${deliveryOrderintransitPathdetail.receiptperson}</td>
			<td>${deliveryOrderintransitPathdetail.deliveryperson}</td>
			<td>${deliveryOrderintransitPathdetail.deliverypersoncontact}</td>
			<td><fmt:formatDate value="${deliveryOrderintransitPathdetail.recordcreatedtime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
			<td>${deliveryOrderintransitPathdetail.recordcreatedby}</td>
			<td>${fns:getDictLabel(deliveryOrderintransitPathdetail.deliverycode, 'Tracking_Status', '')}	</td>
		
			</tr>
		</c:forEach>
		</tbody>
	</table>
	</div>
	
	
		<div class="form-actions">
			<shiro:hasPermission name="delivery:deliveryOrderintransit:edit"><input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>&nbsp;</shiro:hasPermission>
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
	</form:form>
</body>
</html>