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
<c:choose>
<c:when test="${kekka<=50}">頑張りましょう</c:when>
<c:when test="${kekka<80}">良くできました</c:when>
<c:when test="${kekka>=80}">大変良くできました</c:when>
<c:otherwise>0~100を入力してください</c:otherwise>
</c:choose><br>
<button type="button" onclick="history.back()">戻る</button>
</body>
</html>