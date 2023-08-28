package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    private Map<String, Integer> wordCountMap = new HashMap<>();
    public WordCounter(String... strings) {
        for(String s : strings){
            if (wordCountMap.containsKey(s)){
                wordCountMap.replace(s, wordCountMap.get(s), wordCountMap.get(s) + 1);
            } else {
                wordCountMap.put(s, 1);
            }
        }
    }

    public Map<String, Integer> getWordCountMap() {
        return wordCountMap;
    }
}
