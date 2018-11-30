<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="">
		<table>
			<tr>
				<th>No</th>
				<th>Writer</th>
				<th>Title</th>
				<th>Contents</th>
				<th>Hits</th>
				<th>Regdate</th>
			</tr>
			<tr>
				<th>${dto.bno }</th>
				<th>${dto.writer }</th>
				<th>${dto.title }</th>
				<th>${dto.contents }</th>
				<th>${dto.hits }</th>
				<th>${dto.regdate }</th>
			</tr>
			<tr>
				<td colspan="4">
					<a href="boardList">
						<input type="button" value="목록" />
					</a>
					<a href="modify?bno=${dto.bno}">
						<input type="button" value="수정" />
					</a>
					<a href="delete?bno=${dto.bno}">
						<input type="button" value="삭제" />
					</a>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>