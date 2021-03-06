<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="en" class="no-js">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge"> 
<meta name="viewport" content="width=device-width, initial-scale=1"> 
<title>SGT管理系统</title>
    <link rel="shortcut icon" href="${ctx}/public/d5.ico" type="image/x-icon" />
<link rel="stylesheet" type="text/css" href="${ctx}/public/css/normalize.css" />
<link rel="stylesheet" type="text/css" href="${ctx}/public/css/demo.css" />
<!--必要样式-->
<link rel="stylesheet" type="text/css" href="${ctx}/public/css/component.css" />
<!--[if IE]>
<script src="js/html5.js"></script>
<![endif]-->
</head>
<body>
		<div class="container demo-1">
			<div class="content">
				<div id="large-header" class="large-header">
					<canvas id="demo-canvas"></canvas>
					<div class="logo_box">
						<h3 style="text-align: center; font-size: 40px" >SGT后台管理系统</h3>
						<h5 style="text-align: center;">${requestScope.message}</h5>
						<form  action="${ctx}/login" name="f" method="post">
							<div class="input_outer">
								<span class="u_user"></span>
								<input name="loginname" class="text" style="color: #FFFFFF !important" type="text" placeholder="请输入账户" value="${loginname }" >
							</div>
							<div class="input_outer">
								<span class="us_uer"></span>
								<input name="password" class="text" style="color: #FFFFFF !important; position:absolute; z-index:100;"value="" type="password" placeholder="请输入密码">
							</div>
							<div class="input_outer" style="display: none;">
								<select class="text" name="tip" >
									<option value="1">管理员</option>
									<option value="2">用户</option>
								</select>
							</div>
							<div class="mb2"><input class="act-but submit" type="submit" style="color: #FFFFFF; width:330px;" value="登录" ></div>
						</form>
					</div>
				</div>
			</div>
		</div><!-- /container -->
		<script src="${ctx}/public/js/TweenLite.min.js"></script>
		<script src="${ctx}/public/js/EasePack.min.js"></script>
		<script src="${ctx}/public/js/rAF.js"></script>
		<script src="${ctx}/public/js/demo-1.js"></script>
		<div style="text-align:center;">
<p>更多模板：<a href="http://www.mycodes.net/" target="_blank">源码之家</a></p>
</div>
	</body>
</html>