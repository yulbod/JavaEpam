package task1;

import java.util.Arrays;

public class IntegerArrayGenerator {


    public Integer[] generateIntArray(int size){
        Integer[] array = new Integer[size];

        for (int i = 0; i<array.length; i++) {
            array[i] = (int)(Math.random()*200);
        }
        return array;
    }

    public Integer[] sortIntArray(Integer[] array){
        Arrays.sort(array, (Integer a, Integer b) -> {
            return Integer.compare(b,a);});
        return array;
    }



}
