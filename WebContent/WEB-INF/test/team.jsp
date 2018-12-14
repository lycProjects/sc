<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>成功</h1>

	<c:if test="${empty requestScope.absences }">
	   	没有任何员工的信息
	</c:if>
	<c:if test="${!empty requestScope.absences }">
		<table border="1" cellpadding="10" cellspacing="0">
			<tr>
				<th>姓名</th>
				<th>团队</th>
				<th>缺勤次数</th>
				<td>删除</td>
				<td>修改</td>
				<td>添加</td>

			</tr>

			<c:forEach items="${requestScope.absences }" var="emp">
				<tr>
					<td>${emp.abName }</td>
					<td>${emp.abTeam }</td>
					<td>${emp.abTime }</td>
					<td><a href="/delete/${emp.abId}}">删除</a></td>
					<td></td>
					<td>${emp.abTime }</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>