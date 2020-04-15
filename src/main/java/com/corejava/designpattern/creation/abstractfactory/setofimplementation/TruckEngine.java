package com.corejava.designpattern.creation.abstractfactory.setofimplementation;

import com.corejava.designpattern.creation.abstractfactory.elementinterface.Engine;

public class TruckEngine implements Engine {
    @Override
    public void design() {
        System.out.println("Designing Truck Engine");
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacturing Truck Engine");
    }

    @Override
    public void test() {
        System.out.println("Testing Truck Engine");
    }
}
