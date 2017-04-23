<%-- 
    Document   : customer_table
    Created on : Apr 21, 2017, 6:34:37 PM
    Author     : Elliot Martinez
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="content">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-12">
                <div class="card">
                    <div class="card-header" data-background-color="orange">
                        <h4 class="title">Sales Records List</h4>
                        <p class="category">
                            Below is a complete list for HDS' sales records
                        </p>
                    </div>
                    <div class="card-content table-responsive">
                        <table class="table">
                            <thead class="text-default">
                            <th>ID</th>
                            <th>Sale Date</th>
                            <th>Product ID</th>
                            <th>Customer ID</th>
                            <th>Quantity</th>
                            <th>Total</th>
                            </thead>
                            <tbody>
                                <c:forEach var="record" items="${records}">
                                    <tr>
                                        <td class="text-left">${record.saleId}</td>
                                        <td class="text-left">${record.saleDate}</td>
                                        <td class="text-left">${record.productId}</td>
                                        <td class="text-left">${record.customerId}</td>
                                        <td class="text-left">${record.quantity}</td>
                                        <td class="text-left">$${record.totalCost}</td> 
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>