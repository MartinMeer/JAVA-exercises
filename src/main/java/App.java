
/*Реализуйте публичный статический метод countUniqChars(),
который принимает на вход строку и считает, сколько символов (без учёта повторяющихся символов) использовано в этой строке.
Например, в строке "yy" используется всего один символ — 'y'. А в строке "111yya!" — используется четыре символа: '1', 'y', 'a' и '!'.*/
public class App {
    public static void main(String[] args) {
        String str = "yy";
        System.out.println(countUniqChars(str));
    }

    public static int countUniqChars(String str) {
        char[] chars = str.toCharArray();
        int countUniqChars = 0;
        int counter = 0;
        for (char givenChar : chars) {
            int entry = 0;
            for (char aChar : chars) {
                if (givenChar == aChar) {
                    entry++;
                    chars[counter] = 0;
                }
            }
            if (entry < 2) {
                countOf++;
            } else if (entry == 1) {
                countOf++;
            }
            counter++;
        }
        return countUniqChars;
    }
}
