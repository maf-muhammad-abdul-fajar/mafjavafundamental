package com.juaracoding.mafjavafundamental.testharian.praktikum_4;
/*
Created By IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author Asus a.k.a. muhammad abdul fajar
Java Developer
Created on 2/1/2023 1:31 PM
@Last Modified 2/1/2023 1:31 PM
Version 1.0
*/

import java.util.Random;

public class Praktikum4 {
    public static void main(String[] args) {
        StringBuilder email = new StringBuilder();
        Random random = new Random();

        // Karakter campuran
        int length = random.nextInt(15);
        for (int i = 1; i < length; i++) {
            char c = (char) (97+random.nextInt(122-97+1));
            email.append(c);
        }

        // Tanda sambung (underscore atau titik)
        email.append(random.nextInt(2) == 0 ? '_' : '.');

        // Karakter campuran
        length = random.nextInt(15);
        for (int i = 1; i < length; i++) {
            char c = (char) (97+random.nextInt(122-97+1));
            email.append(c);
        }

        // Angka 2 digit
        email.append(String.format("%02d", random.nextInt(100)));

        // @
        email.append("@");

        // Email provider
        String[] providers = {"gmail", "hotmail", "yahoo", "ymail"};
        email.append(providers[random.nextInt(providers.length)]);

        // Titik
        email.append(".");

        // Domain
        String[] domains = {"com", "edu", "co.id", "gov"};
        email.append(domains[random.nextInt(domains.length)]);

        System.out.println("Output: " + email.toString());
    }
}

