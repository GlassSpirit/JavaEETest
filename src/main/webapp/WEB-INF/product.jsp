<%@ page import="com.glassspirit.enterprise.model.Product" %>
<%@ page import="com.glassspirit.enterprise.util.ProductImageHelper" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Продукт</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="content">
    <%Product product = (Product) request.getAttribute("product");%>
    <h1>Продукт <%=product.getName()%>
    </h1>
    <img src="<%=ProductImageHelper.getProductImagePath(product)%>">
</div>
<jsp:include page="footer.jsp"/>
</body>
</html>
