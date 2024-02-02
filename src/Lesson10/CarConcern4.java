package Lesson10;

public class CarConcern4 {
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;

    public CarConcern4(String modela, int year, String colorr) {
        this.model=modela;
        this.year=year;
        this.color=colorr;
        System.out.println("CarConcern: "+model+", " +color);
    }
    public CarConcern4(String model, int year) {
        this.model=model;
        this.year=year;
        this.color="Orange";
    }

    public CarConcern4(String model) {
        this.model=model;
        this.year=4321;
        this.color="Orange";
    }


    public static void main(String[] args) {
        CarConcern4 car=new CarConcern4("2109",2007, "Yellow");
    }
}
