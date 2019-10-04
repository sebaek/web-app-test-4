<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>반갑습니다. ${param.name}씨 </h1>
<p>post 요청에 대한 응답입니다. jsp</p>
<p>gender: ${paramValues.gender[0] }</p>
<p>gender: ${paramValues.gender[1] }</p>
<img src="<c:url value='/res/img/rubber_duck.jpeg' />" />
<p></p>
</body>
</html>