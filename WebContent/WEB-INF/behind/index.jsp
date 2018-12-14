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
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
		<link rel="shortcut icon" href="${pageContext.request.contextPath}/style/topcss/images/bitbug_favicon.ico" type="image/x-icon" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/style/font-awesome-4.7.0/css/font-awesome.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/style/static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/style/static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/style/lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" 
	href="${pageContext.request.contextPath}/style/lib/Hui-iconfont/1.0.8/iconfont.woff" />
	<link rel="stylesheet" type="text/css" 
	href="${pageContext.request.contextPath}/style/lib/Hui-iconfont/1.0.8/iconfont.ttf" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/style/static/h-ui.admin/skin/default/skin.css"
	id="skin" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/style/static/h-ui.admin/css/style.css" />
<title>双创管理系统后台</title>
</head>
<body>
	<header class="navbar-wrapper">
	<div class="navbar navbar-fixed-top">
		<div class="container-fluid cl">
			<a class="logo navbar-logo f-l mr-10 hidden-xs"
				href="/aboutHui.shtml">欢迎登录后台系统</a> <a
				class="logo navbar-logo-m f-l mr-10 visible-xs"
				href="/aboutHui.shtml">H-ui</a> <span
				class="logo navbar-slogan f-l mr-10 hidden-xs"></span> <a
				aria-hidden="false" class="nav-toggle Hui-iconfont visible-xs"
				href="javascript:;">&#xe667;</a>
			<nav class="nav navbar-nav">
			<ul class="cl">
				<li class="dropDown dropDown_hover"><a href="javascript:;"
					class="dropDown_A"><i class="Hui-iconfont">&#xe600;</i> 新增 <i
						class="Hui-iconfont">&#xe6d5;</i></a>
					<ul class="dropDown-menu menu radius box-shadow">
						<li><a href="javascript:;"
							onclick="article_add('添加设备','article-add.html')"><i
								class="Hui-iconfont">&#xe616;</i> 设备</a></li>
						<li><a href="javascript:;"
							onclick="member_add('添加用户','member-add.html','','510')"><i
								class="Hui-iconfont">&#xe60d;</i> 用户</a></li>
					</ul></li>
			</ul>
			</nav>
			<nav id="Hui-userbar" class="nav navbar-nav navbar-userbar hidden-xs">
			<ul class="cl">
				<li>超级管理员</li>
				<li class="dropDown dropDown_hover"><a href="#"
					class="dropDown_A">admin <i class="Hui-iconfont">&#xe6d5;</i></a>
					<ul class="dropDown-menu menu radius box-shadow">
						<li><a href="javascript:;" onClick="myselfinfo()">个人信息</a></li>
						<li><a href="login">切换账户</a></li>
						<li><a href="login">退出</a></li>
					</ul></li>
				<li id="Hui-msg"><a href="#" title="消息"><span
						class="badge badge-danger">1</span><i class="Hui-iconfont"
						style="font-size: 18px">&#xe68a;</i></a></li>
				<li id="Hui-skin" class="dropDown right dropDown_hover"><a
					href="javascript:;" class="dropDown_A" title="换肤"><i
						class="Hui-iconfont" style="font-size: 18px">&#xe62a;</i></a>
					<ul class="dropDown-menu menu radius box-shadow">
						<li><a href="javascript:;" data-val="default" title="默认（黑色）">默认（黑色）</a></li>
						<li><a href="javascript:;" data-val="blue" title="蓝色">蓝色</a></li>
						<li><a href="javascript:;" data-val="green" title="绿色">绿色</a></li>
						<li><a href="javascript:;" data-val="red" title="红色">红色</a></li>
						<li><a href="javascript:;" data-val="yellow" title="黄色">黄色</a></li>
						<li><a href="javascript:;" data-val="orange" title="橙色">橙色</a></li>
					</ul></li>
			</ul>
			</nav>
		</div>
	</div>
	</header>
	<aside class="Hui-aside">
	<div class="menu_dropdown bk_2">
		<dl id="menu-article">
			<dt><i class="Hui-iconfont">&#xe616;</i> 检查<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a data-href="cleanpage" data-title="卫生检查"
						href="javascript:void(0)">卫生检查</a></li>
					<li><a data-href="rulepage" data-title="纪律检查"
						href="javascript:void(0)">纪律检查</a></li>
					<li><a data-href="orderNames" data-title="考勤"
						href="javascript:void(0)">考勤</a></li>
				</ul>
			</dd>
		</dl>
		<dl id="menu-picture">
			<dt>
				<i class="Hui-iconfont">&#xe613;</i> 双创设备管理<i
					class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="shebeizhonglan" data-title="设备总览"
						href="javascript:void(0)">设备总览</a></li>
					<li><a data-href="shebeiwaijie" data-title="设备维护"
						href="javascript:void(0)">设备外借</a></li>
				</ul>
			</dd>
		</dl>
		<dl id="menu-product">
			<dt>
				<i class="Hui-iconfont">&#xe620;</i> 团队成员管理<i
					class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="adapt-teacher" data-title="团队成员信息"
						href="javascript:void(0)">指导老师调整</a></li>
					<li><a data-href="${pageContext.request.contextPath}/background/adapt-team.jsp" data-title="团队调整"
						href="javascript:void(0)">团队调整</a></li>
					<li><a data-href="adapt-player" data-title="成员调整"
						href="javascript:void(0)">成员调整</a></li>
				</ul>
			</dd>
		</dl>
		<dl id="menu-comments">
			<dt>
				<i class="Hui-iconfont">&#xe622;</i> 检索功能<i
					class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="shuangchuangchengyuan"
						data-title="双创成员汇总表" href="javascript:;">双创成员汇总</a></li>
					<li><a data-href="teamfenbiao" data-title="各团队分表"
						href="javascript:void(0)">各团队汇总</a></li>
					<li><a data-href="weijihuizongbiao" data-title="违纪汇总表"
						href="javascript:void(0)">违纪汇总</a></li>
					<li><a data-href="absence" data-title="缺勤汇总表"
						href="javascript:void(0)">缺勤汇总</a></li>
				</ul>
			</dd>
		</dl>
		<dl id="menu-member">
			<dt>
				<i class="Hui-iconfont">&#xe60d;</i> 学习资料存储<i
					class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="nofind" data-title="学习资料管理"
						href="javascript:;">学习资料管理</a></li>
					<li><a data-href="nofind" data-title="学习进度把控"
						href="javascript:;">学习进度把控</a></li>
				</ul>
			</dd>
		</dl>
		<dl id="menu-admin">
			<dt>
				<i class="Hui-iconfont">&#xe62d;</i> 管理员管理<i
					class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="admin-role" data-title="角色管理"
						href="javascript:void(0)">角色管理</a></li>
					<%-- <li><a data-href="${pageContext.request.contextPath}/background/admin-permission.jsp" data-title="权限管理"
						href="javascript:void(0)">权限管理</a></li> --%>
					<li><a data-href="admin-list" data-title="管理员列表"
						href="javascript:void(0)">管理员列表</a></li>
				</ul>
			</dd>
		</dl>
		<!-- <dl id="menu-system">
			<dt>
				<i class="Hui-iconfont">&#xe62e;</i> 通知<i
					class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="nofind" data-title="处分通知"
						href="javascript:void(0)">处分通知</a></li>
					<li><a data-href="nofind" data-title="卫生违纪通知"
						href="javascript:void(0)">卫生违纪通知</a></li>

				</ul>
			</dd>
		</dl> -->
		<dl id="menu-news">
			<dt>
				<i class="Hui-iconfont">&#xe655;</i> 新闻管理<i
					class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="news/news-category" data-title="新闻类别"
						href="javascript:void(0)">新闻类别</a></li>
					<li><a data-href="news/news-newsList" data-title="新闻列表"
						href="javascript:void(0)">新闻列表</a></li>
				</ul>
			</dd>
		</dl>
		<dl id="menu-project-company">
			<dt>
				<i class="Hui-iconfont">&#xe641;</i> 公司管理<i
					class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="companyManager" data-title="公司列表"
						href="javascript:void(0)">公司列表</a></li>
				</ul>
			</dd>
		</dl>
		<dl id="menu-project-company">
			<dt>
				<i class="Hui-iconfont">&#xe641;</i> 公司项目管理<i
					class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul>
					<li><a data-href="company/projectShop" data-title="项目市场"
						href="javascript:void(0)">项目市场</a></li>
					<li><a data-href="company/projectPublish" data-title="发布项目"
						href="javascript:void(0)">发布项目</a></li>
					<li><a data-href="company/projectPublished" data-title="发布的项目"
						href="javascript:void(0)">发布的项目</a></li>
				</ul>
			</dd>
		</dl>
	</div>
	</aside>
	<div class="dislpayArrow hidden-xs">
		<a class="pngfix" href="javascript:void(0);"
			onClick="displaynavbar(this)"></a>
	</div>
	<section class="Hui-article-box">
	<div id="Hui-tabNav" class="Hui-tabNav hidden-xs">
		<div class="Hui-tabNav-wp">
			<ul id="min_title_list" class="acrossTab cl">
				<li class="active"><span title="我的桌面" data-href="${pageContext.request.contextPath}/background/welcome.jsp">主页面</span>
					<em></em></li>
			</ul>
		</div>
		<div class="Hui-tabNav-more btn-group">
			<a id="js-tabNav-prev" class="btn radius btn-default size-S"
				href="javascript:;"><i class="Hui-iconfont">&#xe6d4;</i></a><a
				id="js-tabNav-next" class="btn radius btn-default size-S"
				href="javascript:;"><i class="Hui-iconfont">&#xe6d7;</i></a>
		</div>
	</div>
	<div id="iframe_box" class="Hui-article">
		<div class="show_iframe">
			<div style="display: none" class="loading"></div>
			<iframe scrolling="yes" frameborder="0" src="${pageContext.request.contextPath}/background/welcome.jsp"></iframe>
		</div>
	</div>
	</section>

	<div class="contextMenu" id="Huiadminmenu">
		<ul>
			<li id="closethis">关闭当前</li>
			<li id="closeall">关闭全部</li>
		</ul>
	</div>
	<!--_footer 作为公共模版分离出去-->
	<script type="text/javascript" src="${pageContext.request.contextPath}/style/lib/jquery/1.9.1/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/style/lib/layer/2.4/layer.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/style/static/h-ui/js/H-ui.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/style/static/h-ui.admin/js/H-ui.admin.js"></script>
	<!--/_footer 作为公共模版分离出去-->

	<!--请在下方写此页面业务相关的脚本-->
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/style/lib/jquery.contextmenu/jquery.contextmenu.r2.js"></script>
	<script type="text/javascript">
$(function(){
	/*$("#min_title_list li").contextMenu('Huiadminmenu', {
		bindings: {
			'closethis': function(t) {
				console.log(t);
				if(t.find("i")){
					t.find("i").trigger("click");
				}		
			},
			'closeall': function(t) {
				alert('Trigger was '+t.id+'\nAction was Email');
			},
		}
	});*/
});
/*个人信息*/
function myselfinfo(){
	layer.open({
		type: 1,
		area: ['300px','200px'],
		fix: false, //不固定
		maxmin: true,
		shade:0.4,
		title: '查看信息',
		content: '<div>管理员信息</div>'
	});
}

/*资讯-添加*/
function article_add(title,url){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}
/*图片-添加*/
function picture_add(title,url){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}
/*产品-添加*/
function product_add(title,url){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}
/*用户-添加*/
function member_add(title,url,w,h){
	layer_show(title,url,w,h);
}


</script>


</body>
</html>