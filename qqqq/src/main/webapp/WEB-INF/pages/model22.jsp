<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2022/5/22
  Time: 9:33 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fm" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<fm:form method="post" modelAttribute="user_xx" action="${pageContext.request.contextPath}/hello/saveUser">
    用户名：<fm:input path="name" /> <br />
    年龄：<fm:input path="age" /> <br />
    密码：<fm:input path="pwd" /> <br />
    <input type="submit" value="保存" />
</fm:form>
</body>
</html>
