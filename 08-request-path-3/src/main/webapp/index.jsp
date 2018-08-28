<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Starting Page</title>
</head>
<body>
<!--http://127.0.0.1:8080/08-request-path-3/test/test/hello.do-->
<!--<a href="test/hello.do">我是一个表单提交按钮</a>-->

<!--路径叠加问题解决方案一：加上/项目名称-->
<!--<a href="/08-request-path-3/test/hello.do">我是一个表单提交按钮</a>-->
<a href="${pageContext.request.contextPath }/test/hello.do">我是一个表单提交按钮</a>
</body>
</html>