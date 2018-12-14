<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" href="${pageContext.request.contextPath}/style/topcss/images/bitbug_favicon.ico" type="image/x-icon" />
<title>团队历程</title>
<meta name="description" content="">
<meta name="viewport" content="width=device-width">
<script type="text/javascript" src="${pageContext.request.contextPath}/style/loginstyle/js/jquery.min.js"></script>
<!-- Bootstrap styles -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/style/loginstyle/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/style/topcss/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/style/topcss/Teamstyle.css"
	id="theme-styles">
</head>
<body>
	<header>
	<div class="widewrapper subheader">
		<div class="container">
			<div class="clean-breadcrumb">
				<a href="TeamShow.html" style="font-size: 40px;">双创团队</a>
			</div>
			<a style="float:right;margin-right:20px;margin-top:26px;" href="${pageContext.request.contextPath}">返回首页</a>
		</div>
	</div>
	</header>

	<div class="widewrapper main">
		<div class="container">
			<div class="row">
				<div class="col-md-8 blog-main" style="min-height:1000px;">
					<article class="blog-post">
					<div class="body">
						<h1>${newsNew.newsnewTitle }</h1>
						<div class="meta">
							<i class="fa fa-user"></i> ${newsNew.newsnewAuthorname } <i
								class="fa fa-calendar"></i>${newsNew.newsnewPubtime }<span
								class="data"></span>
						</div>
						<p id="newsNew_contentBox" style="overflow: hidden;min-height:600px;"></p>
					</div>
					</article>
					<script type="text/javascript">
						//获取文章内容的Uri
						var htmlFileUri="${pageContext.request.contextPath}${newsNew.newsnewHtmluri}";
						//设置外部htmlUri文件
						function getHtmlContentFromHtmlFileUri(uri){
							$.get(uri,function(date,status){
								$('#newsNew_contentBox').html(date);
							});
						}
						document.ready = function (callback) {
							getHtmlContentFromHtmlFileUri(htmlFileUri);
						}
				</script>
					<aside class="social-icons clearfix" >
					<h3>分享到...</h3>
					<a href="#"><i class="fa fa-facebook"></i></a> <a href="#"><i
						class="fa fa-twitter"></i></a> <a href="#"><i class="fa fa-google"></i></a>
					</aside>
<!-- 
					<aside class="comments" id="comments">
					<hr>

					<h2>团队优秀成员</h2>

					<article class="comment"> <header class="clearfix">
					<img
						src="${pageContext.request.contextPath}/style/temp/img/avatar.png"
						alt="A Smart Guy" class="avatar">
					<div class="meta">
						<h3>
							<a href="#">姓名</a>
						</h3>
						<span class="date"> 2012.12.12 </span>
					</div>
					</header>
					<div class="body">个人介绍 个人介绍 个人介绍 个人介绍 个人介绍 个人介绍 个人介绍 个人介绍
						个人介绍 个人介绍 个人介绍 个人介绍 个人介绍</div>
					</article> <article class="comment "> <header class="clearfix">
					<img
						src="${pageContext.request.contextPath}/style/temp/img/avatar.png"
						alt="A Smart Guy" class="avatar">
					<div class="meta">
						<h3>
							<a href="#">姓名</a>
						</h3>
						<span class="date"> 2012.12.12 </span>
					</div>
					</header>
					<div class="body">个人介绍 个人介绍 个人介绍 个人介绍 个人介绍 个人介绍 个人介绍 个人介绍
						个人介绍 个人介绍 个人介绍 个人介绍 个人介绍</div>
					</article> <article class="comment"> <header class="clearfix">
					<img
						src="${pageContext.request.contextPath}/style/temp/img/avatar.png"
						alt="A Smart Guy" class="avatar">
					<div class="meta">
						<h3>
							<a href="#">姓名</a>
						</h3>
						<span class="date"> 2012.12.12 </span>
					</div>
					</header>
					<div class="body">个人介绍 个人介绍 个人介绍 个人介绍 个人介绍 个人介绍 个人介绍 个人介绍
						个人介绍 个人介绍 个人介绍 个人介绍 个人介绍</div>
					</article> </aside>
-->
				</div>
				<aside class="col-md-4 blog-aside">

				<div class="aside-widget">
					<header>
					<h3>公告</h3>
					</header>
					<div class="body">
						<ul class="clean-list">
							<c:forEach items="${list_announ }" var="list_announItem">
								<li><a
									href="${pageContext.request.contextPath}/News/News/New?newsnewId=${list_announItem.newsnewId }">${list_announItem.newsnewTitle }</a></li>
							</c:forEach>
						</ul>
					</div>
				</div>

				<div class="aside-widget">
					<header>
					<h3>新闻</h3>
					</header>
					<div class="body">
						<ul class="clean-list">
							<c:forEach items="${list_news }" var="list_newsItem">
								<li><a
									href="${pageContext.request.contextPath}/News/News/New?newsnewId=${list_newsItem.newsnewId }">${list_newsItem.newsnewTitle }</a></li>
							</c:forEach>
						</ul>
					</div>
				</div>

				<div class="aside-widget">
					<header>
					<h3>技术</h3>
					</header>
					<div class="body clearfix">
						<ul class="tags">
							<li><a href="#">HTML5</a></li>
							<li><a href="#">CSS3</a></li>
							<li><a href="#">JAVA</a></li>
							<li><a href="#">JAVA WEB</a></li>
							<li><a href="#">UNIX</a></li>
							<li><a href="#">BOOTSTRAP</a></li>
							<li><a href="#">VR</a></li>
							<li><a href="#">UI/UX</a></li>
						</ul>
					</div>
				</div>
				</aside>
			</div>
		</div>
	</div>

	<footer>
	<div class="widewrapper copyright">
		Copyright 2018 <a href="http://www.pdsu.edu.cn/" target="_blank"
			title="平顶山学院">平顶山学院</a> - <a href="http://www.pdsu.edu.cn/"
			title="创新创业中心" target="_blank">创新创业中心</a>
	</div>
	</footer>

</body>
</html>