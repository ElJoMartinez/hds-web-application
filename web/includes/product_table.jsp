<!-- 
    JSP / HTML template for displaying the table of products.
    
-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h2>${product.modelId}</h2>
<h2>${product.serialId}</h2>
<p>${product.Brand}</p>
<p>${product.description}</p>
<p>${product.cost}</p>
<p>${product.listPrice}</p>