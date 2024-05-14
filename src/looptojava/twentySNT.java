package looptojava;
import java.util.Scanner;
public class twentySNT {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Enter Number of numbers to print");
        int number = inputNumber.nextInt();
        int count = 0;
        int myNumber = 0;
        while (count < number){
            if(checkPrimeNumber(myNumber)){
                count++;
            }
            myNumber++;
        }
    }
    public static boolean checkPrimeNumber(int inputnumber){
        if (inputnumber <= 2) {
            return false;
        } else {
            for (int i = 2; i < inputnumber; i++) {
                if (inputnumber % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
