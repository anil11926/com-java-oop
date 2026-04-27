package com.java.oop.inheritance;

public class Customer {
    int id;
    String name;
    byte age;
    char gender;
    String email;
    long mobileNumber;
    String address;

    public Customer(int id, String name, byte age, char gender, String email, long phoneNumber, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.mobileNumber = phoneNumber;
    }
    double calculateFinalPrice(Product product){
        return product.getDiscountedPrice();
    }
    void displayCustomerDetails(){
        System.out.println("id :" +id);
        System.out.println("name :" +name);
        System.out.println("age :" +age);
        System.out.println("email :" +email);
        System.out.println("gender :" +gender);
        System.out.println("mobile no :" +mobileNumber);
    }
    void display(Product product){
        displayCustomerDetails();
        System.out.println("name :" +product.name);
        System.out.println("category :" +product.category);
        System.out.println("company :" +product.company);
        System.out.println("reviews :" +product.reviewsCount);
        System.out.println("rating :" +product.ratings);
        System.out.println("max retail Price :" +product.maxRetailPrice);
        System.out.println("discount :" +product.discountPercentage);
        System.out.println("price after discount :" +product.getDiscountedPrice());
    }

}
