package Lesson12;

public class Exercise4 {
    public static Integer balance=Integer.MAX_VALUE;

    public static void main(String[] args) {
        String bill = "1234567890";
        System.out.println("Поточний баланс : " + balance);
        processPayment(bill);
        System.out.println("Поточний баланс : " + balance);


    }
    public static void processPayment(String bill) {
        Integer bill1= Integer.parseInt(bill);
         balance= balance - bill1;
    }

}
