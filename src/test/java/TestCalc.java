import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.assertj.core.api.Assertions.assertThat;

public class TestCalc {

    private static Class calculatorClass;
    private static BufferedReader br;
    Calculator calc;
    Field field;
    Constructor constructor;
    Method method;

    @Test
    public void before() throws IOException {
        calc;
        method = c
        br = new BufferedReader(new FileReader("/input"));
        String operation = br.readLine();
        double a = Double.parseDouble(br.readLine());
        double b = Double.parseDouble(br.readLine());
        String result = "";


        assertThat(result).isEqualTo("100");



    }



}
