package com.java.oop.collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("customer1");
        hs.add("customer2");
        hs.add("customer3");
        hs.add("customer4");
        hs.add("customer1");
        System.out.println(hs.size());
        System.out.println(hs.contains("customer1"));
        System.out.println(hs);

        Iterator<String> iterator = hs.iterator();
        while (iterator.hasNext()){
           // System.out.println(iterator.next());
            String name = iterator.next();
            System.out.println(name.toUpperCase());
        }
        // customer set
        HashSet<Customer> customerset = new HashSet<>();
        customerset.add(new Customer(11,"customer1","customer1@gfamil.com"));
        customerset.add(new Customer(22,"customer2","customer2@gfamil.com"));
        customerset.add(new Customer(33,"customer3","customer3@gfamil.com"));
        customerset.add(new Customer(11,"customer1","customer1@gfamil.com"));
        System.out.println(customerset);


    }
    }

