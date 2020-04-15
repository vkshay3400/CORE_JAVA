package com.corejava.designpattern.creation.abstractfactory.factoryimplementation;

import com.corejava.designpattern.creation.abstractfactory.abstractfactory.Factory;
import com.corejava.designpattern.creation.abstractfactory.elementinterface.Engine;
import com.corejava.designpattern.creation.abstractfactory.elementinterface.Tyre;
import com.corejava.designpattern.creation.abstractfactory.setofimplementation.TruckEngine;
import com.corejava.designpattern.creation.abstractfactory.setofimplementation.TruckTyre;

public class TruckFactory extends Factory {

    @Override
    public Engine getEngine() {
        return new TruckEngine();
    }

    @Override
    public Tyre getTyre() {
        return new TruckTyre();
    }
}
