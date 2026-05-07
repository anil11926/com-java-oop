package com.java.oop.abstraction;

public class Main {
    static void main(String[] args) {

        Customer customer = new Customer(1,"vinay","vinay@gmail.com","451236987896",7896541230L);
        ApplicationForm applicationForm = new ApplicationForm(1,"bunny",customer);
        Mro mro = new Mro(1,"MRO1",10000);
        Attender attender = new Attender(1,10000,"Attender",mro);
        PrintService printService = new ColourPrintService();

        CertificateService certificateService = new CertificateServiceImpl(attender);
        Certificate certificate = certificateService.getCertificate(applicationForm);
        printService.printCertificate(certificate);
        System.out.println("Id : " + certificate.id
                +   "\n Certificate Name : " + certificate.name
                + "\n Certificate Issued by : " + certificate.issuedBy
                + "\n Certificate Issued to : " + certificate.issuedTo
                +"\n Certificate Issued date : " + certificate.issuedDate );
        printService.printCertificate(certificate);
    }
}
