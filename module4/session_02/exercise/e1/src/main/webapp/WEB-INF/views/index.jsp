<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="/convert" method="post">
    <table>
        <tr>
            <td colspan="3" style="text-align: center"><h1>COVERT COIN</h1></td>
        </tr>
        <tr>
            <td><h3>So tien </h3></td>
            <td><input type="text"></td>
            <td><h3>VND</h3></td>
        </tr>
        <tr>
            <td colspan="3" style="text-align: center"><input type="submit" value="CONVERT" name="so_tien"></td>
        </tr>
    </table>
</form>
<h1>RESULT :</h1> <p>${con}</p>
</body>
</html>