<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>首页</title>
		<link rel="shortcut icon" href="${pageContext.request.contextPath}/style/topcss/images/bitbug_favicon.ico" type="image/x-icon" />
		<link href="${pageContext.request.contextPath}/style/loginstyle/css/bootstrap.min.css" rel='stylesheet' type='text/css' />
		<link href="${pageContext.request.contextPath}/style/loginstyle/css/bootstrap.css" rel='stylesheet' type='text/css' />
			    <script type="text/javascript" src="${pageContext.request.contextPath}/style/loginstyle/js/jquery.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/style/loginstyle/js/bootstrap.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/style/loginstyle/js/bootstrap.min.js"></script>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    	<link href='http://fonts.googleapis.com/css?family=Raleway:400,100,200,300,500,600,700,800,900' rel='stylesheet' type='text/css' />
    	<link href="${pageContext.request.contextPath}/style/loginstyle/css/style.css" rel="stylesheet" type="text/css" media="all" />
		<!--  jquery plguin -->

		<!--start slider -->
	    <link rel="stylesheet" href="${pageContext.request.contextPath}/style/loginstyle/css/fwslider.css" media="all">
		<script src="${pageContext.request.contextPath}/style/loginstyle/js/jquery-ui.min.js"></script>
		<script src="${pageContext.request.contextPath}/style/loginstyle/js/css3-mediaqueries.js"></script>
		<script src="${pageContext.request.contextPath}/style/loginstyle/js/fwslider.js"></script>
	<!--end slider -->
	 <script type="text/javascript">
	 		function isIE()
			{
				if(!!window.ActiveXObject || "ActiveXObject" in window)
					return true;
				else
					return false;
			}
			$(document).ready(function() {

				if(isIE()){
					alert("本页面在IE浏览器上可能表现不佳，请更换为Chrome或firefox浏览器！！");
				}
				
				var defaults = {
		  			containerID: 'toTop', // fading element id
					containerHoverID: 'toTopHover', // fading element hover id
					scrollSpeed: 1200,
					easingType: 'linear' 
		 		};
				
				
				$().UItoTop({ easingType: 'easeOutQuart' });
				
			});
		</script>
		<!-- start testimonials -->
		<!-- da-slider -->
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/loginstyle/css/slider.css" />
	<%-- 	<script type="text/javascript" src="${pageContext.request.contextPath}/style/loginstyle/js/modernizr.custom.28468.js"></script> --%>
		<script src="${pageContext.request.contextPath}/style/loginstyle/js/modernizr.custom.28468.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/style/loginstyle/js/jquery.cslider.js"></script>
		<script type="text/javascript">
			$(function() {

				$('#da-slider').cslider({
					autoplay : true,
					bgincrement : 450
				});

			});
		</script>
		<script type="text/javascript">
			$(function() {

				$('#da-slider1').cslider({
					autoplay : true,
					bgincrement : 450
				});

			});
		</script>


</head>
<body>
<!-- start header -->
<div class="header_bg">
	<!-- start header -->
<div class="header_bg">
	<!-----start-conatiner---->
		<div class="container">
			<!-----start-header---->
			<div class="header">
					<!----start-top-nav---->
		      <header id="topnav">
			        <nav>
			        		 <ul>
								<li class=""><a  href="#home">首页</a></li>
								<li><a href="#" onclick="window.location.href='News/News'" class="scroll">新闻在线</a></li>
								<li><a href="#about" class="scroll">双创介绍</a></li>
								<li><a href="#portfolio" class="scroll">双创团队</a></li>
								<li><a href="#team" class="scroll">合作企业</a></li>
								<li><a href="#blog" class="scroll">校企合作</a></li>
								<!-- <li class="last"><a href="background">网站后台</a></li> -->
								<li><a href="#" onclick="window.location.href='login'">网站后台</a></li>
								<div class="clearfix"> </div>
							</ul>
		        	</nav>
			         <h1><a href="index.html"><img src="" alt="" style="border-radius: 50%;"/></a></h1>
			         	<h1><a style="font-family:		NSimSun ;">创新创业中心</a></h1>
			         
			        	<a href="#" id="navbtn">Nav Menu</a>
			       <div class="clearfix"> </div>
		        </header>
		         <!----start-top-nav----> 
		    </div>
		   <!-----start-header---->
		</div>
	</div>
		<script type="text/javascript"  src="${pageContext.request.contextPath}/style/loginstyle/js/menu.js"></script>
