package Lesson10;

public class Skyscraper3 {
    private int floorsCount;
    private String developer;

    public static void main(String[] args) {
        Skyscraper3 skyscraper = new Skyscraper3();
        Skyscraper3 skyscraperUnknown = new Skyscraper3(50, "Невідомо");

    }
    public Skyscraper3(){
        floorsCount=5;
        developer="Development";
        System.out.println("Skyscraper: "+floorsCount+", " +developer);

    }
    public Skyscraper3(int tower, String developer){
        floorsCount=tower;
        this.developer=developer;
        System.out.println("Skyscraper: "+floorsCount+", " +developer);
    }
}
