package Lesson10;

public class Exercise9 {
    public static void main(String[] args) {
        String s1 = new String("Test");
        s1 = "Test";
        String s2 = "Test";

        String s3 = "Test";

        System.out.println(s1 == s3);
        System.out.println(s2.equals(s3));
    }
}

