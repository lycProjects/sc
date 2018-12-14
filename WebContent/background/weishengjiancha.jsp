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
<title>主页面</title>
</head>
<body>
<div class="page-container">
	<p class="f-20 text-success" style="text-align:center;font-size:30px;color: blue;">欢迎使用双创管理后台系统</p>
	<p style="float: right;">登录次数：36 </p>
	<table class="table table-border table-bordered table-bg">
		<thead>
			<tr>
				<th colspan="7" scope="col">信息统计</th>
			</tr>
			<tr class="text-c">
				<th>团队名称</th>
				<th>现有人数</th>
				<th>主攻方向</th>
				<th>指导老师</th>
				<th>团队负责人</th>
				<th>负责人电话</th>
			</tr>
		</thead>
		<tbody>
			<tr class="text-c">
				<td>T-group</td>
				<td>11</td>
				<td>网站开发</td>
				<td>郑浩</td>
				<td>刘继童</td>
				<td>15036890387</td>
			</tr>
			<tr class="text-c">
				<td>向量工作室</td>
				<td>10</td>
				<td>网站开发、App开发</td>
				<td>张国平</td>
				<td>石腾飞</td>
				<td>17796898262</td>
			</tr>
			<tr class="text-c">
				<td>ACM算法公关部</td>
				<td>30</td>
				<td>算法研究</td>
				<td>李永明</td>
				<td>王子鑫</td>
				<td>13937013590</td>
			</tr>
			<tr class="text-c">
				<td>你猜工作室</td>
				<td>10</td>
				<td>游戏开发、界面设计、三维建模</td>
				<td>张礼坚</td>
				<td>王鉴学</td>
				<td>15037511886</td>
			</tr>
			<tr class="text-c">
				<td>服务器工作室</td>
				<td>7</td>
				<td>数据库设计及应用、前端设计</td>
				<td>李真</td>
				<td>赵意可</td>
				<td>15036879583</td>
			</tr>
			<tr class="text-c">
				<td>青云技术服务工作室</td>
				<td>6</td>
				<td>Java全栈、HTML5混合开发等</td>
				<td>李冰</td>
				<td>常嘉乐</td>
				<td>15037510157</td>
			</tr>
			<tr class="text-c">
				<td>恒创VR工作室</td>
				<td>8</td>
				<td>VR应用开发、Maya建模</td>
				<td>刘雨瞳</td>
				<td>张矿辉</td>
				<td>15886799975</td>
			</tr>
			<tr class="text-c">
				<td>网络攻防</td>
				<td>17</td>
				<td>网络安全渗透测试</td>
				<td>王文虎</td>
				<td>宋恒贤</td>
				<td>15036888335</td>
			</tr>
		</tbody>
	</table>
	
</div>

<br />
<footer class="footer mt-20">
	<div class="container">
		
			Copyright &copy;2018-2019 T-.admin All Rights Reserved.<br>
			本后台系统由<a href="http://www.h-ui.net/" target="_blank" title="H-ui前端框架">T-group团队</a>提供技术支持</p>
			<p>联系我们<a href="http://www.cssmoban.com/" target="_blank" title="">-双创中心</a> - Collect from <a href="http://www.cssmoban.com/" title="" target="_blank">-T-group</a></p>
	</div>
</footer>
<script type="text/javascript" src="${pageContext.request.contextPath}/style/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/style/static/h-ui/js/H-ui.min.js"></script> 

</body>
</html>