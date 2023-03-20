<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Change</title>
</head>

<body>

	<h1>ChangePassword</h1>
	<hr>
	
	<form action="change" method="post">
		<fieldset>
			<legend>비밀번호 변경</legend>
			<label>아이디</label>
			<input type="text" id="email" name="email" required/>
			<label>이전 비밀번호</label>
			<input type="password" id="oldPassword" name="oldPassword" required/>
			<label>변경 비밀번호</label>
			<input type="password" id="newPassword" name="newPassword" required/>
			
			<input type="submit" value="Submit"/>
		</fieldset>
	</form>
</body>
</html>