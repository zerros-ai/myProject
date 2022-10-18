<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>카드정보 보기</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/showcard"
		accept-charset="utf-8" name="card_info" method="post">
		<br> <br> <br> <br> <br> <br>
		<div align="center">
			<div>
				카드 번호: <input type="text" name="cardno">
				<p>
					<input type="submit" value="조회">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;


				
			</div>
			<table border="1">
				<tr>
					<th>카드번호</th>
					<th>카드종류</th>
					<th>잔액</th>
					<th>카드이름</th>
					<th>만료일</th>
					<th>비밀번호</th>
					<th>한도</th>
					<th>계좌번호</th>
					<th>고객번호</th>
					<th>DELBIT</th>
				</tr>
				<c:forEach var="card" items="${cardsList}">
					<tr>
						<td>${card.cardno }</td>
						<td>${card.cardkind}</td>
						<td>${card.rmn }</td>
						<td>${card.cardname }</td>
						<td>${card.exprday }</td>
						<td>${card.pwd}</td>
						<td>${card.lmtmoney }</td>
						<td>${card.accountno }</td>
						<td>${card.custno }</td>
						<td>${card.DELBIT }</td>
					</tr>
				</c:forEach>
			</table>
			<br> <br> <a href="/controller">홈으로 가기</a>
		</div>
	</form>

</body>
</html>