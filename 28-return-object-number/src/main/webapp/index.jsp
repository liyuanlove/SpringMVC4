<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Starting Page</title>
</head>
<script type="text/javascript" src="js/jquery-3.3.1.js"></script>
<script type="text/javascript">
    $(function () {
        $("button").click(function () {
            $.ajax({
                url: "test/myAjax.do",
                success: function (data) {
                    alert(data);
                }
            });
        });
    });
</script>
<body>
<button>提交Ajax请求</button>
</body>
</html>