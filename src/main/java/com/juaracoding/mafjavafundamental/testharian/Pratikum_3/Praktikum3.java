package com.juaracoding.mafjavafundamental.testharian.Pratikum_3;

/*
Created By IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author Asus a.k.a. muhammad abdul fajar
Java Developer
Created on 1/23/2023 8:07 AM
@Last Modified 1/23/2023 8:07 AM
Version 1.0
*/

import java.util.Scanner;

public class Praktikum3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah detik: ");
        int detik = input.nextInt();
        int menit = detik / 60;
        int sisaDetik = detik % 60;
        System.out.println(detik + " detik sama dengan " +  menit + " menit " + sisaDetik + " detik");
    }
}