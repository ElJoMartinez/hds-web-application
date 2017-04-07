<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach var="product" items="${requestScope.products}">
    <tr>
        <td>${product.productId}</td>
        <td class="text-left">${product.brand}</td>
        <td class="text-left">${product.modelId}</td>
        <td class="text-left">${product.serialId}</td>
        <td>${product.description}</td>
        <td class="text-center">$${product.cost}</td>
        <td class="text-center">$${product.listPrice}</td>
    </tr>
</c:forEach>