package arraytojava;
import java.util.Scanner;
public class squareMatrix {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int row;
        do {
            System.out.print("Enter rows of matrix: ");
            row = scanner.nextInt();
        }while (row<=0);
        int [][] array = new int[row][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("Enter element at position ( "+(i+1) + ","+(j+1)+") \t");
                array[i][j] =scanner.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < row; i++) {
            sum += array[i][i];
        }
        System.out.println("sum of numbers on the main diagonal of a square matrix is  "+ sum);
    }
}
