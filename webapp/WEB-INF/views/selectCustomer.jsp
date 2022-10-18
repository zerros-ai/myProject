<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>고객정보보기</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/showcust"
		accept-charset="utf-8" name="customer_info" method="post">
		<br> <br> <br> <br> <br> <br>
		<div align="center">
			<div>
				고객 번호: <input type="text" name="custno">
				<p>
					<input type="submit" value="조회">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

				
			</div>
			<table border="1">
				<tr>
					<th>고객번호</th>
					<th>이름</th>
					<th>우편번호</th>
					<th>주소</th>
					<th>신용등급</th>
					<th>DELBIT</th>
				</tr>
				<c:forEach var="customer" items="${customersList}">
					<tr>
						<td>${customer.custno }</td>
						<td>${customer.name}</td>
						<td>${customer.post }</td>
						<td>${customer.addr }</td>
						<td>${customer.credrate }</td>
						<td>${customer.DELBIT }</td>
					</tr>
				</c:forEach>
			</table>
			<br>
			<br> <a href="/controller">홈으로 가기</a>
		</div>
	</form>
</body>
</html>