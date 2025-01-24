public class Calculator {

    private double a;
    private double b;
    private double result;

    public Calculator(double a, double b, double result) {
        this.a = a;
        this.b = b;
        this.result = result;
    }

    public void sum(double a, double b) {
        result = a + b;
    }
    public void subtr(double a, double b) {
        result = a + b;
    }
    public void mult(double a, double b) {
        result = a * b;
    }
    public void div(double a, double b) {
        if (b != 0) {
            result = a / b;
        }
        System.out.println("Div on 0 is prohibited!");
    }
}
