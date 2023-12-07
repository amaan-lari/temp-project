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
            <a href="https://www.xadmin.net" class="navbar-brand"> Supplier Management Application </a>
        </div>

        <ul class="navbar-nav">
            <li><a href="<%=request.getContextPath()%>/listSuppliers"
                   class="nav-link">Suppliers</a></li>
        </ul>
    </nav>
</header>
<br>
<div class="container col-md-5">
    <div class="card">
        <div class="card-body">
			<form action="${pageContext.request.contextPath}/supplier-form" method="post">
            <caption>
                <h2>Add New Supplier</h2>
            </caption>
            
			<input type="hidden" name="supplierID" value="<c:out value='${supplier.supplierID}' />" />

            <fieldset class="form-group">
                <label>Company Name</label>
                <input type="text" class="form-control" name="companyName" required="required">
            </fieldset>

            <fieldset class="form-group">
                <label>Contact Name</label>
                <input type="text" class="form-control" name="contactName" required="required">
            </fieldset>

            <fieldset class="form-group">
                <label>Address</label>
                <input type="text" class="form-control" name="address" required="required">
            </fieldset>

            <fieldset class="form-group">
                <label>City</label>
                <input type="text" class="form-control"
                       name="city" required="required">
            </fieldset>

            <fieldset class="form-group">
                <label>Region</label>
                <input type="text" class="form-control"
                       name="region">
            </fieldset>

            <fieldset class="form-group">
                <label>Postal Code</label>
                <input type="text" class="form-control"
                       name="postalCode" required="required">
            </fieldset>

            <fieldset class="form-group">
                <label>Country</label>
                <input type="text" class="form-control"
                       name="country" required="required">
            </fieldset>

            <fieldset class="form-group">
                <label>Phone</label>
                <input type="text" class="form-control"
                       name="phone" required="required">
            </fieldset>

            <button type="submit" class="btn btn-success">Save</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>