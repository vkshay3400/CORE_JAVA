package com.corejava.designpattern.behavioral.observer.item_payment_order;

public class Payment {
    public final String type;
    public final double amount;

    public Payment(String type, double amount) {
        super();
        this.type = type;
        this.amount = amount;
    }
}
