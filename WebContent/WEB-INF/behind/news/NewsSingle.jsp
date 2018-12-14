<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
	<head>
			<link rel="shortcut icon" href="${pageContext.request.contextPath}/style/topcss/images/bitbug_favicon.ico" type="image/x-icon" />
		<title>NewsSingle</title>
		<link href="../css/bootstrap.css" rel='stylesheet' type='text/css' />
		<link href="../css/Newstyle.css" rel="stylesheet" type="text/css" media="all" />
		<script src="../js/jquery.min.js"></script>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="keywords" content="Konstructs Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
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
					<a href="../News">
						<h1>新闻</h1></a>
				</div>
				<div class="navigation">
					<ul>
						<li>
							<a class="active" href="../NewsContact">联系我们</a>
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
							<a href="../News?newscateId=${newsCategoryItem.newscateId }">${newsCategoryItem.newscateTitle }</a>
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
				<div class="single-page">
					<div class="print-main">
						<h3>${newsNew.newsnewTitle }</h3>
						<p class="sub_head">发表于
							<a href="#">${newsNew.newsnewAuthorname }</a>&nbsp;${newsNew.newsnewPubtime }</p>
						<p class="span"></p>
						<p class="ptext" id="newsNew_contentBox" style="overflow: hidden;">
						</p>
					</div>

				</div>
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
				<div class="col-md-7 single-content-left">
					<div class="features-list">
						<h3>最近更新</h3>
						<ul>
							<c:forEach items="${newsNewList_newsest }" var="newsNewList_newsestItem">
								<li>
									<a href="${pageContext.request.contextPath}/News/News/New?newsnewId=${newsNewList_newsestItem.newsnewId }">${newsNewList_newsestItem.newsnewTitle }</a>
								</li>
							</c:forEach>
						</ul>
					</div>
					<div class="single">
						<div class="leave">
							<h4>留下您的评论</h4>
						</div>
						<form id="commentform">
							<p class="comment-form-author-name"><label for="author">姓名</label>
								<input id="author" name="author" type="text" value="" size="30" aria-required="true">
							</p>
							<p class="comment-form-email">
								<label for="email">邮箱</label>
								<input id="email" name="email" type="text" value="" size="30" aria-required="true">
							</p>
							<p class="comment-form-url">
								<label for="url">网站</label>
								<input id="url" name="url" type="text" value="http://w3layouts.com" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'http://w3layouts.com';}">
							</p>
							<p class="comment-form-comment">
								<label for="comment">评论</label>
								<textarea></textarea>
							</p>
							<div class="clearfix"></div>
							<p class="form-submit">
								<input name="submit" type="submit" id="submit" value="发表">
							</p>
							<div class="clearfix"></div>
						</form>
						<div class="comments1">
							<h4>精选评论</h4>
							<div class="comments-main">
								<div class="col-md-3 cmts-main-left">
									<img src="images/avatar.jpg" alt="">
								</div>
								<div class="col-md-9 cmts-main-right">
									<h5>姓名一</h5>
									<p>评论评论评论评论评论评论评论评论评论评论评论评论评论评论评论评论评论评论评论评论评论评论评论评论评论评论评论评论评论评论评论评论评评论评论评论评论评论评论...</p>
									<div class="cmts">
										<div class="col-md-6 cmnts-left">
											<p>&nbsp;2018年&nbsp;9月&nbsp;10日, 18:01</p>
										</div>
										<div class="clearfix"></div>
									</div>
								</div>
								<div class="clearfix"></div>
							</div>
							<div class="comments-main">
								<div class="col-md-3 cmts-main-left">
									<img src="images/avatar.jpg" alt="">
								</div>
								<div class="col-md-9 cmts-main-right">
									<h5>姓名二</h5>
									<p>评论评论评论评论评论评论评论评论评论评论评论评论评论评论评论评论评论评论评论评论评论评论评论评论评论评论评论评论评论评论评论评论评评论评论评论评论评论评论...</p>
									<div class="cmts">
										<div class="col-md-6 cmnts-left">
											<p>&nbsp;2018年&nbsp;9月&nbsp;10日, 18:01</p>
										</div>
										<div class="clearfix"></div>
									</div>
								</div>
								<div class="clearfix"></div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-5 content-right content-right-top">
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
				<div class="clearfix"></div>
			</div>
		</div>
		<div class="footer">
			<div class="footer-bottom">
				<div class="container">
					<div class="copyrights">
						<p>Copyright &copy; 2015.Company name All rights reserved.
							<a target="_blank" href="http://www.cssmoban.com/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a> - More Templates
						</p>
					</div>
				</div>
			</div>
		</div>
	</body>

</html>
