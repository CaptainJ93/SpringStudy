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
		<li class="active"><a href="${ctx}/deliveryfee/scmDeliveryfeePackagedetail/">配送费用计算列表</a></li>
		<shiro:hasPermission name="deliveryfee:scmDeliveryfeePackagedetail:edit"><li><a href="${ctx}/deliveryfee/scmDeliveryfeePackagedetail/form">配送费用计算添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="scmDeliveryfeePackagedetail" action="${ctx}/deliveryfee/scmDeliveryfeePackagedetail/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
			<label>配送公司:</label><sys:treeselectCode id="selectedcarrier" name="selectedcarrier" value="${scmDeliveryfeePackagedetail.selectedcarrier}" labelName="carrier.carriername" labelValue="${scmDeliveryfeePackagedetail.carrier.carriername}"	title="配送商" url="/sys/office/treeData?type=4" cssClass="required"/> 
			
				<label>开始日期：</label><input id="createDateStart"  name="createDateStart"  type="text" readonly="readonly" maxlength="20" class="input-medium Wdate" style="width:163px;"
				value="<fmt:formatDate value="${scmDeliveryfeePackagedetail.createDateStart}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'});"/>
			<label>结束日期：</label><input id="createDateEnd" name="createDateEnd" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate" style="width:163px;"
				value="<fmt:formatDate value="${scmDeliveryfeePackagedetail.createDateEnd}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'});"/>
					
					
		<ul class="ul-form">
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
			<th>配送公司编码</th>
		
				<shiro:hasPermission name="deliveryfee:scmDeliveryfeePackagedetail:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="scmDeliveryfeePackagedetail">
			<tr>
				<td>${scmDeliveryfeePackagedetail.selectedcarrier}</td>
			
			
			
				<shiro:hasPermission name="deliveryfee:scmDeliveryfeePackagedetail:edit"><td>
    				<a href="${ctx}/deliveryfee/scmDeliveryfeePackagedetail/form?id=${scmDeliveryfeePackagedetail.id}">修改</a>
					<a href="${ctx}/deliveryfee/scmDeliveryfeePackagedetail/delete?id=${scmDeliveryfeePackagedetail.id}" onclick="return confirmx('确认要删除该配送费用计算吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>