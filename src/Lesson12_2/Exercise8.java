package Lesson12_2;

public class Exercise8 {
    public static void main(String[] args) {
        compare('a', 'a');
        compare('a', 'б');
        compare('р', 'в');
        compare('и', 'и');
    }
    public static void compare(Character first, Character second) {
        if (first == second) {
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
