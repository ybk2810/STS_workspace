<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginForm</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#btn").on("click", function(){
			location.href="register/step1.do";
		})
	})

</script>
</head>
<body>
	<h2>로그인 페이지</h2>
	
	<form action="login.do" method="post">
		<table>
			<tr>
				<th>ID</th>
				<td>
					<input type="text" name="id" id="" />
				</td>
			</tr>
			<tr>
				<th>PW</th>
				<td>
					<input type="text" name="pw" id="" />
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="로그인" />
					<input type="button" id="btn" value="회원가입" />
					<!-- register/step1.do -->
				</td>
			</tr>
		</table>
	</form>
</body>
</html>