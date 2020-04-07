package com.corejava.collection;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashtableDemo {

    public static void main(String args[]) {

//Creating Hashtable for example
        Hashtable companies = new Hashtable();

//Put(key, value) is used to insert object into map
        companies.put("Google", "United States");
        companies.put("Nokia", "Finland");
        companies.put("Sony", "Japan");

//Get(key) method is used to retrieve Objects from Hashtable
        companies.get("Google");

//Use containsKey(Object) method to check if an Object exits as key in
        System.out.println("Does hashtable contains Google as key: "
                + companies.containsKey("Google"));

//Hashtable containsValue Example
        System.out.println("Does hashtable contains Japan as value: "
                + companies.containsValue("Japan"));

//Hashtable elements() return enumeration of all hashtable values
        Enumeration enumeration = companies.elements();

        while (enumeration.hasMoreElements()) {
            System.out
                    .println("hashtable values: " + enumeration.nextElement());
        }

        System.out.println("Is companies hashtable empty: "
                + companies.isEmpty());

        System.out.println("Size of hashtable in Java: " + companies.size());

//To get all values form hashtable
        Set hashtableKeys = companies.keySet();

//Get enumeration of all keys by using method keys()
        Enumeration hashtableKeysEnum = companies.keys();
        Enumeration hashtableValuesEnum = companies.elements();

        Collection hashtableValues = companies.values();
        companies.clear();
    }
}