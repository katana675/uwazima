<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import ="java.util.ArrayList,bean.User" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
検索結果
<%-- <%ArrayList <Integer> user_id = (ArrayList<Integer>)request.getAttribute("tel_userid");%>
<%ArrayList <String> user_name = (ArrayList<String>)request.getAttribute("tel_name");%>
<%ArrayList <String> user_mailaddress = (ArrayList<String>)request.getAttribute("tel_mailaddress");%>
<%ArrayList <String> user_tel = (ArrayList<String>)request.getAttribute("tel_tel");%>
<%ArrayList <Integer> user_gender = (ArrayList<Integer>)request.getAttribute("tel_gender");%> --%>
<%-- <%String user_name[] = (String[])request.getAttribute("tel_name"); %>
<%String user_mailaddress[] = (String[])request.getAttribute("tel_mailaddress"); %>
<%String user_tel[] = (String[])request.getAttribute("tel_tel"); %>
<%int user_gender[] = (int[])request.getAttribute("tel_gender"); %> --%>
<%-- <%int count=0; %>  --%>
<%-- <%for(int i=0; i<10; i++){%>
<%=user_id[count]%>
<%=user_name[count]%>
<%=user_mailaddress[count]%>
<%=user_tel[count]%>
<%=user_gender[count]%>
<%count ++;%>
<% } %> --%>
 <% ArrayList<User> list=(ArrayList<User>)request.getAttribute("Users"); %>
<table border="1">
    <tr>
      <th>ID</th>
      <th>名前</th>
      <th>メールアドレス</th>
      <th>電話番号</th>
      <th>性別</th>
    </tr>
    <% for(User p:list){ %>
  			<tr>
    			<td><%=p.getId() %></td>
				<td><%=p.getName() %></td>
				<td><%=p.getMail() %></td>
				<td><%=p.getTel() %></td>
				<%if(p.getgender()==0){ %>
				<td>男性</td>
				<%}else if(p.getgender()==1){ %>
				<td>女性</td>
				<%}else{ %>
				<td>秘密</td>
				<%} %>
			</tr>
		<%} %>
    <%-- <%for(int i=0; i<user_id.size(); i++){%>
    <tr>
      <td><%=user_id.get(i)%></td>
      <td><%=user_name.get(i)%></td>
      <td><%=user_mailaddress.get(i)%></td>
      <td><%=user_tel.get(i)%></td>
      <%if(user_gender.get(i)==0){%>
      <td>男性</td>
      <%}else if(user_gender.get(i)==1){%>
      <td>女性</td>
      <%}else{%>
      <td>秘密</td>
      <%}%> --%>
    <!-- </tr> -->
  <%--    <%count ++;%>
    <% } %> --%>
   </table>
	<!-- System.out.println(user_id[count]);
	System.out.println(user_name[count]);
	System.out.println(user_mailaddress[count]);
	System.out.println(user_tel[count]);
	System.out.println(user_gender[count]); -->
<!-- 	count++;
} -->

<button type="button" onclick="history.back()">戻る</button>
</body>
</html>