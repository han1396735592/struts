<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>添加书籍</title>
</head>
<body>
<div style="text-align: center;margin: 40px auto;width: 80%">
    <h3>添加书籍</h3>
    <form action="book/add_bma" method="post">
        图书名：<input type="text" size="30" name="book.bookName"><br>
        SN编号:<input type="text" size="30" name="book.bookSN"><br>
        图书作者:<input type="text" size="30" name="book.bookAuthor"><br>
        图书价格:<input type="text" name="book.bookPrice"><br>
        <input type="submit" value="添加"><br>
    </form>
</div>
</body>
</html>