package com.corejava.basic;

import java.util.Stack;

public class AutoUnBox {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<Integer>();

        myStack.push(10);  // autobox
        myStack.push(20);

        int stackSum = myStack.pop() + myStack.pop();  //unbox
        System.out.println("Topmost: " + myStack.pop());
        System.out.println("Nextmost: " + myStack.pop());

        System.out.println("Add stack 1 +2: " + stackSum);
    }
}
