package com.ivandjoh.security.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {

    private Long id;
    private String name;
    private int qty;
    private double price;
}
