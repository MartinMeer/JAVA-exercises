
/*В классе App напишите публичный статический метод getFigureSquare(),
который принимает в качестве аргумента геометрическую фигуру типа Geometric.
Метод должен возвращать площадь фигуры в виде строки формата "Square of quadrate is 36"*/

import java.io.IOException;

public class App {
    public static void main (String[] args) {
        Rectangle rectangle = new Rectangle(-5,10);
        Rectangle rectangle1 = new Rectangle(5,10);
        Rectangle rectangle2 = new Rectangle(6,10);
        printSquare(rectangle);
        printSquare(rectangle1);
        printSquare(rectangle2);
    }


    public static void printSquare(Rectangle figure) throws RuntimeException {
        try {
            System.out.println(figure.getSquare());
        } catch (RuntimeException e) {
            System.out.println("Не удалось посчитать площадь");
        }
    }






}
