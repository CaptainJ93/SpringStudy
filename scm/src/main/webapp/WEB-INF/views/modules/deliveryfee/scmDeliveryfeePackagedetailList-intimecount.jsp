<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@page import="java.util.HashMap"%> 
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
		<li class="active"><a href="${ctx}/deliveryfee/scmDeliveryfeePackagedetail/listintimecount">配送费用计算列表</a></li>
	</ul>
	<form:form id="searchForm" modelAttribute="scmDeliveryfeePackagedetail" action="${ctx}/deliveryfee/scmDeliveryfeePackagedetail/listintimecount" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
			<label>配送公司:</label><sys:treeselectCode id="selectedcarrier" name="selectedcarrier" value="${scmDeliveryfeePackagedetail.selectedcarrier}" labelName="carrier.carriername" labelValue="${scmDeliveryfeePackagedetail.carrier.carriername}"	title="配送商" url="/sys/office/treeData?type=4" cssClass="required"/> 
			
				<label>开始日期：</label><input id="createDateStart"  name="createDateStart"  type="text" readonly="readonly" maxlength="20" class="input-medium Wdate" style="width:163px;"
				value="<fmt:formatDate value="${scmDeliveryfeePackagedetail.createDateStart}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'});"/>
			    <label>结束日期：</label><input id="createDateEnd" name="createDateEnd" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate" style="width:163px;"
				value="<fmt:formatDate value="${scmDeliveryfeePackagedetail.createDateEnd}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'});"/>
					
				<label>计费结果:：</label><form:select path="deliveryfeeflag" class="input-medium">
					<form:option value="-1" label=""/>
					<form:options items="${fns:getDictList('deliveryfee_flag')}" itemLabel="label" itemValue="value" htmlEscape="false"/>
				</form:select>&nbsp;&nbsp;	
					
		<ul class="ul-form">
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<%
	if(null!=request.getAttribute("msg")){
		out.print("<font color='red'>"+request.getAttribute("msg")+"</font>");
	}
	%>
	
	<%
	    HashMap<String, String> resultHashmap = new HashMap<String, String>();
		if(null != request.getAttribute("resultHashmap")){
	    	resultHashmap =(HashMap<String, String>) request.getAttribute("resultHashmap");
		}
	%>
	
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
	
		<thead>
			<tr>
			 <th>包裹合计数量</th>
			 <th>合计总运费</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>
				<fmt:formatNumber type="number"  maxFractionDigits="2"  value="${resultHashmap.packagenum}" />
				</td>
				<td>
					<fmt:formatNumber type="number"  maxFractionDigits="2"  value="${resultHashmap.totalfee}" />
				</td>
			</tr>
		</tbody>
	
		
	</table>
	<div class="pagination">${page}</div>
</body>
</html>