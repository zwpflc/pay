<%--
  User: mingfei.net@gmail.com
  Date: 13-11-25
  Time: 上午8:24
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <meta charset="utf-8">
        <title>index page</title>
        </head>
    <body>
        <h1>index page</h1>
        <form action="login" method="post">
            username: <input name="username" value="张三"><br>
            password: <input type="password" name="password" value="123"><br>
            <input type="submit" value="login">
        </form>
        <p>${requestScope.message}</p>
        <p><a href="user/signup.jsp">sign up</a></p>
    </body>
</html>