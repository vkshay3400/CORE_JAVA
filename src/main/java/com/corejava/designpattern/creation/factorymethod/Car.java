package com.corejava.designpattern.creation.factorymethod;

public class Car implements Vehicle {
    @Override
    public void design() {
        System.out.println("Design of a car");
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacture of a car");
    }
}
