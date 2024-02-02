package Lesson13;

import java.util.*;

public class Exercise5 {
    public static void printHashSet(HashSet<String> wordsHashSet){
        System.out.println("HashSet<String>: ");
        for(String word: wordsHashSet){

            System.out.print(word+" ");
        }

    }
    public static void printArrayList(ArrayList<String> wordsList){
        System.out.println("ArrayList<String>: ");
        for(String word: wordsList){

            System.out.print(word+" ");
        }


    }
    public static void main(String[] args) {
        String[] words="Гадаю, що це буде нова фіча. Тільки не кому не кажіть, що вона виникла випадково.".split(" ");
        ArrayList<String> wordsList=new ArrayList<>(Arrays.asList(words));
        HashSet<String> wordsHashSet=new HashSet<>(wordsList);
        System.out.print(wordsHashSet);
        System.out.println();
        System.out.println("------------------");
        System.out.println(wordsList);
        printArrayList(wordsList);
        System.out.println();
        printHashSet(wordsHashSet);


    }
}
