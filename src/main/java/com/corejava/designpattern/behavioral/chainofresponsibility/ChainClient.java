package com.corejava.designpattern.behavioral.chainofresponsibility;

import java.util.Scanner;

public class ChainClient {
    public static void main(String[] args) {
        /* Create a chain */
        CashDispenser cashDispenser = new CashDispenser(100);
        cashDispenser.setNextDispenser(new CashDispenser(50));
        cashDispenser.setNextDispenser(new CashDispenser(20));

        /* Get the amount */
        int amount = 1000;
      //  Scanner in = new Scanner(System.in);
        //System.out.println("Enter the amount to withdraw: ");
        //amount = in.nextInt();
        //int amount = 1000;

        /* Dispense the amount  */
        cashDispenser.dispense(amount);
        //in.close();
    }

}
