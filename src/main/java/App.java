import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.StringJoiner;

/*Реализуйте публичный статический метод makeCensored(),
который заменяет каждое вхождение указанного слова (из списка переданных) в предложении
на последовательность $#%! и возвращает полученную строку. Аргументы:
Текст
Массив стоп-слов
Словом считается любая непрерывная последовательность символов, включая любые спецсимволы (без пробелов).*/
public class App {
    public static void main(String[] args) {
        var text1 = "When you play the game of thrones, you win or you die";
        String[] stopWords1 = {"die", "play"};
        var result1 = App.makeCensored(text1, stopWords1);
        var text2 = "chicken chicken? chicken! chicken";
        String[] stopWords2 = {"?", "chicken"};
        var result2 = App.makeCensored(text2, stopWords2);
        System.out.println(result2);
// => "$#%! chicken? chicken! $#%!"
// => "When you $#%! the game of thrones, you win or you $#%!"
    }

    public static String makeCensored(String text, String[] stopWords) {
        String[] words = text.split(" ");
        StringJoiner censoredString = new StringJoiner(" ");
        String replacementWord = "$#%!";
        for (int i = 0; i < words.length; i++) {
            if (ArrayUtils.contains(stopWords, words[i])) {
                words[i] = replacementWord;
                censoredString.add(words[i]);
            } else {
                censoredString.add(words[i]);
            }
        }
        return censoredString.toString();
    }


}
