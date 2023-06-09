<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" errorPage="error.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<% request.setCharacterEncoding("UTF-8"); %>
<%
    int id = Integer.parseInt(request.getParameter("id"));
    String name = request.getParameter("name");
    String publish = request.getParameter("publish");
    int price = Integer.parseInt(request.getParameter("price"));
%>
<!DOCTYPE html>
<html>
<head>
    <%@ page import="week3.Book" %>
    <meta charset="UTF-8">
    <%
        Book book = new Book();
        book.createBook(id, name, publish, price);
    %>
    <title>도서정보</title>
</head>
<body>
<%
    book.idList.add(book.getId());
    book.nameList.add(book.getBookName());
    book.publishList.add(book.getPublish());
    book.priceList.add(book.getPrice());
%>
<h1>목록</h1>
<table border=1>
    <th>도서번호</th>
    <th>도서이름</th>
    <th>출판사</th>
    <th>가격</th>

    <% for(int i=0; i<book.idList.size(); i++) {%>
    <tr>
        <td><%=book.idList.get(i)%></td>
        <td><%=book.nameList.get(i)%></td>
        <td><%=book.publishList.get(i)%></td>
        <td><%=book.priceList.get(i)%></td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
