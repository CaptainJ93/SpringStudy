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
	</ul>

	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
			<th>配送公司代码</th>
			<th>配送公司名称</th>
			<th>最后修改日期</th>
			<th>是否有效</th>
			
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="carrierInfo">
			<tr>
			<td>${carrierInfo.carrierid}	
				</td>
				<td>${carrierInfo.carriername}
				</td>
				<td>
					<fmt:formatDate value="${carrierInfo.updateDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>
				<td>${fns:getDictLabel(carrierInfo.freeze, 'yes_no', '')}
				</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>