package com.java.oop.inheritance;

public class RegularCustomer extends Customer{
    String membershipType;
    int shippingCharges;
    public RegularCustomer(int id, String name, byte age, char gender, String email, long phoneNumber, String address, String membership, int shippingCharges) {
        super(id, name, age, gender, email, phoneNumber, address);
        this.membershipType = membership;
        this.shippingCharges = shippingCharges;
    }
    double calculateFinalPrice(Product product) {
        return product.getDiscountedPrice() +shippingCharges;
    }


    void display(Product product) {
        super.display(product);
        System.out.println("membership :" +membershipType);
        System.out.println("shipping charges :" +shippingCharges);
        System.out.println("final price :" +calculateFinalPrice(product));
    }

}
