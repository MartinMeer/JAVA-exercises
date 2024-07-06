import org.apache.commons.lang3.ArrayUtils;

public class Without {

    public int[] without(int[] numbers, int... values) {
        int[] filtered = numbers.clone();
        for (var value : values) {
            filtered = ArrayUtils.removeAllOccurrences(filtered, value);
        }
        return filtered;
    }


}
