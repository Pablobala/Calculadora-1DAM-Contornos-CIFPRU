package calculadora;

public class Multiply implements Operation{

	@Override
	public String getName() {return "multiply";}

	@Override
	public double apply(double a, double b) { return a * b; }

}
