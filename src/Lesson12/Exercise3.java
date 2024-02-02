package Lesson12;

public class Exercise3 {
    static Integer first = 1000;
    static Integer second = 1000;
    static int third = 1000;
    public static void main(String[] args) {
        if(first.equals(second)){
            System.out.println("first are equals second" );
        }
        System.out.println(first.equals(second));
        System.out.println(third == second);
        System.out.println(third == first);

    }
}
