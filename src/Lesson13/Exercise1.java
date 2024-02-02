package Lesson13;

import java.util.HashSet;

public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Через", "три", "роки", "я", "буду", "Senior", "Java", "Developer"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("___________________________________");
        HashSet<String> hashSet = arrayToHashSet(array);
        for(String s : hashSet) {
            System.out.println(s);
        }
    }

    private static HashSet<String> arrayToHashSet(String[] array) {
        HashSet<String> hashSet2 = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            hashSet2.add(array[i]);

        }
        return hashSet2;
    }
}
