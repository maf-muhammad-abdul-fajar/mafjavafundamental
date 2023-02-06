package com.juaracoding.mafjavafundamental.testharian.praktikum_5;

/*
Created By IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author Asus a.k.a. muhammad abdul fajar
Java Developer
Created on 2/6/2023 11:38 AM
@Last Modified 2/6/2023 11:38 AM
Version 1.0
*/
import java.util.Scanner;
public class Praktikkum5 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan tinggi segitiga: ");
    int tinggi = input.nextInt();

    for (int baris = 1; baris <= tinggi; baris++) {
        for (int spasi = 1; spasi <= tinggi - baris; spasi++) {
            System.out.print(" ");
        }
        for (int angka = baris; angka >= 1; angka--) {
            System.out.print(angka);
        }
        System.out.println();
    }
}
}





