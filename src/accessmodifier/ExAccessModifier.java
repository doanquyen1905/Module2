package accessmodifier;

public class ExAccessModifier {
    private double radius = 1.0;
    private String color = "red";
    public ExAccessModifier(){

    }
    public ExAccessModifier(double radius ){
        this.radius = radius;
    }
     double getRadius(){
        return this.radius;
    }
     double getArea(){
        return this.radius * this.radius * Math.PI;
    }
}
