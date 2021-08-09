<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/style.css"/>
<title>Time</title>
</head>
<body onload=viewingTime()>
    <h1 class="time">The time is ${time}</h1>
	<p><a href="/">Home</a></p>
    <script src="/js/script.js"></script>
</body>
</html>