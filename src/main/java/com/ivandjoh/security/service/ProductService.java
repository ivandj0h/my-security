package com.ivandjoh.security.service;

import com.ivandjoh.security.dto.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();

    Product getProductById(Long id);
}
