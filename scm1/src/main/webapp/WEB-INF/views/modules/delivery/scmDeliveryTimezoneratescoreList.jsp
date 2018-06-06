<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>配送大区评分管理</title>
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
		<li class="active"><a href="${ctx}/delivery/scmDeliveryTimezoneratescore/">配送大区评分列表</a></li>
		<shiro:hasPermission name="delivery:scmDeliveryTimezoneratescore:edit"><li><a href="${ctx}/delivery/scmDeliveryTimezoneratescore/form">配送大区评分添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="scmDeliveryTimezoneratescore" action="${ctx}/delivery/scmDeliveryTimezoneratescore/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		
		<label>大区：</label><form:input path="hourzone" htmlEscape="false" maxlength="9" class="input-xlarge required digits"/>
		
		
		<ul class="ul-form">
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
	
	
		<thead>
			<tr>
						<th>大区</th>
                <th>比例起</th>
                <th>比例止</th>
                <th>得分</th>
              
				<shiro:hasPermission name="delivery:scmDeliveryTimezoneratescore:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="scmDeliveryTimezoneratescore">
			<tr>
	
                <td>${scmDeliveryTimezoneratescore.hourzone}</td>
			<td>${scmDeliveryTimezoneratescore.ratebegin}</td>
			<td>${scmDeliveryTimezoneratescore.rateend}</td>
			<td>${scmDeliveryTimezoneratescore.ratescore}</td>
	
				<shiro:hasPermission name="delivery:scmDeliveryTimezoneratescore:edit"><td>
    				<a href="${ctx}/delivery/scmDeliveryTimezoneratescore/form?id=${scmDeliveryTimezoneratescore.id}">修改</a>
					<a href="${ctx}/delivery/scmDeliveryTimezoneratescore/delete?id=${scmDeliveryTimezoneratescore.id}" onclick="return confirmx('确认要删除该配送大区评分吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>