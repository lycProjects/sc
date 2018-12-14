<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>错误提示</title>
<link href='http://fonts.googleapis.com/css?family=Love+Ya+Like+A+Sister' rel='stylesheet' type='text/css'>
<style type="text/css">
body{
	font-family: 'Love Ya Like A Sister', cursive;
}
body{
	background:#eaeaea;
}	
.wrap{
	margin:0 auto;
	width:1000px;
}
.logo{
	text-align:center;
	margin-top:100px;
}
.logo img{
	width:350px;
}
.logo p{
	color:#272727;
	font-size:40px;
	margin-top:1px;
}	
.logo p span{
	color:lightgreen;
}	
.sub a{
	color:#fff;
	background:#272727;
	text-decoration:none;
	padding:10px 20px;
	font-size:13px;
	font-family: arial, serif;
	font-weight:bold;
	-webkit-border-radius:.5em;
	-moz-border-radius:.5em;
	-border-radius:.5em;
}	

</style>
</head>
 <div class="wrap">
	<div class="logo">
			<p>服务器开小差了，请稍后再试...</p>
			<img src="${pageContext.request.contextPath}/images/404-1.png"/>
			<div class="sub">
			  <p><a href="javascript:history.back()">返回上一页 </a></p>
			</div>
	</div>
 </div>	
</body>
</html>