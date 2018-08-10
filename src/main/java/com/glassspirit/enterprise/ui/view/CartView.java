package com.glassspirit.enterprise.ui.view;

import com.glassspirit.enterprise.ui.MainLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "cart", layout = MainLayout.class)
public class CartView extends VerticalLayout {

    public CartView() {
        this.add(new H1("Корзина"));
    }

}
