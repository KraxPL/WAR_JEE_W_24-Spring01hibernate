<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Book edit</title>
</head>
<body>
<form:form method="post" modelAttribute="book">

    Title: <form:input path="title"/><form:errors path="title" cssClass="error"/>
    Description: <form:input path="description"/><form:errors path="description" cssClass="error"/>
    Rating: <form:input path="rating" type="number" min="1" max="10"/><form:errors path="rating" cssClass="error"/>
    Publisher: <form:select path="publisher.id" items="${publishers}" itemLabel="name" itemValue="id"/><form:errors path="publisher" cssClass="error"/>
    Authors: <form:select path="authors" items="${authors}" itemLabel="fullName" itemValue="id" multiple="true"/><form:errors path="authors" cssClass="error"/>
    Pages: <form:input path="pages" type="number" min="1"/><form:errors path="pages" cssClass="error"/>
    <form:hidden path="id"/>
    Category: <form:select path="category.id" items="${categories}" itemLabel="name" itemValue="id"/><form:errors path="category" cssClass="error"/>
    <input type="submit" value="Update book">
</form:form>
</body>
</html>
