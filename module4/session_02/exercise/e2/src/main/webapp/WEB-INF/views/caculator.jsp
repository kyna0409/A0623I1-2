<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="/caculators" method="post">
    <table>
        <tr>
            <td colspan="4" style="text-align: center">CACULATOR</td>
        </tr>
        <tr>
            <td colspan="2"><input type="number" name="numberOne"></td>
            <td colspan="2"><input type="number" name="numberTwo"></td>
        </tr>
        <tr>
            <td><button type="submit"  name="operator" value="+">Addition(+)</button></td>
            <td><button type="submit"  name="operator" value="-">Subtraction(-)</button></td>
            <td><button type="submit"  name="operator" value="*">Multiplication(*)</button></td>
            <td><button type="submit"  name="operator" value="/">Division(/)</button></td>
<%--            <td><input type="submit" value="Addition(+)" name="operator"></td>--%>
<%--            <td><input type="submit" value="Subtraction(-)" name="operator"></td>--%>
<%--            <td><input type="submit" value="Multiplication(*)" name="operator"></td>--%>
<%--            <td><input type="submit" value="Division(/)" name="operator"></td>--%>
        </tr>
    </table>
</form>
<h3>Result :</h3> <p> ${message}</p>
</body>
</html>