package com.glassspirit.enterprise.ui.view;

import com.glassspirit.enterprise.ui.MainLayout;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "", layout = MainLayout.class)
@PageTitle("Eclipsis - Главная")
@StyleSheet("frontend://styles/style.css")
public class MainView extends VerticalLayout {

    public MainView() {
        add(new H1("Главная страница"));
    }

}
