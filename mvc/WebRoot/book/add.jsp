<%--
  User: mingfei.net@gmail.com
  Date: 13-11-25
  Time: 上午11:14
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>book add page</title>
    <script src="../ueditor/ueditor.config.js"></script>
    <script src="../ueditor/ueditor.all.js"></script>
</head>
<body>
    <h1>book add page</h1>
    <form action="add" method="post">
        TITLE:<input name="title" value=" 编程"><br>
        AUTHOR:<input name="author" value="李四"><br>
        DATE:<input name="date" value="2013-11-25"><br>
        PRICE:<input name="price" value="123.45"><br>
        AMOUNT:<input name="amount" value="123"><br>
        PICTURE:<input type="file" name="picture"><br>
        DESCRIPTION:
        <textarea name="description" id="ueditor"></textarea><br>
        <script>
            var editor=new UE.ui.Editor();
			editor.render("ueditor");
            /* UE.getEditor('ueditor'); */
        </script>
        <input type="submit" value="add">
    </form>
</body>
</html>