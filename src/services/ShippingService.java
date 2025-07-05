package services;

import models.Shippible;
import java.util.List;

public class ShippingService {
    public static void ship(List<Shippible> items) {
        double totalWeight = 0;
        System.out.println("** Shipment Notice **");
        for (Shippible item : items) {
            System.out.println(item.getName() + " " + item.getWeight() + "kg");
            totalWeight += item.getWeight();
        }
        System.out.println("Total package weight: " + totalWeight + "kg\n");
    }
}