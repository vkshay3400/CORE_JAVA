package com.corejava.designpattern.behavioral.chainofresponsibility;

public class CashDispenser {
    private int denominator;
    private CashDispenser next;

    public CashDispenser(int val) {
        this.denominator = val;
    }

    /* Method to chain dispenser */
    public void setNextDispenser(CashDispenser d) {
        if (next == null)
            next = d;
        else
            next.setNextDispenser(d);
    }

    public void dispense(int amount) {
        if (amount >= denominator) {
            int num = amount / denominator;
            int balance = amount % denominator;
            System.out.println(num + "*" + denominator + "$");

            if (balance != 0)
                next.dispense(balance);
            else
                next.dispense(amount);
        }
    }
}
