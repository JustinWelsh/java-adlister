<%--
  Created by IntelliJ IDEA.
  User: justinwelsh
  Date: 7/15/22
  Time: 2:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Color</title>
</head>
<body>
<form method="POST" action="pickcolor">

    <label for="color-select">Input a color you want to change the background to.</label>
    <br>
    <input id="color-select" name="color-select" type="text">
    <br>

    <input type="submit">
</form>
</body>
</html>
