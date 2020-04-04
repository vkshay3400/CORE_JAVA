package com.corejava.basic;

public class Display {
    public static void main(String[] args) {
        for (int index1 = 1; index1 <= 9; index1++) {
            for (int index2 = 1; index2 <= index1; index2++) {
                System.out.print(" ");
                System.out.print(index1);
            }
            System.out.println();
        }
    }
}
