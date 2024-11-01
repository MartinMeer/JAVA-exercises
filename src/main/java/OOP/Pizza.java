package OOP;

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

import lombok.Getter;

@Getter
public class Pizza {

    private final String size;
    private final String dough;
    private final String sauce;

    Pizza(Builder builder) {
        this.size = builder.size;
        this.dough = builder.dough;
        this.sauce = builder.sauce;
    }

    @Override
    public String toString() {
        return "Your pizza is "
        + this.size
        + ", on "
        + this.dough
        + " dough, has a "
        + this.sauce
        + " sauce.";
    }

    public static class Builder {
        private String size;
        private String dough;
        private String sauce;

        public Builder size(String size) {
            this.size = size;
            return this;
        }

        public Builder dough(String dough) {
            this.dough = dough;
            return this;
        }

        public Builder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}


