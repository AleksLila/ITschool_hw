package Lesson12_2;

import java.util.ArrayList;

public class Exercise9 {
    public static ArrayList<String> waitingEmployees=new ArrayList<>();
    public static ArrayList<String> alreadyGotSalary=new ArrayList<>();
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
        System.out.println("List waitingEmployees: "+waitingEmployees);
        for(String person: waitingEmployees){
            System.out.println(person);
        }
        paySalary(waitingEmployees.get(3));
        System.out.println("List alreadyGotSalary: "+ alreadyGotSalary);
        System.out.println("List waitingEmployees: "+waitingEmployees);


    }
    public static void paySalary(String name) {
        for (int i = 0; i <waitingEmployees.size() ; i++) {


            if (name.equals(waitingEmployees.get(i))) {
                alreadyGotSalary.add(name);
                waitingEmployees.set(i, null);
            }

        }

    }

}
