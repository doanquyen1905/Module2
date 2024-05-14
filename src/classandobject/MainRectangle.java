package classandobject;
import java.util.Scanner;
public class MainRectangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width: ");
        int width = scanner.nextInt();
        System.out.print("Enter the height");
        int height = scanner.nextInt();
        classRectangle rectangle = new classRectangle(width,height);
        System.out.println("your rectangle \n"+rectangle.display());
        System.out.println("Perimeter of the rectangle is: " + rectangle.getPerimeter());
        System.out.println("Area of the rectangle is: "+ rectangle.getArea());
    }
}
