

import java.util.*;


public class IndexBuilder {
    private final String text;

    public IndexBuilder(String text) {
        this.text = text;
    }

    /**Метод принимает в качестве параметра текст и строит индекс на его основе.
     * Метод должен вернуть готовый индекс - структуру Map<Character, List<String>>,
     * в котором ключ - это символ, а значение - список слов из текста, начинающихся на эту букву*/
//    public static Map<Character, List<String>> buildIndex(String text) {
//        if (text.equals("")) {
//            return Map.of();
//        }
//        String[] words = text.toLowerCase().split(" ");
//        HashMap<Character, List<String>> index = new HashMap<>();
//            for (String word : words) {
//            Character key = word.charAt(0);
//            ArrayList<String> values = new ArrayList<>(index.getOrDefault(key, List.of(word)));
//                if (!values.contains(word)) {
//                    values.add(word);
//                }
//            index.put(key, values);
//            }
//        return index;
//    }
    public static Map<Character, List<String>> buildIndex(String text) {

        var index = new HashMap<Character, List<String>>();

        if (text.isEmpty()) {
            return index;
        }

        var words = text.split(" ");

        for (var word : words) {
            var firstChar = word.charAt(0);
            var innerWords = index.getOrDefault(firstChar, new ArrayList<String>());
            innerWords.add(word);
            index.put(firstChar, innerWords);
        }

        return index;

    }
}
