package Lesson11;

public class Exercise1 {
    public static void main(String[] args) {
        SolarSystem solarSystem=new SolarSystem();
        solarSystem.setAge(4568200000l);
        solarSystem.setNumberPlanet(8);
        System.out.println("Людство живе в Сонячній системі.Її вік приблизно "+solarSystem.getAge());
        System.out.println("У Сонячній системі "+ solarSystem.getNumberPlanet() +" відомих планет.");


    }
}
class SolarSystem{
    private long age;
    private int numberPlanet;
    private String nameStar;

    public void setAge(long age){
        this.age=age;

    }
    public long getAge(){
        return age;
    }
    public void setNumberPlanet(int numberPlanet){
        this.numberPlanet=numberPlanet;

    }
    public int getNumberPlanet(){
        return numberPlanet;
    }
    public void setNameStar(String nameStar){

    }
    public String getNameStar(){
        return nameStar;
    }
}
