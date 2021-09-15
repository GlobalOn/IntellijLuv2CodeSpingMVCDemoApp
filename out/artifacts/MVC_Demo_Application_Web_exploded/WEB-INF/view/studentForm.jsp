<%--
  Created by IntelliJ IDEA.
  User: Jury
  Date: 11.09.2021
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>

<form:form action="processForm" modelAttribute="student">

    First name: <form:input path="firsName"/>
    <br><br>

    Last name: <form:input path="lastName"/>
    <br><br>

    Country:
    <form:select path="country">
        <form:options items="${student.countryOptions}"/>
    </form:select>
    <br><br>

    Favourite language:
    <form:radiobuttons path="programLanguage"
                       items="${student.programLanguageOptions}"/>
    <br><br>

    Operating system:
    Linux <form:checkbox path="operationSystems" value="Linux"/>
    Windows <form:checkbox path="operationSystems" value="Windows"/>
    Mac OS <form:checkbox path="operationSystems" value="Mac OS"/>
    Open OS <form:checkbox path="operationSystems" value="Open OS"/>
    <br><br>

    <input type="submit" value="Submit"/>
</form:form>

</body>
</html>
