<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>配送公司面单管理</title>
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
		<li class="active"><a href="${ctx}/vws/carrierdeliverorderid/">配送公司面单列表</a></li>
		<shiro:hasPermission name="vws:carrierdeliverorderid:edit"><li><a href="${ctx}/vws/carrierdeliverorderid/form">配送公司面单添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="carrierdeliverorderid" action="${ctx}/vws/carrierdeliverorderid/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>配送公司</th>
				
			
			<th>面单号</th>
			<th>状态</th>
				<shiro:hasPermission name="vws:carrierdeliverorderid:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="carrierdeliverorderid">
			<tr>
				
				<td>${carrierdeliverorderid.carrier.carriername}</td>
				<td>${carrierdeliverorderid.deliveryorderid}</td>
				<td>${fns:getDictLabel(carrierdeliverorderid.status, 'sys_used', '')}</td>
				<shiro:hasPermission name="vws:carrierdeliverorderid:edit"><td>
    				<a href="${ctx}/vws/carrierdeliverorderid/form?id=${carrierdeliverorderid.id}">修改</a>
					<a href="${ctx}/vws/carrierdeliverorderid/delete?id=${carrierdeliverorderid.id}" onclick="return confirmx('确认要删除该配送公司面单吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>