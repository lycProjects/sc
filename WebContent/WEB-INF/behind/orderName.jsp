<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/static/h-ui.admin/css/style.css" />
<title>各团队分表</title>
</head>
<body>
<!-- 	<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 检索功能<span class="c-gray en">&gt;</span> 各团队分表<a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav> -->
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 检索功能<span class="c-gray en">&gt;</span> 各团队分表<a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" onclick="flush()" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	<div class="text-c" style="font-size: 28px;color: cornflowerblue;"> 
		<form id="madaptForm" action="teamOrderName" method="POST">
		团队选择：
		<span class="select-box inline" >
		 <select name="teUnit" class="input-text" id="teUnit-select" onchange="document.getElementById('madaptForm').submit()">
               <option value="">请选择团队</option>
               <c:forEach items="${teammappingMappersList }" var="tm">
                  <option value="${tm.tmmName }">${tm.tmmName }</option>
               </c:forEach>
            </select>
		</span>
		</form>
	</div>

	
	<div class="cl pd-5 bg-1 bk-gray mt-20">  
		<a class="btn btn-primary radius"  href="javascript:;">
			<i class="Hui-iconfont">&#xe600;</i> 检索</a>
		<a class="btn btn-primary radius" style="float: right;" href="absence">缺勤记录</a>
	</div>
	
	<div class="mt-20">
															
	<table class="table table-border table-bordered table-hover table-bg table-sort">
		<thead>
			<tr class="text-c">
				<th width="40"><input name="" type="checkbox" value=""></th>
				<th width="60">学号</th>
				<th width="80">姓名</th>
				<th width="60">性别</th>
				<th width="40">班级</th>
				<th width="90">联系方式</th>
				<th width="40" style="display:none">身份证号</th>
				<th width="60" style="display:none">指导老师</th>
				<th width="40">操作</th>
			</tr>
		</thead>
		<tbody>
			  <c:forEach items="${studentList }" var="sl">
					<tr class="text-c va-m">
						<td><input name="" type="checkbox" value="${sl.stId }"></td>
						<td>${sl.stNumber }</td>
						<td>${sl.stName }</td>
						<td>${sl.stSex }</td>
						<td>${sl.stClass }</td>
						<td>${sl.stPhone }</td>
						<td style="display:none">${sl.stIdcard }</td>
						<td style="display:none">${sl.stTeacher }</td>	
						<td><a  class="btn btn-primary radius" onclick="add(${sl.stId })">缺勤</a></td>
					</tr>
				</c:forEach>		
		</tbody>
	</table>
	</div>
</div>
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
	var select = $("#teUnit-select");
	var input = $("#teUnit-input").hide();
	select.change(function(){
		var option=$("#teUnit-select option:selected");
		input.attr("name",option.val());
	});	
</script>
<script type="text/javascript"></script>
<script type="text/javascript">
$(function(){
	$('.table-sort').dataTable({
		"aaSorting": [[ 1, "desc" ]],//默认第几个排序
		"bStateSave": true,//状态保存
		"aoColumnDefs": [
		  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
		  {"orderable":false,"aTargets":[0,6,7]}// 制定列不参与排序
		]
	});
});

function add(id) {
	if(confirm('确实要提交吗?')) {
		$.get("absenceAdd/"+id,function(data){
			alert("提交成功！");
		//	window.location.reload();  页面刷新
		});
	}
}
function flush(){
	window.location.reload();
}
/*用户-还原*/

</script> 
</body>
</html>