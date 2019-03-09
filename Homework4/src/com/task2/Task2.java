package com.task2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        final int TWO = 2;
        System.out.println("I'll show you a number expressed in the base-" + TWO +" numeral system. \nEnter an integer: ");
        int number = scan.nextInt();
        String binaryResult = binaryView(number>0?number:-number, TWO);
        System.out.println("Binary: " + binaryResult);

    }

    public static String binaryView(int entered, int base){
        int number = entered;
        String result = "";

        do {
            result = number%2 + result;
            number /= base;
        } while (number > 0);

        return result;
    }

}
