package calculadora;

public class Add implements Operation {
    public String getName() { return "add"; }
    public double apply(double a, double b) { return a + b; }
}
