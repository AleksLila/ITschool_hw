package Lesson10;

public class Programmer8 {
    private int salary = 1000;

    public static void main(String[] args) {
        Programmer8 prog=new Programmer8();
        prog.setSalary(100);
        System.out.println("I have salary "+prog.getSalary()+" USD");
    }

    public void setSalary(int salary){
        if (this.salary< salary){
            this.salary=salary;
        }

    }
    public int getSalary(){
        return salary;
    }
}
