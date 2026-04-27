package com.java.oop.inheritance;

public class PremiumCustomer extends Customer{
    String membershiptype;
    int shippingCharges;

    public PremiumCustomer(int id, String name, byte age, char gender, String email, long phoneNumber, String address, String membership, int shippingCharges) {
        super(id, name, age, gender, email, phoneNumber, address);
        this.membershiptype = membership;
        this.shippingCharges = shippingCharges;
    }
    double calculateFinalPrice(Product product) {
        double price = product.getDiscountedPrice();
        return  price - (price * product.discountPercentage / 100);
    }

    void display(Product product) {
        super.display(product);
        System.out.println("membership :" + membershiptype);
        System.out.println("shipping charges :" + shippingCharges);
        System.out.println("extra discount : +20%");
        System.out.println("final price :" + calculateFinalPrice(product));
    }
}
