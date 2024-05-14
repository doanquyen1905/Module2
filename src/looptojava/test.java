package looptojava;
import java.util.Scanner;
public class test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number");
        int number = scanner.nextInt();
        double numberDefaut = 1.0d;
        double sum = 0.0d;
        for (int i = 1; i <=number ; i++) {
            sum = sum + numberDefaut / i;
        }
        System.out.print("sum is " + sum);
    }
}
