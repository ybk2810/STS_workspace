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
	<h3>게시판</h3>
	<div>
		<h3>총 게시물 수 :${total }</h3>
		<h3>현재 페이지번호 :${currentPage }</h3>
		<h3>현재 페이지 게시물 수 :${countPerPage }</h3>
		<h3>현재 페이지 게시물 시작번호 :${startNo }</h3>
		<h3>현재 페이지 게시물 끝번호 :${endNo }</h3>
		<h3>총 페이지 수 :${totalPage }</h3>
		<h3>시작 페이지 번호 :${startPage }</h3>
		<h3>끝 페이지 번호:${endPage }</h3>
		<h3>이전:${prev }</h3>
		<h3>다음:${next }</h3>
	</div>
	<table>
		<tr>
			<td colspan="5">
				<a href="write">
					<input type="button" value="글쓰기"/>
				</a>
			</td>
		</tr>
		<tr>
			<th>No</th>
			<th>Writer</th>
			<th>Title</th>
			<th>Hits</th>
			<th>Regdate</th>
		</tr>
		<c:forEach var="dto" items="${list }">
			<tr>
				<td>${dto.bno }</td>
				<td>${dto.writer }</td>
				<td>
					<a href="detail?bno=${dto.bno}">${dto.title}</a>
				</td>
				<td>${dto.hits }</td>
				<td>${dto.regdate }</td>
			</tr>
		</c:forEach>
      
		<tr>
			<td colspan="5">
				<c:choose>
					<c:when test="${prev }">
						<a href="boardList?currentPage=${currntPage-5 }">[이전]</a>
					</c:when>
				</c:choose>
				<c:forEach var="i" begin="${startPage }" end="${endPage }">
					<a href="boardList?currentPage=${i}">${i}</a>
				</c:forEach>
				<c:choose>
					<c:when test="${next }">
						<a href="boardList?currentPage=${currntPage+5 }">[다음]</a>
					</c:when>
				</c:choose>
			</td>
		</tr>
	</table>
</body>
</html>