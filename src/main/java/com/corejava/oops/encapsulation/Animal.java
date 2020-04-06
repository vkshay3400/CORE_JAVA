package com.corejava.oops.encapsulation;

class Animal {
    private String name;
    private double averageWeight;
    private int numberOfLegs;

    // Getter methods
    public String getName() {
        return name;
    }

    public double getAverageWeight() {
        return averageWeight;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAverageWeight(double averageWeight) {
        this.averageWeight = averageWeight;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
}

//
//
//import com.opencsv.bean.CsvBindByName;
//
//public class Animal {
//    public Animal() {
//    }
//
//    public Animal(String name, double averageWeight, int numberOfLegs) {
//        this.name = name;
//        this.averageWeight = averageWeight;
//        this.numberOfLegs = numberOfLegs;
//    }
//
//    @CsvBindByName(column = "name", required = true)
//    public String name;
//
//    @CsvBindByName(column = "averageWeight", required = true)
//    public double averageWeight;
//
//    @CsvBindByName(column = "numberOfLegs", required = true)
//    public int numberOfLegs;
//}