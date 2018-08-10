package com.glassspirit.enterprise.ui;

import com.glassspirit.enterprise.ui.view.AboutView;
import com.glassspirit.enterprise.ui.view.CartView;
import com.glassspirit.enterprise.ui.view.CatalogView;
import com.glassspirit.enterprise.ui.view.MainView;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.router.RouterLink;

@StyleSheet("frontend://styles/style.css")
public class MainLayout extends Div implements RouterLayout {

    public MainLayout() {
        Div header = new Div();
        header.setClassName("header");

        RouterLink logo = new RouterLink("", MainView.class);
        logo.add(new Image("img/logo.jpg", "Логотип"));
        logo.setClassName("logo");

        Div navigation = new Div();
        navigation.setClassName("menu");

        RouterLink mainPage = new RouterLink("Главная", MainView.class);
        mainPage.setClassName("menu-item");
        RouterLink catalogPage = new RouterLink("Каталог", CatalogView.class);
        catalogPage.setClassName("menu-item");
        RouterLink cartPage = new RouterLink("Корзина", CartView.class);
        cartPage.setClassName("menu-item");
        RouterLink aboutPage = new RouterLink("О нас", AboutView.class);
        aboutPage.setClassName("menu-item");

        navigation.add(mainPage, catalogPage, cartPage, aboutPage);

        header.add(logo, navigation);

        add(header);
    }

}
