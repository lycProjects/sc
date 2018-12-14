<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${empty requestScope.wsrule }">
	   	没有任何员工的信息
	</c:if>
	<c:if test="${!empty requestScope.wsrule }" var="emp">
		wsrule:${requestScope.wsrule }
	</c:if>
	<br>
========================================================================
<br>
	wsrules:${requestScope.wsrules }
	<c:if test="${empty requestScope.wsrules }">
	   	没有任何员工的信息
	</c:if>
	<c:if test="${!empty requestScope.wsrules }">
		<table border="1" cellpadding="10" cellspacing="0">
			<tr>
				<th>团队</th>
				<th>违纪</th>
				<td>时间</td>
			</tr>
			<c:forEach items="${requestScope.wsrules }" var="emp">
				<tr>
					<td>${emp.teammapping.tmmName }</td>
					<td>${emp.wsRecode }</td>
					<td>${emp.wsTime }</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
<br>
	<c:if test="${!empty requestScope.teacher }" var="emp">
		teacher:${requestScope.teacher }
	</c:if>
	<br>
</body>
</html>