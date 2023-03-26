<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>도서 정보</title></head>
<body>
<h2>신규 도서 등록</h2>
<form name="f1" action=./week3/BookServlet method=post>
    <p>도서번호 <input type="text" name=id width="12" size="10"></p><br>
    <p>도서이름 <input type="text" name=name width="12" size="10"></p><br>
    <p>출판사 <input type="text" name=publish width="12" size="10"></p><br>
    <p>가격 <input type="text" name=price width="12" size="10"></p><br>
    <input type="submit" value="제출" name="B1"> <input type="reset" value="다시 입력" name="B2"></form>
</body>
</html>