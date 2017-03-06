<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/includes/header.jsp" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!-- start the middle column -->

<!-- If necessary, this page could be generated from the database. -->

<section>
    <h1>HDS Inventory List</h1>
    <c:forEach var="product" items="${requestScope.products}">
        <c:set var="descriptionString" value="${product.description}" />
        <c:set var="descriptionSplit" value="${fn:split(descriptionString,'-')}"/>  
            <h2>${descriptionSplit[0]}</h2>   
    <p><a href="<c:out value='${product.code}'/>">${descriptionSplit[1]}</a></p>  
    </c:forEach>
</section>

<!-- end the middle column -->

<jsp:include page="/includes/footer.jsp" />