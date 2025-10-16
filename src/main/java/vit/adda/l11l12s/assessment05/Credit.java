/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vit.adda.l11l12s.assessment05;

/**
 *
 * @author narayanan
 */
public class Credit extends Payment {
    private String name;
    private String type;
    private String expDate;

    public Credit(float amount, String name, String type, String expDate) {
        super(amount);
        this.name = name;
        this.type = type;
        this.expDate = expDate;
    }

    @Override
    public boolean authorized() {
        return expDate != null && !expDate.isEmpty();
    }

    @Override
    public String toString() {
        return "Credit Payment by " + name + " (" + type + "), Exp: " + expDate;
    }
}
