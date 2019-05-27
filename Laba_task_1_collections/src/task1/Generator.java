package task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Generator {
    public Generator() {
    }

    public List<Integer> generateList(int length, int firstElement, int lastElement){
        List <Integer> list = new ArrayList<>();
        int currentElement = firstElement;
        for (int i =0; i<length; i++){
            list.add(currentElement);
            currentElement++;
            if (currentElement>lastElement) {
                currentElement = firstElement;
            }
        }
        return list;
    }


    public Set<Integer> generateSet(int length, int firstElement, int lastElement){
        Set<Integer> set = new HashSet<>();
        int currentElement = firstElement;
        for (int i =0; i<length; i++){
            set.add(currentElement);
            currentElement++;
            if (currentElement>lastElement) {
                currentElement = firstElement;
            }
        }
        return set;
    }

    // write universal function @generate@
}
