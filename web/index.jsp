<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<meta charset="UTF-8">
<head><title>계산기JSP</title></head>
<body><h2>계산기JSP</h2>
<hr>
<form method="post" action="calc.jsp"><input type="text" name="n1" size="10"><select name="op">
    <option>+</option>
    <option>-</option>
    <option>*</option>
    <option>/</option>
</select><input type="text" name="n2" size="10"><input type="submit" value="실행"></form>
</body>
</html>