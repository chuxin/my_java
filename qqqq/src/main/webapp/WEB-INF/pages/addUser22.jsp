<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>添加用户</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/validate" method="post">
    用户id：<input type="text" name="id" />
    <br>
    用户名：<input type="text" name="name" />
    <br>
    邮箱：<input type="text" name="email" />
    <br>
    <input type="submit" value="提交" />
</form>
</body>
</html>