package Lesson12;

public class Exercise8 {
    public static void main(String[] args) {
        compare('н', 'н');
        compare('a', 'б');
        compare('р', 'в');
        compare('й', 'й');
    }
    public static void compare(Character first, Character second) {
        if (first.equals(second)) {
            System.out.println("однакові");
        } else if (first > second) {
            System.out.println("більше");
        } else if (first < second) {
            System.out.println("менше");
        } else {
            System.out.println("Хіба таке може бути???");
        }
    }

}
