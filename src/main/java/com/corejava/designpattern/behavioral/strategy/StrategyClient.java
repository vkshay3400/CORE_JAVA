package com.corejava.designpattern.behavioral.strategy;

public class StrategyClient {

    public static void main(String[] args) {

        /* Create an order and add items */
        Order order = new Order();
        order.addItem(new Item("Italian Pizza", 6.99));
        order.addItem(new Item("Wine", 9.99));
        order.addItem(new Item("Beer", 5.99));
        order.addItem(new Item("Red Apple", 1.49));
        order.addItem(new Item("Almonds", 11.99));

        System.out.println("---------------------------------");
        /* Create payment strategies and make payment */
        order.makePayment(new CashPayment(20.00));
        order.makePayment(new CardPayment("CREDIT", "VISA", 10.00));
        order.makePayment(new CardPayment("DEBIT", "AMEX", 10.00));
        System.out.println("---------------------------------");

    }
}