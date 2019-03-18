package extra.task1;

import java.util.Scanner;

public class ExtraTask1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a size of array:");
        int size = scan.nextInt();
        if (size > 0 && size < 2000000 ) {
            int[] array = new int[size];

            //region INITIALIZE BY RANDOM AND SHOW ARRAY
            array = randomFillArray(array);                 //fill array
            System.out.println("\nThis is your array:");
            showArray(array);                               //show array
            //endregion

            int quantityAboveAverage = 0, temp = 0;         //sum of all elements
            for (int i = 0; i<array.length; i++){
                temp += array[i];
                //System.out.println(temp);
            }

            float average =  (temp/(float)array.length);
            System.out.print("\nAverage is ");
            System.out.format("%.3f%n", average);

            for (int i = 0; i<array.length; i++){
                if(array[i]>average) quantityAboveAverage++;
            }

            System.out.println("Quantity of elements that are larger than average is " + quantityAboveAverage + ".");
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
