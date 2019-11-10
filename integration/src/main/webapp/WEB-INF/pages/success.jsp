<%--
  Created by IntelliJ IDEA.
  User: MACHENIKE
  Date: 2019-10-22
  Time: 22:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>查询成功了</h2>
    <c:forEach items="${userAccount}" var="i">
        ${i.name} → ${i.money} <br>
    </c:forEach>
</body>
</html>
