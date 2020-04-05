package com.corejava.oops;

interface Area {
    final static float pi = 3.14f;
    float compute(float x, float y);
}

class Rectangle implements Area {
    public float compute(float x, float y) {
        return (x * y);
    }
}

class Circle implements Area {
    public float compute(float x, float y) {
        return (pi * x * x);
    }
}

public class Interface {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();

        Area area;  //Interface object
        area = rectangle;  //Area refers to rectangle object
        System.out.println("Area of rectangle: " + area.compute(10, 20));

        area = circle;     //Area refers to circle object
        System.out.println("Area of circle: " + area.compute(10, 0));

    }
}
