package com.glassspirit.enterprise.ui.view;

import com.glassspirit.enterprise.dao.ProductDao;
import com.glassspirit.enterprise.model.Product;
import com.glassspirit.enterprise.ui.MainLayout;
import com.glassspirit.enterprise.util.ProductImageHelper;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Route(value = "catalog", layout = MainLayout.class)
@PageTitle("Eclipsis - Каталог")
@StyleSheet("frontend://styles/style.css")
public class CatalogView extends VerticalLayout {

    @Inject
    private ProductDao productDao;

    public CatalogView() {
        add(new H1("Каталог"));
    }

    @PostConstruct
    private void init() {
        add(new H1("Каталог"));

        Div productContainer = new Div();
        productContainer.setClassName("product-container");

        for (Product product : productDao.getProducts()) {
            Div productDiv = new Div();
            productDiv.setClassName("product-item");

            Anchor productAnchor = new Anchor("/product?" + product.getId(), product.getName());
            Image productImage = new Image(ProductImageHelper.getProductImagePath(product), product.getName());
            productAnchor.add(productImage);

            productDiv.add(productAnchor);

            productContainer.add(productDiv);
        }

        add(productContainer);
    }

}
