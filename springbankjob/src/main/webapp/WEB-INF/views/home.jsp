<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리 프로그램</title>
</head>
<body>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<div>
		<button
			style="color: #fff; background: gray; font-size: 2em; border-radius: 0.5em; padding: 5px 20px;"
			onclick="location='insertCustomer'">고객 정보 입력</button>
		<span style="float: right;">
			<button
				style="color: #fff; background: gray; font-size: 2em; border-radius: 0.5em; padding: 5px 20px;"
				onclick="location='deleteCustomer'">고객 정보 삭제</button>
		</span>
	</div>
	<p>
	<div>
		<button
			style="color: #fff; background: gray; font-size: 2em; border-radius: 0.5em; padding: 5px 20px;"
			onclick="location='insertCard'">카드 정보 입력</button>
		<span style="float: right;">
			<button
				style="color: #fff; background: gray; font-size: 2em; border-radius: 0.5em; padding: 5px 20px;"
				onclick="location='deleteCardAccount'">카드 및 계좌 정보 삭제</button>
		</span>
	</div>
	<p>
	<div>
		<button
			style="color: #fff; background: gray; font-size: 2em; border-radius: 0.5em; padding: 5px 20px;"
			onclick="location='insertAccount'">계좌 정보 입력</button>
		<span style="float: right;">
			<button
				style="color: #fff; background: gray; font-size: 2em; border-radius: 0.5em; padding: 5px 20px;"
				onclick="location='deleteTransaction'">거래 정보 삭제</button>
		</span>
	</div>
	<p>
	<div>
		<button
			style="color: #fff; background: gray; font-size: 2em; border-radius: 0.5em; padding: 5px 20px;"
			onclick="location='insertTransaction'">거래 정보 입력</button>
	</div>
	<p>
		<br>
		<br>
	<div align="center">
		<button
			style="color: #fff; background: gray; font-size: 2em; border-radius: 0.5em; padding: 5px 20px;"
			onclick="location='selectCustomer'">고객 정보 조회</button>

		<button
			style="color: #fff; background: gray; font-size: 2em; border-radius: 0.5em; padding: 5px 20px;"
			onclick="location='selectCard'">카드 정보 조회</button>

		<button
			style="color: #fff; background: gray; font-size: 2em; border-radius: 0.5em; padding: 5px 20px;"
			onclick="location='selectAccount'">계좌 정보 조회</button>

		<button
			style="color: #fff; background: gray; font-size: 2em; border-radius: 0.5em; padding: 5px 20px;"
			onclick="location='selectTransaction'">거래 정보 조회</button>
	</div>
	<p>
		<br>
		<br>
	<div align="center">
		<button
			style="color: #fff; background: gray; font-size: 2em; border-radius: 0.5em; padding: 5px 20px;"
			onclick="location='listCustomer'">모든 고객 정보 조회</button>

		<button
			style="color: #fff; background: gray; font-size: 2em; border-radius: 0.5em; padding: 5px 20px;"
			onclick="location='listCard'">모든 카드 정보 조회</button>

		<button
			style="color: #fff; background: gray; font-size: 2em; border-radius: 0.5em; padding: 5px 20px;"
			onclick="location='listAccount'">모든 계좌 정보 조회</button>

		<button
			style="color: #fff; background: gray; font-size: 2em; border-radius: 0.5em; padding: 5px 20px;"
			onclick="location='listTransaction'">모든 거래 정보 조회</button>
	</div>
</body>
</html>
