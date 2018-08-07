package com.glassspirit.enterprise.model;

public class Product {

    private String id = "default";
    private String name = "default";
    private Price price = new Price();

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Price getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product {id: " + id + ", name: " + name + ", price " + price;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private Product product;

        private Builder() {
            product = new Product();
        }

        public Builder setId(String id) {
            product.id = id;
            return this;
        }

        public Builder setName(String name) {
            product.name = name;
            return this;
        }

        public Builder setPrice(Price price) {
            product.price = price;
            return this;
        }

        public Product build() {
            return product;
        }

    }
}
