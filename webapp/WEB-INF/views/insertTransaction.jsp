<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결제 정보 입력</title>
</head>
<body>
<form action ="${pageContext.request.contextPath}/addTransaction" accept-charset = "utf-8" name = "customer_info" method = "post">
<br><br><br><br><br>
 <div align="center">카드 번호: 
 <input type = "text" name = "cardno"><p>
 거래&nbsp;&nbsp; 일: 
 <input type = "text" name = "transdate"><p>
 거래 시간: 
 <input type = "text" name = "transtime"><p>
 거&nbsp;&nbsp;래&nbsp;&nbsp;처: 
 <input type = "text" name = "transplace"><p>
 결제 금액: 
 <input type = "text" name = "transamount"><p>
 지&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;역: 
 <input type = "text" name = "loc"><p>
 
 <input type = "submit" value = "전송">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 <input type = "reset" value = "삭제">
 </div>
 </form>
</body>
</html>