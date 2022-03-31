package com.bookstore.bookstoresimplified.domains;

import com.bookstore.bookstoresimplified.dto.ProductRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class Product {
    private UUID id;
    private String name;
    private String description;
    private BigDecimal price;
    private String distributor;

    public Product(ProductRequest productRequest) {
        this.id = UUID.randomUUID();
        this.name = productRequest.getName();
        this.description = productRequest.getDescription();
        this.price = productRequest.getPrice();
        this.distributor = productRequest.getDistributor();
    }
}

