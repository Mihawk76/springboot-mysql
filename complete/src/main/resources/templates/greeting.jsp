<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head> 
    <title>Getting Started: Serving Web Content</title> 
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>	
	<p th:text="'Hello, ' + ${name.get(0).getName()} + '!'" /> 
    <form action="/test" method="GET">
	        <input type="submit" name="action" value="save" />
    </form>
</body>
</html>
