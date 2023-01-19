package com.juaracoding.mafjavafundamental.testharian.pratikum_1;

/*
Created By IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author Asus a.k.a. muhammad abdul fajar
Java Developer
Created on 1/18/2023 7:02 PM
@Last Modified 1/18/2023 7:02 PM
Version 1.0
*/

import java.util.Scanner;

public class Pratikum1 {
    public static void main(String[] args)
    {
        // Jquery 1995@v1.0
        // Bebas Lepas@
        // Tid4k $@ma

        while (true) {
            Scanner myObj = new Scanner(System.in);
            System.out.print("Masukkan kata: ");
            String inputStr = myObj.nextLine();

            if (!inputStr.equals("!e")) {
                int total = 0;

                String[] inputArray = inputStr.split("");
                for (String output : inputArray) {
                    char ch = output.charAt(0);
                    int ascii = ch;

                    if (ascii >= 32 && ascii <= 90) { //Hanya meng-totalkan ascii desimal <32 ~ <91
                        total += ascii;
                    }
                    //System.out.println("ASCII value dari " + ch + " : " + ascii);
                }

                System.out.println("Output: " + total);
                System.out.println("");
            }else{
                break;
            }

        }
    }
}