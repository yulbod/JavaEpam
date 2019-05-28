package task1;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        testStringList();
        testIntegerArray();
    }

    public static void testStringList(){
        StringListGenerator stringListGenerator = new StringListGenerator();
        ArrayList<String> arrList = stringListGenerator.generateArrayList(5);

        stringListGenerator.showList(arrList);
        arrList = stringListGenerator.sortList(arrList);

        System.out.print("Sorted ");
        stringListGenerator.showList(arrList);
    }

    public static void testIntegerArray(){
        IntegerArrayGenerator integerArrayGenerator = new IntegerArrayGenerator();
        Integer[] intArr = integerArrayGenerator.generateIntArray(6);

        System.out.println(Arrays.toString(intArr));

        intArr = integerArrayGenerator.sortIntArray(intArr);
        System.out.println(Arrays.toString(intArr));
    }

}
