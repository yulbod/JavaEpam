package extra.task2;

import java.util.Scanner;

public class ExtraTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a size of first array:");
        int size1 = scan.nextInt();
        System.out.println("Enter a size of second array:");
        int size2 = scan.nextInt();
        if (size1 > 0 && size1 < 2000000 && size2 > 0 && size2 < 2000000) {
            int[] array1 = new int[size1];
            int[] array2 = new int[size2];

            //region INITIALIZE BY RANDOM AND SHOW ARRAY

            array1 = randomFillArray(array1);                 //fill array
            System.out.println("\nThis is your first array:");
            showArray(array1);

            array2 = randomFillArray(array2);
            System.out.println("\nThis is your second array:");
            showArray(array2);
            //endregion

            int[] array3 = new int[size1+size2];
            for (int i = 0; i<size1; i++) {
                array3[i] = array1[i];
            }
            for (int i = 0; i<size2; i++){
                array3[size1+i] = array2[i];
            }
            System.out.println("\nThat is a third array:");
            showArray(array3);

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
