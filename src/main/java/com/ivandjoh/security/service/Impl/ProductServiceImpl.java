package com.ivandjoh.security.service.Impl;

import com.ivandjoh.security.dto.Product;
import com.ivandjoh.security.service.ProductService;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class ProductServiceImpl implements ProductService {

    List<Product> productList = null;

    @PostConstruct
    public void LoadProductFromDB() {
        productList = IntStream.rangeClosed(1, 10)
                .mapToObj(i -> Product.builder()
                        .id((long) i)
                        .name("Product " + i)
                        .qty(new Random().nextInt(10))
                        .price(new Random().nextInt(5000))
                        .build()
                ).collect(Collectors.toList());
    }

    @Override
    public List<Product> getAllProducts() {
        return productList;
    }

    @Override
    public Product getProductById(Long id) {
        return productList.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Product with ID : " + id + " not found!"));
    }
}
