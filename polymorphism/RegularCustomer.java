package com.java.oop.polymorphism;

    class RegularCustomer extends Customer {
        void getDiscount(double price) {
            double finalPrice = price - (price * 0.10);
            System.out.println("Regular Customer Price: " + finalPrice);
        }
    }



