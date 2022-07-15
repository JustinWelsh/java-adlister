


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <%--This allows us to use the JSTL tags/ requirement 2 of 2 as per curriculum --%>

<%--
  Created by IntelliJ IDEA.
  User: justinwelsh
  Date: 7/14/22
  Time: 10:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%-- SOLUTION #2 --%>
<%--
            <%
                if(request.getParameter("username") != null || request.getParameter("password") != null) {
                    if(request.getParameter("username").equals("admin") && request.getParameter("password").equals("password")) {
                        response.sendRedirect("/profile.jsp");
                    } else {
                        response.sendRedirect("/login.jsp");
                    }
                }
            %>
--%>

<html>
<head>
    <title>Login Form</title>
</head>
<body>
<%-- TODO #1: Build A Login Form --%>
<form method="POST" action="login.jsp">

    <label for="username">Username</label>
    <input id="username" name="username" type="text">
    <br>

    <label for="password">Password</label>
    <input id="password" name="password" type="password">
    <br>

    <input type="submit">
</form>

<%--TODO: write some code to check the submmitted values.
If the username submitted is "admin", and the password is "password",
        redirect the user to the profile page;
        otherwise, redirect back to the login form.--%>

<%--SOLUTION--%>
<%--
<c:if test='${param.username != null && param.password != null}'>
    <c:choose>
        <c:when test="${param.username.equals(\"admin\") && param.password.equals(\"password\")}">
            <% response.sendRedirect("/profile.jsp"); %>
        </c:when>
        <c:otherwise>
            <% response.sendRedirect("/login.jsp"); %>
        </c:otherwise>
    </c:choose>
</c:if>
--%>



<%--SOLUTION W/NOTES--%>

            <c:if test='${param.username != null && param.password != null}'> <%-- This check is for if the user submits form without any input. --%>
                <c:choose> <%-- choose tag is similar to an if-else block --%>

                    <c:when test="${param.username.equals(\"admin\") && param.password.equals(\"password\")}">
                        <% response.sendRedirect("/profile.jsp"); %>
                    </c:when>

                    <c:otherwise>
                        <% response.sendRedirect("/login.jsp"); %>
                    </c:otherwise>

                </c:choose>
            </c:if>

</body>
</html>
