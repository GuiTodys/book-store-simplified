package com.bookstore.bookstoresimplified.persistance.impl.h2;

import com.bookstore.bookstoresimplified.domains.Product;
import com.bookstore.bookstoresimplified.persistance.ProductPersistenceGateway;

import java.util.List;
import java.util.UUID;

public class ProductPersistenceGatewayImpl implements ProductPersistenceGateway {
    @Override
    public Product findProduct(UUID id) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }
}
