<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Starting Page</title>
</head>
<body>
<form action="test/upload.do" method="post" enctype="multipart/form-data">
    文件1：<input type="file" name="img"/><br>
    文件2：<input type="file" name="img"/><br>
    文件3：<input type="file" name="img"/><br>
    <input type="submit" name="上传"/><br>
</form>
</body>
</html>