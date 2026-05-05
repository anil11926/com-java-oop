package com.java.oop.polymorphism;

class PremiumCustomer extends Customer {
    void getDiscount(double price) {
        double finalPrice = price - (price * 0.20);
        System.out.println("Premium Customer Price: " + finalPrice);
    }
}
