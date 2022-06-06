<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>結果</h2><br>
あなたの入力した数字は<%= request.getAttribute("kekka") %>です 
		<button onclick="window.href='./List'">戻る</button>
</body>
</html>