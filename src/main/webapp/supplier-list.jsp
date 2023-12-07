<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Supplier Management Application</title>
    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
</head>
<body>

<header>
    <nav class="navbar navbar-expand-md navbar-dark"
         style="background-color: blue">
        <div>
            <a href="https://www.xadmin.net" class="navbar-brand"> Supplier
                Management Application </a>
        </div>

        <ul class="navbar-nav">
            <li><a href="<%=request.getContextPath()%>/SupplierServlet"
                   class="nav-link">Suppliers</a></li>
        </ul>
    </nav>
</header>
<br>

<div class="row">
    <!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

    <div class="container">
        <h3 class="text-center">List of Suppliers</h3>
        <hr>
        <div class="container text-left">

            <a href="<%=request.getContextPath()%>/supplier-form.jsp" class="btn btn-success">Add
                New Supplier</a>
        </div>
        <br>
        <table class="table table-bordered">
            <thead>
            <tr>
                <th>ID</th>
                <th>Company Name</th>
                <th>Contact Name</th>
                <th>Country</th>
                <th>Actions</th>
            </tr>
            </thead>
            <tbody>

            <c:forEach var="supplier" items="${supplierList}">
                <tr>
                    <td><c:out value="${supplier.supplierID}"></c:out></td>
                    <td><c:out value="${supplier.companyName}"></c:out></td>
                    <td><c:out value="${supplier.contactName}"></c:out></td>
                    <td><c:out value="${supplier.country}"></c:out></td>
                    <td><a href="editSupplier?supplierID=<c:out value='${supplier.supplierID}' />">Edit</a>
                        &nbsp;&nbsp;&nbsp;&nbsp; <a
                            href="deleteSupplier?supplierID=<c:out value='${supplier.supplierID}' />">Delete</a></td>
                </tr>
            </c:forEach>

            </tbody>

        </table>
    </div>
</div>
</body>
</html>