package accessmodifier;

public class WriteOnlyClass {
    private String name = "John";
    private String classes = "C02";
    public WriteOnlyClass(){

    }
     void setName(String name){
        this.name = name;
    }
     void setClasses(String classes) {
        this.classes = classes;
    }
}
