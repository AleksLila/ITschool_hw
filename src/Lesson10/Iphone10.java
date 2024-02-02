package Lesson10;

public class Iphone10 {
    private String model;
    private String color;
    private int price;
    public Iphone10(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
    public boolean equals(Object obj) {
        Iphone10 otherIphone = (Iphone10) obj;
        return price == otherIphone.price &&
                model.equals(otherIphone.model) &&
                color.equals(otherIphone.color);
    }

    public static void main(String[] args) {
        Iphone10 iphone1=new Iphone10("X", "Blue", 999);
        Iphone10 iphone2=new Iphone10("X", "Blue", 999);
        System.out.println(iphone1.equals(iphone2));
    }
}
