package com.corejava.basic;

class ArraySortingAlphabets {
    public static void main(String[] args) {

        System.out.println("Array");

        String name[] = {"Madras","Delhi","Pune","Nagpur"};
        int size = name.length;

        System.out.println("Given list ");
        for (int i = 0; i < size; i++) {
            System.out.print(name[i] + " ");
        }

        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if (name[j].compareTo(name[i]) < 0 ){
                    String temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }

        }

        System.out.println("\n" + "After list");
        for (int i = 0; i < size; i++) {

            System.out.print(name[i] + " ");
        }
    }
}