package com.corejava.designpattern.behavioral.observer.clientcode;

import com.corejava.designpattern.behavioral.observer.item_payment_order.Item;
import com.corejava.designpattern.behavioral.observer.item_payment_order.Order;
import com.corejava.designpattern.behavioral.observer.item_payment_order.Payment;

public class ObserverClient {
    public static void main(String[] args) {

        Order order = new Order();
        order.addItem(new Item("Tea",12.05));
        order.addItem(new Item("Coffee", 15.06));
        order.addItem(new Item("Sandwich",25));

        System.out.println("------------");

        order.makePayment(new Payment("Cash" , 20.00));
        order.makePayment(new Payment("Credit",29));
        order.makePayment(new Payment("Debit",50));

        System.out.println("------------");

        order.completeOrder();
    }
}