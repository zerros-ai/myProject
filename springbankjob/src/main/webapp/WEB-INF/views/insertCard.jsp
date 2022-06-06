<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>카드 정보 입력</title>
</head>
<body>
<form action ="${pageContext.request.contextPath}/addCard" accept-charset = "utf-8" name = "card_info" method = "post">
<br><br><br><br><br><br>
 <div align="center">카드 번호: 
 <input type = "text" name = "cardno"><p>
카드 종류:&nbsp;&nbsp;&nbsp;&nbsp; <input type = "radio" name = "cardkind" value = "체크">체크
		<input type = "radio" name = "cardkind" value = "신용">신용<p>
		
잔&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;액: 
 <input type = "text" name = "rmn"><p>
카드 이름: 
 <input type = "text" name = "cardname"><p>
만&nbsp;&nbsp;료&nbsp;&nbsp;일: 
 <input type = "text" name = "exprday"><p>
비밀&nbsp;번호: 
 <input type = "password" name = "pwd"><p>
한&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;도: 
 <input type = "text" name = "lmtmoney"><p>
계좌&nbsp;번호: 
 <input type = "text" name = "accountno"><p>
소&nbsp;&nbsp;유&nbsp;&nbsp;주: 
 <input type = "text" name = "custno"><p>
 
 <input type = "submit" value = "전송">&nbsp;&nbsp;&nbsp;&nbsp;
 <input type = "reset" value = "삭제">
 </div>
 </form>
</body>
</html>