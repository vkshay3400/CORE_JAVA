package com.corejava.designpattern.creation.factorymethod;

public class Truck implements Vehicle{

    @Override
    public void design() {
        System.out.println("Design of truck");
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacture of a truck");
    }
}
