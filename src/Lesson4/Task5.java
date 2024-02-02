package Lesson4;

public class Task5 {
    public static void main(String[] args) {

        int i=1;
        int j=1;
        String str1 = "";
        while(j<=10) {
            while (i <= 20) {
                if(j==1 || j==10) {
                    String str = "B";
                    str1 = str1 + str;
                }
                else {
                    str1="B"+"                  "+"B";
                }
                i++;
            }
            System.out.println(str1);
            i=1;
            str1="";
            j++;
        }


    }
}
