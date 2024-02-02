package Lesson9;

public class Exercise8 {
    public static byte a;
    public static short b;
    public static int c;
    public static long d;

    public static void main(String[] args) {
        setValues(100);
    }
    public static void setValues(long value){
        a=(byte)value;
        b=(short)value;
        c=(int)value;
        d=value;
        System.out.println(a+"\n"+b+"\n"+c+"\n"+d);
    }

}