</div>
<!----start-images-slider---->
		<div class="images-slider">
			<!-- start slider -->
		    <div id="fwslider">
		        <div class="slider_container">
		            <div class="slide"> 
		                <!-- Slide image -->
		                    <img src="${pageContext.request.contextPath}/style/loginstyle/images/01.jpg" alt=""/>
		                <!-- /Slide image -->
		                <!-- Texts container -->
		                <div class="slide_content">
		                    <div class="slide_content_wrap" style="margin-left: 300px;font-size: 30px;">
		                    	 <!-- Text description -->
		                        <p class="description"></p>
		                        <!-- /Text description -->
		                        <!-- Text title -->
		                        <h4 class="title">创&nbsp;<span>新</span> 创业<br>
		                                                                                  &nbsp;&nbsp;&nbsp;&nbsp;追逐<span>梦想</span></h4>
		                        <!-- /Text title -->
		                        
		                        <div class="slide-btns description">	                      
		                        </div>
		                    </div>
		                </div>
		                 <!-- /Texts container -->
		            </div>
		            <!-- /Duplicate to create more slides -->
		            <div class="slide">
		                <img src="${pageContext.request.contextPath}/style/loginstyle/images/01.jpg" alt=""/>
		                 <div class="slide_content">
		                    <div class="slide_content_wrap" style="margin-left: 300px;font-size: 30px;">
		                    	 <!-- Text description -->
		                        <p class="description"></p>
		                        <!-- /Text description -->
		                        <!-- Text title -->
		                        <h4 class="title">把 <span>握</span> 趋势<br>
		                                                                        &nbsp;&nbsp;&nbsp;&nbsp;把握未 <span>来</span></h4>
		                        <!-- /Text title -->
		                       
		                        <div class="slide-btns description">	                      
		                        </div>
		                    </div>
		                </div>
		            </div>
		            <div class="slide">
		                <img src="${pageContext.request.contextPath}/style/loginstyle/images/01.jpg" alt=""/>
		                 <div class="slide_content">
		                    <div class="slide_content_wrap" style="margin-left: 300px;font-size: 30px;">
		                    	 <!-- Text description -->
		                        <p class="description"></p>
		                        <!-- /Text description -->
		                        <!-- Text title -->
		                        <h4 class="title">注重 <span>实</span> 践<br>
		                                                                        &nbsp;&nbsp;&nbsp;&nbsp; 敢于创 <span>新</span></h4>
		                        <!-- /Text title -->
		                        
		                        <div class="slide-btns description">	                      
		                        </div>
		                    </div>
		                </div>
		            </div>
		            <!--/slide -->
		        </div>
		        <div class="timers"> </div>
		        <div class="slidePrev"><span> </span></div>
		        <div class="slideNext"><span> </span></div>
		    </div>
		    <!--/slider -->
		</div>
<!-- about -->
		<div class="about" id="about">
	    	<div class="container">
				<div class="row">
				    <div class="col-md-12">			
				        <h3>双创介绍</h3>
				        <span> </span>
				        <p></p>
					</div>
				</div>		
			</div>
		</div>	
