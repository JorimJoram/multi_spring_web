<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>

<body>

	<h1>Spring Web MVC Test</h1>
	<hr>
	
	<p>
		인사말: <%= request.getAttribute("greeting") %><br>
		인사말: ${greeting }
	</p>
	
</body>
</html>