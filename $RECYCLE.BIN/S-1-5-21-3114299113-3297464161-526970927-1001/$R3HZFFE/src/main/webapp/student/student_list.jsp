<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/26/2022
  Time: 3:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>
    List Student
</h2>
<table>
    <tr>
        <th>codeStudent</th>
        <th>nameStudent</th>
        <th>Birthday</th>
        <th>Email</th>
        <th>Point</th>
    </tr>
    <c:forEach var="student" items="$(list)">
        <tr>
            <td><c:out value="${student.codeStudent}"></c:out></td>
            <td>${student.nameStudent}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
