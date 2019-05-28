package extra.task3;

import java.util.Scanner;
import java.util.Arrays;
public class ExtraTask3 {
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

        int max = array[0], min = array[0];
        for (int item:array) {
            if (item>max) max = item;
            if (item<min) min = item;
        }
        System.out.println("\nmin="+min + ", max=" + max);
        for (int i= 0; :array) {
            if (item == max || item ==min) item = 0;
        }
        System.out.println(Arrays.toString(array));

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
