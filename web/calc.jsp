<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Servlet Calculator</title></head>
<body>
<h2 align="center">계산기</h2>
<hr>
<center>
    <form name="f1" action=./calc method=post>
        <input type="text" name=num1 width="12" size="10"> <select name="operator">
        <option selected>+</option>
        <option>-</option>
        <option>*</option>
        <option>/</option>
    </select> <input type="text" name=num2 width="12" size="10"> <input type="submit" value="계산" name="B1"> <input
            type="reset" value="다시 입력" name="B2">
    </form>
</center>
</body>
</html>