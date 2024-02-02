package Lesson12_2;

import java.util.ArrayList;

public class Exercise10 {
    public static int[] numbers = new int[10];
    public static ArrayList<Integer> numbers2=new ArrayList<>();
    public static void main(String[] args) {
        init();
        print();
        reverse();
        print();
    }
    public static void init() {
        System.out.println("init array");
        for (int i = 0; i <10 ; i++) {
            numbers2.add(i);

        }
    }
    public static void reverse() {
        System.out.println(" the reverse:");
        int n2=numbers2.size()-1;
        for (int i = 0; i <numbers2.size() / 2 ; i++) {
            int temp= numbers2.get(i);
            numbers2.set(i,n2-i);
            numbers2.set(n2-i, temp);


        }
    }
    private static void print() {


        System.out.println("The list numbers2: "+numbers2);
    }

}
