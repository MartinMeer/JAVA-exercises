import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSumm {

    @Test
    public void testSumm() {
        int a = 1;
        int b = 3;
        int expected = 4;
        int actual = Summarize.summarize(a, b);
        //assertThat(Summarize.summarize(a, b)).isEqualTo(4);
        assertEquals(expected, actual);
    }
}
