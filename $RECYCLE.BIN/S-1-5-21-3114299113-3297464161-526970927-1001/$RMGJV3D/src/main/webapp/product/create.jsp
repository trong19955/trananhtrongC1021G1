<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/11/2022
  Time: 11:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create new product</title>
    <style>
        .message {
            color: green;
        }
    </style>
</head>
<body>
<h1>Create new product</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
   <a href="/products">Back to product list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Product information</legend>
        <table>
            <tr>
                <td> Name product: </td>
                <td><input type="text" name="name" id="name"></td>
            </tr>
            <tr>
                <td> Price product: </td>
                <td><input type="text" name="price" id="price"></td>
            </tr>
            <tr>
                <td> Description Of The Product: </td>
                <td><input type="text" name="description" id="description"></td>
            </tr>
            <tr>
                <td> Producer: </td>
                <td><input type="text" name="producer" id="producer"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Create customer"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
