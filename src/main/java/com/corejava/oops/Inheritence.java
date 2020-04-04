package com.corejava.oops;

public class Inheritence {
    public static void main(String[] args) {
        Bedroom room1 = new Bedroom(4, 2, 10);
        int area1 = room1.area();
        int volume1 = room1.volume();

        System.out.println("area:" + area1);
        System.out.println("volume: " + volume1);
    }
}

class Room {
    int length;
    int breadth;

    Room(int x, int y) {
        length = x;
        breadth = y;
    }

    int area() {
        return (length * breadth);
    }
}

class Bedroom extends Room {
    int height;

    Bedroom(int x, int y, int z) {
        super(x, y);
        height = z;
    }

    int volume() {
        return (length * breadth * height);
    }
}