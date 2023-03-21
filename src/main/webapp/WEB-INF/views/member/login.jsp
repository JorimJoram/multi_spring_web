<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Login</h1>
	<hr>
	<form method="POST" action="loginProcess">
		<fieldset>
			<legend>로그인</legend>
			
			<label for="email">Email</label>
			<input type="email" name="email" id="email" required/>
			
			<label for="password">password</label>
			<input type="password" name="password" id="password" required/>
			
			<input type="submit" value="Login"/>
		</fieldset>
	</form>
	
	<p>
		<font color="red">${loginFailMsg }</font>
	</p>
	
</body>
</html>