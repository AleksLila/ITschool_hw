package Lesson13;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Exercise4 {
    public static void print(HashSet<String> words){
        Iterator<String> it= words.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }

    }
    public static void main(String[] args) {
        HashSet<String> words=new HashSet<>(Arrays.asList("Програмування зазвичай навчають на прикладах".split(" ")));
        print(words);
    }
}
