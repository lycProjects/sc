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
<title>新闻列表</title>
</head>
<body>
<form action="news-category/delete" id="delete_form">
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 新闻管理 <span class="c-gray en">&gt;</span> 新闻类别 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	<div class="cl pd-5 bg-1 bk-gray mt-0"> 
	<span class="l">
	<input type="hidden" id="newscateIds" name="newscateIds" value=""/>
	<input type="button" onclick="postDelete(-1)" class="btn btn-danger radius" value="批量删除">
	<a class="btn btn-primary radius" onclick="picture_add('添加分类','news-category-add')" href="javascript:;"><i class="Hui-iconfont">&#xe600;</i> 添加分类</a></span> <span class="r"></span> </div>
	<div class="mt-20">
		<table class="table table-border table-bordered table-bg table-hover table-sort">
			<thead>
				<tr class="text-c">
					<th width="40"><input name="" id="all" type="checkbox" value=""></th>
					<th width="250">类别名</th>
					<th width="280">类别简介</th>			
					<th width="120">显示方式</th>
					<th width="100">操作</th>
				</tr>
			</thead>
			<tbody>
			    <c:forEach items="${newsCategoryList }" var="newsCategoryItem">
					<tr class="text-c">
					 <td><input name="delete_form_ids" type="checkbox" value="${newsCategoryItem.newscateId}"></td>
					 <td>${newsCategoryItem.newscateTitle }</td>
					 <td>${newsCategoryItem.newscateBrief }</td>
					 <c:if test="${newsCategoryItem.newscateMark=='normal' }">
					 	<td>列表显示</td>
					 </c:if>
					 <c:if test="${newsCategoryItem.newscateMark=='show_news_index' }">
					 	<td>首页显示</td>
					 </c:if>
					 <td class="td-manage">
					 	<a style="text-decoration:none" class="ml-5" onClick="picture_edit('编辑类别','news-category-edit','${newsCategoryItem.newscateId}')" href="javascript:;" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a> 
					 	<a style="text-decoration:none" class="ml-5" onClick="postDelete(${newsCategoryItem.newscateId})" href="javascript:;" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a> 
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
/*删除*/
function postDelete(index){
	var delete_form=document.getElementById('delete_form');
	if(confirm('真的要删除吗？')){
		if(index<0){//批量删除
			var ids=document.getElementsByName('delete_form_ids');
			var idsString="";
			for(var i=0;i<ids.length;i++){
				if(ids[i].checked){
					idsString=idsString+":"+ids[i].value;
				}
			};
			document.getElementById('newscateIds').value=idsString.substring(1);
		}else{//单个删除
			document.getElementById('newscateIds').value=index;
		}
		//alert(document.getElementById('newscateIds').value);
		delete_form.submit();
	}
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

/*图片-审核*/
function picture_shenhe(obj,id){
	layer.confirm('审核文章？', {
		btn: ['通过','不通过'], 
		shade: false
	},
	function(){
		$(obj).parents("tr").find(".td-manage").prepend('<a class="c-primary" onClick="picture_start(this,id)" href="javascript:;" title="申请上线">申请上线</a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已发布</span>');
		$(obj).remove();
		layer.msg('已发布', {icon:6,time:1000});
	},
	function(){
		$(obj).parents("tr").find(".td-manage").prepend('<a class="c-primary" onClick="picture_shenqing(this,id)" href="javascript:;" title="申请上线">申请上线</a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-danger radius">未通过</span>');
		$(obj).remove();
    	layer.msg('未通过', {icon:5,time:1000});
	});	
}

/*图片-下架*/
function picture_stop(obj,id){
	layer.confirm('确认已外借吗？',function(index){
		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="picture_start(this,id)" href="javascript:;" title="发布"><i class="Hui-iconfont">&#xe603;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已下架</span>');
		$(obj).remove();
		layer.msg('已外借!',{icon: 5,time:1000});
	});
}

/*图片-发布*/
function picture_start(obj,id){
	layer.confirm('确认要编辑吗？',function(index){
		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="picture_stop(this,id)" href="javascript:;" title="下架"><i class="Hui-iconfont">&#xe6de;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已发布</span>');
		$(obj).remove();
		layer.msg('已编辑!',{icon: 6,time:1000});
	});
}

/*图片-申请上线*/
function picture_shenqing(obj,id){
	$(obj).parents("tr").find(".td-status").html('<span class="label label-default radius">待审核</span>');
	$(obj).parents("tr").find(".td-manage").html("");
	layer.msg('已提交申请，耐心等待审核!', {icon: 1,time:2000});
}

/*图片-编辑*/
function picture_edit(title,url,id){
	var index = layer.open({
		type: 2,
		title: title,
		content: url+"?newscateId="+id
	});
	layer.full(index);
}

/*图片-删除*/
function picture_del(index){
	layer.confirm('确认要删除吗？',function(){
		$.ajax({
			type: 'POST',
			url: '/news/news-category/delete',
			data:{
				"newscateId":index
			},
			success: function(data){
				$(obj).parents("tr").remove();
				layer.msg(data,{icon:1,time:1000});
			},
			error:function(data) {
				console.log(data.msg);
			},
		});		
	});
}
</script>
</body>
</html>