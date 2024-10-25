public class TrafficCalc {
    private final int costForPrepaidTrafficA;
    private final int prepaidTrafficB;
    private final int costForExtraTrafficC;
    private final int plannedTrafficD;
    private int plannedCost;

    public int getPlannedCost() {
        return plannedCost;
    }

    public TrafficCalc(int costForPrepaidTrafficA, int prepaidTrafficB, int costForExtraTrafficC, int plannedTrafficD) {
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
