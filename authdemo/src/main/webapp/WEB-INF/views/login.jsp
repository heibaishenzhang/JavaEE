<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<html lang="en" class="no-js">
<!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
<base href="<%=basePath%>">
<meta charset="utf-8" />
<title>登录</title>
</head>
<!-- END HEAD -->

<!-- BEGIN BODY -->
<body class="login">
	<!-- BEGIN LOGIN -->
	<div class="content">
		<!-- BEGIN LOGIN FORM -->
		<form class="login-form" action="login" method="post">
			<h3 class="form-title">用户登录</h3>
			<div class="alert alert-danger display-hide">
				<button class="close" data-close="alert"></button>
				<span> 输入您的用户名和密码 </span>
			</div>
			<div class="form-group">
				<!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->
				<label class="control-label visible-ie8 visible-ie9">用户名</label>
				<div class="input-icon">
					<input name="username" id="username" size="25" value=""
						class="form-control placeholder-no-fix" type="text"
						autocomplete="off" placeholder="用户名" />
				</div>
			</div>
			<div class="form-group">
				<label class="control-label visible-ie8 visible-ie9">密码</label>
				<div class="input-icon">
					<i class="fa fa-lock"></i> <input name="password" id="password"
						size="25" value="" class="form-control placeholder-no-fix"
						type="password" autocomplete="off" placeholder="密码" />
				</div>
			</div>
			<div class="form-actions">
				<label class="checkbox"> <input type="checkbox"
					name="remember" value="1" /> 记住我
				</label>
				<button id="loginBut" type="submit" class="btn blue pull-right">
					登录 <i class="m-icon-swapright m-icon-white"></i>
				</button>
			</div>
		</form>
	</div>
	<!-- END LOGIN -->
	<!-- BEGIN COPYRIGHT -->
	<div class="copyright">2016 &copy; AiFortune - AuthDemo</div>
</body>
<!-- END BODY -->
</html>