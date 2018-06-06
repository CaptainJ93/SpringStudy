<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>退换货管理</title>
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
		
		function buildDeliveryorderid(){
			alert('生成面单!!!');
			 var path = "${ctx}/returnpackage/returnReturnintransit/buildDeliveryorderid/";  
          $('#logisticsForm').attr("action", path).submit();
			//document.searchForm.action="${ctx}/returnpackage/returnReturnintransit/buildDeliveryorderid/"
			
		}
		
		function returnPackageIreport(){
			alert('打印面单!');
			 var path = "${ctx}/returnpackage/returnReturnintransit/returnpackageireport/";  
			 $("#logisticsForm").attr("target","blank");
          $('#logisticsForm').attr("action", path).submit();
			//document.searchForm.action="${ctx}/returnpackage/returnReturnintransit/returnpackageireport/"
			
		}
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/returnpackage/returnReturnintransit/">退换货列表</a></li>
		<shiro:hasPermission name="returnpackage:returnReturnintransit:edit"><li><a href="${ctx}/returnpackage/returnReturnintransit/form">退换货添加</a></li></shiro:hasPermission>

</ul>                     
	<shiro:hasPermission name="returnpackage:returnReturnintransit:view">
	<form:form id="searchForm" modelAttribute="returnReturnintransit" action="${ctx}/returnpackage/returnReturnintransit/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
			<label>配送公司:</label><sys:treeselectCode id="selectedcarrier" name="selectedcarrier" value="${returnReturnintransit.selectedcarrier}" labelName="carrier.carriername" labelValue="${returnReturnintransit.carrier.carriername}"	title="配送商" url="/sys/office/treeData?type=4" cssClass="required"/> 
			<label>配送单号: </label><form:input path="receiptdeliveryorderid" htmlEscape="false" maxlength="14" class="input-xlarge required digits"/><br><br>
			<label>销退号: </label><form:input path="returnid" htmlEscape="false" maxlength="9" class="input-xlarge required digits"/><br><br>
			
			<label>开始日期：</label><input id="createDateStart"  name="createDateStart"  type="text" readonly="readonly" maxlength="20" class="input-medium Wdate" style="width:163px;"
				value="<fmt:formatDate value="${returnReturnintransit.createDateStart}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'});"/>
			<label>结束日期：</label><input id="createDateEnd" name="createDateEnd" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate" style="width:163px;"
				value="<fmt:formatDate value="${returnReturnintransit.createDateEnd}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'});"/>
						<label>销退类型:：</label><form:select path="returntype" class="input-medium">
					<form:option value="-1" label=""/>
					<form:options items="${fns:getDictList('ReturnOrderType')}" itemLabel="label" itemValue="value" htmlEscape="false"/>
				</form:select>&nbsp;&nbsp;
				<label>包裹状态:：</label><form:select path="receiptstatus" class="input-medium">
					<form:option value="-1" label=""/>
					<form:options items="${fns:getDictList('Receipt_Status')}" itemLabel="label" itemValue="value" htmlEscape="false"/>
				</form:select>&nbsp;&nbsp;
			
			<input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/>&nbsp;&nbsp;&nbsp;&nbsp;
			<input id="btnReset" class="btn btn-primary" type="reset" value="取消"/>&nbsp;&nbsp;&nbsp;&nbsp;
			
		
	</form:form>
	</shiro:hasPermission>
	<shiro:hasPermission name="returnpackage:returnReturnintransit:logistics">
		<form:form id="logisticsForm" modelAttribute="returnReturnintransit" action="${ctx}/returnpackage/returnReturnintransit/logistics" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<label>配送单号: </label><form:input path="receiptdeliveryorderid" htmlEscape="false" maxlength="14" class="input-xlarge required digits"/>
		<label>销退号: </label><form:input path="returnid" htmlEscape="false" maxlength="9" class="input-xlarge required digits"/><br><br>
			
			&nbsp;&nbsp;
			
			<input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/>&nbsp;&nbsp;&nbsp;&nbsp;<input id="btnReset" class="btn btn-primary" type="reset" value="取消"/>&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;<input id="btnBuild"  onclick = "buildDeliveryorderid();"  class="btn btn-primary" type="reset" value="生成面单"/>&nbsp;&nbsp;&nbsp;&nbsp;
		<input id="btnBuild"  onclick = "returnPackageIreport();"  class="btn btn-primary" type="reset" value="打印面单"/>&nbsp;&nbsp;&nbsp;&nbsp;
	</form:form>
	</shiro:hasPermission>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
			<th>销退类型</th>
			<th>销退号</th>
			<th>面单号</th>
			<th>配送公司</th>
			<th>销退人</th>
			<th>联系方式</th>
			<th>地址</th>
			<th>是否当面退款</th>
			<th>代收金额</th>
			<th>退货时间</th>
			<th>包裹状态码</th>
			<shiro:hasPermission name="returnpackage:returnReturnintransit:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="returnReturnintransit">
			<tr>
				<td>${fns:getDictLabel(returnReturnintransit.returntype, 'ReturnOrderType', '')}</td>
				<td>
				<shiro:hasPermission name="returnpackage:returnReturnintransit:view">
				<a href="${ctx}/returnpackage/returnReturnintransit/returnOrderDetail?id=${returnReturnintransit.id}">
			   ${returnReturnintransit.returnid}</a>
			   </shiro:hasPermission>
			   <shiro:hasPermission name="returnpackage:returnReturnintransit:logistics">${returnReturnintransit.returnid}</shiro:hasPermission></td>
				<td>${returnReturnintransit.receiptdeliveryorderid}</td>
				<td>${returnReturnintransit.carrier.carriername}</td>
				<td>${returnReturnintransit.customername}</td>
				<td>${returnReturnintransit.telephonenumber}/${returnReturnintransit.mobilenumber}</td>
				<td>${returnReturnintransit.receiveaddress1}/${returnReturnintransit.receiveaddress2}</td>
				<td>${returnReturnintransit.isfacetofacerefund}</td>
				<td>${returnReturnintransit.refundcodnumber}</td>
				<td>${returnReturnintransit.receiptsuccesstime}</td>
				<td>${fns:getDictLabel(returnReturnintransit.receiptstatus, 'Receipt_Status', '')}</td>
				
				<shiro:hasPermission name="returnpackage:returnReturnintransit:edit"><td>
    				<a href="${ctx}/returnpackage/returnReturnintransit/form?id=${returnReturnintransit.id}">修改</a>
					<a href="${ctx}/returnpackage/returnReturnintransit/delete?id=${returnReturnintransit.id}" onclick="return confirmx('确认要删除该退换货吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>
