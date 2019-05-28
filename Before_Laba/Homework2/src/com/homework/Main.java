package com.homework;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        firstTask();

        secondTask();

        thirdTask();

        fourthTask();

    }


    public static void firstTask(){

        System.out.println(">>> 1 task \n " +
                            "Enter two numbers:");

        Scanner scan = new Scanner(System.in);
        int fir = scan.nextInt();
        int sec = scan.nextInt();
        fir = fir * sec;
        sec = fir / sec;
        fir = fir / sec;

        System.out.println("First number changed to " + fir + " and second number - to "+ sec);

    }

    public static void secondTask(){

        System.out.println(">>> 2 task \n" +
                            "Enter number to do math operations with it: ");

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int reversedNum = (number % 10 * 100 + (number / 10) % 10 * 10 + (number / 100));

        System.out.println(number + "-" + reversedNum + "=" + (number-reversedNum));
    }

    public static void thirdTask() {
        System.out.println(">>> 3 task \n" +
                            "Enter weight in pounds: ");

        Scanner scan = new Scanner(System.in);
        float weightF = scan.nextFloat();

        double weightK = weightF * 453.6 / 1000;
        System.out.println("Your weight in kg is " + (int)weightK + " kg "+ (weightK - (int)weightK)*1000 + " gr");

    }

    public static void fourthTask(){

        Scanner scan = new Scanner(System.in);

        System.out.println(">>> 4 task \n" +
                            "Enter deposit: ");
        double deposit = scan.nextDouble();
        System.out.println("Enter quantity of month: ");
        int month = scan.nextInt();
        System.out.println("Enter percent: ");
        double percent = scan.nextDouble();

        double profit = deposit * percent / 100 * month / 12;
        System.out.println("Profit of investment is " + profit);


    }








}
