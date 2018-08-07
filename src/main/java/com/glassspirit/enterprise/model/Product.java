package com.glassspirit.enterprise.model;

public class Product {

    private String id;
    private String name;
    private String description;
    private Price price;

    public Product() {
        id = "default";
        name = "default";
        description = "";
        price = new Price();
    }

    public Product(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Product(String id, String name, String description) {
        this(id, name);
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product {id: " + id + ", name: " + name + ", description: " + description + ", price " + price;
    }

}
