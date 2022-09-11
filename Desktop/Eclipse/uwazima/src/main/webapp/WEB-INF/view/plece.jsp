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
					<h3>商店街</h3>
				</div>
				<div class="right">
					<%=request.getAttribute("input_id")%>
      				<%=request.getAttribute("input_name")%>
      <td><%=request.getAttribute("input_mailaddress")%></td>
      <td><%=request.getAttribute("input_tel") %></td>
				</div>
			</div>
		</body>
	</html>