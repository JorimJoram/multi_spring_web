<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>testSurveyForm</title>
</head>
<body>
	<h1>Test Dynamic Survey</h1>
	<hr>
	<form method="post">
		<fieldset>
		<legend>질문 항목</legend>
			<c:forEach var="question" items="${questions }" varStatus="status">
			<p>
				<c:if test="${question.choice }">
					${status.count }.${question.title }<br>
					<c:forEach var="option" items="${question.options }" varStatus="statusO">
						<label for=${status.count * 10 + statusO.index }>${option }</label>
						<input type="radio" name="responses[${status.index }]" value="${option }" id="${status.count *10 + statusO.index }" value="${option }"/>
					</c:forEach>
				</c:if>
				<c:if test="${!question.choice }">
					<label for="${status.index }">${status.count }.${question.title }</label>
					<input type="text" name="responses[${status.index }]" id="${status.index }"/> 
				</c:if>
			</p>
			</c:forEach>
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