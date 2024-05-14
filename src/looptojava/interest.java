package looptojava;
import java.util.Scanner;
public class interest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter money");
        double money = input.nextDouble();
        System.out.println("Enter month");
        int month = input.nextInt();
        System.out.println("Enter annual interest rate in percentage:");
        double interest = input.nextDouble();
        double totalInterest;
        for (int i = 1; i <month ; i++) {
            totalInterest = money * interest / 12;
            money += totalInterest ;
        }
        System.out.println(money);
    }
}
