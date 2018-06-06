<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>供应商-商品信息管理</title>
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
		<li class="active"><a href="${ctx}/supplier/scmSupplierSkuinfo/">供应商-商品信息列表</a></li>
		<shiro:hasPermission name="supplier:scmSupplierSkuinfo:edit"></li></shiro:hasPermission>
	</ul>
	<c:set var="url" value="${ctx}/supplier/scmSupplierSkuinfo/home"></c:set>
	<shiro:hasPermission name="supplier:scmSupplierSkuinfo:supplier">
		<c:set var="url" value="${ctx}/supplier/scmSupplierSkuinfo/list4Supplier"></c:set>
	</shiro:hasPermission>
	<shiro:hasPermission name="supplier:scmSupplierSkuinfo:view">
		<c:set var="url" value="${ctx}/supplier/scmSupplierSkuinfo/list"></c:set>
	</shiro:hasPermission>
	<form:form id="searchForm" modelAttribute="scmSupplierSkuinfo" action="${url}" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			<shiro:hasPermission name="supplier:scmSupplierSkuinfo:supplier">
				<li><label>商品品号：</label>
					<form:input path="productid" htmlEscape="false" maxlength="10" class="input-medium"/>
				</li>
				<li><label>商品名称：</label>
					<form:input path="productname" htmlEscape="false" maxlength="50" class="input-medium"/>
				</li>
			</shiro:hasPermission>
			<shiro:hasPermission name="supplier:scmSupplierSkuinfo:view">
				<li><label>商品仓库编码：</label>
					<form:input path="productskucode" htmlEscape="false" maxlength="15" class="input-medium"/>
				</li><br><br>
				<li><label>商品版本号：</label>
					<form:input path="productversion" htmlEscape="false" maxlength="4" class="input-medium"/>
				</li>
				<li><label>供应商编号：</label>
					<form:input path="supplierid" htmlEscape="false" maxlength="10" class="input-medium"/>
				</li><br><br>		
			</shiro:hasPermission>
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/>&nbsp;&nbsp;&nbsp;&nbsp;<input id="btnReset" class="btn btn-primary" type="reset" value="取消"/></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>商品品号</th>
				<th>商品版本号</th>
				<th>商品名称</th>
				<th>颜色值</th>
				<th>款式值</th>
				<th>商品仓库编码</th>
				<th>供应商编号</th>
				<th>商品备注信息</th>
				<th>记录创建时间</th>
				<shiro:hasPermission name="supplier:scmSupplierSkuinfo:supplier"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="scmSupplierSkuinfo">
			<tr>
				<td>${scmSupplierSkuinfo.productid}
				</td>
				<td>
					${scmSupplierSkuinfo.productversion}
				</td>
				<td>
					${scmSupplierSkuinfo.productname}
				</td>
				<td>
					${scmSupplierSkuinfo.colorvalue}
				</td>
				<td>
					${scmSupplierSkuinfo.stylevalue}
				</td>
				<td>
					${scmSupplierSkuinfo.productskucode}
				</td>
				<td>
					${scmSupplierSkuinfo.supplierid}
				</td>
				<td>
					${scmSupplierSkuinfo.remark}
				</td>
				<td>
					<fmt:formatDate value="${scmSupplierSkuinfo.recordcreatedtime}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>
				<shiro:hasPermission name="supplier:scmSupplierSkuinfo:view"><td>
    				<a href="${ctx}/supplier/scmSupplierSkuinfo/adminskuinfoireport?id=${scmSupplierSkuinfo.id}" target="_blank">管理员条码打印</a>
				</td></shiro:hasPermission>
				<shiro:hasPermission name="supplier:scmSupplierSkuinfo:supplier"><td>
    				<a href="${ctx}/supplier/scmSupplierSkuinfo/skuinfoireport?id=${scmSupplierSkuinfo.id}" target="_blank">条码打印</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>