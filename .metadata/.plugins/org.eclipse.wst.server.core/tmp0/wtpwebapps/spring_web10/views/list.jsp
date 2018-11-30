<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h3>부서목록</h3>
   <table>
      <tr>
         <th></th>
         <th></th>
         <th></th>
      </tr>
      <c:forEach var="dto" items="${list }">
      <tr>
         <td>${dto.deptno }</td>
         <td>${dto.dname }</td>
         <td>${dto.loc }</td>
      </tr>
      </c:forEach>
   </table>

</body>
</html>