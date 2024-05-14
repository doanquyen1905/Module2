package arraytojava;
import java.util.Scanner;
public class deleteElement {
    public static void main(String[] args){
        int [] myArray = {1,3,5,7,9,11,13};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Element to Delete: ");
        int elementToDelete = scanner.nextInt();
        boolean check = false;
        int indexDelement = -1;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i]==elementToDelete){
                indexDelement = i;
                check = true;
            }
        }
        if (check){
            System.out.println("Value Of Element to Delete is: " + myArray[indexDelement] + " at index: "+ (indexDelement + 1));
            int [] newArray = new int[myArray.length - 1];
            int indexNewArray = 0;
            for (int i = 0; i < newArray.length + 1; i++) {
                if (i!= indexDelement){
                    newArray[indexNewArray] = myArray[i];
                    indexNewArray++;
                }
            }
            myArray = newArray;
            System.out.print("Updated Array: ");
            for (int element : myArray) {
                System.out.print(element + " ");
            }
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
