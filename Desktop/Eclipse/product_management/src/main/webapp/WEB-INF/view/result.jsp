<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ page import ="java.util.ArrayList,bean.Bean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <% ArrayList<Bean> list=(ArrayList<Bean>)request.getAttribute("Users"); %>
<table border="1">
    <tr>
      <th>ID</th>
      <th>商品名</th>
      <th>商品内容</th>
      <th>価格</th>
    </tr>
    <% for(Bean p:list){ %>
  			<tr>
    			<td><%=p.getId() %></td>
				<td><%=p.getName() %></td>
				<td><%=p.getContent() %></td>
				<td><%=p.getPrice() %></td> 
			</tr>
		<%} %>
		<button type="button" onclick="location.href='http://localhost:8080/product_management/input'">新規登録</button>
</body>
</html>