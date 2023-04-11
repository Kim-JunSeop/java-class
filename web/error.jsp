<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSP 오류페이지</title>
</head>
<body>
<c:catch var="exception">
    <%-- 내용 --%>
    <h2>잘못된 요청입니다.</h2>
    오류 타입: ${exception.class.name}
    <br>
    오류 메시지: ${exception.message}
    <br>
    <a href="addlist.jsp">이전으로</a>
</c:catch>
<c:if test="${not empty exception}">
    <h2>오류가 발생했습니다.</h2>
    오류 타입: ${exception.class.name}
    <br>
    오류 메시지: ${exception.message}
    <br>
    <a href="addlist.jsp">이전으로...</a>
</c:if>
</body>
</html>