<%--
  Created by IntelliJ IDEA.
  User: justinwelsh
  Date: 7/19/22
  Time: 8:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guessing Game</title>
</head>
<body>
<h1>Welcome to the Guessing game!</h1>
    <form method="post" action="guess">
        <p>Guess a number between 1-3</p>
        <input type="radio" name="guess_num" value="1">1<br>
        <input type="radio" name="guess_num" value="2">2<br>
        <input type="radio" name="guess_num" value="3">3<br><br>

        <input type="submit" name="guess">
    </form>
</body>
</html>

<%--INSTRUCTOR SOLUTION--%>
<%--<html>
<head>
    <title>Guessing Game</title>
</head>
<body>
<form action="guess" method="post">
    <button name="guess" value="1">1</button>
    <button name="guess" value="2">2</button>
    <button name="guess" value="3">3</button>
</form>
</body>
</html>--%>