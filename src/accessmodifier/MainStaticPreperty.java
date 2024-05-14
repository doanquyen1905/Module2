package accessmodifier;

public class MainStaticPreperty {
    public static void main(String[] args){
        StaticProperty car1 = new StaticProperty("motorbyce",100);
        System.out.println(StaticProperty.numberOfCar);
        System.out.println(car1.toString());
        StaticProperty car2 = new StaticProperty("mazda3",500);
        System.out.println(StaticProperty.numberOfCar);
        System.out.println(car2.toString());
    }
}
