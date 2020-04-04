package com.corejava.basic;

public class StringManipulationBuffer {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Object language");
        System.out.println("Original String: " + str);

        System.out.println("length of string: " + str.length());

        for (int i = 0; i < str.length(); i++) {
            int position = i + 1;
            System.out.println("Character at position: " + position + " is " + str.charAt(i));
        }

        str.insert(0, "You can do it ");  //@ array key
        System.out.println("Insert String: " + str);

        str.setCharAt(7, '-');
        System.out.println("Modified String: " + str);  //@ char

        str.append(" improve language ");
        System.out.println("Append String: " + str); //@ last
    }
}