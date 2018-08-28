<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Starting Page</title>
</head>
<body>
<form action="register.do" method="post">
    年龄：<input type="text" name="age" value="${age}"/><br>
    生日：<input type="text" name="birthday" value="${birthday}"/><br>
    <input type="submit" name="注册"/><br>
</form>
</body>
</html>