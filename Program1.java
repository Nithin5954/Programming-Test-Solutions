import java.util.Scanner;

class Calculator {
    double a, b;
    String operation;

    Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    double calculate() {
        switch (operation.toLowerCase()) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                if (b == 0) {
                    System.out.println("Cannot divide by zero!");
                    return 0;
                }
                return a / b;
            default:
                System.out.println("Invalid operation!");
                return 0;
        }
    }
}

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add/subtract/multiply/divide): ");
        String op = sc.next();

        Calculator calc = new Calculator(a, b, op);
        System.out.println("Result: " + calc.calculate());
    }
}
