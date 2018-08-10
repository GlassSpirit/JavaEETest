package com.glassspirit.enterprise.servlet;

import com.glassspirit.enterprise.dao.ProductDao;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProductServlet", urlPatterns = "/product")
public class ProductServlet extends HttpServlet {

    @Inject
    ProductDao productDao;

    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestParameter = req.getParameter("id");
        if (requestParameter != null && !requestParameter.isEmpty()) {
            if (productDao.getProductById(requestParameter) != null) {
                req.setAttribute("product", productDao.getProductById(requestParameter));
                req.getRequestDispatcher("WEB-INF/product.jsp").forward(req, resp);
            }
        }
        resp.sendError(404);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }
}
