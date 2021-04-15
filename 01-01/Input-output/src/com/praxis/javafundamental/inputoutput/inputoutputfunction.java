package com.praxis.javafundamental.inputoutput;

import java.util.Scanner;

public class inputoutputfunction {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Program penjumlahan sangat sederhana");
        System.out.print("Masukan angka pertama : ");
        int value = input.nextInt();
        System.out.print("Masukan Angka kedua : ");
        int anotherValue = input.nextInt();
        int result = value + anotherValue;
        System.out.println("Hasilnya adalah : " + result);

    }
}
