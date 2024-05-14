package looptojava;
import java.util.Scanner;
public class uCLN {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number one");
        int numberOne = input.nextInt();
        numberOne = Math.abs(numberOne);
        System.out.println("Enter number two");
        int numberTwo = input.nextInt();
        numberTwo = Math.abs(numberTwo);
        if (numberOne==0&&numberTwo==0){
            System.out.println("No greatest common factor");
        } else if (numberOne == 0 && numberTwo != 0) {
            System.out.println("Greatest common factor is " + numberTwo);
        } else if (numberOne != 0 && numberTwo == 0) {
            System.out.println("Greatest common factor is " + numberOne);
        } else {
            int uCLN = findUCLN(numberOne, numberTwo);
            System.out.println("Greatest common factor is " + uCLN);
        }
    }
    public static int findUCLN(int a, int b){
        while(b!=0) {
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}
