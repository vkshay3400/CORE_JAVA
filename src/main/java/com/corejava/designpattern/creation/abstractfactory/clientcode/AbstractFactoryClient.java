package com.corejava.designpattern.creation.abstractfactory.clientcode;

import com.corejava.designpattern.creation.abstractfactory.abstractfactory.Factory;
import com.corejava.designpattern.creation.abstractfactory.elementinterface.Engine;
import com.corejava.designpattern.creation.abstractfactory.elementinterface.Tyre;

import java.util.Scanner;


public class AbstractFactoryClient {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String vehicleType = in.nextLine().toLowerCase();

        /* Get the factory instance */
        Factory factory;
        try {
            factory = Factory.getFactory(vehicleType);

            /* Get the Engine from the factory */
            Engine engine = factory.getEngine();
            engine.design();
            engine.manufacture();
            engine.test();

            /* Get the Tyre from the factory */
            Tyre tyre = factory.getTyre();
            tyre.design();
            tyre.manufacture();
        } catch (Exception e){
            e.printStackTrace();
        }
        in.close();
    }
}