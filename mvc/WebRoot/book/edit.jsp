<%@ page import="entity.Book" %>
<%--
  User: mingfei.net@gmail.com
  Date: 13-11-25
  Time: 下午2:32
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <meta charset="utf-8">
    <title>book edit page</title>
    <script src="../ueditor/ueditor.config.js"></script>
    <script src="../ueditor/ueditor.all.js"></script>
</head>
<body>
    <h1>book edit page</h1>
    <form action="modify" method="post">
        <input type="hidden" name="id" value="${sessionScope.book.id}">
        TITLE:<input name="title" value="${sessionScope.book.title}"><br>
        AUTHOR:<input name="author" value="${sessionScope.book.author}"><br>
        DATE:<input name="date" value='<fmt:formatDate value="${sessionScope.book.date}" pattern="yyyy-MM-dd" />'><br>
        PRICE:<input name="price" value="${sessionScope.book.price}"><br>
        AMOUNT:<input name="amount" value="${sessionScope.book.amount}"><br>
        PICTURE:<input type="file" name="picture"><br>
        DESCRIPTION:
        <script type="text/plain" id="ueditor" name="description">
            ${sessionScope.book.description}
        </script>
        <script>
            UE.getEditor('ueditor');
        </script>
        <input type="submit" value="update">
    </form>
</body>
</html>