<div class="about-bottom">
		<div class="about-left pull-left">
			<h4>双创简介</h4>
			<p>平顶山学院计算机学院(软件学院)创新创业中心始建于2016年3月，位于办公楼一楼，占地400余平方米，由学院院长直接领导。</p>
			<p>创新中心设置管理委员会，负责中心的日常工作，目前已组建ACM算法攻关、IOS开发、Android开发、Web前端开发、二维/三维游戏开发、软件测试、网络攻防、企业级后台服务器开发、UI设计等9个团队，配备16名专业教师，核心成员已近百人，开展专业项目研发工作。</p>
			<p><a href="News/News">更多详情>></a></p>
		</div>	
		<div class="about-right pull-right">
			<img src="${pageContext.request.contextPath}/style/loginstyle/images/sc.jpg" alt=""/>
		</div>
		<div class="clearfix"></div>
</div>
<!-- service -->
<div class="service text-center">
	<div class="container">
        <h3></h3>
        <p>创新创业中心以项目研发为驱动，以服务市场需求为目标，依托行业学院和协同创新中心，形成纵向应用创新，横向协作服务的格局，促进学生创新创业能力的提高。</p>
       <div class="service-bottom">
	        <div class="row">
			    <div class="col-md-4">	
			    	<img src="${pageContext.request.contextPath}/style/loginstyle/images/contact.png" alt=""/>		
			        <h4><a href="javascript:;">电脑维护与手机维护工作室</a></h4>
			        <p>具体介绍</p>
				</div>
				<div class="col-md-4">	
					<img src="${pageContext.request.contextPath}/style/loginstyle/images/flag.png" alt=""/>		
			        <h4><a href="javascript:;">网页开发工作室</a></h4>
			        <p>具体介绍</p>
				</div>
				<div class="col-md-4">	
					<img src="${pageContext.request.contextPath}/style/loginstyle/images/fl.png" alt=""/>		
			        <h4><a href="javascript:;">三维图文设计工作室</a></h4>
			        <p>具体介绍</p>
				</div>
			</div>	
		</div>	
   </div>
</div>
<!-- skills -->
<div class="skills text-center">
	<div class="container">
        <h4>技术成熟度</h4>
       <div class="client">		
		<div class="pie-wrapper progress-45 style-2">
		  <span class="label">45<span class="smaller">%</span></span>
		  <div class="pie">
		    <div class="left-side half-circle"></div>
		    <div class="right-side half-circle"></div>
		  </div>
		  <div class="shadow"></div>
		  <h3>前端</h3>
		</div>
		<div class="pie-wrapper progress-75 style-2">
		  <span class="label">75<span class="smaller">%</span></span>
		  <div class="pie">
		    <div class="left-side half-circle"></div>
		    <div class="right-side half-circle"></div>
		  </div>
		  <div class="shadow"></div>
		   <h3>后台</h3>
		</div>
		<div class="pie-wrapper progress-95 style-2">
		  <span class="label">95<span class="smaller">%</span></span>
		  <div class="pie">
		    <div class="left-side half-circle"></div>
		    <div class="right-side half-circle"></div>
		  </div>
		  <div class="shadow"></div>
		   <h3>算法公关</h3>
		</div>
		<div class="pie-wrapper progress-45 style-2">
		  <span class="label">45<span class="smaller">%</span></span>
		  <div class="pie">
		    <div class="left-side half-circle"></div>
		    <div class="right-side half-circle"></div>
		  </div>
		  <div class="shadow"></div>
		   <h3>网络安全</h3>
		</div>
		<div class="pie-wrapper progress-75 style-2">
		  <span class="label">75<span class="smaller">%</span></span>
		  <div class="pie">
		    <div class="left-side half-circle"></div>
		    <div class="right-side half-circle"></div>
		  </div>
		  <div class="shadow"></div>
		   <h3>二维/三维建模</h3>
		</div>	
	</div>
   </div>
