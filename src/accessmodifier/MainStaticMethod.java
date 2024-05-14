package accessmodifier;

public class MainStaticMethod {
    public static void main(String[] args){
        StaticMethod.change();
        StaticMethod s1 = new StaticMethod(1,"John");
        StaticMethod s2 = new StaticMethod(2,"David");
        StaticMethod s3 = new StaticMethod(3, "Jack");
        s1.display();
        s2.display();
        s3.display();
    }
}
