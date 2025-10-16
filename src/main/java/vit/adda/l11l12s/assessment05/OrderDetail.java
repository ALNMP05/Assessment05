package vit.adda.l11l12s.assessment05;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author narayanan
 */
public class OrderDetail {
    private int quantity;
    private String taxStatus;
    private Item item;

    public OrderDetail(int quantity, String taxStatus, Item item) {
        this.quantity = quantity;
        this.taxStatus = taxStatus;
        this.item = item;
    }

    public double calcSubTotal() {
        return item.getPriceForQuantity(quantity);
    }

    public double calcWeight() {
        return item.getShippingWeight() * quantity;
    }

    public double calcTax() {
        return item.getTax(quantity);
    }

    @Override
    public String toString() {
        return "OrderDetail: " + quantity + " x " + item + 
               ", SubTotal: " + calcSubTotal() + ", Tax: " + calcTax();
    }
}
