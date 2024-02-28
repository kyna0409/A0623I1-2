<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="/translate" method="post">
    <table>
        <tr>
            <td colspan="2" style="text-align: center"><h1>TRANSLATE WORD</h1></td>
        </tr>
        <tr>
            <td><h3>Word </h3></td>
            <td><input type="text" name="tr"></td>
        </tr>
        <tr>
            <td colspan="2" style="text-align: center"><input type="submit" value="TRANSLATE" name="word"></td>
        </tr>
    </table>
</form>
<h1>RESULT :</h1> <p>${tr}</p>
</body>
</html>