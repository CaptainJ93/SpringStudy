<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>配送包裹管理</title>
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
		<li class="active"><a href="${ctx}/delivery/deliveryOrderintransit/">配送包裹列表</a></li>
		<shiro:hasPermission name="delivery:deliveryOrderintransit:edit"><li><a href="${ctx}/delivery/deliveryOrderintransit/form">配送包裹添加</a></li></shiro:hasPermission>
	</ul>
	<shiro:hasPermission name="delivery:deliveryOrderintransit:view">
	<form:form id="searchForm" modelAttribute="deliveryOrderintransit" action="${ctx}/delivery/deliveryOrderintransit/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		
			<div>
			<label>配送公司:</label><sys:treeselectCode id="selectedcarrier" name="selectedcarrier" value="${deliveryOrderintransit.selectedcarrier}" labelName="carrier.carriername" labelValue="${deliveryOrderintransit.carrier.carriername}"	title="配送商" url="/sys/office/treeData?type=4" cssClass="required"/> 
			<label>配送单号: </label><form:input path="trackingnumber" htmlEscape="false" maxlength="30" class="input-xlarge required digits"/><br><br>
			<label>开始日期：</label><input id="createDateStart"  name="createDateStart"  type="text" readonly="readonly" maxlength="20" class="input-medium Wdate" style="width:163px;"
				value="<fmt:formatDate value="${deliveryOrderintransit.createDateStart}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'});"/>
			<label>结束日期：</label><input id="createDateEnd" name="createDateEnd" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate" style="width:163px;"
				value="<fmt:formatDate value="${deliveryOrderintransit.createDateEnd}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'});"/>
			<label>包裹类型:：</label><form:select path="packagetype" class="input-medium">
					<form:option value="-1" label=""/>
					<form:options items="${fns:getDictList('Package_Type')}" itemLabel="label" itemValue="value" htmlEscape="false"/>
				</form:select>&nbsp;&nbsp;
			<label>包裹状态:：</label><form:select path="trackingstatus" class="input-medium">
					<form:option value="-1" label=""/>
					<form:options items="${fns:getDictList('Tracking_Status')}" itemLabel="label" itemValue="value" htmlEscape="false"/>
				</form:select>&nbsp;&nbsp;
			<input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/>&nbsp;&nbsp;&nbsp;&nbsp;<input id="btnReset" class="btn btn-primary" type="reset" value="取消"/>
		</div>
		
	</form:form>
</shiro:hasPermission>

	<shiro:hasPermission name="delivery:deliveryOrderintransit:logistics">
	<form:form id="logisticsForm" modelAttribute="deliveryOrderintransit" action="${ctx}/delivery/deliveryOrderintransit/logistics/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		
			<div>
			<label>配送单号: </label><form:input path="trackingnumber" htmlEscape="false" maxlength="30" class="input-xlarge required digits"/><br><br>
			&nbsp;&nbsp;
			<input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/>&nbsp;&nbsp;&nbsp;&nbsp;<input id="btnReset" class="btn btn-primary" type="reset" value="取消"/>
		</div>
		
	</form:form>
</shiro:hasPermission>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
			<th>包裹类型</th>
			<th>面单号</th>
			<th>配送公司</th>
			<th>收件人</th>
			<th>联系方式</th>
			<th>地址</th>
			<th>重量</th>
			<th>代收金额</th>
			<th>出货时间</th>
			<th>配送时间</th>
			<th>包裹状态码</th>
			<th>备注信息</th>
			
			<shiro:hasPermission name="delivery:deliveryOrderintransit:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="deliveryOrderintransit">
			<tr>
			<td>${fns:getDictLabel(deliveryOrderintransit.packagetype, 'Package_Type', '')}</td>
			<td>
			<shiro:hasPermission name="delivery:deliveryOrderintransit:view">
			<a href="${ctx}/delivery/deliveryOrderintransit/deliveryDetail?id=${deliveryOrderintransit.id}">
			${deliveryOrderintransit.trackingnumber}</a>
			</shiro:hasPermission>
			<shiro:hasPermission name="delivery:deliveryOrderintransit:logistics">
			
			${deliveryOrderintransit.trackingnumber}
			</shiro:hasPermission>
			</td>
			<td>${deliveryOrderintransit.carrier.carriername}</td>
			<td>${deliveryOrderintransit.customername}</td>
			<td>${deliveryOrderintransit.customertelnumber}/${deliveryOrderintransit.customermobnumber}</td>
			<td>${deliveryOrderintransit.receivingaddress1}${deliveryOrderintransit.receivingaddress2}</td>
			<td>${deliveryOrderintransit.packageweight}</td>
			<td>${deliveryOrderintransit.packagecodnum}</td>
			<td><fmt:formatDate value="${deliveryOrderintransit.actualshipdate}" pattern="yyyy-MM-dd HH:mm:ss"/> </td>
			<td><fmt:formatDate value="${deliveryOrderintransit.receiptorrejecttime}" pattern="yyyy-MM-dd HH:mm:ss"/> </td>
			<td>${fns:getDictLabel(deliveryOrderintransit.trackingstatus, 'Tracking_Status', '')}	</td>
			<td>${deliveryOrderintransit.packageremark}</td>
			
			 <shiro:hasPermission name="delivery:deliveryOrderintransit:edit"><td>
    				<a href="${ctx}/delivery/deliveryOrderintransit/form?id=${deliveryOrderintransit.id}">修改</a>
					<a href="${ctx}/delivery/deliveryOrderintransit/delete?id=${deliveryOrderintransit.id}" onclick="return confirmx('确认要删除该配送包裹吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>