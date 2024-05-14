package arraytojava;
import java.util.Scanner;
public class exFindMinElement {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int arrayLength;
        do {
            System.out.print("Enter Array length: ");
           arrayLength = scanner.nextInt();
        } while (arrayLength<0);
        int[] myArray = new int [arrayLength];
        int i = 0;
            do {
                System.out.print("Enter Element: ");
                myArray[i] = scanner.nextInt();
                i++;
            }while (i<myArray.length);
            int min = myArray[0];
            for (int j = 1; j < myArray.length; j++) {
                if (myArray[j] < min){
                    min = myArray[j];
                }
            }
            System.out.print("The minimum value in the array is: " +min);
    }
}
