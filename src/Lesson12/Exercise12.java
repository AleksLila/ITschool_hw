package Lesson12;

import java.util.ArrayList;

public class Exercise12 {
    public static void main(String[] args) {
        CustomStringArrayList arrayList = new CustomStringArrayList();

        for(int i = 0; i < 25; i++) {
            arrayList.add("count" + i);

        }
    }
}
class CustomStringArrayList{
    private int size;
    private int capacity;
    String[] elements;

    CustomStringArrayList(){
        size=0;
        capacity=10;
        elements=new String[capacity];
    }
    public void add(String s) {
        ArrayList<String> arrayLists = new ArrayList<>();
        if(size<=capacity) {
            arrayLists.add(s);
            System.out.println(arrayLists);
        }
        //else arrayList.grow();
        size++;
    }
}
