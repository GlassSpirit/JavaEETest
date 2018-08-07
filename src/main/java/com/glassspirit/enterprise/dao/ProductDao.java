package com.glassspirit.enterprise.dao;

import com.glassspirit.enterprise.model.Product;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;

@ApplicationScoped
public class ProductDao {

    private HashMap<String, Product> database = new LinkedHashMap<>();

    @PostConstruct
    private void init() {
        merge(Product.builder().setId("test-1").setName("Test 1").build());
        merge(Product.builder().setId("test-2").setName("Test 2").build());
        merge(Product.builder().setId("test-3").setName("Test 3").build());
        merge(Product.builder().setId("test-4").setName("Test 4").build());
        merge(Product.builder().setId("test-5").setName("Test 5").build());
        merge(Product.builder().setId("test-6").setName("Test 6").build());
        merge(Product.builder().setId("test-7").setName("Test 7").build());
        merge(Product.builder().setId("test-8").setName("Test 8").build());
        merge(Product.builder().setId("test-9").setName("Test 9").build());
    }

    public Collection<Product> getProducts() {
        return database.values();
    }

    public Product getProductById(String id) {
        if (id == null || id.isEmpty()) return null;
        return database.get(id);
    }

    public void removeProductById(String id) {
        if (id == null || id.isEmpty()) return;
        if (database.containsKey(id)) return;
        database.remove(id);
    }

    public Product merge(Product product) {
        if (product == null) return null;
        final String id = product.getId();
        if (id == null || id.isEmpty()) return null;
        database.put(id, product);
        return product;
    }
}
