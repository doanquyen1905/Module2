package arraytojava;
import java.util.Scanner;
public class maxValueOfArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter size list");
            size = input.nextInt();
        } while (size >20);
        input.nextLine();
        String[]listName = new String[size];
        Double[]listMoney = new Double[listName.length];
        int orderNumericalName = 0;
        while (orderNumericalName< listName.length){
            System.out.print("Enter Name of Aillionaire ");
            listName[orderNumericalName] = input.nextLine();
            ++orderNumericalName;
        }
        int orderNumbericalMoney = 0;
        while (orderNumbericalMoney < listMoney.length){
            System.out.print("Enter money of billionaire " + (orderNumbericalMoney + 1)+ "nd: ");
            listMoney[orderNumbericalMoney] = input.nextDouble();
            ++orderNumbericalMoney;
        }
        int indexMax = 0;
        double max = listMoney[indexMax];
        for (int i = 1; i < listMoney.length; i++) {
            if (listMoney[i] > max){
                max = listMoney[i];
                indexMax= i;
            }
        }
        System.out.print("The biggest asset is "+ max + "\t");
        System.out.print(" Of " + listName[indexMax]);
    }
}
