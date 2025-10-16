/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vit.adda.l11l12s.assessment05;

/**
 *
 * @author narayanan
 */
public class Check extends Payment {
    private String name;
    private String bankID;

    public Check(float amount, String name, String bankID) {
        super(amount);
        this.name = name;
        this.bankID = bankID;
    }

    @Override
    public boolean authorized() {
        return bankID != null && !bankID.isEmpty();
    }

    @Override
    public String toString() {
        return "Check Payment by " + name + " (Bank ID: " + bankID + ")";
    }
}
