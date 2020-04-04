package com.corejava.basic;

public class Enum {

    enum Days {
        Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday;
    }

    public static void main(String[] args) {
        for (Days d : Days.values()) {
            weekend(d);
        }
    }

    private static void weekend(Days d) {
        if (d.equals(Days.Sunday))
            System.out.println(d + "is a holiday days");
        else if (d.equals(Days.Saturday))
            System.out.println(d + "is a holiday days");
        else
            System.out.println(d + " is a working days");
    }
}