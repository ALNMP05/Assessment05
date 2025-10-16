/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vit.adda.l11l12s.assessment05;

/**
 *
 * @author narayanan
 */
public abstract class Payment {
    protected float amount;

    public Payment(float amount) {
        this.amount = amount;
    }

    public float getAmount() { return amount; }

    public abstract boolean authorized();

    @Override
    public String toString() {
        return "Payment Amount: " + amount;
    }
}
