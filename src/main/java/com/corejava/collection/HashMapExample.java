package com.corejava.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer,String> hmap = new HashMap<Integer, String>();

        hmap.put(12,"C");
        hmap.put(2,"R");
        hmap.put(7,"S");
        hmap.put(49,"A");

        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry mentry1 = (Map.Entry)iterator.next();
            System.out.println("Key: " + mentry1.getKey() + " Value: " + mentry1.getValue() );
        }

        hmap.remove(2);
    }
}
