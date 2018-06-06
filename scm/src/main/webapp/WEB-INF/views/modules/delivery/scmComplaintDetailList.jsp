<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>配送包裹客诉处理detail管理</title>
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
		<li class="active"><a href="${ctx}/delivery/scmComplaintDetail/">配送包裹客诉处理detail列表</a></li>
	</ul>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>配送单号</th>
				<th>商品名</th>
				<th>客诉描述</th>
				<th>快递公司</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>
					${scmComplaintHeader.trackingnumber}
				</td>
				<td>
					${scmComplaintHeader.productname}
				</td>
				<td>
					${scmComplaintHeader.cpdesc}
				</td>
				<td>
					${scmComplaintHeader.carrier.carriername}
				</td>
			</tr>
		</tbody>
	</table>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>客诉处理序号</th>
				<th>客诉处理内容</th>
				<th>建立人</th>
				<th>建立时间</th>			
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="scmComplaintDetail">
			<tr>
				<td>
					${scmComplaintDetail.cphandledseq}
				</td>
				<td>
					${scmComplaintDetail.cphandleddesc}
				</td>
				<td>				
					${scmComplaintDetail.createname}
				</td>	
				<td>
					<fmt:formatDate value="${scmComplaintDetail.recordcreatedtime}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>	
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<form:form id="inputForm" modelAttribute="scmComplaintDetail" action="${ctx}/delivery/scmComplaintDetail/save" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<sys:message content="${message}"/>
		<div class="control-group">
			<div class="controls hide">
				<form:input path="cpid" value="${scmComplaintDetail.cpid}" htmlEscape="false" maxlength="500" class="input-xlarge "/>
			</div>
			<label class="control-label">客诉内容：</label>
			<div >
				<form:textarea path="cphandleddesc" rows="3" cols="20" htmlEscape="false" maxlength="500" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<shiro:hasPermission name="delivery:scmComplaintDetail:edit"><input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>&nbsp;</shiro:hasPermission>
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="window.close()"/>
		</div>
	</form:form>
</body>
</html>