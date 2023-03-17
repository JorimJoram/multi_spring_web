<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>

<body>

	<form method="post" action="step3">
		<fieldset>
			<legend>회원정보</legend>
			
			<label for="email">이메일</label>
			<input type="email" name="email" id="email"/> <br>
			<label for="name">이름</label>
			<input type="text" name="name" id="name"/> <br>
			<label for="password">비밀번호</label>
			<input type="password" name="password" id="password"/> <br>
			<label for="repasswd">비밀번호 확인</label>
			<input type="password" name="repasswd" id="repasswd"/> <br>
			
		</fieldset>
	</form>
</body>
</html>