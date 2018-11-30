<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>선택하신 메뉴는</h1>
	
<%--
 	<h1>${paramValues.ck[0] }</h1>
	<h1>${paramValues.ck[1] }</h1>
	<h1>${paramValues.ck[2] }</h1>
	<h1>${paramValues.ck[3] }</h1>
	<h1>${paramValues.ck[4] }</h1>
	<h1>${paramValues.ck[5] }</h1>
	<h1>${paramValues.ck[6] }</h1>
	<h1>${paramValues.ck[7] }</h1>
	 --%>
	 <c:forEach var="m" items="${list }">
	 <h4>${m}</h4>
	 </c:forEach>
	<h1>입니다.</h1>

</body>
</html>