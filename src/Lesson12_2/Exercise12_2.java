package Lesson12_2;

public class Exercise12_2 {
    public static void main(String[] args) {
        CustomStringArrayList arrayList = new CustomStringArrayList();
        for(int i = 0; i < 25; i++) {
            arrayList.add("count" + i);
        }
    }

}
class CustomStringArrayList{
    int size;
    int capacity;
    String[] elements;

    public CustomStringArrayList(){
        size=0;
        capacity=10;
        elements=new String[capacity];
    }
    public void add(String str){

        elements[size]=str;
        System.out.println("first array: "+elements[size]);

        if(size==capacity-1){
            grow();
        }
        size++;

        }


    public void grow(){
       // capacity=capacity*2;
        String[] elements=new String[20];
        for (int i = 0; i < 10; i++) {
            elements[i]=elements[i];
            System.out.println(elements[i]);
        }

    }
}
