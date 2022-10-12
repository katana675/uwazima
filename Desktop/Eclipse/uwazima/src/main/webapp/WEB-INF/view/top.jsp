<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<title>TOP</title>
			<link rel="stylesheet" href="${pageContext.request.contextPath}/css/top.css">
		</head>
		<header>
			<h2 style="text-align:center; background:skyblue">宇和島観光サイトTOP</h2>
		</header>
		<body>
		<p style="width:400px"><img src="${pageContext.request.contextPath}/image/welcome.jpg"></p>
			<div class="window">
				<div class="img">
					<p style="width:600px"><img src="${pageContext.request.contextPath}/image/top.jpg"></p>
				</div>
				<div class="rink">
					<p class="center"><a href="http://localhost:8080/uwazima/show" style="font-size:30px; text-align:right">宇和島を見てみる</a></p>
					<div class="plece">宇和島といえばこれというものを載せました。<br>
					例えば宇和島城や和霊神社などがあります。<br>
					</div>
					<p class="center"><a href="http://localhost:8080/uwazima/gaiya" style="font-size:30px">ガイヤを見てみる</a></p>
				<div class="gaiya">
				ガイヤ祭りは夏祭りで行われてます。<br>
				ガイヤ祭りの後の次の日には花火大会があり、宇和島市民からすれば楽しいイベントです。<br>
				</div>
				</div>
			</div>
		</body>
		<footer>
			<h2 style="text-align:center; background: #00ff00">2022.HIROSAWA reserved</h2>
		</footer>
	</html>