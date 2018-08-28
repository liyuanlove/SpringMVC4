<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>
<!--
    param.age的底层执行的是request.getParameter("age");
    requestScope.age的底层执行的是request.getAttribute("age");
-->
name = ${param.pname}<br>
age = ${param.page}<br>
</body>
</html>