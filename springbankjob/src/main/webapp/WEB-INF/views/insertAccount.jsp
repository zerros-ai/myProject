<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계좌 정보 입력</title>
</head>
<body>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<form action="${pageContext.request.contextPath}/addAccount"
		accept-charset="utf-8" name="account_info" method="post">
		<div align="center">
			계좌&nbsp;번호: <input type="text" name="accountno">
			<p>
				잔&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;고: <input type="text"
					name="accountmoney">
			<p>
				이&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;율: <input type="text"
					name="interest">
			<p>
				고객&nbsp;번호: <input type="text" name="custno">
			<p>



				<input type="submit" value="전송">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="reset" value="삭제">
		</div>
	</form>
</body>
</html>