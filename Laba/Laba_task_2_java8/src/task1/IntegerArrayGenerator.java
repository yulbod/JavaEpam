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
        Integer[] arraySorted = Arrays.copyOf(array, array.length);
        Arrays.sort(arraySorted, (Integer a, Integer b) -> {
            return Integer.compare(b,a);});
        return arraySorted;
    }

    public Integer[] filterListBy(Integer[] array, UserIntegerFilter filter){
        Integer[] result = new Integer[array.length];
        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            if (filter.filterArrayInteger(array[i])){
                result[temp] = array[i];
                temp++;
            }
        }
        return result;
    }


}
