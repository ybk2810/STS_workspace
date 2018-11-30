<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>글쓰기</h1>
	<form action="write" method="post">
		<table>
			<tr>
				<th>작성자</th>
				<td>
					<input type="text" name="writer" id="" />
				</td>
			</tr>
			<tr>
				<th>제목</th>
				<td>
					<input type="text" name="title" id="" />
				</td>
			</tr>
			<tr>
				<th>내용</th>
				<td>
					<textarea name="contents" id="" cols="50" rows="10" ></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="button" value="목록" />
					<input type="submit" value="저장"	 />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>