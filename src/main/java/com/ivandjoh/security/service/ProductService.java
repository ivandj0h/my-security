package com.ivandjoh.security.service;

import com.ivandjoh.security.dto.Product;
import com.ivandjoh.security.entity.UserInfo;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();

    Product getProductById(int id);

    String addUser(UserInfo userInfo);
}
