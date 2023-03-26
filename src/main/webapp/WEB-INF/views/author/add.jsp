<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Author</title>
</head>
<body>
<form:form method="post" modelAttribute="author">
  First Name: <form:input path="firstName"/><form:errors path="firstName"/>
  Last Name: <form:input path="lastName"/><form:errors path="lastName"/>
  Pesel: <form:input path="pesel"/><form:errors path="pesel"/>
  Email: <form:input path="email"/><form:errors path="email"/>
  <form:hidden path="id"/>
  <input type="submit">
</form:form>
</body>
</html>
