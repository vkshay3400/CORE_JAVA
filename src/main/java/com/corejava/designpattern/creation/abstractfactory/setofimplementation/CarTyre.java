package com.corejava.designpattern.creation.abstractfactory.setofimplementation;

import com.corejava.designpattern.creation.abstractfactory.elementinterface.Tyre;

public class CarTyre implements Tyre {
    @Override
    public void design() {
        System.out.println("Designing Car Tyre");
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacturing Car Tyre");
    }
}
