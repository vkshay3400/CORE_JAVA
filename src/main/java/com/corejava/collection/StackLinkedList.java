package com.corejava.collection;

import java.util.LinkedList;

public class StackLinkedList {
    public LinkedList list = new LinkedList();

    public void push1(Object o) {
        list.addFirst(o);
    }

    public void push2(Object o) {
        list.addLast(o);
    }

    public Object bottom() {
        return list.getLast();
    }

    public Object pop() {
        return list.removeFirst();
    }

    public static void main(String[] args) {
        Car myCar;
        Driver myDriver;

        StackLinkedList s = new StackLinkedList();
        s.push1(new Car());
        s.push2(new Driver());

        myCar = (Car)s.pop();
        System.out.println("First element in list: " + myCar);

        myDriver = (Driver)s.pop();
        System.out.println("Last element in list: " + myDriver);
    }
}

class Car {
    String car1, car2, car3, car4;

    Car() {
        car1 = "Benz";
        car2 = "Audi";
        car3 = "Toyota";
        car4 = "BMW";
    }
}

class Driver {
    String driver1, driver2, driver3;

    Driver() {
        driver1 = "Mark";
        driver2 = "Elon";
        driver3 = "Bezos";
    }
}