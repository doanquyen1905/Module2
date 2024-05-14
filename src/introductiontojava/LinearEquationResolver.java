package introductiontojava;
import java.util.Scanner;
public class LinearEquationResolver {
    public static void main(String[] args){
        System.out.println(" Linear Equation Resolver");
        System.out.println("a * x + b = c , please Enter constants");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();
        if (a != 0){
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = " + answer);
        } else {
            if (b==c) {
                System.out.print("Equation with countless solutions!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
