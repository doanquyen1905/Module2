package arraytojava;

import java.util.Scanner;

public class sumColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int column;
        do {
            System.out.print("Enter number of rows: ");
            rows = scanner.nextInt();
        } while (rows <= 0);
        do {
            System.out.print("Enter number of colomn: ");
            column = scanner.nextInt();
        }while (column<=0);
        int [][] matrix = new int[rows][column];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter element at position: ( " + (i+1) + ","+(j+1)+ " ) ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Enter the column index to calculate sum:  ");
        int index = scanner.nextInt();
        int sumColumn = 0;
        for (int k = 0; k < rows; k++) {
            sumColumn += matrix[k][index];
        }
        System.out.println("Sum of column " + index + " is: "+ sumColumn);
    }
}
