<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored ="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		
		회원가입성공
		<br>
		정보를 확인하세요<br>
		<br>		
		<table>
			<tr>
				<td>성공했다</td>	
				<td>${requestScope.joinEmail }</td>
			</tr>
		</table>
		
</body>
</html>