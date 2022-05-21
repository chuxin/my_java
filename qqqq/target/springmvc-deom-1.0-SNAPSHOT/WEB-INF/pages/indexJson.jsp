<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>测试JSON交互</title>
    <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
</head>
<body>
<form action="">
    用户名：<input type="text" name="name" id="name" />
    <br>
    密码：<input type="password" name="password" id="password" />
    <br>
    年龄：<input type="text" name="age" id="age">
    <br>
    <input type="button" value="测试" onclick="testJson()" />
</form>
</body>
<script type="text/javaScript">
    function testJson() {
        var name = $("#name").val();
        var password = $("#password").val();
        var age = $("#age").val();
        $.ajax({
            url : "${pageContext.request.contextPath}/testJson",
            type : "post",
            data : JSON.stringify({
                name : name,
                password : password,
                age : age
            }), // 定义发送请求的数据格式为JSON字符串
            contentType : "application/json;charset=utf-8",
            // 定义回调响应的数据格式为JSON字符串，该属性可以省略
            dataType : "json",
            success : function(data) {
                if (data != null) {
                    alert("输入的用户名：" + data.name + "，密码：" + data.password
                            + "， 年龄：" + data.age);
                }
            }
        });
    }
</script>
</body>
</html>