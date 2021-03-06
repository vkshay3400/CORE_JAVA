package com.corejava.designpattern.creation.abstractfactory.factoryimplementation;

import com.corejava.designpattern.creation.abstractfactory.abstractfactory.Factory;
import com.corejava.designpattern.creation.abstractfactory.elementinterface.Engine;
import com.corejava.designpattern.creation.abstractfactory.elementinterface.Tyre;
import com.corejava.designpattern.creation.abstractfactory.setofimplementation.CarEngine;
import com.corejava.designpattern.creation.abstractfactory.setofimplementation.CarTyre;

public class CarFactory extends Factory {

    @Override
    public Engine getEngine() {
        return new CarEngine();
    }

    @Override
    public Tyre getTyre() {
        return new CarTyre();
    }
}