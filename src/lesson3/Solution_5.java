package lesson3;

import java.util.Scanner;

public class Solution_5 {
    public static void main(String[] args) {
        Scanner console5=new Scanner(System.in);
        System.out.print("input age = ");
        int age=console5.nextInt();
        if(age<20||age>60) {

            System.out.println("можна не працювати");
        }
    }

}
