package arraytojava;
import java.util.Scanner;
public class findValueOfArray {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter name Student");
            String student = scanner.nextLine();
            String [] students = {"Adam", "Eva", "Tom", "Cat"};
            boolean check = false;
            for (int i = 0; i < students.length; i++) {
                if (student.equals(students[i])){
                    System.out.print("Position of the students"+ student + " in the list is "+ (i+ 1));
                    check = true;
                    break;
                }
            }
            if (!check){
                System.out.print("Not found\" + input_name + \" in the list.");
            }
        }
}
