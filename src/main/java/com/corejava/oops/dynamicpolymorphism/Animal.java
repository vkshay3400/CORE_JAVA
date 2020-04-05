package com.corejava.oops.dynamicpolymorphism;

class Animal {
    public void eat() {
        System.out.println("This animal eats insects.");
    }
}

class Bird extends Animal {

    public void eat() {
        System.out.println("This bird eats seeds.");
    }

}
