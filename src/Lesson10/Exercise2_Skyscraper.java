package Lesson10;

import java.net.SocketTimeoutException;

public class Exercise2_Skyscraper {
    public static final String SKYSCRAPER_WAS_BUILD = "Хмарочос побудовано.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Хмарочос побудовано. Кількість поверхів - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Хмарочос побудовано. Забудовник - ";

    public static void main(String[] args) {
        Exercise2_Skyscraper skyscraper = new Exercise2_Skyscraper();
        Exercise2_Skyscraper skyscraperTower = new Exercise2_Skyscraper(50);
        Exercise2_Skyscraper skyscraperSkyline = new Exercise2_Skyscraper("Development");
    }
    public Exercise2_Skyscraper(){
        System.out.println(SKYSCRAPER_WAS_BUILD);
    }
    public Exercise2_Skyscraper(int tower){
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT+tower);
    }
    public Exercise2_Skyscraper(String development){
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER+development);
    }
}
