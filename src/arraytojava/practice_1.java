package arraytojava;
import java.util.Scanner;
public class practice_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size;
        int [] myArray;
        do {
            System.out.print("Enter size array ");
            size = scanner.nextInt();
            if (size > 20){
                System.out.print("Size does not exceed 20");
            }
        } while (size> 20);
        int i = 0;
        myArray = new int [size];
        while (i< myArray.length){
            System.out.print("Enter element" + (i + 1) + " : ");
            myArray[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < myArray.length; j++) {
            System.out.print(myArray[j] + "\t");
        }
        for (int j = 0; j < myArray.length/2; j++) {
            int temp = myArray[size-j-1];
            myArray[size-j-1] = myArray[j];
            myArray[j] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < myArray.length; j++) {
            System.out.print(myArray[j] + "\t");
        }
    }
}
