<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Submitted</title>
	<style>
		table, td, th{
			border: 2px solid gray;
			border-collapse: collapse;
		}
		td, th{
			padding 10px 20px;
		}
	</style>
</head>
<body>
	<h1>설문 응답 내용</h1>
	<hr>
	
	<h5>응답 내용</h5>
	
	<table>
		<tr>
			<th>개발분야</th><td>${ansData.responses[0] }</td>
		</tr>
		<tr>
			<th>개발도구</th><td>${ansData.responses[1] }</td>
		</tr>
		<tr>
			<th>남길말</th><td>${ansData.responses[2] }</td>
		</tr>
	</table>
	
	
	
	<h5>응답자 정보</h5>
	<ul>
		<li>응답자 위치: ${ansData.res.location }</li>
		<li>응답자 나이: ${ansData.res.age }</li>
	</ul>
	
	
</body>
</html>