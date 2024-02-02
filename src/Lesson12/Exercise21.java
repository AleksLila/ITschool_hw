package Lesson12;

import java.util.ArrayList;

public class Exercise21 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Акакій"));
        students.add(new Student("Любослав"));
        printStudentNames(students);
    }
    public static void printStudentNames(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName());
        }
    }

}
class Student{
    String name;
    public Student(String name){
        this.name=name;

    }


    public String getName() {
        return name;
    }

}
