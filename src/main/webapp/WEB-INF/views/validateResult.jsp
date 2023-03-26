<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Validate Result</title>
</head>
<body>
<table>
    <tr>
        <th>Nazwa Pola</th>
        <th>Nazwa błędu</th>
    </tr>
    <c:forEach var="error" items="${Errors}">
    <tr>
        <td>${error.propertyPath}</td>
        <td>${error.message}</td>
    <tr>
        </c:forEach>
</table>
</body>
</html>
