package Lesson10;

public class Solution16 {
    public static void showWeather(City city1) {
        System.out.println("In the city "+city1.getCity());
        System.out.println("Today is temperature "+city1.getTemperature());

    }
    public static void main(String[] args) {
        City cityTown =new City();
        showWeather(cityTown);

    }
}
class City{
    private String city="Dubai";
    private int temperature=10;

     public int getTemperature(){
        return temperature;
     }
     public String getCity(){
         return city;
     }

}
