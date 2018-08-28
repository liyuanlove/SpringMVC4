<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>Starting Page</title>
    <base href="<%=basePath%>">
</head>
<body>
<!--路径叠加问题解决方案二：加上base标签-->
<!--base标签会自动在当前页面的不以/开头的路径前加上basePath路径，使其变为绝对路径-->
<a href="test/hello.do">我是一个表单提交按钮</a>
</body>
</html>