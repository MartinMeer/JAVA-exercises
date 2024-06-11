import lombok.AllArgsConstructor;

import java.util.HashMap;

@AllArgsConstructor
public class WordCounter {
    private final String sentence;

    public static HashMap<String, Integer> wordsCounter(String str) {
        HashMap<String, Integer> wordWithCount = new HashMap<>();
        String[] words = str.toLowerCase().split("[\\s!#$%&'()*+,-./:;<=>?@^_`{|}~]");
        for (String word : words) {

        }
        wordWithCount.remove("");
        return wordWithCount;
    }


}
