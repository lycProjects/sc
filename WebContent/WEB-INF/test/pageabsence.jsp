<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.12.4.min.js"></script>
<script type="text/javascript">
            //全选
        var oall=document.getElementById("all");
        var oid=document.getElementsByName("id");
        oall.onclick=function(){
            for(var i=0;i<oid.length;i++){
                //所有的选择框和全选一致
                oid[i].checked=oall.checked;        
            }
        };
        //点击复选框
        for(var i=0;i<oid.length;i++){
            oid[i].onclick=function(){
                //判断是否全部选中,遍历集合
                for(var j=0;j<oid.length;j++){
                  if(oid[j].checked==false){
                    oall.checked=false;
                    break;
                  }else{
                    oall.checked=true;
                  }
                }
            };
        }
        //点击删除
        $("#del").click(function(){
            var d="";
            var n=0;
            for(var i=0;i<oid.length;i++){
                if(oid[i].checked==true){//选中为true
                    var id=oid[i].value;
                    if(n==0){
                        d+="d="+id;
                    }else{
                        d+="&d="+id;
                    }
                    n++;
                }           
            }
            //上面会拼接出一个名为d的数组 d=1&d=2&d=3&d=4……
            $.get("del",d,function(data){
                if(data=="\"ok\""){
                    alert("删除成功!");
                    //删除成功后，调用action方法刷新页面信息
                    location.href="findAllStandardList.html";
                }else{
                    alert("删除失败!");
                }
            });
        });
</script>
</head>
<body>
	<table border="1" cellpadding="10" cellspacing="0">
		<tr>
			<th><input id="all" type="checkbox" /></th>
			<th>姓名</th>
			<th>团队</th>
			<th>缺勤次数</th>
		</tr>
		<c:forEach items="${absence }" var="emp">
			<tr>
				<td><input name="id" type="checkbox" value="${emp.abId }" /></td>
				<td>${emp.abName }</td>
				<td>${emp.abTeam }</td>
				<td>${emp.abTime }</td>
			</tr>
		</c:forEach>
	</table>
	<button id="del">批量删除</button>




	<!-- 分页 -->
	<div align="center">
		<font size="2">共 ${page.totalPageCount} 页</font> <font size="2">第
			${page.pageNow} 页</font> <a
			href="${pageContext.request.contextPath}/page?pageNow=1">首页</a>
		<c:choose>
			<c:when test="${page.pageNow - 1 > 0}">
				<a
					href="${pageContext.request.contextPath}/page?pageNow=${page.pageNow - 1}">上一页</a>
			</c:when>
			<c:when test="${page.pageNow - 1 <= 0}">
				<a href="${pageContext.request.contextPath}/page?pageNow=1">上一页</a>
			</c:when>
		</c:choose>
		<c:choose>
			<c:when test="${page.totalPageCount==0}">
				<a
					href="${pageContext.request.contextPath}/page?pageNow=${page.pageNow}">下一页</a>
			</c:when>
			<c:when test="${page.pageNow + 1 < page.totalPageCount}">
				<a
					href="${pageContext.request.contextPath}/page?pageNow=${page.pageNow + 1}">下一页</a>
			</c:when>
			<c:when test="${page.pageNow + 1 >= page.totalPageCount}">
				<a
					href="${pageContext.request.contextPath}/page?pageNow=${page.totalPageCount}">下一页</a>
			</c:when>
		</c:choose>
		<c:choose>
			<c:when test="${page.totalPageCount==0}">
				<a
					href="${pageContext.request.contextPath}/page?pageNow=${page.pageNow}">尾页</a>
			</c:when>
			<c:otherwise>
				<a
					href="${pageContext.request.contextPath}/page?pageNow=${page.totalPageCount}">尾页</a>
			</c:otherwise>
		</c:choose>
	</div>

</body>
</html>