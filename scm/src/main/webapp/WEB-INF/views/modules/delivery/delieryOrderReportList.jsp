<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>配送包裹监控管理</title>
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
		<li class="active"><a href="${ctx}/delivery/deliveryOrderintransit/deliverReportList">配送公司包裹监控</a></li>
	</ul>
	<shiro:hasPermission name="delivery:deliveryOrderintransit:view">
	<form:form id="searchForm" modelAttribute="delieryOrderReport"    action="${ctx}/delivery/deliveryOrderintransit/deliverReportList" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		
			<div>
			<label>配送公司:</label><sys:treeselectCode id="selectedcarrier" name="selectedcarrier" value="${delieryOrderReport.selectedcarrier}" labelName="carrier.carriername" labelValue="${delieryOrderReport.carrier.carriername}"	title="配送商" url="/sys/office/treeData?type=4" cssClass="required"/> 
			<label>开始日期：</label><input id="createDateStart"  name="createDateStart"  type="text" readonly="readonly" maxlength="20" class="input-medium Wdate" style="width:163px;"
				value="<fmt:formatDate value="${delieryOrderReport.createDateStart}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'});"/>
			<label>结束日期：</label><input id="createDateEnd" name="createDateEnd" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate" style="width:163px;"
				value="<fmt:formatDate value="${delieryOrderReport.createDateEnd}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'});"/>
			&nbsp;&nbsp;
			<input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/>&nbsp;&nbsp;&nbsp;&nbsp;<input id="btnReset" class="btn btn-primary" type="reset" value="取消"/>
		</div>
		
	</form:form>
</shiro:hasPermission>

	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
		    <th>配送公司</th>
			<th>包裹数</th>
			<th>包裹占比</th>
			<th>包裹金额</th>
			<th>妥投数</th>
			<th>妥投金额</th>
			<th>妥投率</th>
			<th>拒收数</th>
			<th>拒收金额</th>
			<th>拒收率</th>
			<th>配送中</th>
			<th>半签半退</th>
			<th>未回款金额</th>
			
			</tr>
		</thead>
		<tbody>
		<c:set var="count" value="0"/>
		<c:forEach items="${page.list}" var="deliverReport">
		<c:set var="count" value="${count+deliverReport.packagesum }"/>
		</c:forEach>
		<c:forEach items="${page.list}" var="deliverReport">
		
			<tr>
			<td>${deliverReport.carrier.carriername}</td>
			<td>${deliverReport.packagesum}</td>
			<td><fmt:formatNumber type="percent"    maxIntegerDigits="3" maxFractionDigits="2" value="${deliverReport.packagesum/count}" /></td>
			<td>${deliverReport.packagesamount}</td>
			<td>${deliverReport.deliveredsum}</td>
			<td>${deliverReport.deliveredamount}</td>
			<td><fmt:formatNumber type="percent"    maxIntegerDigits="3" maxFractionDigits="2" value="${deliverReport.deliveredsum/deliverReport.packagesum}" /></td>
			<td>${deliverReport.refusedsum}</td>
			<td>${deliverReport.refusedamount}</td>
			<td><fmt:formatNumber type="percent"    maxIntegerDigits="3" maxFractionDigits="2" value="${deliverReport.refusedpercent/deliverReport.packagesum}" /></td>
			<td>${deliverReport.distributioninsum}</td>
			<td>${deliverReport.signforpackage}</td>
			<td>${deliverReport.noreceivedpayments}</td>
			</tr>
		</c:forEach>
		<c:if test="${count>0}">
		<tr>
		<td>总包裹数</td>
		<td colspan="12"><c:out value="${count}"/></td></tr>
		</c:if>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>