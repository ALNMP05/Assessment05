/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vit.adda.l11l12s.assessment05;

/**
 *
 * @author narayanan
 */

import java.util.Date;

public class Assessment05 {

    public static void main(String[] args) {
        Customer cust = new Customer("Arjun Kumar", "Chennai");
        Item item1 = new Item(2.5, "Wireless Mouse");
        Item item2 = new Item(1.0, "Keyboard");

        OrderDetail detail1 = new OrderDetail(2, "Taxable", item1);
        OrderDetail detail2 = new OrderDetail(1, "Taxable", item2);

        Order order = new Order(new Date(), "Processing", cust);
        order.addOrderDetail(detail1);
        order.addOrderDetail(detail2);

        Payment cash = new Cash(5000, 5000);
        order.addPayment(cash);

        System.out.println(order);
        System.out.println("\nPayment Authorized: " + cash.authorized());
    }
}
