package com.java.oop;

public class Product {
    int id;
    String name;
    long maxRetailPrice;
    float rating;
    int reviewsCount;
    byte discountPercentage;
    boolean isAvailable;
    String company;
    String category ;

    public Product(int id, String name, long maxRetailPrice, float rating, int reviewsCount, byte discountPercentage, boolean isAvailable, String company, String category) {
        System.out.println("Constructor called");
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.rating = rating;
        this.reviewsCount = reviewsCount;
        this.discountPercentage = discountPercentage;
        this.isAvailable = isAvailable;
        this.company = company;
        this.category = category;
    }

    public Product() {
        System.out.println("Constructor called");
        id = 456;
        name = "OnePlus 15 5G (Sand Storm, 256 GB) (12 GB RAM)";
        maxRetailPrice = 76990;
        rating = 4.7F;
        reviewsCount = 135;
        discountPercentage = 15;
        isAvailable = true;
        company = "one plus";
        category = "Mobile";




    }
}
