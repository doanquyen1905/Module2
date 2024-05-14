package accessmodifier;

public class StaticProperty {
    private String name;
    private int money;
    public static int numberOfCar;
    public StaticProperty(String name,int money){
        this.name = name;
        this.money = money;
      numberOfCar++;
    }
    @Override
    public String toString() {
        return "StaticProperty{" +
                "numberOfCar ='" + numberOfCar + '\''+
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
