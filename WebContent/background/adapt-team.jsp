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
<title>团队调整</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 团队成员管理 <span class="c-gray en">&gt;</span> 团队调整<a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	<div class="text-c"> 
		<button type="submit" class="btn btn-success radius" id="" name=""><i class="Hui-iconfont"></i>选择日期</button>：
		<input type="text" onfocus="WdatePicker({ maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}' })" id="datemin" class="input-text Wdate" style="width:120px;">
		-
		<input type="text" onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d' })" id="datemax" class="input-text Wdate" style="width:120px;">
	</div>
	
<!--	<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont"></i>批量选择</a> </span>&nbsp;&nbsp;&nbsp;&nbsp;
	-->
	
	<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a class="btn btn-primary radius" onclick="product_add('添加','adapt-team-add.jsp')" href="javascript:;"><i class="Hui-iconfont">&#xe600;</i> 添加</a></span> <span class="r">共有数据：<strong>54</strong> 条</span> </div>
	
	
	
	
	
		
		
		
	<div class="mt-20">
			<table class="table table-border table-bordered table-bg table-hover table-sort">
				<thead>
					<tr class="text-c">
						<th width="40"><input name="" type="checkbox" value=""></th>
						<th width="80">团队名称</th>
						<th width="60">现有人数</th>
						<th width="60">主攻方向</th>
						<th width="60">指导老师</th>	
						<th width="60">负责人</th>
						<th width="90">联系方式</th>
						<th width="80">操作</th>
					</tr>
				</thead>
				<tbody>
					<tr class="text-c va-m">
						<td><input name="" type="checkbox" value=""></td>
						<td>T-group</td>
						<td>11</td>
						<td>网站开发</td>
						<td>郑浩</td>
						<td>刘继童</td>
						<td>15036890387</td>
						<td class="td-manage"> <a style="text-decoration:none" class="ml-5" onClick="product_edit('修改信息','adapt-team-add.jsp','10001')" href="javascript:;" title="修改"><i class="Hui-iconfont">&#xe6df;</i></a> <a style="text-decoration:none" class="ml-5" onClick="product_del(this,'10001')" href="javascript:;" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
					</tr>
					<tr class="text-c va-m">
						<td><input name="" type="checkbox" value=""></td>
						<td>向量工作室</td>
						<td>10</td>
						<td>网站开发、App开发</td>
						<td>张国平</td>
						<td>石腾飞</td>
						<td>17796898262</td>
						<td class="td-manage"> <a style="text-decoration:none" class="ml-5" onClick="product_edit('修改信息','adapt-teacher-add.jsp','10001')" href="javascript:;" title="修改"><i class="Hui-iconfont">&#xe6df;</i></a> <a style="text-decoration:none" class="ml-5" onClick="product_del(this,'10001')" href="javascript:;" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
					</tr>
					<tr class="text-c va-m">
						<td><input name="" type="checkbox" value=""></td>
						<td>ACM算法公关部</td>
						<td>30</td>
						<td>算法研究</td>
						<td>李永明</td>
						<td>王子鑫</td>
						<td>13937013590</td>
						<td class="td-manage"> <a style="text-decoration:none" class="ml-5" onClick="product_edit('修改信息','adapt-teacher-add.html','10001')" href="javascript:;" title="修改"><i class="Hui-iconfont">&#xe6df;</i></a> <a style="text-decoration:none" class="ml-5" onClick="product_del(this,'10001')" href="javascript:;" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
					</tr>
					<tr class="text-c va-m">
						<td><input name="" type="checkbox" value=""></td>
						<td>你猜工作室</td>
						<td>10</td>
						<td>游戏开发、界面设计、三维建模</td>
						<td>张礼坚</td>
						<td>王鉴学</td>
						<td>15037511886</td>
						<td class="td-manage"> <a style="text-decoration:none" class="ml-5" onClick="product_edit('修改信息','adapt-teacher-add.html','10001')" href="javascript:;" title="修改"><i class="Hui-iconfont">&#xe6df;</i></a> <a style="text-decoration:none" class="ml-5" onClick="product_del(this,'10001')" href="javascript:;" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
					</tr>
					<tr class="text-c va-m">
						<td><input name="" type="checkbox" value=""></td>
						<td>服务器工作室</td>
						<td>7</td>
						<td>数据库设计及应用、前端设计</td>
						<td>李真</td>
						<td>赵意可</td>
						<td>15036879583</td>
						<td class="td-manage"> <a style="text-decoration:none" class="ml-5" onClick="product_edit('修改信息','adapt-teacher-add.html','10001')" href="javascript:;" title="修改"><i class="Hui-iconfont">&#xe6df;</i></a> <a style="text-decoration:none" class="ml-5" onClick="product_del(this,'10001')" href="javascript:;" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
					</tr>
					<tr class="text-c va-m">
						<td><input name="" type="checkbox" value=""></td>
						<td>青云技术服务工作室</td>
						<td>6</td>
						<td>Java全栈、HTML5混合开发等</td>
						<td>李冰</td>
						<td>常嘉乐</td>
						<td>15037510157</td>
						<td class="td-manage"> <a style="text-decoration:none" class="ml-5" onClick="product_edit('修改信息','adapt-teacher-add.html','10001')" href="javascript:;" title="修改"><i class="Hui-iconfont">&#xe6df;</i></a> <a style="text-decoration:none" class="ml-5" onClick="product_del(this,'10001')" href="javascript:;" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
					</tr>
					<tr class="text-c va-m">
						<td><input name="" type="checkbox" value=""></td>
						<td>恒创VR工作室</td>
						<td>8</td>
						<td>VR应用开发、Maya建模</td>
						<td>刘雨瞳</td>
						<td>张矿辉</td>
						<td>15886799975</td>
						<td class="td-manage"> <a style="text-decoration:none" class="ml-5" onClick="product_edit('修改信息','adapt-teacher-add.html','10001')" href="javascript:;" title="修改"><i class="Hui-iconfont">&#xe6df;</i></a> <a style="text-decoration:none" class="ml-5" onClick="product_del(this,'10001')" href="javascript:;" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
					</tr>
					<tr class="text-c va-m">
						<td><input name="" type="checkbox" value=""></td>
						<td>网络攻防</td>
						<td>17</td>
						<td>网络安全渗透测试</td>
						<td>王文虎</td>
						<td>宋恒贤</td>
						<td>15036888335</td>
						<td class="td-manage"> <a style="text-decoration:none" class="ml-5" onClick="product_edit('修改信息','adapt-teacher-add.html','10001')" href="javascript:;" title="修改"><i class="Hui-iconfont">&#xe6df;</i></a> <a style="text-decoration:none" class="ml-5" onClick="product_del(this,'10001')" href="javascript:;" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
					</tr>
					
				</tbody>
			</table>
		</div>
	</div>
