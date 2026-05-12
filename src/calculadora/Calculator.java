package calculadora;

import java.util.*;

public class Calculator {
    static Map<String, Operation> ops = new HashMap<>();
    static {
        ops.put("add", new Add());
        ops.put("subtract", new Subtract());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Operación (add, subtract...): ");
        String op = sc.next();
        Operation operation = ops.get(op);
        if (operation != null) {
            System.out.print("Introduce a y b: ");
            double a = sc.nextDouble(), b = sc.nextDouble();
            System.out.println("Resultado: " + operation.apply(a, b));
        } else {
            System.out.println("Operación desconocida");
        }
    }
}
