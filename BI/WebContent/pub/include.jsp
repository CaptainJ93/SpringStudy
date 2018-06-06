<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
<%@ page import="com.best1.domain.UserInfo"%>
<% 
String path = request.getContextPath();
UserInfo userInfo = (UserInfo)request.getSession().getAttribute("user");
%>
<link rel="stylesheet" type="text/css" media="screen,projection" href="<%=path %>/css/bridge.css"/>
<link rel="stylesheet" type="text/css" media="screen" href="<%=path %>/css/jqueryui/jquery-ui.css" />
<link rel="stylesheet" type="text/css" media="screen" href="<%=path %>/css/ui.jqgrid.css" />
<link rel="stylesheet" type="text/css" href="<%=path %>/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="<%=path %>/themes/icon.css">
<script src="<%=path %>/js/iepngfix_tilebg.js"></script> <!--For ie6.0 png Bug-->
<script src="<%=path %>/js/jquery.min.js" type="text/javascript"></script>
<script src="<%=path %>/js/jquery-ui.min.js" type="text/javascript"></script>
<script src="<%=path %>/js/i18n/grid.locale-cn.js" type="text/javascript"></script>
<script src="<%=path %>/js/jquery.easyui.min.js" type="text/javascript" ></script>
<script src="<%=path %>/js/easyui-lang-zh_CN.js" type="text/javascript" ></script><!-- 将日期格式自动转为yyyy-mm-dd -->
<script src="<%=path %>/js/jquery.hl.js" type="text/javascript"></script>
<script src="<%=path %>/js/jquery.hlGrid.js" type="text/javascript"></script>
<script src="<%=path %>/pub/common.js" type="text/javascript" ></script>
<script src="<%=path %>/js/view.js" type="text/javascript"></script>
<script src="<%=path %>/js/ajaxupload.js" type="text/javascript"></script>
<script src="<%=path %>/js/jquery.bgiframe.js" type="text/javascript"></script>
<script src="<%=path %>/pub/js/xalert.js" type="text/javascript"></script>
<script src="<%=path %>/pub/js/jquery.blockUI.js" type="text/javascript"></script>

<script type="text/javascript">
var useridForGlobal="<%=userInfo.getUserid()%>";
var contextPath="<%=request.getContextPath()%>";
</script>