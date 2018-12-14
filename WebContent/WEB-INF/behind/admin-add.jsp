<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5shiv.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/style/static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/style/static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/style/lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/style/static/h-ui.admin/skin/default/skin.css"
	id="skin" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/style/static/h-ui.admin/css/style.css" />
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>添加管理员 - 管理员管理 - H-ui.admin v3.1</title>
<meta name="keywords"
	content="H-ui.admin v3.1,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
<meta name="description"
	content="H-ui.admin v3.1，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">
</head>
<body>
	<article class="page-container">
	<form class="form form-horizontal" id="form-admin-add">
		<input type="hidden" value="-1" id="loId" name="loId">
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span
				class="c-red">*</span>登录名：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="" placeholder=""
					id="adminName" name="adminName">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span
				class="c-red">*</span>登录密码：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="password" class="input-text" autocomplete="off"
					value="" placeholder="密码" id="password" name="password">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span
				class="c-red">*</span>确认密码：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="password" class="input-text" autocomplete="off"
					placeholder="确认新密码" id="password2" name="password2">
			</div>
		</div>

		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span
				class="c-red">*</span>选择权限：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<select name="loRole" class="input-text" id="eqbTeam-select" onchange="loRoleSelectChanged();">
					<c:forEach items="${rolesList }" var="rl">
						<option value="${rl.id }">${rl.role }</option>
					</c:forEach>
				</select>
			</div>
		</div>
		<div class="row cl" id="selectTeamDiv" style="display:none;">
			<label class="form-label col-xs-4 col-sm-3"><span
				class="c-red">*</span>选择团队：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<select name="loTeam" class="input-text" id="eqbTeam-select2">
					<option value="0">默认</option>
					<c:forEach items="${teammappings }" var="teammappingsItem">
						<option value="${teammappingsItem.tmmId }">${teammappingsItem.tmmName }</option>
					</c:forEach>
				</select>
			</div>
		</div>
		<div class="row cl">
			<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
				<input class="btn btn-primary radius" type="submit"
					value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
			</div>
		</div>
	</form>
	</article>

	<!--_footer 作为公共模版分离出去-->
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/style/lib/jquery/1.9.1/jquery.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/style/lib/layer/2.4/layer.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/style/static/h-ui/js/H-ui.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/style/static/h-ui.admin/js/H-ui.admin.js"></script>
	<!--/_footer 作为公共模版分离出去-->

	<!--请在下方写此页面业务相关的脚本-->
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/style/lib/jquery.validation/1.14.0/jquery.validate.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/style/lib/jquery.validation/1.14.0/validate-methods.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/style/lib/jquery.validation/1.14.0/messages_zh.js"></script>

	<c:if test="${login!=null }">
		<script type="text/javascript">
			$("#loId").val("${login.loId }");
			$("#adminName").val("${login.loUsername }");
			$("#eqbTeam-select").val("${login.loRole }");
			$("#eqbTeam-select2").val("${login.loTeam }");
			var role=${login.loRole };
			if(role>2){
				$("#selectTeamDiv").css("display","inherit");
			}else{
				$("#selectTeamDiv").css("display","none");
			}
		</script>
	</c:if>


	<script type="text/javascript">
		var select = $("#eqbTeam-select");
		var input = $("#eqbTeam-input").hide();
		select.change(function() {
			var option = $("#eqbTeam-select option:selected");
			input.attr("name", option.val());
		});
	</script>

	<script type="text/javascript">
	function loRoleSelectChanged(){
		var eqbTeamSelect=$("#eqbTeam-select").val();
		if(eqbTeamSelect>2){
			$("#selectTeamDiv").css("display","inherit");
		}else{
			$("#selectTeamDiv").css("display","none");
			$("#eqbTeam-select2").val(0);
		}
	};
		$(function() {
			$('.skin-minimal input').iCheck({
				checkboxClass : 'icheckbox-blue',
				radioClass : 'iradio-blue',
				increaseArea : '20%'
			});

			$("#form-admin-add")
					.validate(
							{
								rules : {
									loId:{
										required : true
									},
									adminName : {
										required : true,
										minlength : 4,
										maxlength : 16
									},
									password : {
										required : true,
									},
									password2 : {
										required : true,
										equalTo : "#password"
									},
									loRole : {
										required : true,
									},
									loTeam : {
										required : true,
									},
								},
								onkeyup : false,
								focusCleanup : false,
								success : "valid",
								submitHandler : function(form) {
									$(form)
											.ajaxSubmit(
													{
														type : 'post',
														url : "${pageContext.request.contextPath}/admin-add/add",
														success : function(data) {
															layer
																	.msg(
																			'提交成功!',
																			{
																				icon : 1,
																				time : 1000
																			});
														},
														error : function(
																XmlHttpRequest,
																textStatus,
																errorThrown) {
															layer
																	.msg(
																			'error!',
																			{
																				icon : 1,
																				time : 1000
																			});
														}
													});
									var index = parent.layer
											.getFrameIndex(window.name);
									parent.$('.btn-refresh').click();
									setTimeout("parent.layer.close(parent.layer.getFrameIndex(window.name))",1000);
								}
							});
		});
	</script>
	<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>