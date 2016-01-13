<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>자바의 정석</title>
</head>
<body>
	<h1>자바의 정석 연습 목록</h1>

	<P>This is Home...?</P>

	<ol>
	
		<li><a href="ch2/1">ex2/1 선언</a></li>
		<li><a href="ch2/2">ex2/2 변수 타입</a></li>
		<li><a href="ch2/2/3">ex2/2/3 문자형</a></li>
		<li><a href="ex2/1">ex2/1 char->int</a></li>
		<li><a href="ex2/2">ex2/2 char<-int</a></li>
		<li><a href="ex2/3">ex2/3 문자결합</a></li>
		<li><a href="ch2/2/4">ex2/2/4 숫자 선언</a></li>
	</ol>

	<c:if test="${!empty result }">

		<P>result:${result }</P>

		<%@include file="/WEB-INF/debug/debug.jsp"%>

	</c:if>



</body>
</html>
