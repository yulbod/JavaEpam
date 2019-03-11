package com.task4;

import java.util.Scanner;

public class AdditionalTask4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("I'll show you a pyramid, enter a height:");
        int height = scan.nextInt();
        enterPyramid(height);

    }

    public static void enterPyramid(int height){
        for (int i = 0; i <=height; i++){
            for (int y = 1; y<=i+1; y++) System.out.print(y);
            for (int y = i; y>0; y--) System.out.print(y);
            System.out.println();
        }
    }
}
