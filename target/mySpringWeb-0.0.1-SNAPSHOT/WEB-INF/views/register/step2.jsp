<%@ page contentType="text/html; charset=UTF-8"%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<style>
		p{
			color:red;
			font-size: 10px;
		}
	</style>
	<script>
		function submitHandler(){
			var userName = document.querySelector('#name').value;
			var password = document.querySelector('#password').value;
			var confirmPassword = document.querySelector('#confirmPassword').value;
			
			if(userName.length >= 2 && password.length >= 4 && password == confirmPassword){
				alert('회원가입이 완료되었습니다.');
			}else{
				alert('올바른 회원 정보를 입력해주세요');
				return false;
			}
		}
	
		function init(){
			var registerForm = document.querySelector('#registerForm');
			registerForm.onsubmit = submitHandler;
		}
		
		window.onload = init;
	</script>
</head>

<body>
	<form:form action="step3" id="registerForm" modelAttribute="formData">
		<fieldset>
			<legend>회원정보</legend>
			<label for="email">이메일</label>
			<form:input type="email" path="email" required="required"/>
			<label for="name">이름</label>
			<form:input type="text" path="name" required="required"/> <br>
			<label for="password">비밀번호</label>
			<form:password path="password" required="required"/> <br>
			<label for="confirmPassword">비밀번호 확인</label>
			<form:password path="confirmPassword" required="required"/> <br>
		</fieldset>
		<input type="submit" value="send">
	</form:form>
<!--  
	<form method="post" action="step3" id="registerForm">
		<fieldset>
			<legend>회원정보</legend>
			<label for="email">이메일</label>
			<input type="email" name="email" id="email" value="${formData.email }" required/>
			<label for="name">이름</label>
			<input type="text" name="name" id="name" value="${formData.name }" required/> <br>
			<label for="password">비밀번호</label>
			<input type="password" name="password" id="password" required/> <br>
			<label for="confirmPassword">비밀번호 확인</label>
			<input type="password" name="confirmPassword" id="confirmPassword" required/> <br>
		</fieldset>
		<input type="submit" value="send">
	</form>
-->
	<p>
		<font color="blue">${msg }</font>
	</p>
</body>
</html>