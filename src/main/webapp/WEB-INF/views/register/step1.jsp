<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>

<body>

	<h1>회원가입</h1>
	<hr>
	
	<h3>약관</h3>
	<p>약관 내용 ...... </p>
	
	<form action="step2" method="post">
		<fieldset>
			<legend>약관 승인</legend>
				<label for="agree">약관 동의</label>
				<input type="checkbox" name="agree" id="agree" value="true"/>
		</fieldset>
	
		<input type="submit" value="다음"/>
	</form>

</body>
</html>