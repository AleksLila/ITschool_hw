package Lesson12;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise11 {

    public static int[] numbers2={56, 45, 89, 1, 45, 13, 4, 69, 11, -89};
    public static void main(String[] args) {
        print();
        sort();
        System.out.println("\nВідсортовані числа масива в порядку зростання:");
        print();
    }

    public static void sort() {
        for (int i = 0; i < numbers2.length - 1; i++) {
            for (int j = 0; j < numbers2.length - i - 1; j++) {
                if (numbers2[j] > numbers2[j + 1]) {
                    int temp = numbers2[j];
                    numbers2[j]=numbers2[j + 1];
                    numbers2[j+1]=temp;
                }
            }
        }
    }
    public static void print() {
        for (int number : numbers2) {
            System.out.print(number + "\t");
        }
    }

}
