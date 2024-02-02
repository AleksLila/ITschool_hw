package Lesson13;

import java.util.ArrayList;
import java.util.Iterator;

public class Exercise6 {

    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("bug");
        words.add("Hello world!");
        words.add("Amigo");
        words.add("Bug");
        words.add("Elly");
        words.add("Kerry");
        words.add("Bug");
        words.add("bug");
        words.add("Easy ug");
        words.add("Risha");



        String line = "_________________________";

        ArrayList<String> copyWordsFirst=new ArrayList<>(words);
        System.out.println("ArrayList<String> words:");
        words.forEach(System.out::print);
        System.out.println();
        System.out.println(line);
        removeBugWithFor(copyWordsFirst);
        System.out.println("copyWordsFirst:");
        copyWordsFirst.forEach(System.out::print);

        ArrayList<String> copyWordsSecond=new ArrayList<>(words);
        removeBugWithWhile(copyWordsSecond);
        System.out.println();
        System.out.println(line);
        System.out.println("copyWordsSecond:");
        copyWordsSecond.forEach(System.out::print);

        ArrayList<String> copyWordsThird=new ArrayList<>(words);
        removeBugWithCopy(copyWordsThird);
        System.out.println();
        System.out.println(line);
        System.out.println("copyWordsThird:");
        copyWordsThird.forEach(System.out::print);

        removeBug2("    tiS");

    }

    public  static void removeBugWithFor(ArrayList<String> words){
        for (int i=0; i<words.size(); i++){
            if("bug". equalsIgnoreCase(words.get(i))){
                words.remove(i);
                i--;
            }
        }
    }
    public static void removeBugWithWhile(ArrayList<String> words){
        Iterator<String> it= words.iterator();
        while(it.hasNext()){
            if("bug".equalsIgnoreCase(it.next())){
                it.remove();
            }
        }
    }
    public static void removeBugWithCopy(ArrayList<String> words){
        ArrayList<String> copy=new ArrayList<>(words);
        for(String word: copy){
            if("bug".equalsIgnoreCase(word)){
                words.remove(word);
            }
        }
    }
    public static void removeBug2(String word){
        System.out.println(word);

    }


}
