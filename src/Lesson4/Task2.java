package Lesson4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        while(true) {
            System.out.print("input a = ");
            Scanner console1 = new Scanner(System.in);
            int a = console1.nextInt();
            Scanner console2 = new Scanner(System.in);
            System.out.print("input b = ");
            int b = console2.nextInt();
            System.out.println(a + b);
            String str = scan.nextLine();
            if("Enter".equals(str)){ break;}
        }
    }
}