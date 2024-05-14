package arraytojava;
import java.util.Scanner;
public class convertTemperature {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice;
        double myFahrenheit;
        double myCelsius;
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter Choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter farenheit");
                    myFahrenheit = scanner.nextDouble();
                    System.out.println("Celius is: "+ fahrenheitToCelsius(myFahrenheit));
                    break;
                case 2:
                    System.out.println("Enter Celsius");
                    myCelsius = scanner.nextDouble();
                    System.out.println("Fahrenheit is: " + celsiusToFahrenheit(myCelsius));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice !=0);
    }
    public static double celsiusToFahrenheit(double celsius){
        return celsius / (5.0/9) + 32.0;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
