<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>按城市统计报表--城市封发占比</title>
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
		<li class="active"><a href="${ctx}/deliveryquality/reportbycity/listtimeareaproportion">每月-大区封发占比</a></li>
	</ul>
	<shiro:hasPermission name="delivery:deliveryOrderintransit:view">
	<form:form id="searchForm" modelAttribute="deliveryQualityReportTimeAreaProportion" action="${ctx}/deliveryquality/reportbycity/listtimeareaproportion" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		
			<div>
			<label>配送公司:</label><sys:treeselectCode id="selectedcarrier" name="selectedcarrier" value="${deliveryQualityReportTimeAreaProportion.selectedcarrier}" labelName="carrier.carriername" labelValue="${deliveryQualityReportTimeAreaProportion.carrier.carriername}"	title="配送商" url="/sys/office/treeData?type=4" cssClass="required"/> 
		
			<label>开始日期：</label><input id="createDateStart"  name="createDateStart"  type="text" readonly="readonly" maxlength="20" class="input-medium Wdate" style="width:163px;"
				value="<fmt:formatDate value="${deliveryQualityReportTimeAreaProportion.createDateStart}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'});"/>
			<label>结束日期：</label><input id="createDateEnd" name="createDateEnd" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate" style="width:163px;"
				value="<fmt:formatDate value="${deliveryQualityReportTimeAreaProportion.createDateEnd}" pattern="yyyy-MM-dd HH:mm:ss"/>"
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
			<th>日期</th>
			<th>配送公司编码</th>
			<th>配送公司</th>
			<th> 时区</th>
			<th>时区内总量</th>
			<th>时区内每家占量</th>
			<th>时区内每家量占比</th>
			<th>及时签收量</th>
			<th>及时占比</th>
			<th>绝对签收量</th>
			<th>绝对占比</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="deliveryQualityReportTimeAreaProportion">
			<tr>
			<td><fmt:formatDate value="${deliveryQualityReportTimeAreaProportion.everyday}" pattern="yyyy-MM-dd"/></td>
			<td>${deliveryQualityReportTimeAreaProportion.selectedcarrier}</td>
			<td>${deliveryQualityReportTimeAreaProportion.carrier.carriername}</td>
	        <td>${deliveryQualityReportTimeAreaProportion.timearea}</td>
			
			<td>${deliveryQualityReportTimeAreaProportion.carriertimeareatotalnum}</td>
			<td>${deliveryQualityReportTimeAreaProportion.timeareatotalnum}</td>
			<td><fmt:formatNumber type="percent"    maxIntegerDigits="3" maxFractionDigits="2"  value="${deliveryQualityReportTimeAreaProportion.timeareatotalnum/deliveryQualityReportTimeAreaProportion.carriertimeareatotalnum}" /></td>
			<td>${deliveryQualityReportTimeAreaProportion.signInTimeNum}</td>
			<td><fmt:formatNumber type="percent"    maxIntegerDigits="3" maxFractionDigits="2"  value="${deliveryQualityReportTimeAreaProportion.signInTimeNum/deliveryQualityReportTimeAreaProportion.timeareatotalnum}" /></td>
			<td>${deliveryQualityReportTimeAreaProportion.signNum}</td>
			<td><fmt:formatNumber type="percent"    maxIntegerDigits="3" maxFractionDigits="2"  value="${deliveryQualityReportTimeAreaProportion.signNum/deliveryQualityReportTimeAreaProportion.timeareatotalnum}" /></td>
			
			
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>