import lombok.AllArgsConstructor;

import java.util.HashMap;

@AllArgsConstructor
public class WordCounter {
    private final String sentence;

    public static HashMap<String, Integer> wordsCounter(String str) {
        HashMap<String, Integer> wordWithCount = new HashMap<>();
        String[] words = str.toLowerCase().split("[\\s!#$%&'()*+,-./:;<=>?@^_`{|}~]");
        for (String word : words) {
            int counter = wordWithCount.getOrDefault(word, 0);
            wordWithCount.put(word, counter + 1);

        }
        wordWithCount.remove("");
        return wordWithCount;
    }


}
