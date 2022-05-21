<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2022/5/21
  Time: 5:52 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>被下载的文件名</td>
    </tr>
    <!--遍历 model中的 files-->
    <c:forEach items="${files}" var="filename">
        <tr>
            <td>
                <a href="${pageContext.request.contextPath }/down?filename=${filename}">${filename}</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
