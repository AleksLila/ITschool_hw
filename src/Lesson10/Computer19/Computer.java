package Lesson10.Computer19;

public class Computer {
    public static void main(String[] args) {
        Computer comp=new Computer();
    }

    public Computer(){
        SystemUnit sysUnit=new SystemUnit("110M");
        KeyBoard reyBoard=new KeyBoard("Game-key");
        Mouse mouse=new Mouse();
        Monitor monitor=new Monitor();
    }
}
