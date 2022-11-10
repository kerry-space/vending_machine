package org.example.data;

import org.example.model.Product;

public interface IVendingMachine {
    //all static final fields

    //all public abstract methods
    void addCurrency(int amount);
    int getBalance();
    Product request(int id);
    int endSession();
    String getDescription(int id);
    String[] getProducts();
}
