package lesson2;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        int radius=console.nextInt();
        int square= (int) (3.14*radius*radius);
        System.out.println("square circle = "+ square);
    }
}
