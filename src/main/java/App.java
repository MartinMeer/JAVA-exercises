
/*В классе App напишите публичный статический метод getFigureSquare(),
который принимает в качестве аргумента геометрическую фигуру типа Geometric.
Метод должен возвращать площадь фигуры в виде строки формата "Square of quadrate is 36"*/

import java.io.IOException;

public class App {
    public static void main (String[] args) {
        var quadrate = new Quadrate(3);
        var enlargedQuadrate = App.enlargeQuadrate(quadrate);
        System.out.println(enlargedQuadrate.getSide()); // 6
    }


    public static Quadrate enlargeQuadrate(Quadrate figure) {
        return new Quadrate(figure.getSide() * 2);
    }






}
