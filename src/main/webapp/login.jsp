<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 폼 페이지</title>
</head>
<body>

<center>
	<h1> 로그인 폼 </h1>
	<hr>
	
	<form action = "Login.do" method="post">
		<table border = "1" cellspacing="0" cellpadding ="0">
			<tr><td bgcolor = "orange">아이디 : </td>
				<td><input type = "text" name = "id"></td>
			</tr>
			
			<tr><td>패스워드 : </td>
				<td><input type = "password" name = "password"></td>
			</tr>
			
			<tr>
				<td colspan = "2" align = "center">
					<input type="submit" value = "로그인">
				</td>
			</tr>
		</table>
	</form>
</center>

</body>
</html>