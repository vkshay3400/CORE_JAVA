package com.corejava.designpattern.creation.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton object1 = Singleton.getInstance();
        object1.printObject();

        Singleton object2 = Singleton.getInstance();
        object2.printObject();
    }
}