</div>
<!-- portfolio -->
<div class="portfilio" id="portfolio">
	<div class="container">
		<div class="about">	   
				<div class="row  Protects">
				    <div class="col-md-12">			
				        <h3>团队介绍</h3>
				        <span></span>
				        <p></p>
					</div>
				</div>		
		</div>	
	</div>	
	 <div class="port">
       		<ul>
					<li onclick="window.location.href='${pageContext.request.contextPath}/team/teamShow/17';"><div class="view view-fourth">
						     <img src="${pageContext.request.contextPath}/style/loginstyle/images/T-Group.jpg" alt=""/>
							 <div class="mask">	
							      <div class="border">                   
									   <h2>T_Group 团队</h2>
									   <span></span>
									   <p class="a">创新  朝气</p>		                       
								  </div>                                                 
							 </div>		
						</div>	
					</li>
					<li onclick="window.location.href='${pageContext.request.contextPath}/team/teamShow/22';"><div class="view view-fourth">
						     <img src="${pageContext.request.contextPath}/style/loginstyle/images/guess.jpg" alt=""/>
							 <div class="mask">	
							      <div class="border">                   
									   <h2>你猜工作室</h2>
									   <span></span>
									   <p class="a">吃苦  耐劳</p>		                       
								  </div>                                                 
							 </div>		
						</div>	
					</li>
					<li onclick="window.location.href='${pageContext.request.contextPath}/team/teamShow/23';"><div class="view view-fourth">
						     <img src="${pageContext.request.contextPath}/style/loginstyle/images/vector.jpg" alt=""/>
							 <div class="mask">	
							      <div class="border">                   
									   <h2>向量工作室</h2>
									   <span></span>
									   <p class="a">笃实  好学</p>		                       
								  </div>                                                 
							 </div>		
						</div>	
					</li>
					<li onclick="window.location.href='${pageContext.request.contextPath}/team/teamShow/21';"><div class="view view-fourth">
						     <img src="${pageContext.request.contextPath}/style/loginstyle/images/netsafe.jpg" alt=""/>
							 <div class="mask">	
							      <div class="border">                   
									   <h2>网络安全工作室</h2>
									   <span></span>
									   <p class="a">举一  反三</p>		                       
								  </div>                                                 
							 </div>		
						</div>	
					</li>
			</ul>	
     </div>
     <div class="port">
       		<ul>
					<li onclick="window.location.href='${pageContext.request.contextPath}/team/teamShow/19';"><div class="view view-fourth">
						     <img src="${pageContext.request.contextPath}/style/loginstyle/images/vr.jpg" alt=""/>
							 <div class="mask">	
							      <div class="border">                   
									   <h2>恒创vr工作室</h2>
									   <span></span>
									   <p class="a">刻苦  钻研</p>		                       
								  </div>                                                 
							 </div>		
						</div>	
					</li>
					<li onclick="window.location.href='${pageContext.request.contextPath}/team/teamShow/16';"><div class="view view-fourth">
						     <img src="${pageContext.request.contextPath}/style/loginstyle/images/acm.jpg" alt=""/>
							 <div class="mask">	
							      <div class="border">                   
									   <h2>ACM算法公关</h2>
									   <span></span>
									   <p class="a">精益  求精</p>		                       
								  </div>                                                 
							 </div>		
						</div>	
					</li>
					<li onclick="window.location.href='${pageContext.request.contextPath}/team/teamShow/18';"><div class="view view-fourth">
						     <img src="${pageContext.request.contextPath}/style/loginstyle/images/server.jpg" alt=""/>
							 <div class="mask">	
							      <div class="border">                   
									   <h2>服务器端开发及测试</h2>
									   <span></span>
									   <p class="a">学以  致用</p>		                       
								  </div>                                                 
							 </div>		
						</div>	
					</li>
					
					<li onclick="window.location.href='${pageContext.request.contextPath}/team/teamShow/20';"><div class="view view-fourth">
						     <img src="${pageContext.request.contextPath}/style/loginstyle/images/cloud.jpg" alt=""/>
							 <div class="mask">	
							      <div class="border">                   
									   <h2>青云工作室</h2>
									   <span></span>
									   <p class="a">持之  以恒</p>		                       
								  </div>                                                 
							 </div>		
						</div>	
					</li>
			</ul>	
			<p><a href="team/teamIntrodce">查看更多<span> </span></a></p>
     </div>
