<%-- 
    Document   : customer_table
    Created on : Apr 21, 2017, 6:34:37 PM
    Author     : Elliot Martinez
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="card">
    <div class="card-header" data-background-color="orange">
        <h4 class="title">Customer List</h4>
        <p class="category">Below is the complete list of
            customers for HDS.
        </p>
    </div>
    <div class="card-content table-responsive">
        <table class="table">
            <thead class="text-default">
                <th>ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Phone</th>
                <th>Email</th>
                <th class="text-left">Address</th>
            </thead>
            <tbody>
                <c:forEach var="customer" items="${requestScope.customers}">
                    <tr>
                        <td class="text-left">${customer.customerId}</td>
                        <td class="text-left">${customer.firstName}</td>
                        <td class="text-left">${customer.lastName}</td>
                        <td class="text-left">${customer.phone}</td>
                        <td class="text-left">${customer.email}</td>
                        <td class="text-left">${customer.street}</td> 
                    </tr>
                </c:forEach>
            </tbody>
        </table>

    </div>
</div>