/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vit.adda.l11l12s.assessment05;

/**
 *
 * @author narayanan
 */
public class Cash extends Payment {
    private float cashTendered;

    public Cash(float amount, float cashTendered) {
        super(amount);
        this.cashTendered = cashTendered;
    }

    @Override
    public boolean authorized() {
        return cashTendered >= amount;
    }

    @Override
    public String toString() {
        return "Cash Payment: " + amount + ", Cash Tendered: " + cashTendered;
    }
}

