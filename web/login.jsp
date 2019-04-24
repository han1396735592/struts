<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>login page</title>
</head>
<body>
<br><br><br>

<center>
    <s:form action="" method="POST">
        <s:text name="un"></s:text>
        <s:textfield name="user.username" size="29" key="un"></s:textfield>
        <s:text name="up"></s:text>
        <s:password name="user.password" size="30" key="up"></s:password>
        <s:submit value="登录"></s:submit>
    </s:form>
</center>

</body>
</html>