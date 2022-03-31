package com.bookstore.bookstoresimplified.usecases.product;

import com.bookstore.bookstoresimplified.domains.Product;
import com.bookstore.bookstoresimplified.dto.ProductRequest;
import org.springframework.stereotype.Service;

@Service
public class CreateProduct {
    public Product execute(ProductRequest productRequest) {
        return new Product(productRequest);
    }
}
