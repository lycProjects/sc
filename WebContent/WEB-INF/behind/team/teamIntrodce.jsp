<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="utf-8">
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/style/topcss/images/bitbug_favicon.ico" type="image/x-icon" />
	<title>团队介绍</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width">

    <!-- Bootstrap styles -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/style/loginstyle/css/bootstrap.min.css" >
    <link rel="stylesheet" href="${pageContext.request.contextPath}/style/topcss/font-awesome/css/font-awesome.min.css" >
    <link rel="stylesheet" href="${pageContext.request.contextPath}/style/topcss/Teamstyle.css" id="theme-styles">

    
</head>
<body>
    <header>
        <div class="widewrapper subheader">
            <div class="container">
                <div class="clean-breadcrumb">
                    <a href="teamintrodce.jsp" style="font-size: 40px;">双创团队</a>
                </div>
                <a style="float:right;margin-right:20px;margin-top:26px;" href="${pageContext.request.contextPath}">返回首页</a>
            </div>
        </div>
    </header>

    <div class="widewrapper main">
        <div class="container">
            <div class="row">
                <div class="col-md-8 blog-main">
                <c:set var="index" value="0"></c:set>
                <c:forEach begin="1" end="${listRowsCount }" var="listRowsNow">
                    <div class="row">
                        <div class="col-md-6 col-sm-6">
                            <article class=" blog-teaser">
                                <header>
                                    <img src="${newsNewList[index].imageUrl}" style="cursor: pointer;" onclick="window.location.href='${pageContext.request.contextPath}/team/teamShow/${newsNewList[index].newsnewId}';" width="360px" height="250px" alt="">
                                    <h3><a href="teamShow/${newsNewList[index].newsnewId}">${newsNewList[index].newsnewTitle}</a></h3>
                                    <span class="meta">${newsNewList[index].newsnewPubtime}, ${newsNewList[listRowsNow].newsnewAuthorname}</span>
                                    <hr>
                                </header>
                                <div class="body">
                                    ${newsNewList[index].newsnewBrief}
                                </div>
                                <div class="clearfix">
                                    <a href="teamShow/${newsNewList[index].newsnewId}" class="btn btn-clean-one">查看更多>></a>
                                </div>
                            </article>
                        </div>
                        <c:set var="index" value="${index+1 }"></c:set>
                        <div class="col-md-6 col-sm-6">
                            <article class=" blog-teaser">
                                <header>
                                    <img src="${newsNewList[index].imageUrl}" style="cursor: pointer;" onclick="window.location.href='${pageContext.request.contextPath}/team/teamShow/${newsNewList[index].newsnewId}';" width="360px" height="250px" alt="">
                                    <h3><a href="teamShow/${newsNewList[index].newsnewId}">${newsNewList[index].newsnewTitle}</a></h3>
                                    <span class="meta">${newsNewList[index].newsnewPubtime}, ${newsNewList[listRowsNow].newsnewAuthorname}</span>
                                    <hr>
                                </header>
                                <div class="body">
                                    ${newsNewList[index].newsnewBrief}
                                </div>
                                <div class="clearfix">
                                    <a href="teamShow/${newsNewList[index].newsnewId}" class="btn btn-clean-one">查看更多>></a>
                                </div>
                            </article>
                        </div>
                        <c:set var="index" value="${index+1 }"></c:set>
                    </div>
                    </c:forEach>
                    <div class="paging">
                        <a href="#" class="older">回到顶部</i></a>
                    </div>
                </div>
                <aside class="col-md-4 blog-aside">
                    
                    <div class="aside-widget">
                        <header>
                            <h3>公告</h3>
                        </header>
                        <div class="body">
                            <ul class="clean-list">
                            <c:forEach items="${list_announ }" var="list_announItem">
                                <li><a href="${pageContext.request.contextPath}/News/News/New?newsnewId=${list_announItem.newsnewId }">${list_announItem.newsnewTitle }</a></li>
                            </c:forEach>
                            </ul>
                        </div>
                    </div>
                
                    <div class="aside-widget">
                        <header>
                            <h3>新闻</h3>
                        </header>
                        <div class="body">
                            <ul class="clean-list">
                                <c:forEach items="${list_news }" var="list_newsItem">
                               	 	<li><a href="${pageContext.request.contextPath}/News/News/New?newsnewId=${list_newsItem.newsnewId }">${list_newsItem.newsnewTitle }</a></li>
                            	</c:forEach>
                            </ul>
                        </div>
                    </div>

                    <div class="aside-widget">
                        <header>
                            <h3>技术</h3>
                        </header>
                        <div class="body clearfix">
                            <ul class="tags">
                                <li><a href="#">HTML5</a></li>
                                <li><a href="#">CSS3</a></li>
                                <li><a href="#">JAVA</a></li>
                                <li><a href="#">JAVA WEB</a></li>
                                <li><a href="#">UNIX</a></li>
                                <li><a href="#">BOOTSTRAP</a></li>
                                <li><a href="#">VR</a></li>
                                <li><a href="#">UI/UX</a></li>                            
                            </ul>
                        </div>
                    </div>
                </aside>
            </div>
        </div>
    </div>

    <footer>
        <div class="widewrapper copyright">
                Copyright 2018  <a href="http://www.pdsu.edu.cn/" target="_blank" title="平顶山学院">平顶山学院</a> -  <a href="http://www.pdsu.edu.cn/" title="创新创业中心" target="_blank">创新创业中心</a>
        </div>
    </footer>
    
   
    <script src="${pageContext.request.contextPath}/style/temp/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/style/temp/js/modernizr.js"></script>

</body>
</html>