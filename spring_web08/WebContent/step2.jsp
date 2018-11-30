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
				<th>ID</th>
				<td>${dto.id}</td>
			</tr>
			<tr>
				<th>PW</th>
				<td>${dto.pw}</td>
			</tr>
			<tr>
				<th>REPW</th>
				<td>${dto.repw}</td>
			</tr>
			<tr>
				<th>EMAIL</th>
				<td>${dto.email}</td>
			</tr>
			<tr>
				<th>ADDRS</th>
				<td>${dto.addrs}</td>
			</tr>
		</table>
	</form>
</body>
</html>