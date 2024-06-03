import lombok.ToString;
import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;


/*В классе App создайте публичный статический метод contains(), который принимает два параметра:
Каталог автомобилей — массив Car[]
Автомобиль Car, который мы ищем.
Метод должен вернуть true, если такой же автомобиль есть в каталоге и false в ином случае*/
public class App {
    public static void main(String[] args) {
    Film film1 = new Film();
    Film film2 = new Film("Man Who Sleeps",
        "John Doe",
        1998,
        "action",
        new String[] {"Jack Jones", "Anna S"},
        123);
        System.out.println(Arrays.toString(film2.getActors()));


    }


}
