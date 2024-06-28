
import java.util.List;
import java.util.stream.Collectors;

public class MyStringUtis {

    private String string;


    public static String capitalise(String string) {
        if (string.isEmpty()) {
            return "";
        }
        var words = List.of(string.split("[\\s\\p{Punct}]"));
        return words.stream()
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
                .collect(Collectors.joining(" "));
    }
}
