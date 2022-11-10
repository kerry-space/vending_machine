package org.example.model;

import java.util.Arrays;

public class Chocolate extends Product {


    public Chocolate(int id, double price, String productName) {
        super(id,price, productName);
    }


    @Override
    public String examine() {

        return "{ id: " + getId() + ", Chocolate: " + getProductName() + " }";

    }

    @Override
    public String use() {

        return "Here is Your Chocolate "+getProductName();
    }





}
