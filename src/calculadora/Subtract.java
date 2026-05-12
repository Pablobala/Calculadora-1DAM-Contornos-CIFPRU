package calculadora;

public class Subtract implements Operation {
    public String getName() { return "subtract"; }
    public double apply(double a, double b) { return a - b; }
}
