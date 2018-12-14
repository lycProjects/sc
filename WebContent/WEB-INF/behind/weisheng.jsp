<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
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
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/lib/Hui-iconfont/1.0.8/iconfont.woff" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/static/h-ui.admin/css/style.css" />
<title>纪律检查</title>
</head>
<body>
<%       
Date date = new Date();
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
%>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 检查 <span class="c-gray en">&gt;</span>卫生检查<a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	<div class="text-c"> 
		<button type="submit" class="btn btn-success radius" id="" name=""><i class="Hui-iconfont"></i>选择日期</button>：
		<input type="text" onfocus="WdatePicker({ maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}' })" id="datemin" class="input-text Wdate" style="width:120px;">
		-
		<input type="text" onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d' })" id="datemax" class="input-text Wdate" style="width:120px;">
	</div>
	
	
	<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="r"><a class="btn btn-primary radius" onclick="product_add('违纪记录','jilv-add')" href="javascript:;"> 违纪记录</a></span>  </div>
	
	
	<div class="mt-20">
			<table class="table table-border table-bordered table-bg table-hover table-sort">
				<thead>
					<tr class="text-c">
						<th width="25" style="display:none;">团队ID</th>	
						<th width="50">团队名称</th>		
						<th width="80">时间</th>				
						<th width="80">操作</th>
					</tr>
				</thead>
				<tbody>
				<c:set var='i' value='${1}'></c:set>
					<c:forEach items="${teammapping }" var="emp">
						<tr class="text-c va-m">
							<td id="ti${i}" style="display:none;">${emp.tmmId }</td>
							<td id="tn${i}">${emp.tmmName }</td>
							<td><%=sdf.format(date)%> </td>
							<td><a href="#" class="btn btn-primary radius" data-toggle="modal" data-target="#customerEditDialog" onclick="editTeamClean(${i})">违纪添加</a></td>
						</tr>
						<c:set var='i' value='${i+1}'></c:set>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<br>
		<!-- 分页 -->
	<div align="center">
		<font size="2">共 ${page.totalPageCount} 页</font> <font size="2">第
			${page.pageNow} 页</font> <a
			href="${pageContext.request.contextPath}/cleanpage?pageNow=1">首页</a>
		<c:choose>
			<c:when test="${page.pageNow - 1 > 0}">
				<a
					href="${pageContext.request.contextPath}/cleanpage?pageNow=${page.pageNow - 1}">上一页</a>
			</c:when>
			<c:when test="${page.pageNow - 1 <= 0}">
				<a href="${pageContext.request.contextPath}/cleanpage?pageNow=1">上一页</a>
			</c:when>
		</c:choose>
		<c:choose>
			<c:when test="${page.totalPageCount==0}">
				<a
					href="${pageContext.request.contextPath}/cleanpage?pageNow=${page.pageNow}">下一页</a>
			</c:when>
			<c:when test="${page.pageNow + 1 < page.totalPageCount}">
				<a
					href="${pageContext.request.contextPath}/cleanpage?pageNow=${page.pageNow + 1}">下一页</a>
			</c:when>
			<c:when test="${page.pageNow + 1 >= page.totalPageCount}">
				<a
					href="${pageContext.request.contextPath}/cleanpage?pageNow=${page.totalPageCount}">下一页</a>
			</c:when>
		</c:choose>
		<c:choose>
			<c:when test="${page.totalPageCount==0}">
				<a
					href="${pageContext.request.contextPath}/cleanpage?pageNow=${page.pageNow}">尾页</a>
			</c:when>
			<c:otherwise>
				<a
					href="${pageContext.request.contextPath}/cleanpage?pageNow=${page.totalPageCount}">尾页</a>
			</c:otherwise>
		</c:choose>
	</div>
		
	</div>
</div>


<div class="modal fade" id="customerEditDialog" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content" style="width:450px;position:absolute;border-radius:5px;border:1px solid #000;">
				<div class="modal-header" style="height:40px">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h1 class="modal-title" id="myModalLabel" style="font-size:25px;" >添加违纪信息</h1>
				</div>
				<div class="modal-body" >
				
				
					<form class="form-horizontal" id="clean_form">
						<!-- 输入框中不可设置disabled="disabled"，后台接收认为是默认值，无法传参 -->
						<div class="form-group">
							<label for="edit_teamName" style="font-size:16px;font-family:微软雅黑；">&nbsp&nbsp团队名称</label>
								<input type="text"  id="edit_tn" placeholder="  团队名称" name="wsTeamName" style="width:300px;height:30px;margin-left:20px;border-radius:5px;border:1px solid #000;">	
						</div>
						<br><br/>
						
						<div class="form-group">
							<label for="edit_time" style="font-size:16px;font-family:微软雅黑；">&nbsp&nbsp时  间&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label>
								<input type="text"  id="" value="<%=sdf.format(date)%>" name="wsTime" style="width:300px;height:31px;margin-left:20px;border-radius:5px;border:1px solid #000;">	
						</div>
						<br/><br/>
						
						<div class="form-group">
							<label for="edit_reson"  style="font-size:16px;font-family:微软雅黑；">&nbsp&nbsp违纪原因</label>
								<input type="text"  placeholder="  卫生检查" name="wsRecode" style="width:300px;height:30px;margin-left:20px;border-radius:5px;border:1px solid #000;">	
						</div>
						<br/><br/>

						<div class="form-group" style="line-height:5px" >
							<label for="edit_teamId" id="teamId" style="font-size:16px;font-family:微软雅黑；">&nbsp&nbsp团队ID&nbsp&nbsp&nbsp</label>
								<input type="text"  id="edit_ti" placeholder="  团队ID" name="wsTeam" style="width:300px;height:30px;margin-left:20px;border-radius:5px;border:1px solid #000;">	
						</div>
					</form>
				</div>
				<div class="modal-footer" style="border-radius:5px; solid #000;">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" onclick="clean_insert()">提交</button>
				</div>
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
	  {"orderable":false,"aTargets":[0,3]}// 制定列不参与排序
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

function deleteCustomer(id) {
	if(confirm('确实要提交吗?')) {
		$.post("teamsubmit",{"id":id},function(data){
			alert("提交成功！");
			window.location.reload();
		});
	}
}

function editTeamClean(id){
	var teamid=$("#ti"+id);//$代表选择器，#代表id
	var teamtn=$("#tn"+id);
	
	$("#edit_ti").val(teamid.html());
	$("#edit_tn").val(teamtn.html());
	$("#ti").hide();
	$("#edit_ti").hide();
	$("#teamId").hide();
}
function clean_insert() {
	$.post("clean_insert",$("#clean_form").serialize(),function(data){
		
		alert("违纪团队添加成功！");
		window.location.reload();
	});
}


</script>	
</body>
</html>