package Lesson5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("\n"+"Input number N= ");
            int N = scanner.nextInt();
            if (N % 2 == 0) {
                int[] number = new int[N];
                for (int i = 0; i < N; i++) {

                    System.out.print(i + ", ");
                }

            } else {
                int[] number = new int[N];
                for (int i = 0; i < N; i++) {
                    System.out.print(N - i + ", ");
                }

            }

        }

    }
}
