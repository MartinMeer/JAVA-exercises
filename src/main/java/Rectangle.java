/*Реализуйте класс Rectangle, который описывает геометрическую фигуру - прямоугольник.
Прямоугольник имеет два свойства — длину и ширину. Создайте эти свойства в классе.
Реализуйте в классе конструктор, который принимает длину и ширину прямоугольника в виде целых чисел,
а также при необходимости геттеры для доступа к этим данным.

В классе определите публичный метод getSquare(), который возвращает площадь прямоугольника — целое число.
сли одна из сторон прямоугольника отрицательная, метод должен выбросить исключение Exception*/

import java.io.IOException;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle (int length, int width) {
       this.length = length;
       this.width = width;
    }


    public int getSquare() throws RuntimeException {
        if (length < 0 || width < 0) {
            throw new RuntimeException();
        }
        return length * width;
    }
}
