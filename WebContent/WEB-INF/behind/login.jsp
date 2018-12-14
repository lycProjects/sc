<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head> 
<meta charset="utf-8">
<link rel="shortcut icon" href="${pageContext.request.contextPath}/style/topcss/images/bitbug_favicon.ico" type="image/x-icon" />
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />

<link href="${pageContext.request.contextPath}/style/static/h-ui/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/style/static/h-ui.admin/css/H-ui.login.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/style/static/h-ui.admin/css/style.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/style/lib/Hui-iconfont/1.0.8/iconfont.css" rel="stylesheet" type="text/css" />
<script src="${pageContext.request.contextPath}/style/jquery-3.2.1/jquery-3.2.1.min.js"></script>
<title>后台登录 </title>
</head>
<body>
<input type="hidden" id="TenantId" name="TenantId" value="" />
<div class="header"></div>
<div class="loginWraper">
  <div id="loginform" class="loginBox">

    <form id="loginformForm" class="form form-horizontal" action="loginin" method="post">
      <div class="row cl">
        <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe67a;</i></label>
        <div class="formControls col-xs-8">
          <input type="text" name="loRole" id="teUnit-input">
				<select name="loRole" class="input-text" id="teUnit-select">
                  <option value="">请选择</option>
                  <c:forEach items="${rolesList }" var="rl">
                     <option value="${rl.id }">${rl.role }</option>
                  </c:forEach>
                </select>
        </div>
      </div>
      <div class="row cl">
        <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60d;</i></label>
        <div class="formControls col-xs-8">
          <input id="loUsername" name="loUsername" type="text" placeholder="账户"  class="input-text size-L">
        </div>
      </div>
      <div class="row cl">
        <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60e;</i></label>
        <div class="formControls col-xs-8">
          <input id="loPassword" name="loPassword" type="password" placeholder="密码"  class="input-text size-L">
        </div>
      </div>
      
        <!-- <div class="row cl">
        <div class="formControls col-xs-8 col-xs-offset-3">
          <input class="input-text size-L" type="text" placeholder="验证码" onblur="if(this.value==''){this.value='验证码:'}" onclick="if(this.value=='验证码:'){this.value='';}" value="验证码:" style="width:150px;">
          <img src=""> <a id="kanbuq" href="javascript:;">看不清，换一张</a> </div>
      </div>  -->
      
      <div class="row cl">
        <div class="formControls col-xs-8 col-xs-offset-3">
          <label for="online">
            <input type="checkbox" name="online" id="online" value="">
           记住密码</label>
        </div>
      </div>
      <div class="row cl">
        <div class="formControls col-xs-8 col-xs-offset-3">
          <input type="submit" onclick="return valueForm();" class="btn btn-success radius size-L" value="&nbsp;登&nbsp;&nbsp;&nbsp;&nbsp;录&nbsp;" />
      &nbsp;   &nbsp; &nbsp; &nbsp;  <input name="" type="button" onclick="javascript:window.location.href='${pageContext.request.contextPath}';" class="btn btn-default radius size-L" value="&nbsp;取&nbsp;&nbsp;&nbsp;&nbsp;消&nbsp;" />
        </div>
      </div>
    </form>
  </div>
</div>
<div class="footer">
	Copyright &copy;2018-2019 T-.admin All Rights Reserved.
			本后台系统由<a href="" target="_blank"><strong>T-group团队</strong></a>提供技术支持</p>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/style/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/style/static/h-ui/js/H-ui.min.js"></script>
<script>
var _hmt = _hmt || [];
(function() {
  var hm = document.createElement("script");
  hm.src = "https://hm.baidu.com/hm.js?080836300300be57b7f34f4b3e97d911";
  var s = document.getElementsByTagName("script")[0]; 
  s.parentNode.insertBefore(hm, s);
})();
</script>
<script type="text/javascript">
	var select = $("#teUnit-select");
	var input = $("#teUnit-input").hide();
	select.change(function(){
		var option=$("#teUnit-select option:selected");
		input.attr("name",option.val());
	});	
	
	function valueForm(){
		var loRole=$("#teUnit-select").val();
		var loUsername=$("#loUsername").val();
		var loPassword=$("#loPassword").val();
		if(loRole==""){
			alert("请选择您的角色");
			return false;
		}
		if(loUsername==""){
			alert("用户名不能为空");
			return false;
		}
		if(loPassword==""){
			alert("密码不能为空");
			return false;
		}
		//document.getElementById("loginformForm").submit();
		return true;
	}
</script>

<script type="text/javascript">
function checkLogin() {
    var un = document.getElementById("loUsername");
    var pw = document.getElementById("loPassword");
    if(un.value == "" || pw.value == "") {
        alert("用户名或密码不能为空");
        return false;
    }
}
</script>



</body>
</html>