package Lesson10;

public class Market14 {
    private static boolean hasEggs = true;


    public static void main(String[] args) {
       boolean hasEggs = true;
        makePurchases(hasEggs);
    }
    public static void makePurchases(boolean hasEggs) {
        if (hasEggs) {
            System.out.println("Куплено 10 батонів");
        } else {
            System.out.println("Куплено 1 батон");
        }
    }

}
