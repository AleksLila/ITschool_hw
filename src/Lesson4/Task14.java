package Lesson4;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        while(true) {
            Scanner strConsole = new Scanner(System.in);
            Scanner numberConsole = new Scanner(System.in);
            String str;
            int number;
            str = strConsole.nextLine();
            number = numberConsole.nextInt();
            if (number < 5 && number > 0) {
                //boolean isNumber=(number<5);
                do {

                    System.out.println(str);
                    number--;
                }
                while (number > 0);
            } else System.out.println(str);
        }

    }

}
