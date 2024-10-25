import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] splitInput = scanner.nextLine().split(" ");
        int[] input = Arrays.stream(splitInput).mapToInt(Integer::parseInt).toArray();
        TrafficClc tc = new TrafficClc(input[0], input[1], input[2], input[3]);
        System.out.println(tc.getPlannedCost());
    }
}

class TrafficClc {
    private final int costForPrepaidTrafficA;
    private final int prepaidTrafficB;
    private final int costForExtraTrafficC;
    private final int plannedTrafficD;
    private int plannedCost;

    public int getPlannedCost() {
        return plannedCost;
    }

    public TrafficClc(int costForPrepaidTrafficA, int prepaidTrafficB, int costForExtraTrafficC, int plannedTrafficD) {
        this.costForPrepaidTrafficA = costForPrepaidTrafficA;
        this.prepaidTrafficB = prepaidTrafficB;
        this.costForExtraTrafficC = costForExtraTrafficC;
        this.plannedTrafficD = plannedTrafficD;
        calculateTraffic();
    }

    public void calculateTraffic() {
        if (plannedTrafficD <= prepaidTrafficB) {
            plannedCost = costForPrepaidTrafficA;
        } else {
            int extraTraffc = plannedTrafficD - prepaidTrafficB;
            plannedCost = costForPrepaidTrafficA + (extraTraffc * costForExtraTrafficC);
        }
    }
}
