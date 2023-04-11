<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" errorPage="error.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>항목 추가</title>
</head>
<body>
<form method="post" action="showlist.jsp">
    <center>
    <h1>도서정보추가</h1>
    <div>도서번호 <input type="text" name="id"></div>
    <div>도서이름 <input type="text" name="name"></div>
    <div>출판사 <input type="text" name="publish"></div>
    <div>가격 <input type="text" name="price"></div>
    <input type="submit" value="추가" name="Button1">
   </center>
</form>
</body>
</html>