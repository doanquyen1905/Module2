package introductiontojava;
import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("your weight");
        double weight = scanner.nextDouble();
        System.out.print("your height");
        double height = scanner.nextDouble();
        double bmi = weight / Math.pow(height,2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if (bmi < 18.5)
            System.out.printf("%-20s%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20s%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20s%s", bmi, "Overweight");
        else
            System.out.printf("%-20s%s", bmi, "Obese");
    }
}
