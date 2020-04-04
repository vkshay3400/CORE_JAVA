package com.corejava.basic;

class MultiClass1 {
    public static int area;

    public static void main(String[] args) {
        RoomArea room1 = new RoomArea();
        room1.getData(5, 14);

        RoomArea.RoomPerimeter room2 = new RoomArea.RoomPerimeter();
        room2.getData(15, 14);

        area = room1.length * room1.breadth;
        System.out.println("Area : " + area);

        area = room2.length + room1.breadth;
        System.out.println("Area : " + area);
    }
}

class RoomArea {
    int length;
    int breadth;

    void getData(int a, int b) {
        length = a;
        breadth = b;
    }

    static class RoomPerimeter {
        int length;
        int breadth;

        void getData(int a, int b) {
            length = a;
            breadth = b;
        }
    }
}