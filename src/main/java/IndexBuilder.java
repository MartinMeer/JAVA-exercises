import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
public class IndexBuilder {
    private final String text;

    /**Метод принимает в качестве параметра текст и строит индекс на его основе.
     * Метод должен вернуть готовый индекс - структуру Map<Character, List<String>>,
     * в котором ключ - это символ, а значение - список слов из текста, начинающихся на эту букву*/
    public static Map<Character, List<String>> buildIndex(String text) {
        String[] words = text.toLowerCase().split(" ");
        HashMap<Character, List<String>> index = new HashMap<>();
            for (String word : words) {
            Character key = word.charAt(0);
            List<String> givenValue = index.getOrDefault(key, List.of(word));
            index.put(key, List.of(givenValue, word));
            }
        return index;
    }
}
