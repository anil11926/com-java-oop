package com.java.oop.abstraction;

import com.java.oop.Customer;

public class Main {
    static void main(String[] args) {

        Customer customer=new Customer(1,"Customer1","customer1@gamil.com","451278963254",4578963214L);
        ApplicationForm applicationForm = new ApplicationForm(1,"birth Certificate",customer);
        Mro mro = new Mro(1,"MRO1",10000);
        Attender attender = new Attender(1,10000,"Attender",mro);

        CertificateService certificateService = new CertificateServiceImpl(attender);
        Certificate certificate = certificateService.getCertificate(applicationForm);
        System.out.println("Id : " + certificate.id
             +   "\n Name : " + certificate.name
        + "\n Name : " + certificate.issuedBy
        + "\n Name : " + certificate.issuedTo
                +"\n Name : " + certificate.issuedDate );
    }
}
