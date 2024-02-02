package Lesson10;

public class Exercise7_Bugatti {
    private String color = "BLACK";
    private int year = 2020;
    private String body = "Coupe";

    public static void main(String[] args) {
        Exercise7_Bugatti bugatti=new Exercise7_Bugatti();
        bugatti.setBody("Sedan");
        System.out.println("My car is "+bugatti.getBody());
    }

    public void setBody(String body) {
        this.body = body;
    }
    public String getBody(){
        return body;
    }
}
