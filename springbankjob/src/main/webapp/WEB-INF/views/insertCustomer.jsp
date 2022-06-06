<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고객 정보 입력</title>
</head>
<body>
<form action ="${pageContext.request.contextPath}/addCustomer" accept-charset = "utf-8" name = "customer_info" method = "post">

<br><br><br><br><br>
<div align="center">
고객 이름: 
 <input type = "text" name = "name" required><p><br>
 우편 번호: 
 <input type = "text" name = "post"><p><br>
 주&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;소: 
 <input type = "text" name = "addr"><p><br>
 신용등급: 
 <select name = "credrate" style="width:180px;">
 <option value = "A"> 1등급
 <option value = "B"> 2등급
 <option value = "C"> 3등급
 <option value = "D"> 4등급
 </select><p><br>
 
 <input type = "submit" value = "전송">
 <input type = "reset" value = "삭제">
 </div>
 </form>
</body>
</html>