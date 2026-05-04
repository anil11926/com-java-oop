package com.java.oop.abstraction;

public class Attender {
    int id;
    int money;
    String name;
    Mro mro;

    public Attender(int id, int money,String name, Mro mro) {
        this.id = id;
        this.money = money;
        this.name = name;
        this.mro = mro;
    }
    Certificate processsCertificate(ApplicationForm form){
        if (money > 500){
            return mro.generatecertificate(form);
        }else {
            return null;
        }
    }


}
