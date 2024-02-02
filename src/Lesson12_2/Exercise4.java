package Lesson12_2;

public class Exercise4 {
    public static Integer balance=Integer.MAX_VALUE;
    public static void main(String[] args) {
        String bill = "1234567890";
        System.out.println("Поточний баланс_1 : " + balance);
        processPayment(bill);
        System.out.println("Поточний баланс_2 : " + balance);
    }
    public static void processPayment(String bill) {
        balance=balance-Integer.parseInt(bill);
    }

}
