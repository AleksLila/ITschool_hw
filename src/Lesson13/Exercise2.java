package Lesson13;

import java.util.HashSet;

import static java.util.Arrays.asList;

public class Exercise2 {
    public static HashSet<String> words = new HashSet<>(asList(("Якби мене попросили вибрати мову взамін на Java " +
            "я б не вибирав").split(" ")));
    public static void checkWords(String word) {

        if(words.contains(word)){
            System.out.println("Слово ["+word+"]  є в множині");
        }
        else System.out.println("Слово ["+word+"] нема в множині");

    }
    public static void main(String[] args) {
        checkWords("Java");
        checkWords("JavaString");
        System.out.println(words);
    }
}
