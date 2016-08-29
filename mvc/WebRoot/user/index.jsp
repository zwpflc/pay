<%--
  User: mingfei.net@gmail.com
  Date: 13-11-25
  Time: 上午9:12
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>user index page</title>
</head>
<body>
    <h1>user index page</h1>
    <p>${sessionScope.user.username}</p>
    <p><a href="logout">logout</a></p>
    <p><a href="../book/add.jsp">add book</a></p>
    <p><a href="../book/list">list book</a></p>
</body>
</html>