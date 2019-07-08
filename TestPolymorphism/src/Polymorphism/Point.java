package Polymorphism;

public class Point extends Shape {
    protected  int x , y;
    public Point(int xx, int yy){
        x = xx;
        y= yy;
    }

    public void draw(){
        System.out.println("(" + x + "," + y + ")");
    }
}
