<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<title>食べ物・お土産</title>
			<link rel="stylesheet" href="${pageContext.request.contextPath}/css/specialty.css">
			<div class="window">
				<div class="title">
					<h3>名物を見る</h3>
				</div>
				<div class="another">
					<h3><a href="http://localhost:8080/uwazima/plece">有名な場所を観光する</a></h3>
				</div>
				<div class="top">
					<h3><a href="http://localhost:8080/uwazima/top">トップに戻る</a></h3>
				</div>
			</div>
		</head>
		<body>
			<div class="window">
				<div class="left">
					<form method="post" action="./specialty">
					<input type="submit" value="みかん" name="orange"><br>
					<input type="submit" value="大番" name="oban"><br>
					<input type="submit" value="さつま汁" name="satumaziru"><br>
					<input type="submit" value="鯛めし" name="snapper-rice"><br>
					<input type="submit" value="じゃこ天" name="zyakoten"><br>
					</form>
				</div>
				<div class="right">
					<%=request.getAttribute("input_name")%>
					<p style="text-align:center"><img src="${pageContext.request.contextPath}/<%=request.getAttribute("input_picture")%>"></p>
      				<%=request.getAttribute("input_explanation")%>
      				
				</div>
			</div>
		</body>
	</html>