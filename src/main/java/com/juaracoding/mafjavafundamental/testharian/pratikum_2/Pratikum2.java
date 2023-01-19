package com.juaracoding.mafjavafundamental.testharian.pratikum_2;

/*
Created By IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author Asus a.k.a. muhammad abdul fajar
Java Developer
Created on 1/19/2023 9:21 AM
@Last Modified 1/19/2023 9:21 AM
Version 1.0
*/

//import java.util.Scanner;

//public class Pratikum2 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//            double sum = 0;
//            int count = 0;
//            while (true) {
//                try {
//                    double num = input.nextDouble();
//                    sum += num;
//                    count++;
//               } catch (Exception e) {
//                    break;
//                }
//            }
//
//            double average = sum / count;
//            System.out.println("Rata-rata: " + average);
//        }
//
//}

import java.util.Scanner;

public class Pratikum2 {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama depan: ");
        String firstName = input.nextLine();
        System.out.print("Masukkan nama belakang: ");
        String lastName = input.nextLine();


        String inisial = (firstName.toUpperCase().charAt(0) + "." + lastName.toUpperCase().charAt(0));
        System.out.println("Inisial " + firstName + " " + lastName + " adalah " + inisial);
    }
}