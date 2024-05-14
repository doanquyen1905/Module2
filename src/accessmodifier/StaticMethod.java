package accessmodifier;

public class StaticMethod {
    private int rollno;
    private String name;
    private static String college = "BBDIT";
    StaticMethod(int r, String n){
        this.rollno = r;
        this.name = n;
    }
    static void change(){
        college = "CODEGYM";
    }
    void display(){
        System.out.println(rollno+ " "+ name + " "+ college);
    }
}
