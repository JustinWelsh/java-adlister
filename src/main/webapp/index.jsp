<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><%= "index file" %></title>
</head>
<body>
    <c:if test="true">
        <h1>Variable names should be very descriptive</h1>
        <p>Add '/login.jsp' to the end of the URL above.</p>
    </c:if>
    <c:if test="false">
        <h1>single letter variable names are good</h1>
    </c:if>
</body>
</html>
