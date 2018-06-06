<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>配送公司管理</title>
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
		<li class="active"><a href="${ctx}/vws/carrierInfo/">配送公司列表</a></li>
		<shiro:hasPermission name="vws:carrierInfo:edit"><li><a href="${ctx}/vws/carrierInfo/form">配送公司添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="carrierInfo" action="${ctx}/vws/carrierInfo/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<div>
		
			<label>配送公司代码：</label><form:input path="carrierid" htmlEscape="false" maxlength="9" class="input-xlarge required digits"/>
			<label>配送公司名称：</label><form:input path="carriername" htmlEscape="false" maxlength="100" class="input-xlarge required"/>
		
		</div>
		<ul class="ul-form">
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
			<th>配送公司代码</th>
			<th>配送公司名称</th>
			<th>最后修改日期</th>
			<th>是否有效</th>
			
				<shiro:hasPermission name="vws:carrierInfo:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="carrierInfo">
			<tr>
			<td>${carrierInfo.carrierid}	
				</td>
				<td>${carrierInfo.carriername}
				</td>
				<td><a href="${ctx}/vws/carrierInfo/form?id=${carrierInfo.id}">
					<fmt:formatDate value="${carrierInfo.updateDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</a></td>
				<td>${fns:getDictLabel(carrierInfo.freeze, 'yes_no', '')}
				</td>
				<shiro:hasPermission name="vws:carrierInfo:edit"><td>
    				<a href="${ctx}/vws/carrierInfo/form?id=${carrierInfo.carrierid}">修改</a>
					<a href="${ctx}/vws/carrierInfo/delete?id=${carrierInfo.carrierid}" onclick="return confirmx('确认要删除该配送公司吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>