</div>
<div class="team" id="team">
	<div class="container">
		<div class="about">	   
				<div class="row">
				    <div class="col-md-12">			
				        <h3>合作企业</h3>
				        <span> </span>
				        <p></p>
					</div>
				</div>		
		</div>	
		<div class="team-member">
			<ul>
				<li onclick="window.location.href='${pageContext.request.contextPath}/Company.jsp';"><div class="view1 view-fourth1">
						     <img src="${pageContext.request.contextPath}/style/loginstyle/images/qing.png" alt=""/>
							 <div class="mask1">	
							      <div class="border1">                   
									   <div class="social-icons-set">
											<ul>
												<li><a class="facebook" href="#"> </a></li>
												<li><a class="twitter" href="#"> </a></li>
												<li><a class="vimeo" href="#"> </a></li>								
												<div class="clear"> </div>
											</ul>
										</div>		                       
								  </div>                                                 
							 </div>	
					</div>	
					<div class="clearfix"></div>
					 <P><a href="Company.jsp">青云<br><label>一家集化工、化纤产品的公司</label></a></P>
				</li>
				<li onclick="window.location.href='${pageContext.request.contextPath}/Company.jsp';"><div class="view1 view-fourth1">
						     <img src="${pageContext.request.contextPath}/style/temp/img/game8.jpg" alt=""/>
							 <div class="mask1">	
							      <div class="border1">                   
									   <div class="social-icons-set">
											<ul>
												<li><a class="facebook" href="#"> </a></li>
												<li><a class="twitter" href="#"> </a></li>
												<li><a class="vimeo" href="#"> </a></li>								
												<div class="clear"> </div>
											</ul>
										</div>			                       
								  </div>                                                 
							 </div>		
					</div>	
					<div class="clearfix"></div>
					<P><a href="Company.jsp">河南元森有限公司<br><label>一家致力于建设方面的公司</label></a></P>
				</li>
				<li onclick="window.location.href='${pageContext.request.contextPath}/Company.jsp';"><div class="view1 view-fourth1">
						     <img src="${pageContext.request.contextPath}/style/temp/img/game7.jpg" alt=""/>
							 <div class="mask1">	
							      <div class="border1">                   
									  <div class="social-icons-set">
											<ul>
												<li><a class="facebook" href="#"> </a></li>
												<li><a class="twitter" href="#"> </a></li>
												<li><a class="vimeo" href="#"> </a></li>								
												<div class="clear"> </div>
											</ul>
										</div>			                       
								  </div>                                                 
							 </div>		
					</div>	
					<div class="clearfix">  </div>
					<P><a href="Company.jsp">花瓣儿有限公司<br><label>一家基于财税专业服务应用的公司</label></a></P>
				</li>
			</ul>		
		</div>		
	</div>									
</div>
<div class="slider">
	<div id="da-slider1" class="da-slider">
							<!-- da-slider -->
							<div class="da-slide">
								<h2>河南中茂实业有限公司  招聘信息</h2>
								<p>1、1年以上次材料管理类工作经理，工程类专业，优秀毕业生亦可；<br>
                                   2、工作热情努力，谦虚好学上进；<br>
                                   3、服从领导安排；</p>							    
							</div>
							<div class="da-slide">
								<h2>河南满堂红地产经纪有限公司  招聘信息</h2>
								<p>1、具有1年以上人事工作经验或优秀的人力资源专业应届毕业生；<br>
                                   2、熟练操作电脑并使用办公软件；<br>
                                   3、具有较强的沟通、协调、表达能力； 具备良好的职业道德和职业操守，较强的责任感与敬业精神；</p>							    
							</div>
							<div class="da-slide">
								<h2>郑州宏驰置业有限公司  招聘信息</h2>
								<p>1、本科及以上学历（2019届应届生），大三研一研二优先考虑；<br>
                                   2、对房地产行业充满兴趣，或未来有志于在房地产行业发展；<br>
                                   3、性格外向、善于沟通表达、责任心强、逻辑思维能力强，积极主动善于学习；</p>							    
							</div>
							<div class="da-slide">
								<h2>上海携寧有限公司  招聘信息</h2>
								<p>1、熟悉Java和前后端分离开发方式；；<br>
                                   2、熟悉设计模式、了解数据建模、掌握数据库设计；<br>
                                   3、具有良好的职业道德和敬业精神，有良好的服务意识和敬业精神；</p>							    
							</div>
	</div><!-- da-slider -->			
