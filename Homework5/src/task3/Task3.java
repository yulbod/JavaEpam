package task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a size for three arrays:");
        int size = scan.nextInt();

        if (size>0) {
            int[] array1 = new int[size];
            int[] array2 = new int[size];
            for (int i = 0; i<size ; i++){
                array1[i] = (int) (Math.random()*10);
                array2[i] = (int) (Math.random()*10);
            }
            System.out.println("First two arrays:");
            for (int i = 0;i<size; i++){
                System.out.print(array1[i] + " ");
            }
            System.out.println();
            for (int i = 0;i<size; i++){
                System.out.print(array2[i] + " ");
            }

            int[] array3 = new int[size];
            for (int i = 0;i<size; i++){
                array3[i] = array1[i] + array2[i];
            }

            System.out.println("\nThere is a third array, whose items are a sum of first two arrays' items: ");
            for (int i = 0;i<size; i++){
                System.out.print(array3[i] + " ");
            }
        } else System.out.println("Wrong data!");
    }
}
