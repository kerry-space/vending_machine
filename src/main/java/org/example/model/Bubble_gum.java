package org.example.model;

public class Bubble_gum extends Product{

    public Bubble_gum(int id, double price, String productName) {
        super(id, price, productName);
    }

    @Override
    public String examine() {
        return "{ id: " + getId() + ", Bubble gum : " + getProductName() + " }";
    }

    @Override
    public String use() {
        return "Your Bubble gum " + getProductName();
    }
}
