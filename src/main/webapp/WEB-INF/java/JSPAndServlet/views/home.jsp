<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>JSP & Servlet</title>
</head>
<body>
	<h1>JSP & Servlet 연습 목록</h1>

	<P>This is Home...?</P>

	<ol>

 		<li><a href="?ch=7">ex7 선언</a></li>
		<li><a href="ch11/test/">ch11/test/</a></li>
	<!--	<li><a href="ch2/2/3">ex2/2/3 문자형</a></li>
		<li><a href="ex2/1">ex2/1 char->int</a></li>
		<li><a href="ex2/2">ex2/2 char<-int</a></li>
		<li><a href="ex2/3">ex2/3 문자결합</a></li>
		<li><a href="ch2/2/4">ex2/2/4 숫자 선언</a></li>
		<li><a href="ex2/5">ex2/3 정수형 오버플로우</a></li>
		<li><a href="ex2/6">ex2/3 실수형 범위</a></li> -->
	</ol>

	<c:if test="${!empty result }">
		<P>result:${result }</P>
	</c:if>
	
	<c:if test="${!empty map }">
		<c:forEach items="${map}" var="item">
			<p>
				<c:out value="${item.key}"></c:out>
				=
				<c:out value="${item.value}"></c:out>
			</p>
		</c:forEach>
	</c:if>
	
	<%@include file="/WEB-INF/debug/debug.jsp"%>

</body>
</html>