</div>

<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="${pageContext.request.contextPath}/style/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/style/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/style/static/h-ui/js/H-ui.min.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/style/static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="${pageContext.request.contextPath}/style/lib/zTree/v3/js/jquery.ztree.all-3.5.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/style/lib/My97DatePicker/4.8/WdatePicker.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/style/lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/style/lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">
var setting = {
	view: {
		dblClickExpand: false,
		showLine: false,
		selectedMulti: false
	},
	data: {
		simpleData: {
			enable:true,
			idKey: "id",
			pIdKey: "pId",
			rootPId: ""
		}
	},
	callback: {
		beforeClick: function(treeId, treeNode) {
			var zTree = $.fn.zTree.getZTreeObj("tree");
			if (treeNode.isParent) {
				zTree.expandNode(treeNode);
				return false;
			} else {
				//demoIframe.attr("src",treeNode.file + ".html");
				return true;
			}
		}
	}
};

		
		
$(document).ready(function(){
	var t = $("#treeDemo");
	t = $.fn.zTree.init(t, setting, zNodes);
	//demoIframe = $("#testIframe");
	//demoIframe.on("load", loadReady);
	var zTree = $.fn.zTree.getZTreeObj("tree");
	//zTree.selectNode(zTree.getNodeByParam("id",'11'));
});

$('.table-sort').dataTable({
	"aaSorting": [[ 1, "desc" ]],//默认第几个排序
	"bStateSave": true,//状态保存
	"aoColumnDefs": [
	  {"orderable":false,"aTargets":[0,7]}// 制定列不参与排序
	]
});
/*产品-添加*/
function product_add(title,url){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}
/*产品-查看*/
function product_show(title,url,id){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}
/*产品-审核*/
function product_shenhe(obj,id){
	layer.confirm('审核文章？', {
		btn: ['通过','不通过'], 
		shade: false
	},
	function(){
		$(obj).parents("tr").find(".td-manage").prepend('<a class="c-primary" onClick="product_start(this,id)" href="javascript:;" title="申请上线">申请上线</a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已发布</span>');
		$(obj).remove();
		layer.msg('已发布', {icon:6,time:1000});
	},
	function(){
		$(obj).parents("tr").find(".td-manage").prepend('<a class="c-primary" onClick="product_shenqing(this,id)" href="javascript:;" title="申请上线">申请上线</a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-danger radius">未通过</span>');
		$(obj).remove();
    	layer.msg('未通过', {icon:5,time:1000});
	});	
}


/*产品-编辑*/
function product_edit(title,url,id){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}

/*产品-删除*/
function product_del(obj,id){
	layer.confirm('确认要删除吗？',function(index){
		$.ajax({
			type: 'POST',
			url: '',
			dataType: 'json',
			success: function(data){
				$(obj).parents("tr").remove();
				layer.msg('已删除!',{icon:1,time:1000});
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