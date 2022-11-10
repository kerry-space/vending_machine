package org.example.model;

public abstract class Product {


    private int id;
    private  double price;
    private String productName;

    //constructor
    public Product(int id,double price, String productName){
       this.id = id;
        this.price = price;
        this.productName = productName;
    }

    //getter and setter
    public abstract String examine();
    public abstract String use();

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
