package com.corejava.designpattern.behavioral.observer.observerabstract;

public class CashierDisplay extends Observer {
    @Override
    public void update(String str) {
        System.out.println("Cashier display: " + str);
    }
}
