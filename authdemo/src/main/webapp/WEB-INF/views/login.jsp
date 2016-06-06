<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="utf-8" />
<title>登录</title>
</head>
<body>
	<form action="login" method="post">
		name:<input type="text" name="name"><br> <br>
		password:<input type="password" name="passwd"><br> <br>
		<input type="submit" value="Login">
	</form>
</body>
</html>