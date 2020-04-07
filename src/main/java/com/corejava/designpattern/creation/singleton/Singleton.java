package com.corejava.designpattern.creation.singleton;

public class Singleton {
/*
 Singleton when only one instance of class
 */

    //SINGLETON OBJECT
    private static Singleton instance = null;

    //TO AVOID EXTERNAL INSTANTIATION OF CLASS
    private Singleton() {
    }

    //METHOD TO GET SINGLETON OBJECT
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void printObject() {
        System.out.println("Unique Id of the object: + " +
                System.identityHashCode(this));
    }
}