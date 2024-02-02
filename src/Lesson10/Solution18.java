package Lesson10;

public class Solution18 {
    public static void main(String[] args) {
        Coordinate coordinate = new Coordinate();
        coordinate.setX(15);
        coordinate.setY(25);
        System.out.println(coordinate.getX());
        System.out.println(coordinate.getY());
    }
}
class Coordinate{
    private int x;
    private int y;
    public void setX(int x){
        this.x=x;

    }
    public void setY(int y){
        this.y=y;

    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}