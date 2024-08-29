package OOP;

import lombok.Getter;

/*сборка собственного варианта пиццы при заказе на сайте пиццерии.
Вы можете выбрать различные варианты теста, соуса, начинки.
При этом не все параметры являются обязательными.
Например, вегетарианский вариант не содержит мясную начинку. А кто-то, наоборот, не любит овощи
size — размер пиццы, строка
dough — тип теста, строка
sauce — соус, строка
meatTopping — мясная начинка, строка
vegetableTopping — овощная начинка, строка
cheeseTopping — сорт сыра, строка
Сделаем класс иммутабельным. Реализуйте в классе билдер и геттеры для всех полей*/
@Getter
//@Builder
//@Data
public final class Pizza {
    private String size;
    private String dough;
    private String sauce;
    private String meatTopping;
    private String vegetableTopping;
    private String cheeseTopping;

    Pizza() {
    }
    public static PizzaBuilder builder() {
        return new PizzaBuilder();
    }

    public static class PizzaBuilder {
        private Pizza pizza;

        private PizzaBuilder() {
            pizza = new Pizza();
        }
        public PizzaBuilder size (String size) {
            pizza.size = size;
            return this;
        }
        public PizzaBuilder dough (String dough) {
            pizza.dough = dough;
            return this;
        }
        public PizzaBuilder sauce (String sauce) {
            pizza.sauce = sauce;
            return this;
        }
        public PizzaBuilder meatTopping (String meatTopping) {
            pizza.meatTopping = meatTopping;
            return this;
        }
        public PizzaBuilder vegetableTopping (String vegetableTopping) {
            pizza.vegetableTopping = vegetableTopping;
            return this;
        }
        public PizzaBuilder cheeseTopping (String cheeseTopping) {
            pizza.cheeseTopping = cheeseTopping;
            return this;
        }
        public Pizza build() {
            return pizza;
        }
    }
}
