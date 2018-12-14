<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
	<head>
		<title>News</title>
				<link rel="shortcut icon" href="${pageContext.request.contextPath}/style/topcss/images/bitbug_favicon.ico" type="image/x-icon" />
		<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
		<link href="css/Newstyle.css" rel="stylesheet" type="text/css" media="all" />
		<script src="js/jquery.min.js"></script>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<script type="application/x-javascript">
			addEventListener("load", function() {
				setTimeout(hideURLbar, 0);
			}, false);

			function hideURLbar() {
				window.scrollTo(0, 1);
			}
		</script>
	</head>

	<body>
		<!-- header-section-starts -->
		<div class="header">
			<div class="container">
				<div class="logo">
					<a href="News">
						<h1>合作公司</h1></a>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
		<div class="container">
			<div class="header-bottom">
				<div class="type">
					<h5></h5>
				</div>
				<span class="menu"></span>
				<div class="list-nav">
					<ul>
					<li>
						<a href="http://news.pdsu.edu.cn/xyxw.htm">校新闻</a>
					</li>
					<c:forEach items="${newsCategory }" var="newsCategoryItem">
						|<li>
							<a href="News?newscateId=${newsCategoryItem.newscateId }">${newsCategoryItem.newscateTitle }</a>
						</li>
					</c:forEach>
					</ul>
				</div>
				<!-- script for menu -->
				<script>
					$("span.menu").click(function() {
						$(".list-nav").slideToggle("slow", function() {
							// Animation complete.
						});
					});
				</script>
				<!-- script for menu -->

				<div class="clearfix"></div>
			</div>
		</div>

		<div class="container">
			<div class="content">
				<div class="col-md-7 content-left">
					<div class="article">
						<h6>青云 </h6>
						<a class="title" href="NewsSingle.html">青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍</a>
						<a href="NewsSingle.html"><img src="images/a1.jpg" alt="" /></a>
						<p>青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍 </p>
						<p>青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云...</p>
					</div>
					<div class="article">
						<h6>青云</h6>
						<a class="title" href="NewsSingle.html">青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍 </a>
						<a href="NewsSingle.html"><img src="images/a2.jpg" alt="" /></a>
						<p>青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍青云介绍 </p>
					</div>
				</div>
				<div class="col-md-5 content-right">
					<div class="content-right-top">
						<a href="NewsSingle.html">
							<div class="editor text-center">
								<h3>公司名称公司名称公司名称公司名称公司名称公司名称</h3>
								<p>公司简介公司简介公司简介公司简介</p>
								<label>2 天前</label>
								<span></span>
							</div>
						</a>
						<a class="active" href="NewsSingle.html">
							<div class="editor text-center">
								<h3>公司名称公司名称公司名称公司名称公司名称公司名称</h3>
								<p>公司简介公司简介公司简介公司简介</p>
								<label>3天前</label>
								<span></span>
							</div>
						</a>
						<a href="NewsSingle.html">
							<div class="editor text-center">
								<h3>公司名称公司名称公司名称公司名称公司名称公司名称</h3>
								<p>公司简介公司简介公司简介公司简介</p>
								<label>2天前</label>
								<span></span>
							</div>
						</a>
						<a href="NewsSingle.html">
							<div class="editor text-center">
								<h3>公司名称公司名称公司名称公司名称公司名称公司名称</h3>
								<p>公司简介公司简介公司简介公司简介</p>
								<label>3天前</label>
								<span></span>
							</div>
						</a>
						<a href="NewsSingle.html">
							<div class="editor text-center">
								<h3>公司名称公司名称公司名称公司名称公司名称公司名称</h3>
								<p>公司简介公司简介公司简介公司简介</p>
								<label>3天前</label>
								<span></span>
							</div>
						</a>
						<a href="NewsSingle.html">
							<div class="editor text-center">
								<h3>公司名称公司名称公司名称公司名称公司名称公司名称</h3>
								<p>公司简介公司简介公司简介公司简介</p>
								<label>3天前</label>
								<span></span>
							</div>
						</a>
						<a href="NewsSingle.html">
							<div class="editor text-center">
								<h3>公司名称公司名称公司名称公司名称公司名称公司名称</h3>
								<p>公司简介公司简介公司简介公司简介</p>
								<label>3天前</label>
								<span></span>
							</div>
						</a>
						
					</div>
					<!--<div class="editors-pic-grids">
						<div class="editors-pic">
							<div class="e-pic">
								<a href="NewsSingle.html"><img src="images/ep1.jpg" alt="" /></a>
							</div>
							<div class="e-pic-info">
								<a href="NewsSingle.html">公司名称公司名称公司名称公司名称公司名称公司名称</a>
								<span></span>
								<label>2天前</label>
							</div>
							<div class="clearfix"></div>
						</div>
						<div class="editors-pic">
							<div class="e-pic">
								<a href="NewsSingle.html"><img src="images/ep2.jpg" alt="" /></a>
							</div>
							<div class="e-pic-info">
								<a href="NewsSingle.html">公司名称公司名称公司名称公司名称公司名称公司名称</a>
								<span></span>
								<label>2天前</label>
							</div>
							<div class="clearfix"></div>
						</div>
						<div class="editors-pic">
							<div class="e-pic">
								<a href="NewsSingle.html"><img src="images/ep3.jpg" alt="" /></a>
							</div>
							<div class="e-pic-info">
								<a href="NewsSingle.html">公司名称公司名称公司名称公司名称公司名称公司名称</a>
								<span></span>
								<label>2天前</label>
							</div>
							<div class="clearfix"></div>
						</div>
						<div class="editors-pic">
							<div class="e-pic">
								<a href="NewsSingle.html"><img src="images/ep4.jpg" alt="" /></a>
							</div>
							<div class="e-pic-info">
								<a href="NewsSingle.html">新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻?</a>
								<span></span>
								<label>2天前</label>
							</div>
							<div class="clearfix"></div>
						</div>
					</div>-->
				</div>
				<div class="clearfix"></div>
					<hr />
				<div class="col-md-7 content-left">
					<!--<div class="article">
						<h6>事件名称 </h6>
						<a class="title" href="NewsSingle.html">事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件</a>
						<a href="NewsSingle.html"><img src="images/a1.jpg" alt="" /></a>
						<p>事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件 事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件  </p>
						<p>事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件 事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件事件描述事件描述事件描述...</p>
					</div>-->
				</div>
				<div class="col-md-5 content-right content-right-top">
					<!--<h5 class="head">最火</h5>
					<a href="NewsSingle.html">
						<div class="editor text-center">
							<h3>新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻</h3>
							<p>新闻新闻新闻新闻新闻新闻新闻新闻</p>
							<label>2天前</label>
							<span></span>
						</div>
					</a>
					<a href="NewsSingle.html">
						<div class="editor text-center">
							<h3>新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻</h3>
							<p>新闻新闻新闻新闻新闻新闻新闻新闻</p>
							<label>2天前</label>
							<span></span>
						</div>
					</a>
					<a href="NewsSingle.html">
						<div class="editor text-center">
							<h3>新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻</h3>
							<p>新闻新闻新闻新闻新闻新闻新闻新闻</p>
							<label>3天前</label>
							<span></span>
						</div>
					</a>-->
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
		<div class="footer">
			<div class="footer-bottom">
				<div class="container">
					<div class="copyrights">
						<p>Copyright &copy; 2015.Company name All rights reserved.平顶山学院
							<a target="_blank" href="http://www.cssmoban.com/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a> - More Templates	
						</p>
					</div>
				</div>
			</div>
		</div>
	</body>

</html>
