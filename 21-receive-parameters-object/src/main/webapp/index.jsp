<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Starting Page</title>
</head>
<body>
<form action="test/register.do" method="post">
    <!--整体接收时，要求表单参数名与对象属性名相同-->
    姓名：<input type="text" name="name"/><br>
    年龄：<input type="text" name="age"/><br>
    <input type="submit" name="注册"/><br>
</form>
</body>
</html>