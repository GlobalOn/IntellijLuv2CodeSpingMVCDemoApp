<%@ taglib prefix="form" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: Jury
  Date: 15.09.2021
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello, new Dear customer!</title>
</head>
<body>
The customer is confirmed: ${customer.firstName} ${customer.lastName}!
<br>
${customer.firstName} already customer of this shop ${customer.yearsInThisShop} years!
<br><br>
The post code of the customer: ${customer.postCode}

<br><br>
The COURSE CODE of the customer: ${customer.courseCode}
</body>
</html>
