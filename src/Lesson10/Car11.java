package Lesson10;

public class Car11 {
    private String model;
    private int year;

    public Car11(String model, int year) {
        this.model = model;
        this.year = year;
    }
    public int hashCode(){
        int result=model.hashCode()+31*year;
        return result;
    }

    public static void main(String[] args) {
        Car11 lamborghini=new Car11("Lamborghini", 2020);
        Car11 lamborghini1=new Car11("Lamborghini", 2020);
        Car11 ferrari=new Car11("Ferrari", 2023);
        Car11 ferrari1=new Car11("Ferrari", 2023);
        Car11 bugatti=new Car11("Bugatti",2020);
        Car11 bugatti1=new Car11("Bugatti", 2020);

        System.out.println(ferrari.hashCode() == ferrari.hashCode());
        System.out.println(lamborghini.hashCode() == lamborghini1.hashCode());
        System.out.println(ferrari.hashCode() == ferrari1.hashCode());
        System.out.println(bugatti.hashCode() == bugatti1.hashCode());
        System.out.println(bugatti.hashCode() == lamborghini.hashCode());
        System.out.println(lamborghini.hashCode() == ferrari.hashCode());
    }

}
