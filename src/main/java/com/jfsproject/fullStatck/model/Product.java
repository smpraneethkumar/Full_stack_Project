package com.jfsproject.fullStatck.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;


@Component
public class Product {

    private int prodId;
    private  String prodName;
    private  int price;


    public  Product(){

    }
    public Product(int price, String prodName, int prodId) {
        this.price = price;
        this.prodName = prodName;
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
