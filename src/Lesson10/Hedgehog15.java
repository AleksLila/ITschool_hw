package Lesson10;

public class Hedgehog15 {
    public static void main(String[] args) {
        Apple apple=new Apple();
        Hedgehog15 hedgehog=new Hedgehog15();
        hedgehog.eat(apple);
    }
    public void eat(Apple apple) {
        System.out.println("Яблуко з'їли!");
    }
    public static class Apple {
    }

}
