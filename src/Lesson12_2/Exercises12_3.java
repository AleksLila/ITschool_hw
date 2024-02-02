package Lesson12_2;

import java.util.ArrayList;

public class Exercises12_3 {
    public static void main(String[] args) {
        CustomStringArrayList2 arrayList2 = new CustomStringArrayList2();
        for (int i = 0; i < 25; i++) {
            arrayList2.add2("Count"+i);

        }
    }

}
class CustomStringArrayList2{
    int size;
    int capacity;
    String[] elements;

    CustomStringArrayList2(){
        this.size=0;
        this.capacity=10;
        this.elements=new String[capacity];
    }
    public void add2(String str){
        if(size<this.capacity){
            elements[size]=str;
            System.out.println(elements[size]);
            size++;
        }
        else  {
            String str2=str;
            grow2(str2);

        }

    }
    public void grow2(String str){
        //size=capacity;
        capacity= (int)(capacity*1.5);
        this.elements=new String[capacity];
        System.out.println(elements[size]=str);


    }

}