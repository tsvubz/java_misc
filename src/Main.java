import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int x;
        int y;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        x = scanner.nextInt();
        System.out.print("Enter second number: ");
        y = scanner.nextInt();
        
        int operation;
        System.out.println("Choose math operation to execute");
        System.out.println("1 for addition");
        System.out.println("2 for subtraction");
        System.out.println("3 for multiplication");
        System.out.println("4 for division");
        System.out.println("5 for exponential");
        System.out.println("6 for square root");
        operation = scanner.nextInt();
        
        switch (operation) {
            case 1:
                int sum = add(x, y);
                System.out.println(x + " + " + y + " = " + sum);
                break;
            case 2:
                int difference = subtraction(x, y);
                System.out.println(x + " - " + y + " = " + difference);
                break;
            case 3:
                int product = multiply(x, y);
                System.out.println(x + " * " + y + " = " + product);
                break;
            case 4:
                double quotient = divide(x, y);
                System.out.println(x + " / " + y + " = " + quotient);
                break;
            case 5:
                double powering = power(x, y);
                System.out.println(x + " ^ " + y + " = " + powering);
                break;
            case 6:
                double squareRoot = root(x);
                System.out.println("square root of " + x + " = " + squareRoot);
                break;
            default:
                System.out.println("Invalid Operation");                    
        }

    }
    public static int add(int x, int y) {
        return x + y;
    }
    public static int subtraction(int x, int y) {
        return x - y;
    }
    public static int multiply(int x, int y) {
        return x * y;
    }
    public static double divide(int x, int y) {
        if (y != 0)
            return x / (double)y;
        return 0;
    }
    public static double power(double x, double y) {
        return Math.pow(x, y);
    }
    public static double root(double x) {
        return Math.sqrt(x);
    }
}