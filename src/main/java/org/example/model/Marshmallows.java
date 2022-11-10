package org.example.model;

public class Marshmallows extends Product{
    public Marshmallows(int id,double price, String productName) {
        super(id,price, productName);
    }

    @Override
    public String examine() {

        return "{ id: " + getId() + ", Marshmallows: " + getProductName() + " }";
    }

    @Override
    public String use() {
        return "Here is Your Chocolate "+getProductName();
    }
}
