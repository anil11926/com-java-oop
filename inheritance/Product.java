package com.java.oop.inheritance;

public class Product {
    int id;
    String name;
    int maxRetailPrice;
    byte discountPercentage;
    float ratings;
    int reviewsCount;
    short manufacturedYear;
    String company;
    String category;

    public Product(int id, String name, int maxRetailPrice, byte discountPercentage, float rating, int reviewsCount, short manufacturedYear, String company, String category) {

        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.discountPercentage = discountPercentage;
        this.ratings = ratings;
        this.reviewsCount = reviewsCount;
        this.manufacturedYear = manufacturedYear;
        this.company = company;
        this.category = category;
    }
    double getDiscountedPrice() {
        return maxRetailPrice - (maxRetailPrice * discountPercentage / 100);
    }

    }



