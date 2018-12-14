<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="utf-8">
		<link rel="shortcut icon" href="${pageContext.request.contextPath}/style/topcss/images/bitbug_favicon.ico" type="image/x-icon" />
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5shiv.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/static/h-ui.admin/css/style.css" />
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>公司列表</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/companyManager/delete" id="delete_form" method="GET">
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 公司项目管理 <span class="c-gray en">&gt;</span> 项目市场 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	<div class="cl pd-5 bg-1 bk-gray mt-0"> 
	<span class="l">
		<input type="button" onclick="deleteForm()" class="btn btn-danger radius" value="批量删除">
		<a class="btn btn-primary radius" onclick="picture_add('添加公司','companyManager/add')" href="javascript:;"><i class="Hui-iconfont">&#xe600;</i> 添加公司</a>
	</span> 
	<span class="r"></span> 
	</div>
	<div class="mt-20">
		<table class="table table-border table-bordered table-bg table-hover table-sort">
			<thead>
				<tr class="text-c">
					<th width="40"><input name="" id="all" type="checkbox" value=""></th>
					<th width="150">公司名称</th>
					<th width="200">公司简介</th>			
					<th width="100">联系方式</th>
					<th width="150">招聘信息</th>
					<th width="120">操作</th>
				</tr>
			</thead>
			<tbody>
			    <c:forEach items="${enterprises }" var="enterprise">
			     <tr class="text-c">
			    	<td><input name="enIds" type="checkbox" value="${enterprise.enId }"></td>
					<td>${enterprise.enName }</td>
					<td>${fn:substring(enterprise.enBriefintroduction,0,50)}...</td>
					<td>${enterprise.enPhone }</td>
					<td>${fn:substring(enterprise.enRecruitment,0,50)}...</td>
					<td class="td-manage">
					 	<a style="text-decoration:none" class="ml-5" onClick="picture_edit('编辑公司信息','${pageContext.request.contextPath}/companyManager/${enterprise.enId }/edit','')" href="javascript:;" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a> 
					 </td>
				  </tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>
</form>

<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="${pageContext.request.contextPath}/style/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/style/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/style/static/h-ui/js/H-ui.min.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/style/static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="${pageContext.request.contextPath}/style/lib/My97DatePicker/4.8/WdatePicker.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/style/lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/style/lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">
function deleteForm(){
	layer.confirm('确定删除所有勾选的公司吗？', function(index) {
		document.getElementById('delete_form').submit();
	});
}

$('.table-sort').dataTable({
	"aaSorting": [[ 1, "desc" ]],//默认第几个排序
	"bStateSave": true,//状态保存
	"aoColumnDefs": [
	  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
	  {"orderable":false,"aTargets":[0,4]}// 制定列不参与排序
	]
});

/*图片-添加*/
function picture_add(title,url){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}

/*图片-查看*/
function picture_show(title,url,id){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}

/*图片-编辑*/
function picture_edit(title,url,id){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}

</script>
</body>
</html>