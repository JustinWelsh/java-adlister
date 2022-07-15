<%--
  Created by IntelliJ IDEA.
  User: justinwelsh
  Date: 7/15/22
  Time: 11:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Form</title>
</head>
<body>
<form method="POST" action="/pizza-order">

    <label for="crust-type">Crust</label>
    <select name="crust-type" id="crust-type">
        <option value="Original">Original Crust</option>
        <option value="Thin">Thin Crust</option>
        <option value="Stuffed">Stuffed Crust</option>
    </select>
    <br>

    <label for="sauce-type">Sauce</label>
    <select name="sauce-type" id="sauce-type">
        <option value="Sauce 1">1</option>
        <option value="Sauce 2">2</option>
        <option value="Sauce 3">3</option>
    </select>
    <br>

    <label for="size-type">Size</label>
    <select name="size-type" id="size-type">
        <option value="Small">Small</option>
        <option value="Medium">Medium</option>
        <option value="Large">Large</option>
    </select>
    <br>

    <input type="submit">
</form>
</body>
</html>
