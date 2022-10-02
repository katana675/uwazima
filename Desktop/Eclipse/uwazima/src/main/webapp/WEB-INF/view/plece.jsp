<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<link rel="stylesheet" href="${pageContext.request.contextPath}/css/plece.css">
			<title>場所案内</title>
			<div class="window">
				<div class="title">
					<h3>場所を見る</h3>
				</div>
				<div class="another">
					<h3><a href="http://localhost:8080/uwazima/specialty">名物もチェックする</a></h3>
				</div>
			</div>
		</head>
		<body>
			<div class="window">
				<div class="left">
					<form method="post" action="./plece">
					<input type="submit" value="商店街" name="shopping"><br>
					<input type="submit" value="宇和島城" name="castle"><br>
					<input type="submit" value="和霊神社" name="shrine"><br>
					<input type="submit" value="きさいや広場" name="land">
					</form>
				</div>
				<div class="right">
					<%=request.getAttribute("input_name")%>
					<p style="text-align:center"><img src="${pageContext.request.contextPath}/<%=request.getAttribute("input_picture")%>"></p>
      				<%=request.getAttribute("input_explanation")%>
				</div>
			</div>
		</body>
		<footer>
			<h2 style="text-align:center; background: #00ff00">2022.HIROSAWA reserved</h2>
		</footer>
	</html>