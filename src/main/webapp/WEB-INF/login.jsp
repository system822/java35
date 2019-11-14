<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>欢迎来到银行登录系统</h4>
	<form action="login">
		<input name="name"><br/>
		<input name="password"><br/>
		<input type="submit" value="登录">${message}
	</form>
</body>
</html>