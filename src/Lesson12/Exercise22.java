package Lesson12;

import java.util.ArrayList;

public class Exercise22 {
    public static void main(String[] args) {
        var arrayList = new ArrayList<String>();
        //arrayList.add(15);
        arrayList.add("Hello");
        //arrayList.add(154);
        arrayList.add("string");
        printAnything(arrayList);
    }

    public static void printAnything(ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
