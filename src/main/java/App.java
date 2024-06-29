import org.apache.commons.lang3.ArrayUtils;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        testMSU();
    }

    public static void testMSU() {
        String[] input = {"str1", "STR", "str3"};
        String defaultVal = "defaultVal";
        String assertion1 = MyArrayUtils.get(input, 1, defaultVal);
        String assertion2 = MyArrayUtils.get(input, 6, defaultVal);
        String assertion3 = MyArrayUtils.get(input, -6, defaultVal);

        if (!assertion1.equals("STR")) {
            throw new AssertionError("Error");
        }

        if (!assertion2.equals("defaultVal")) {
            throw new AssertionError("Error");
        }
        if (!assertion3.equals("defaultVal")) {
            throw new AssertionError("Error");
        }


    }
}















