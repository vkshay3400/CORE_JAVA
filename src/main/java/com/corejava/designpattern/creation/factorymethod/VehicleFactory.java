package com.corejava.designpattern.creation.factorymethod;

public class VehicleFactory {
    public Vehicle getVehicle(String vehicleType) throws Exception {
        if (vehicleType == null)
            return null;

        Vehicle vehicle = null;
        switch (vehicleType) {
            case "car":
                vehicle = new Car();
            case "truck":
                vehicle = new Truck();
                break;
            case "motorcycle":
                vehicle = new Motorcycle();
                break;
            default:
                throw new Exception();
        }
        return vehicle;
    }
}
