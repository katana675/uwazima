<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
検索結果
<%= request.getAttribute("tel_userid") %> 
<%= request.getAttribute("tel_name") %> 
<%= request.getAttribute("tel_mailaddress") %> 
<%= request.getAttribute("tel_gender") %> 
<button type="button" onclick="history.back()">戻る</button>
</body>
</html>