<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<title>場所案内</title>
			<div class="sikaku">
				<div class="title">
					<h3>場所を見る</h3>
				</div>
				<div class="another">
					<h3><a href="http://localhost:8080/uwazima/specialty">名物もチェックする</a></h3>
				</div>
			</div>
		</head>
		<body>
			<div class="sikaku">
				<div class="left">
					<form method="post" action="./plece">
					<input type="submit" value="商店街" name="shopping"><br>
					<input type="submit" value="宇和島城"  name="castle"><br>
					</form>
				</div>
				<div class="right">
				<!-- JavaScriptで動かす -->
					<%=request.getAttribute("input_name")%>
					<p style="text-align:center"><img src="${pageContext.request.contextPath}/<%=request.getAttribute("input_picture")%>"></p>
      				<%=request.getAttribute("input_explanation")%>
      				<%=request.getAttribute("input_distance") %>
				</div>
			</div>
		</body>
	</html>