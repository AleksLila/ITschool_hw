package Lesson4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        while(true) {
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            if (str.equals("enough")) {
                break;
            }
            System.out.println(str);
        }

    }
}
