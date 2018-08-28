<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Starting Page</title>
</head>
<body>
<form action="register.do" method="post">
    姓名：<input type="text" name="name"/>${nameErrorMessage}<br>
    成绩：<input type="text" name="score"/>${scoreErrorMessage}<br>
    电话：<input type="text" name="mobile"/>${mobileErrorMessage}<br>
    <input type="submit" name="注册"/><br>
</form>
</body>
</html>