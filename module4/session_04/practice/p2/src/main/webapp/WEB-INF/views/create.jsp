<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: 0409k
  Date: 2/23/2024
  Time: 8:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--@elvariable id="user" type=""--%>
<form:form modelAttribute="user" action="/create-user" method="post">
    Name: <form:input path="name"/><br>
    Gender: <form:radiobuttons path="gender" items="${gendersArray}"/><br>
    Is Admin:<form:checkbox path="admin"/> <br>
    Hobbies: <form:checkboxes path="hobbies" items="${hobbiesArray}"/><br>
    Type: <form:select path="country" items="${countriesArray}"/><br>
    <button type="submit">Create User</button>
</form:form>
</body>
</html>
