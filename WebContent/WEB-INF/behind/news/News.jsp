<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
	<head>
		<link rel="shortcut icon" href="${pageContext.request.contextPath}/style/topcss/images/bitbug_favicon.ico" type="image/x-icon" />
		<title>${mNewsNewList_categoryTitle} - 双创新闻</title>
		<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
		<link href="css/Newstyle.css" rel="stylesheet" type="text/css" media="all" />
		<script src="js/jquery.min.js"></script>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<script type="application/x-javascript">
			addEventListener("load", function() {
				//setTimeout(hideURLbar, 0);
			}, false);

			function hideURLbar() {
				window.scrollTo(0, 0);
			}
		</script>
	</head>

	<body>
		<!-- header-section-starts -->
		<div class="header">
			<div class="container">
				<div class="logo">
					<a href="News">
						<h1>新闻</h1></a>
				</div>
				<div class="navigation">
					<ul>
						<li>
							<a class="active" href="NewsContact">联系我们</a>
						</li>
					</ul>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
		<div class="container">
			<div class="header-bottom">
				<div class="type">
					<h5>${mNewsNewList_categoryTitle}</h5>
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
					|<li>
						<a href="${pageContext.request.contextPath}">返回首页</a>
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
				<div class="col-md-7 content-left" style="min-height:1730px;">
					<% String[] shijianTitle={"一","二","三","四","五","六","七","八","九","十"};int i=0; %>
					<c:forEach items="${newsNewList }" var="newsNewListItem">
						<div class="article">
							<h5 class="head">事件<%=shijianTitle[i++] %></h5>
							<h6>${newsNewListItem.newsnewPubtime }</h6>
							<a class="title" href="${pageContext.request.contextPath}/News/News/New?newsnewId=${newsNewListItem.newsnewId }">${newsNewListItem.newsnewTitle }</a>
							<c:if test="${newsNewListItem.imageUrl!=null }">
								<a href="${pageContext.request.contextPath}/News/News/New?newsnewId=${newsNewListItem.newsnewId }">
									<img src="${newsNewListItem.imageUrl }" alt="" />
								</a>
							</c:if>
							<p>${newsNewListItem.newsnewBrief }</p>
						</div>
					</c:forEach>
				</div>
				<div class="col-md-5 content-right">
					<div class="content-right-top">
						<h5 class="head">最新</h5>
						<c:forEach items="${newsNewList_newsest }" var="newsNewList_newsestItem">
							<a href="${pageContext.request.contextPath}/News/News/New?newsnewId=${newsNewList_newsestItem.newsnewId }">
								<div class="editor text-center">
									<h3>${newsNewList_newsestItem.newsnewTitle }</h3>
									<p>${newsNewList_newsestItem.newsnewBrief }</p>
									<label>${newsNewList_newsestItem.newsnewPubtime }</label>
									<span></span>
								</div>
							</a>
						</c:forEach>
					</div>
					<div class="editors-pic-grids">
						<h5>最热</h5>
						<c:forEach items="${newsNewList_hot }" var="newsNewList_hotItem">
							<div class="editors-pic">
								<div class="e-pic">
									<a href="${pageContext.request.contextPath}/News/News/New?newsnewId=${newsNewList_hotItem.newsnewId }"><img src="${newsNewList_hotItem.imageUrl }" alt="" /></a>
								</div>
								<div class="e-pic-info">
									<a href="${pageContext.request.contextPath}/News/News/New?newsnewId=${newsNewList_hotItem.newsnewId }">${newsNewList_hotItem.newsnewTitle }</a>
									<span></span>
									<label>${newsNewList_hotItem.newsnewPubtime }</label>
								</div>
								<div class="clearfix"></div>
							</div>
						</c:forEach>
					</div>
				</div>
				<div class="col-md-5 content-right content-right-top">
					<h5 class="head">最火</h5>
					<c:forEach items="${newsNewList_fire }" var="newsNewList_fireItem">
						<a href="${pageContext.request.contextPath}/News/News/New?newsnewId=${newsNewList_fireItem.newsnewId }">
							<div class="editor text-center">
								<h3>${newsNewList_fireItem.newsnewTitle }</h3>
								<p>${newsNewList_fireItem.newsnewBrief }</p>
								<label>${newsNewList_fireItem.newsnewPubtime }</label>
								<span></span>
							</div>
						</a>
					</c:forEach>
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
