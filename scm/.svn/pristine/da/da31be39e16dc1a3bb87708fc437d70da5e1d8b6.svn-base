<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>配送公司地址管理</title>
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
		<li class="active"><a href="${ctx}/vws/carrieradress/">配送公司地址列表</a></li>
		<shiro:hasPermission name="vws:carrieradress:edit"><li><a href="${ctx}/vws/carrieradress/form">配送公司地址添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="carrieradress" action="${ctx}/vws/carrieradress/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
			<label>配送公司代码：</label><form:input path="carrierid" htmlEscape="false" maxlength="9" class="input-xlarge required digits"/>
			<label>配送公司名称：</label><form:input path="carriername" htmlEscape="false" maxlength="100" class="input-xlarge required"/>
		
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
                <th>联系人</th>
                <th>地址类型</th>
				<th>地址</th>
				<th>手机</th>
				<th>电话</th>
				<th>传真</th>
				<shiro:hasPermission name="vws:carrieradress:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="carrieradress">
			<tr><td>${carrieradress.carrier.carrierid}</td>
			<td>${carrieradress.carrier.carriername}	
				</td>
				<td>${carrieradress.contactperson}	
				</td>
				<td>${fns:getDictLabel(carrieradress.adresstype, 'sys_adresstype', '')}	
				</td>
				<td>${carrieradress.adress1}_${carrieradress.adress2}/${carrieradress.zipcode}	
				</td>
				<td>${carrieradress.mobilenumber}
				</td>
				<td>${carrieradress.phoneareacoder}${carrieradress.phonenumber}</td>
				<td>${carrieradress.faxareacode}${carrieradress.faxnumber}
				</td>
				<shiro:hasPermission name="vws:carrieradress:edit"><td>
    				<a href="${ctx}/vws/carrieradress/form?id=${carrieradress.id}">修改</a>
					<a href="${ctx}/vws/carrieradress/delete?id=${carrieradress.id}" onclick="return confirmx('确认要删除该配送公司地址吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>