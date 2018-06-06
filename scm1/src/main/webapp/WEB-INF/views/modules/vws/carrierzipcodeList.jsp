<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>配送区域时效管理</title>
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
		<li class="active"><a href="${ctx}/vws/carrierzipcode/">配送区域时效列表</a></li>
		<shiro:hasPermission name="vws:carrierzipcode:edit"><li><a href="${ctx}/vws/carrierzipcode/form">配送区域时效添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="carrierzipcode" action="${ctx}/vws/carrierzipcode/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
			<label>配送公司代码：</label><form:input path="carrierid" htmlEscape="false" maxlength="9" class="input-xlarge required digits"/>
			<label>配送公司名称：</label><form:input path="carriername" htmlEscape="false" maxlength="100" class="input-xlarge required"/>
			
			<label>邮编：</label><form:input path="zipcode" htmlEscape="false" maxlength="100" class="input-xlarge required"/>
			<label>区域：</label><form:input path="deliveryarea" htmlEscape="false" maxlength="100" class="input-xlarge required"/>
		
		<ul class="ul-form">
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>配送商代码</th>
                <th>配送商</th>
                <th>邮编</th>
                <th>区域</th>
                <th>配送时效(小时)</th>
                 <th>回款时效(小时)</th>
                 <th>退货时效(小时)</th>
                <th>是否有效</th>
				<shiro:hasPermission name="vws:carrierzipcode:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="carrierzipcode">
			<tr>
			<td>${carrierzipcode.carrier.carrierid}</td>
			<td>${carrierzipcode.carrier.carriername}</td>
			<td>${carrierzipcode.area.zipcode}</td>
			<td>${carrierzipcode.deliveryarea}</td>
			<td>${carrierzipcode.limitations}</td>
			<td>${carrierzipcode.receivedpayments}</td>
			<td>${carrierzipcode.returntime}</td>
			<td>${fns:getDictLabel(carrierzipcode.freeze, 'yes_no', '')}</td>
			<shiro:hasPermission name="vws:carrierzipcode:edit"><td>
    				<a href="${ctx}/vws/carrierzipcode/form?id=${carrierzipcode.id}">修改</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>