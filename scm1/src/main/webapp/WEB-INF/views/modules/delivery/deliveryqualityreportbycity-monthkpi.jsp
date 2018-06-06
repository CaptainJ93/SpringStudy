<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>每月-kpi考核</title>
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
		<li class="active"><a href="${ctx}/deliveryquality/monthkpi">每月--kpi考核</a></li>
	</ul>
	<shiro:hasPermission name="delivery:deliveryOrderintransit:view">
	<form:form id="searchForm" modelAttribute="deliveryQualityReportMonthKpi" action="${ctx}/deliveryquality/monthkpi" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		
			<div>
		
			<label>开始日期：</label><input id="createDateStart"  name="createDateStart"  type="text" readonly="readonly" maxlength="20" class="input-medium Wdate" style="width:163px;"
				value="<fmt:formatDate value="${deliveryQualityReportMonthKpi.createDateStart}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'});"/>
			<label>结束日期：</label><input id="createDateEnd" name="createDateEnd" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate" style="width:163px;"
				value="<fmt:formatDate value="${deliveryQualityReportMonthKpi.createDateEnd}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'});"/>
		
			
			<input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/>&nbsp;&nbsp;&nbsp;&nbsp;<input id="btnReset" class="btn btn-primary" type="reset" value="取消"/>
		</div>
		
	</form:form>
</shiro:hasPermission>
	<%
	if(null!=request.getAttribute("msg")){
		out.print("<font color='red'>"+request.getAttribute("msg")+"</font>");
	}
	
	%>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
			<th>配送公司编码</th>
			<th>配送公司</th>
			<th>时区</th>
			<th>时区内签收量</th>
			<th>时区内派送量</th>
			<th>签收占比</th>
			<th>Kpi得分</th>
			<th>时区内总量</th>
			<th>派送总量</th>
			<th>时区占比</th>
			<th>时区得分</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="deliveryQualityReportMonthKpi">
			<tr>
			<td>${deliveryQualityReportMonthKpi.selectedcarrier}</td>
			<td>${deliveryQualityReportMonthKpi.carrier.carriername}</td>
			<td>${deliveryQualityReportMonthKpi.timearea}</td>
			<td>${deliveryQualityReportMonthKpi.signNum}</td>
			<td>${deliveryQualityReportMonthKpi.deliverytotalNumByCarrier}</td>
				<td><fmt:formatNumber type="percent"    maxIntegerDigits="3" maxFractionDigits="2"  value="${deliveryQualityReportMonthKpi.signNum/deliveryQualityReportMonthKpi.deliverytotalNumByCarrier}" /></td>
				<td>${deliveryQualityReportMonthKpi.rateScore}</td>
				<td>${deliveryQualityReportMonthKpi.timeareaToatlNum}</td>
			<td>${deliveryQualityReportMonthKpi.deliverytotalNum}</td>
			<td><fmt:formatNumber type="percent"    maxIntegerDigits="3" maxFractionDigits="2"  value="${deliveryQualityReportMonthKpi.timeareaToatlNum/deliveryQualityReportMonthKpi.deliverytotalNum}" /></td>
			<td>
				<fmt:formatNumber type="number"    maxIntegerDigits="3" maxFractionDigits="2"  value="${deliveryQualityReportMonthKpi.timeareaScore/100}" />
			</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>