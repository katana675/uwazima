<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<title>宇和島観光</title>
			<link rel="stylesheet" href="${pageContext.request.contextPath}/css/show.css">
		</head>
		<body>
			宇和島観光
			<ul class="col3">
				<li class="left">
					<a href="http://localhost:8080/uwazima/place">場所を見る</a>
					<img src="${pageContext.request.contextPath}/image/welcome_castle.jpg">
				</li>
				<li class="middle">
					<a href="http://localhost:8080/uwazima/top"><img src="${pageContext.request.contextPath}/image/topbutton.jpg" alt="top" class="top"></a>
				</li>
				<li class="right">
					<a href="http://localhost:8080/uwazima/specialty">名物を食べる</a>
					<img src="${pageContext.request.contextPath}/image/introduction.png">
				</li>
			</ul>
		</body>
	</html>