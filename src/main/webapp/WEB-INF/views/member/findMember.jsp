<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Find Member</title>
	<style>
		table, td{
			border: 2px solid gray;
			border-collapse: collapse;
		}
		td{
			padding: 20px;
		}
		td.value{
			width: 200px;
		}
	</style>
</head>
<body>
	
	<h1>회원검색</h1>
	<hr>
	
	<form action="findMemberProcess" method="post">
		<fieldset>
			<legend>검색</legend>
			
			<label>이메일</label>
			<input type="email" id="email" name="email"/>
			
			<input type="submit" value="search"/>
		</fieldset>
	</form>
	
	<hr>
	
	<table>
		<tr>
			<td>이메일</td><td class="value">${member.email }</td>
		</tr>
		
		<tr>
			<td>이름</td><td class="value">${member.name }</td>
		</tr>
		
		<tr>
			<td>등록일자</td><td class="value">${member.registerDateTime.toLocalDate() }</td>
		</tr>
	</table>
	<p>
		<font color="red">${findFailMsg }</font>
	</p>
	
	<p><a href="<c:url value='/main/'/>">홈으로 이동</a></p>
</body>
</html>