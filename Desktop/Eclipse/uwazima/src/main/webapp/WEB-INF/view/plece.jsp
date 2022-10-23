<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ page import ="java.util.ArrayList,bean.Beanplece" %>
<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<link rel="stylesheet" href="${pageContext.request.contextPath}/css/plece.css">
			<% ArrayList<Beanplece> list=(ArrayList<Beanplece>)request.getAttribute("Beanplece"); %>
			<title>場所案内</title>
		</head>
		<header>
			<h2 style="text-align:center; background:skyblue">宇和島観光サイト　名物観光ページ</h2>
			<div class="window">
				<div class="specialty">
					<h3><a href="http://localhost:8080/uwazima/specialty">名物もチェックする</a></h3>
				</div>
				<div class="top">
					<h3><a href="http://localhost:8080/uwazima/top">TOPページに戻る</a></h3>
				</div>
			</div>
		</header>
		<body>
			<div class="window">
				<div class="left">
					<form method="post" action="./plece">
					<input type="submit" value="商店街" name="shopping"><br>
					<input type="submit" value="宇和島城" name="castle"><br>
					<input type="submit" value="和霊神社" name="shrine"><br>
					<input type="submit" value="きさいや広場" name="land"><br>
					<input type="submit" value="丸山公園" name="park">
					</form>
				</div>
				<div class="right">
					 <% for(Beanplece p:list){ %>
  			<tr>
				<td><%=p.getName() %></td>
				<td><%=p.getExplanation() %></td>
				<td><%=p.getDistance() %></td>
			</tr>
		<%} %>
				</div>
			</div>
		</body>
		<footer>
			<h2 style="text-align:center; background: #00ff00">2022.HIROSAWA reserved</h2>
		</footer>
	</html>