package cart;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*Статический метод makeCart() – создаёт новую пустую корзину (объект)
Метод addItem(good, count) – добавляет в корзину товары и их количество. Товар – это объект класса cart.Good с двумя свойствами: name (имя) и price (стоимость)
Метод getItems() – возвращает список List<Map> товаров в формате [{good=товар, count=количество}, {good=товар, count=количество}, ...].
Каждый элемент списка – это словарь Map, содержащий товар и его количество {good, count}
Метод getCost() – возвращает стоимость корзины. Стоимость корзины высчитывается как сумма стоимости всех добавленных товаров с учётом их количества.
Метод getCount() – возвращает общее количество товаров в корзине.*/

public class CartMaker implements Cart {
    private List<Map> items = new ArrayList<>();

    public static Cart makeCart() {
        return new CartMaker();
    }
    @Override
    public void addItem(Good item, int count) {
        items.add(Map.of("good", item, "count", count));
    }

    @Override
    public List<Map> getItems() {
        return items;
    }

    @Override
    public int getCost() {
        int cost = items.stream()
                .mapToInt(item -> {
                    Good good = (Good) item.get("good");
                    int count = (int) item.get("count");
                    return good.getPrice() * count;
                })
                .sum();
        return cost;
    }

    @Override
    public int getCount() {
        int count = items.stream()
                .mapToInt(item -> {
                    int count1 = (int) item.get("count");
                    return count1;
                })
                .sum();
                ;
        return count;
    }
}
