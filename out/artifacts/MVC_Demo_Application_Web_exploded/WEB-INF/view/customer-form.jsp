<%--
  Created by IntelliJ IDEA.
  User: Jury
  Date: 15.09.2021
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer registration form</title>

    <style>
        .error{color: red}
    </style>

    <style>
        .yearsError{color: #0eff0b}
    </style>

</head>

<body>
<form:form action="processForm" modelAttribute="customer">

    First name: <form:input path="firstName"/>
    <br><br>

    Last name: <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>
    <br><br>

    Years being customer of this shop:
    <form:input path="yearsInThisShop"/>
    <form:errors path="yearsInThisShop" cssClass="yearsError"/>
    <br><br>

    Post code:
    <form:input path="postCode"/>
    <form:errors path="postCode" cssClass="error"/>
    <br><br>

    Course code:
    <form:input path="courseCode"/>
    <form:errors path="courseCode" cssClass="error"/>
    <br><br>

    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>
