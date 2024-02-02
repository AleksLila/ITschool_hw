package Lesson13;

import java.util.ArrayList;
import java.util.HashSet;

import static java.util.Arrays.asList;

public class Exercise3 {
    public static void main(String[] args) {
        ArrayList<String> listOfWords = new ArrayList<>(asList(
                ("Світ побачила нова серія книг по програмуванню на Java: \"Java для початківців\"," +
                 "\"Java для тих, хто продовжує\", \"Java для тих, хто закінчує\"").split(" ")));
        System.out.println("Кількість слів у списку: " + listOfWords.size());
        HashSet<String> setOfWords = listToSet(listOfWords);
        System.out.println("Кількість слів у множині: " + setOfWords.size());
        System.out.println(listOfWords);
        System.out.println(setOfWords);
        for (String word: setOfWords) {
            System.out.println(word);
        }
    }

    public  static HashSet<String> listToSet(ArrayList<String> word){
        HashSet<String> result=new HashSet<>(word);
        return result;
    }
}
