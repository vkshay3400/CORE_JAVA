package com.corejava.collection;

public class EqualMethodEqualOperator2 {
    public static Object obj1 = new Object();
    public static Object obj2 = new Object();

    public static void main(String[] args) {
        //OPERATOR DIFFERENT OBJECT
        boolean result = (obj1 == obj2);
        System.out.println("Comparing two using  == : " + result);

        //EQUAL METHOD SINCE STRING CONTAINS SAME CONTENT
        result = obj1.equals(obj2);
        System.out.println("Comparing two using  equal method : " + result);

        //COMPARING TWO REFERENCE POINTING
        obj2 = obj1;
        result = (obj1 == obj2);
        System.out.println("Comparing two reference pointing to same string: " + result);
    }
}

/*
OUTPUT ->
false
false
true
 */