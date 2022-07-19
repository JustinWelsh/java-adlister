<%--
  Created by IntelliJ IDEA.
  User: justinwelsh
  Date: 7/15/22
  Time: 2:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>View Color</title>
    <style>
        body {
            background: ${param.color}
        }
    </style>
</head>
<body>
<%--<p>You Chose: <%=request.getParameter("color-select")%></p>--%>

<p>You Chose: ${param.color}</p>


</body>
</html>


<%--INSTRUCTOR SOLUTION--%>

<%--
    <html>
    <head>
        <title>View Color</title>
        <style>
            body {
                background: ${param.color}
            }
        </style>
    </head>
    <body>
    <h1>Here's the color</h1>
    </body>
    </html>
--%>