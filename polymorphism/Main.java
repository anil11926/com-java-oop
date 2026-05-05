package com.java.oop.polymorphism;

public class Main {
    public static void main(String[] args) {

        Customer c;

        c = new RegularCustomer();
        c.getDiscount(1000);

        c = new PremiumCustomer();
        c.getDiscount(1000);
    }
}
