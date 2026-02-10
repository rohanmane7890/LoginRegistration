<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="RegisterController" method="get">
		<table>
		<tr>
			<td>Reg Number</td>
			<td><input type="text" name="num1"></td>
		</tr>
		
		<tr>
			<td>First Name</td>
			<td><input type="text" name="fname"></td>
		</tr>
		
		<tr>
			<td>User Name</td>
			<td><input type="text" name="uname"></td>
		</tr>
		
		<tr>
			<td>Password</td>
			<td><input type="Password" name="pass"></td>
		</tr>
		
		<tr>
		 <td>Acc bal</td>
		 <td><input type="text" name="accbal"></td>
		</tr>
		
		<tr>
		<td><input type="submit" name="" value="save"></td>
		</tr>
		</table>
</form>
</body>
</html>