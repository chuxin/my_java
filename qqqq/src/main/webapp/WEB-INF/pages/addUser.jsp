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
    <fm:form method="post" modelAttribute="user" action="${pageContext.request.contextPath}/showuser">
        用户名：<fm:input path="name" /> <br />
        年龄：<fm:input path="age" /> <br />
        身高：<fm:input path="height" /> <br />
        <input type="submit" value="保存" />
    </fm:form>
</body>
</html>
