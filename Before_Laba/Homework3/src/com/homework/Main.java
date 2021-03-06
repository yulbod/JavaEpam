package com.homework;

import java.util.Scanner;

public class Main {

    static int height = 5;          // defining height of the figures

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String menu = " 1. Press 1 to draw first kind of figure.\n" +
                " 2. Press 2 to draw second kind of figure.\n" +
                " 3. Press 3 to draw third kind of figure.\n" +
                " 4. Press 4 to draw fourth kind of figure.\n" +
                " 5. Press 5 to draw fifth kind of figure.\n" +
                " 6. Press 6 to exit." ;
        System.out.println(menu);

        boolean isQuit = false;
        while (!isQuit) {
            System.out.print("Your choice is --> ");
            byte choice = scan.nextByte();

            switch (choice) {

                case 1:
                    firstFig();
                    break;

                case 2:
                    secondFig();
                    break;

                case 3:
                    thirdFig();
                    break;

                case 4:
                    fourthFig();
                    break;

                case 5:
                    fifthFig();

                    break;
                case 6:
                    return;

                default:
                    System.out.println("There is no such menu.");
                    break;
            }

            System.out.println(menu);
        }

    }

    public  static void firstFig(){

        for (int line=0; line<height; line++){
            for (int y =0 ; y<line; y++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
         for (int line = height; line >0; line--) {
             for (int y = line  ; y>0; y--) {
                 System.out.print(" * ");
             }
             System.out.print("\n");
         }
    }

    public  static void secondFig(){
        for (int line = height; line>0; line--){

            for (int y = height; y>line; y--){
                System.out.print("   ");
            }

            for (int y = 0; y<line; y++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }

    public static void thirdFig(){
        for (int line = 1; line<=height; line++){

            for (int y = height; y>line; y--){
                System.out.print("   ");
            }

            for (int y = 0; y<line; y++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }

    public static void fourthFig(){
        for (int line = 1; line<height; line++){

            for (int y = height; y>line; y--){
                System.out.print("   ");
            }

            for (int y = 0; y<line; y++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
        for (int line = height; line>0; line--){

            for (int y = height; y>line; y--){
                System.out.print("   ");
            }

            for (int y = 0; y<line; y++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }

    }

    public static void fifthFig(){
        int iterator = 0;

        while (iterator < 2){             //circle for two triangle

            for (int line = 1; line<=height; line++){

                for (int y = height; y>line; y--){
                    System.out.print("   ");
                }

                for (int y = 0; y<line; y++){
                    System.out.print(" * ");
                }

                for (int y = 1; y<line; y++){
                    System.out.print(" * ");
                }
                for (int y = height; y>line; y--){
                    System.out.print("   ");
                }

                System.out.print("\n");
            }
            iterator++;
        }

    }


}
