package Lesson12;

import java.util.ArrayList;

public class Exercise20 {
    public static void main(String[] args) {
        var elements = new ArrayList<>();
        elements.add(new Integer[15]);
        elements.add(123);

        elements.add("Hello");

        checkElementsType(elements);
    }

    public static void checkElementsType(ArrayList<Object> elements) {
        for(Object element: elements){
            if(element instanceof String){
                printString(element);
            }
            else if(element instanceof Integer){
                printInteger(element);
            }
            else if(element instanceof Integer[]){
                printIntegerArray();
            }
            else if(element instanceof LinkageError){
                printUnknown();
            }


        }

    }

    public static void printString(Object str) {
        System.out.println(str + " - це рядок");
    }

    public static void printInteger(Object integer) {
        System.out.println(integer+" - Ціле число");
    }

    public static void printIntegerArray() {
        System.out.println(" - Масив цілих чисел");
    }
    public static void printUnknown() {
        System.out.println("Інший тип даних");
    }
}
