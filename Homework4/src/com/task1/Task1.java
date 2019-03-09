package com.task1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("I'll show you all unique symbols in your string. Enter a string: ");
            char[] str = scan.nextLine().toUpperCase().toCharArray();
            if (str.length != 0) System.out.println("Unique symbols: \n" + findingUniqueSymbols(str));
            else System.out.println("There is no string!");
    }


    public static String findingUniqueSymbols(char[] str){

        String unique = "";
        for (char symbol : str) {
            if (!unique.contains(Character.toString(symbol))){
                unique += symbol + " ";
            }
        }
        return unique;
    }

}
