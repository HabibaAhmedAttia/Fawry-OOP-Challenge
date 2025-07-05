import models.*;
import services.CheckoutService;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            Customer customer = new Customer("habiba", 500);

            ShippableProduct cheese = new ShippableProduct("Cheese", 200, 5, 0.4);
            ExpirableProduct biscuits = new ExpirableProduct("Biscuits", 150, 2, new Date(System.currentTimeMillis() + 100000));
            Product scratchCard = new Product("Scratch Card", 50, 10) {};

            Cart cart = new Cart();
            cart.add(cheese, 1);
            cart.add(biscuits, 1);
            cart.add(scratchCard, 1);

            CheckoutService.checkout(customer, cart);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}