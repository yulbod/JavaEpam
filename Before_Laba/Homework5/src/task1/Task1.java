package task1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a size of array:");
        int size = scan.nextInt();
        int[] array = new int[size];
        for(int i = 0; i<size; i++){
            array[i] = (int) (Math.random()*10);
        }
        System.out.println("Direct order:");
        for(int i = 0; i<size; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\nReversed order:");
        for(int i = size-1; i>=0; i--){
            System.out.print(array[i] + " ");
        }

    }
}
