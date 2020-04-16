package com.corejava.designpattern.behavioral.observer.observerabstract;

public class CustomerDisplay extends Observer{
    @Override
    public void update(String str) {
        System.out.println("Customer Display: " + str);
    }
}