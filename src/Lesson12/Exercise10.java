package Lesson12;

import java.util.ArrayList;

public class Exercise10 {
    public static int[] numbers = new int[10];
    static ArrayList<Integer> numbers2=new ArrayList<>();
    public static void main(String[] args) {
        init();
        print();
        reverse();
        print();
    }
    public static void init() {
        for (int i = 0; i < 10; i++) {
            numbers2.add(i);
        }
    }
    public static void reverse() {
        int n = numbers2.size() - 1;
        for (int i = 0; i < numbers2.size() / 2; i++) {
            int temp = numbers2.get(i);
            numbers2.set(i, n-i);
            numbers2.set(n-i, temp);
        }
    }
    private static void print() {
        for (int number : numbers2) {
            System.out.println(number);
        }
        System.out.println("---------------");
    }

}
