package task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Translator {
    private Map<String, String> dictionary;

    public Translator() {
         dictionary = new HashMap<>();
    }

    public void addWord(String englishWord, String russianWord){
        dictionary.put(englishWord, russianWord);
    }

    public String translate(String words){      //english sentence
        String[] wordsArray = words.split("[\\s,.]+");
        List<String> resultTranslationList = new ArrayList<>();
        for (String word:
             wordsArray) {
            if (dictionary.containsKey(word)){
                resultTranslationList.add(dictionary.get(word));
            }
            else {resultTranslationList.add(word);
            }
        }
        return String.join(" ", resultTranslationList);
    }
}
