package vit.adda.l11l12s.assessment05;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author narayanan
 */
public class Item {
    private double shippingWeight;
    private String description;

    public Item(double shippingWeight, String description) {
        this.shippingWeight = shippingWeight;
        this.description = description;
    }

    public double getPriceForQuantity(int quantity) {
        return quantity * 100; // Example price calculation
    }

    public double getTax(int quantity) {
        return getPriceForQuantity(quantity) * 0.05; // 5% tax
    }
    public boolean inStock() {
        return true;
    }
    
    public double getShippingWeight() { return shippingWeight; }
    
}
