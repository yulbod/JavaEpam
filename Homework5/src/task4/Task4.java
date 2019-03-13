package task4;

import java.util.Scanner;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a size for three arrays:");
        int size = scan.nextInt();

        if (size>0) {
            float[] array = new float[size];
            int quantityPositive = 0;
            for (int i = 0; i < size; i++) {
                array[i] = (float) (-10 + Math.random() * 20);
            }
            System.out.println("\nThis is your array:");
            for (int i = 0; i < size; i++) {
                if (array[i]>=0) quantityPositive++;
                System.out.print(array[i] + " ");
            }
            System.out.println("\nDividing on two arrays - with positive and negative numbers...");
            float[] posArray = new float[quantityPositive];
            float[] negArray = new float[size-quantityPositive];
            int positionPosit =0,positionNegat =0;
            for(int i = 0; i<size; i++){
                if (array[i]>=0) {
                    posArray[positionPosit] = array[i];
                    positionPosit++;
                } else {
                    negArray[positionNegat] = array[i];
                    positionNegat++;
                }
            }
            System.out.println("\nPositive arr:");
            for (int i = 0; i < posArray.length; i++) {
                System.out.print(posArray[i] + " ");
            }
            System.out.println("\nNegative arr:");
            for (int i = 0; i < negArray.length; i++) {
                System.out.print(negArray[i] + " ");
            }

        } else System.out.println("Wrong data!");
    }
}
