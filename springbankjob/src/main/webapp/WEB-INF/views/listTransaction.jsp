<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>모든 거래정보보기</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/listTrans"
		accept-charset="utf-8" name="transaction_info" method="post">
		<br> <br> <br> <br> <br> <br>
		<div align="center">			
			<table border="1">
				<tr>
					<th>거래번호</th>
					<th>카드번호</th>					
					<th>거래일</th>
					<th>거래시</th>
					<th>거래장소</th>
					<th>거래액</th>
					<th>지역</th>
					<th>DELBIT</th>
				</tr>
				<c:forEach var="transaction" items="${transactionsList}">
					<tr>
						<td>${transaction.transno }</td>
						<td>${transaction.cardno}</td>						
						<td>${transaction.transdate }</td>
						<td>${transaction.transtime }</td>
						<td>${transaction.transplace }</td>
						<td>${transaction.transamount }</td>
						<td>${transaction.loc }</td>
						<td>${transaction.DELBIT }</td>
					</tr>
				</c:forEach>
			</table>
			<br>
			<br> <a href="/controller">홈으로 가기</a>
		</div>
	</form>
	
</body>
</html>