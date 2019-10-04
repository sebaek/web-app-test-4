<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="<c:url value='/upload' />" method='post' enctype='multipart/form-data'>
<input type="file" value="choose you files" multiple="multiple" name="file1" />
<input type='submit' value="&#9995;SUBMIT" />

</form>

</body>
</html>