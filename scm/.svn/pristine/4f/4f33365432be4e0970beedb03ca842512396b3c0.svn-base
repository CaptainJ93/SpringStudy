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
		<li class="active"><a href="${ctx}/deliveryfee/scmDeliveryfeePackagedetail/listintime">配送费用计算列表</a></li>
	</ul>
	<form:form id="searchForm" modelAttribute="scmDeliveryfeePackagedetail" action="${ctx}/deliveryfee/scmDeliveryfeePackagedetail/listintime" method="post" class="breadcrumb form-search">
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
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
			<th>配送公司编码</th>
			<th>快递单号</th>
			<th>实际出货时间</th>
			<th>收件地邮编</th>
			<th>收件地址</th>
			<th>包裹重量</th>
			<th>cod金额</th>
			<th>首重</th>
			<th>首重价格</th>
			<th>首重金额</th>
			<th>续重单位</th>
			<th>续重单价</th>
			<th>续重金额</th>
			<th>COD金额</th>
			<th>COD费率</th>
			<th>COD费用</th>
			<th>首续重费用</th>
			<th>总运费</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="scmDeliveryfeePackagedetail">
			<tr>
				<td>${scmDeliveryfeePackagedetail.selectedcarrier}</td>
				<td>${scmDeliveryfeePackagedetail.trackingnumber}</td>
				<td><fmt:formatDate value="${scmDeliveryfeePackagedetail.actualshipdate}" pattern="yyyy-MM-dd HH:mm:ss"/> </td>
				<td>${scmDeliveryfeePackagedetail.receivingzipcode}</td>
				<td>${scmDeliveryfeePackagedetail.receivingaddress1}</td>
				<td>${scmDeliveryfeePackagedetail.packageweight}</td>
				<td>${scmDeliveryfeePackagedetail.packagecodnum}</td>
				
				<td>${scmDeliveryfeePackagedetail.fheavy}</td>
				<td>${scmDeliveryfeePackagedetail.fheavyprice}</td>
				<td>${scmDeliveryfeePackagedetail.fheavynum}</td>
				
				<td>${scmDeliveryfeePackagedetail.cheavyunit}</td>
				<td>${scmDeliveryfeePackagedetail.cheavyunitprice}</td>
				<td>
					<fmt:formatNumber type="number"  maxFractionDigits="2"  value="${scmDeliveryfeePackagedetail.cheavynum}" />
				</td>
			
			    <td>${scmDeliveryfeePackagedetail.packagecodnum}</td>
				<td>${scmDeliveryfeePackagedetail.codfeerate}</td>
				<td>
					<fmt:formatNumber type="number"  maxFractionDigits="2"  value="${scmDeliveryfeePackagedetail.codfeenum}" />
				</td>
				<td>
					<fmt:formatNumber type="number"  maxFractionDigits="2"  value="${scmDeliveryfeePackagedetail.fheavynum+scmDeliveryfeePackagedetail.cheavynum}" />
				</td>
				<td>
					<fmt:formatNumber type="number"  maxFractionDigits="2"  value="${scmDeliveryfeePackagedetail.resultnum}" />
				</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>