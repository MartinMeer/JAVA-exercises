import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int[] splitted = split(input);


        System.out.println(output);
    }

    public static int[] split(String input) {
        String[] splitted = input.split(" ");
        int[] numLine = Arrays.stream(splitted).mapToInt(Integer::parseInt).toArray();
        return numLine;
    }

    public static String numLine(String[] splitted) {
        StringBuilder sb = new StringBuilder();
        List<String> numbers = List.of(splitted);
        numbers.forEach(e -> {
            String[] nums = e.split("-");
            if (nums.length > 1) {
                int start = Integer.parseInt(nums[0]);
                int finish = Integer.parseInt(nums[1]);
                int appendix = start - 1;
                for (int i = start; i < finish + 1; i++) {
                    appendix = appendix + 1;
                    sb.append(" ").append(appendix);
                }
            } else {
                sb.append(" ").append(nums[0]);
            }
        });
        return new String(sb).trim();
    }
}
