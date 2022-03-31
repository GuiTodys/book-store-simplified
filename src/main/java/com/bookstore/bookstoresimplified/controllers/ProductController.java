package com.bookstore.bookstoresimplified.controllers;

import com.bookstore.bookstoresimplified.domains.Product;
import com.bookstore.bookstoresimplified.dto.ProductRequest;
import com.bookstore.bookstoresimplified.dto.ProductResponse;
import com.bookstore.bookstoresimplified.usecases.product.CreateProduct;
import com.bookstore.bookstoresimplified.usecases.product.FindAllProducts;
import com.bookstore.bookstoresimplified.usecases.product.FindProductById;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private final FindProductById findProductById;
    private final FindAllProducts findAllProducts;
    private final CreateProduct createProduct;

    @GetMapping("/{id}")
    public ProductResponse findProductById(
            @PathVariable UUID id) {
        return findProductById.execute(id);
    }

    @GetMapping
    public List<ProductResponse> findAllProducts() {
        return findAllProducts.execute();
    }

    @PostMapping()
    public ResponseEntity<ProductResponse> createProduct(
            @RequestBody ProductRequest productRequest,
            UriComponentsBuilder uriComponentsBuilder
    ) {
        Product product = createProduct.execute(productRequest);
        URI uri = uriComponentsBuilder.path("/product/{id}").buildAndExpand(product.getId()).toUri();
        return ResponseEntity.created(uri).body(new ProductResponse(product));
    }

}
