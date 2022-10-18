<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계좌 및 카드 정보 삭제</title>
</head>
<body>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<form action="${pageContext.request.contextPath}/subCardAccount"
		accept-charset="utf-8" name="cardaccount_info" method="post">
		<div align="center">
			계좌번호: <input type="text" name="accountno">
			<p>


				<input type="submit" value="전송">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="reset" value="삭제">
		</div>
	</form>
</body>
</html>