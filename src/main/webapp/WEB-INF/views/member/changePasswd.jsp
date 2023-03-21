<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Change</title>
	<style>
	</style>
</head>

<body>

	<h1>ChangePassword</h1>
	<hr>
	
	<form action="changeProcess" method="post">
		<fieldset>
			<legend>비밀번호 변경</legend>
			
			<label>아이디</label>
			<input type="text" id="email" name="email" value="${auth.email }" readonly/>
			
			<label>이전 비밀번호</label>
			<input type="password" id="password" name="password" required/>
			
			<label>변경 비밀번호</label>
			<input type="password" id="newPassword" name="newPassword" required/>
			
			<label>변경 비밀번호 확인</label>
			<input type="password" id="confirmPassword" name="confirmPassword" required/>
			
			<input type="submit" value="Submit"/>
		</fieldset>
	</form>
	
	<p>
		<font color="red">${changeFailMsg }</font>
	</p>
</body>
</html>