package org.example.data;

import org.example.model.Product;

import java.util.Arrays;

public class VendingMacine implements IVendingMachine {

    private Product[] products;
    private int depositPool;

    //Construtor
    public VendingMacine(Product[] products){
        this.products = products;
    }

    //getter and setter
    public int getDepositPool() {

        return depositPool;
    }

    public void setDepositPool(int depositPool) {

        this.depositPool = depositPool;
    }


    @Override
    public void addCurrency(int amount) {

        for(ECurrency eCurrency : ECurrency.values()) {
            if (eCurrency.getMoneyStaorage() == amount) {
                setDepositPool(amount);
            }
        }

    }


    @Override
    public Product request(int id) {
        for (Product product : products){
            if (product.getId() == id){
                if(product.getPrice() <= depositPool){
                    double exchange = depositPool - product.getPrice();
                        setDepositPool((int)exchange);
                        return product;
                }else {
                    throw new RuntimeException("Product "+ product.getProductName() + " is too expensive");
                }
            }
        }
         throw new RuntimeException("Could not find product with id "+id);
    }

    @Override
    public int endSession() {
       int temp = depositPool;
       depositPool = 0;
       return temp;
    }


    StringBuilder stringBuilder = new StringBuilder();
    @Override
    public String getDescription(int id) {
        for (Product product : products){
           if(product.getId() == id){
               stringBuilder.append(product.examine()).append(" price: "+product.getPrice());
           }
        }
        return stringBuilder.toString();
    }


    @Override
    public int getBalance() {
        return this.depositPool;
    }



    @Override
    public String[] getProducts() {
         if(products == null) throw  new IllegalArgumentException("the product is empty");
         String[] productDescriArr = new String[0];

        for (Product product : products){
                productDescriArr = Arrays.copyOf(productDescriArr, productDescriArr.length +1);
                productDescriArr[productDescriArr.length -1] =  "Product Id: "+product.getId() +" Product Name "+product.getProductName()+" Product price "+product.getPrice();
        }
        return productDescriArr;
    }





}
