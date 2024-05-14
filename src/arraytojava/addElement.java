package arraytojava;
import java.util.Scanner;
public class addElement {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int [] myArray = {1,3,5,7,9};
        System.out.println("Enter elment to add");
        int elementToAdd = scanner.nextInt();
        System.out.println("Enter index to add");
        int indexToAdd = scanner.nextInt();
        if (indexToAdd<0|| indexToAdd>myArray.length){
            System.out.println("Can not add element to array");
        } else {
            System.out.println("element to add is: "+ elementToAdd + " at index: " + indexToAdd);
            int [] newArray = new int[myArray.length + 1];
            for (int i = 0; i < indexToAdd; i++) {
                newArray[i] = myArray[i];
            }
            newArray[indexToAdd] = elementToAdd;
            for (int i = indexToAdd +1 ; i < newArray.length ; i++) {
                newArray[i]= myArray[i-1];
            }
            myArray = newArray;
            System.out.print("Updated Array: ");
            for (int element: myArray){
                System.out.print(element + " ");
            }
        }
    }
}
