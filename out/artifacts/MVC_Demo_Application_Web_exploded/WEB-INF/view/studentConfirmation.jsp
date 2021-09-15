
<%--
  Created by IntelliJ IDEA.
  User: Jury
  Date: 11.09.2021
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student confirmation</title>
</head>
<body>

The student is confirmed: ${student.firsName} ${student.lastName}
<br><br>
Country: ${student.country}
<br><br>
Favourite language: ${student.programLanguage}
<br><br>
Operating systems that ${student.firsName} knows:
<ul>
    <c:forEach var="temp" items="${student.operationSystems}">
        <li> ${temp} </li>
    </c:forEach>
</ul>

</body>
</html>
