<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>All</title>
	<style>
		table, td, th{
			border:2px solid gray;
			border-collapse: collapse;
		}
		td{
			padding: 10px;
		}
	</style>
</head>
<body>
	<h1>All</h1>
	<hr>
	<table>
		<tr>
			<th>이메일</th>
			<th>이름</th>
			<th>생성일자</th>
		</tr>
		<c:forEach var="member" items="${memberList }">
			<tr>
				<td>${member.email }</td>
				<td>${member.name }</td>
				<td>${member.registerDateTime }</td>
			</tr>
		</c:forEach>
	</table>
	
	<a href="<c:url value='/main'/>">홈으로 돌아가기</a>
</body>
</html>