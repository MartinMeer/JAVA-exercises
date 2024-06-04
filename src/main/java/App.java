import lombok.ToString;
import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;


/**/
public class App {
    public static void main(String[] args) {
        var storage = new ProductsStorage(30, 100);

        storage.placeProducts(50);
        storage.placeProducts(50);
        storage.placeProducts(50);
    }


}
