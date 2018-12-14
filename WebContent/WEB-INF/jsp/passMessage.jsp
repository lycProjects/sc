<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="refresh" content="3;URL=${pageContext.request.contextPath}${nextUrl }">
<title>Insert title here</title>
</head>
<body>
	<center><h4>${msg }<br/>不能自动跳转？点击<a href="${pageContext.request.contextPath}${nextUrl }">这里</a></h4></center>
</body>
</html>