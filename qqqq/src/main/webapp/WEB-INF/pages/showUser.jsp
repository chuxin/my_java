<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2022/5/18
  Time: 2:53 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="fm" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    使用EL表达式取出model中的user信息<br />
    您创建的用户如下：<br />
        用户名：${user.name}<br />
        年龄：${user.age}<br />
        身高：${user.height}<br />
</body>
</html>
