package Lesson10;

public class Exercise6 {
    public static void main(String[] args) {
        ElectricCar elCar=new ElectricCar("elCar");
        GasCar gasCar=new GasCar("GasCar");
        HybridCar hibridCar=new HybridCar("HybridCar");

    }
    public Exercise6(String car){
        System.out.println("Hello. I am.."+car);
    }
}

class ElectricCar extends Exercise6{

    public ElectricCar(String car) {
        super(car);
    }
}
class GasCar extends Exercise6{

    public GasCar(String car) {
        super(car);
    }
}
class HybridCar extends Exercise6{

    public HybridCar(String car) {
        super(car);
    }
}