import org.apache.commons.lang3.StringUtils;

import java.util.StringJoiner;

public class MyStringUtils {
    public static String capitalizeWords(String text) {
        /*String capitalizedString = "";
        String[] splittedString = text.split(" ");
        for (String word : splittedString) {
            char firstChar = word.charAt(0);
            char capitalizedChar = Character.toUpperCase(firstChar);
            String capitalizedWord = word.replace(firstChar, capitalizedChar);
            capitalizedString += (capitalizedWord + " ");
        }*/
        String[] words = text.split(" ");
        //StringJoiner sj = new StringJoiner(" ");
        var capitalizedString = new StringJoiner(" ");
        //String capitalizedWord = "";
            for (String separateWord : words) {
                capitalizedString.add(StringUtils.capitalize(separateWord));
            }

        return capitalizedString.toString();
    }
}
