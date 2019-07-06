package Exercise2;

public class Circle extends Shape {

    final private double pi = 3.14;

    private double radius = 1.0;

    Circle(){

    }

    Circle(double radius){
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filles){
        super(color,filles);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){

        return radius*radius*pi;
    }

    public double getPerimeter(){
        return 2*pi*radius;
    }

    @Override
    public String toString() {
        return super.toString() +", Dien tich: " + getArea()
        +", Chu vi: "+getPerimeter();
    }
}
