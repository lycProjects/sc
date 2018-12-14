<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Contact</title>
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