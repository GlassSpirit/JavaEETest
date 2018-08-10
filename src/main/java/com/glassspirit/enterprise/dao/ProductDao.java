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
        merge(new Product("test-1", "Test 1", "Супер классный товар 1"));
        merge(new Product("test-2", "Test 2", "Товар первой категории"));
        merge(new Product("test-3", "Test 3", "Banana banana banana"));
        merge(new Product("test-4", "Test 4", "Пустое описание"));
        merge(new Product("test-5", "Test 5"));
        merge(new Product("test-6", "Test 6"));
        merge(new Product("test-7", "Test 7"));
        merge(new Product("test-8", "Test 8"));
        merge(new Product("test-9", "Test 9"));
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
