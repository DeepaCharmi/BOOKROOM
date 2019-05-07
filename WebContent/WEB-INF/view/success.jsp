<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.stm.Model.Book" %>
    <%@page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
List<Book> rooms=(List<Book>) request.getAttribute("books");
%>
<table>
<tr><th>id</th><th>roomno</th><th>name</th><th>mobileno</th></tr>
<% for(Book t:rooms){%>
<tr><td><%=t.getId()%></td>
<td><%= t.getRoomno() %></td>
<td><%= t.getGname()%></td>
<td><%= t.getMobno()%></td>
<td><a href="http://localhost:8089/SimpleProject/deleteuser?id=<%=t.getId() %>"><button name="id" value="<%=t.getId()%>">delete</button></a></td>
</tr>
<% } %></table>
</body>
</html>