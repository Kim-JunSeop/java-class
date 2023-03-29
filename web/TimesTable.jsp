<%@ page language="java" contentType="text/html; charset=EUC-KR"
         pageEncoding="EUC-KR" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
    <title>구구단</title>
</head>
<body>
<h1>구구단</h1>
<table border=1 cellpadding=0 cellspacing=2 width=500>
    <%
        for (int i = 0; i < 10; i++) {
    %>
    <tr align=center>
        <%
            for (int j = 1; j < 10; j++) {
        %>
        <%
            if (i == 0 && j == 1) {
        %>
        <td align=center></td>
        <%
        } else if (i == 0) {
        %>
        <td table=><%= j + "" %>
        </td>
        <%
        } else if (j == 1) {
        %>
        <td width=700 align=center><%= i %>
        </td>
        <%
        } else {
        %>
        <td align=center td height="40px"><%= j + "X" + i + "=" + j * i %>
        </td>
        <%
            }%>
        <%
            }
        %>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
