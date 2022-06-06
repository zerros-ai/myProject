<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>거래 정보 삭제</title>
</head>
<body>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<form action="${pageContext.request.contextPath}/subTransaction"
		accept-charset="utf-8" name="transaction_info" method="post">
		<div align="center">
			거래 번호: <input type="text" name="transno">
			<p>


				<input type="submit" value="전송">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="reset" value="삭제">
		</div>
	</form>
</body>
</html>