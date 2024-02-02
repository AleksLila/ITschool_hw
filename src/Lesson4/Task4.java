package Lesson4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
       // Scanner letter=new Scanner(System.in);
        int i=1;
        int j=1;
        String str1 = "";
        while(j<=5) {
            while (i <= 10) {
                String str = "Q";
                str1 = str1 + str;
                i++;
            }
            System.out.println(str1);
            i=1;
            str1="";
            j++;
        }


    }
}