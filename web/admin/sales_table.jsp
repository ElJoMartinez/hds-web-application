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
                        <p class="category">Below is the complete list of
                            customers for HDS.
                        </p>
                    </div>
                    <div class="card-content table-responsive">
                        <table class="table">
                            <thead class="text-default">
                            <th>ID</th>
                            <th>Sale Date</th>
                            <th>Product</th>
                            <th>Customer</th>
                            <th>Quantity</th>
                            <th>Total</th>
                            </thead>
                            <tbody>
                                <c:forEach var="records" items="${requestScope.salesRecords}">
                                    <tr>
                                        <td class="text-left">${records.saleId}</td>
                                        <td class="text-left">${records.saleDate}</td>
                                        <td class="text-left">${records.productId}</td>
                                        <td class="text-left">${records.customerId}</td>
                                        <td class="text-left">${records.Quantity}</td>
                                        <td class="text-left">${records.totalCost}</td> 
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