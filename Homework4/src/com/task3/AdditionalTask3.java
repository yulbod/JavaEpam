package com.task3;

import java.util.Scanner;

public class AdditionalTask3 {
    public static void main(String[] args) {

        final int TWO = 2;
        Scanner scan = new Scanner(System.in);

        System.out.println("I'll show you last " + TWO +" reversed letters of your number. Enter a number:");
        int number = scan.nextInt();

        System.out.println("Reversed 2 letters of your number is  " + showReversedLetters(number, TWO));

    }

    public static String showReversedLetters(int number, int quantityReversedLet){
        String str = "" + number;
        String result = "";

        for (int i = str.length()-1; i>=str.length()-quantityReversedLet; i--){
            result += str.charAt(i);
        }

        return result;
    }

}
