<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>配送费用计算管理</title>
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
		<li class="active"><a href="${ctx}/deliveryfee/scmDeliveryfeePrice/">配送费用计算列表</a></li>
		<shiro:hasPermission name="deliveryfee:scmDeliveryfeePrice:edit"><li><a href="${ctx}/deliveryfee/scmDeliveryfeePrice/form">配送费用计算添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="scmDeliveryfeePrice" action="${ctx}/deliveryfee/scmDeliveryfeePrice/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<div>
		<label>配送公司:</label><sys:treeselectCode id="selectedcarrier" name="selectedcarrier" value="${scmDeliveryfeePrice.selectedcarrier}" labelName="carrier.carriername" labelValue="${scmDeliveryfeePrice.carrier.carriername}"	title="配送商" url="/sys/office/treeData?type=4" cssClass="required"/> 
		<label>邮编：</label><form:input path="zipcode" htmlEscape="false" maxlength="9" class="input-xlarge required digits"/>
		<ul class="ul-form">
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="clearfix"></li>
		</ul>
		</div>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
			<th>配送公司编码</th>
			<th>邮编</th>
			<th>首重</th>
			<th>首重价格</th>
			<th>续重单位</th>
			<th>续重价格</th>
			<th>价格有效期起</th>
			<th>价格有效期止</th>
			<shiro:hasPermission name="deliveryfee:scmDeliveryfeePrice:edit"><th>操作</th></shiro:hasPermission>
			</tr>
			
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="scmDeliveryfeePrice">
			<tr>
			<td>${scmDeliveryfeePrice.selectedcarrier}</td>
			<td>${scmDeliveryfeePrice.zipcode}</td>
			<td>${scmDeliveryfeePrice.fheavy}</td>
			<td>${scmDeliveryfeePrice.fheavyprice}</td>
			<td>${scmDeliveryfeePrice.cheavyunit}</td>
			<td>${scmDeliveryfeePrice.cheavyunitprice}</td>
			<td><fmt:formatDate value="${scmDeliveryfeePrice.expbegindate}" pattern="yyyy-MM-dd HH:mm:ss"/> </td>
			<td><fmt:formatDate value="${scmDeliveryfeePrice.expenddate}" pattern="yyyy-MM-dd HH:mm:ss"/> </td>
		
				<shiro:hasPermission name="deliveryfee:scmDeliveryfeePrice:edit"><td>
    				<a href="${ctx}/deliveryfee/scmDeliveryfeePrice/form?id=${scmDeliveryfeePrice.id}">修改</a>
					<a href="${ctx}/deliveryfee/scmDeliveryfeePrice/delete?id=${scmDeliveryfeePrice.id}" onclick="return confirmx('确认要删除该配送费用计算吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>