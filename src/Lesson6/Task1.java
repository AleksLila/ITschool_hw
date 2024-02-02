package Lesson6;

public class Task1 {
    public static int[][] MULTIPLICATION_TABLE;
    public static void main(String[] args) {
        MULTIPLICATION_TABLE= new int[][]{  {1, 2, 3, 4,  5,  6,  7,  8,  9,  10},
                {2, 4, 6, 8,  10, 12, 14, 16, 18, 20},
                {3, 6, 9, 12, 15, 18, 21, 24, 27, 30},
                {4, 8, 12,16, 20, 24, 28, 32, 36, 40}};
        for(int i=0; i<MULTIPLICATION_TABLE.length; i++){
            for(int j=0; j<MULTIPLICATION_TABLE[i].length; j++){

                System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
