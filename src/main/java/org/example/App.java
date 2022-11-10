package org.example;

import org.example.data.IVendingMachine;
import org.example.data.VendingMacine;
import org.example.model.Marshmallows;
import org.example.model.Product;
import org.example.model.Chocolate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        Product[] productArr = {
                new Chocolate(1,25.5, "chocolate"),
                new Marshmallows(2,30.6, "marshmallows"),
                new Chocolate(3,30.6, "bubble gum")
        };

        IVendingMachine machine = new VendingMacine(productArr);
        machine.addCurrency(100);

        for(String strignProdu : machine.getProducts()){
            System.out.println(strignProdu);
            System.out.println(".............");
        }
        machine.addCurrency(50);
        Product apple = machine.request(2);
        System.out.println(apple.use());
        System.out.println(machine.getBalance());





    }
}
