import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] splitted = split(input);
        String output = numLine(splitted);
        System.out.println(output);
    }

    public static String[] split(String input) {
        return input.split(",");
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
