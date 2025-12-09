package com.jfsproject.fullStatck.service;

import com.jfsproject.fullStatck.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {

    List<Product> product = Arrays.asList(
            new Product(101, "iphone", 50000),
            new Product(102,"samsung",175000),
            new Product(103,"iqoo",15000));
    public List<Product> getProducts(){
        return  null;
    }
}
