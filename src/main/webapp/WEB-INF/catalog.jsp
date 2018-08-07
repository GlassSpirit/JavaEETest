<%@ page import="com.glassspirit.enterprise.model.Product" %>
<%@ page import="com.glassspirit.enterprise.util.ProductImageHelper" %>
<%@ page import="java.util.Collection" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Каталог</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="content">
    <h1>Каталог</h1>
    <div class="product-container">
        <%
            for (Product product : (Collection<Product>) request.getAttribute("products")) {
        %>
        <a class="product-item" href="product?id=<%=product.getId()%>">
            <img alt="<%=product.getName()%>"
                 src=<%=ProductImageHelper.getProductImagePath(product)%>
            ><br><%=product.getName()%>
        </a>
        <%
            }
        %>
    </div>
</div>
<jsp:include page="footer.jsp"/>
</body>
</html>
