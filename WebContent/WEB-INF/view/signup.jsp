<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<c:url value="/signup" />" method="post">
<input type='text' name="name" />
<input type="password" name="password" />
<input type="submit" />
</form>
</body>
</html>