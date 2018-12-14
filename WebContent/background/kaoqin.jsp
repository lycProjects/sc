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
<title>考勤</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 检查 <span class="c-gray en">&gt;</span> 考勤<a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	
	
	<div class="text-c"> 
		<div class="text-c" style="font-size: 24px;color: #18A628;"> 
		
		团队选择：
		<span class="select-box inline" >
		<select class="select" id="" name="" style="font-size: 20px;">
			<option value="0">T-group</option>
			<option value="AccountInfo">向量工作室</option>
			<option value="AdminInfo">acm算法公关部</option>
			<option value="AdminInfo">服务器</option>
			<option value="AdminInfo">S504</option>
			<option value="AdminInfo">青云工作室</option>
			<option value="AdminInfo">网络攻防</option>
			<option value="AdminInfo">你猜工作室</option>
		</select>
		</span>


		<button type="submit" class="btn btn-success radius" id="" name=""><i class="Hui-iconfont"></i>选择日期</button>：
		<input type="text" onfocus="WdatePicker({ maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}' })" id="datemin" class="input-text Wdate" style="width:120px;">
		-
		<input type="text" onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d' })" id="datemax" class="input-text Wdate" style="width:120px;">
	</div>
	
	<div class="cl pd-5 bg-1 bk-gray mt-20">
		<span class="l"><a  class="btn btn-danger radius" ><i class="Hui-iconfont">&#xe6e2;</i> 批量缺勤</a> </span>&nbsp;&nbsp;&nbsp;
		<span class="l"><a  class="btn btn-danger radius" style="margin-left: 10px;"><i class="Hui-iconfont">&#xe6e2;</i> 批量请假</a> </span>			
		<span class="r" style="margin-right: 10px;"><button class="btn btn-mini btn-primary" type="submit" >提交</button></span>
	</div>
	</div>
	


	<div class="mt-20">
		
		
		
		
													
	<table class="table table-border table-bordered table-hover table-bg table-sort">
		<thead>
			<tr class="text-c">
				<th width="25"><input type="checkbox" name="" value=""></th>
				<th width="80">姓名</th>
				<th width="100">年级</th>
				<th width="40">专业</th>
				<th width="90">联系方式</th>
				<th width="60">操作</th>
			</tr>
		</thead>
		<tbody>
			<tr class="text-c">
				<td><input type="checkbox" value="1" name=""></td>
				<td>左丽萍</td>
				<td>16级</td>
				<td>计科</td>
				<td>150000000000</td>
				<td class="td-manage" style="align-content: center;" >
					<!--<a style="text-decoration:none" href="javascript:;" onClick="member_huanyuan(this,'1')" title="还原">
					<i class="Hui-iconfont">&#xe66b;</i></a>
					<a title="删除" href="javascript:;" onclick="member_del(this,'1')" class="ml-5" style="text-decoration:none">
						<i class="Hui-iconfont">&#xe6e2;</i></a>-->
			
						<a style="text-decoration:none" href="javascript:;" onClick="member_huanyuan(this,'1')" title="缺勤"><button class="btn btn-mini btn-danger" type="button" >缺勤</button></a>&nbsp;&nbsp;
						<a style="text-decoration:none" href="javascript:;" onClick="member_del(this,'1')" title="请假"><button class="btn btn-mini btn-primary" type="submit" >请假</button></a>&nbsp;&nbsp;
						<!--<a title="请假" href="javascript:;" onclick="member_del(this,'1')" class="ml-5" ><button class="btn btn-mini btn-primary" type="submit" >请假</button></a> -->
						
				</td>
			</tr>
			
			<tr class="text-c">
				<td><input type="checkbox" value="1" name=""></td>
				<td>左丽萍</td>
				<td>16级</td>
				<td>计科</td>
				<td>13000000000</td>
				<td class="td-manage" style="align-content: center;" >				
											<a style="text-decoration:none" href="javascript:;" onClick="member_huanyuan(this,'1')" title="缺勤"><button class="btn btn-mini btn-danger" type="button" >缺勤</button></a>&nbsp;&nbsp;
						<a style="text-decoration:none" href="javascript:;" onClick="member_del(this,'1')" title="请假"><button class="btn btn-mini btn-primary" type="submit" >请假</button></a>&nbsp;&nbsp;
				</td>
			</tr>
			
		    <tr class="text-c">
				<td><input type="checkbox" value="1" name=""></td>
				<td>左丽萍</td>
				<td>16级</td>
				<td>计科</td>
				<td>13000000000</td>
				<td class="td-manage" style="align-content: center;" >				
											<a style="text-decoration:none" href="javascript:;" onClick="member_huanyuan(this,'1')" title="缺勤"><button class="btn btn-mini btn-danger" type="button" >缺勤</button></a>&nbsp;&nbsp;
						<a style="text-decoration:none" href="javascript:;" onClick="member_del(this,'1')" title="请假"><button class="btn btn-mini btn-primary" type="submit" >请假</button></a>&nbsp;&nbsp;
				</td>
			</tr>
			<tr class="text-c">
				<td><input type="checkbox" value="1" name=""></td>
				<td>左丽萍</td>
				<td>16级</td>
				<td>计科</td>
				<td>13000000000</td>
				<td class="td-manage" style="align-content: center;" >				
											<a style="text-decoration:none" href="javascript:;" onClick="member_huanyuan(this,'1')" title="缺勤"><button class="btn btn-mini btn-danger" type="button" >缺勤</button></a>&nbsp;&nbsp;
						<a style="text-decoration:none" href="javascript:;" onClick="member_del(this,'1')" title="请假"><button class="btn btn-mini btn-primary" type="submit" >请假</button></a>&nbsp;&nbsp;
				</td>
			</tr>
			<tr class="text-c">
				<td><input type="checkbox" value="1" name=""></td>
				<td>左丽萍</td>
				<td>16级</td>
				<td>计科</td>
				<td>13000000000</td>
				<td class="td-manage" style="align-content: center;" >				
											<a style="text-decoration:none" href="javascript:;" onClick="member_huanyuan(this,'1')" title="缺勤"><button class="btn btn-mini btn-danger" type="button" >缺勤</button></a>&nbsp;&nbsp;
						<a style="text-decoration:none" href="javascript:;" onClick="member_del(this,'1')" title="请假"><button class="btn btn-mini btn-primary" type="submit" >请假</button></a>&nbsp;&nbsp;
				</td>
			</tr>
			<tr class="text-c">
				<td><input type="checkbox" value="1" name=""></td>
				<td>左丽萍</td>
				<td>16级</td>
				<td>计科</td>
				<td>13000000000</td>
				<td class="td-manage" style="align-content: center;" >				
											<a style="text-decoration:none" href="javascript:;" onClick="member_huanyuan(this,'1')" title="缺勤"><button class="btn btn-mini btn-danger" type="button" >缺勤</button></a>&nbsp;&nbsp;
						<a style="text-decoration:none" href="javascript:;" onClick="member_del(this,'1')" title="请假"><button class="btn btn-mini btn-primary" type="submit" >请假</button></a>&nbsp;&nbsp;
				</td>
			</tr>
			<tr class="text-c">
				<td><input type="checkbox" value="1" name=""></td>
				<td>左丽萍</td>
				<td>16级</td>
				<td>计科</td>
				<td>13000000000</td>
				<td class="td-manage" style="align-content: center;" >				
											<a style="text-decoration:none" href="javascript:;" onClick="member_huanyuan(this,'1')" title="缺勤"><button class="btn btn-mini btn-danger" type="button" >缺勤</button></a>&nbsp;&nbsp;
						<a style="text-decoration:none" href="javascript:;" onClick="member_del(this,'1')" title="请假"><button class="btn btn-mini btn-primary" type="submit" >请假</button></a>&nbsp;&nbsp;
				</td>
			</tr>
			
			
		
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
$(function(){
	$('.table-sort').dataTable({
		"aaSorting": [[ 1, "desc" ]],//默认第几个排序
		"bStateSave": true,//状态保存
		"aoColumnDefs": [
		  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
		  {"orderable":false,"aTargets":[0,5]}// 制定列不参与排序
		]
	});
});

/*用户-缺勤*/
function member_huanyuan(obj,id){
	layer.confirm('确认该同学缺勤吗？',function(index){
		
		$(obj).remove();
		layer.msg('已缺勤!',{icon: 6,time:1000});
	});
}

function member_del(obj,id){
	layer.confirm('确认该同学请假吗？',function(index){
		
		$(obj).remove();
		layer.msg('已请假!',{icon: 6,time:1000});
	});
}
/*用户-请假*/
/*function member_del(obj,id){
	layer.confirm('确认该同学请假吗？',function(index){
		$.ajax({
			type: 'POST',
			url: '',
			dataType: 'json',
			success: function(data){
				$(obj).parents("tr").remove();
				layer.msg('已请假!',{icon:1,time:1000});
			},
			error:function(data) {
				console.log(data.msg);
			},
		});		
	});
}*/
</script> 
</body>
</html>