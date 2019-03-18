package task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a size of array:");
        int size = scan.nextInt();
        if (size > 0 && size < 2000000 ) {
            int[] array = new int[size];
            array = randomFillArray(array);

            System.out.println("\nThis is your array:");
            showArray(array);

            int quantityOddNum = 0;
            System.out.println("\nThere are only odd numbers:");
            for (int i = 0; i < size; i++) {
                if (array[i] % 2 != 0) {
                    quantityOddNum++;
                    System.out.print(array[i] + " ");
                }
            }
            System.out.println("\nQuantity of odd numbers is " + quantityOddNum);
        }
        else System.out.println("Wrong data!");
    }

    public static int[] randomFillArray(int[] arr){
        for (int i = 0; i <arr.length; i++) {
            arr[i] = (int) (Math.random() * 20);
        }
        return arr;
    }

    public static void showArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
