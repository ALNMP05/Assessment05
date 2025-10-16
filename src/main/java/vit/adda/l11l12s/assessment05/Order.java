/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vit.adda.l11l12s.assessment05;

/**
 *
 * @author narayanan
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date date;
    private String status;
    private Customer customer;
    private List<OrderDetail> orderDetails;
    private List<Payment> payments;

    public Order(Date date, String status, Customer customer) {
        this.date = date;
        this.status = status;
        this.customer = customer;
        this.orderDetails = new ArrayList<>();
        this.payments = new ArrayList<>();
    }

    public void addOrderDetail(OrderDetail detail) {
        orderDetails.add(detail);
    }

    public void addPayment(Payment payment) {
        payments.add(payment);
    }

    public double calcSubTotal() {
        return orderDetails.stream().mapToDouble(OrderDetail::calcSubTotal).sum();
    }

    public double calcTax() {
        return orderDetails.stream().mapToDouble(OrderDetail::calcTax).sum();
    }

    public double calcTotal() {
        return calcSubTotal() + calcTax();
    }

    public double calcTotalWeight() {
        return orderDetails.stream().mapToDouble(OrderDetail::calcWeight).sum();
    }

    @Override
    public String toString() {
        return "Order Date: " + date + "\nStatus: " + status + "\nCustomer: " + customer +
               "\nTotal: " + calcTotal() + "\nWeight: " + calcTotalWeight();
    }
}

