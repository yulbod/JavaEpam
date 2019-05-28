package task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class StringListGenerator {
    public static final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String lower = upper.toLowerCase();
    public static final String digits = "0123456789";
    public static final String alphanum = upper + lower + digits;
    private Random random;
    private char[] symbols;


    public StringListGenerator() {
        random = null;
        symbols = new char[0];
    }

    public ArrayList<String> generateArrayList(int size) {
        if (size < 1 )
            throw new IllegalArgumentException("Size of list less than 1!");

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            String str = createNewString();
            list.add(str);
        }
        return list;
    }

    private String createNewString(){
        random = new Random();
        int stringLength = (int)(Math.random()*8 + 2);

        symbols = new char[stringLength];

        for (int i = 0; i < symbols.length; i++){
            symbols[i] = alphanum.toCharArray()[random.nextInt(alphanum.length())];
        }

        return new String(symbols);
    }

    public ArrayList<String> sortList(ArrayList<String> list){
        checkExisting(list);
        ArrayList sortedList = (ArrayList) list.clone();
        Collections.sort(sortedList, (String a, String b)->{
            return b.compareTo(a); });

        return sortedList;
    }

    public void showList(ArrayList<String> list){
        System.out.println("List:");
        for (String str:
             list) {
            System.out.println(str);
        }
    }

    public void checkExisting(ArrayList<String> list){
        if (list == null || list.size() < 1) throw new IllegalArgumentException("List is empty!");
    }

    public ArrayList<String> filterListBy(ArrayList<String> list, UserStringFilter filter){
        ArrayList<String> result = new ArrayList<>();
        for (String str:
             list) {
            if (filter.filterListStrings(str)){
                result.add(str);
            }
        }
        return result;
    }
}
