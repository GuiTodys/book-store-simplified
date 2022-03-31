package com.bookstore.bookstoresimplified.persistance;


import com.bookstore.bookstoresimplified.domains.Product;

import java.util.List;
import java.util.UUID;

public interface ProductPersistenceGateway {
    Product findProduct(UUID id);

    List<Product> getAllProducts();

    Product createProduct(Product product);
}
