public class Circle implements GeometricObject {
    @Override
    public double getArea() {
        return PI*getRadius()*getRadius();
    }

    @Override
    public double getPerimeter() {
        return 2*PI*getRadius();
    }

    @Override
    public String getInfo() {
        return String.format("Circle[(%.2f,%.2f),r=%.2f]",center.getX(),center.getY(),getRadius());
    }

    private final double PI = 3.14;
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
}
