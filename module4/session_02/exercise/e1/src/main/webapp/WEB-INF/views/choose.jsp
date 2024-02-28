<%--
  Created by IntelliJ IDEA.
  User: 0409k
  Date: 2/21/2024
  Time: 6:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Sandwich Condiments</h1>
<form action="/sandwich" method="post">
    <table>
        <tr>
            <td><input type="checkbox" name="condiment" value="Lettuce"></td>
            <td>Lettuce</td>
        </tr>
        <tr>
            <td><input type="checkbox" name="condiment" value="Tomato"></td>
            <td>Tomato</td>
        </tr>
        <tr>
            <td><input type="checkbox" name="condiment" value="Mustard"></td>
            <td>Mustard</td>
        </tr>
        <tr>
            <td><input type="checkbox" name="condiment" value="Sprouts"></td>
            <td>Sprouts</td>
        </tr>
        <tr>
            <td colspan="2" style="text-align: center"><input type="submit" value="SAVE"></td>
        </tr>
    </table>
</form>
</body>
</html>
