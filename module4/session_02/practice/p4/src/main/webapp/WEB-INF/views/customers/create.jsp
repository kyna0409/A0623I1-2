<%--
  Created by IntelliJ IDEA.
  User: 0409k
  Date: 2/21/2024
  Time: 12:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../css/create_update.css">
    <style>
        /*.valid-email {*/
        /*    border: 1px solid green;*/
        /*}*/

        .invalid-email {
            border: 1px solid red;
        }
    </style>
</head>
<body>
<div class="create">
    <h1>Creative Form</h1>
    <div class="content">
        <form  action="/customers/create" method="post">
            <table>
                <tr>
                    <td>
                        NAME :
                    </td>
                    <td>
                        <input type="text" name="name" required>
                    </td>
                </tr>
                <tr>
                    <td>
                        EMAIL:
                    </td>
                    <td>
                        <input type="email" name="email" required>
                    </td>
                </tr>
                <tr>
                    <td>
                        ADDRESS :
                    </td>
                    <td>
                        <input type="text" name="address" required>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" style="text-align: center"><input type="submit" value="SUBMIT"></td>
                </tr>
            </table>
        </form>
    </div>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="../script/validate.js"></script>
</body>
</html>

