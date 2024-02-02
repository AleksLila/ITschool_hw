package Lesson6;

import java.util.Scanner;

public class Task_3 {
    public static int[][] multiArray;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input N = ");
        int N=scanner.nextInt();
        multiArray=new int[N][];

        for(int i=0; i<multiArray.length; i++){
            System.out.print("Input "+ i+" number: ");
            int a=scanner.nextInt();
            multiArray[i]=new int[a];
        }
        for(int i=0; i< multiArray.length; i++){
            for(int j=0; j< multiArray[i].length; j++){
                multiArray[i][j]=(i+1)*(j+1);
                System.out.print(multiArray[i][j]+ " ");
            }
            System.out.println();
        }
    }

    }


