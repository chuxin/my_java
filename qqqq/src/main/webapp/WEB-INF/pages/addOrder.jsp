<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2022/5/18
  Time: 9:09 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/formatter" modelAttribute="order" method="post">
    用户名：<input type="text" name="name" />
    <br>
    年龄：<input type="text" name="age" />
    <br>
    身高：<input type="text" name="height" />
    <br>
    创建日期：<input type="text" name="createDate" />
    <br>
    <input type="submit" value="提交" />
</form>
</body>
</html>
