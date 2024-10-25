import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrafficCalcTest {
    @Test
    public void testCalculateTraffic1() {
        var tc = new TrafficCalc(100, 10, 12, 15);
        int expected = 160;
        int actual = tc.getPlannedCost();
        assertEquals(actual, expected);
    }

    @Test
    public void testCalculateTraffic2() {
        var tc = new TrafficCalc(100, 10, 12, 1);
        int expected = 100;
        int actual = tc.getPlannedCost();
        assertEquals(actual, expected);
    }

}
