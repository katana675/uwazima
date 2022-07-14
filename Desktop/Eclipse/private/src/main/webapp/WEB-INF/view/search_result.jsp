<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
検索結果
<%/* int[] user_id=new int[]{request.getAttribute */ %>
<%-- <%user_id[] = (int[])request.getAttribute("tel_userid");%> --%>
<%-- <%= request.getAttribute("tel_userid")%>

<%= request.getAttribute("tel_name") %> 
<%= request.getAttribute("tel_mailaddress") %> 
<%= request.getAttribute("tel_gender") %>  --%>
<%=request.getAttribute("tel_userid") %>
<%=request.getAttribute("tel_name") %>
<%=request.getAttribute("tel_mailaddress") %>
<%=request.getAttribute("tel_tel") %>
<%=request.getAttribute("tel_gender") %>
<%=int[] search_id=new int[10];%>
<%String[] search_name=new String[10]; %>
<%String[] search_mail = new String[10]; %>
<%String[] search_tel = new String[10];%>
<%int[] search_gender = new int[10]; %>
<%for(int i=0; i<10; i++){
	
	
	
}	
	%>

<button type="button" onclick="history.back()">戻る</button>
</body>
</html>