<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
	<head>
			<link rel="shortcut icon" href="${pageContext.request.contextPath}/style/topcss/images/bitbug_favicon.ico" type="image/x-icon" />
		<title>Contact</title>
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
				<div class="contact-section">
					<h3 class="c-head">联系我们</h3>
					<div class="singel_right">
						<div class="lcontact span_1_of_contact">
							<div class="contact-form">
								<form method="post" action="">
									<p class="comment-form-author"><label for="author">你的名字:</label>
										<input type="text" class="textbox" value="请在这里输入你的名字..." onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '请在这里输入你的名字...';}">
									</p>
									<p class="comment-form-author"><label for="author">邮箱:</label>
										<input type="text" class="textbox" value="请在这里输入你的邮箱..." onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '邮箱';}">
									</p>
									<p class="comment-form-author"><label for="author">信息:</label>
										<textarea value="请在这里输入你的信息..." onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '信息';}">请在这里输入你的信息...</textarea>
									</p>
									<input name="submit" type="submit" id="submit" value="提交">
								</form>
							</div>
						</div>
						<div class="contact_grid span_2_of_contact_right">
							<h3>地址</h3>
							<div class="address">
								<i class="pin_icon"></i>
								<div class="contact_address">
									河南省平顶山市新华区未来路南段
								</div>
								<div class="clearfix"></div>
							</div>
							<div class="address">
								<i class="phone"></i>
								<div class="contact_address">
									1-25-2568-897
								</div>
								<div class="clearfix"></div>
							</div>
							<div class="address">
								<i class="mail"></i>
								<div class="contact_email">
									<a href="mailto:example@gmail.com">info(at)company.com</a>
								</div>
								<div class="clearfix"></div>
							</div>
						</div>
						<div class="clearfix"></div>
					</div>
					
				</div>
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
