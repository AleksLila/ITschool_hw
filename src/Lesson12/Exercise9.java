package Lesson12;

import java.util.ArrayList;

public class Exercise9 {
    public static ArrayList<String> waitingEmployees=new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees=new ArrayList<>();
    public static void initEmployees() {
        waitingEmployees.add("Гвінно");
        waitingEmployees.add("Гунігерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Ніфрод");
        waitingEmployees.add("Альбіуф");
        waitingEmployees.add("Іногрім");
        waitingEmployees.add("Фріле");
    }
    public static void main(String[] args) {
        initEmployees();
        paySalary("Ніфрод");
        System.out.println("The list waiting salary: "+waitingEmployees);
        System.out.println("------------------");
        System.out.println("The list got salary: "+alreadyGotSalaryEmployees);
    }

    public static void paySalary(String name) {
        for(int i=0; i<waitingEmployees.size(); i++){
            if(waitingEmployees.get(i).equals(name)){
                alreadyGotSalaryEmployees.add(name);
                waitingEmployees.set(i, null);
            }
        }
    }

}
