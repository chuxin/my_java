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
您创建的用户信息如下：
<br />
<!-- 使用EL表达式取出model中的user信息 -->
用户名：${order.name }
<br />
年龄：${order.age }
<br />
身高：${order.height }
<br />
创建日期：${order.createDate }
</body>
</html>
