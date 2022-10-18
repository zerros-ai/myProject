<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>계좌정보보기</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/showaccount"
		accept-charset="utf-8" name="account_info" method="post">

		<br> <br> <br> <br> <br> <br>
		<div align="center">
			<div>
				계좌 번호: <input type="text" name="accountno">
				<p>
					<input type="submit" value="조회">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

				
			</div>
			<table border="1">
				<tr>
					<th>계좌번호</th>
					<th>잔액</th>
					<th>이율</th>
					<th>고객번호</th>
					<th>DELBIT</th>
				</tr>
				<c:forEach var="account" items="${accountsList}">
					<tr>
						<td>${account.accountno }</td>
						<td>${account.accountmoney }</td>
						<td>${account.interest }</td>
						<td>${account.custno }</td>
						<td>${account.DELBIT }</td>
					</tr>
				</c:forEach>
			</table>
			<br> <br> <a href="/controller">홈으로 가기</a>
		</div>
	</form>

</body>
</html>