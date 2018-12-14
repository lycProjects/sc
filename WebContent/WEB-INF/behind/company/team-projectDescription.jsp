<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE HTML>
<html>

	<head>
		<meta charset="utf-8">
		<meta name="renderer" content="webkit|ie-comp|ie-stand">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
		<meta http-equiv="Cache-Control" content="no-siteapp" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/static/h-ui/css/H-ui.min.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/static/h-ui.admin/css/H-ui.admin.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/lib/Hui-iconfont/1.0.8/iconfont.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/static/h-ui.admin/skin/default/skin.css" id="skin" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/static/h-ui.admin/css/style.css" />
		<title>项目市场</title>
	</head>
	<style>
		.cen {
			text-align: center;
			position: absolute;
			height: 600px;
			width: 800px;
		}
		.projectTopDiv{
			width: auto;
			height: 200px;
			margin-left: 30px;
		}
		.projectTopDiv img{
			margin: 15px 0px 0px 45px;
		}
		.projectTopDiv .projectTopDiv_name{
			max-width: 70%;
			height: 180px;
			font-size: 20px;
			float: left;
			margin-top: 20px;
			margin-left:30px;
			overflow: hidden;
		}
		.projectTopDiv .projectTopDiv_name p{
			height: 25px;
			padding: 0 0 0 0;
			margin: 0px 0px 15px 0px;
		}
		.projectTopDiv .projectTopDiv_name p span{
			font-size: 16px;
			line-height: 16px;
		}
	</style>

	<body>
<!-- 		<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 项目相关信息 <span class="c-gray en">&gt;</span> 项目市场
			<a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新"><i class="Hui-iconfont">&#xe68f;</i></a>
		</nav> -->
		<div class="projectTopDiv">
			<img width="180px" height="210px" style="float: left;" src="${pageContext.request.contextPath}/style/loginstyle/images/issusdProjectPictureDetault.jpg" />
			<div class="projectTopDiv_name">
				<p>名称：${issusdProject.ipProjectname }</p>
				<p>状态：${issusdProject.enStatename }</p>
				<p>文档：<c:if test="${title==null}">无</c:if>
				<c:if test="${title!=null }"><a href="${pageContext.request.contextPath}${title.tiAddressurl }" target="_blank">查看文档</a></c:if>
				</p>
				<p>简介：<span>${issusdProject.ipBriefintroduction }</span></p>
			</div>
		</div>
		<div class="page-container">
			<div class="text-c">

			</div>

			<div class="cl pd-5 bg-1 bk-gray mt-20">
				正在申请该项目的团队：
			</div>

			<div class="mt-20">

				
				<table class="table table-border table-bordered table-hover table-bg table-sort">
					<thead>
						<tr class="text-c">
							<th width="120">团队名称</th>
							<th width="85">申请时间</th>
							<th width="100">申请理由</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${applications }" var="application">
						<tr class="text-c">
							<td>${application.apTeamname }</td>
							<td>${application.apTime }</td>
							<td>${application.apReason }</td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
			</div>
			<br/><br/><br/>
			<div class="cl pd-5 bg-1 bk-gray mt-20">
				申请该项目
			</div>
			<div class="cl pd-5 bg-1 bk-gray mt-20" style="vertical-align: top;"><p>
			&nbsp;申请理由：<textarea id="apReason" rows="3" cols="180"></textarea></p>
				<a class="btn btn-primary radius" style="float: right;" href="javascript:;" onclick="applyPorject()"> 提交</a>
			</div>
		</div>
		<!--_footer 作为公共模版分离出去-->
		<script type="text/javascript" src="${pageContext.request.contextPath}/style/lib/jquery/1.9.1/jquery.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/style/lib/layer/2.4/layer.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/style/static/h-ui/js/H-ui.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/style/static/h-ui.admin/js/H-ui.admin.js"></script>
		<!--/_footer 作为公共模版分离出去-->

		<!--请在下方写此页面业务相关的脚本-->
		<script type="text/javascript" src="${pageContext.request.contextPath}/style/lib/zTree/v3/js/jquery.ztree.all-3.5.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/style/lib/My97DatePicker/4.8/WdatePicker.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/style/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/style/lib/laypage/1.2/laypage.js"></script>
		<script type="text/javascript">
			/*提交申请理由*/
			function applyPorject(){
				var apReason=$("#apReason").val();
				if(apReason==null||apReason==""){
					alert("申请理由不能为空");
					return ;
				}
				$.post("${pageContext.request.contextPath}/team/IssusdProject/${issusdProject.ipId}/apply",
						{
					    apReason:apReason
						},
						function(data,status){
							if(data=="success"){
								alert("申请成功");
								window.location.reload();
							}else{
								alert(data);
							}
						}
					);
			}
		
		
		
		
			/*用户-缺勤*/
			function member_huanyuan(obj, id) {
				layer.confirm('确认拒绝该申请吗？', function(index) {

					$(obj).remove();
					layer.msg('已拒绝!', {
						icon: 6,
						time: 1000
					});
				});
			}

			function member_del(obj, id) {
				layer.confirm('确认同意该申请吗？', function(index) {

					$(obj).remove();
					layer.msg('已同意!', {
						icon: 6,
						time: 1000
					});
				});
			}
			var setting = {
				view: {
					dblClickExpand: false,
					showLine: false,
					selectedMulti: false
				},
				data: {
					simpleData: {
						enable: true,
						idKey: "id",
						pIdKey: "pId",
						rootPId: ""
					}
				},
				callback: {
					beforeClick: function(treeId, treeNode) {
						var zTree = $.fn.zTree.getZTreeObj("tree");
						if(treeNode.isParent) {
							zTree.expandNode(treeNode);
							return false;
						} else {
							//demoIframe.attr("src",treeNode.file + ".html");
							return true;
						}
					}
				}
			};

			$(document).ready(function() {
				var t = $("#treeDemo");
				t = $.fn.zTree.init(t, setting, zNodes);
				//demoIframe = $("#testIframe");
				//demoIframe.on("load", loadReady);
				var zTree = $.fn.zTree.getZTreeObj("tree");
				//zTree.selectNode(zTree.getNodeByParam("id",'11'));
			});

			$('.table-sort').dataTable({
				"aaSorting": [
					[1, "desc"]
				], //默认第几个排序
				"bStateSave": true, //状态保存
				"aoColumnDefs": [{
						"orderable": false,
						"aTargets": [0, 2]
					} // 制定列不参与排序
				]
			});
			/*产品-添加*/
		</script>

	</body>

</html>