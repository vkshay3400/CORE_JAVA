package com.corejava.collection;

public class EqualMethodEqualOperator1 {
    public static String personalLoan = new String("Cheap Loan");
    public static String homeLoan = new String("Cheap Loan");

    public static void main(String[] args) {
        //OPERATOR DIFFERENT OBJECT
        boolean result = personalLoan == homeLoan;
        System.out.println("Comparing two using  == : " + result);

        //EQUAL METHOD SINCE STRING CONTAINS SAME CONTENT
        result = personalLoan.equals(homeLoan);
        System.out.println("Comparing two using  equal method : " + result);

        //COMPARING TWO REFERENCE POINTING
        homeLoan = personalLoan;
        result = (personalLoan == homeLoan);
        System.out.println("Comparing two reference pointing to same string: " + result);
    }
}

/*
OUTPUT ->
false
true
true
 */