<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>配送包裹客诉处理header管理</title>
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
		<li class="active"><a href="${ctx}/delivery/scmComplaintHeader/supplier">配送包裹客诉处理header列表</a></li>
	</ul>
	<form:form id="searchForm" modelAttribute="scmComplaintHeader" action="${ctx}/delivery/scmComplaintHeader/supplier" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			
			<li><label>订单号:</label>
				<form:input path="orderid" htmlEscape="false" maxlength="10" class="input-medium"/>
			</li>			
			<li><label>配送单号:</label>
				<form:input path="trackingnumber" htmlEscape="false" maxlength="20" class="input-medium"/>
			</li>
			<li><label>商品名称:</label>
				<form:input path="productname" htmlEscape="false" maxlength="50" class="input-medium"/>
			</li>
			<li><label>客诉进度:</label>
				<form:select path="cphandledprogress" class="input-medium">
					<form:option value="-1" label=""/>
					<form:options items="${fns:getDictList('ComplaintProgress_Type')}" itemLabel="label" itemValue="value" htmlEscape="false"/>
				</form:select>&nbsp;&nbsp;
			</li>
			<li>
				<label>开始日期：</label><input id="createDateStart"  name="createDateStart"  type="text" readonly="readonly" maxlength="20" class="input-medium Wdate" style="width:163px;"
				value="<fmt:formatDate value="${scmComplaintHeader.createDateStart}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'});"/>
				
			</li>
			<li>
				<label>结束日期：</label><input id="createDateEnd" name="createDateEnd" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate" style="width:163px;"
				value="<fmt:formatDate value="${scmComplaintHeader.createDateEnd}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'});"/>
			</li>
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>客诉编号</th>
				<th>客诉进度</th>
				<th>客诉描述</th>
				<th>商品名称</th>
				<th>订单号</th>
				<th>配送单号</th>
				<th>客诉建立时间</th>				
				<th>收件人姓名</th>				
				<th>实际配送时间</th>
				<th>快递公司</th>	
				<th>客诉处理更新时间</th>				
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="scmComplaintHeader">
			<tr>
				<td><a href="${ctx}/delivery/scmComplaintDetail/list?cpid=${scmComplaintHeader.cpid}" target=_blank>
					${scmComplaintHeader.cpid}
				</a></td>
				<td>
					${fns:getDictLabel(scmComplaintHeader.cphandledprogress, 'ComplaintProgress_Type', '')}
				</td>
				<td>
					${scmComplaintHeader.cpdesc}
				</td>
				<td>
					${scmComplaintHeader.productname}
				</td>
				<td>
					${scmComplaintHeader.orderid}
				</td>
				<td>
					${scmComplaintHeader.trackingnumber}
				</td>
				<td>
					<fmt:formatDate value="${scmComplaintHeader.cpcreatedtime}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>			
				<td>
					${scmComplaintHeader.receivername}
				</td>				
				<td>
					<fmt:formatDate value="${scmComplaintHeader.actualshiptime}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>
				<td>
					${scmComplaintHeader.carrier.carriername}
				</td>
				<td>
					<fmt:formatDate value="${scmComplaintHeader.cphandledupdatetime}" pattern="yyyy-MM-dd HH:mm:ss"/>				
				</td>			
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>