package Lesson12;

public class Exercise17 {
    private int[] intArray = new int[4];
    public int[] getIntArray() {
        return intArray;
    }
    public void setIntArray(int[] intArray) {
        this.intArray = intArray;
    }

    public static void main(String[] args) {
        var solution = new Exercise17();
        var string = new String("Hello");
        var stringBuilder = new StringBuilder();
        solution.setIntArray(new int[]{1, 8, 3, -5});
        int[] array=solution.getIntArray();
        System.out.println("intArray[]: ");
        for(int arr:array){
            System.out.print(arr+" ");
        }

    }
}
