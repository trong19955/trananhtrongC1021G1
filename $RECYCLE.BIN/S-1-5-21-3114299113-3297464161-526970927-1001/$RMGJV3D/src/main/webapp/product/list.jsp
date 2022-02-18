<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/11/2022
  Time: 1:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<h1>Customers</h1>
<p>
    <a href="/products?action=create">Create new product</a>
</p>
<table border="1">
    <tr>
        <td>Tên sản phẩm</td>
        <td>Giá Sản phẩm</td>
        <td>Trạng Thái Sản phẩm</td>
        <td>Nơi Sản xuất</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items='${requestScope["products"]}' var="product">
        <tr>
            <td><a href="/products?action=view&id=${product.getId()}">${product.getNameProduct()}</a></td>
            <td>${product.getPriceProduct()}</td>
            <td>${product.getDescriptionOfTheProduct()}</td>
            <td>${product.getProducer()}</td>
            <td><a href="/products?action=edit&id=${product.getId()}">edit</a></td>
            <td><a href="/products?action=delete&id=${product.getId()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
