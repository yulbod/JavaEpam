package task1;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static UserStringFilter stringFilter = (String s) -> {return s.startsWith("A");};
    public static UserIntegerFilter intFilter = (int num) -> {return num > 10;};

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

        System.out.println("Filter:");
        arrList = stringListGenerator.filterListBy(arrList, stringFilter);
        stringListGenerator.showList(arrList);

    }

    public static void testIntegerArray(){
        IntegerArrayGenerator integerArrayGenerator = new IntegerArrayGenerator();
        Integer[] intArr = integerArrayGenerator.generateIntArray(6);

        System.out.println(Arrays.toString(intArr));

        intArr = integerArrayGenerator.sortIntArray(intArr);
        System.out.println(Arrays.toString(intArr));

        System.out.println("Filter:");
        Integer[] intArrNew = integerArrayGenerator.filterListBy(intArr, intFilter);
        System.out.println("Old array:");
        System.out.println(Arrays.toString(intArr));
        System.out.println("Filtered array:");
        System.out.println(Arrays.toString(intArrNew));


    }

}
