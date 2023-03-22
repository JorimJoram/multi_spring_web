<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>surveyForm</title>
</head>
<body>

	<h1>설문조사</h1>
	<hr>
	<form method="post">
		<fieldset>
		<legend>설문항목</legend>
			<p>
				1. 당신의 역할은 무엇입니까?<br>
				<label for="responses01">서버 개발자</label>
				<input type="radio" name="responses[0]" value="서버" id="responses01"/>
				<label for="responses02">프론트 개발자</label>
				<input type="radio" name="responses[0]" value="프론트" id="responses02"/>
				<label for="responses03">풀스택 개발자</label>
				<input type="radio" name="responses[0]" value="풀스택" id="responses03"/>
			</p>
			<p>
				2. 많이 사용하는 개발 도구는 무엇입니까?<br>
				<label for="responses11">Eclipse</label>
				<input type="radio" name="responses[1]" value="Eclipse" id="responses11"/>
				<label for="responses12">IntelliJIDEA</label>
				<input type="radio" name="responses[1]" value="IntelliJIDEA" id="responses12"/>
				<label for="responses13">Sublime</label>
				<input type="radio" name="responses[1]" value="Sublime" id="responses13"/>
			</p>
			
			<p>
				3. 하고 싶은 말을 남겨주세요!<br>
				<input type="text" name="responses[2]" />
			</p>
		</fieldset>
		<fieldset>
		<legend>응답자 정보</legend>
			<p>
				<label for="location">응답자 지역</label>
				<input type="text" name="res.location" id="location" required/><br>
			</p>
			<p>
				<label for="age">응답자 나이</label>
				<input type="number" name="res.age" id="age" required/><br>
			</p>
		</fieldset>
		
		<input type="submit" value="제출"/>
		
	</form>
</body>
</html>