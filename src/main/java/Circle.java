public class Circle implements Geometric {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "circle";
    }

    @Override
    public double getSquare() throws IllegalArgumentException {
        return Math.PI * Math.pow(radius, 2);
    }
}
