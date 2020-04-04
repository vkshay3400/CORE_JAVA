package com.corejava.basic;

class MultiClass2 {
    public static int area;

    public static void main(String[] args) {
        RoomAreas room1 = new RoomAreas();
        room1.getData(2, 3);
        boolean bool = 2 < 3;
        System.out.println("bool: " + bool);

        RoomAreas.RoomPerimeter room2 = new RoomAreas.RoomPerimeter();
        room2.getData(5, 4);

        //WAYS TO WRITE OUTPUT LINE
        area = room1.length * room1.breadth;
        System.out.println
                ("Area : " + area);

        area = room2.length + room2.breadth;
        System
                .
                        out
                .
                        println(
                                "Area : " + area
                        );
    }
}
