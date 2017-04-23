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
                        <h4 class="title">Employee List</h4>
                        <p class="category">
                            Below is a complete list of HDS' employees
                        </p>
                    </div>
                    <div class="card-content table-responsive">
                        <table class="table">
                            <thead class="text-default">
                            <th>ID</th>
                            <th>First Name</th>
                            <th>Last Name</th>
                            <th>Title</th>
                            <th>Pay Rate</th>
                            </thead>
                            <tbody>
                                <c:forEach var="employee" items="${employees}">
                                    <tr>
                                        <td class="text-left">${employee.employeeId}</td>
                                        <td class="text-left">${employee.firstName}</td>
                                        <td class="text-left">${employee.lastName}</td>
                                        <td class="text-left">${employee.jobTitle}</td>
                                        <td class="text-left">$${employee.payRate}/hour</td> 
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