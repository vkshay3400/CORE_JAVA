package com.corejava.designpattern.behavioral.observer.item_payment_order;

public class Item {
    public double price;
    public String name;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
