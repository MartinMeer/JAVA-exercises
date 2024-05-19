
/*Реализуйте публичный статический метод countUniqChars(),
который принимает на вход строку и считает, сколько символов (без учёта повторяющихся символов) использовано в этой строке.
Например, в строке "yy" используется всего один символ — 'y'. А в строке "111yya!" — используется четыре символа: '1', 'y', 'a' и '!'.*/
public class App {
    public static void main(String[] args) {
        String str = "You know nothing Jon Snow";
        System.out.println(countUniqChars(str));
    }

    public static int countUniqChars(String str) {
        char[] chars = str.toCharArray();
        int uniqChars = 0;
        int counter = 0;
        for (char givenChar : chars) {
            int entries = 0;
            for (char comparedChar : chars) {
                if (givenChar == comparedChar) {
                    entries++;
                    chars[counter] = 0;
                }
            }
            if (entries < 2) {
                uniqChars++;
            } else if (entries == 1) {
                uniqChars++;
            }
            counter++;
        }
        return uniqChars;
    }
}
