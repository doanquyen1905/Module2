package arraytojava;
import java.util.Arrays;
import java.util.Scanner;
public class mergeArrays {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] arrayOne = new int[2];
        int[] arrayTwo = new int[2];
        int x = arrayOne.length + arrayTwo.length;
        int [] mergeArray = new int[x];
        int i = 0;
        int j = 0;
        do {
            System.out.print("Enter Element Array One");
            arrayOne[i] = scanner.nextInt();
            i++;
        } while (i < arrayOne.length);
        for (int k = 0; k < arrayOne.length; k++) {
            mergeArray[k] = arrayOne[k];
        }
        do {
            System.out.print("Enter Element Array two");
            arrayTwo[j] = scanner.nextInt();
            j++;
        } while(j < arrayTwo.length);
        for (int z = 0; z < arrayTwo.length; z++) {
            mergeArray[z+arrayOne.length] = arrayTwo[z];
        }
        System.out.println("Merge Array is " + Arrays.toString(mergeArray));
    }
}
