package classandobject;
import java.util.Scanner;
public class MainQuadraticEquation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double myA;
        do {
            System.out.print("Enter a: ");
            myA = scanner.nextDouble();
        }while(myA==0);
        System.out.print("Enter b: ");
        double myB = scanner.nextDouble();
        System.out.print("Enter c: ");
        double myC = scanner.nextDouble();
        ClassQuadraticEquation quadraticEquation = new ClassQuadraticEquation(myA,myB,myC);
        if (quadraticEquation.getDiscriminant()>0){
            System.out.println("The equation has a solution: "+ quadraticEquation.getRoot1() + "and " + quadraticEquation.getRoot2());
        } else {
            if (quadraticEquation.getDiscriminant()==0){
                System.out.println("The equation has a solution of: "+ quadraticEquation.getRoot1());
            } else {
                System.out.println("The equation has no roots");
            }
        }
    }
}
