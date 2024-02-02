package Lesson10;

public class Building5 {
    private String type;
    public Building5(String type) {
        this.type = type;
        System.out.println("Building: "+type);
    }
    public void initialize(String type){
        this.type = type;
        System.out.println("Building: "+type);
    }

    public static void main(String[] args) {
        Building5 building = new Building5("Ресторан");

        building.initialize("Барбершоп");
    }

}
