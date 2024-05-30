import java.io.IOException;

public class Quadrate implements Geometric {

    private int side;

    public Quadrate (int side) {
        this.side = side;
    }

    @Override
    public String getName() {
        return "quadrate";
    }

    @Override
    public double getSquare() throws IOException {
        if (side < 0) {
            throw new IOException();
        }
        return side * side;
    }
}
