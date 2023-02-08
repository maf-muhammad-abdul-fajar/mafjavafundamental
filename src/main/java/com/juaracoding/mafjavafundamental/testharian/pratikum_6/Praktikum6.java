package com.juaracoding.mafjavafundamental.testharian.pratikum_6;

/*
Created By IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author Asus a.k.a. muhammad abdul fajar
Java Developer
Created on 2/9/2023 6:38 AM
@Last Modified 2/9/2023 6:38 AM
Version 1.0
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Praktikum6 {
    /*
     * Soal Nomor 1 Praktikum 6 Java Fundamental
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> inputNumbers = new ArrayList<>();

        System.out.println("Masukkan angka (huruf untuk berhenti) : ");

        while (sc.hasNextInt()) {
            inputNumbers.add(sc.nextInt());
        }

        System.out.println("Angka yang anda input adalah : " + inputNumbers.toString());

        Collections.sort(inputNumbers);
        System.out.println("Setelah diurutkan menjadi : " + inputNumbers.toString());

        sc.close();
    }
}


