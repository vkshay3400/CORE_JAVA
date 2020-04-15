package com.corejava.designpattern.creation.abstractfactory.setofimplementation;

import com.corejava.designpattern.creation.abstractfactory.elementinterface.Tyre;

public class TruckTyre implements Tyre {

    @Override
    public void design() {
        System.out.println("designing Truck Tyre");
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacturing Truck Tyre");
    }
}
