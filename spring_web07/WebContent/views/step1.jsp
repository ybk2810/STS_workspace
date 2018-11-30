<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원가입 페이지 입니다.</h2>
	
	<form action="step2.do" method="get">
		<textarea name="" id="" cols="80" rows="5" disabled="disabled">
			개꿀?
		</textarea>
		<br />
		아이디: <input type="text" name="id" id="id" />
		패스워드: <input type="text" name="pw" id="" />
		패스워드확인: <input type="text" name="repw" id="" />
		이메일: <input type="text" name="email" id="" />
		주소: <input type="text" name="addrs" id="" />
		<input type="submit" value="가입" />
		<input type="reset" value="초기화" />
		
	</form>
</body>
</html>