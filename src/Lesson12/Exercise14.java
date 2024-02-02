package Lesson12;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise14 {
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++",
            "Python", "JavaScript", "Ruby", "Java", "Pascal"));
    public static void main(String[] args) {
        System.out.println(programmingLanguages);
        programmingLanguages.remove("Ruby");
        for(String progLanguage: programmingLanguages){
            System.out.println(progLanguage);
        }

    }
}
