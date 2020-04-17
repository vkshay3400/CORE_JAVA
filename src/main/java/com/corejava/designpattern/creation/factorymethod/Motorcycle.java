package com.corejava.designpattern.creation.factorymethod;

public class Motorcycle implements Vehicle {
    @Override
    public void design() {
        System.out.println("Design of a motorcycle");
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacture of a motorcycle");
    }
}
