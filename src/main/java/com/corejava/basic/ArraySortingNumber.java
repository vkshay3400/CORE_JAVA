package com.corejava.basic;

class ArraySortingNumber {
    public static void main(String[] args) {

        System.out.println("Array");

        int[] number = {55, 40, 80, 65, 71};
        int n = number.length;
        System.out.println("Given list ");
        for (int i = 0; i < n; i++) {
            System.out.print(number[i] + " ");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (number[i] < number[j]) {
                    int temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }

        }

        System.out.println("\n" + "After list");
        for (int i = 0; i < n; i++) {

            System.out.print(number[i] + " ");
        }
    }
}