package Lesson8;

public class Exercise3 {
    public static void main(String[] args) {
        Solution ex3=new Solution();
        ex3.setPosition("Python developer");
        ex3.setSalary(11_500);
    }

}
class Solution {
    public String name = "Amigo";
    public String position = "";
    public int salary = 10_000;

    public void setPosition(String position) {
        System.out.println(this.position = position);
    }
    public void setSalary(int salary) {
        System.out.println(this.salary=salary);
    }

}