</div>
<div class="blog" id="blog">
	<div class="container">
		<div class="about">	   
				<div class="row">
				    <div class="col-md-12">			
				        <h3>校企合作</h3>
				        <span></span>
				        <p></p>
					</div>
				</div>		
		</div>	
		 <div class="blog-bottom">
	        <div class="blog-left">
	        	<img src="${pageContext.request.contextPath}/style/loginstyle/images/xq1.JPG" alt=""/>
	        </div>
	        <span class="circle"></span>
	         <div class="blog-right">       	
	        	<h6>2018.10.10</h6>
	        	<h4>T-Group团队与青云有限公司完成野渡无人户外</h4>
	        	<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;河南青云信息技术有限公司是一家专注于IT技术研发的高新技术移动互联网公司。总部位于河南郑州，现有员工200余人。目前已经在郑州、西安、武汉等地建立分公司。河南青云旗下现有教育培训、人才服务、项目研发、创业孵化、硬件研发制作、项目承包等业务模块。目前已上线大中型项目20多款，小型项目100余个，涉及交通、购物、游戏、社交、电商、保险等多个行业领域，拥有上百家行业客户。河南青云一直致力于成为河南以至全国知名的移动平台软件研发公司。</p>
	        </div>
	        <div class="clearfix"></div>
         </div>
         <div class="blog-bottom">
	        <div class="blog-left">
	        	<h6>2018.10.10</h6>
	        	<h4>双创和科技局合作完成科技服务系统</h4>
	        	<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;平顶山市科技创新资源数据库是平顶山学院计算机学院（软件学院）为平顶山市科技局开发的B/S架构的系统，用于辅助对平顶山范围内的企业、高校、科研院所、医疗卫生机构和科技服务机构的创新成果进行汇总和统计检索。系统采用ASP.NET技术开发，具备信息采集、权限管理和汇总统计等核心功能。<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	        	
	        	
	        	
	        	
	        	
	        	
	        	
	        	
	        	
	        	
	        	
	        	
	        	
	        	
	        	
	        	
	        	
	        	.............   企业、高校、科研院所、医疗卫生机构和科技服务机构的数据采集完成后，还可以由管理机构通过数据采集员进行维护。下图是数据采集员维护数据的界面示例，首先设置数据录入或维护对象，然后修改相应的信息。</p>
	        </div>
	        <span class="circle"></span>
	         <div class="blog-right">       	
	        	<img src="${pageContext.request.contextPath}/style/loginstyle/images/xq2.JPG" alt=""/>
	        </div>
	        <div class="clearfix"></div>
         </div>
          <div class="blog-bottom">
	        <div class="blog-left last">
	        	<img src="${pageContext.request.contextPath}/style/loginstyle/images/xq3.jpg" alt=""/>
	        </div>
	        <span class="circle"> </span>
	        <div class="blog-right">       	
	        	<h6>2018.10.10</h6>
	        	<h4>T-group团队和花瓣企业合作完成自动问答系统</h4>
	        	<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;河南花瓣儿网络科技有限公司成立于2015年，是一家基于财税专业服务应用场景，充分利用行业大数据和人工智能技术，致力于解决现实业务中实际问题的智能财税服务商。花瓣儿开发了系列的税务软件系统，并建立了专业服务网络平台，积聚了众多知名的、资深的财税专家，致力于为纳税人提供全生命周期、全品类维度、全过程保障的一站式财税服务。花瓣儿是智慧财税服务的缔造者，是传统财税服务的革新者，是广大企业茁壮成长的助推者。让更轻松的财税，从花瓣儿赋能开始！</p>
	        </div>
	        <div class="clearfix"> </div>
         </div>
         <div class="post"><a href="Exhibition.jsp">查看更多</a></div>
	</div>
