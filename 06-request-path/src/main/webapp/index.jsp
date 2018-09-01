<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Starting Page</title>
</head>
<body>
<!--
    这个路径出现在jsp页面中，所以是前台路径，而前台路径的参照路径是：当前Web服务器的根路径
    当前Web应用的根路径是：http://127.0.0.1:8080
    现在要求的绝对路径 = 参照路径 + 相对路径，即http://127.0.0.1:8080/06-request-path/hello.do
-->
<!--<a href="/hello.do">跳转到Welcome页面</a>--><!--这种写法错误-->
<!--<a href="/06-request-path/hello.do">跳转到Welcome页面</a>--><!--这种写法正确，但不推荐-->

<!--
    这个路径没有以/开头，所以其参照路径是当前的访问路径
    当前访问路径是http://127.0.0.1:8080/06-request-path/
    现在要求的绝对路径 = 参照路径 + 相对路径，即http://127.0.0.1:8080/06-request-path/hello.do
-->
<a href="hello.do">跳转到Welcome Page</a>
</body>
</html>