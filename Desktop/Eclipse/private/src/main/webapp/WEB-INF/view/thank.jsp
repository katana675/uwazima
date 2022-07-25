<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <%Integer  input_gender=(Integer)request.getAttribute("input_gender"); %> --%>

<table border="1">
    <tr>
      <th>ID</th>
      <th>名前</th>
      <th>メールアドレス</th>
      <th>電話番号</th>
      <th>性別</th>
    </tr>
    <tr>
      <td><%=request.getAttribute("input_id")%></td>
      <td><%=request.getAttribute("input_name")%></td>
      <td><%=request.getAttribute("input_mailaddress")%></td>
      <td><%=request.getAttribute("input_tel") %></td>
      <%if((Integer)request.getAttribute("input_gender")==0){%>
      <td>男性</td>
      <%}else if((Integer)request.getAttribute("input_gender")==1){%>
      <td>女性</td>
      <%}else{%>
      <td>秘密</td>
      <%}%>
    </tr>
   </table>
<button type="button" onclick="history.back()">戻る</button>
</body>
</html>