</div>
<!---start-contact---->
<div class="contact s4" id="contact">
	<div class="container">
		<a href="NewsContact.jsp"><h3>联系我们</h3></a>
		<div class="row">
			<div class="col-md-12">
				<form>
					<input type="text" class="textbox" value="姓名" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '姓名';}">
					<input type="text" class="textbox" value="邮箱" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '邮箱';}">
					<textarea value="意见" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Message';}">意见</textarea>
					<input type="submit" value="提交">
				</form>
			</div>
		</div>
	</div>
</div>
<!---End-contact---->
<!--<div class="footer-top">
	<div class="container">
		<div class="row">
			<div class="col-md-3">
				<a href="index.html"><img src="images/35.jpg" alt=""/></a>
			    <p>创新创业中心为我们提供了良好的学习环境，不仅有丰富的学习资源，更有团队合作模式，老生带新生的学习模式，更有实践练习。</p>
	        	<p>创新创业中心目前为止创办的非常成功，各种团队竞技挣流，于无形中营造了良好的学习氛围， 增强了学生的动手能力，更激发了学生更为新颖的思考方式，提出了许多新奇的想法，并在技术的支持下变成了现实。除此之外，各团队积极参加各种全国大学生比赛，比如互联网+等，取得了优异成绩，创新创业中心无疑已经成为学校对外的一个窗口。</p>
			</div>	
			<div class="col-md-3">
				<h4>RECENT POSTS</h4>
				<div class="foot">
					<span>24 march 2014</span>
					<p><a href="#">Printing and typesetting industry</a></p>
				</div>
				<div class="foot">
					<span>24 march 2014</span>
					<p><a href="#">Printing and typesetting industry</a></p>
				</div>
				<div class="foot">
					<span>24 march 2014</span>
					<p><a href="#">Printing and typesetting industry</a></p>
				</div>
			</div>	
			<div class="col-md-3">
				<h4>TWITTER FEEDS</h4>
				<div class="foot">
					<span>industry@info.com</span>
					<p><a href="#">Printing and typesetting industry</a></p>
				</div>
				<div class="foot">
					<span>industry@info.com</span>
					<p><a href="#">Printing and typesetting industry</a></p>
				</div>
				<div class="foot">
					<span>industry@info.com</span>
					<p><a href="#">Printing and typesetting industry</a></p>
				</div>
			</div>	
			<div class="col-md-3">
				<h4 class="a">RECENT POSTS</h4>
	        	<p class="a">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled</p>
			    <address>
			    	<p class="b">Typesetting industry</p>
			    	<p class="b">Lorem Ipsum has</p>
			    	<p class="b">Phone : 466,348457,7459</p>
			    </address>
			</div>	
		</div>
	</div>
</div>-->
<div class="footer">
	<div class="container">
		<div class="row">
 			<div class="col-md-12">	
				<div class="copy-right">
					<p>Copyright &copy; 2014.Company name All rights reserved.More Templates <a href="http://www.cssmoban.com/" target="_blank" title="平顶山学院">平顶山学院</a> - Collect from <a href="http://www.cssmoban.com/" title="平顶山学院" target="_blank">平顶山学院</a></p>	
				</div>	
			</div>
		</div>
    </div>
</div>
 <!-- scroll_top_btn -->
		<script type="text/javascript" src="${pageContext.request.contextPath}/style/loginstyle/js/move-top.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/style/loginstyle/js/easing.js"></script>
		<script type="text/javascript">
		jQuery(document).ready(function($) {
			$(".scroll").click(function(event){		
				event.preventDefault();
				$('html,body').animate({scrollTop:$(this.hash).offset().top},1200);
			});
		});
	</script>

		 <a href="#" id="toTop" style="display: block;"><span id="toTopHover" style="opacity: 1;"></span></a>

</body>
</html>