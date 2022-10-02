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
			<h2><a href="http://localhost:8080/uwazima/top">宇和島観光案内サイト</a></h2>
			<ul class="col3">
				<li class="left">
				<h2><a href="http://localhost:8080/uwazima/plece">場所を見る</a></h2>
					<img width="100%" height="50%" src="${pageContext.request.contextPath}/image/welcome_castle.jpg"><br>
					<h3>宇和島で有名な場所を紹介します。例えば宇和島城や商店街があります。</h3>
				</li>
				<li class="right">
					<h2><a href="http://localhost:8080/uwazima/specialty">名物を食べる</a></h2>
					<img width="100%" height="50%" src="${pageContext.request.contextPath}/image/introduction.png"><br>
					<h3>宇和島に来たら食べておきたいものを紹介します。<br>お土産には大番がおすすめです。</h3>
				</li>
			</ul>
		</body>
		<footer>
			<h2 style="text-align:center; background: #00ff00">2022.HIROSAWA reserved</h2>
		</footer>
	</html>