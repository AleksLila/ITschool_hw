package Lesson12;

public class Exercise7 {
    public static void main(String[] args) {
        int first = 2;
        int second = 5;
        Boolean isLess = isLess(first, second);
        if (isLess) {
            System.out.println("Перше число менше за друге");
        } else {
            System.out.println("Перше число більше за друге або дорівнює йому");
        }
    }
    public static Boolean isLess(int first, int second) {
        return first < second ? true : false;
    }

}
