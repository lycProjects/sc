<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>News</title>
    <link href="${pageContext.request.contextPath}/style/loginstyle/css/bootstrap.css" rel='stylesheet' type='text/css' />
	<link href="${pageContext.request.contextPath}/style/topcss/Newstyle.css" rel="stylesheet" type="text/css" media="all" />
	<script src="${pageContext.request.contextPath}/style/loginstyle/js/jquery.min.css""></script>
	<meta name="viewport" content="width=device-width, initial-scale=1">
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
	<div class="header">
			<div class="container">
				<div class="logo">
					<a href="News.jsp">
						<h1>新闻</h1></a>
				</div>
				<div class="navigation">
					<ul>
						<li>
							<a class="active" href="NewsContact.jsp">联系我们</a>
						</li>
					</ul>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
		<div class="container">
			<div class="header-bottom">
				<div class="type">
					<h5>热点新闻</h5>
				</div>
				<span class="menu"></span>
				<div class="list-nav">
					<ul>
						<li>
							<a href="http://news.pdsu.edu.cn/xyxw.htm">校新闻</a>
						</li>|
						<li>
							<a href="https://www.btime.com/ent?from=gjl">娱乐</a>
						</li>|
						<li>
							<a href="https://www.btime.com/sports?from=gjl">体育</a>
						</li>|
						<li>
							<a href="https://www.btime.com/finance?from=gjl">财经</a>
						</li>|
						<li>
							<a href="https://www.btime.com/tech?from=gjl">科技</a>
						</li>|
						<li>
							<a href="https://www.btime.com/life?from=gjl">生活</a>
						</li>
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
						<h5 class="head">重大事件一</h5>
						<h6>事件名称 </h6>
						<a class="title" href="NewsSingle.jsp">事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件</a>
						<a href="NewsSingle.html"><img src="${pageContext.request.contextPath}/style/temp/images/a1.jpg" alt="" /></a>
						<p>事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件 事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件 </p>
						<p>事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件 事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件事件描述事件描述事件描述...</p>
					</div>
					<div class="article">
						<h6>事件名称</h6>
						<a class="title" href="NewsSingle.jsp">事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件 </a>
						<a href="NewsSingle.html"><img src="${pageContext.request.contextPath}/style/temp/images/a2.jpg" alt="" /></a>
						<p>事件描述事件描述事件描述事件描述事件描述事件描述事件事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件 事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件 事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件 </p>
					</div>
				</div>
				<div class="col-md-5 content-right">
					<div class="content-right-top">
						<h5 class="head">最新</h5>
						<a href="NewsSingle.jsp">
							<div class="editor text-center">
								<h3>新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻</h3>
								<p>新闻新闻新闻新闻新闻新闻新闻新闻</p>
								<label>2 天前</label>
								<span></span>
							</div>
						</a>
						<a class="active" href="NewsSingle.jsp">
							<div class="editor text-center">
								<h3>新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻</h3>
								<p>新闻新闻新闻新闻新闻新闻新闻新闻</p>
								<label>3天前</label>
								<span></span>
							</div>
						</a>
						<a href="NewsSingle.jsp">
							<div class="editor text-center">
								<h3>新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻</h3>
								<p>新闻新闻新闻新闻新闻新闻新闻新闻</p>
								<label>2天前</label>
								<span></span>
							</div>
						</a>
						<a href="NewsSingle.jsp">
							<div class="editor text-center">
								<h3>新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻</h3>
								<p>新闻新闻新闻新闻新闻新闻新闻新闻</p>
								<label>3天前</label>
								<span></span>
							</div>
						</a>
					</div>
					<div class="editors-pic-grids">
						<h5>最热</h5>
						<div class="editors-pic">
							<div class="e-pic">
								<a href="NewsSingle.jsp"><img src="${pageContext.request.contextPath}/style/temp/images/ep1.jpg" alt="" /></a>
							</div>
							<div class="e-pic-info">
								<a href="NewsSingle.jsp">新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻</a>
								<span></span>
								<label>2天前</label>
							</div>
							<div class="clearfix"></div>
						</div>
						<div class="editors-pic">
							<div class="e-pic">
								<a href="NewsSingle.jsp"><img src="${pageContext.request.contextPath}/style/temp/images/ep2.jpg" alt="" /></a>
							</div>
							<div class="e-pic-info">
								<a href="NewsSingle.jsp">新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻?</a>
								<span></span>
								<label>2天前</label>
							</div>
							<div class="clearfix"></div>
						</div>
						<div class="editors-pic">
							<div class="e-pic">
								<a href="NewsSingle.jsp"><img src="${pageContext.request.contextPath}/style/temp/images/ep3.jpg"alt="" /></a>
							</div>
							<div class="e-pic-info">
								<a href="NewsSingle.jsp">新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻</a>
								<span></span>
								<label>2天前</label>
							</div>
							<div class="clearfix"></div>
						</div>
						<div class="editors-pic">
							<div class="e-pic">
								<a href="NewsSingle.jsp"><img src="${pageContext.request.contextPath}/style/temp/images/ep4.jpg" alt="" /></a>
							</div>
							<div class="e-pic-info">
								<a href="NewsSingle.html">新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻?</a>
								<span></span>
								<label>2天前</label>
							</div>
							<div class="clearfix"></div>
						</div>
					</div>
				</div>
				<div class="clearfix"></div>
					<hr />
				<div class="col-md-7 content-left">
					<div class="article">
						<h5 class="head">重大事件二</h5>
						<h6>事件名称 </h6>
						<a class="title" href="NewsSingle.html">事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件</a>
						<a href="NewsSingle.html"><img src="${pageContext.request.contextPath}/style/temp/images/a1.jpg" alt="" /></a>
						<p>事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件 事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件  </p>
						<p>事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件 事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件描述事件事件描述事件描述事件描述...</p>
					</div>
				</div>
				<div class="col-md-5 content-right content-right-top">
					<h5 class="head">最火</h5>
					<a href="NewsSingle.jsp">
						<div class="editor text-center">
							<h3>新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻</h3>
							<p>新闻新闻新闻新闻新闻新闻新闻新闻</p>
							<label>2天前</label>
							<span></span>
						</div>
					</a>
					<a href="NewsSingle.jsp">
						<div class="editor text-center">
							<h3>新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻</h3>
							<p>新闻新闻新闻新闻新闻新闻新闻新闻</p>
							<label>2天前</label>
							<span></span>
						</div>
					</a>
					<a href="NewsSingle.jsp">
						<div class="editor text-center">
							<h3>新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻新闻</h3>
							<p>新闻新闻新闻新闻新闻新闻新闻新闻</p>
							<label>3天前</label>
							<span></span>
						</div>
					</a>
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